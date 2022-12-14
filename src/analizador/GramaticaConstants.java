/* Generated By:JavaCC: Do not edit this line. GramaticaConstants.java */
/** Analizador de expresiones aritmeticas sencillas. */
package Analizador;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface GramaticaConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 9;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 10;
  /** RegularExpression Id. */
  int IF = 12;
  /** RegularExpression Id. */
  int ELSE = 13;
  /** RegularExpression Id. */
  int WHILE = 14;
  /** RegularExpression Id. */
  int CLASS = 15;
  /** RegularExpression Id. */
  int PACK = 16;
  /** RegularExpression Id. */
  int LIBRARY = 17;
  /** RegularExpression Id. */
  int PUBLIC = 18;
  /** RegularExpression Id. */
  int PRIVATE = 19;
  /** RegularExpression Id. */
  int BREAK = 20;
  /** RegularExpression Id. */
  int DO = 21;
  /** RegularExpression Id. */
  int CHAR = 22;
  /** RegularExpression Id. */
  int STRING = 23;
  /** RegularExpression Id. */
  int INT = 24;
  /** RegularExpression Id. */
  int FLOAT = 25;
  /** RegularExpression Id. */
  int BOOLEAN = 26;
  /** RegularExpression Id. */
  int TRY = 27;
  /** RegularExpression Id. */
  int CATCH = 28;
  /** RegularExpression Id. */
  int SUPER = 29;
  /** RegularExpression Id. */
  int THIS = 30;
  /** RegularExpression Id. */
  int DERIVATE = 31;
  /** RegularExpression Id. */
  int RETURN = 32;
  /** RegularExpression Id. */
  int FINAL = 33;
  /** RegularExpression Id. */
  int VOID = 34;
  /** RegularExpression Id. */
  int NULL = 35;
  /** RegularExpression Id. */
  int IMPORT = 36;
  /** RegularExpression Id. */
  int TRUE = 37;
  /** RegularExpression Id. */
  int FALSE = 38;
  /** RegularExpression Id. */
  int FOR = 39;
  /** RegularExpression Id. */
  int SWITCH = 40;
  /** RegularExpression Id. */
  int CASE = 41;
  /** RegularExpression Id. */
  int PRINMAIN = 42;
  /** RegularExpression Id. */
  int DOUBLE = 43;
  /** RegularExpression Id. */
  int EXCEPT = 44;
  /** RegularExpression Id. */
  int DEF = 45;
  /** RegularExpression Id. */
  int LLAVA = 46;
  /** RegularExpression Id. */
  int LLAVC = 47;
  /** RegularExpression Id. */
  int CORA = 48;
  /** RegularExpression Id. */
  int CORC = 49;
  /** RegularExpression Id. */
  int PAREA = 50;
  /** RegularExpression Id. */
  int PAREC = 51;
  /** RegularExpression Id. */
  int PYC = 52;
  /** RegularExpression Id. */
  int COMSIM = 53;
  /** RegularExpression Id. */
  int COM = 54;
  /** RegularExpression Id. */
  int PUNT = 55;
  /** RegularExpression Id. */
  int GUIONB = 56;
  /** RegularExpression Id. */
  int DOSP = 57;
  /** RegularExpression Id. */
  int MAYORQ = 58;
  /** RegularExpression Id. */
  int MENORQ = 59;
  /** RegularExpression Id. */
  int MAYORI = 60;
  /** RegularExpression Id. */
  int MENORI = 61;
  /** RegularExpression Id. */
  int IGUALI = 62;
  /** RegularExpression Id. */
  int DIFER = 63;
  /** RegularExpression Id. */
  int AND = 64;
  /** RegularExpression Id. */
  int OR = 65;
  /** RegularExpression Id. */
  int NOT = 66;
  /** RegularExpression Id. */
  int INCRE = 67;
  /** RegularExpression Id. */
  int DECRE = 68;
  /** RegularExpression Id. */
  int ASIG = 69;
  /** RegularExpression Id. */
  int SUMASIG = 70;
  /** RegularExpression Id. */
  int RESASIG = 71;
  /** RegularExpression Id. */
  int MULASIG = 72;
  /** RegularExpression Id. */
  int DIVASIG = 73;
  /** RegularExpression Id. */
  int MODASIG = 74;
  /** RegularExpression Id. */
  int SUMA = 75;
  /** RegularExpression Id. */
  int RESTA = 76;
  /** RegularExpression Id. */
  int DIVIS = 77;
  /** RegularExpression Id. */
  int POTEN = 78;
  /** RegularExpression Id. */
  int MODUL = 79;
  /** RegularExpression Id. */
  int MULTI = 80;
  /** RegularExpression Id. */
  int letraMay = 81;
  /** RegularExpression Id. */
  int letraMin = 82;
  /** RegularExpression Id. */
  int c = 83;
  /** RegularExpression Id. */
  int digito = 84;
  /** RegularExpression Id. */
  int ENTERO = 85;
  /** RegularExpression Id. */
  int FLOTANTEDOUBLE = 86;
  /** RegularExpression Id. */
  int CLASES = 87;
  /** RegularExpression Id. */
  int CARACTER = 88;
  /** RegularExpression Id. */
  int CADENA = 89;
  /** RegularExpression Id. */
  int PAQUET = 90;
  /** RegularExpression Id. */
  int VAR = 91;
  /** RegularExpression Id. */
  int FUNC = 92;
  /** RegularExpression Id. */
  int LIBR = 93;
  /** RegularExpression Id. */
  int A = 94;
  /** RegularExpression Id. */
  int GRADOS = 95;
  /** RegularExpression Id. */
  int CPOR = 96;
  /** RegularExpression Id. */
  int PUNTOS = 97;
  /** RegularExpression Id. */
  int ACENTOI = 98;
  /** RegularExpression Id. */
  int ACENTO = 99;
  /** RegularExpression Id. */
  int BARRAI = 100;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_SINGLE_LINE_COMMENT = 1;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 2;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\b\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"//\"",
    "\"/*\"",
    "\"/*@bgen(jjtree\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "<token of kind 11>",
    "\"If\"",
    "\"Else\"",
    "\"While\"",
    "\"class\"",
    "\"Pack\"",
    "\"Library\"",
    "\"public\"",
    "\"private\"",
    "\"break\"",
    "\"do\"",
    "\"char\"",
    "\"string\"",
    "\"int\"",
    "\"float\"",
    "\"boolean\"",
    "\"Try\"",
    "\"Catch\"",
    "\"Super\"",
    "\"This\"",
    "\"Derivate\"",
    "\"return\"",
    "\"Final\"",
    "\"void\"",
    "\"null\"",
    "\"import\"",
    "\"true\"",
    "\"false\"",
    "\"For\"",
    "\"Switch\"",
    "\"Case\"",
    "\"principalMain\"",
    "\"double\"",
    "\"Except\"",
    "\"Default\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\";\"",
    "\"\\\'\"",
    "\",\"",
    "\".\"",
    "\"_\"",
    "\":\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"==\"",
    "\"<>\"",
    "\"AND\"",
    "\"OR\"",
    "\"NOT\"",
    "\"++\"",
    "\"--\"",
    "\"=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"+\"",
    "\"-\"",
    "\"/\"",
    "\"^\"",
    "\"%\"",
    "\"*\"",
    "<letraMay>",
    "<letraMin>",
    "<c>",
    "<digito>",
    "<ENTERO>",
    "<FLOTANTEDOUBLE>",
    "<CLASES>",
    "<CARACTER>",
    "<CADENA>",
    "<PAQUET>",
    "<VAR>",
    "<FUNC>",
    "<LIBR>",
    "\"\\u00aa\"",
    "\"\\u00ba\"",
    "\"\\u00e7\"",
    "\"\\u00a8\"",
    "\"`\"",
    "\"\\u00b4\"",
    "\"\\\\\"",
  };

}
