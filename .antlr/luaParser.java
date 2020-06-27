// Generated from /home/stargazermiao/workspace/java/lua-antlr/lua.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class luaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, RESERVED=29, NIL=30, BOOL=31, 
		BINOP=32, UNOP=33, FIELDSEP=34, ID=35, ESACPE_CHAR=36, BYTE=37, NUMBERAL=38, 
		LITERAL_STRING=39, COMMENT=40, LINE_COMMENT=41, LETTER=42, DIGIT=43, WS=44;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_retstat = 3, RULE_label = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_var = 7, RULE_varsuffix = 8, 
		RULE_namelist = 9, RULE_explist = 10, RULE_exp = 11, RULE_functioncall = 12, 
		RULE_functioncallsuffix = 13, RULE_args = 14, RULE_functiondef = 15, RULE_funcbody = 16, 
		RULE_parlist = 17, RULE_tableconstructor = 18, RULE_fieldlist = 19, RULE_field = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "stat", "retstat", "label", "funcname", "varlist", 
			"var", "varsuffix", "namelist", "explist", "exp", "functioncall", "functioncallsuffix", 
			"args", "functiondef", "funcbody", "parlist", "tableconstructor", "fieldlist", 
			"field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'break'", "'goto'", "'do'", "'end'", "'while'", 
			"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
			"','", "'function'", "'local'", "'return'", "'::'", "'.'", "':'", "'('", 
			"')'", "'['", "']'", "'...'", "'{'", "'}'", null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "RESERVED", "NIL", "BOOL", "BINOP", "UNOP", 
			"FIELDSEP", "ID", "ESACPE_CHAR", "BYTE", "NUMBERAL", "LITERAL_STRING", 
			"COMMENT", "LINE_COMMENT", "LETTER", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public luaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(luaParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			block();
			setState(43);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				stat();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(51);
				retstat();
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

	public static class StatContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode ID() { return getToken(luaParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				varlist();
				setState(56);
				match(T__1);
				setState(57);
				explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(T__3);
				setState(63);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(T__4);
				setState(65);
				block();
				setState(66);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				match(T__6);
				setState(69);
				exp(0);
				setState(70);
				match(T__4);
				setState(71);
				block();
				setState(72);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				match(T__7);
				setState(75);
				block();
				setState(76);
				match(T__8);
				setState(77);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				match(T__9);
				setState(80);
				exp(0);
				setState(81);
				match(T__10);
				setState(82);
				block();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(83);
					match(T__11);
					setState(84);
					exp(0);
					setState(85);
					match(T__10);
					setState(86);
					block();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(93);
					match(T__12);
					setState(94);
					block();
					}
				}

				setState(97);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(99);
				match(T__13);
				setState(100);
				match(ID);
				setState(101);
				match(T__1);
				setState(102);
				exp(0);
				setState(103);
				match(T__14);
				setState(104);
				exp(0);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(105);
					match(T__14);
					setState(106);
					exp(0);
					}
				}

				setState(109);
				match(T__4);
				setState(110);
				block();
				setState(111);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				match(T__15);
				setState(114);
				funcname();
				setState(115);
				funcbody();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(117);
				match(T__16);
				setState(118);
				match(T__15);
				setState(119);
				match(ID);
				setState(120);
				funcbody();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(121);
				match(T__16);
				setState(122);
				namelist();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(123);
					match(T__1);
					setState(124);
					explist();
					}
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

	public static class RetstatContext extends ParserRuleContext {
		public List<ExplistContext> explist() {
			return getRuleContexts(ExplistContext.class);
		}
		public ExplistContext explist(int i) {
			return getRuleContext(ExplistContext.class,i);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__17);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << NIL) | (1L << BOOL) | (1L << UNOP) | (1L << ID) | (1L << NUMBERAL) | (1L << LITERAL_STRING))) != 0)) {
				{
				{
				setState(130);
				explist();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(136);
				match(T__0);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(luaParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__18);
			setState(140);
			match(ID);
			setState(141);
			match(T__18);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(luaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(luaParser.ID, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(144);
				match(T__19);
				setState(145);
				match(ID);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(151);
				match(T__20);
				setState(152);
				match(ID);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			var();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(156);
				match(T__14);
				setState(157);
				var();
				}
				}
				setState(162);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(luaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarsuffixContext> varsuffix() {
			return getRuleContexts(VarsuffixContext.class);
		}
		public VarsuffixContext varsuffix(int i) {
			return getRuleContext(VarsuffixContext.class,i);
		}
		public List<FunctioncallsuffixContext> functioncallsuffix() {
			return getRuleContexts(FunctioncallsuffixContext.class);
		}
		public FunctioncallsuffixContext functioncallsuffix(int i) {
			return getRuleContext(FunctioncallsuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(163);
				match(ID);
				}
				break;
			case T__21:
				{
				setState(164);
				match(T__21);
				setState(165);
				exp(0);
				setState(166);
				match(T__22);
				setState(167);
				varsuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__20:
					case T__21:
					case T__26:
					case LITERAL_STRING:
						{
						setState(171);
						functioncallsuffix();
						}
						break;
					case T__19:
					case T__23:
						{
						setState(172);
						varsuffix();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					varsuffix();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class VarsuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(luaParser.ID, 0); }
		public VarsuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsuffix; }
	}

	public final VarsuffixContext varsuffix() throws RecognitionException {
		VarsuffixContext _localctx = new VarsuffixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varsuffix);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__23);
				setState(185);
				exp(0);
				setState(186);
				match(T__24);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__19);
				setState(189);
				match(ID);
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

	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(luaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(luaParser.ID, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(T__14);
					setState(194);
					match(ID);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			exp(0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(201);
				match(T__14);
				setState(202);
				exp(0);
				}
				}
				setState(207);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(luaParser.NIL, 0); }
		public TerminalNode BOOL() { return getToken(luaParser.BOOL, 0); }
		public TerminalNode NUMBERAL() { return getToken(luaParser.NUMBERAL, 0); }
		public TerminalNode LITERAL_STRING() { return getToken(luaParser.LITERAL_STRING, 0); }
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TerminalNode UNOP() { return getToken(luaParser.UNOP, 0); }
		public TerminalNode BINOP() { return getToken(luaParser.BINOP, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(209);
				match(NIL);
				}
				break;
			case 2:
				{
				setState(210);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(211);
				match(NUMBERAL);
				}
				break;
			case 4:
				{
				setState(212);
				match(LITERAL_STRING);
				}
				break;
			case 5:
				{
				setState(213);
				match(T__25);
				}
				break;
			case 6:
				{
				setState(214);
				functiondef();
				}
				break;
			case 7:
				{
				setState(215);
				match(T__21);
				setState(216);
				exp(0);
				setState(217);
				match(T__22);
				}
				break;
			case 8:
				{
				setState(219);
				functioncall();
				}
				break;
			case 9:
				{
				setState(220);
				var();
				}
				break;
			case 10:
				{
				setState(221);
				tableconstructor();
				}
				break;
			case 11:
				{
				setState(222);
				match(UNOP);
				setState(223);
				exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(226);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(227);
					match(BINOP);
					setState(228);
					exp(3);
					}
					} 
				}
				setState(233);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<FunctioncallsuffixContext> functioncallsuffix() {
			return getRuleContexts(FunctioncallsuffixContext.class);
		}
		public FunctioncallsuffixContext functioncallsuffix(int i) {
			return getRuleContext(FunctioncallsuffixContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(234);
				var();
				}
				break;
			case 2:
				{
				setState(235);
				match(T__21);
				setState(236);
				exp(0);
				setState(237);
				match(T__22);
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					functioncallsuffix();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class FunctioncallsuffixContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(luaParser.ID, 0); }
		public FunctioncallsuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncallsuffix; }
	}

	public final FunctioncallsuffixContext functioncallsuffix() throws RecognitionException {
		FunctioncallsuffixContext _localctx = new FunctioncallsuffixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functioncallsuffix);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__26:
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				args();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__20);
				setState(249);
				match(ID);
				setState(250);
				args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public TerminalNode LITERAL_STRING() { return getToken(luaParser.LITERAL_STRING, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__21);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << NIL) | (1L << BOOL) | (1L << UNOP) | (1L << ID) | (1L << NUMBERAL) | (1L << LITERAL_STRING))) != 0)) {
					{
					setState(254);
					explist();
					}
				}

				setState(257);
				match(T__22);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				tableconstructor();
				}
				break;
			case LITERAL_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(LITERAL_STRING);
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

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__15);
			setState(263);
			funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__21);
			setState(266);
			parlist();
			setState(267);
			match(T__22);
			setState(268);
			block();
			setState(269);
			match(T__5);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parlist);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				namelist();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(272);
					match(T__14);
					setState(273);
					match(T__25);
					}
				}

				setState(276);
				match(T__25);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__25);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__26);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << NIL) | (1L << BOOL) | (1L << UNOP) | (1L << ID) | (1L << NUMBERAL) | (1L << LITERAL_STRING))) != 0)) {
				{
				setState(282);
				fieldlist();
				}
			}

			setState(285);
			match(T__27);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> FIELDSEP() { return getTokens(luaParser.FIELDSEP); }
		public TerminalNode FIELDSEP(int i) {
			return getToken(luaParser.FIELDSEP, i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			field();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(FIELDSEP);
					setState(289);
					field();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIELDSEP) {
				{
				setState(295);
				match(FIELDSEP);
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

	public static class FieldContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(luaParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(T__23);
				setState(299);
				exp(0);
				setState(300);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__1);
				setState(303);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(ID);
				setState(305);
				match(T__1);
				setState(306);
				exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				exp(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\7\3\61\n\3\f"+
		"\3\16\3\64\13\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\5\4b\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\5\4\u0082\n\4"+
		"\3\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\5\5\5\u008c\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\5\7\u009c"+
		"\n\7\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ac\n\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\3\t\7\t\u00b6"+
		"\n\t\f\t\16\t\u00b9\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c1\n\n\3\13\3"+
		"\13\3\13\7\13\u00c6\n\13\f\13\16\13\u00c9\13\13\3\f\3\f\3\f\7\f\u00ce"+
		"\n\f\f\f\16\f\u00d1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\r\3\r\3\r\7\r\u00e8\n\r\f\r\16\r\u00eb"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00f2\n\16\3\16\7\16\u00f5\n\16\f"+
		"\16\16\16\u00f8\13\16\3\17\3\17\3\17\3\17\5\17\u00fe\n\17\3\20\3\20\5"+
		"\20\u0102\n\20\3\20\3\20\3\20\5\20\u0107\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0115\n\23\3\23\3\23\3\23\5\23"+
		"\u011a\n\23\3\24\3\24\5\24\u011e\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u0125"+
		"\n\25\f\25\16\25\u0128\13\25\3\25\5\25\u012b\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0137\n\26\3\26\2\3\30\27\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u015b\2,\3\2\2\2\4\62\3\2"+
		"\2\2\6\u0081\3\2\2\2\b\u0083\3\2\2\2\n\u008d\3\2\2\2\f\u0091\3\2\2\2\16"+
		"\u009d\3\2\2\2\20\u00ab\3\2\2\2\22\u00c0\3\2\2\2\24\u00c2\3\2\2\2\26\u00ca"+
		"\3\2\2\2\30\u00e2\3\2\2\2\32\u00f1\3\2\2\2\34\u00fd\3\2\2\2\36\u0106\3"+
		"\2\2\2 \u0108\3\2\2\2\"\u010b\3\2\2\2$\u0119\3\2\2\2&\u011b\3\2\2\2(\u0121"+
		"\3\2\2\2*\u0136\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2/\61\5\6\4\2\60"+
		"/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\u0082"+
		"\7\3\2\29:\5\16\b\2:;\7\4\2\2;<\5\26\f\2<\u0082\3\2\2\2=\u0082\5\32\16"+
		"\2>\u0082\5\n\6\2?\u0082\7\5\2\2@A\7\6\2\2A\u0082\7%\2\2BC\7\7\2\2CD\5"+
		"\4\3\2DE\7\b\2\2E\u0082\3\2\2\2FG\7\t\2\2GH\5\30\r\2HI\7\7\2\2IJ\5\4\3"+
		"\2JK\7\b\2\2K\u0082\3\2\2\2LM\7\n\2\2MN\5\4\3\2NO\7\13\2\2OP\5\30\r\2"+
		"P\u0082\3\2\2\2QR\7\f\2\2RS\5\30\r\2ST\7\r\2\2T\\\5\4\3\2UV\7\16\2\2V"+
		"W\5\30\r\2WX\7\r\2\2XY\5\4\3\2Y[\3\2\2\2ZU\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_`\7\17\2\2`b\5\4\3\2a_\3\2\2\2ab\3"+
		"\2\2\2bc\3\2\2\2cd\7\b\2\2d\u0082\3\2\2\2ef\7\20\2\2fg\7%\2\2gh\7\4\2"+
		"\2hi\5\30\r\2ij\7\21\2\2jm\5\30\r\2kl\7\21\2\2ln\5\30\r\2mk\3\2\2\2mn"+
		"\3\2\2\2no\3\2\2\2op\7\7\2\2pq\5\4\3\2qr\7\b\2\2r\u0082\3\2\2\2st\7\22"+
		"\2\2tu\5\f\7\2uv\5\"\22\2v\u0082\3\2\2\2wx\7\23\2\2xy\7\22\2\2yz\7%\2"+
		"\2z\u0082\5\"\22\2{|\7\23\2\2|\177\5\24\13\2}~\7\4\2\2~\u0080\5\26\f\2"+
		"\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u00818\3\2\2\2\u0081"+
		"9\3\2\2\2\u0081=\3\2\2\2\u0081>\3\2\2\2\u0081?\3\2\2\2\u0081@\3\2\2\2"+
		"\u0081B\3\2\2\2\u0081F\3\2\2\2\u0081L\3\2\2\2\u0081Q\3\2\2\2\u0081e\3"+
		"\2\2\2\u0081s\3\2\2\2\u0081w\3\2\2\2\u0081{\3\2\2\2\u0082\7\3\2\2\2\u0083"+
		"\u0087\7\24\2\2\u0084\u0086\5\26\f\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\7\3\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\t\3\2\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7%\2\2\u008f\u0090"+
		"\7\25\2\2\u0090\13\3\2\2\2\u0091\u0096\7%\2\2\u0092\u0093\7\26\2\2\u0093"+
		"\u0095\7%\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u009b\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7\27\2\2\u009a\u009c\7%\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\r\3\2\2\2\u009d\u00a2\5\20\t\2\u009e\u009f\7\21\2\2\u009f\u00a1"+
		"\5\20\t\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00ac"+
		"\7%\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\31\2\2"+
		"\u00a9\u00aa\5\22\n\2\u00aa\u00ac\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ac\u00b1\3\2\2\2\u00ad\u00b0\5\34\17\2\u00ae\u00b0\5\22\n"+
		"\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b6\5\22\n\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\32\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\7\33\2\2\u00bd\u00c1"+
		"\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c1\7%\2\2\u00c0\u00ba\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\23\3\2\2\2\u00c2\u00c7\7%\2\2\u00c3\u00c4\7\21\2"+
		"\2\u00c4\u00c6\7%\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\25\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cf\5\30\r\2\u00cb\u00cc\7\21\2\2\u00cc\u00ce\5\30\r\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\27\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\r\1\2\u00d3\u00e3\7 \2\2"+
		"\u00d4\u00e3\7!\2\2\u00d5\u00e3\7(\2\2\u00d6\u00e3\7)\2\2\u00d7\u00e3"+
		"\7\34\2\2\u00d8\u00e3\5 \21\2\u00d9\u00da\7\30\2\2\u00da\u00db\5\30\r"+
		"\2\u00db\u00dc\7\31\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00e3\5\32\16\2\u00de"+
		"\u00e3\5\20\t\2\u00df\u00e3\5&\24\2\u00e0\u00e1\7#\2\2\u00e1\u00e3\5\30"+
		"\r\3\u00e2\u00d2\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d5\3\2\2\2\u00e2"+
		"\u00d6\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e2\u00d9\3\2"+
		"\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5\f\4\2\2\u00e5\u00e6\7\""+
		"\2\2\u00e6\u00e8\5\30\r\5\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\31\3\2\2\2\u00eb\u00e9\3\2\2"+
		"\2\u00ec\u00f2\5\20\t\2\u00ed\u00ee\7\30\2\2\u00ee\u00ef\5\30\r\2\u00ef"+
		"\u00f0\7\31\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3"+
		"\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\5\34\17\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\33\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f9\u00fe\5\36\20\2\u00fa\u00fb\7\27\2\2\u00fb"+
		"\u00fc\7%\2\2\u00fc\u00fe\5\36\20\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3"+
		"\2\2\2\u00fe\35\3\2\2\2\u00ff\u0101\7\30\2\2\u0100\u0102\5\26\f\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0107\7\31"+
		"\2\2\u0104\u0107\5&\24\2\u0105\u0107\7)\2\2\u0106\u00ff\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\37\3\2\2\2\u0108\u0109\7\22\2"+
		"\2\u0109\u010a\5\"\22\2\u010a!\3\2\2\2\u010b\u010c\7\30\2\2\u010c\u010d"+
		"\5$\23\2\u010d\u010e\7\31\2\2\u010e\u010f\5\4\3\2\u010f\u0110\7\b\2\2"+
		"\u0110#\3\2\2\2\u0111\u0114\5\24\13\2\u0112\u0113\7\21\2\2\u0113\u0115"+
		"\7\34\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116\u0117\7\34\2\2\u0117\u011a\3\2\2\2\u0118\u011a\7\34\2\2\u0119\u0111"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a%\3\2\2\2\u011b\u011d\7\35\2\2\u011c"+
		"\u011e\5(\25\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\7\36\2\2\u0120\'\3\2\2\2\u0121\u0126\5*\26\2\u0122\u0123"+
		"\7$\2\2\u0123\u0125\5*\26\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012b\7$\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		")\3\2\2\2\u012c\u012d\7\32\2\2\u012d\u012e\5\30\r\2\u012e\u012f\7\33\2"+
		"\2\u012f\u0137\3\2\2\2\u0130\u0131\7\4\2\2\u0131\u0137\5\30\r\2\u0132"+
		"\u0133\7%\2\2\u0133\u0134\7\4\2\2\u0134\u0137\5\30\r\2\u0135\u0137\5\30"+
		"\r\2\u0136\u012c\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137+\3\2\2\2\"\62\66\\am\177\u0081\u0087\u008b\u0096"+
		"\u009b\u00a2\u00ab\u00af\u00b1\u00b7\u00c0\u00c7\u00cf\u00e2\u00e9\u00f1"+
		"\u00f6\u00fd\u0101\u0106\u0114\u0119\u011d\u0126\u012a\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}