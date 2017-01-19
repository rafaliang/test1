grammar SQLQuery;

/*
 * ====================
 * Query
 * ====================
 */

query
:
	sfwClause EOF
;

/*
 * ===================
 *  sfwClause
 * ===================
 */
 
sfwClause
:   
	selectClasue fromClause (whereClause)?
;

/*
 * ====================
 * selectClasue
 * ====================
 */
 
selectClasue
:
	selectStatement
;

selectStatement
:
	SELECT variable ( ',' variable )*
;
/*
 * ====================
 * FromClause
 * ====================
 */
fromClause
:
	FROM NAME //Name refers to the realtion's name
;
/*
 * ====================
 *	WhereClause
 * ====================
 */
whereClause
:
	whereStatement
;

whereStatement
:
	WHERE condition
;


/*
 * ====================
 *	Condition
 * ====================
 */
 condition
 :
 	 variable '=' variable 			#VarEquality
 	| variable '=' STRING			#ConstatntEqaulity
 ;

/*
 * ====================
 *	Variable
 * ====================
 */
variable
:
	NAME
;

/*
 * ====================
 *	KeyWords
 * ====================
 */

SELECT
:
	S E L E C T
;

FROM
:
	F R O M
;

WHERE
:
	W H E R E
;

/*
 * ===========================
 * String/Integers Primitives
 * ===========================
 */
NAME
:
	[a-zA-Z_] [a-zA-Z_0-9]*
;

INTEGER
:
	'0'
	| [1-9] [0-9]*
;
STRING
    :  '"' (ESCAPE | ~["\\])* '"'
    |  '\'' (ESCAPE | ~['\\])* '\''
    ;

fragment ESCAPE
    : '\\' (['"\\/bfnrt] | UNICODE)
    ;
    
fragment UNICODE
    : 'u' HEX HEX HEX HEX
    ;

fragment HEX
    : [0-9a-fA-F]
    ;
/*
 * ====================
 *  Skip Whitespace
 * ====================
 */
WHITESPACE
:
	[ \t\n\r]+ -> skip
;
/*
 * ====================
 * Fragments
 * ====================
 */
fragment
A
:
	[aA]
;

fragment
B
:
	[bB]
;

fragment
C
:
	[cC]
;

fragment
D
:
	[dD]
;

fragment
E
:
	[eE]
;

fragment
F
:
	[fF]
;

fragment
G
:
	[gG]
;

fragment
H
:
	[hH]
;

fragment
I
:
	[iI]
;

fragment
J
:
	[jJ]
;

fragment
K
:
	[kK]
;

fragment
L
:
	[lL]
;

fragment
M
:
	[mM]
;

fragment
N
:
	[nN]
;

fragment
O
:
	[oO]
;

fragment
P
:
	[pP]
;

fragment
Q
:
	[qQ]
;

fragment
R
:
	[rR]
;

fragment
S
:
	[sS]
;

fragment
T
:
	[tT]
;

fragment
U
:
	[uU]
;

fragment
V
:
	[vV]
;

fragment
W
:
	[wW]
;

fragment
X
:
	[xX]
;

fragment
Y
:
	[yY]
;

fragment
Z
:
	[zZ]
;