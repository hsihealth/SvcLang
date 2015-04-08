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
		T__0=1, T__1=2, PrimitiveType=3, Enumeration=4, Service=5, Extends=6, 
		PartialMessage=7, Query=8, Command=9, Event=10, Document=11, Emits=12, 
		FailsWith=13, RespondsWith=14, InputStream=15, OutputStream=16, Messages=17, 
		Identifier=18, Constant=19, StringLiteral=20, Colon=21, Arrow=22, LeftParen=23, 
		RightParen=24, LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, 
		Quote=29, Star=30, DoubleDash=31, Comma=32, Section=33, LineDoc=34, BlockDoc=35, 
		Whitespace=36, Newline=37, BlockComment=38, LineComment=39;
	public static final int
		RULE_sourceFile = 0, RULE_service = 1, RULE_messageList = 2, RULE_message = 3, 
		RULE_serviceDeclr = 4, RULE_specList = 5, RULE_spec = 6, RULE_documentation = 7, 
		RULE_setting = 8, RULE_partialMessage = 9, RULE_query = 10, RULE_command = 11, 
		RULE_document = 12, RULE_event = 13, RULE_messageDef = 14, RULE_messageRefList = 15, 
		RULE_messageRef = 16, RULE_namespace = 17, RULE_messageExtensions = 18, 
		RULE_queryResponse = 19, RULE_emits = 20, RULE_failsWith = 21, RULE_messageBody = 22, 
		RULE_messageElements = 23, RULE_messageElement = 24, RULE_fieldSpec = 25, 
		RULE_requiredFieldsSection = 26, RULE_messageSection = 27, RULE_typeAlias = 28, 
		RULE_identifierList = 29, RULE_typeSpec = 30, RULE_typeSpecList = 31, 
		RULE_enumeration = 32, RULE_union = 33, RULE_serviceSection = 34, RULE_defaultValue = 35, 
		RULE_inputStreamDef = 36, RULE_outputStreamDef = 37, RULE_streamBody = 38, 
		RULE_streamElements = 39, RULE_streamElement = 40, RULE_messageSelections = 41, 
		RULE_messageSelection = 42;
	public static final String[] ruleNames = {
		"sourceFile", "service", "messageList", "message", "serviceDeclr", "specList", 
		"spec", "documentation", "setting", "partialMessage", "query", "command", 
		"document", "event", "messageDef", "messageRefList", "messageRef", "namespace", 
		"messageExtensions", "queryResponse", "emits", "failsWith", "messageBody", 
		"messageElements", "messageElement", "fieldSpec", "requiredFieldsSection", 
		"messageSection", "typeAlias", "identifierList", "typeSpec", "typeSpecList", 
		"enumeration", "union", "serviceSection", "defaultValue", "inputStreamDef", 
		"outputStreamDef", "streamBody", "streamElements", "streamElement", "messageSelections", 
		"messageSelection"
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
			setState(88);
			switch (_input.LA(1)) {
			case Service:
				{
				setState(86); 
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
				setState(87); 
				messageList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90); 
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
			setState(92); 
			serviceDeclr();
			setState(94);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				setState(93); 
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document))) != 0)) {
				{
				{
				setState(96); 
				message();
				}
				}
				setState(101);
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
			setState(107);
			switch (_input.LA(1)) {
			case Query:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); 
				query();
				}
				break;
			case Command:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); 
				command();
				}
				break;
			case Document:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); 
				document();
				}
				break;
			case Event:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); 
				event();
				}
				break;
			case PartialMessage:
				enterOuterAlt(_localctx, 5);
				{
				setState(106); 
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
			setState(109); 
			match(Service);
			setState(110); 
			match(Identifier);
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(111); 
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
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); 
				spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); 
				spec();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PartialMessage) | (1L << Query) | (1L << Command) | (1L << Event) | (1L << Document) | (1L << InputStream) | (1L << OutputStream) | (1L << Identifier) | (1L << Section) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
					{
					{
					setState(116); 
					spec();
					}
					}
					setState(121);
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
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); 
				setting();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); 
				documentation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); 
				partialMessage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); 
				document();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); 
				event();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129); 
				command();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130); 
				query();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131); 
				typeAlias();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132); 
				serviceSection();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133); 
				inputStreamDef();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134); 
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
			setState(137);
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
			setState(139); 
			match(Identifier);
			setState(140); 
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
			setState(142); 
			match(PartialMessage);
			setState(143); 
			messageDef();
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
			setState(147); 
			match(Query);
			setState(148); 
			messageDef();
			setState(149); 
			match(RespondsWith);
			setState(150); 
			queryResponse();
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(151); 
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
			setState(154); 
			match(Command);
			setState(155); 
			messageDef();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Emits) {
				{
				{
				setState(156); 
				match(Emits);
				setState(157); 
				emits();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FailsWith) {
				{
				{
				setState(163); 
				match(FailsWith);
				setState(164); 
				failsWith();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(170); 
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
			setState(173); 
			match(Document);
			setState(174); 
			messageDef();
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(175); 
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
			setState(178); 
			match(Event);
			setState(179); 
			messageDef();
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(180); 
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
			setState(183); 
			match(Identifier);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Extends) {
				{
				{
				setState(184); 
				messageExtensions();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(190); 
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

	public static class MessageRefListContext extends ParserRuleContext {
		public List<MessageRefContext> messageRef() {
			return getRuleContexts(MessageRefContext.class);
		}
		public MessageRefContext messageRef(int i) {
			return getRuleContext(MessageRefContext.class,i);
		}
		public MessageRefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageRefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterMessageRefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitMessageRefList(this);
		}
	}

	public final MessageRefListContext messageRefList() throws RecognitionException {
		MessageRefListContext _localctx = new MessageRefListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_messageRefList);
		int _la;
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); 
				messageRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); 
				messageRef();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(195); 
					match(Comma);
					setState(196); 
					messageRef();
					}
					}
					setState(201);
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

	public static class MessageRefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SvcLangParser.Identifier, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_messageRef);
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); 
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); 
				namespace();
				setState(206); 
				match(T__0);
				setState(207); 
				match(Identifier);
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

	public static class NamespaceContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SvcLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SvcLangParser.Identifier, i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SvcLangListener ) ((SvcLangListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_namespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			match(Identifier);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212); 
					match(T__0);
					setState(213); 
					match(Identifier);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public MessageRefListContext messageRefList() {
			return getRuleContext(MessageRefListContext.class,0);
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
		enterRule(_localctx, 36, RULE_messageExtensions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); 
			match(Extends);
			setState(220); 
			messageRefList();
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
		enterRule(_localctx, 38, RULE_queryResponse);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ResponseRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new ResponseDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223); 
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
		enterRule(_localctx, 40, RULE_emits);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new EmitsRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new EmitsDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227); 
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
		enterRule(_localctx, 42, RULE_failsWith);
		try {
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new FailsWithRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230); 
				messageRef();
				}
				break;
			case 2:
				_localctx = new FailsWithDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231); 
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
		enterRule(_localctx, 44, RULE_messageBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); 
			match(LeftBrace);
			setState(235); 
			messageElements();
			setState(236); 
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
		enterRule(_localctx, 46, RULE_messageElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(238); 
				messageElement();
				}
				}
				setState(243);
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
		enterRule(_localctx, 48, RULE_messageElement);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); 
				documentation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); 
				fieldSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); 
				requiredFieldsSection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); 
				messageSection();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248); 
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
		enterRule(_localctx, 50, RULE_fieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			match(Identifier);
			setState(253);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(252); 
				match(Star);
				}
			}

			setState(255); 
			typeSpec();
			setState(257);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(256); 
				defaultValue();
				}
			}

			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(259); 
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
		enterRule(_localctx, 52, RULE_requiredFieldsSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			match(T__1);
			setState(263); 
			match(Colon);
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(264); 
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
		enterRule(_localctx, 54, RULE_messageSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); 
			match(Identifier);
			setState(268); 
			match(Colon);
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(269); 
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
		enterRule(_localctx, 56, RULE_typeAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			match(Identifier);
			setState(273); 
			match(Arrow);
			setState(274); 
			typeSpec();
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(275); 
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
		enterRule(_localctx, 58, RULE_identifierList);
		int _la;
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); 
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); 
				match(Identifier);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(280); 
					match(Comma);
					setState(281); 
					match(Identifier);
					}
					}
					setState(286);
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
		enterRule(_localctx, 60, RULE_typeSpec);
		int _la;
		try {
			setState(299);
			switch (_input.LA(1)) {
			case PrimitiveType:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); 
				match(PrimitiveType);
				setState(294);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(290); 
					match(LeftBracket);
					setState(291); 
					typeSpec();
					setState(292); 
					match(RightBracket);
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(296); 
				messageRef();
				}
				break;
			case Enumeration:
				enterOuterAlt(_localctx, 3);
				{
				setState(297); 
				enumeration();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); 
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
		enterRule(_localctx, 62, RULE_typeSpecList);
		int _la;
		try {
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); 
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); 
				typeSpec();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(303); 
					match(Comma);
					setState(304); 
					typeSpec();
					}
					}
					setState(309);
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
		enterRule(_localctx, 64, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); 
			match(Enumeration);
			setState(313); 
			match(LeftBracket);
			setState(314); 
			identifierList();
			setState(315); 
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
		enterRule(_localctx, 66, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); 
			match(LeftBracket);
			setState(318); 
			typeSpecList();
			setState(319); 
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
		enterRule(_localctx, 68, RULE_serviceSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); 
			match(Section);
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(322); 
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
		enterRule(_localctx, 70, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			match(LeftParen);
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constant) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(327); 
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
		enterRule(_localctx, 72, RULE_inputStreamDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			match(InputStream);
			setState(330); 
			match(Identifier);
			setState(332);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(331); 
				streamBody();
				}
			}

			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(334); 
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
		enterRule(_localctx, 74, RULE_outputStreamDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); 
			match(OutputStream);
			setState(338); 
			match(Identifier);
			setState(340);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(339); 
				streamBody();
				}
			}

			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(342); 
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
		enterRule(_localctx, 76, RULE_streamBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); 
			match(LeftBrace);
			setState(346); 
			streamElements();
			setState(347); 
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
		enterRule(_localctx, 78, RULE_streamElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Messages) | (1L << Identifier) | (1L << LineDoc) | (1L << BlockDoc))) != 0)) {
				{
				{
				setState(349); 
				streamElement();
				}
				}
				setState(354);
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
		enterRule(_localctx, 80, RULE_streamElement);
		try {
			setState(359);
			switch (_input.LA(1)) {
			case LineDoc:
			case BlockDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); 
				documentation();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); 
				setting();
				}
				break;
			case Messages:
				enterOuterAlt(_localctx, 3);
				{
				setState(357); 
				match(Messages);
				setState(358); 
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
		enterRule(_localctx, 82, RULE_messageSelections);
		int _la;
		try {
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361); 
				messageSelection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362); 
				messageSelection();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(363); 
					match(Comma);
					setState(364); 
					messageSelection();
					}
					}
					setState(369);
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
		enterRule(_localctx, 84, RULE_messageSelection);
		int _la;
		try {
			_localctx = new MessageSelectionPatternContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(372); 
			match(Identifier);
			setState(374);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(373); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\5\2[\n\2\3\2\3\2\3\3\3\3\5\3a\n\3\3\4\7\4d\n\4\f\4\16\4g"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7\7"+
		"\7x\n\7\f\7\16\7{\13\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u008a\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u0094\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3\r\3\r\3\r\7\r\u00a1\n\r\f\r\16"+
		"\r\u00a4\13\r\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\3\r\5\r\u00ae"+
		"\n\r\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\5\17\u00b8\n\17\3\20"+
		"\3\20\7\20\u00bc\n\20\f\20\16\20\u00bf\13\20\3\20\5\20\u00c2\n\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00c8\n\21\f\21\16\21\u00cb\13\21\5\21\u00cd\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\3\23\7\23\u00d9\n"+
		"\23\f\23\16\23\u00dc\13\23\3\24\3\24\3\24\3\25\3\25\5\25\u00e3\n\25\3"+
		"\26\3\26\5\26\u00e7\n\26\3\27\3\27\5\27\u00eb\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\7\31\u00f2\n\31\f\31\16\31\u00f5\13\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00fc\n\32\3\33\3\33\5\33\u0100\n\33\3\33\3\33\5\33\u0104\n\33\3"+
		"\33\5\33\u0107\n\33\3\34\3\34\3\34\5\34\u010c\n\34\3\35\3\35\3\35\5\35"+
		"\u0111\n\35\3\36\3\36\3\36\3\36\5\36\u0117\n\36\3\37\3\37\3\37\3\37\7"+
		"\37\u011d\n\37\f\37\16\37\u0120\13\37\5\37\u0122\n\37\3 \3 \3 \3 \3 \5"+
		" \u0129\n \3 \3 \3 \5 \u012e\n \3!\3!\3!\3!\7!\u0134\n!\f!\16!\u0137\13"+
		"!\5!\u0139\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\5$\u0146\n$\3%\3%"+
		"\3%\3%\3&\3&\3&\5&\u014f\n&\3&\5&\u0152\n&\3\'\3\'\3\'\5\'\u0157\n\'\3"+
		"\'\5\'\u015a\n\'\3(\3(\3(\3(\3)\7)\u0161\n)\f)\16)\u0164\13)\3*\3*\3*"+
		"\3*\5*\u016a\n*\3+\3+\3+\3+\7+\u0170\n+\f+\16+\u0173\13+\5+\u0175\n+\3"+
		",\3,\5,\u0179\n,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTV\2\4\3\2$%\3\2\24\25\u0191\2Z\3\2\2\2\4"+
		"^\3\2\2\2\6e\3\2\2\2\bm\3\2\2\2\no\3\2\2\2\f|\3\2\2\2\16\u0089\3\2\2\2"+
		"\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u0090\3\2\2\2\26\u0095\3\2\2\2\30"+
		"\u009c\3\2\2\2\32\u00af\3\2\2\2\34\u00b4\3\2\2\2\36\u00b9\3\2\2\2 \u00cc"+
		"\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2\2&\u00dd\3\2\2\2(\u00e2\3\2\2\2"+
		"*\u00e6\3\2\2\2,\u00ea\3\2\2\2.\u00ec\3\2\2\2\60\u00f3\3\2\2\2\62\u00fb"+
		"\3\2\2\2\64\u00fd\3\2\2\2\66\u0108\3\2\2\28\u010d\3\2\2\2:\u0112\3\2\2"+
		"\2<\u0121\3\2\2\2>\u012d\3\2\2\2@\u0138\3\2\2\2B\u013a\3\2\2\2D\u013f"+
		"\3\2\2\2F\u0143\3\2\2\2H\u0147\3\2\2\2J\u014b\3\2\2\2L\u0153\3\2\2\2N"+
		"\u015b\3\2\2\2P\u0162\3\2\2\2R\u0169\3\2\2\2T\u0174\3\2\2\2V\u0176\3\2"+
		"\2\2X[\5\4\3\2Y[\5\6\4\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\]\7\2\2\3]\3"+
		"\3\2\2\2^`\5\n\6\2_a\5\f\7\2`_\3\2\2\2`a\3\2\2\2a\5\3\2\2\2bd\5\b\5\2"+
		"cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hn\5\26\f"+
		"\2in\5\30\r\2jn\5\32\16\2kn\5\34\17\2ln\5\24\13\2mh\3\2\2\2mi\3\2\2\2"+
		"mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\t\3\2\2\2op\7\7\2\2pr\7\24\2\2qs\5\20"+
		"\t\2rq\3\2\2\2rs\3\2\2\2s\13\3\2\2\2t}\5\16\b\2uy\5\16\b\2vx\5\16\b\2"+
		"wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|t\3\2\2\2"+
		"|u\3\2\2\2}\r\3\2\2\2~\u008a\5\22\n\2\177\u008a\5\20\t\2\u0080\u008a\5"+
		"\24\13\2\u0081\u008a\5\32\16\2\u0082\u008a\5\34\17\2\u0083\u008a\5\30"+
		"\r\2\u0084\u008a\5\26\f\2\u0085\u008a\5:\36\2\u0086\u008a\5F$\2\u0087"+
		"\u008a\5J&\2\u0088\u008a\5L\'\2\u0089~\3\2\2\2\u0089\177\3\2\2\2\u0089"+
		"\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2"+
		"\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\t\2\2"+
		"\2\u008c\21\3\2\2\2\u008d\u008e\7\24\2\2\u008e\u008f\7\25\2\2\u008f\23"+
		"\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0093\5\36\20\2\u0092\u0094\5\20\t"+
		"\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096"+
		"\7\n\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\20\2\2\u0098\u009a\5(\25"+
		"\2\u0099\u009b\5\20\t\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009d\7\13\2\2\u009d\u00a2\5\36\20\2\u009e\u009f\7\16"+
		"\2\2\u009f\u00a1\5*\26\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a9\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a8\5,\27\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\20\t\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\r\2\2\u00b0\u00b2\5\36\20"+
		"\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\33\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b7\5\36\20\2\u00b6\u00b8\5\20"+
		"\t\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00bd"+
		"\7\24\2\2\u00ba\u00bc\5&\24\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c2\5.\30\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\37\3\2\2\2\u00c3\u00cd\5\"\22\2\u00c4\u00c9\5\"\22\2\u00c5\u00c6\7\""+
		"\2\2\u00c6\u00c8\5\"\22\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cd!\3\2\2\2\u00ce\u00d4"+
		"\7\24\2\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\7\24\2\2"+
		"\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4#\3"+
		"\2\2\2\u00d5\u00da\7\24\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d9\7\24\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db%\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\b\2\2\u00de\u00df"+
		"\5 \21\2\u00df\'\3\2\2\2\u00e0\u00e3\5\"\22\2\u00e1\u00e3\5\36\20\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e7\5\"\22\2"+
		"\u00e5\u00e7\5\36\20\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7+"+
		"\3\2\2\2\u00e8\u00eb\5\"\22\2\u00e9\u00eb\5\36\20\2\u00ea\u00e8\3\2\2"+
		"\2\u00ea\u00e9\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00ed\7\35\2\2\u00ed\u00ee"+
		"\5\60\31\2\u00ee\u00ef\7\36\2\2\u00ef/\3\2\2\2\u00f0\u00f2\5\62\32\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\61\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fc\5\20\t\2\u00f7\u00fc"+
		"\5\64\33\2\u00f8\u00fc\5\66\34\2\u00f9\u00fc\58\35\2\u00fa\u00fc\5:\36"+
		"\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\63\3\2\2\2\u00fd\u00ff\7\24\2\2\u00fe"+
		"\u0100\7 \2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\5> \2\u0102\u0104\5H%\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5\20\t\2\u0106\u0105\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\65\3\2\2\2\u0108\u0109\7\4\2\2\u0109\u010b"+
		"\7\27\2\2\u010a\u010c\5\20\t\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\67\3\2\2\2\u010d\u010e\7\24\2\2\u010e\u0110\7\27\2\2\u010f\u0111"+
		"\5\20\t\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u01119\3\2\2\2\u0112"+
		"\u0113\7\24\2\2\u0113\u0114\7\30\2\2\u0114\u0116\5> \2\u0115\u0117\5\20"+
		"\t\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117;\3\2\2\2\u0118\u0122"+
		"\7\24\2\2\u0119\u011e\7\24\2\2\u011a\u011b\7\"\2\2\u011b\u011d\7\24\2"+
		"\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0118\3\2\2\2\u0121"+
		"\u0119\3\2\2\2\u0122=\3\2\2\2\u0123\u0128\7\5\2\2\u0124\u0125\7\33\2\2"+
		"\u0125\u0126\5> \2\u0126\u0127\7\34\2\2\u0127\u0129\3\2\2\2\u0128\u0124"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012e\3\2\2\2\u012a\u012e\5\"\22\2"+
		"\u012b\u012e\5B\"\2\u012c\u012e\5D#\2\u012d\u0123\3\2\2\2\u012d\u012a"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e?\3\2\2\2\u012f"+
		"\u0139\5> \2\u0130\u0135\5> \2\u0131\u0132\7\"\2\2\u0132\u0134\5> \2\u0133"+
		"\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u012f\3\2\2\2\u0138"+
		"\u0130\3\2\2\2\u0139A\3\2\2\2\u013a\u013b\7\6\2\2\u013b\u013c\7\33\2\2"+
		"\u013c\u013d\5<\37\2\u013d\u013e\7\34\2\2\u013eC\3\2\2\2\u013f\u0140\7"+
		"\33\2\2\u0140\u0141\5@!\2\u0141\u0142\7\34\2\2\u0142E\3\2\2\2\u0143\u0145"+
		"\7#\2\2\u0144\u0146\5\20\t\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"G\3\2\2\2\u0147\u0148\7\31\2\2\u0148\u0149\t\3\2\2\u0149\u014a\7\32\2"+
		"\2\u014aI\3\2\2\2\u014b\u014c\7\21\2\2\u014c\u014e\7\24\2\2\u014d\u014f"+
		"\5N(\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0152\5\20\t\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152K\3\2\2\2"+
		"\u0153\u0154\7\22\2\2\u0154\u0156\7\24\2\2\u0155\u0157\5N(\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u015a\5\20\t\2"+
		"\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015aM\3\2\2\2\u015b\u015c\7"+
		"\35\2\2\u015c\u015d\5P)\2\u015d\u015e\7\36\2\2\u015eO\3\2\2\2\u015f\u0161"+
		"\5R*\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163Q\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016a\5\20\t\2"+
		"\u0166\u016a\5\22\n\2\u0167\u0168\7\23\2\2\u0168\u016a\5T+\2\u0169\u0165"+
		"\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u016aS\3\2\2\2\u016b"+
		"\u0175\5V,\2\u016c\u0171\5V,\2\u016d\u016e\7\"\2\2\u016e\u0170\5V,\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u016b\3\2\2\2\u0174"+
		"\u016c\3\2\2\2\u0175U\3\2\2\2\u0176\u0178\7\24\2\2\u0177\u0179\7 \2\2"+
		"\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179W\3\2\2\2\62Z`emry|\u0089"+
		"\u0093\u009a\u00a2\u00a9\u00ad\u00b2\u00b7\u00bd\u00c1\u00c9\u00cc\u00d3"+
		"\u00da\u00e2\u00e6\u00ea\u00f3\u00fb\u00ff\u0103\u0106\u010b\u0110\u0116"+
		"\u011e\u0121\u0128\u012d\u0135\u0138\u0145\u014e\u0151\u0156\u0159\u0162"+
		"\u0169\u0171\u0174\u0178";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}