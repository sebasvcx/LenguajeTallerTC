import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "x = 5; imprimir(x);";

        MiLenguajeLexer lexer = new MiLenguajeLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeParser parser = new MiLenguajeParser(tokens);

        ParseTree tree = parser.program();

        Evaluador eval = new Evaluador();
        eval.visit(tree);
    }
}