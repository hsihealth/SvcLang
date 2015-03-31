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
		PrimitiveType=1, Enumueration=2, Service=3, Extends=4, PartialMessage=5, 
		Query=6, Command=7, Event=8, Document=9, Emits=10, FailsWith=11, RespondsWith=12, 
		InputStream=13, OutputStream=14, Messages=15, Identifier=16, StringLiteral=17, 
		Constant=18, Colon=19, Arrow=20, LeftParen=21, RightParen=22, LeftBracket=23, 
		RightBracket=24, LeftBrace=25, RightBrace=26, Quote=27, Star=28, DoubleDash=29, 
		Comma=30, Section=31, LineDoc=32, BlockDoc=33, Whitespace=34, Newline=35, 
		BlockComment=36, LineComment=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PrimitiveType", "Enumueration", "Service", "Extends", "PartialMessage", 
		"Query", "Command", "Event", "Document", "Emits", "FailsWith", "RespondsWith", 
		"InputStream", "OutputStream", "Messages", "Identifier", "StringLiteral", 
		"Constant", "Colon", "Arrow", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Quote", "Star", "DoubleDash", 
		"DoubleHash", "Hash", "Comma", "Section", "LineDoc", "BlockDoc", "Nondigit", 
		"Digit", "NumberConstant", "IntegerConstant", "DecimalConstant", "HexadecimalConstant", 
		"HexadecimalPrefix", "NonzeroDigit", "HexadecimalDigit", "FractionalConstant", 
		"DigitSequence", "Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'enum'", "'service'", "'extends'", "'partial message'", "'query'", 
		"'command'", "'event'", "'document'", "'emits'", "'fails with'", "'responds with'", 
		"'input stream'", "'output stream'", "'messages'", null, null, null, "':'", 
		"'->'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", "'*'", "'--'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PrimitiveType", "Enumueration", "Service", "Extends", "PartialMessage", 
		"Query", "Command", "Event", "Document", "Emits", "FailsWith", "RespondsWith", 
		"InputStream", "OutputStream", "Messages", "Identifier", "StringLiteral", 
		"Constant", "Colon", "Arrow", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Quote", "Star", "DoubleDash", 
		"Comma", "Section", "LineDoc", "BlockDoc", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u01b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\u008d\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0117\n\21\f\21\16\21"+
		"\u011a\13\21\3\22\3\22\7\22\u011e\n\22\f\22\16\22\u0121\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u0128\n\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\7\"\u014b\n\"\f\"\16\"\u014e"+
		"\13\"\3#\3#\7#\u0152\n#\f#\16#\u0155\13#\3$\3$\7$\u0159\n$\f$\16$\u015c"+
		"\13$\3$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u0166\n\'\3(\3(\5(\u016a\n(\3)\3)\7"+
		")\u016e\n)\f)\16)\u0171\13)\3*\3*\6*\u0175\n*\r*\16*\u0176\3+\3+\3+\3"+
		",\3,\3-\3-\3.\5.\u0181\n.\3.\3.\3.\3.\3.\5.\u0188\n.\3/\6/\u018b\n/\r"+
		"/\16/\u018c\3\60\6\60\u0190\n\60\r\60\16\60\u0191\3\60\3\60\3\61\3\61"+
		"\5\61\u0198\n\61\3\61\5\61\u019b\n\61\3\61\3\61\3\62\3\62\3\62\3\62\7"+
		"\62\u01a3\n\62\f\62\16\62\u01a6\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\7\63\u01b1\n\63\f\63\16\63\u01b4\13\63\3\63\3\63\4\u015a"+
		"\u01a4\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37=\2?\2A C!E\"G#I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_$a%c&e\'\3"+
		"\2\n\5\2\f\f\17\17\177\177\5\2C\\aac|\3\2\62;\4\2ZZzz\3\2\63;\5\2\62;"+
		"CHch\4\2\13\13\"\"\4\2\f\f\17\17\u01c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3\u008c"+
		"\3\2\2\2\5\u008e\3\2\2\2\7\u0093\3\2\2\2\t\u009b\3\2\2\2\13\u00a3\3\2"+
		"\2\2\r\u00b3\3\2\2\2\17\u00b9\3\2\2\2\21\u00c1\3\2\2\2\23\u00c7\3\2\2"+
		"\2\25\u00d0\3\2\2\2\27\u00d6\3\2\2\2\31\u00e1\3\2\2\2\33\u00ef\3\2\2\2"+
		"\35\u00fc\3\2\2\2\37\u010a\3\2\2\2!\u0113\3\2\2\2#\u011b\3\2\2\2%\u0127"+
		"\3\2\2\2\'\u0129\3\2\2\2)\u012b\3\2\2\2+\u012e\3\2\2\2-\u0130\3\2\2\2"+
		"/\u0132\3\2\2\2\61\u0134\3\2\2\2\63\u0136\3\2\2\2\65\u0138\3\2\2\2\67"+
		"\u013a\3\2\2\29\u013c\3\2\2\2;\u013e\3\2\2\2=\u0141\3\2\2\2?\u0144\3\2"+
		"\2\2A\u0146\3\2\2\2C\u0148\3\2\2\2E\u014f\3\2\2\2G\u0156\3\2\2\2I\u015f"+
		"\3\2\2\2K\u0161\3\2\2\2M\u0165\3\2\2\2O\u0169\3\2\2\2Q\u016b\3\2\2\2S"+
		"\u0172\3\2\2\2U\u0178\3\2\2\2W\u017b\3\2\2\2Y\u017d\3\2\2\2[\u0187\3\2"+
		"\2\2]\u018a\3\2\2\2_\u018f\3\2\2\2a\u019a\3\2\2\2c\u019e\3\2\2\2e\u01ac"+
		"\3\2\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2jk\7g\2\2kl\7i\2\2lm\7g\2\2m\u008d"+
		"\7t\2\2no\7u\2\2op\7v\2\2pq\7t\2\2qr\7k\2\2rs\7p\2\2s\u008d\7i\2\2tu\7"+
		"d\2\2uv\7q\2\2vw\7q\2\2wx\7n\2\2xy\7g\2\2yz\7c\2\2z\u008d\7p\2\2{|\7p"+
		"\2\2|}\7w\2\2}~\7o\2\2~\177\7d\2\2\177\u0080\7g\2\2\u0080\u008d\7t\2\2"+
		"\u0081\u0082\7o\2\2\u0082\u0083\7c\2\2\u0083\u008d\7r\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7k\2\2\u0086\u0087\7u\2\2\u0087\u008d\7v\2\2\u0088"+
		"\u0089\7f\2\2\u0089\u008a\7c\2\2\u008a\u008b\7v\2\2\u008b\u008d\7g\2\2"+
		"\u008cg\3\2\2\2\u008cn\3\2\2\2\u008ct\3\2\2\2\u008c{\3\2\2\2\u008c\u0081"+
		"\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0088\3\2\2\2\u008d\4\3\2\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\u0091\7w\2\2\u0091\u0092\7o\2\2"+
		"\u0092\6\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\u0096\7t"+
		"\2\2\u0096\u0097\7x\2\2\u0097\u0098\7k\2\2\u0098\u0099\7e\2\2\u0099\u009a"+
		"\7g\2\2\u009a\b\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7z\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7c\2\2"+
		"\u00a9\u00aa\7n\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7i\2\2\u00b1\u00b2\7g\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7s\2\2\u00b4"+
		"\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7{\2\2"+
		"\u00b8\16\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7"+
		"o\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7f\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\22\3\2\2\2\u00c7\u00c8"+
		"\7f\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7w\2\2\u00cb"+
		"\u00cc\7o\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2"+
		"\u00cf\24\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3\7"+
		"k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7u\2\2\u00d5\26\3\2\2\2\u00d6\u00d7"+
		"\7h\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7n\2\2\u00da"+
		"\u00db\7u\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7k\2"+
		"\2\u00de\u00df\7v\2\2\u00df\u00e0\7j\2\2\u00e0\30\3\2\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7r\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7u\2\2"+
		"\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7v\2\2\u00ed\u00ee\7j\2\2\u00ee\32\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\u00f5\7\"\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2"+
		"\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7o\2\2\u00fb\34\3"+
		"\2\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0100\7r\2\2\u0100\u0101\7w\2\2\u0101\u0102\7v\2\2\u0102\u0103\7\"\2"+
		"\2\u0103\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105\u0106\7t\2\2\u0106\u0107"+
		"\7g\2\2\u0107\u0108\7c\2\2\u0108\u0109\7o\2\2\u0109\36\3\2\2\2\u010a\u010b"+
		"\7o\2\2\u010b\u010c\7g\2\2\u010c\u010d\7u\2\2\u010d\u010e\7u\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7i\2\2\u0110\u0111\7g\2\2\u0111\u0112\7u\2\2"+
		"\u0112 \3\2\2\2\u0113\u0118\5I%\2\u0114\u0117\5I%\2\u0115\u0117\5K&\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\"\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011f\5\67\34\2\u011c\u011e\13\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\5\67\34\2\u0123$\3\2\2\2\u0124\u0128\5M\'\2"+
		"\u0125\u0128\5#\22\2\u0126\u0128\5!\21\2\u0127\u0124\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128&\3\2\2\2\u0129\u012a\7<\2\2\u012a("+
		"\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7@\2\2\u012d*\3\2\2\2\u012e\u012f"+
		"\7*\2\2\u012f,\3\2\2\2\u0130\u0131\7+\2\2\u0131.\3\2\2\2\u0132\u0133\7"+
		"]\2\2\u0133\60\3\2\2\2\u0134\u0135\7_\2\2\u0135\62\3\2\2\2\u0136\u0137"+
		"\7}\2\2\u0137\64\3\2\2\2\u0138\u0139\7\177\2\2\u0139\66\3\2\2\2\u013a"+
		"\u013b\7$\2\2\u013b8\3\2\2\2\u013c\u013d\7,\2\2\u013d:\3\2\2\2\u013e\u013f"+
		"\7/\2\2\u013f\u0140\7/\2\2\u0140<\3\2\2\2\u0141\u0142\7%\2\2\u0142\u0143"+
		"\7%\2\2\u0143>\3\2\2\2\u0144\u0145\7%\2\2\u0145@\3\2\2\2\u0146\u0147\7"+
		".\2\2\u0147B\3\2\2\2\u0148\u014c\5=\37\2\u0149\u014b\n\2\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"D\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\5? \2\u0150\u0152\n\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154F\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\5;\36\2\u0157\u0159"+
		"\13\2\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015a\u0158\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e"+
		"\5;\36\2\u015eH\3\2\2\2\u015f\u0160\t\3\2\2\u0160J\3\2\2\2\u0161\u0162"+
		"\t\4\2\2\u0162L\3\2\2\2\u0163\u0166\5O(\2\u0164\u0166\5[.\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0164\3\2\2\2\u0166N\3\2\2\2\u0167\u016a\5Q)\2\u0168\u016a"+
		"\5S*\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016aP\3\2\2\2\u016b\u016f"+
		"\5W,\2\u016c\u016e\5K&\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170R\3\2\2\2\u0171\u016f\3\2\2\2"+
		"\u0172\u0174\5U+\2\u0173\u0175\5Y-\2\u0174\u0173\3\2\2\2\u0175\u0176\3"+
		"\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177T\3\2\2\2\u0178\u0179"+
		"\7\62\2\2\u0179\u017a\t\5\2\2\u017aV\3\2\2\2\u017b\u017c\t\6\2\2\u017c"+
		"X\3\2\2\2\u017d\u017e\t\7\2\2\u017eZ\3\2\2\2\u017f\u0181\5]/\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\60\2\2"+
		"\u0183\u0188\5]/\2\u0184\u0185\5]/\2\u0185\u0186\7\60\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0180\3\2\2\2\u0187\u0184\3\2\2\2\u0188\\\3\2\2\2\u0189"+
		"\u018b\5K&\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2"+
		"\2\u018c\u018d\3\2\2\2\u018d^\3\2\2\2\u018e\u0190\t\b\2\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\b\60\2\2\u0194`\3\2\2\2\u0195\u0197\7\17\2"+
		"\2\u0196\u0198\7\f\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u019b\7\f\2\2\u019a\u0195\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\b\61\2\2\u019db\3\2\2\2\u019e\u019f\7\61\2"+
		"\2\u019f\u01a0\7,\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a3\13\2\2\2\u01a2\u01a1"+
		"\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7,\2\2\u01a8\u01a9\7\61"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b\62\2\2\u01abd\3\2\2\2\u01ac\u01ad"+
		"\7\61\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b1\n\t\2\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\b\63\2\2"+
		"\u01b6f\3\2\2\2\27\2\u008c\u0116\u0118\u011f\u0127\u014c\u0153\u015a\u0165"+
		"\u0169\u016f\u0176\u0180\u0187\u018c\u0191\u0197\u019a\u01a4\u01b2\3\b"+
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