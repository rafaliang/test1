package edu.ucsd.antlrtutorial.Visitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * CSE232B Antlr Tutorial Visitor
 *
 */
public class App {
	public static void main(String[] args) {

		try {
			ANTLRInputStream input = new ANTLRInputStream("3+4\n");
			LabeledExprLexer lexer = new LabeledExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			LabeledExprParser parser = new LabeledExprParser(tokens);
			parser.removeErrorListeners();
			ParseTree tree = parser.prog();
			EvalVisitor evalVisitor = new EvalVisitor();
			evalVisitor.visit(tree);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
	}
}
