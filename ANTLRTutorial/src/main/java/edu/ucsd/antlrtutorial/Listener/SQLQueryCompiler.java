package edu.ucsd.antlrtutorial.Listener;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * A SQL Query Parser
 * 
 * @author ranaalotaibi
 * 
 */
public class SQLQueryCompiler {
	/**
	 * Parses and return SQLQuery as object
	 * 
	 * @param queryAsString
	 *            the query string.
	 * @return the query.
	 */
	public SQLQuery parse(String queryAsString) {
		SQLQuery query = null;
		try {
			ANTLRInputStream input = new ANTLRInputStream(queryAsString);
			SQLQueryLexer lexer = new SQLQueryLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			SQLQueryParser parser = new SQLQueryParser(tokens);
			parser.removeErrorListeners();
			ParseTree tree = parser.query();
			ParseTreeWalker walker = new ParseTreeWalker();
			SQLQueryBuilder builder = new SQLQueryBuilder();
			walker.walk(builder, tree);

			query = builder.getQuery(tree);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
		return query;
	}

}
