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
		T__0=1, PrimitiveType=2, Enumeration=3, Service=4, Extends=5, PartialMessage=6, 
		Query=7, Command=8, Event=9, Document=10, Emits=11, FailsWith=12, RespondsWith=13, 
		InputStream=14, OutputStream=15, Messages=16, Identifier=17, Constant=18, 
		StringLiteral=19, Colon=20, Arrow=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, Quote=28, Star=29, DoubleDash=30, 
		Comma=31, Section=32, LineDoc=33, BlockDoc=34, Whitespace=35, Newline=36, 
		BlockComment=37, LineComment=38;
	public static final int
		RULE_sourceFile = 0, RULE_service = 1, RULE_messageList = 2, RULE_message = 3, 
		RULE_serviceDeclr = 4, RULE_specList = 5, RULE_spec = 6, RULE_documentation = 7, 
		RULE_setting = 8, RULE_partialMessage = 9, RULE_query = 10, RULE_command = 11, 
		RULE_document = 12, RULE_event = 13, RULE_messageDef = 14, RULE_messageRef = 15, 
		RULE_messageExtensions = 16, RULE_queryResponse = 17, RULE_emits = 18, 
		RULE_failsWith = 19, RULE_messageBody = 20, RULE_messageElements = 21, 
		RULE_messageElement = 22, RULE_fieldSpec = 23, RULE_requiredFieldsSection = 24, 
		RULE_messageSection = 25, RULE_typeAlias = 26, RULE_identifierList = 27, 
		RULE_typeSpec = 28, RULE_typeSpecList = 29, RULE_enumeration = 30, RULE_union = 31, 
		RULE_serviceSection = 32, RULE_defaultValue = 33, RULE_streamDef = 34, 
		RULE_streamBody = 35, RULE_streamElements = 36, RULE_streamElement = 37, 
		RULE_messageSelections = 38, RULE_messageSelection = 39;
	public static final String[] ruleNames = {
		"sourceFile", "service", "messageList", "message", "serviceDeclr", "specList", 
		"spec", "documentation", "setting", "partialMessage", "query", "command", 
		"document", "event", "messageDef", "messageRef", "messageExtensions", 
		"queryResponse", "emits", "failsWith", "messageBody", "messageElements", 
		"messageElement", "fieldSpec", "requiredFieldsSection", "messageSection", 
		"typeAlias", "identifierList", "typeSpec", "typeSpecList", "enumeration", 
		"union", "serviceSection", "defaultValue", "streamDef", "streamBody", 
		"streamElements", "streamElement", "messageSelections", "messageSelection"
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
		public MessageListContext messageList() {
			return getRuleContext(MessageListContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			switch (_input.LA(1)) {
			case Service:
				{
				setState(80); 
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
				setState(81); 
				messageList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84); 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			serviceDeclr();
			setState(88);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				setState(87); 
				specList();
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

	public static class MessageListContext extends ParserRuleContext {
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public MessageListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageList(this);
		}
	}

	public final MessageListContext messageList() throws RecognitionException {
		MessageListContext _localctx = new MessageListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_messageList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document))) != 0)) {
				{
				{
				setState(90); 
				message();
				}
				}
				setState(95);
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
		enterRule(_localctx, 6, RULE_message);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case Query:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); 
				query();
				}
				break;
			case Command:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); 
				command();
				}
				break;
			case Document:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); 
				document();
				}
				break;
			case Event:
				enterOuterAlt(_localctx, 4);
				{
				setState(99); 
				event();
				}
				break;
			case PartialMessage:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); 
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
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_serviceDeclr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			match(Service);
			setState(104); 
			match(Identifier);
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(105); 
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
		enterRule(_localctx, 10, RULE_specList);
		int _la;
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); 
				spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); 
				spec();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
					{
					{
					setState(110); 
					spec();
					}
					}
					setState(115);
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
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
		enterRule(_localctx, 12, RULE_spec);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); 
				setting();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); 
				documentation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); 
				partialMessage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121); 
				document();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); 
				event();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123); 
				command();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124); 
				query();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125); 
				typeAlias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126); 
				serviceSection();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(127); 
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
		enterRule(_localctx, 14, RULE_documentation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		enterRule(_localctx, 16, RULE_setting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			match(Identifier);
			setState(133); 
			match(Constant);
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
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
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
		enterRule(_localctx, 18, RULE_partialMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			match(PartialMessage);
			setState(136); 
			messageDef();
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(137); 
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode Query() { return getToken(SvcLangParser.Query, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public TerminalNode RespondsWith() { return getToken(SvcLangParser.RespondsWith, 0); }
		public QueryResponseContext queryResponse() {
			return getRuleContext(QueryResponseContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
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
		enterRule(_localctx, 20, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			match(Query);
			setState(141); 
			messageDef();
			setState(142); 
			match(RespondsWith);
			setState(143); 
			queryResponse();
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(144); 
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Command() { return getToken(SvcLangParser.Command, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public List<TerminalNode> Emits() { return getTokens(SvcLangParser.Emits); }
		public TerminalNode Emits(int i) {
			return getToken(SvcLangParser.Emits, i);
		}
		public List<EmitsContext> emits() {
			return getRuleContexts(EmitsContext.class);
		}
		public EmitsContext emits(int i) {
			return getRuleContext(EmitsContext.class,i);
		}
		public List<TerminalNode> FailsWith() { return getTokens(SvcLangParser.FailsWith); }
		public TerminalNode FailsWith(int i) {
			return getToken(SvcLangParser.FailsWith, i);
		}
		public List<FailsWithContext> failsWith() {
			return getRuleContexts(FailsWithContext.class);
		}
		public FailsWithContext failsWith(int i) {
			return getRuleContext(FailsWithContext.class,i);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
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
		enterRule(_localctx, 22, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			match(Command);
			setState(148); 
			messageDef();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Emits) {
				{
				{
				setState(149); 
				match(Emits);
				setState(150); 
				emits();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FailsWith) {
				{
				{
				setState(156); 
				match(FailsWith);
				setState(157); 
				failsWith();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(163); 
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

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode Document() { return getToken(SvcLangParser.Document, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
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
		enterRule(_localctx, 24, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			match(Document);
			setState(167); 
			messageDef();
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(168); 
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode Event() { return getToken(SvcLangParser.Event, 0); }
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
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
		enterRule(_localctx, 26, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			match(Event);
			setState(172); 
			messageDef();
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(173); 
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
		enterRule(_localctx, 28, RULE_messageDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			match(Identifier);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Extends) {
				{
				{
				setState(177); 
				messageExtensions();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(183); 
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

	public static class MessageRefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public MessageRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageRef(this);
		}
	}

	public final MessageRefContext messageRef() throws RecognitionException {
		MessageRefContext _localctx = new MessageRefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_messageRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
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
		enterRule(_localctx, 32, RULE_messageExtensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			match(Extends);
			setState(189); 
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
		public QueryResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryResponse; }
	 
		public QueryResponseContext() { }
		public void copyFrom(QueryResponseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResponseRefContext extends QueryResponseContext {
		public MessageRefContext messageRef() {
			return getRuleContext(MessageRefContext.class,0);
		}
		public ResponseRefContext(QueryResponseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterResponseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitResponseRef(this);
		}
	}
	public static class ResponseDefContext extends QueryResponseContext {
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public ResponseDefContext(QueryResponseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterResponseDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitResponseDef(this);
		}
	}

	public final QueryResponseContext queryResponse() throws RecognitionException {
		QueryResponseContext _localctx = new QueryResponseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_queryResponse);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ResponseRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new ResponseDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192); 
				messageDef();
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

	public static class EmitsContext extends ParserRuleContext {
		public EmitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emits; }
	 
		public EmitsContext() { }
		public void copyFrom(EmitsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmitsDefContext extends EmitsContext {
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public EmitsDefContext(EmitsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterEmitsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitEmitsDef(this);
		}
	}
	public static class EmitsRefContext extends EmitsContext {
		public MessageRefContext messageRef() {
			return getRuleContext(MessageRefContext.class,0);
		}
		public EmitsRefContext(EmitsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterEmitsRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitEmitsRef(this);
		}
	}

	public final EmitsContext emits() throws RecognitionException {
		EmitsContext _localctx = new EmitsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_emits);
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new EmitsRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new EmitsDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196); 
				messageDef();
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

	public static class FailsWithContext extends ParserRuleContext {
		public MessageRefContext messageRef() {
			return getRuleContext(MessageRefContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_failsWith);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); 
				messageRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); 
				messageDef();
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
		enterRule(_localctx, 40, RULE_messageBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			match(LeftBrace);
			setState(204); 
			messageElements();
			setState(205); 
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
		enterRule(_localctx, 42, RULE_messageElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(207); 
				messageElement();
				}
				}
				setState(212);
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
		public RequiredFieldsSectionContext requiredFieldsSection() {
			return getRuleContext(RequiredFieldsSectionContext.class,0);
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
		enterRule(_localctx, 44, RULE_messageElement);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); 
				documentation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); 
				fieldSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); 
				requiredFieldsSection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); 
				messageSection();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217); 
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
		public TerminalNode Star() { return getToken(SvcLangParser.Star, 0); }
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
		enterRule(_localctx, 46, RULE_fieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			match(Identifier);
			setState(222);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(221); 
				match(Star);
				}
			}

			setState(224); 
			typeSpec();
			setState(226);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(225); 
				defaultValue();
				}
			}

			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(228); 
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

	public static class RequiredFieldsSectionContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(SvcLangParser.Colon, 0); }
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public RequiredFieldsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredFieldsSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterRequiredFieldsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitRequiredFieldsSection(this);
		}
	}

	public final RequiredFieldsSectionContext requiredFieldsSection() throws RecognitionException {
		RequiredFieldsSectionContext _localctx = new RequiredFieldsSectionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_requiredFieldsSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			match(T__0);
			setState(232); 
			match(Colon);
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(233); 
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
		enterRule(_localctx, 50, RULE_messageSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); 
			match(Identifier);
			setState(237); 
			match(Colon);
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(238); 
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
		enterRule(_localctx, 52, RULE_typeAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			match(Identifier);
			setState(242); 
			match(Arrow);
			setState(243); 
			typeSpec();
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(244); 
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
		enterRule(_localctx, 54, RULE_identifierList);
		int _la;
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); 
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); 
				match(Identifier);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(249); 
					match(Comma);
					setState(250); 
					match(Identifier);
					}
					}
					setState(255);
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
		public TerminalNode LeftBracket() { return getToken(SvcLangParser.LeftBracket, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SvcLangParser.RightBracket, 0); }
		public MessageRefContext messageRef() {
			return getRuleContext(MessageRefContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_typeSpec);
		int _la;
		try {
			setState(268);
			switch (_input.LA(1)) {
			case PrimitiveType:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); 
				match(PrimitiveType);
				setState(263);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(259); 
					match(LeftBracket);
					setState(260); 
					typeSpec();
					setState(261); 
					match(RightBracket);
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); 
				messageRef();
				}
				break;
			case Enumeration:
				enterOuterAlt(_localctx, 3);
				{
				setState(266); 
				enumeration();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); 
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
		enterRule(_localctx, 58, RULE_typeSpecList);
		int _la;
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); 
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); 
				typeSpec();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(272); 
					match(Comma);
					setState(273); 
					typeSpec();
					}
					}
					setState(278);
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
		enterRule(_localctx, 60, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			match(Enumeration);
			setState(282); 
			match(LeftBracket);
			setState(283); 
			identifierList();
			setState(284); 
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
		enterRule(_localctx, 62, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); 
			match(LeftBracket);
			setState(287); 
			typeSpecList();
			setState(288); 
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
		enterRule(_localctx, 64, RULE_serviceSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); 
			match(Section);
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(291); 
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
		enterRule(_localctx, 66, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); 
			match(LeftParen);
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constant) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(296); 
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
		enterRule(_localctx, 68, RULE_streamDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==InputStream || _la==OutputStream) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(299); 
			match(Identifier);
			setState(300); 
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
		enterRule(_localctx, 70, RULE_streamBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); 
			match(LeftBrace);
			setState(303); 
			streamElements();
			setState(304); 
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
		enterRule(_localctx, 72, RULE_streamElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Messages) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(306); 
				streamElement();
				}
				}
				setState(311);
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
		enterRule(_localctx, 74, RULE_streamElement);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case LineDoc:
			case BlockDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); 
				documentation();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); 
				setting();
				}
				break;
			case Messages:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); 
				match(Messages);
				setState(315); 
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
		enterRule(_localctx, 76, RULE_messageSelections);
		int _la;
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); 
				messageSelection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); 
				messageSelection();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(320); 
					match(Comma);
					setState(321); 
					messageSelection();
					}
					}
					setState(326);
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
		enterRule(_localctx, 78, RULE_messageSelection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			match(Identifier);
			setState(331);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(330); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\5\2U\n"+
		"\2\3\2\3\2\3\3\3\3\5\3[\n\3\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5h\n\5\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\7\7r\n\7\f\7\16\7u\13"+
		"\7\5\7w\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0094\n\f\3\r\3\r\3\r\3\r\7\r\u009a\n\r\f\r\16\r\u009d\13\r\3\r\3\r"+
		"\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\5"+
		"\16\u00ac\n\16\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\7\20\u00b5\n\20"+
		"\f\20\16\20\u00b8\13\20\3\20\5\20\u00bb\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u00c4\n\23\3\24\3\24\5\24\u00c8\n\24\3\25\3\25\5\25\u00cc"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\7\27\u00d3\n\27\f\27\16\27\u00d6\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00dd\n\30\3\31\3\31\5\31\u00e1\n\31\3"+
		"\31\3\31\5\31\u00e5\n\31\3\31\5\31\u00e8\n\31\3\32\3\32\3\32\5\32\u00ed"+
		"\n\32\3\33\3\33\3\33\5\33\u00f2\n\33\3\34\3\34\3\34\3\34\5\34\u00f8\n"+
		"\34\3\35\3\35\3\35\3\35\7\35\u00fe\n\35\f\35\16\35\u0101\13\35\5\35\u0103"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u010a\n\36\3\36\3\36\3\36\5\36\u010f"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u0115\n\37\f\37\16\37\u0118\13\37\5\37"+
		"\u011a\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\5\"\u0127\n\"\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\7&\u0136\n&\f&\16&\u0139\13&\3\'\3\'\3"+
		"\'\3\'\5\'\u013f\n\'\3(\3(\3(\3(\7(\u0145\n(\f(\16(\u0148\13(\5(\u014a"+
		"\n(\3)\3)\5)\u014e\n)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\5\3\2#$\3\2\23\24\3\2\20\21\u0160"+
		"\2T\3\2\2\2\4X\3\2\2\2\6_\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\fv\3\2\2\2\16"+
		"\u0082\3\2\2\2\20\u0084\3\2\2\2\22\u0086\3\2\2\2\24\u0089\3\2\2\2\26\u008e"+
		"\3\2\2\2\30\u0095\3\2\2\2\32\u00a8\3\2\2\2\34\u00ad\3\2\2\2\36\u00b2\3"+
		"\2\2\2 \u00bc\3\2\2\2\"\u00be\3\2\2\2$\u00c3\3\2\2\2&\u00c7\3\2\2\2(\u00cb"+
		"\3\2\2\2*\u00cd\3\2\2\2,\u00d4\3\2\2\2.\u00dc\3\2\2\2\60\u00de\3\2\2\2"+
		"\62\u00e9\3\2\2\2\64\u00ee\3\2\2\2\66\u00f3\3\2\2\28\u0102\3\2\2\2:\u010e"+
		"\3\2\2\2<\u0119\3\2\2\2>\u011b\3\2\2\2@\u0120\3\2\2\2B\u0124\3\2\2\2D"+
		"\u0128\3\2\2\2F\u012c\3\2\2\2H\u0130\3\2\2\2J\u0137\3\2\2\2L\u013e\3\2"+
		"\2\2N\u0149\3\2\2\2P\u014b\3\2\2\2RU\5\4\3\2SU\5\6\4\2TR\3\2\2\2TS\3\2"+
		"\2\2UV\3\2\2\2VW\7\2\2\3W\3\3\2\2\2XZ\5\n\6\2Y[\5\f\7\2ZY\3\2\2\2Z[\3"+
		"\2\2\2[\5\3\2\2\2\\^\5\b\5\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
		"`\7\3\2\2\2a_\3\2\2\2bh\5\26\f\2ch\5\30\r\2dh\5\32\16\2eh\5\34\17\2fh"+
		"\5\24\13\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\t\3\2\2"+
		"\2ij\7\6\2\2jl\7\23\2\2km\5\20\t\2lk\3\2\2\2lm\3\2\2\2m\13\3\2\2\2nw\5"+
		"\16\b\2os\5\16\b\2pr\5\16\b\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vo\3\2\2\2w\r\3\2\2\2x\u0083\5\22\n\2y\u0083"+
		"\5\20\t\2z\u0083\5\24\13\2{\u0083\5\32\16\2|\u0083\5\34\17\2}\u0083\5"+
		"\30\r\2~\u0083\5\26\f\2\177\u0083\5\66\34\2\u0080\u0083\5B\"\2\u0081\u0083"+
		"\5F$\2\u0082x\3\2\2\2\u0082y\3\2\2\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082"+
		"|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\t\2\2\2\u0085"+
		"\21\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\7\24\2\2\u0088\23\3\2\2\2"+
		"\u0089\u008a\7\b\2\2\u008a\u008c\5\36\20\2\u008b\u008d\5\20\t\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\25\3\2\2\2\u008e\u008f\7\t\2"+
		"\2\u008f\u0090\5\36\20\2\u0090\u0091\7\17\2\2\u0091\u0093\5$\23\2\u0092"+
		"\u0094\5\20\t\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2"+
		"\2\u0095\u0096\7\n\2\2\u0096\u009b\5\36\20\2\u0097\u0098\7\r\2\2\u0098"+
		"\u009a\5&\24\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u00a2\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\16\2\2\u009f\u00a1\5(\25\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00ab\5\36\20\2\u00aa"+
		"\u00ac\5\20\t\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\7\13\2\2\u00ae\u00b0\5\36\20\2\u00af\u00b1\5\20\t\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b6\7\23\2"+
		"\2\u00b3\u00b5\5\"\22\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bb\5*\26\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf"+
		"\u00c0\58\35\2\u00c0#\3\2\2\2\u00c1\u00c4\5 \21\2\u00c2\u00c4\5\36\20"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c8"+
		"\5 \21\2\u00c6\u00c8\5\36\20\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\'\3\2\2\2\u00c9\u00cc\5 \21\2\u00ca\u00cc\5\36\20\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00ce\7\34\2\2\u00ce"+
		"\u00cf\5,\27\2\u00cf\u00d0\7\35\2\2\u00d0+\3\2\2\2\u00d1\u00d3\5.\30\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5-\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dd\5\20\t\2\u00d8"+
		"\u00dd\5\60\31\2\u00d9\u00dd\5\62\32\2\u00da\u00dd\5\64\33\2\u00db\u00dd"+
		"\5\66\34\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd/\3\2\2\2\u00de\u00e0\7"+
		"\23\2\2\u00df\u00e1\7\37\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\5:\36\2\u00e3\u00e5\5D#\2\u00e4\u00e3\3\2\2"+
		"\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\5\20\t\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\61\3\2\2\2\u00e9\u00ea\7\3\2"+
		"\2\u00ea\u00ec\7\26\2\2\u00eb\u00ed\5\20\t\2\u00ec\u00eb\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f1\7\26"+
		"\2\2\u00f0\u00f2\5\20\t\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\65\3\2\2\2\u00f3\u00f4\7\23\2\2\u00f4\u00f5\7\27\2\2\u00f5\u00f7\5:\36"+
		"\2\u00f6\u00f8\5\20\t\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\67\3\2\2\2\u00f9\u0103\7\23\2\2\u00fa\u00ff\7\23\2\2\u00fb\u00fc\7!\2"+
		"\2\u00fc\u00fe\7\23\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2\2\2\u01039\3\2\2\2\u0104\u0109"+
		"\7\4\2\2\u0105\u0106\7\32\2\2\u0106\u0107\5:\36\2\u0107\u0108\7\33\2\2"+
		"\u0108\u010a\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010f"+
		"\3\2\2\2\u010b\u010f\5 \21\2\u010c\u010f\5> \2\u010d\u010f\5@!\2\u010e"+
		"\u0104\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2"+
		"\2\2\u010f;\3\2\2\2\u0110\u011a\5:\36\2\u0111\u0116\5:\36\2\u0112\u0113"+
		"\7!\2\2\u0113\u0115\5:\36\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0119\u0110\3\2\2\2\u0119\u0111\3\2\2\2\u011a=\3\2\2\2\u011b\u011c"+
		"\7\5\2\2\u011c\u011d\7\32\2\2\u011d\u011e\58\35\2\u011e\u011f\7\33\2\2"+
		"\u011f?\3\2\2\2\u0120\u0121\7\32\2\2\u0121\u0122\5<\37\2\u0122\u0123\7"+
		"\33\2\2\u0123A\3\2\2\2\u0124\u0126\7\"\2\2\u0125\u0127\5\20\t\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127C\3\2\2\2\u0128\u0129\7\30\2\2"+
		"\u0129\u012a\t\3\2\2\u012a\u012b\7\31\2\2\u012bE\3\2\2\2\u012c\u012d\t"+
		"\4\2\2\u012d\u012e\7\23\2\2\u012e\u012f\5H%\2\u012fG\3\2\2\2\u0130\u0131"+
		"\7\34\2\2\u0131\u0132\5J&\2\u0132\u0133\7\35\2\2\u0133I\3\2\2\2\u0134"+
		"\u0136\5L\'\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138K\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013f"+
		"\5\20\t\2\u013b\u013f\5\22\n\2\u013c\u013d\7\22\2\2\u013d\u013f\5N(\2"+
		"\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013fM\3"+
		"\2\2\2\u0140\u014a\5P)\2\u0141\u0146\5P)\2\u0142\u0143\7!\2\2\u0143\u0145"+
		"\5P)\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u0140\3\2"+
		"\2\2\u0149\u0141\3\2\2\2\u014aO\3\2\2\2\u014b\u014d\7\23\2\2\u014c\u014e"+
		"\7\37\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014eQ\3\2\2\2*TZ_g"+
		"lsv\u0082\u008c\u0093\u009b\u00a2\u00a6\u00ab\u00b0\u00b6\u00ba\u00c3"+
		"\u00c7\u00cb\u00d4\u00dc\u00e0\u00e4\u00e7\u00ec\u00f1\u00f7\u00ff\u0102"+
		"\u0109\u010e\u0116\u0119\u0126\u0137\u013e\u0146\u0149\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}