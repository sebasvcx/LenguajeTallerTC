
// Generated from MiLenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUNCION=8, RETORNAR=9, 
		IMPRIMIR=10, SI=11, SINO=12, MIENTRAS=13, PARA=14, VERDADERO=15, FALSO=16, 
		IGUAL=17, DIF=18, MENORIG=19, MAYORIG=20, MENOR=21, MAYOR=22, MAS=23, 
		MENOS=24, POR=25, DIV=26, MOD=27, POW=28, AND=29, OR=30, NO=31, IDENT=32, 
		DECIMAL=33, ENTERO=34, CADENA=35, WS=36, LINE_COMMENT=37, BLOCK_COMMENT=38;
	public static final int
		RULE_program = 0, RULE_declaracion = 1, RULE_funcionDecl = 2, RULE_parametros = 3, 
		RULE_statement = 4, RULE_asignacion = 5, RULE_imprimir = 6, RULE_siStmt = 7, 
		RULE_mientrasStmt = 8, RULE_paraStmt = 9, RULE_retornarStmt = 10, RULE_bloque = 11, 
		RULE_expr = 12, RULE_prim = 13, RULE_literal = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaracion", "funcionDecl", "parametros", "statement", "asignacion", 
			"imprimir", "siStmt", "mientrasStmt", "paraStmt", "retornarStmt", "bloque", 
			"expr", "prim", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "';'", "'='", "'{'", "'}'", "'funcion'", "'retornar'", 
			"'imprimir'", "'si'", "'sino'", "'mientras'", "'para'", "'verdadero'", 
			"'falso'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FUNCION", "RETORNAR", 
			"IMPRIMIR", "SI", "SINO", "MIENTRAS", "PARA", "VERDADERO", "FALSO", "IGUAL", 
			"DIF", "MENORIG", "MAYORIG", "MENOR", "MAYOR", "MAS", "MENOS", "POR", 
			"DIV", "MOD", "POW", "AND", "OR", "NO", "IDENT", "DECIMAL", "ENTERO", 
			"CADENA", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294995776L) != 0)) {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCION:
					{
					setState(30);
					declaracion();
					}
					break;
				case T__5:
				case RETORNAR:
				case IMPRIMIR:
				case SI:
				case MIENTRAS:
				case PARA:
				case IDENT:
					{
					setState(31);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public FuncionDeclContext funcionDecl() {
			return getRuleContext(FuncionDeclContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			funcionDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(MiLenguajeParser.FUNCION, 0); }
		public TerminalNode IDENT() { return getToken(MiLenguajeParser.IDENT, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFuncionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionDeclContext funcionDecl() throws RecognitionException {
		FuncionDeclContext _localctx = new FuncionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(FUNCION);
			setState(42);
			match(IDENT);
			setState(43);
			match(T__0);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(44);
				parametros();
				}
			}

			setState(47);
			match(T__1);
			setState(48);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(MiLenguajeParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiLenguajeParser.IDENT, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IDENT);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(51);
				match(T__2);
				setState(52);
				match(IDENT);
				}
				}
				setState(57);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public SiStmtContext siStmt() {
			return getRuleContext(SiStmtContext.class,0);
		}
		public MientrasStmtContext mientrasStmt() {
			return getRuleContext(MientrasStmtContext.class,0);
		}
		public ParaStmtContext paraStmt() {
			return getRuleContext(ParaStmtContext.class,0);
		}
		public RetornarStmtContext retornarStmt() {
			return getRuleContext(RetornarStmtContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				asignacion();
				setState(59);
				match(T__3);
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				imprimir();
				setState(62);
				match(T__3);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				siStmt();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				mientrasStmt();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				paraStmt();
				}
				break;
			case RETORNAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				retornarStmt();
				setState(68);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MiLenguajeParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENT);
			setState(74);
			match(T__4);
			setState(75);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(MiLenguajeParser.IMPRIMIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IMPRIMIR);
			setState(78);
			match(T__0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66597257218L) != 0)) {
				{
				setState(79);
				expr(0);
				}
			}

			setState(82);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiStmtContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(MiLenguajeParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode SINO() { return getToken(MiLenguajeParser.SINO, 0); }
		public SiStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSiStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiStmtContext siStmt() throws RecognitionException {
		SiStmtContext _localctx = new SiStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_siStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(SI);
			setState(85);
			match(T__0);
			setState(86);
			expr(0);
			setState(87);
			match(T__1);
			setState(88);
			bloque();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(89);
				match(SINO);
				setState(90);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MientrasStmtContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(MiLenguajeParser.MIENTRAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public MientrasStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientrasStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMientrasStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasStmtContext mientrasStmt() throws RecognitionException {
		MientrasStmtContext _localctx = new MientrasStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mientrasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(MIENTRAS);
			setState(94);
			match(T__0);
			setState(95);
			expr(0);
			setState(96);
			match(T__1);
			setState(97);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParaStmtContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MiLenguajeParser.PARA, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaStmtContext paraStmt() throws RecognitionException {
		ParaStmtContext _localctx = new ParaStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paraStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PARA);
			setState(100);
			match(T__0);
			setState(101);
			asignacion();
			setState(102);
			match(T__3);
			setState(103);
			expr(0);
			setState(104);
			match(T__3);
			setState(105);
			asignacion();
			setState(106);
			match(T__1);
			setState(107);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetornarStmtContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(MiLenguajeParser.RETORNAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornarStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornarStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRetornarStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornarStmtContext retornarStmt() throws RecognitionException {
		RetornarStmtContext _localctx = new RetornarStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_retornarStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(RETORNAR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66597257218L) != 0)) {
				{
				setState(110);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__5);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294995520L) != 0)) {
				{
				{
				setState(114);
				statement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(MiLenguajeParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(MiLenguajeParser.DIF, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(MiLenguajeParser.MENOS, 0); }
		public TerminalNode NO() { return getToken(MiLenguajeParser.NO, 0); }
		public TerminalNode MAS() { return getToken(MiLenguajeParser.MAS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ExprContext {
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public PrimaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(MiLenguajeParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(MiLenguajeParser.MENOS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(MiLenguajeParser.POR, 0); }
		public TerminalNode DIV() { return getToken(MiLenguajeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiLenguajeParser.MOD, 0); }
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MiLenguajeParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(MiLenguajeParser.MENOR, 0); }
		public TerminalNode MENORIG() { return getToken(MiLenguajeParser.MENORIG, 0); }
		public TerminalNode MAYOR() { return getToken(MiLenguajeParser.MAYOR, 0); }
		public TerminalNode MAYORIG() { return getToken(MiLenguajeParser.MAYORIG, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MiLenguajeParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiLenguajeParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
			case MENOS:
			case NO:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172649472L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				expr(3);
				}
				break;
			case T__0:
			case VERDADERO:
			case FALSO:
			case IDENT:
			case DECIMAL:
			case ENTERO:
			case CADENA:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				prim();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(129);
						match(OR);
						setState(130);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(132);
						match(AND);
						setState(133);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(135);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(139);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(142);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						match(POW);
						setState(148);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiLenguajeParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prim);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADERO:
			case FALSO:
			case DECIMAL:
			case ENTERO:
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				literal();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(IDENT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__0);
				setState(157);
				expr(0);
				setState(158);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(MiLenguajeParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(MiLenguajeParser.DECIMAL, 0); }
		public TerminalNode VERDADERO() { return getToken(MiLenguajeParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(MiLenguajeParser.FALSO, 0); }
		public TerminalNode CADENA() { return getToken(MiLenguajeParser.CADENA, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129640448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Q\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\np\b"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000bt\b\u000b\n\u000b\f\u000bw\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u007f"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0096\b\f\n\f\f\f\u0099\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0001\u0018\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0006\u0002"+
		"\u0000\u0017\u0018\u001f\u001f\u0001\u0000\u0011\u0012\u0001\u0000\u0013"+
		"\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001b\u0002\u0000\u000f"+
		"\u0010!#\u00ad\u0000\"\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000"+
		"\u0000\u0004)\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b"+
		"G\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000"+
		"\u0000\u000eT\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000\u0012"+
		"c\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016q\u0001"+
		"\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u00a0\u0001\u0000"+
		"\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e!\u0003\u0002\u0001"+
		"\u0000\u001f!\u0003\b\u0004\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000"+
		"\'(\u0003\u0004\u0002\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005\b\u0000"+
		"\u0000*+\u0005 \u0000\u0000+-\u0005\u0001\u0000\u0000,.\u0003\u0006\u0003"+
		"\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0005\u0002\u0000\u000001\u0003\u0016\u000b\u00001\u0005"+
		"\u0001\u0000\u0000\u000027\u0005 \u0000\u000034\u0005\u0003\u0000\u0000"+
		"46\u0005 \u0000\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0007\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003\n\u0005\u0000;<\u0005\u0004"+
		"\u0000\u0000<H\u0001\u0000\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005\u0004"+
		"\u0000\u0000?H\u0001\u0000\u0000\u0000@H\u0003\u000e\u0007\u0000AH\u0003"+
		"\u0010\b\u0000BH\u0003\u0012\t\u0000CD\u0003\u0014\n\u0000DE\u0005\u0004"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FH\u0003\u0016\u000b\u0000G:\u0001"+
		"\u0000\u0000\u0000G=\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000"+
		"GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005 \u0000"+
		"\u0000JK\u0005\u0005\u0000\u0000KL\u0003\u0018\f\u0000L\u000b\u0001\u0000"+
		"\u0000\u0000MN\u0005\n\u0000\u0000NP\u0005\u0001\u0000\u0000OQ\u0003\u0018"+
		"\f\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0002\u0000\u0000S\r\u0001\u0000\u0000\u0000TU\u0005"+
		"\u000b\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0003\u0018\f\u0000WX\u0005"+
		"\u0002\u0000\u0000X[\u0003\u0016\u000b\u0000YZ\u0005\f\u0000\u0000Z\\"+
		"\u0003\u0016\u000b\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005\r\u0000\u0000^_\u0005\u0001"+
		"\u0000\u0000_`\u0003\u0018\f\u0000`a\u0005\u0002\u0000\u0000ab\u0003\u0016"+
		"\u000b\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0005\u000e\u0000\u0000"+
		"de\u0005\u0001\u0000\u0000ef\u0003\n\u0005\u0000fg\u0005\u0004\u0000\u0000"+
		"gh\u0003\u0018\f\u0000hi\u0005\u0004\u0000\u0000ij\u0003\n\u0005\u0000"+
		"jk\u0005\u0002\u0000\u0000kl\u0003\u0016\u000b\u0000l\u0013\u0001\u0000"+
		"\u0000\u0000mo\u0005\t\u0000\u0000np\u0003\u0018\f\u0000on\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u0015\u0001\u0000\u0000\u0000"+
		"qu\u0005\u0006\u0000\u0000rt\u0003\b\u0004\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0007"+
		"\u0000\u0000y\u0017\u0001\u0000\u0000\u0000z{\u0006\f\uffff\uffff\u0000"+
		"{|\u0007\u0000\u0000\u0000|\u007f\u0003\u0018\f\u0003}\u007f\u0003\u001a"+
		"\r\u0000~z\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0097"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\n\t\u0000\u0000\u0081\u0082\u0005"+
		"\u001e\u0000\u0000\u0082\u0096\u0003\u0018\f\n\u0083\u0084\n\b\u0000\u0000"+
		"\u0084\u0085\u0005\u001d\u0000\u0000\u0085\u0096\u0003\u0018\f\t\u0086"+
		"\u0087\n\u0007\u0000\u0000\u0087\u0088\u0007\u0001\u0000\u0000\u0088\u0096"+
		"\u0003\u0018\f\b\u0089\u008a\n\u0006\u0000\u0000\u008a\u008b\u0007\u0002"+
		"\u0000\u0000\u008b\u0096\u0003\u0018\f\u0007\u008c\u008d\n\u0005\u0000"+
		"\u0000\u008d\u008e\u0007\u0003\u0000\u0000\u008e\u0096\u0003\u0018\f\u0006"+
		"\u008f\u0090\n\u0004\u0000\u0000\u0090\u0091\u0007\u0004\u0000\u0000\u0091"+
		"\u0096\u0003\u0018\f\u0005\u0092\u0093\n\u0002\u0000\u0000\u0093\u0094"+
		"\u0005\u001c\u0000\u0000\u0094\u0096\u0003\u0018\f\u0003\u0095\u0080\u0001"+
		"\u0000\u0000\u0000\u0095\u0083\u0001\u0000\u0000\u0000\u0095\u0086\u0001"+
		"\u0000\u0000\u0000\u0095\u0089\u0001\u0000\u0000\u0000\u0095\u008c\u0001"+
		"\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0092\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0019\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u00a1\u0003"+
		"\u001c\u000e\u0000\u009b\u00a1\u0005 \u0000\u0000\u009c\u009d\u0005\u0001"+
		"\u0000\u0000\u009d\u009e\u0003\u0018\f\u0000\u009e\u009f\u0005\u0002\u0000"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000\u0000"+
		"\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000"+
		"\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0005\u0000"+
		"\u0000\u00a3\u001d\u0001\u0000\u0000\u0000\r \"-7GP[ou~\u0095\u0097\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}