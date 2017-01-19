// Generated from edu/ucsd/antlrtutorial/Listener/SQLQuery.g4 by ANTLR 4.3
package edu.ucsd.antlrtutorial.Listener;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLQueryParser}.
 */
public interface SQLQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull SQLQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull SQLQueryParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VarEquality}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterVarEquality(@NotNull SQLQueryParser.VarEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarEquality}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitVarEquality(@NotNull SQLQueryParser.VarEqualityContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull SQLQueryParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull SQLQueryParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ConstatntEqaulity}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConstatntEqaulity(@NotNull SQLQueryParser.ConstatntEqaulityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstatntEqaulity}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConstatntEqaulity(@NotNull SQLQueryParser.ConstatntEqaulityContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SQLQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SQLQueryParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull SQLQueryParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull SQLQueryParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#selectClasue}.
	 * @param ctx the parse tree
	 */
	void enterSelectClasue(@NotNull SQLQueryParser.SelectClasueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#selectClasue}.
	 * @param ctx the parse tree
	 */
	void exitSelectClasue(@NotNull SQLQueryParser.SelectClasueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#sfwClause}.
	 * @param ctx the parse tree
	 */
	void enterSfwClause(@NotNull SQLQueryParser.SfwClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#sfwClause}.
	 * @param ctx the parse tree
	 */
	void exitSfwClause(@NotNull SQLQueryParser.SfwClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(@NotNull SQLQueryParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(@NotNull SQLQueryParser.SelectStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhereStatement(@NotNull SQLQueryParser.WhereStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhereStatement(@NotNull SQLQueryParser.WhereStatementContext ctx);
}