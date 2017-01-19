// Generated from edu/ucsd/antlrtutorial/Listener/SQLQuery.g4 by ANTLR 4.3
package edu.ucsd.antlrtutorial.Listener;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull SQLQueryParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VarEquality}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEquality(@NotNull SQLQueryParser.VarEqualityContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(@NotNull SQLQueryParser.FromClauseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ConstatntEqaulity}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstatntEqaulity(@NotNull SQLQueryParser.ConstatntEqaulityContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull SQLQueryParser.QueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull SQLQueryParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#selectClasue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClasue(@NotNull SQLQueryParser.SelectClasueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#sfwClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSfwClause(@NotNull SQLQueryParser.SfwClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(@NotNull SQLQueryParser.SelectStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#whereStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStatement(@NotNull SQLQueryParser.WhereStatementContext ctx);
}