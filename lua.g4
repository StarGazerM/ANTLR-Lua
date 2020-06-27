/**
 Grammar of Lua 5.3 
 based on https://www.lua.org/manual/5.3/manual.html#9

 Yihao Sun
 2020 Syracuse
 */

grammar lua;

// lexer

// reserved keyword in Lua
RESERVED 
    : 'break' | 'goto' | 'do' | 'end' | 'while' | 'repeat' | 'util'
    | 'if' | 'then' | 'else' | 'for' | 'in' | 'local' | 'function'
    | 'return'
    ;

NIL
    : 'nil'
    ;

BOOL
    : 'true' | 'false'
    ;

LONGSTRING
    : '[' NESTED_STR ']'
    ;

fragment
NESTED_STR
    : '=' NESTED_STR '='
    | '[' .*? ']'
    ;
ESACPE_CHAR
    : '\\a' | '\\b' | '\\f' | '\\n' | '\\t' | '\\r' | '\\v' 
    | '\\"' | '\\\'' | '\\z' | '\\\\' | ESCAPE_UNICODE | BYTE
    | '\\' '\r'? '\n'
    ;
fragment ESCAPE_UNICODE : '\\u{' HEX_DIGIT+'}';

BYTE
    : '\\x' HEX_DIGIT+
    | '\\' DIGIT
    | '\\' DIGIT DIGIT
    | '\\' DIGIT DIGIT DIGIT
    ;

NUMBERAL : INT | HEX | FLOAT | HEX_FLOAT | EXP_NUM | BIN_EXP_NUM | BYTE;
fragment INT : DIGIT+;
fragment HEX : '0' ('x'|'X') HEX_DIGIT+;
fragment FLOAT: INT '.' INT | INT '.' | '.' INT;
fragment HEX_FLOAT : HEX '.' HEX_DIGIT+ | HEX '.' | '0' ('x'|'X') '.' HEX_DIGIT+;
fragment EXP_NUM: (FLOAT|INT) ('e' | 'E') ('-'|'+')? INT;
fragment BIN_EXP_NUM : (HEX|HEX_FLOAT) ('p'|'P') ('-'|'+')? INT;

// not support unicode
ID
    : ('_' | LETTER) ('_' | LETTER | DIGIT)*;

LETTER: [a-zA-Z];
DIGIT: [0-9];
HEX_DIGIT : ('0'..'9' | 'a'..'f' | 'A'..'F');

NORMAL_STRING
    : '"' (ESACPE_CHAR | ~('\\' | '"') )* '"'
    | '\'' (ESACPE_CHAR | ~('\'' | '\\') )* '\''
    ;

// need to escape

COMMENT
    : '--[' NESTED_STR ']' -> channel(HIDDEN)
    ;

LINE_COMMENT
    : '--'
    (                                               // --
    | '[' '='*                                      // --[==
    | '[' '='* ~('='|'['|'\r'|'\n') ~('\r'|'\n')*   // --[==AA
    | ~('['|'\r'|'\n') ~('\r'|'\n')*                // --AAA
    ) ('\r\n'|'\r'|'\n'|EOF)
    -> channel(HIDDEN)
    ;

WS
    : [ \t\u000C\r\n]+ -> skip
    ;


SHEBANG
    : '#' '!' ~('\n'|'\r')* -> channel(HIDDEN)
    ;

// parser

string
    : NORMAL_STRING
    | LONGSTRING
    ;

// this is something hmmm.... because ~ and - have two meaning, so I have to make it a parser rule
binop
    : '+' | '-' | '*' | '/' | '//' | '^' | '%' | '&' | '~' | '|'
    | '>>' | '<<' | '..' | '<' | '<=' | '>' | '>=' | '==' | '~='
    | 'and' | 'or'
    ;

unop
    : '~' | 'not' | '#' | '-'
    ;


chunk 
    : block EOF;

block 
    : stat* retstat?;

stat
    : ';'
    | varlist '=' explist
    | functioncall
    | label
    | 'break'
    | 'goto' ID
    | 'do' block 'end'
    | 'while' exp 'do' block 'end'
    | 'repeat' block 'until' exp
    | 'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end'
    | 'for' ID '=' exp ',' exp (',' exp)? 'do' block 'end'
    | 'for' namelist 'in' explist 'do' block 'end'
    | 'function' funcname funcbody
    | 'local' 'function' ID funcbody
    | 'local' namelist ('=' explist)?
    ;

retstat : 'return' explist* ';'?;

label : '::' ID '::';

funcname : ID ('.' ID)* (':' ID)?;

varlist : var (',' var)*;

var
    : (ID | '(' exp ')' varsuffix) (functioncallsuffix | varsuffix)* varsuffix*
    ;

varsuffix
    : '[' exp ']'
    | '.' ID
    ;

namelist : ID (',' ID)*;

explist : exp (',' exp)*;

exp
    : NIL
    | BOOL
    | NUMBERAL
    | string
    | '...'
    | functiondef
    | var
    | functioncall
    | '(' exp ')'
    | tableconstructor
    | unop exp
    | exp binop exp
    ;

functioncall
    : (var | '(' exp ')') functioncallsuffix+
    ;

functioncallsuffix
    : args
    | ':' ID args
    ;


args
    : '(' explist? ')'
    | tableconstructor
    | string
    ;

functiondef : 'function' funcbody;

funcbody : '(' parlist? ')' block 'end';

parlist 
    : namelist (',' '...')?
    | '...'
    ;

fieldsep : ',' | ';';

tableconstructor
    : '{' field (fieldsep field)* fieldsep? '}'
    | '{' '}'
    ;

field 
    : '[' exp ']' '=' exp
    | ID '=' exp
    | exp
    ;

