/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Exp1GrammarAccess extends AbstractGrammarElementFinder {
	
	public class Exp1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.Exp1");
		private final Assignment cExpressoesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressoesExpressaoParserRuleCall_0 = (RuleCall)cExpressoesAssignment.eContents().get(0);
		
		//Exp1:
		//	expressoes+=Expressao*;
		@Override public ParserRule getRule() { return rule; }
		
		//expressoes+=Expressao*
		public Assignment getExpressoesAssignment() { return cExpressoesAssignment; }
		
		//Expressao
		public RuleCall getExpressoesExpressaoParserRuleCall_0() { return cExpressoesExpressaoParserRuleCall_0; }
	}
	public class ExpressaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.Expressao");
		private final RuleCall cExpCondicionalOrParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expressao:
		//	ExpCondicionalOr;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpCondicionalOr
		public RuleCall getExpCondicionalOrParserRuleCall() { return cExpCondicionalOrParserRuleCall; }
	}
	public class ExpCondicionalOrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ExpCondicionalOr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpCondicionalAndParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cOrKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpCondicionalAndParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//ExpCondicionalOr:
		//	ExpCondicionalAnd ("or" ExpCondicionalAnd)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpCondicionalAnd ("or" ExpCondicionalAnd)*
		public Group getGroup() { return cGroup; }
		
		//ExpCondicionalAnd
		public RuleCall getExpCondicionalAndParserRuleCall_0() { return cExpCondicionalAndParserRuleCall_0; }
		
		//("or" ExpCondicionalAnd)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"or"
		public Keyword getOrKeyword_1_0() { return cOrKeyword_1_0; }
		
		//ExpCondicionalAnd
		public RuleCall getExpCondicionalAndParserRuleCall_1_1() { return cExpCondicionalAndParserRuleCall_1_1; }
	}
	public class ExpCondicionalAndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ExpCondicionalAnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpIgualdadeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAndKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpIgualdadeParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//ExpCondicionalAnd:
		//	ExpIgualdade ("and" ExpIgualdade)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpIgualdade ("and" ExpIgualdade)*
		public Group getGroup() { return cGroup; }
		
		//ExpIgualdade
		public RuleCall getExpIgualdadeParserRuleCall_0() { return cExpIgualdadeParserRuleCall_0; }
		
		//("and" ExpIgualdade)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"and"
		public Keyword getAndKeyword_1_0() { return cAndKeyword_1_0; }
		
		//ExpIgualdade
		public RuleCall getExpIgualdadeParserRuleCall_1_1() { return cExpIgualdadeParserRuleCall_1_1; }
	}
	public class ExpIgualdadeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ExpIgualdade");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpAritmeticaParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpAritmeticaParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//ExpIgualdade:
		//	ExpAritmetica ("==" ExpAritmetica)?;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpAritmetica ("==" ExpAritmetica)?
		public Group getGroup() { return cGroup; }
		
		//ExpAritmetica
		public RuleCall getExpAritmeticaParserRuleCall_0() { return cExpAritmeticaParserRuleCall_0; }
		
		//("==" ExpAritmetica)?
		public Group getGroup_1() { return cGroup_1; }
		
		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_1_0() { return cEqualsSignEqualsSignKeyword_1_0; }
		
		//ExpAritmetica
		public RuleCall getExpAritmeticaParserRuleCall_1_1() { return cExpAritmeticaParserRuleCall_1_1; }
	}
	public class ExpAritmeticaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ExpAritmetica");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpConcatenacaoParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final RuleCall cExpConcatenacaoParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//ExpAritmetica:
		//	ExpConcatenacao (("+" | "-") ExpConcatenacao)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpConcatenacao (("+" | "-") ExpConcatenacao)*
		public Group getGroup() { return cGroup; }
		
		//ExpConcatenacao
		public RuleCall getExpConcatenacaoParserRuleCall_0() { return cExpConcatenacaoParserRuleCall_0; }
		
		//(("+" | "-") ExpConcatenacao)*
		public Group getGroup_1() { return cGroup_1; }
		
		//("+" | "-")
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//"+"
		public Keyword getPlusSignKeyword_1_0_0() { return cPlusSignKeyword_1_0_0; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_1_0_1() { return cHyphenMinusKeyword_1_0_1; }
		
		//ExpConcatenacao
		public RuleCall getExpConcatenacaoParserRuleCall_1_1() { return cExpConcatenacaoParserRuleCall_1_1; }
	}
	public class ExpConcatenacaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ExpConcatenacao");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExpUnariaParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cPlusSignPlusSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpUnariaParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//ExpConcatenacao:
		//	ExpUnaria ("++" ExpUnaria)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExpUnaria ("++" ExpUnaria)*
		public Group getGroup() { return cGroup; }
		
		//ExpUnaria
		public RuleCall getExpUnariaParserRuleCall_0() { return cExpUnariaParserRuleCall_0; }
		
		//("++" ExpUnaria)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"++"
		public Keyword getPlusSignPlusSignKeyword_1_0() { return cPlusSignPlusSignKeyword_1_0; }
		
		//ExpUnaria
		public RuleCall getExpUnariaParserRuleCall_1_1() { return cExpUnariaParserRuleCall_1_1; }
	}
	public class ExpUnariaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ExpUnaria");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressaoParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNotKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpressaoParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLengthKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cExpressaoParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cValorConcretoParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ExpUnaria:
		//	"-" Expressao | "not" Expressao | "length" Expressao | ValorConcreto;
		@Override public ParserRule getRule() { return rule; }
		
		//"-" Expressao | "not" Expressao | "length" Expressao | ValorConcreto
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"-" Expressao
		public Group getGroup_0() { return cGroup_0; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//Expressao
		public RuleCall getExpressaoParserRuleCall_0_1() { return cExpressaoParserRuleCall_0_1; }
		
		//"not" Expressao
		public Group getGroup_1() { return cGroup_1; }
		
		//"not"
		public Keyword getNotKeyword_1_0() { return cNotKeyword_1_0; }
		
		//Expressao
		public RuleCall getExpressaoParserRuleCall_1_1() { return cExpressaoParserRuleCall_1_1; }
		
		//"length" Expressao
		public Group getGroup_2() { return cGroup_2; }
		
		//"length"
		public Keyword getLengthKeyword_2_0() { return cLengthKeyword_2_0; }
		
		//Expressao
		public RuleCall getExpressaoParserRuleCall_2_1() { return cExpressaoParserRuleCall_2_1; }
		
		//ValorConcreto
		public RuleCall getValorConcretoParserRuleCall_3() { return cValorConcretoParserRuleCall_3; }
	}
	public class ValorConcretoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.ValorConcreto");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVALORINTEIROTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVALORBOOLEANOTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVALORSTRINGTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ValorConcreto:
		//	VALORINTEIRO | VALORBOOLEANO | VALORSTRING;
		@Override public ParserRule getRule() { return rule; }
		
		//VALORINTEIRO | VALORBOOLEANO | VALORSTRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VALORINTEIRO
		public RuleCall getVALORINTEIROTerminalRuleCall_0() { return cVALORINTEIROTerminalRuleCall_0; }
		
		//VALORBOOLEANO
		public RuleCall getVALORBOOLEANOTerminalRuleCall_1() { return cVALORBOOLEANOTerminalRuleCall_1; }
		
		//VALORSTRING
		public RuleCall getVALORSTRINGTerminalRuleCall_2() { return cVALORSTRINGTerminalRuleCall_2; }
	}
	
	
	private final Exp1Elements pExp1;
	private final ExpressaoElements pExpressao;
	private final ExpCondicionalOrElements pExpCondicionalOr;
	private final ExpCondicionalAndElements pExpCondicionalAnd;
	private final ExpIgualdadeElements pExpIgualdade;
	private final ExpAritmeticaElements pExpAritmetica;
	private final ExpConcatenacaoElements pExpConcatenacao;
	private final ExpUnariaElements pExpUnaria;
	private final ValorConcretoElements pValorConcreto;
	private final TerminalRule tVALORINTEIRO;
	private final TerminalRule tVALORBOOLEANO;
	private final TerminalRule tVALORSTRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Exp1GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pExp1 = new Exp1Elements();
		this.pExpressao = new ExpressaoElements();
		this.pExpCondicionalOr = new ExpCondicionalOrElements();
		this.pExpCondicionalAnd = new ExpCondicionalAndElements();
		this.pExpIgualdade = new ExpIgualdadeElements();
		this.pExpAritmetica = new ExpAritmeticaElements();
		this.pExpConcatenacao = new ExpConcatenacaoElements();
		this.pExpUnaria = new ExpUnariaElements();
		this.pValorConcreto = new ValorConcretoElements();
		this.tVALORINTEIRO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.VALORINTEIRO");
		this.tVALORBOOLEANO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.VALORBOOLEANO");
		this.tVALORSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.exp1.Exp1.VALORSTRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.exp1.Exp1".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Exp1:
	//	expressoes+=Expressao*;
	public Exp1Elements getExp1Access() {
		return pExp1;
	}
	
	public ParserRule getExp1Rule() {
		return getExp1Access().getRule();
	}
	
	//Expressao:
	//	ExpCondicionalOr;
	public ExpressaoElements getExpressaoAccess() {
		return pExpressao;
	}
	
	public ParserRule getExpressaoRule() {
		return getExpressaoAccess().getRule();
	}
	
	//ExpCondicionalOr:
	//	ExpCondicionalAnd ("or" ExpCondicionalAnd)*;
	public ExpCondicionalOrElements getExpCondicionalOrAccess() {
		return pExpCondicionalOr;
	}
	
	public ParserRule getExpCondicionalOrRule() {
		return getExpCondicionalOrAccess().getRule();
	}
	
	//ExpCondicionalAnd:
	//	ExpIgualdade ("and" ExpIgualdade)*;
	public ExpCondicionalAndElements getExpCondicionalAndAccess() {
		return pExpCondicionalAnd;
	}
	
	public ParserRule getExpCondicionalAndRule() {
		return getExpCondicionalAndAccess().getRule();
	}
	
	//ExpIgualdade:
	//	ExpAritmetica ("==" ExpAritmetica)?;
	public ExpIgualdadeElements getExpIgualdadeAccess() {
		return pExpIgualdade;
	}
	
	public ParserRule getExpIgualdadeRule() {
		return getExpIgualdadeAccess().getRule();
	}
	
	//ExpAritmetica:
	//	ExpConcatenacao (("+" | "-") ExpConcatenacao)*;
	public ExpAritmeticaElements getExpAritmeticaAccess() {
		return pExpAritmetica;
	}
	
	public ParserRule getExpAritmeticaRule() {
		return getExpAritmeticaAccess().getRule();
	}
	
	//ExpConcatenacao:
	//	ExpUnaria ("++" ExpUnaria)*;
	public ExpConcatenacaoElements getExpConcatenacaoAccess() {
		return pExpConcatenacao;
	}
	
	public ParserRule getExpConcatenacaoRule() {
		return getExpConcatenacaoAccess().getRule();
	}
	
	//ExpUnaria:
	//	"-" Expressao | "not" Expressao | "length" Expressao | ValorConcreto;
	public ExpUnariaElements getExpUnariaAccess() {
		return pExpUnaria;
	}
	
	public ParserRule getExpUnariaRule() {
		return getExpUnariaAccess().getRule();
	}
	
	//ValorConcreto:
	//	VALORINTEIRO | VALORBOOLEANO | VALORSTRING;
	public ValorConcretoElements getValorConcretoAccess() {
		return pValorConcreto;
	}
	
	public ParserRule getValorConcretoRule() {
		return getValorConcretoAccess().getRule();
	}
	
	//terminal VALORINTEIRO:
	//	'1'..'9' '0'..'9'*;
	public TerminalRule getVALORINTEIRORule() {
		return tVALORINTEIRO;
	}
	
	//terminal VALORBOOLEANO:
	//	'true' | 'false';
	public TerminalRule getVALORBOOLEANORule() {
		return tVALORBOOLEANO;
	}
	
	//terminal VALORSTRING:
	//	'a'..'z'?;
	public TerminalRule getVALORSTRINGRule() {
		return tVALORSTRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}