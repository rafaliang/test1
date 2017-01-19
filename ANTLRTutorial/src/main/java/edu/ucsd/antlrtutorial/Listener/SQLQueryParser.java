// Generated from edu/ucsd/antlrtutorial/Listener/SQLQuery.g4 by ANTLR 4.3
package edu.ucsd.antlrtutorial.Listener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, SELECT=3, FROM=4, WHERE=5, NAME=6, INTEGER=7, STRING=8, 
		WHITESPACE=9;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'='", "SELECT", "FROM", "WHERE", "NAME", "INTEGER", 
		"STRING", "WHITESPACE"
	};
	public static final int
		RULE_query = 0, RULE_sfwClause = 1, RULE_selectClasue = 2, RULE_selectStatement = 3, 
		RULE_fromClause = 4, RULE_whereClause = 5, RULE_whereStatement = 6, RULE_condition = 7, 
		RULE_variable = 8;
	public static final String[] ruleNames = {
		"query", "sfwClause", "selectClasue", "selectStatement", "fromClause", 
		"whereClause", "whereStatement", "condition", "variable"
	};

	@Override
	public String getGrammarFileName() { return "SQLQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLQueryParser.EOF, 0); }
		public SfwClauseContext sfwClause() {
			return getRuleContext(SfwClauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); sfwClause();
			setState(19); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SfwClauseContext extends ParserRuleContext {
		public SelectClasueContext selectClasue() {
			return getRuleContext(SelectClasueContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public SfwClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sfwClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSfwClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSfwClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSfwClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SfwClauseContext sfwClause() throws RecognitionException {
		SfwClauseContext _localctx = new SfwClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sfwClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); selectClasue();
			setState(22); fromClause();
			setState(24);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(23); whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClasueContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public SelectClasueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClasue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSelectClasue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSelectClasue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSelectClasue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClasueContext selectClasue() throws RecognitionException {
		SelectClasueContext _localctx = new SelectClasueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectClasue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); selectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLQueryParser.SELECT, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(SELECT);
			setState(29); variable();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(30); match(T__1);
				setState(31); variable();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SQLQueryParser.NAME, 0); }
		public TerminalNode FROM() { return getToken(SQLQueryParser.FROM, 0); }
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(FROM);
			setState(38); match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); whereStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereStatementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLQueryParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterWhereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitWhereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitWhereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(WHERE);
			setState(43); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarEqualityContext extends ConditionContext {
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarEqualityContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterVarEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitVarEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitVarEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstatntEqaulityContext extends ConditionContext {
		public TerminalNode STRING() { return getToken(SQLQueryParser.STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstatntEqaulityContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterConstatntEqaulity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitConstatntEqaulity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitConstatntEqaulity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VarEqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45); variable();
				setState(46); match(T__0);
				setState(47); variable();
				}
				break;

			case 2:
				_localctx = new ConstatntEqaulityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49); variable();
				setState(50); match(T__0);
				setState(51); match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SQLQueryParser.NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLQueryListener ) ((SQLQueryListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLQueryVisitor ) return ((SQLQueryVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5#\n\5\f\5\16\5&\13"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"8\n\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\65\2\24\3\2\2\2\4\27"+
		"\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n\'\3\2\2\2\f*\3\2\2\2\16,\3\2\2\2"+
		"\20\67\3\2\2\2\229\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27"+
		"\30\5\6\4\2\30\32\5\n\6\2\31\33\5\f\7\2\32\31\3\2\2\2\32\33\3\2\2\2\33"+
		"\5\3\2\2\2\34\35\5\b\5\2\35\7\3\2\2\2\36\37\7\5\2\2\37$\5\22\n\2 !\7\3"+
		"\2\2!#\5\22\n\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\t\3\2\2\2&"+
		"$\3\2\2\2\'(\7\6\2\2()\7\b\2\2)\13\3\2\2\2*+\5\16\b\2+\r\3\2\2\2,-\7\7"+
		"\2\2-.\5\20\t\2.\17\3\2\2\2/\60\5\22\n\2\60\61\7\4\2\2\61\62\5\22\n\2"+
		"\628\3\2\2\2\63\64\5\22\n\2\64\65\7\4\2\2\65\66\7\n\2\2\668\3\2\2\2\67"+
		"/\3\2\2\2\67\63\3\2\2\28\21\3\2\2\29:\7\b\2\2:\23\3\2\2\2\5\32$\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}