package edu.ucsd.antlrtutorial.Listener;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.ConstatntEqaulityContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.FromClauseContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.QueryContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.SelectClasueContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.SelectStatementContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.SfwClauseContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.VarEqualityContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.VariableContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.WhereClauseContext;
import edu.ucsd.antlrtutorial.Listener.SQLQueryParser.WhereStatementContext;

/**
 * SQL Query Antlr Query Builder
 * 
 * @author ranaalotaibi
 *
 */
public class SQLQueryBuilder extends SQLQueryBaseListener {

	private ParseTreeProperty<Object> QueryObjects = new ParseTreeProperty<Object>();

	private Object retrieveObject(ParseTree obj) {

		return QueryObjects.get(obj);
	}

	private void setObject(ParseTree subtree, Object obj) {
		QueryObjects.put(subtree, obj);
	}

	public SQLQuery getQuery(ParseTree tree) {
		return (SQLQuery) retrieveObject(tree);
	}

	@Override
	public void exitQuery(@NotNull QueryContext ctx) {
		setObject(ctx, retrieveObject(ctx.getChild(0)));
	}

	@Override
	public void exitSfwClause(@NotNull SfwClauseContext ctx) {

		fromClause from = (fromClause) retrieveObject(ctx.fromClause());
		SelectClause select = (SelectClause) retrieveObject(ctx.selectClasue());
		WhereClause where = (WhereClause) retrieveObject(ctx.whereClause());
		SfwClause selectFromWhere = new SfwClause(from, select, where);
		setObject(ctx, selectFromWhere);
	}

	@Override
	public void exitSelectClasue(@NotNull SelectClasueContext ctx) {
		setObject(ctx, retrieveObject(ctx.getChild(0)));
	}

	@Override
	public void exitSelectStatement(@NotNull SelectStatementContext ctx) {
		List<Variable> listOfVars = new ArrayList<Variable>();
		for (VariableContext varaibleContext : ctx.variable()) {
			listOfVars.add((Variable) retrieveObject(varaibleContext));
		}
		SelectClause selectStateClause = new SelectClause(listOfVars);
		setObject(ctx, selectStateClause);
	}

	@Override
	public void exitFromClause(@NotNull FromClauseContext ctx) {
		String realtion = (ctx.NAME().getText());

		setObject(ctx, new fromClause(realtion));
	}

	@Override
	public void exitVariable(@NotNull VariableContext ctx) {

		setObject(ctx, new Variable(ctx.NAME().getText()));
	}

	@Override
	public void exitWhereClause(@NotNull WhereClauseContext ctx) {
		setObject(ctx, retrieveObject(ctx.getChild(0)));
	}

	@Override
	public void exitWhereStatement(@NotNull WhereStatementContext ctx) {
		Condition condition = (Condition) retrieveObject(ctx.condition());
		setObject(ctx, new WhereClause(condition));
	}

	@Override
	public void exitConstatntEqaulity(@NotNull ConstatntEqaulityContext ctx) {
		Variable var = (Variable) retrieveObject(ctx.variable());
		String operator = "=";
		String number = ctx.STRING().getText();
		setObject(ctx, new Condition(var, operator, number));
	}

	@Override
	public void exitVarEquality(@NotNull VarEqualityContext ctx) {

		Variable var1 = (Variable) retrieveObject(ctx.variable().get(0));
		String operator = "=";
		Variable var2 = (Variable) retrieveObject(ctx.variable().get(1));
		setObject(ctx, new Condition(var1, operator, var2));
	}

}
