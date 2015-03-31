// Generated from /Users/nathanstults/syncordia/svclang/SvcLang.g4 by ANTLR 4.5
package svclang.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SvcLangParser extends Parser {
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
		BlockComment=36, LineComment=37, NewLine=38, Enumeration=39;
	public static final int
		RULE_sourceFile = 0, RULE_service = 1, RULE_message = 2, RULE_serviceDeclr = 3, 
		RULE_specList = 4, RULE_spec = 5, RULE_documentation = 6, RULE_setting = 7, 
		RULE_partialMessage = 8, RULE_query = 9, RULE_command = 10, RULE_document = 11, 
		RULE_event = 12, RULE_messageDef = 13, RULE_messageExtensions = 14, RULE_queryResponse = 15, 
		RULE_emits = 16, RULE_failsWith = 17, RULE_messageBody = 18, RULE_messageElements = 19, 
		RULE_messageElement = 20, RULE_fieldSpec = 21, RULE_messageSection = 22, 
		RULE_typeAlias = 23, RULE_identifierList = 24, RULE_typeSpec = 25, RULE_typeSpecList = 26, 
		RULE_enumeration = 27, RULE_union = 28, RULE_serviceSection = 29, RULE_defaultValue = 30, 
		RULE_streamDef = 31, RULE_streamBody = 32, RULE_streamElements = 33, RULE_streamElement = 34, 
		RULE_messageSelections = 35, RULE_messageSelection = 36;
	public static final String[] ruleNames = {
		"sourceFile", "service", "message", "serviceDeclr", "specList", "spec", 
		"documentation", "setting", "partialMessage", "query", "command", "document", 
		"event", "messageDef", "messageExtensions", "queryResponse", "emits", 
		"failsWith", "messageBody", "messageElements", "messageElement", "fieldSpec", 
		"messageSection", "typeAlias", "identifierList", "typeSpec", "typeSpecList", 
		"enumeration", "union", "serviceSection", "defaultValue", "streamDef", 
		"streamBody", "streamElements", "streamElement", "messageSelections", 
		"messageSelection"
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
		"LineComment", "NewLine", "Enumeration"
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

	@Override
	public String getGrammarFileName() { return "SvcLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SvcLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SvcLangParser.EOF, 0); }
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch (_input.LA(1)) {
			case Service:
				{
				setState(74); 
				service();
				}
				break;
			case EOF:
			case PartialMessage:
			case Query:
			case Command:
			case Event:
			case Document:
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document))) != 0)) {
					{
					{
					setState(75); 
					message();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83); 
			match(EOF);
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

	public static class ServiceContext extends ParserRuleContext {
		public ServiceDeclrContext serviceDeclr() {
			return getRuleContext(ServiceDeclrContext.class,0);
		}
		public SpecListContext specList() {
			return getRuleContext(SpecListContext.class,0);
		}
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitService(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			serviceDeclr();
			setState(86); 
			specList();
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

	public static class MessageContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public PartialMessageContext partialMessage() {
			return getRuleContext(PartialMessageContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_message);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case Query:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); 
				query();
				}
				break;
			case Command:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); 
				command();
				}
				break;
			case Document:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); 
				document();
				}
				break;
			case Event:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); 
				event();
				}
				break;
			case PartialMessage:
				enterOuterAlt(_localctx, 5);
				{
				setState(92); 
				partialMessage();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ServiceDeclrContext extends ParserRuleContext {
		public TerminalNode Service() { return getToken(SvcLangParser.Service, 0); }
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public ServiceDeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDeclr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterServiceDeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitServiceDeclr(this);
		}
	}

	public final ServiceDeclrContext serviceDeclr() throws RecognitionException {
		ServiceDeclrContext _localctx = new ServiceDeclrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_serviceDeclr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			match(Service);
			setState(96); 
			match(Identifier);
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

	public static class SpecListContext extends ParserRuleContext {
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public SpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitSpecList(this);
		}
	}

	public final SpecListContext specList() throws RecognitionException {
		SpecListContext _localctx = new SpecListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_specList);
		int _la;
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); 
				spec();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
					{
					{
					setState(100); 
					spec();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SpecContext extends ParserRuleContext {
		public SettingContext setting() {
			return getRuleContext(SettingContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public PartialMessageContext partialMessage() {
			return getRuleContext(PartialMessageContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public ServiceSectionContext serviceSection() {
			return getRuleContext(ServiceSectionContext.class,0);
		}
		public StreamDefContext streamDef() {
			return getRuleContext(StreamDefContext.class,0);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_spec);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); 
				setting();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); 
				documentation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); 
				partialMessage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111); 
				query();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112); 
				command();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113); 
				document();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114); 
				event();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115); 
				typeAlias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(116); 
				serviceSection();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117); 
				streamDef();
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

	public static class DocumentationContext extends ParserRuleContext {
		public TerminalNode LineDoc() { return getToken(SvcLangParser.LineDoc, 0); }
		public TerminalNode BlockDoc() { return getToken(SvcLangParser.BlockDoc, 0); }
		public DocumentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterDocumentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitDocumentation(this);
		}
	}

	public final DocumentationContext documentation() throws RecognitionException {
		DocumentationContext _localctx = new DocumentationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_documentation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==LineDoc || _la==BlockDoc) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SettingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(SvcLangParser.Constant, 0); }
		public TerminalNode NewLine() { return getToken(SvcLangParser.NewLine, 0); }
		public SettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitSetting(this);
		}
	}

	public final SettingContext setting() throws RecognitionException {
		SettingContext _localctx = new SettingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			match(Identifier);
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(123); 
				match(Constant);
				}
				break;
			case 2:
				{
				setState(124);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NewLine) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
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

	public static class PartialMessageContext extends ParserRuleContext {
		public TerminalNode PartialMessage() { return getToken(SvcLangParser.PartialMessage, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public PartialMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterPartialMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitPartialMessage(this);
		}
	}

	public final PartialMessageContext partialMessage() throws RecognitionException {
		PartialMessageContext _localctx = new PartialMessageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partialMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			match(PartialMessage);
			setState(128); 
			messageDef();
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode Query() { return getToken(SvcLangParser.Query, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public QueryResponseContext queryResponse() {
			return getRuleContext(QueryResponseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			match(Query);
			setState(131); 
			messageDef();
			setState(132); 
			queryResponse();
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Command() { return getToken(SvcLangParser.Command, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public List<EmitsContext> emits() {
			return getRuleContexts(EmitsContext.class);
		}
		public EmitsContext emits(int i) {
			return getRuleContext(EmitsContext.class,i);
		}
		public List<FailsWithContext> failsWith() {
			return getRuleContexts(FailsWithContext.class);
		}
		public FailsWithContext failsWith(int i) {
			return getRuleContext(FailsWithContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			match(Command);
			setState(135); 
			messageDef();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Emits) {
				{
				{
				setState(136); 
				emits();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FailsWith) {
				{
				{
				setState(142); 
				failsWith();
				}
				}
				setState(147);
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

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode Document() { return getToken(SvcLangParser.Document, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			match(Document);
			setState(149); 
			messageDef();
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode Event() { return getToken(SvcLangParser.Event, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			match(Event);
			setState(152); 
			messageDef();
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

	public static class MessageDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public List<MessageExtensionsContext> messageExtensions() {
			return getRuleContexts(MessageExtensionsContext.class);
		}
		public MessageExtensionsContext messageExtensions(int i) {
			return getRuleContext(MessageExtensionsContext.class,i);
		}
		public MessageBodyContext messageBody() {
			return getRuleContext(MessageBodyContext.class,0);
		}
		public MessageDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageDef(this);
		}
	}

	public final MessageDefContext messageDef() throws RecognitionException {
		MessageDefContext _localctx = new MessageDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_messageDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			match(Identifier);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Extends) {
				{
				{
				setState(155); 
				messageExtensions();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(161); 
				messageBody();
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

	public static class MessageExtensionsContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(SvcLangParser.Extends, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public MessageExtensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExtensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageExtensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageExtensions(this);
		}
	}

	public final MessageExtensionsContext messageExtensions() throws RecognitionException {
		MessageExtensionsContext _localctx = new MessageExtensionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_messageExtensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			match(Extends);
			setState(165); 
			identifierList();
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

	public static class QueryResponseContext extends ParserRuleContext {
		public TerminalNode RespondsWith() { return getToken(SvcLangParser.RespondsWith, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public QueryResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterQueryResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitQueryResponse(this);
		}
	}

	public final QueryResponseContext queryResponse() throws RecognitionException {
		QueryResponseContext _localctx = new QueryResponseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_queryResponse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			match(RespondsWith);
			setState(168); 
			messageDef();
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

	public static class EmitsContext extends ParserRuleContext {
		public TerminalNode Emits() { return getToken(SvcLangParser.Emits, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public EmitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterEmits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitEmits(this);
		}
	}

	public final EmitsContext emits() throws RecognitionException {
		EmitsContext _localctx = new EmitsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_emits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			match(Emits);
			setState(171); 
			messageDef();
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

	public static class FailsWithContext extends ParserRuleContext {
		public TerminalNode FailsWith() { return getToken(SvcLangParser.FailsWith, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public FailsWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failsWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterFailsWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitFailsWith(this);
		}
	}

	public final FailsWithContext failsWith() throws RecognitionException {
		FailsWithContext _localctx = new FailsWithContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_failsWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); 
			match(FailsWith);
			setState(174); 
			messageDef();
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

	public static class MessageBodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SvcLangParser.LeftBrace, 0); }
		public MessageElementsContext messageElements() {
			return getRuleContext(MessageElementsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SvcLangParser.RightBrace, 0); }
		public MessageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageBody(this);
		}
	}

	public final MessageBodyContext messageBody() throws RecognitionException {
		MessageBodyContext _localctx = new MessageBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_messageBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			match(LeftBrace);
			setState(177); 
			messageElements();
			setState(178); 
			match(RightBrace);
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

	public static class MessageElementsContext extends ParserRuleContext {
		public List<MessageElementContext> messageElement() {
			return getRuleContexts(MessageElementContext.class);
		}
		public MessageElementContext messageElement(int i) {
			return getRuleContext(MessageElementContext.class,i);
		}
		public MessageElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageElements(this);
		}
	}

	public final MessageElementsContext messageElements() throws RecognitionException {
		MessageElementsContext _localctx = new MessageElementsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_messageElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(180); 
				messageElement();
				}
				}
				setState(185);
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

	public static class MessageElementContext extends ParserRuleContext {
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public FieldSpecContext fieldSpec() {
			return getRuleContext(FieldSpecContext.class,0);
		}
		public MessageSectionContext messageSection() {
			return getRuleContext(MessageSectionContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public MessageElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageElement(this);
		}
	}

	public final MessageElementContext messageElement() throws RecognitionException {
		MessageElementContext _localctx = new MessageElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_messageElement);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); 
				documentation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); 
				fieldSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); 
				messageSection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189); 
				typeAlias();
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

	public static class FieldSpecContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public FieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitFieldSpec(this);
		}
	}

	public final FieldSpecContext fieldSpec() throws RecognitionException {
		FieldSpecContext _localctx = new FieldSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); 
			match(Identifier);
			setState(193); 
			typeSpec();
			setState(195);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(194); 
				defaultValue();
				}
			}

			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(197); 
				documentation();
				}
				break;
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

	public static class MessageSectionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(SvcLangParser.Colon, 0); }
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public MessageSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageSection(this);
		}
	}

	public final MessageSectionContext messageSection() throws RecognitionException {
		MessageSectionContext _localctx = new MessageSectionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_messageSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			match(Identifier);
			setState(201); 
			match(Colon);
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(202); 
				documentation();
				}
				break;
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(SvcLangParser.Arrow, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitTypeAlias(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); 
			match(Identifier);
			setState(206); 
			match(Arrow);
			setState(207); 
			typeSpec();
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(208); 
				documentation();
				}
				break;
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SvcLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SvcLangParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SvcLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SvcLangParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifierList);
		int _la;
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); 
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); 
				match(Identifier);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(213); 
					match(Comma);
					setState(214); 
					match(Identifier);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode PrimitiveType() { return getToken(SvcLangParser.PrimitiveType, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(SvcLangParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(SvcLangParser.LeftBracket, i);
		}
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(SvcLangParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(SvcLangParser.RightBracket, i);
		}
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeSpec);
		int _la;
		try {
			setState(235);
			switch (_input.LA(1)) {
			case PrimitiveType:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); 
				match(PrimitiveType);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftBracket) {
					{
					{
					setState(223); 
					match(LeftBracket);
					setState(224); 
					typeSpec();
					setState(225); 
					match(RightBracket);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); 
				match(Identifier);
				}
				break;
			case Enumeration:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); 
				enumeration();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(234); 
				union();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeSpecListContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SvcLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SvcLangParser.Comma, i);
		}
		public TypeSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterTypeSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitTypeSpecList(this);
		}
	}

	public final TypeSpecListContext typeSpecList() throws RecognitionException {
		TypeSpecListContext _localctx = new TypeSpecListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeSpecList);
		int _la;
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); 
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); 
				typeSpec();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(239); 
					match(Comma);
					setState(240); 
					typeSpec();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode Enumeration() { return getToken(SvcLangParser.Enumeration, 0); }
		public TerminalNode LeftBracket() { return getToken(SvcLangParser.LeftBracket, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SvcLangParser.RightBracket, 0); }
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			match(Enumeration);
			setState(249); 
			match(LeftBracket);
			setState(250); 
			identifierList();
			setState(251); 
			match(RightBracket);
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

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(SvcLangParser.LeftBracket, 0); }
		public TypeSpecListContext typeSpecList() {
			return getRuleContext(TypeSpecListContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SvcLangParser.RightBracket, 0); }
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			match(LeftBracket);
			setState(254); 
			typeSpecList();
			setState(255); 
			match(RightBracket);
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

	public static class ServiceSectionContext extends ParserRuleContext {
		public TerminalNode Section() { return getToken(SvcLangParser.Section, 0); }
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public ServiceSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterServiceSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitServiceSection(this);
		}
	}

	public final ServiceSectionContext serviceSection() throws RecognitionException {
		ServiceSectionContext _localctx = new ServiceSectionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_serviceSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			match(Section);
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(258); 
				documentation();
				}
				break;
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SvcLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SvcLangParser.RightParen, 0); }
		public TerminalNode Constant() { return getToken(SvcLangParser.Constant, 0); }
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); 
			match(LeftParen);
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constant) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(263); 
			match(RightParen);
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

	public static class StreamDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public StreamBodyContext streamBody() {
			return getRuleContext(StreamBodyContext.class,0);
		}
		public TerminalNode InputStream() { return getToken(SvcLangParser.InputStream, 0); }
		public TerminalNode OutputStream() { return getToken(SvcLangParser.OutputStream, 0); }
		public StreamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterStreamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitStreamDef(this);
		}
	}

	public final StreamDefContext streamDef() throws RecognitionException {
		StreamDefContext _localctx = new StreamDefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_streamDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==InputStream || _la==OutputStream) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(266); 
			match(Identifier);
			setState(267); 
			streamBody();
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

	public static class StreamBodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SvcLangParser.LeftBrace, 0); }
		public StreamElementsContext streamElements() {
			return getRuleContext(StreamElementsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SvcLangParser.RightBrace, 0); }
		public StreamBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterStreamBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitStreamBody(this);
		}
	}

	public final StreamBodyContext streamBody() throws RecognitionException {
		StreamBodyContext _localctx = new StreamBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_streamBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); 
			match(LeftBrace);
			setState(270); 
			streamElements();
			setState(271); 
			match(RightBrace);
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

	public static class StreamElementsContext extends ParserRuleContext {
		public List<StreamElementContext> streamElement() {
			return getRuleContexts(StreamElementContext.class);
		}
		public StreamElementContext streamElement(int i) {
			return getRuleContext(StreamElementContext.class,i);
		}
		public StreamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterStreamElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitStreamElements(this);
		}
	}

	public final StreamElementsContext streamElements() throws RecognitionException {
		StreamElementsContext _localctx = new StreamElementsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_streamElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Messages) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(273); 
				streamElement();
				}
				}
				setState(278);
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

	public static class StreamElementContext extends ParserRuleContext {
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public SettingContext setting() {
			return getRuleContext(SettingContext.class,0);
		}
		public TerminalNode Messages() { return getToken(SvcLangParser.Messages, 0); }
		public MessageSelectionsContext messageSelections() {
			return getRuleContext(MessageSelectionsContext.class,0);
		}
		public StreamElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterStreamElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitStreamElement(this);
		}
	}

	public final StreamElementContext streamElement() throws RecognitionException {
		StreamElementContext _localctx = new StreamElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_streamElement);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case LineDoc:
			case BlockDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); 
				documentation();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); 
				setting();
				}
				break;
			case Messages:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); 
				match(Messages);
				setState(282); 
				messageSelections();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MessageSelectionsContext extends ParserRuleContext {
		public List<MessageSelectionContext> messageSelection() {
			return getRuleContexts(MessageSelectionContext.class);
		}
		public MessageSelectionContext messageSelection(int i) {
			return getRuleContext(MessageSelectionContext.class,i);
		}
		public MessageSelectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageSelections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageSelections(this);
		}
	}

	public final MessageSelectionsContext messageSelections() throws RecognitionException {
		MessageSelectionsContext _localctx = new MessageSelectionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_messageSelections);
		int _la;
		try {
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); 
				messageSelection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); 
				messageSelection();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(287); 
					match(Comma);
					setState(288); 
					messageSelection();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class MessageSelectionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public MessageSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageSelection(this);
		}
	}

	public final MessageSelectionContext messageSelection() throws RecognitionException {
		MessageSelectionContext _localctx = new MessageSelectionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_messageSelection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); 
			match(Identifier);
			setState(298);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(297); 
				match(Star);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\5"+
		"\2T\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7y\n\7\3\b\3\b\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\f"+
		"\7\f\u0092\n\f\f\f\16\f\u0095\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\17\5\17\u00a5\n\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\7\25\u00b8\n\25\f\25\16\25\u00bb\13\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00c1\n\26\3\27\3\27\3\27\5\27\u00c6\n\27\3\27\5\27\u00c9\n\27\3\30\3"+
		"\30\3\30\5\30\u00ce\n\30\3\31\3\31\3\31\3\31\5\31\u00d4\n\31\3\32\3\32"+
		"\3\32\3\32\7\32\u00da\n\32\f\32\16\32\u00dd\13\32\5\32\u00df\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u00e6\n\33\f\33\16\33\u00e9\13\33\3\33\3\33"+
		"\3\33\5\33\u00ee\n\33\3\34\3\34\3\34\3\34\7\34\u00f4\n\34\f\34\16\34\u00f7"+
		"\13\34\5\34\u00f9\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\5\37\u0106\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\7"+
		"#\u0115\n#\f#\16#\u0118\13#\3$\3$\3$\3$\5$\u011e\n$\3%\3%\3%\3%\7%\u0124"+
		"\n%\f%\16%\u0127\13%\5%\u0129\n%\3&\3&\5&\u012d\n&\3&\2\2\'\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2\""+
		"#\3\2((\4\2\22\22\24\24\3\2\17\20\u0136\2S\3\2\2\2\4W\3\2\2\2\6_\3\2\2"+
		"\2\ba\3\2\2\2\nl\3\2\2\2\fx\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22\u0081\3"+
		"\2\2\2\24\u0084\3\2\2\2\26\u0088\3\2\2\2\30\u0096\3\2\2\2\32\u0099\3\2"+
		"\2\2\34\u009c\3\2\2\2\36\u00a6\3\2\2\2 \u00a9\3\2\2\2\"\u00ac\3\2\2\2"+
		"$\u00af\3\2\2\2&\u00b2\3\2\2\2(\u00b9\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3"+
		"\2\2\2.\u00ca\3\2\2\2\60\u00cf\3\2\2\2\62\u00de\3\2\2\2\64\u00ed\3\2\2"+
		"\2\66\u00f8\3\2\2\28\u00fa\3\2\2\2:\u00ff\3\2\2\2<\u0103\3\2\2\2>\u0107"+
		"\3\2\2\2@\u010b\3\2\2\2B\u010f\3\2\2\2D\u0116\3\2\2\2F\u011d\3\2\2\2H"+
		"\u0128\3\2\2\2J\u012a\3\2\2\2LT\5\4\3\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SL\3\2\2\2SP\3\2\2\2TU\3\2\2\2"+
		"UV\7\2\2\3V\3\3\2\2\2WX\5\b\5\2XY\5\n\6\2Y\5\3\2\2\2Z`\5\24\13\2[`\5\26"+
		"\f\2\\`\5\30\r\2]`\5\32\16\2^`\5\22\n\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2"+
		"_]\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\7\5\2\2bc\7\22\2\2c\t\3\2\2\2dm\5\f"+
		"\7\2ei\5\f\7\2fh\5\f\7\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2ld\3\2\2\2le\3\2\2\2m\13\3\2\2\2ny\5\20\t\2oy\5\16\b\2p"+
		"y\5\22\n\2qy\5\24\13\2ry\5\26\f\2sy\5\30\r\2ty\5\32\16\2uy\5\60\31\2v"+
		"y\5<\37\2wy\5@!\2xn\3\2\2\2xo\3\2\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs"+
		"\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\r\3\2\2\2z{\t\2\2\2"+
		"{\17\3\2\2\2|\177\7\22\2\2}\u0080\7\24\2\2~\u0080\n\3\2\2\177}\3\2\2\2"+
		"\177~\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\7\7\2\2\u0082\u0083\5\34\17"+
		"\2\u0083\23\3\2\2\2\u0084\u0085\7\b\2\2\u0085\u0086\5\34\17\2\u0086\u0087"+
		"\5 \21\2\u0087\25\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008d\5\34\17\2\u008a"+
		"\u008c\5\"\22\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0093\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\5$\23\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\7\13\2\2\u0097\u0098\5\34\17\2\u0098\31\3\2\2\2\u0099\u009a\7\n\2\2\u009a"+
		"\u009b\5\34\17\2\u009b\33\3\2\2\2\u009c\u00a0\7\22\2\2\u009d\u009f\5\36"+
		"\20\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5&"+
		"\24\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a7"+
		"\7\6\2\2\u00a7\u00a8\5\62\32\2\u00a8\37\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa"+
		"\u00ab\5\34\17\2\u00ab!\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5\34\17"+
		"\2\u00ae#\3\2\2\2\u00af\u00b0\7\r\2\2\u00b0\u00b1\5\34\17\2\u00b1%\3\2"+
		"\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\7\34\2\2\u00b5"+
		"\'\3\2\2\2\u00b6\u00b8\5*\26\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba)\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bc\u00c1\5\16\b\2\u00bd\u00c1\5,\27\2\u00be\u00c1\5.\30\2\u00bf"+
		"\u00c1\5\60\31\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00bf\3\2\2\2\u00c1+\3\2\2\2\u00c2\u00c3\7\22\2\2\u00c3\u00c5"+
		"\5\64\33\2\u00c4\u00c6\5> \2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9-\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cd\7\25\2\2\u00cc"+
		"\u00ce\5\16\b\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce/\3\2\2\2"+
		"\u00cf\u00d0\7\22\2\2\u00d0\u00d1\7\26\2\2\u00d1\u00d3\5\64\33\2\u00d2"+
		"\u00d4\5\16\b\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\61\3\2\2"+
		"\2\u00d5\u00df\7\22\2\2\u00d6\u00db\7\22\2\2\u00d7\u00d8\7 \2\2\u00d8"+
		"\u00da\7\22\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00df\63\3\2\2\2\u00e0\u00e7\7\3\2"+
		"\2\u00e1\u00e2\7\31\2\2\u00e2\u00e3\5\64\33\2\u00e3\u00e4\7\32\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ee\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ee\7\22\2\2\u00eb\u00ee\58\35\2\u00ec\u00ee\5:\36\2\u00ed\u00e0\3"+
		"\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\65\3\2\2\2\u00ef\u00f9\5\64\33\2\u00f0\u00f5\5\64\33\2\u00f1\u00f2\7"+
		" \2\2\u00f2\u00f4\5\64\33\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f9\67\3\2\2\2\u00fa\u00fb"+
		"\7)\2\2\u00fb\u00fc\7\31\2\2\u00fc\u00fd\5\62\32\2\u00fd\u00fe\7\32\2"+
		"\2\u00fe9\3\2\2\2\u00ff\u0100\7\31\2\2\u0100\u0101\5\66\34\2\u0101\u0102"+
		"\7\32\2\2\u0102;\3\2\2\2\u0103\u0105\7!\2\2\u0104\u0106\5\16\b\2\u0105"+
		"\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106=\3\2\2\2\u0107\u0108\7\27\2\2"+
		"\u0108\u0109\t\4\2\2\u0109\u010a\7\30\2\2\u010a?\3\2\2\2\u010b\u010c\t"+
		"\5\2\2\u010c\u010d\7\22\2\2\u010d\u010e\5B\"\2\u010eA\3\2\2\2\u010f\u0110"+
		"\7\33\2\2\u0110\u0111\5D#\2\u0111\u0112\7\34\2\2\u0112C\3\2\2\2\u0113"+
		"\u0115\5F$\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117E\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011e"+
		"\5\16\b\2\u011a\u011e\5\20\t\2\u011b\u011c\7\21\2\2\u011c\u011e\5H%\2"+
		"\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011eG\3"+
		"\2\2\2\u011f\u0129\5J&\2\u0120\u0125\5J&\2\u0121\u0122\7 \2\2\u0122\u0124"+
		"\5J&\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u011f\3\2"+
		"\2\2\u0128\u0120\3\2\2\2\u0129I\3\2\2\2\u012a\u012c\7\22\2\2\u012b\u012d"+
		"\7\36\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012dK\3\2\2\2\37PS"+
		"_ilx\177\u008d\u0093\u00a0\u00a4\u00b9\u00c0\u00c5\u00c8\u00cd\u00d3\u00db"+
		"\u00de\u00e7\u00ed\u00f5\u00f8\u0105\u0116\u011d\u0125\u0128\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}