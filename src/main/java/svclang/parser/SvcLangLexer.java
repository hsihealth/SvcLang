// Generated from /Users/nathanstults/syncordia/svclang/SvcLang.g4 by ANTLR 4.5
package svclang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SvcLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PrimitiveType=3, Enumeration=4, Service=5, Extends=6, 
		PartialMessage=7, Query=8, Command=9, Event=10, Document=11, Emits=12, 
		FailsWith=13, RespondsWith=14, InputStream=15, OutputStream=16, Messages=17, 
		Identifier=18, Constant=19, StringLiteral=20, Colon=21, Arrow=22, LeftParen=23, 
		RightParen=24, LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, 
		Quote=29, Star=30, DoubleDash=31, Comma=32, Section=33, LineDoc=34, BlockDoc=35, 
		Whitespace=36, Newline=37, BlockComment=38, LineComment=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "PrimitiveType", "Enumeration", "Service", "Extends", 
		"PartialMessage", "Query", "Command", "Event", "Document", "Emits", "FailsWith", 
		"RespondsWith", "InputStream", "OutputStream", "Messages", "Identifier", 
		"Constant", "StringLiteral", "Colon", "Arrow", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Quote", "Star", 
		"DoubleDash", "DoubleHash", "Hash", "Comma", "Section", "LineDoc", "BlockDoc", 
		"Nondigit", "Digit", "NumberConstant", "IntegerConstant", "DecimalConstant", 
		"HexadecimalConstant", "HexadecimalPrefix", "NonzeroDigit", "HexadecimalDigit", 
		"FractionalConstant", "DigitSequence", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'required'", null, "'enum'", "'service'", "'extends'", "'partial message'", 
		"'query'", "'command'", "'event'", "'document'", "'emits'", "'fails with'", 
		"'responds with'", "'input stream'", "'output stream'", "'messages'", 
		null, null, null, "':'", "'->'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'\"'", "'*'", "'--'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "PrimitiveType", "Enumeration", "Service", "Extends", 
		"PartialMessage", "Query", "Command", "Event", "Document", "Emits", "FailsWith", 
		"RespondsWith", "InputStream", "OutputStream", "Messages", "Identifier", 
		"Constant", "StringLiteral", "Colon", "Arrow", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Quote", "Star", 
		"DoubleDash", "Comma", "Section", "LineDoc", "BlockDoc", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SvcLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SvcLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u01c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u009c\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u0126\n\23\f\23\16\23\u0129\13\23\3\24\3\24\3\24\5\24\u012e\n\24\3\25"+
		"\3\25\7\25\u0132\n\25\f\25\16\25\u0135\13\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\7$\u015a\n"+
		"$\f$\16$\u015d\13$\3%\3%\7%\u0161\n%\f%\16%\u0164\13%\3&\3&\7&\u0168\n"+
		"&\f&\16&\u016b\13&\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u0175\n)\3*\3*\5*\u0179"+
		"\n*\3+\3+\7+\u017d\n+\f+\16+\u0180\13+\3,\3,\6,\u0184\n,\r,\16,\u0185"+
		"\3-\3-\3-\3.\3.\3/\3/\3\60\5\60\u0190\n\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0197\n\60\3\61\6\61\u019a\n\61\r\61\16\61\u019b\3\62\6\62\u019f\n"+
		"\62\r\62\16\62\u01a0\3\62\3\62\3\63\3\63\5\63\u01a7\n\63\3\63\5\63\u01aa"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u01b2\n\64\f\64\16\64\u01b5\13"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u01c0\n\65\f\65"+
		"\16\65\u01c3\13\65\3\65\3\65\5\u0133\u0169\u01b3\2\66\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\"G#I"+
		"$K%M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c&e\'g(i)\3\2\n\5\2\f\f\17\17\177"+
		"\177\5\2C\\aac|\3\2\62;\4\2ZZzz\3\2\63;\5\2\62;CHch\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\u01d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2"+
		"\2\2\5m\3\2\2\2\7\u009b\3\2\2\2\t\u009d\3\2\2\2\13\u00a2\3\2\2\2\r\u00aa"+
		"\3\2\2\2\17\u00b2\3\2\2\2\21\u00c2\3\2\2\2\23\u00c8\3\2\2\2\25\u00d0\3"+
		"\2\2\2\27\u00d6\3\2\2\2\31\u00df\3\2\2\2\33\u00e5\3\2\2\2\35\u00f0\3\2"+
		"\2\2\37\u00fe\3\2\2\2!\u010b\3\2\2\2#\u0119\3\2\2\2%\u0122\3\2\2\2\'\u012d"+
		"\3\2\2\2)\u012f\3\2\2\2+\u0138\3\2\2\2-\u013a\3\2\2\2/\u013d\3\2\2\2\61"+
		"\u013f\3\2\2\2\63\u0141\3\2\2\2\65\u0143\3\2\2\2\67\u0145\3\2\2\29\u0147"+
		"\3\2\2\2;\u0149\3\2\2\2=\u014b\3\2\2\2?\u014d\3\2\2\2A\u0150\3\2\2\2C"+
		"\u0153\3\2\2\2E\u0155\3\2\2\2G\u0157\3\2\2\2I\u015e\3\2\2\2K\u0165\3\2"+
		"\2\2M\u016e\3\2\2\2O\u0170\3\2\2\2Q\u0174\3\2\2\2S\u0178\3\2\2\2U\u017a"+
		"\3\2\2\2W\u0181\3\2\2\2Y\u0187\3\2\2\2[\u018a\3\2\2\2]\u018c\3\2\2\2_"+
		"\u0196\3\2\2\2a\u0199\3\2\2\2c\u019e\3\2\2\2e\u01a9\3\2\2\2g\u01ad\3\2"+
		"\2\2i\u01bb\3\2\2\2kl\7\60\2\2l\4\3\2\2\2mn\7t\2\2no\7g\2\2op\7s\2\2p"+
		"q\7w\2\2qr\7k\2\2rs\7t\2\2st\7g\2\2tu\7f\2\2u\6\3\2\2\2vw\7k\2\2wx\7p"+
		"\2\2xy\7v\2\2yz\7g\2\2z{\7i\2\2{|\7g\2\2|\u009c\7t\2\2}~\7u\2\2~\177\7"+
		"v\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u009c"+
		"\7i\2\2\u0083\u0084\7d\2\2\u0084\u0085\7q\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089\u009c\7p\2\2"+
		"\u008a\u008b\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7o\2\2\u008d\u008e"+
		"\7d\2\2\u008e\u008f\7g\2\2\u008f\u009c\7t\2\2\u0090\u0091\7o\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u009c\7r\2\2\u0093\u0094\7n\2\2\u0094\u0095\7k\2\2"+
		"\u0095\u0096\7u\2\2\u0096\u009c\7v\2\2\u0097\u0098\7f\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7v\2\2\u009a\u009c\7g\2\2\u009bv\3\2\2\2\u009b}\3"+
		"\2\2\2\u009b\u0083\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u0090\3\2\2\2\u009b"+
		"\u0093\3\2\2\2\u009b\u0097\3\2\2\2\u009c\b\3\2\2\2\u009d\u009e\7g\2\2"+
		"\u009e\u009f\7p\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7o\2\2\u00a1\n\3\2"+
		"\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6"+
		"\7x\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\f\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7z\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7u\2\2"+
		"\u00b1\16\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7"+
		"t\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7i\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1\20\3\2\2\2\u00c2\u00c3\7s\2\2\u00c3\u00c4\7"+
		"w\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7{\2\2\u00c7\22"+
		"\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7o\2\2\u00cb"+
		"\u00cc\7o\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7f\2\2"+
		"\u00cf\24\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7x\2\2\u00d2\u00d3\7"+
		"g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\26\3\2\2\2\u00d6\u00d7"+
		"\7f\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7w\2\2\u00da"+
		"\u00db\7o\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2"+
		"\u00de\30\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7"+
		"k\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7u\2\2\u00e4\32\3\2\2\2\u00e5\u00e6"+
		"\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7n\2\2\u00e9"+
		"\u00ea\7u\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7k\2"+
		"\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7j\2\2\u00ef\34\3\2\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7r\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7u\2\2"+
		"\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7j\2\2\u00fd\36\3\2\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100"+
		"\7p\2\2\u0100\u0101\7r\2\2\u0101\u0102\7w\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7\"\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7t\2"+
		"\2\u0107\u0108\7g\2\2\u0108\u0109\7c\2\2\u0109\u010a\7o\2\2\u010a \3\2"+
		"\2\2\u010b\u010c\7q\2\2\u010c\u010d\7w\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7r\2\2\u010f\u0110\7w\2\2\u0110\u0111\7v\2\2\u0111\u0112\7\"\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7g\2\2"+
		"\u0116\u0117\7c\2\2\u0117\u0118\7o\2\2\u0118\"\3\2\2\2\u0119\u011a\7o"+
		"\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2\2\u011c\u011d\7u\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7i\2\2\u011f\u0120\7g\2\2\u0120\u0121\7u\2\2\u0121"+
		"$\3\2\2\2\u0122\u0127\5M\'\2\u0123\u0126\5M\'\2\u0124\u0126\5O(\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128&\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e"+
		"\5)\25\2\u012b\u012e\5%\23\2\u012c\u012e\5Q)\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e(\3\2\2\2\u012f\u0133\5;\36\2"+
		"\u0130\u0132\13\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\5;\36\2\u0137*\3\2\2\2\u0138\u0139\7<\2\2\u0139,\3\2\2\2\u013a"+
		"\u013b\7/\2\2\u013b\u013c\7@\2\2\u013c.\3\2\2\2\u013d\u013e\7*\2\2\u013e"+
		"\60\3\2\2\2\u013f\u0140\7+\2\2\u0140\62\3\2\2\2\u0141\u0142\7]\2\2\u0142"+
		"\64\3\2\2\2\u0143\u0144\7_\2\2\u0144\66\3\2\2\2\u0145\u0146\7}\2\2\u0146"+
		"8\3\2\2\2\u0147\u0148\7\177\2\2\u0148:\3\2\2\2\u0149\u014a\7$\2\2\u014a"+
		"<\3\2\2\2\u014b\u014c\7,\2\2\u014c>\3\2\2\2\u014d\u014e\7/\2\2\u014e\u014f"+
		"\7/\2\2\u014f@\3\2\2\2\u0150\u0151\7%\2\2\u0151\u0152\7%\2\2\u0152B\3"+
		"\2\2\2\u0153\u0154\7%\2\2\u0154D\3\2\2\2\u0155\u0156\7.\2\2\u0156F\3\2"+
		"\2\2\u0157\u015b\5A!\2\u0158\u015a\n\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cH\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0162\5C\"\2\u015f\u0161\n\2\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"J\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0169\5? \2\u0166\u0168\13\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016a\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\5? \2\u016dL"+
		"\3\2\2\2\u016e\u016f\t\3\2\2\u016fN\3\2\2\2\u0170\u0171\t\4\2\2\u0171"+
		"P\3\2\2\2\u0172\u0175\5S*\2\u0173\u0175\5_\60\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0173\3\2\2\2\u0175R\3\2\2\2\u0176\u0179\5U+\2\u0177\u0179\5W,\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179T\3\2\2\2\u017a\u017e\5[.\2\u017b"+
		"\u017d\5O(\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017fV\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183"+
		"\5Y-\2\u0182\u0184\5]/\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186X\3\2\2\2\u0187\u0188\7\62\2\2"+
		"\u0188\u0189\t\5\2\2\u0189Z\3\2\2\2\u018a\u018b\t\6\2\2\u018b\\\3\2\2"+
		"\2\u018c\u018d\t\7\2\2\u018d^\3\2\2\2\u018e\u0190\5a\61\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\60\2\2"+
		"\u0192\u0197\5a\61\2\u0193\u0194\5a\61\2\u0194\u0195\7\60\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u018f\3\2\2\2\u0196\u0193\3\2\2\2\u0197`\3\2\2\2\u0198"+
		"\u019a\5O(\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2"+
		"\2\u019b\u019c\3\2\2\2\u019cb\3\2\2\2\u019d\u019f\t\b\2\2\u019e\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\b\62\2\2\u01a3d\3\2\2\2\u01a4\u01a6\7\17\2"+
		"\2\u01a5\u01a7\7\f\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01aa\7\f\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ac\b\63\2\2\u01acf\3\2\2\2\u01ad\u01ae\7\61\2"+
		"\2\u01ae\u01af\7,\2\2\u01af\u01b3\3\2\2\2\u01b0\u01b2\13\2\2\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7\u01b8\7\61"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\b\64\2\2\u01bah\3\2\2\2\u01bb\u01bc"+
		"\7\61\2\2\u01bc\u01bd\7\61\2\2\u01bd\u01c1\3\2\2\2\u01be\u01c0\n\t\2\2"+
		"\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\b\65\2\2"+
		"\u01c5j\3\2\2\2\27\2\u009b\u0125\u0127\u012d\u0133\u015b\u0162\u0169\u0174"+
		"\u0178\u017e\u0185\u018f\u0196\u019b\u01a0\u01a6\u01a9\u01b3\u01c1\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}