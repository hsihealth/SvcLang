// Generated from /Users/nathanstults/syncordia/svclang/SvcLang.g4 by ANTLR 4.5
package svclang.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SvcLangParser}.
 */
public interface SvcLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(@NotNull SvcLangParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(@NotNull SvcLangParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(@NotNull SvcLangParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(@NotNull SvcLangParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageList}.
	 * @param ctx the parse tree
	 */
	void enterMessageList(@NotNull SvcLangParser.MessageListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageList}.
	 * @param ctx the parse tree
	 */
	void exitMessageList(@NotNull SvcLangParser.MessageListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull SvcLangParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull SvcLangParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#serviceDeclr}.
	 * @param ctx the parse tree
	 */
	void enterServiceDeclr(@NotNull SvcLangParser.ServiceDeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#serviceDeclr}.
	 * @param ctx the parse tree
	 */
	void exitServiceDeclr(@NotNull SvcLangParser.ServiceDeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#specList}.
	 * @param ctx the parse tree
	 */
	void enterSpecList(@NotNull SvcLangParser.SpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#specList}.
	 * @param ctx the parse tree
	 */
	void exitSpecList(@NotNull SvcLangParser.SpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(@NotNull SvcLangParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(@NotNull SvcLangParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#documentation}.
	 * @param ctx the parse tree
	 */
	void enterDocumentation(@NotNull SvcLangParser.DocumentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#documentation}.
	 * @param ctx the parse tree
	 */
	void exitDocumentation(@NotNull SvcLangParser.DocumentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#setting}.
	 * @param ctx the parse tree
	 */
	void enterSetting(@NotNull SvcLangParser.SettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#setting}.
	 * @param ctx the parse tree
	 */
	void exitSetting(@NotNull SvcLangParser.SettingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#partialMessage}.
	 * @param ctx the parse tree
	 */
	void enterPartialMessage(@NotNull SvcLangParser.PartialMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#partialMessage}.
	 * @param ctx the parse tree
	 */
	void exitPartialMessage(@NotNull SvcLangParser.PartialMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SvcLangParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SvcLangParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull SvcLangParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull SvcLangParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull SvcLangParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull SvcLangParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(@NotNull SvcLangParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(@NotNull SvcLangParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageDef}.
	 * @param ctx the parse tree
	 */
	void enterMessageDef(@NotNull SvcLangParser.MessageDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageDef}.
	 * @param ctx the parse tree
	 */
	void exitMessageDef(@NotNull SvcLangParser.MessageDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageRef}.
	 * @param ctx the parse tree
	 */
	void enterMessageRef(@NotNull SvcLangParser.MessageRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageRef}.
	 * @param ctx the parse tree
	 */
	void exitMessageRef(@NotNull SvcLangParser.MessageRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageExtensions}.
	 * @param ctx the parse tree
	 */
	void enterMessageExtensions(@NotNull SvcLangParser.MessageExtensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageExtensions}.
	 * @param ctx the parse tree
	 */
	void exitMessageExtensions(@NotNull SvcLangParser.MessageExtensionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResponseRef}
	 * labeled alternative in {@link SvcLangParser#queryResponse}.
	 * @param ctx the parse tree
	 */
	void enterResponseRef(@NotNull SvcLangParser.ResponseRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResponseRef}
	 * labeled alternative in {@link SvcLangParser#queryResponse}.
	 * @param ctx the parse tree
	 */
	void exitResponseRef(@NotNull SvcLangParser.ResponseRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ResponseDef}
	 * labeled alternative in {@link SvcLangParser#queryResponse}.
	 * @param ctx the parse tree
	 */
	void enterResponseDef(@NotNull SvcLangParser.ResponseDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ResponseDef}
	 * labeled alternative in {@link SvcLangParser#queryResponse}.
	 * @param ctx the parse tree
	 */
	void exitResponseDef(@NotNull SvcLangParser.ResponseDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmitsRef}
	 * labeled alternative in {@link SvcLangParser#emits}.
	 * @param ctx the parse tree
	 */
	void enterEmitsRef(@NotNull SvcLangParser.EmitsRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmitsRef}
	 * labeled alternative in {@link SvcLangParser#emits}.
	 * @param ctx the parse tree
	 */
	void exitEmitsRef(@NotNull SvcLangParser.EmitsRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmitsDef}
	 * labeled alternative in {@link SvcLangParser#emits}.
	 * @param ctx the parse tree
	 */
	void enterEmitsDef(@NotNull SvcLangParser.EmitsDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmitsDef}
	 * labeled alternative in {@link SvcLangParser#emits}.
	 * @param ctx the parse tree
	 */
	void exitEmitsDef(@NotNull SvcLangParser.EmitsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#failsWith}.
	 * @param ctx the parse tree
	 */
	void enterFailsWith(@NotNull SvcLangParser.FailsWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#failsWith}.
	 * @param ctx the parse tree
	 */
	void exitFailsWith(@NotNull SvcLangParser.FailsWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageBody}.
	 * @param ctx the parse tree
	 */
	void enterMessageBody(@NotNull SvcLangParser.MessageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageBody}.
	 * @param ctx the parse tree
	 */
	void exitMessageBody(@NotNull SvcLangParser.MessageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageElements}.
	 * @param ctx the parse tree
	 */
	void enterMessageElements(@NotNull SvcLangParser.MessageElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageElements}.
	 * @param ctx the parse tree
	 */
	void exitMessageElements(@NotNull SvcLangParser.MessageElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageElement}.
	 * @param ctx the parse tree
	 */
	void enterMessageElement(@NotNull SvcLangParser.MessageElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageElement}.
	 * @param ctx the parse tree
	 */
	void exitMessageElement(@NotNull SvcLangParser.MessageElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#fieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldSpec(@NotNull SvcLangParser.FieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#fieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldSpec(@NotNull SvcLangParser.FieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#requiredFieldsSection}.
	 * @param ctx the parse tree
	 */
	void enterRequiredFieldsSection(@NotNull SvcLangParser.RequiredFieldsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#requiredFieldsSection}.
	 * @param ctx the parse tree
	 */
	void exitRequiredFieldsSection(@NotNull SvcLangParser.RequiredFieldsSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageSection}.
	 * @param ctx the parse tree
	 */
	void enterMessageSection(@NotNull SvcLangParser.MessageSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageSection}.
	 * @param ctx the parse tree
	 */
	void exitMessageSection(@NotNull SvcLangParser.MessageSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(@NotNull SvcLangParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(@NotNull SvcLangParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull SvcLangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull SvcLangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(@NotNull SvcLangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(@NotNull SvcLangParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#typeSpecList}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecList(@NotNull SvcLangParser.TypeSpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#typeSpecList}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecList(@NotNull SvcLangParser.TypeSpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(@NotNull SvcLangParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(@NotNull SvcLangParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(@NotNull SvcLangParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(@NotNull SvcLangParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#serviceSection}.
	 * @param ctx the parse tree
	 */
	void enterServiceSection(@NotNull SvcLangParser.ServiceSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#serviceSection}.
	 * @param ctx the parse tree
	 */
	void exitServiceSection(@NotNull SvcLangParser.ServiceSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull SvcLangParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull SvcLangParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#streamDef}.
	 * @param ctx the parse tree
	 */
	void enterStreamDef(@NotNull SvcLangParser.StreamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#streamDef}.
	 * @param ctx the parse tree
	 */
	void exitStreamDef(@NotNull SvcLangParser.StreamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#streamBody}.
	 * @param ctx the parse tree
	 */
	void enterStreamBody(@NotNull SvcLangParser.StreamBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#streamBody}.
	 * @param ctx the parse tree
	 */
	void exitStreamBody(@NotNull SvcLangParser.StreamBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#streamElements}.
	 * @param ctx the parse tree
	 */
	void enterStreamElements(@NotNull SvcLangParser.StreamElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#streamElements}.
	 * @param ctx the parse tree
	 */
	void exitStreamElements(@NotNull SvcLangParser.StreamElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#streamElement}.
	 * @param ctx the parse tree
	 */
	void enterStreamElement(@NotNull SvcLangParser.StreamElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#streamElement}.
	 * @param ctx the parse tree
	 */
	void exitStreamElement(@NotNull SvcLangParser.StreamElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageSelections}.
	 * @param ctx the parse tree
	 */
	void enterMessageSelections(@NotNull SvcLangParser.MessageSelectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageSelections}.
	 * @param ctx the parse tree
	 */
	void exitMessageSelections(@NotNull SvcLangParser.MessageSelectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SvcLangParser#messageSelection}.
	 * @param ctx the parse tree
	 */
	void enterMessageSelection(@NotNull SvcLangParser.MessageSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SvcLangParser#messageSelection}.
	 * @param ctx the parse tree
	 */
	void exitMessageSelection(@NotNull SvcLangParser.MessageSelectionContext ctx);
}