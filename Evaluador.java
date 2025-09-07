import java.util.HashMap;
import java.util.Map;

public class Evaluador extends MiLenguajeBaseVisitor<Object> {
    private Map<String, Object> memoria = new HashMap<>();

    // Maneja la asignación de un valor a una variable.
    @Override
    public Object visitAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        String var = ctx.IDENT().getText();
        Object valor = visit(ctx.expr());
        memoria.put(var, valor);
        return null;
    }

    // Maneja la sentencia 'imprimir'.
    @Override
    public Object visitImprimir(MiLenguajeParser.ImprimirContext ctx) {
        Object valor = visit(ctx.expr());
        System.out.println(valor);
        return null;
    }

    // Convierte un token de literal (número, cadena, booleano) a su valor en Java.
    @Override
    public Object visitLiteral(MiLenguajeParser.LiteralContext ctx) {
        if (ctx.ENTERO() != null) return Integer.parseInt(ctx.ENTERO().getText());
        if (ctx.DECIMAL() != null) return Double.parseDouble(ctx.DECIMAL().getText());
        if (ctx.CADENA() != null) {
            String txt = ctx.CADENA().getText();
            return txt.substring(1, txt.length() - 1);
        }
        if (ctx.VERDADERO() != null) return true;
        if (ctx.FALSO() != null) return false;
        return null;
    }

    // Obtiene el valor de una variable o visita una sub-expresión.
    @Override
    public Object visitPrim(MiLenguajeParser.PrimContext ctx) {
        if (ctx.IDENT() != null) {
            String var = ctx.IDENT().getText();
            if (!memoria.containsKey(var)) {
                throw new RuntimeException("Variable no definida: " + var);
            }
            return memoria.get(var);
        }
        return visitChildren(ctx);
    }
    
    // Maneja las operaciones de suma y resta.
    @Override
    public Object visitAddExpr(MiLenguajeParser.AddExprContext ctx) {
        Object izquierdo = visit(ctx.expr(0));
        Object derecho = visit(ctx.expr(1));

        Double numIzq = Double.parseDouble(izquierdo.toString());
        Double numDer = Double.parseDouble(derecho.toString());

        if (ctx.op.getType() == MiLenguajeParser.MAS) {
            return numIzq + numDer;
        }
        return numIzq - numDer;
    }
    
    // Maneja las operaciones de multiplicación, división y módulo.
    @Override
    public Object visitMulExpr(MiLenguajeParser.MulExprContext ctx) {
        Object izquierdo = visit(ctx.expr(0));
        Object derecho = visit(ctx.expr(1));

        Double numIzq = Double.parseDouble(izquierdo.toString());
        Double numDer = Double.parseDouble(derecho.toString());

        if (ctx.op.getType() == MiLenguajeParser.POR) return numIzq * numDer;
        if (ctx.op.getType() == MiLenguajeParser.DIV) return numIzq / numDer;
        return numIzq % numDer;
    }

    // Maneja la operación de potencia.
    @Override
    public Object visitPowExpr(MiLenguajeParser.PowExprContext ctx) {
        Object base = visit(ctx.expr(0));
        Object exponente = visit(ctx.expr(1));

        Double numBase = Double.parseDouble(base.toString());
        Double numExp = Double.parseDouble(exponente.toString());

        return Math.pow(numBase, numExp);
    }

    // Maneja las operaciones de comparación relacional (>, <, >=, <=).
    @Override
    public Object visitRelExpr(MiLenguajeParser.RelExprContext ctx) {
        Object izquierdo = visit(ctx.expr(0));
        Object derecho = visit(ctx.expr(1));
        
        Double numIzq = Double.parseDouble(izquierdo.toString());
        Double numDer = Double.parseDouble(derecho.toString());
        
        switch (ctx.op.getType()) {
            case MiLenguajeParser.MAYOR: return numIzq > numDer;
            case MiLenguajeParser.MENOR: return numIzq < numDer;
            case MiLenguajeParser.MAYORIG: return numIzq >= numDer;
            case MiLenguajeParser.MENORIG: return numIzq <= numDer;
        }
        return false;
    }
    
    // Maneja las operaciones de igualdad y desigualdad (==, !=).
    @Override
    public Object visitEqExpr(MiLenguajeParser.EqExprContext ctx) {
        Object izquierdo = visit(ctx.expr(0));
        Object derecho = visit(ctx.expr(1));
        
        if (ctx.op.getType() == MiLenguajeParser.IGUAL) {
            return izquierdo.equals(derecho);
        }
        return !izquierdo.equals(derecho);
    }

    // Maneja la lógica de la sentencia 'si/sino'.
    @Override
    public Object visitSiStmt(MiLenguajeParser.SiStmtContext ctx) {
        boolean condicion = (boolean) visit(ctx.expr());
        if (condicion) {
            visit(ctx.bloque(0));
        } else if (ctx.SINO() != null) {
            visit(ctx.bloque(1));
        }
        return null;
    }

    // Maneja la lógica del bucle 'mientras'.
    @Override
    public Object visitMientrasStmt(MiLenguajeParser.MientrasStmtContext ctx) {
        while ((boolean) visit(ctx.expr())) {
            visit(ctx.bloque());
        }
        return null;
    }

    // Maneja la lógica del bucle 'para'.
    @Override
    public Object visitParaStmt(MiLenguajeParser.ParaStmtContext ctx) {
        visit(ctx.asignacion(0));
        
        while ((boolean) visit(ctx.expr())) {
            visit(ctx.bloque());
            visit(ctx.asignacion(1));
        }
        return null;
    }
}  }
}
