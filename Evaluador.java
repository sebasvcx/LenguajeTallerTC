import java.util.HashMap;
import java.util.Map;

public class Evaluador extends MiLenguajeBaseVisitor<Object> {
    private final Map<String, Object> memoria = new HashMap<>();

    /* ===================== Helpers de tipos ===================== */

    private boolean esNumero(Object o) {
        return o instanceof Integer || o instanceof Double || o instanceof Long || o instanceof Float;
    }

    private double aDouble(Object o) {
        if (o instanceof Integer) return ((Integer) o).doubleValue();
        if (o instanceof Long) return ((Long) o).doubleValue();
        if (o instanceof Float) return ((Float) o).doubleValue();
        if (o instanceof Double) return (Double) o;
        try { return Double.parseDouble(String.valueOf(o)); }
        catch (Exception e) { throw new RuntimeException("Esperaba número, obtuve: " + o); }
    }

    private boolean aBoolean(Object o) {
        if (o instanceof Boolean) return (Boolean) o;
        // Si no quieres verdad numérica, elimina las 2 líneas siguientes:
        if (esNumero(o)) return aDouble(o) != 0.0;
        throw new RuntimeException("Esperaba booleano, obtuve: " + o);
    }

    /* ===================== Asignación / Variables / Print ===================== */

    @Override
    public Object visitAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        String var = ctx.IDENT().getText();
        Object valor = visit(ctx.expr());
        memoria.put(var, valor);
        return null;
    }

    @Override
    public Object visitImprimir(MiLenguajeParser.ImprimirContext ctx) {
        Object valor = visit(ctx.expr());
        System.out.println(valor);
        return null;
    }

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

    @Override
    public Object visitLiteral(MiLenguajeParser.LiteralContext ctx) {
        if (ctx.ENTERO() != null)   return Integer.parseInt(ctx.ENTERO().getText());
        if (ctx.DECIMAL() != null)  return Double.parseDouble(ctx.DECIMAL().getText());
        if (ctx.CADENA() != null) {
            String txt = ctx.CADENA().getText();
            return txt.substring(1, txt.length() - 1);
        }
        if (ctx.VERDADERO() != null) return true;
        if (ctx.FALSO() != null)     return false;
        return null;
    }

    /* ===================== Aritmética ===================== */

    @Override
    public Object visitAddExpr(MiLenguajeParser.AddExprContext ctx) {
        Object izq = visit(ctx.expr(0));
        Object der = visit(ctx.expr(1));

        // Concatenación si alguno es cadena (solo para '+')
        if (ctx.op.getType() == MiLenguajeParser.MAS &&
            (izq instanceof String || der instanceof String)) {
            String s1 = (izq == null ? "null" : String.valueOf(izq));
            String s2 = (der == null ? "null" : String.valueOf(der));
            return s1 + s2;
        }

        double a = aDouble(izq), b = aDouble(der);
        return (ctx.op.getType() == MiLenguajeParser.MAS) ? (a + b) : (a - b);
    }

    @Override
    public Object visitMulExpr(MiLenguajeParser.MulExprContext ctx) {
        double a = aDouble(visit(ctx.expr(0)));
        double b = aDouble(visit(ctx.expr(1)));

        if (ctx.op.getType() == MiLenguajeParser.POR) return a * b;
        if (ctx.op.getType() == MiLenguajeParser.DIV) {
            if (b == 0.0) throw new RuntimeException("División por cero");
            return a / b;
        }
        // Módulo
        if (b == 0.0) throw new RuntimeException("Módulo por cero");
        return a % b;
    }

    @Override
    public Object visitPowExpr(MiLenguajeParser.PowExprContext ctx) {
        double base = aDouble(visit(ctx.expr(0)));
        double exp  = aDouble(visit(ctx.expr(1)));
        return Math.pow(base, exp);
    }

    // Unario (si tu gramática lo define como regla aparte)
    @Override
    public Object visitUnaryMinusExpr(MiLenguajeParser.UnaryMinusExprContext ctx) {
        return -aDouble(visit(ctx.expr()));
    }

    /* ===================== Relacional / Igualdad ===================== */

    @Override
    public Object visitRelExpr(MiLenguajeParser.RelExprContext ctx) {
        double a = aDouble(visit(ctx.expr(0)));
        double b = aDouble(visit(ctx.expr(1)));
        switch (ctx.op.getType()) {
            case MiLenguajeParser.MAYOR:   return a > b;
            case MiLenguajeParser.MENOR:   return a < b;
            case MiLenguajeParser.MAYORIG: return a >= b;
            case MiLenguajeParser.MENORIG: return a <= b;
        }
        return false;
    }

    @Override
    public Object visitEqExpr(MiLenguajeParser.EqExprContext ctx) {
        Object izq = visit(ctx.expr(0));
        Object der = visit(ctx.expr(1));
        boolean iguales;
        if (izq == null || der == null) {
            iguales = (izq == null && der == null);
        } else if (esNumero(izq) && esNumero(der)) {
            iguales = Double.compare(aDouble(izq), aDouble(der)) == 0;
        } else {
            iguales = izq.equals(der);
        }
        // Ajusta si tu token para '==' no es IGUAL
        if (ctx.op.getType() == MiLenguajeParser.IGUAL) return iguales;
        return !iguales; // '!='
    }

    /* ===================== Lógico (si la gramática lo define) ===================== */

    @Override
    public Object visitAndExpr(MiLenguajeParser.AndExprContext ctx) {
        boolean a = aBoolean(visit(ctx.expr(0)));
        if (!a) return false; // cortocircuito
        boolean b = aBoolean(visit(ctx.expr(1)));
        return a && b;
    }

    @Override
    public Object visitOrExpr(MiLenguajeParser.OrExprContext ctx) {
        boolean a = aBoolean(visit(ctx.expr(0)));
        if (a) return true; // cortocircuito
        boolean b = aBoolean(visit(ctx.expr(1)));
        return a || b;
    }

    @Override
    public Object visitNotExpr(MiLenguajeParser.NotExprContext ctx) {
        return !aBoolean(visit(ctx.expr()));
    }

    /* ===================== Paréntesis (si existe la regla) ===================== */

    @Override
    public Object visitParenExpr(MiLenguajeParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    /* ===================== Control de flujo ===================== */

    @Override
    public Object visitSiStmt(MiLenguajeParser.SiStmtContext ctx) {
        boolean cond = aBoolean(visit(ctx.expr()));
        if (cond) {
            visit(ctx.bloque(0));
        } else if (ctx.SINO() != null) {
            visit(ctx.bloque(1));
        }
        return null;
    }

    @Override
    public Object visitMientrasStmt(MiLenguajeParser.MientrasStmtContext ctx) {
        while (aBoolean(visit(ctx.expr()))) {
            visit(ctx.bloque());
        }
        return null;
    }

    @Override
    public Object visitParaStmt(MiLenguajeParser.ParaStmtContext ctx) {
        // Suponiendo: para ( asignacion ; expr ; asignacion ) { bloque }
        visit(ctx.asignacion(0)); // init
        while (aBoolean(visit(ctx.expr()))) { // cond
            visit(ctx.bloque());
            visit(ctx.asignacion(1)); // update
        }
        return null;
    }

    /* ===================== Bloques ===================== */
    // Si tu "bloque" es { stmt* }, visitChildren ya recorre todo; este override es opcional.
    @Override
    public Object visitBloque(MiLenguajeParser.BloqueContext ctx) {
        return visitChildren(ctx);
    }
}
