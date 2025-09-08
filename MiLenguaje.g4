grammar MiLenguaje;

// -------- Raíz --------
program
  : (declaracion | statement)* EOF
  ;

// -------- Declaraciones --------
declaracion
  : funcionDecl
  ;

funcionDecl
  : FUNCION IDENT '(' parametros? ')' bloque
  ;

parametros
  : IDENT (',' IDENT)*
  ;

// -------- Sentencias --------
statement
  : asignacion ';'
  | imprimir ';'
  | siStmt
  | mientrasStmt
  | paraStmt
  | retornarStmt ';'
  | bloque
  ;

asignacion
  : IDENT '=' expr
  ;

imprimir
  : IMPRIMIR '(' expr? ')'
  ;

siStmt
  : SI '(' expr ')' bloque (SINO bloque)?
  ;

mientrasStmt
  : MIENTRAS '(' expr ')' bloque
  ;

// Forma tipo C para simplificar el intérprete:
paraStmt
  : PARA '(' asignacion ';' expr ';' asignacion ')' bloque
  ;

retornarStmt
  : RETORNAR expr?
  ;

bloque
  : '{' statement* '}'
  ;

// -------- Expresiones (precedencia y asociatividad) --------
// OR lógico
expr
  : expr OR expr                         # orExpr
  | expr AND expr                        # andExpr
  | expr (IGUAL | DIF) expr              # eqExpr
  | expr (MENOR | MENORIG | MAYOR | MAYORIG) expr # relExpr
  | expr (MAS | MENOS) expr              # addExpr
  | expr (POR | DIV | MOD) expr          # mulExpr
  | (MENOS | NO | MAS) expr              # unaryExpr     // -x, !x, +x
  | expr POW expr                        # powExpr       // asociativa a la derecha (se maneja en visitor)
  | prim                                 # primaryExpr
  ;

prim
  : literal
  | IDENT
  | '(' expr ')'
  ;

literal
  : ENTERO
  | DECIMAL
  | VERDADERO
  | FALSO
  | CADENA
  ;

// -------- Palabras reservadas (tokens de palabras) --------
FUNCION   : 'funcion';
RETORNAR  : 'retornar';
IMPRIMIR  : 'imprimir';
SI        : 'si';
SINO      : 'sino';
MIENTRAS  : 'mientras';
PARA      : 'para';
VERDADERO : 'verdadero';
FALSO     : 'falso';

// -------- Operadores y signos --------
IGUAL     : '==';
DIF       : '!=';
MENORIG   : '<=';
MAYORIG   : '>=';
MENOR     : '<';
MAYOR     : '>';

MAS       : '+';
MENOS     : '-';
POR       : '*';
DIV       : '/';
MOD       : '%';
POW       : '^';
AND       : '&&';
OR        : '||';
NO        : '!';

// -------- Identificadores y literales --------
// Identificadores: 1 a 10 caracteres: letra o '_' seguido de letras, dígitos o '_'
IDENT
  : [a-zA-Z_][a-zA-Z0-9_]*
    {getText().length() <= 10}?   // acepta solo si longitud <= 10
  ;

// Números
DECIMAL   : [0-9]+ '.' [0-9]+;
ENTERO    : [0-9]+;

// Cadenas
CADENA    : '"' (~["\\] | '\\' .)* '"' ;

// -------- Espacios y comentarios --------
WS        : [ \t\r\n]+ -> skip;
LINE_COMMENT
          : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT
          : '/*' .*? '*/' -> skip;
