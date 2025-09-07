import java.util.HashMap;
import java.util.Map;

public class Evaluador extends MiLenguajeBaseVisitor<Object> {
    private Map<String, Object> memoria = new HashMap<>();

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
    public Object visitLiteral(MiLenguajeParser.LiteralContext ctx) {
        if (ctx.ENTERO() != null) return Integer.parseInt(ctx.ENTERO().getText());
        if (ctx.DECIMAL() != null) return Double.parseDouble(ctx.DECIMAL().getText());
        if (ctx.CADENA() != null) {
            String txt = ctx.CADENA().getText();
            return txt.substring(1, txt.length() - 1); // quitar comillas
        }
        if (ctx.VERDADERO() != null) return true;
        if (ctx.FALSO() != null) return false;
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
        return super.visitPrim(ctx);
    }
}