grammar SvcLang;

sourceFile
    : (service | messageList) EOF
    ;

service
    : serviceDeclr specList?
    ;

messageList
    : message*
    ;

message
    : query
    | command
    | document
    | event
    | partialMessage
    ;

serviceDeclr
    : Service Identifier documentation?
    ;

specList
    : spec
    | spec spec*
    ;

spec
    : setting
    | documentation
    | partialMessage
    | document
    | event
    | command
    | query
    | typeAlias
    | serviceSection
    | streamDef
    ;

documentation
    : LineDoc
    | BlockDoc
    ;

setting
    : Identifier Constant
    ;

partialMessage
    : PartialMessage messageDef documentation?
    ;

query
    : Query messageDef RespondsWith queryResponse documentation?
    ;

command
    : Command messageDef (Emits emits)* (FailsWith failsWith)* documentation?
    ;

document
    : Document messageDef documentation?
    ;

event
    : Event messageDef documentation?
    ;

messageDef
    : Identifier messageExtensions* messageBody?
    ;

messageRef
    : Identifier
    ;

messageExtensions
    : Extends identifierList
    ;

queryResponse
    : messageRef #ResponseRef   
    | messageDef #ResponseDef
    ;

emits
    : messageRef #EmitsRef
    | messageDef #EmitsDef
    ;

failsWith
    : messageRef
    | messageDef
    ;

messageBody
    : LeftBrace messageElements RightBrace
    ;

messageElements
    : messageElement*
    ;

messageElement
    : documentation
    | fieldSpec
    | requiredFieldsSection
    | messageSection
    | typeAlias
    ;

fieldSpec
    : Identifier Star? typeSpec defaultValue? documentation?
    ;

requiredFieldsSection
    : 'required' Colon documentation?
    ;

messageSection
    : Identifier Colon documentation?
    ;

typeAlias
    : Identifier Arrow typeSpec documentation?
    ;

identifierList
    : Identifier
    | Identifier (Comma Identifier)*
    ;

typeSpec
    : PrimitiveType (LeftBracket typeSpec RightBracket)?
    | messageRef
    | enumeration
    | union
    ;

typeSpecList
    : typeSpec
    | typeSpec (Comma typeSpec)*
    ;

enumeration
     : Enumeration LeftBracket identifierList RightBracket
     ;

union
    : LeftBracket typeSpecList RightBracket
    ;

serviceSection
    : Section documentation?
    ;

defaultValue
    : LeftParen (Constant|Identifier) RightParen
    ;

streamDef
    : (InputStream|OutputStream) Identifier streamBody
    ;

streamBody
    : LeftBrace streamElements RightBrace
    ;

streamElements
    : streamElement*
    ;

streamElement
    : documentation
    | setting
    | Messages messageSelections
    ;

messageSelections
    : messageSelection
    | messageSelection (',' messageSelection)*
    ;

messageSelection
    : Identifier '*'?
    ;

PrimitiveType
    : 'integer'
    | 'string'
    | 'boolean'
    | 'number'
    | 'map'
    | 'list'
    | 'date'
    ;

Enumeration : 'enum' ;

Service : 'service' ;
Extends : 'extends' ;
PartialMessage : 'partial message';
Query : 'query';
Command : 'command';
Event : 'event';
Document : 'document';

Emits : 'emits' ;
FailsWith : 'fails with';
RespondsWith : 'responds with';

InputStream : 'input stream';
OutputStream : 'output stream';

Messages : 'messages';

Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

Constant
    : StringLiteral
    | Identifier
    | NumberConstant
    ;

StringLiteral
    : Quote .*? Quote
    ;

Colon : ':';
Arrow : '->';
LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';
Quote : '"';
Star : '*';
DoubleDash : '--';

fragment DoubleHash : '##';
fragment Hash : '#';

Comma : ',';

Section
    : DoubleHash ~[\r\n}]*
    ;

LineDoc
    :  Hash ~[\r\n}]*
    ;

BlockDoc
    :   DoubleDash .*? DoubleDash
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NumberConstant
    :   IntegerConstant
    |   FractionalConstant
    ;

fragment
IntegerConstant
    :   DecimalConstant
    |   HexadecimalConstant
    ;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
HexadecimalConstant
    :   HexadecimalPrefix HexadecimalDigit+
    ;

fragment
HexadecimalPrefix
    :   '0' [xX]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
DigitSequence
    :   Digit+
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;


BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;


LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

