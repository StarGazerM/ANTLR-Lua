// Generated from /home/stargazermiao/workspace/java/lua-antlr/lua.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class luaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, RESERVED=29, NIL=30, BOOL=31, 
		BINOP=32, UNOP=33, FIELDSEP=34, ID=35, ESACPE_CHAR=36, BYTE=37, NUMBERAL=38, 
		LITERAL_STRING=39, COMMENT=40, LINE_COMMENT=41, LETTER=42, DIGIT=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "RESERVED", "NIL", "BOOL", "BINOP", "UNOP", 
			"FIELDSEP", "WAVE", "MINUS", "ID", "ESACPE_CHAR", "ESCAPE_UNICODE", "BYTE", 
			"NUMBERAL", "INT", "HEX", "FLOAT", "EXP_NUM", "BIN_EXP_NUM", "LITERAL_STRING", 
			"COMMENT", "NESTED_STR", "LINE_COMMENT", "LETTER", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'break'", "'goto'", "'do'", "'end'", "'while'", 
			"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
			"','", "'function'", "'local'", "'return'", "'::'", "'.'", "':'", "'('", 
			"')'", "'['", "']'", "'...'", "'{'", "'}'", null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "RESERVED", "NIL", "BOOL", "BINOP", "UNOP", 
			"FIELDSEP", "ID", "ESACPE_CHAR", "BYTE", "NUMBERAL", "LITERAL_STRING", 
			"COMMENT", "LINE_COMMENT", "LETTER", "DIGIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public luaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u011d\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u012c\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u014b\n!\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0153\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\7&\u015e\n&\f&\16&\u0161\13&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u017a\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0190\n)\3*\3*\3*\3*\3*\5*\u0197\n*\3+\6"+
		"+\u019a\n+\r+\16+\u019b\3,\3,\3,\6,\u01a1\n,\r,\16,\u01a2\3-\3-\3-\3-"+
		"\3.\3.\3.\5.\u01ac\n.\3.\3.\3/\3/\3/\5/\u01b3\n/\3/\3/\3\60\3\60\3\60"+
		"\7\60\u01ba\n\60\f\60\16\60\u01bd\13\60\3\60\3\60\3\60\3\60\3\60\7\60"+
		"\u01c4\n\60\f\60\16\60\u01c7\13\60\3\60\5\60\u01ca\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01db"+
		"\n\62\3\62\5\62\u01de\n\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u01e6\n"+
		"\63\f\63\16\63\u01e9\13\63\3\63\3\63\7\63\u01ed\n\63\f\63\16\63\u01f0"+
		"\13\63\3\63\3\63\7\63\u01f4\n\63\f\63\16\63\u01f7\13\63\3\63\3\63\7\63"+
		"\u01fb\n\63\f\63\16\63\u01fe\13\63\5\63\u0200\n\63\3\63\3\63\3\63\5\63"+
		"\u0205\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u020e\n\66\r\66\16"+
		"\66\u020f\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K%M&O\2Q\'S(U\2W\2Y\2[\2]\2"+
		"_)a*c\2e+g,i-k.\3\2\21\4\2,,\61\61\4\2\'(``\4\2..==\4\2ZZzz\5\2\62;CH"+
		"ch\4\2GGgg\4\2--//\4\2RRrr\6\2\f\f\17\17??]]\4\2\f\f\17\17\5\2\f\f\17"+
		"\17]]\4\3\f\f\17\17\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0253\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tw\3\2\2\2"+
		"\13|\3\2\2\2\r\177\3\2\2\2\17\u0083\3\2\2\2\21\u0089\3\2\2\2\23\u0090"+
		"\3\2\2\2\25\u0096\3\2\2\2\27\u0099\3\2\2\2\31\u009e\3\2\2\2\33\u00a5\3"+
		"\2\2\2\35\u00aa\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b9\3\2\2\2"+
		"%\u00bf\3\2\2\2\'\u00c6\3\2\2\2)\u00c9\3\2\2\2+\u00cb\3\2\2\2-\u00cd\3"+
		"\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d5\3\2\2"+
		"\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u011c\3\2\2\2=\u011e\3\2\2\2?\u012b"+
		"\3\2\2\2A\u014a\3\2\2\2C\u0152\3\2\2\2E\u0154\3\2\2\2G\u0156\3\2\2\2I"+
		"\u0158\3\2\2\2K\u015a\3\2\2\2M\u0179\3\2\2\2O\u017b\3\2\2\2Q\u018f\3\2"+
		"\2\2S\u0196\3\2\2\2U\u0199\3\2\2\2W\u019d\3\2\2\2Y\u01a4\3\2\2\2[\u01a8"+
		"\3\2\2\2]\u01af\3\2\2\2_\u01c9\3\2\2\2a\u01cb\3\2\2\2c\u01dd\3\2\2\2e"+
		"\u01df\3\2\2\2g\u0208\3\2\2\2i\u020a\3\2\2\2k\u020d\3\2\2\2mn\7=\2\2n"+
		"\4\3\2\2\2op\7?\2\2p\6\3\2\2\2qr\7d\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7"+
		"m\2\2v\b\3\2\2\2wx\7i\2\2xy\7q\2\2yz\7v\2\2z{\7q\2\2{\n\3\2\2\2|}\7f\2"+
		"\2}~\7q\2\2~\f\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7f\2\2\u0082\16\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7r\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7v\2\2\u008f\22\3\2\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7n\2\2"+
		"\u0095\24\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\26\3\2\2"+
		"\2\u0099\u009a\7v\2\2\u009a\u009b\7j\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7p\2\2\u009d\30\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7h\2\2\u00a4"+
		"\32\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7.\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b1\7h\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7e\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7e\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be$\3\2\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7p\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7"+
		"\u00c8\7<\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca*\3\2\2\2\u00cb"+
		"\u00cc\7<\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce.\3\2\2\2\u00cf\u00d0"+
		"\7+\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7]\2\2\u00d2\62\3\2\2\2\u00d3\u00d4"+
		"\7_\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\7\60\2\2\u00d7"+
		"\u00d8\7\60\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7}\2\2\u00da8\3\2\2\2\u00db"+
		"\u00dc\7\177\2\2\u00dc:\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7t\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u011d\7m\2\2\u00e2\u00e3"+
		"\7i\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7v\2\2\u00e5\u011d\7q\2\2\u00e6"+
		"\u00e7\7f\2\2\u00e7\u011d\7q\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2"+
		"\u00ea\u011d\7f\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7n\2\2\u00ef\u011d\7g\2\2\u00f0\u00f1\7t\2\2\u00f1"+
		"\u00f2\7g\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7c\2\2"+
		"\u00f5\u011d\7v\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9"+
		"\7k\2\2\u00f9\u011d\7n\2\2\u00fa\u00fb\7k\2\2\u00fb\u011d\7h\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7g\2\2\u00ff\u011d\7p\2\2"+
		"\u0100\u0101\7g\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103\u011d"+
		"\7g\2\2\u0104\u0105\7h\2\2\u0105\u0106\7q\2\2\u0106\u011d\7t\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u011d\7p\2\2\u0109\u010a\7n\2\2\u010a\u010b\7q\2\2"+
		"\u010b\u010c\7e\2\2\u010c\u010d\7c\2\2\u010d\u011d\7n\2\2\u010e\u010f"+
		"\7h\2\2\u010f\u0110\7w\2\2\u0110\u0111\7p\2\2\u0111\u0112\7e\2\2\u0112"+
		"\u0113\7v\2\2\u0113\u0114\7k\2\2\u0114\u0115\7q\2\2\u0115\u011d\7p\2\2"+
		"\u0116\u0117\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7v\2\2\u0119\u011a"+
		"\7w\2\2\u011a\u011b\7t\2\2\u011b\u011d\7p\2\2\u011c\u00dd\3\2\2\2\u011c"+
		"\u00e2\3\2\2\2\u011c\u00e6\3\2\2\2\u011c\u00e8\3\2\2\2\u011c\u00eb\3\2"+
		"\2\2\u011c\u00f0\3\2\2\2\u011c\u00f6\3\2\2\2\u011c\u00fa\3\2\2\2\u011c"+
		"\u00fc\3\2\2\2\u011c\u0100\3\2\2\2\u011c\u0104\3\2\2\2\u011c\u0107\3\2"+
		"\2\2\u011c\u0109\3\2\2\2\u011c\u010e\3\2\2\2\u011c\u0116\3\2\2\2\u011d"+
		"<\3\2\2\2\u011e\u011f\7p\2\2\u011f\u0120\7k\2\2\u0120\u0121\7n\2\2\u0121"+
		">\3\2\2\2\u0122\u0123\7v\2\2\u0123\u0124\7t\2\2\u0124\u0125\7w\2\2\u0125"+
		"\u012c\7g\2\2\u0126\u0127\7h\2\2\u0127\u0128\7c\2\2\u0128\u0129\7n\2\2"+
		"\u0129\u012a\7u\2\2\u012a\u012c\7g\2\2\u012b\u0122\3\2\2\2\u012b\u0126"+
		"\3\2\2\2\u012c@\3\2\2\2\u012d\u014b\7-\2\2\u012e\u014b\5I%\2\u012f\u014b"+
		"\t\2\2\2\u0130\u0131\7\61\2\2\u0131\u014b\7\61\2\2\u0132\u014b\t\3\2\2"+
		"\u0133\u014b\5G$\2\u0134\u014b\7~\2\2\u0135\u0136\7@\2\2\u0136\u014b\7"+
		"@\2\2\u0137\u0138\7>\2\2\u0138\u014b\7>\2\2\u0139\u013a\7\60\2\2\u013a"+
		"\u014b\7\60\2\2\u013b\u014b\7>\2\2\u013c\u013d\7>\2\2\u013d\u014b\7?\2"+
		"\2\u013e\u014b\7@\2\2\u013f\u0140\7@\2\2\u0140\u014b\7?\2\2\u0141\u0142"+
		"\7?\2\2\u0142\u014b\7?\2\2\u0143\u0144\7\u0080\2\2\u0144\u014b\7?\2\2"+
		"\u0145\u0146\7c\2\2\u0146\u0147\7p\2\2\u0147\u014b\7f\2\2\u0148\u0149"+
		"\7q\2\2\u0149\u014b\7t\2\2\u014a\u012d\3\2\2\2\u014a\u012e\3\2\2\2\u014a"+
		"\u012f\3\2\2\2\u014a\u0130\3\2\2\2\u014a\u0132\3\2\2\2\u014a\u0133\3\2"+
		"\2\2\u014a\u0134\3\2\2\2\u014a\u0135\3\2\2\2\u014a\u0137\3\2\2\2\u014a"+
		"\u0139\3\2\2\2\u014a\u013b\3\2\2\2\u014a\u013c\3\2\2\2\u014a\u013e\3\2"+
		"\2\2\u014a\u013f\3\2\2\2\u014a\u0141\3\2\2\2\u014a\u0143\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014a\u0148\3\2\2\2\u014bB\3\2\2\2\u014c\u0153\5I%\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7q\2\2\u014f\u0153\7v\2\2\u0150\u0153\7%\2\2"+
		"\u0151\u0153\5G$\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0151\3\2\2\2\u0153D\3\2\2\2\u0154\u0155\t\4\2\2\u0155"+
		"F\3\2\2\2\u0156\u0157\7\u0080\2\2\u0157H\3\2\2\2\u0158\u0159\7/\2\2\u0159"+
		"J\3\2\2\2\u015a\u015f\5g\64\2\u015b\u015e\5g\64\2\u015c\u015e\5i\65\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160L\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\7^\2\2\u0163\u017a\7c\2\2\u0164\u0165\7^\2\2\u0165\u017a\7d\2\2"+
		"\u0166\u0167\7^\2\2\u0167\u017a\7h\2\2\u0168\u0169\7^\2\2\u0169\u017a"+
		"\7p\2\2\u016a\u016b\7^\2\2\u016b\u017a\7v\2\2\u016c\u016d\7^\2\2\u016d"+
		"\u017a\7t\2\2\u016e\u016f\7^\2\2\u016f\u017a\7x\2\2\u0170\u0171\7^\2\2"+
		"\u0171\u017a\7$\2\2\u0172\u0173\7^\2\2\u0173\u017a\7)\2\2\u0174\u0175"+
		"\7^\2\2\u0175\u017a\7|\2\2\u0176\u0177\7^\2\2\u0177\u017a\7^\2\2\u0178"+
		"\u017a\5O(\2\u0179\u0162\3\2\2\2\u0179\u0164\3\2\2\2\u0179\u0166\3\2\2"+
		"\2\u0179\u0168\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016c\3\2\2\2\u0179\u016e"+
		"\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0172\3\2\2\2\u0179\u0174\3\2\2\2\u0179"+
		"\u0176\3\2\2\2\u0179\u0178\3\2\2\2\u017aN\3\2\2\2\u017b\u017c\7^\2\2\u017c"+
		"\u017d\7w\2\2\u017d\u017e\7}\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5i\65"+
		"\2\u0180\u0181\5i\65\2\u0181\u0182\5i\65\2\u0182\u0183\7\177\2\2\u0183"+
		"P\3\2\2\2\u0184\u0185\7^\2\2\u0185\u0186\7z\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\5i\65\2\u0188\u0189\5i\65\2\u0189\u0190\3\2\2\2\u018a\u018b\7^"+
		"\2\2\u018b\u018c\5i\65\2\u018c\u018d\5i\65\2\u018d\u018e\5i\65\2\u018e"+
		"\u0190\3\2\2\2\u018f\u0184\3\2\2\2\u018f\u018a\3\2\2\2\u0190R\3\2\2\2"+
		"\u0191\u0197\5U+\2\u0192\u0197\5W,\2\u0193\u0197\5Y-\2\u0194\u0197\5["+
		".\2\u0195\u0197\5]/\2\u0196\u0191\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0193"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197T\3\2\2\2\u0198"+
		"\u019a\5i\65\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019cV\3\2\2\2\u019d\u019e\7\62\2\2\u019e\u01a0"+
		"\t\5\2\2\u019f\u01a1\t\6\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3X\3\2\2\2\u01a4\u01a5\5U+\2\u01a5"+
		"\u01a6\7\60\2\2\u01a6\u01a7\5U+\2\u01a7Z\3\2\2\2\u01a8\u01a9\5Y-\2\u01a9"+
		"\u01ab\t\7\2\2\u01aa\u01ac\t\b\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5U+\2\u01ae\\\3\2\2\2\u01af\u01b0"+
		"\5W,\2\u01b0\u01b2\t\t\2\2\u01b1\u01b3\t\b\2\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5U+\2\u01b5^\3\2\2\2\u01b6"+
		"\u01bb\7$\2\2\u01b7\u01ba\5g\64\2\u01b8\u01ba\5M\'\2\u01b9\u01b7\3\2\2"+
		"\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01ca\7$\2\2\u01bf"+
		"\u01c5\7)\2\2\u01c0\u01c4\5g\64\2\u01c1\u01c4\5M\'\2\u01c2\u01c4\5i\65"+
		"\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01ca\7)\2\2\u01c9\u01b6\3\2\2\2\u01c9\u01bf\3\2"+
		"\2\2\u01ca`\3\2\2\2\u01cb\u01cc\7/\2\2\u01cc\u01cd\7/\2\2\u01cd\u01ce"+
		"\7]\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\5c\62\2\u01d0\u01d1\7_\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\b\61\2\2\u01d3b\3\2\2\2\u01d4\u01d5\7?\2\2"+
		"\u01d5\u01d6\5c\62\2\u01d6\u01d7\7?\2\2\u01d7\u01de\3\2\2\2\u01d8\u01da"+
		"\7]\2\2\u01d9\u01db\13\2\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01de\7_\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d8\3\2"+
		"\2\2\u01ded\3\2\2\2\u01df\u01e0\7/\2\2\u01e0\u01e1\7/\2\2\u01e1\u01ff"+
		"\3\2\2\2\u01e2\u0200\3\2\2\2\u01e3\u01e7\7]\2\2\u01e4\u01e6\7?\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u0200\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ee\7]\2\2\u01eb"+
		"\u01ed\7?\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f5\n\n\2\2\u01f2\u01f4\n\13\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3"+
		"\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0200\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f8\u01fc\n\f\2\2\u01f9\u01fb\n\13\2\2\u01fa\u01f9\3"+
		"\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u01e2\3\2\2\2\u01ff\u01e3\3\2"+
		"\2\2\u01ff\u01ea\3\2\2\2\u01ff\u01f8\3\2\2\2\u0200\u0204\3\2\2\2\u0201"+
		"\u0202\7\17\2\2\u0202\u0205\7\f\2\2\u0203\u0205\t\r\2\2\u0204\u0201\3"+
		"\2\2\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\b\63\2\2\u0207"+
		"f\3\2\2\2\u0208\u0209\t\16\2\2\u0209h\3\2\2\2\u020a\u020b\t\17\2\2\u020b"+
		"j\3\2\2\2\u020c\u020e\t\20\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2"+
		"\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212"+
		"\b\66\3\2\u0212l\3\2\2\2\36\2\u011c\u012b\u014a\u0152\u015d\u015f\u0179"+
		"\u018f\u0196\u019b\u01a2\u01ab\u01b2\u01b9\u01bb\u01c3\u01c5\u01c9\u01da"+
		"\u01dd\u01e7\u01ee\u01f5\u01fc\u01ff\u0204\u020f\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}