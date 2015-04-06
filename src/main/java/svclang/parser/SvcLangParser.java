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
		RULE_serviceSection = 32, RULE_defaultValue = 33, RULE_inputStreamDef = 34, 
		RULE_outputStreamDef = 35, RULE_streamBody = 36, RULE_streamElements = 37, 
		RULE_streamElement = 38, RULE_messageSelections = 39, RULE_messageSelection = 40;
	public static final String[] ruleNames = {
		"sourceFile", "service", "messageList", "message", "serviceDeclr", "specList", 
		"spec", "documentation", "setting", "partialMessage", "query", "command", 
		"document", "event", "messageDef", "messageRef", "messageExtensions", 
		"queryResponse", "emits", "failsWith", "messageBody", "messageElements", 
		"messageElement", "fieldSpec", "requiredFieldsSection", "messageSection", 
		"typeAlias", "identifierList", "typeSpec", "typeSpecList", "enumeration", 
		"union", "serviceSection", "defaultValue", "inputStreamDef", "outputStreamDef", 
		"streamBody", "streamElements", "streamElement", "messageSelections", 
		"messageSelection"
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
			setState(84);
			switch (_input.LA(1)) {
			case Service:
				{
				setState(82); 
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
				setState(83); 
				messageList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86); 
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
			setState(88); 
			serviceDeclr();
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				setState(89); 
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document))) != 0)) {
				{
				{
				setState(92); 
				message();
				}
				}
				setState(97);
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
			setState(103);
			switch (_input.LA(1)) {
			case Query:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				query();
				}
				break;
			case Command:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); 
				command();
				}
				break;
			case Document:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); 
				document();
				}
				break;
			case Event:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); 
				event();
				}
				break;
			case PartialMessage:
				enterOuterAlt(_localctx, 5);
				{
				setState(102); 
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
			setState(105); 
			match(Service);
			setState(106); 
			match(Identifier);
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(107); 
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
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); 
				spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); 
				spec();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
					{
					{
					setState(112); 
					spec();
					}
					}
					setState(117);
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
		public InputStreamDefContext inputStreamDef() {
			return getRuleContext(InputStreamDefContext.class,0);
		}
		public OutputStreamDefContext outputStreamDef() {
			return getRuleContext(OutputStreamDefContext.class,0);
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
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); 
				setting();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); 
				documentation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); 
				partialMessage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123); 
				document();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); 
				event();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125); 
				command();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126); 
				query();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127); 
				typeAlias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128); 
				serviceSection();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(129); 
				inputStreamDef();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(130); 
				outputStreamDef();
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
			setState(133);
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
			setState(135); 
			match(Identifier);
			setState(136); 
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
			setState(138); 
			match(PartialMessage);
			setState(139); 
			messageDef();
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(140); 
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
			setState(143); 
			match(Query);
			setState(144); 
			messageDef();
			setState(145); 
			match(RespondsWith);
			setState(146); 
			queryResponse();
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(147); 
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
			setState(150); 
			match(Command);
			setState(151); 
			messageDef();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Emits) {
				{
				{
				setState(152); 
				match(Emits);
				setState(153); 
				emits();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FailsWith) {
				{
				{
				setState(159); 
				match(FailsWith);
				setState(160); 
				failsWith();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(166); 
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
			setState(169); 
			match(Document);
			setState(170); 
			messageDef();
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(171); 
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
			setState(174); 
			match(Event);
			setState(175); 
			messageDef();
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(176); 
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
			setState(179); 
			match(Identifier);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Extends) {
				{
				{
				setState(180); 
				messageExtensions();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(186); 
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
			setState(189); 
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
			setState(191); 
			match(Extends);
			setState(192); 
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
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ResponseRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new ResponseDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195); 
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
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new EmitsRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new EmitsDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199); 
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
		public FailsWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failsWith; }
	 
		public FailsWithContext() { }
		public void copyFrom(FailsWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FailsWithRefContext extends FailsWithContext {
		public MessageRefContext messageRef() {
			return getRuleContext(MessageRefContext.class,0);
		}
		public FailsWithRefContext(FailsWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterFailsWithRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitFailsWithRef(this);
		}
	}
	public static class FailsWithDefContext extends FailsWithContext {
		public MessageDefContext messageDef() {
			return getRuleContext(MessageDefContext.class,0);
		}
		public FailsWithDefContext(FailsWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterFailsWithDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitFailsWithDef(this);
		}
	}

	public final FailsWithContext failsWith() throws RecognitionException {
		FailsWithContext _localctx = new FailsWithContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_failsWith);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FailsWithRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new FailsWithDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203); 
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
			setState(206); 
			match(LeftBrace);
			setState(207); 
			messageElements();
			setState(208); 
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
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(210); 
				messageElement();
				}
				}
				setState(215);
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
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); 
				documentation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); 
				fieldSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); 
				requiredFieldsSection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219); 
				messageSection();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220); 
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
			setState(223); 
			match(Identifier);
			setState(225);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(224); 
				match(Star);
				}
			}

			setState(227); 
			typeSpec();
			setState(229);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(228); 
				defaultValue();
				}
			}

			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(231); 
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
			setState(234); 
			match(T__0);
			setState(235); 
			match(Colon);
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(236); 
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
			setState(239); 
			match(Identifier);
			setState(240); 
			match(Colon);
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(241); 
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
			setState(244); 
			match(Identifier);
			setState(245); 
			match(Arrow);
			setState(246); 
			typeSpec();
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(247); 
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
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); 
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); 
				match(Identifier);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(252); 
					match(Comma);
					setState(253); 
					match(Identifier);
					}
					}
					setState(258);
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
			setState(271);
			switch (_input.LA(1)) {
			case PrimitiveType:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); 
				match(PrimitiveType);
				setState(266);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(262); 
					match(LeftBracket);
					setState(263); 
					typeSpec();
					setState(264); 
					match(RightBracket);
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); 
				messageRef();
				}
				break;
			case Enumeration:
				enterOuterAlt(_localctx, 3);
				{
				setState(269); 
				enumeration();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(270); 
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
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); 
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); 
				typeSpec();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(275); 
					match(Comma);
					setState(276); 
					typeSpec();
					}
					}
					setState(281);
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
			setState(284); 
			match(Enumeration);
			setState(285); 
			match(LeftBracket);
			setState(286); 
			identifierList();
			setState(287); 
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
			setState(289); 
			match(LeftBracket);
			setState(290); 
			typeSpecList();
			setState(291); 
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
			setState(293); 
			match(Section);
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(294); 
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
			setState(297); 
			match(LeftParen);
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constant) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(299); 
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

	public static class InputStreamDefContext extends ParserRuleContext {
		public TerminalNode InputStream() { return getToken(SvcLangParser.InputStream, 0); }
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public StreamBodyContext streamBody() {
			return getRuleContext(StreamBodyContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public InputStreamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStreamDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterInputStreamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitInputStreamDef(this);
		}
	}

	public final InputStreamDefContext inputStreamDef() throws RecognitionException {
		InputStreamDefContext _localctx = new InputStreamDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inputStreamDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); 
			match(InputStream);
			setState(302); 
			match(Identifier);
			setState(304);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(303); 
				streamBody();
				}
			}

			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(306); 
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

	public static class OutputStreamDefContext extends ParserRuleContext {
		public TerminalNode OutputStream() { return getToken(SvcLangParser.OutputStream, 0); }
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public StreamBodyContext streamBody() {
			return getRuleContext(StreamBodyContext.class,0);
		}
		public DocumentationContext documentation() {
			return getRuleContext(DocumentationContext.class,0);
		}
		public OutputStreamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStreamDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterOutputStreamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitOutputStreamDef(this);
		}
	}

	public final OutputStreamDefContext outputStreamDef() throws RecognitionException {
		OutputStreamDefContext _localctx = new OutputStreamDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_outputStreamDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); 
			match(OutputStream);
			setState(310); 
			match(Identifier);
			setState(312);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(311); 
				streamBody();
				}
			}

			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(314); 
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
		enterRule(_localctx, 72, RULE_streamBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); 
			match(LeftBrace);
			setState(318); 
			streamElements();
			setState(319); 
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
		enterRule(_localctx, 74, RULE_streamElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Messages) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(321); 
				streamElement();
				}
				}
				setState(326);
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
		enterRule(_localctx, 76, RULE_streamElement);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case LineDoc:
			case BlockDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); 
				documentation();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); 
				setting();
				}
				break;
			case Messages:
				enterOuterAlt(_localctx, 3);
				{
				setState(329); 
				match(Messages);
				setState(330); 
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
		enterRule(_localctx, 78, RULE_messageSelections);
		int _la;
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333); 
				messageSelection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334); 
				messageSelection();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(335); 
					match(Comma);
					setState(336); 
					messageSelection();
					}
					}
					setState(341);
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
		public MessageSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelection; }
	 
		public MessageSelectionContext() { }
		public void copyFrom(MessageSelectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MessageSelectionPatternContext extends MessageSelectionContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public MessageSelectionPatternContext(MessageSelectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageSelectionPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageSelectionPattern(this);
		}
	}

	public final MessageSelectionContext messageSelection() throws RecognitionException {
		MessageSelectionContext _localctx = new MessageSelectionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_messageSelection);
		int _la;
		try {
			_localctx = new MessageSelectionPatternContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(344); 
			match(Identifier);
			setState(346);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(345); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\5\2W\n\2\3\2\3\2\3\3\3\3\5\3]\n\3\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\7\7\7t\n\7\f\7\16"+
		"\7w\13\7\5\7y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u0090\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r"+
		"\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3\r\5\r\u00aa\n\r\3\16\3\16"+
		"\3\16\5\16\u00af\n\16\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\7\20\u00b8"+
		"\n\20\f\20\16\20\u00bb\13\20\3\20\5\20\u00be\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\5\24\u00cb\n\24\3\25\3\25\5"+
		"\25\u00cf\n\25\3\26\3\26\3\26\3\26\3\27\7\27\u00d6\n\27\f\27\16\27\u00d9"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u00e0\n\30\3\31\3\31\5\31\u00e4\n"+
		"\31\3\31\3\31\5\31\u00e8\n\31\3\31\5\31\u00eb\n\31\3\32\3\32\3\32\5\32"+
		"\u00f0\n\32\3\33\3\33\3\33\5\33\u00f5\n\33\3\34\3\34\3\34\3\34\5\34\u00fb"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u0101\n\35\f\35\16\35\u0104\13\35\5\35"+
		"\u0106\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u010d\n\36\3\36\3\36\3\36\5"+
		"\36\u0112\n\36\3\37\3\37\3\37\3\37\7\37\u0118\n\37\f\37\16\37\u011b\13"+
		"\37\5\37\u011d\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\5\"\u012a\n\"\3"+
		"#\3#\3#\3#\3$\3$\3$\5$\u0133\n$\3$\5$\u0136\n$\3%\3%\3%\5%\u013b\n%\3"+
		"%\5%\u013e\n%\3&\3&\3&\3&\3\'\7\'\u0145\n\'\f\'\16\'\u0148\13\'\3(\3("+
		"\3(\3(\5(\u014e\n(\3)\3)\3)\3)\7)\u0154\n)\f)\16)\u0157\13)\5)\u0159\n"+
		")\3*\3*\5*\u015d\n*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\4\3\2#$\3\2\23\24\u0173\2V\3\2\2\2"+
		"\4Z\3\2\2\2\6a\3\2\2\2\bi\3\2\2\2\nk\3\2\2\2\fx\3\2\2\2\16\u0085\3\2\2"+
		"\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u008c\3\2\2\2\26\u0091\3\2\2\2"+
		"\30\u0098\3\2\2\2\32\u00ab\3\2\2\2\34\u00b0\3\2\2\2\36\u00b5\3\2\2\2 "+
		"\u00bf\3\2\2\2\"\u00c1\3\2\2\2$\u00c6\3\2\2\2&\u00ca\3\2\2\2(\u00ce\3"+
		"\2\2\2*\u00d0\3\2\2\2,\u00d7\3\2\2\2.\u00df\3\2\2\2\60\u00e1\3\2\2\2\62"+
		"\u00ec\3\2\2\2\64\u00f1\3\2\2\2\66\u00f6\3\2\2\28\u0105\3\2\2\2:\u0111"+
		"\3\2\2\2<\u011c\3\2\2\2>\u011e\3\2\2\2@\u0123\3\2\2\2B\u0127\3\2\2\2D"+
		"\u012b\3\2\2\2F\u012f\3\2\2\2H\u0137\3\2\2\2J\u013f\3\2\2\2L\u0146\3\2"+
		"\2\2N\u014d\3\2\2\2P\u0158\3\2\2\2R\u015a\3\2\2\2TW\5\4\3\2UW\5\6\4\2"+
		"VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XY\7\2\2\3Y\3\3\2\2\2Z\\\5\n\6\2[]\5\f\7"+
		"\2\\[\3\2\2\2\\]\3\2\2\2]\5\3\2\2\2^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2dj\5\26\f\2ej\5\30\r\2fj\5\32\16"+
		"\2gj\5\34\17\2hj\5\24\13\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3"+
		"\2\2\2j\t\3\2\2\2kl\7\6\2\2ln\7\23\2\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2"+
		"o\13\3\2\2\2py\5\16\b\2qu\5\16\b\2rt\5\16\b\2sr\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xp\3\2\2\2xq\3\2\2\2y\r\3\2\2\2z\u0086"+
		"\5\22\n\2{\u0086\5\20\t\2|\u0086\5\24\13\2}\u0086\5\32\16\2~\u0086\5\34"+
		"\17\2\177\u0086\5\30\r\2\u0080\u0086\5\26\f\2\u0081\u0086\5\66\34\2\u0082"+
		"\u0086\5B\"\2\u0083\u0086\5F$\2\u0084\u0086\5H%\2\u0085z\3\2\2\2\u0085"+
		"{\3\2\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2"+
		"\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\21\3\2\2\2\u0089\u008a\7\23\2\2\u008a\u008b\7\24\2\2\u008b\23\3\2\2\2"+
		"\u008c\u008d\7\b\2\2\u008d\u008f\5\36\20\2\u008e\u0090\5\20\t\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092\7\t\2"+
		"\2\u0092\u0093\5\36\20\2\u0093\u0094\7\17\2\2\u0094\u0096\5$\23\2\u0095"+
		"\u0097\5\20\t\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2"+
		"\2\u0098\u0099\7\n\2\2\u0099\u009e\5\36\20\2\u009a\u009b\7\r\2\2\u009b"+
		"\u009d\5&\24\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a5\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\16\2\2\u00a2\u00a4\5(\25\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00aa\5\20\t\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ae\5\36\20\2\u00ad"+
		"\u00af\5\20\t\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\33\3\2\2"+
		"\2\u00b0\u00b1\7\13\2\2\u00b1\u00b3\5\36\20\2\u00b2\u00b4\5\20\t\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b9\7\23\2"+
		"\2\u00b6\u00b8\5\"\22\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00be\5*\26\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0!\3\2\2\2\u00c1\u00c2\7\7\2\2\u00c2"+
		"\u00c3\58\35\2\u00c3#\3\2\2\2\u00c4\u00c7\5 \21\2\u00c5\u00c7\5\36\20"+
		"\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00cb"+
		"\5 \21\2\u00c9\u00cb\5\36\20\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\'\3\2\2\2\u00cc\u00cf\5 \21\2\u00cd\u00cf\5\36\20\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf)\3\2\2\2\u00d0\u00d1\7\34\2\2\u00d1"+
		"\u00d2\5,\27\2\u00d2\u00d3\7\35\2\2\u00d3+\3\2\2\2\u00d4\u00d6\5.\30\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e0\5\20\t\2\u00db"+
		"\u00e0\5\60\31\2\u00dc\u00e0\5\62\32\2\u00dd\u00e0\5\64\33\2\u00de\u00e0"+
		"\5\66\34\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0/\3\2\2\2\u00e1\u00e3\7"+
		"\23\2\2\u00e2\u00e4\7\37\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\5:\36\2\u00e6\u00e8\5D#\2\u00e7\u00e6\3\2\2"+
		"\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5\20\t\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\61\3\2\2\2\u00ec\u00ed\7\3\2"+
		"\2\u00ed\u00ef\7\26\2\2\u00ee\u00f0\5\20\t\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\63\3\2\2\2\u00f1\u00f2\7\23\2\2\u00f2\u00f4\7\26"+
		"\2\2\u00f3\u00f5\5\20\t\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\65\3\2\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00f8\7\27\2\2\u00f8\u00fa\5:\36"+
		"\2\u00f9\u00fb\5\20\t\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\67\3\2\2\2\u00fc\u0106\7\23\2\2\u00fd\u0102\7\23\2\2\u00fe\u00ff\7!\2"+
		"\2\u00ff\u0101\7\23\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u00fc\3\2\2\2\u0105\u00fd\3\2\2\2\u01069\3\2\2\2\u0107\u010c"+
		"\7\4\2\2\u0108\u0109\7\32\2\2\u0109\u010a\5:\36\2\u010a\u010b\7\33\2\2"+
		"\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0112"+
		"\3\2\2\2\u010e\u0112\5 \21\2\u010f\u0112\5> \2\u0110\u0112\5@!\2\u0111"+
		"\u0107\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2"+
		"\2\2\u0112;\3\2\2\2\u0113\u011d\5:\36\2\u0114\u0119\5:\36\2\u0115\u0116"+
		"\7!\2\2\u0116\u0118\5:\36\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u0113\3\2\2\2\u011c\u0114\3\2\2\2\u011d=\3\2\2\2\u011e\u011f"+
		"\7\5\2\2\u011f\u0120\7\32\2\2\u0120\u0121\58\35\2\u0121\u0122\7\33\2\2"+
		"\u0122?\3\2\2\2\u0123\u0124\7\32\2\2\u0124\u0125\5<\37\2\u0125\u0126\7"+
		"\33\2\2\u0126A\3\2\2\2\u0127\u0129\7\"\2\2\u0128\u012a\5\20\t\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012aC\3\2\2\2\u012b\u012c\7\30\2\2"+
		"\u012c\u012d\t\3\2\2\u012d\u012e\7\31\2\2\u012eE\3\2\2\2\u012f\u0130\7"+
		"\20\2\2\u0130\u0132\7\23\2\2\u0131\u0133\5J&\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\5\20\t\2\u0135\u0134\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136G\3\2\2\2\u0137\u0138\7\21\2\2\u0138\u013a"+
		"\7\23\2\2\u0139\u013b\5J&\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013e\5\20\t\2\u013d\u013c\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013eI\3\2\2\2\u013f\u0140\7\34\2\2\u0140\u0141\5L\'\2\u0141\u0142"+
		"\7\35\2\2\u0142K\3\2\2\2\u0143\u0145\5N(\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147M\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014e\5\20\t\2\u014a\u014e\5\22\n\2\u014b\u014c\7"+
		"\22\2\2\u014c\u014e\5P)\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014eO\3\2\2\2\u014f\u0159\5R*\2\u0150\u0155\5R*\2\u0151"+
		"\u0152\7!\2\2\u0152\u0154\5R*\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2"+
		"\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u014f\3\2\2\2\u0158\u0150\3\2\2\2\u0159Q\3\2\2\2\u015a"+
		"\u015c\7\23\2\2\u015b\u015d\7\37\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015dS\3\2\2\2.V\\ainux\u0085\u008f\u0096\u009e\u00a5\u00a9\u00ae"+
		"\u00b3\u00b9\u00bd\u00c6\u00ca\u00ce\u00d7\u00df\u00e3\u00e7\u00ea\u00ef"+
		"\u00f4\u00fa\u0102\u0105\u010c\u0111\u0119\u011c\u0129\u0132\u0135\u013a"+
		"\u013d\u0146\u014d\u0155\u0158\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}