import java.nio.file.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input;

        if (args.length > 0) {
            // Leer desde archivo
            input = CharStreams.fromPath(Path.of(args[0]));
        } else {
            // Leer desde STDIN
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                String line;
                while ((line = br.readLine()) != null) sb.append(line).append('\n');
            }
            input = CharStreams.fromString(sb.toString());
        }

        MiLenguajeLexer lexer = new MiLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiLenguajeParser parser = new MiLenguajeParser(tokens);

        ParseTree tree = parser.program();

        Evaluador eval = new Evaluador();
        eval.visit(tree);
    }
}
