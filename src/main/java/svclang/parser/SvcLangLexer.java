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
		T__0=1, PrimitiveType=2, Enumeration=3, Service=4, Extends=5, PartialMessage=6, 
		Query=7, Command=8, Event=9, Document=10, Emits=11, FailsWith=12, RespondsWith=13, 
		InputStream=14, OutputStream=15, Messages=16, Identifier=17, Constant=18, 
		StringLiteral=19, Colon=20, Arrow=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, Quote=28, Star=29, DoubleDash=30, 
		Comma=31, Section=32, LineDoc=33, BlockDoc=34, Whitespace=35, Newline=36, 
		BlockComment=37, LineComment=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "PrimitiveType", "Enumeration", "Service", "Extends", "PartialMessage", 
		"Query", "Command", "Event", "Document", "Emits", "FailsWith", "RespondsWith", 
		"InputStream", "OutputStream", "Messages", "Identifier", "Constant", "StringLiteral", 
		"Colon", "Arrow", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Quote", "Star", "DoubleDash", "DoubleHash", 
		"Hash", "Comma", "Section", "LineDoc", "BlockDoc", "Nondigit", "Digit", 
		"NumberConstant", "IntegerConstant", "DecimalConstant", "HexadecimalConstant", 
		"HexadecimalPrefix", "NonzeroDigit", "HexadecimalDigit", "FractionalConstant", 
		"DigitSequence", "Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'required'", null, "'enum'", "'service'", "'extends'", "'partial message'", 
		"'query'", "'command'", "'event'", "'document'", "'emits'", "'fails with'", 
		"'responds with'", "'input stream'", "'output stream'", "'messages'", 
		null, null, null, "':'", "'->'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'\"'", "'*'", "'--'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PrimitiveType", "Enumeration", "Service", "Extends", "PartialMessage", 
		"Query", "Command", "Event", "Document", "Emits", "FailsWith", "RespondsWith", 
		"InputStream", "OutputStream", "Messages", "Identifier", "Constant", "StringLiteral", 
		"Colon", "Arrow", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Quote", "Star", "DoubleDash", "Comma", "Section", 
		"LineDoc", "BlockDoc", "Whitespace", "Newline", "BlockComment", "LineComment"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u01c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0098\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22\u0125"+
		"\13\22\3\23\3\23\3\23\5\23\u012a\n\23\3\24\3\24\7\24\u012e\n\24\f\24\16"+
		"\24\u0131\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u0156\n#\f#\16#\u0159\13#\3$\3$"+
		"\7$\u015d\n$\f$\16$\u0160\13$\3%\3%\7%\u0164\n%\f%\16%\u0167\13%\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\5(\u0171\n(\3)\3)\5)\u0175\n)\3*\3*\7*\u0179\n*"+
		"\f*\16*\u017c\13*\3+\3+\6+\u0180\n+\r+\16+\u0181\3,\3,\3,\3-\3-\3.\3."+
		"\3/\5/\u018c\n/\3/\3/\3/\3/\3/\5/\u0193\n/\3\60\6\60\u0196\n\60\r\60\16"+
		"\60\u0197\3\61\6\61\u019b\n\61\r\61\16\61\u019c\3\61\3\61\3\62\3\62\5"+
		"\62\u01a3\n\62\3\62\5\62\u01a6\n\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63"+
		"\u01ae\n\63\f\63\16\63\u01b1\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\7\64\u01bc\n\64\f\64\16\64\u01bf\13\64\3\64\3\64\5\u012f\u0165"+
		"\u01af\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?\2A\2C!E\"G#I$K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a%c&e\'g"+
		"(\3\2\n\5\2\f\f\17\17\177\177\5\2C\\aac|\3\2\62;\4\2ZZzz\3\2\63;\5\2\62"+
		";CHch\4\2\13\13\"\"\4\2\f\f\17\17\u01ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\3i\3\2\2\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2\t\u009e\3\2\2\2\13\u00a6"+
		"\3\2\2\2\r\u00ae\3\2\2\2\17\u00be\3\2\2\2\21\u00c4\3\2\2\2\23\u00cc\3"+
		"\2\2\2\25\u00d2\3\2\2\2\27\u00db\3\2\2\2\31\u00e1\3\2\2\2\33\u00ec\3\2"+
		"\2\2\35\u00fa\3\2\2\2\37\u0107\3\2\2\2!\u0115\3\2\2\2#\u011e\3\2\2\2%"+
		"\u0129\3\2\2\2\'\u012b\3\2\2\2)\u0134\3\2\2\2+\u0136\3\2\2\2-\u0139\3"+
		"\2\2\2/\u013b\3\2\2\2\61\u013d\3\2\2\2\63\u013f\3\2\2\2\65\u0141\3\2\2"+
		"\2\67\u0143\3\2\2\29\u0145\3\2\2\2;\u0147\3\2\2\2=\u0149\3\2\2\2?\u014c"+
		"\3\2\2\2A\u014f\3\2\2\2C\u0151\3\2\2\2E\u0153\3\2\2\2G\u015a\3\2\2\2I"+
		"\u0161\3\2\2\2K\u016a\3\2\2\2M\u016c\3\2\2\2O\u0170\3\2\2\2Q\u0174\3\2"+
		"\2\2S\u0176\3\2\2\2U\u017d\3\2\2\2W\u0183\3\2\2\2Y\u0186\3\2\2\2[\u0188"+
		"\3\2\2\2]\u0192\3\2\2\2_\u0195\3\2\2\2a\u019a\3\2\2\2c\u01a5\3\2\2\2e"+
		"\u01a9\3\2\2\2g\u01b7\3\2\2\2ij\7t\2\2jk\7g\2\2kl\7s\2\2lm\7w\2\2mn\7"+
		"k\2\2no\7t\2\2op\7g\2\2pq\7f\2\2q\4\3\2\2\2rs\7k\2\2st\7p\2\2tu\7v\2\2"+
		"uv\7g\2\2vw\7i\2\2wx\7g\2\2x\u0098\7t\2\2yz\7u\2\2z{\7v\2\2{|\7t\2\2|"+
		"}\7k\2\2}~\7p\2\2~\u0098\7i\2\2\177\u0080\7d\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7q\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2"+
		"\u0085\u0098\7p\2\2\u0086\u0087\7p\2\2\u0087\u0088\7w\2\2\u0088\u0089"+
		"\7o\2\2\u0089\u008a\7d\2\2\u008a\u008b\7g\2\2\u008b\u0098\7t\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u0098\7r\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0091\7k\2\2\u0091\u0092\7u\2\2\u0092\u0098\7v\2\2\u0093\u0094"+
		"\7f\2\2\u0094\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096\u0098\7g\2\2\u0097"+
		"r\3\2\2\2\u0097y\3\2\2\2\u0097\177\3\2\2\2\u0097\u0086\3\2\2\2\u0097\u008c"+
		"\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098\6\3\2\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7w\2\2\u009c\u009d\7o\2\2"+
		"\u009d\b\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t"+
		"\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7z\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\f\3\2\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4\u00b5\7n\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7c\2\2\u00bb"+
		"\u00bc\7i\2\2\u00bc\u00bd\7g\2\2\u00bd\16\3\2\2\2\u00be\u00bf\7s\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7{\2\2"+
		"\u00c3\20\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7"+
		"o\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb"+
		"\7f\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2\u00d1\24\3\2\2\2\u00d2\u00d3"+
		"\7f\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7w\2\2\u00d6"+
		"\u00d7\7o\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2"+
		"\u00da\26\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de\7"+
		"k\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7u\2\2\u00e0\30\3\2\2\2\u00e1\u00e2"+
		"\7h\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7n\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7k\2"+
		"\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7j\2\2\u00eb\32\3\2\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7r\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7u\2\2"+
		"\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7j\2\2\u00f9\34\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0100\7\"\2\2\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2"+
		"\2\u0103\u0104\7g\2\2\u0104\u0105\7c\2\2\u0105\u0106\7o\2\2\u0106\36\3"+
		"\2\2\2\u0107\u0108\7q\2\2\u0108\u0109\7w\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u010b\7r\2\2\u010b\u010c\7w\2\2\u010c\u010d\7v\2\2\u010d\u010e\7\"\2"+
		"\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7c\2\2\u0113\u0114\7o\2\2\u0114 \3\2\2\2\u0115\u0116"+
		"\7o\2\2\u0116\u0117\7g\2\2\u0117\u0118\7u\2\2\u0118\u0119\7u\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7i\2\2\u011b\u011c\7g\2\2\u011c\u011d\7u\2\2"+
		"\u011d\"\3\2\2\2\u011e\u0123\5K&\2\u011f\u0122\5K&\2\u0120\u0122\5M\'"+
		"\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124$\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u012a\5\'\24\2\u0127\u012a\5#\22\2\u0128\u012a\5O(\2\u0129\u0126\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a&\3\2\2\2\u012b\u012f"+
		"\59\35\2\u012c\u012e\13\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0133\59\35\2\u0133(\3\2\2\2\u0134\u0135\7<\2\2\u0135*"+
		"\3\2\2\2\u0136\u0137\7/\2\2\u0137\u0138\7@\2\2\u0138,\3\2\2\2\u0139\u013a"+
		"\7*\2\2\u013a.\3\2\2\2\u013b\u013c\7+\2\2\u013c\60\3\2\2\2\u013d\u013e"+
		"\7]\2\2\u013e\62\3\2\2\2\u013f\u0140\7_\2\2\u0140\64\3\2\2\2\u0141\u0142"+
		"\7}\2\2\u0142\66\3\2\2\2\u0143\u0144\7\177\2\2\u01448\3\2\2\2\u0145\u0146"+
		"\7$\2\2\u0146:\3\2\2\2\u0147\u0148\7,\2\2\u0148<\3\2\2\2\u0149\u014a\7"+
		"/\2\2\u014a\u014b\7/\2\2\u014b>\3\2\2\2\u014c\u014d\7%\2\2\u014d\u014e"+
		"\7%\2\2\u014e@\3\2\2\2\u014f\u0150\7%\2\2\u0150B\3\2\2\2\u0151\u0152\7"+
		".\2\2\u0152D\3\2\2\2\u0153\u0157\5? \2\u0154\u0156\n\2\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"F\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015e\5A!\2\u015b\u015d\n\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015fH\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0165\5=\37\2\u0162\u0164"+
		"\13\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169"+
		"\5=\37\2\u0169J\3\2\2\2\u016a\u016b\t\3\2\2\u016bL\3\2\2\2\u016c\u016d"+
		"\t\4\2\2\u016dN\3\2\2\2\u016e\u0171\5Q)\2\u016f\u0171\5]/\2\u0170\u016e"+
		"\3\2\2\2\u0170\u016f\3\2\2\2\u0171P\3\2\2\2\u0172\u0175\5S*\2\u0173\u0175"+
		"\5U+\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175R\3\2\2\2\u0176\u017a"+
		"\5Y-\2\u0177\u0179\5M\'\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bT\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017d\u017f\5W,\2\u017e\u0180\5[.\2\u017f\u017e\3\2\2\2\u0180\u0181\3"+
		"\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182V\3\2\2\2\u0183\u0184"+
		"\7\62\2\2\u0184\u0185\t\5\2\2\u0185X\3\2\2\2\u0186\u0187\t\6\2\2\u0187"+
		"Z\3\2\2\2\u0188\u0189\t\7\2\2\u0189\\\3\2\2\2\u018a\u018c\5_\60\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\60"+
		"\2\2\u018e\u0193\5_\60\2\u018f\u0190\5_\60\2\u0190\u0191\7\60\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u018b\3\2\2\2\u0192\u018f\3\2\2\2\u0193^\3\2\2\2"+
		"\u0194\u0196\5M\'\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198`\3\2\2\2\u0199\u019b\t\b\2\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b\61\2\2\u019fb\3\2\2\2\u01a0\u01a2"+
		"\7\17\2\2\u01a1\u01a3\7\f\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2"+
		"\u01a3\u01a6\3\2\2\2\u01a4\u01a6\7\f\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\b\62\2\2\u01a8d\3\2\2\2\u01a9"+
		"\u01aa\7\61\2\2\u01aa\u01ab\7,\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ae\13"+
		"\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01b0\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7,"+
		"\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\b\63\2\2\u01b6"+
		"f\3\2\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01bd\3\2\2"+
		"\2\u01ba\u01bc\n\t\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01c1\b\64\2\2\u01c1h\3\2\2\2\27\2\u0097\u0121\u0123\u0129\u012f\u0157"+
		"\u015e\u0165\u0170\u0174\u017a\u0181\u018b\u0192\u0197\u019c\u01a2\u01a5"+
		"\u01af\u01bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}