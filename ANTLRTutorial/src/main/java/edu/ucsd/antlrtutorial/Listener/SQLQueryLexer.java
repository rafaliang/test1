// Generated from edu/ucsd/antlrtutorial/Listener/SQLQuery.g4 by ANTLR 4.3
package edu.ucsd.antlrtutorial.Listener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, SELECT=3, FROM=4, WHERE=5, NAME=6, INTEGER=7, STRING=8, 
		WHITESPACE=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "SELECT", "FROM", "WHERE", "NAME", "INTEGER", "STRING", 
		"ESCAPE", "UNICODE", "HEX", "WHITESPACE", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z"
	};


	public SQLQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\5\bu"+
		"\n\b\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\t\7\t\u0083\n\t"+
		"\f\t\16\t\u0086\13\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\5\n\u008e\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\6\r\u0099\n\r\r\r\16\r\u009a\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\2\25\2\27\2\31\13\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65"+
		"\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2\3\2%\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\3\2\63;\3\2\62;\4\2$$^^\4\2))^^\13\2$$))\61\61^^ddhhppttvv\5\2\62;"+
		"CHch\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HH"+
		"hh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2"+
		"\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tZ\3\2\2\2\13_\3\2\2\2\re\3\2\2\2"+
		"\17t\3\2\2\2\21\u0088\3\2\2\2\23\u008a\3\2\2\2\25\u008f\3\2\2\2\27\u0095"+
		"\3\2\2\2\31\u0098\3\2\2\2\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2\3"+
		"\2\2\2!\u00a4\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac"+
		"\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2"+
		"\63\u00b6\3\2\2\2\65\u00b8\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00be"+
		"\3\2\2\2=\u00c0\3\2\2\2?\u00c2\3\2\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E"+
		"\u00c8\3\2\2\2G\u00ca\3\2\2\2I\u00cc\3\2\2\2K\u00ce\3\2\2\2M\u00d0\3\2"+
		"\2\2OP\7.\2\2P\4\3\2\2\2QR\7?\2\2R\6\3\2\2\2ST\5? \2TU\5#\22\2UV\5\61"+
		"\31\2VW\5#\22\2WX\5\37\20\2XY\5A!\2Y\b\3\2\2\2Z[\5%\23\2[\\\5=\37\2\\"+
		"]\5\67\34\2]^\5\63\32\2^\n\3\2\2\2_`\5G$\2`a\5)\25\2ab\5#\22\2bc\5=\37"+
		"\2cd\5#\22\2d\f\3\2\2\2ei\t\2\2\2fh\t\3\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2j\16\3\2\2\2ki\3\2\2\2lu\7\62\2\2mq\t\4\2\2np\t\5\2\2on"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2t"+
		"m\3\2\2\2u\20\3\2\2\2v{\7$\2\2wz\5\23\n\2xz\n\6\2\2yw\3\2\2\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0089\7$\2\2\177"+
		"\u0084\7)\2\2\u0080\u0083\5\23\n\2\u0081\u0083\n\7\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7)"+
		"\2\2\u0088v\3\2\2\2\u0088\177\3\2\2\2\u0089\22\3\2\2\2\u008a\u008d\7^"+
		"\2\2\u008b\u008e\t\b\2\2\u008c\u008e\5\25\13\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\24\3\2\2\2\u008f\u0090\7w\2\2\u0090\u0091\5\27\f"+
		"\2\u0091\u0092\5\27\f\2\u0092\u0093\5\27\f\2\u0093\u0094\5\27\f\2\u0094"+
		"\26\3\2\2\2\u0095\u0096\t\t\2\2\u0096\30\3\2\2\2\u0097\u0099\t\n\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\r\2\2\u009d\32\3\2\2\2\u009e\u009f"+
		"\t\13\2\2\u009f\34\3\2\2\2\u00a0\u00a1\t\f\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\t\r\2\2\u00a3 \3\2\2\2\u00a4\u00a5\t\16\2\2\u00a5\"\3\2\2\2\u00a6"+
		"\u00a7\t\17\2\2\u00a7$\3\2\2\2\u00a8\u00a9\t\20\2\2\u00a9&\3\2\2\2\u00aa"+
		"\u00ab\t\21\2\2\u00ab(\3\2\2\2\u00ac\u00ad\t\22\2\2\u00ad*\3\2\2\2\u00ae"+
		"\u00af\t\23\2\2\u00af,\3\2\2\2\u00b0\u00b1\t\24\2\2\u00b1.\3\2\2\2\u00b2"+
		"\u00b3\t\25\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\t\26\2\2\u00b5\62\3\2\2\2"+
		"\u00b6\u00b7\t\27\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\t\30\2\2\u00b9\66\3"+
		"\2\2\2\u00ba\u00bb\t\31\2\2\u00bb8\3\2\2\2\u00bc\u00bd\t\32\2\2\u00bd"+
		":\3\2\2\2\u00be\u00bf\t\33\2\2\u00bf<\3\2\2\2\u00c0\u00c1\t\34\2\2\u00c1"+
		">\3\2\2\2\u00c2\u00c3\t\35\2\2\u00c3@\3\2\2\2\u00c4\u00c5\t\36\2\2\u00c5"+
		"B\3\2\2\2\u00c6\u00c7\t\37\2\2\u00c7D\3\2\2\2\u00c8\u00c9\t \2\2\u00c9"+
		"F\3\2\2\2\u00ca\u00cb\t!\2\2\u00cbH\3\2\2\2\u00cc\u00cd\t\"\2\2\u00cd"+
		"J\3\2\2\2\u00ce\u00cf\t#\2\2\u00cfL\3\2\2\2\u00d0\u00d1\t$\2\2\u00d1N"+
		"\3\2\2\2\r\2iqty{\u0082\u0084\u0088\u008d\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}