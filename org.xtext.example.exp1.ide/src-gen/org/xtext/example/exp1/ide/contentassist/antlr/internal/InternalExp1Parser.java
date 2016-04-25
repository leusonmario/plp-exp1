package org.xtext.example.exp1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.exp1.services.Exp1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExp1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALORINTEIRO", "RULE_VALORBOOLEANO", "RULE_VALORSTRING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'or'", "'and'", "'=='", "'++'", "'not'", "'length'"
    };
    public static final int RULE_VALORINTEIRO=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_VALORBOOLEANO=5;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_VALORSTRING=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExp1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExp1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExp1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalExp1.g"; }


    	private Exp1GrammarAccess grammarAccess;

    	public void setGrammarAccess(Exp1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleExp1"
    // InternalExp1.g:53:1: entryRuleExp1 : ruleExp1 EOF ;
    public final void entryRuleExp1() throws RecognitionException {
        try {
            // InternalExp1.g:54:1: ( ruleExp1 EOF )
            // InternalExp1.g:55:1: ruleExp1 EOF
            {
             before(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExp1();

            state._fsp--;

             after(grammarAccess.getExp1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // InternalExp1.g:62:1: ruleExp1 : ( ( rule__Exp1__ExpressoesAssignment )* ) ;
    public final void ruleExp1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:66:2: ( ( ( rule__Exp1__ExpressoesAssignment )* ) )
            // InternalExp1.g:67:2: ( ( rule__Exp1__ExpressoesAssignment )* )
            {
            // InternalExp1.g:67:2: ( ( rule__Exp1__ExpressoesAssignment )* )
            // InternalExp1.g:68:3: ( rule__Exp1__ExpressoesAssignment )*
            {
             before(grammarAccess.getExp1Access().getExpressoesAssignment()); 
            // InternalExp1.g:69:3: ( rule__Exp1__ExpressoesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_VALORINTEIRO && LA1_0<=RULE_VALORSTRING)||LA1_0==15||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExp1.g:69:4: rule__Exp1__ExpressoesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Exp1__ExpressoesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExp1Access().getExpressoesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleExpressao"
    // InternalExp1.g:78:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalExp1.g:79:1: ( ruleExpressao EOF )
            // InternalExp1.g:80:1: ruleExpressao EOF
            {
             before(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalExp1.g:87:1: ruleExpressao : ( ruleExpCondicionalOr ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:91:2: ( ( ruleExpCondicionalOr ) )
            // InternalExp1.g:92:2: ( ruleExpCondicionalOr )
            {
            // InternalExp1.g:92:2: ( ruleExpCondicionalOr )
            // InternalExp1.g:93:3: ruleExpCondicionalOr
            {
             before(grammarAccess.getExpressaoAccess().getExpCondicionalOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpCondicionalOr();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getExpCondicionalOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleExpCondicionalOr"
    // InternalExp1.g:103:1: entryRuleExpCondicionalOr : ruleExpCondicionalOr EOF ;
    public final void entryRuleExpCondicionalOr() throws RecognitionException {
        try {
            // InternalExp1.g:104:1: ( ruleExpCondicionalOr EOF )
            // InternalExp1.g:105:1: ruleExpCondicionalOr EOF
            {
             before(grammarAccess.getExpCondicionalOrRule()); 
            pushFollow(FOLLOW_1);
            ruleExpCondicionalOr();

            state._fsp--;

             after(grammarAccess.getExpCondicionalOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpCondicionalOr"


    // $ANTLR start "ruleExpCondicionalOr"
    // InternalExp1.g:112:1: ruleExpCondicionalOr : ( ( rule__ExpCondicionalOr__Group__0 ) ) ;
    public final void ruleExpCondicionalOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:116:2: ( ( ( rule__ExpCondicionalOr__Group__0 ) ) )
            // InternalExp1.g:117:2: ( ( rule__ExpCondicionalOr__Group__0 ) )
            {
            // InternalExp1.g:117:2: ( ( rule__ExpCondicionalOr__Group__0 ) )
            // InternalExp1.g:118:3: ( rule__ExpCondicionalOr__Group__0 )
            {
             before(grammarAccess.getExpCondicionalOrAccess().getGroup()); 
            // InternalExp1.g:119:3: ( rule__ExpCondicionalOr__Group__0 )
            // InternalExp1.g:119:4: rule__ExpCondicionalOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpCondicionalOr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpCondicionalOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpCondicionalOr"


    // $ANTLR start "entryRuleExpCondicionalAnd"
    // InternalExp1.g:128:1: entryRuleExpCondicionalAnd : ruleExpCondicionalAnd EOF ;
    public final void entryRuleExpCondicionalAnd() throws RecognitionException {
        try {
            // InternalExp1.g:129:1: ( ruleExpCondicionalAnd EOF )
            // InternalExp1.g:130:1: ruleExpCondicionalAnd EOF
            {
             before(grammarAccess.getExpCondicionalAndRule()); 
            pushFollow(FOLLOW_1);
            ruleExpCondicionalAnd();

            state._fsp--;

             after(grammarAccess.getExpCondicionalAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpCondicionalAnd"


    // $ANTLR start "ruleExpCondicionalAnd"
    // InternalExp1.g:137:1: ruleExpCondicionalAnd : ( ( rule__ExpCondicionalAnd__Group__0 ) ) ;
    public final void ruleExpCondicionalAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:141:2: ( ( ( rule__ExpCondicionalAnd__Group__0 ) ) )
            // InternalExp1.g:142:2: ( ( rule__ExpCondicionalAnd__Group__0 ) )
            {
            // InternalExp1.g:142:2: ( ( rule__ExpCondicionalAnd__Group__0 ) )
            // InternalExp1.g:143:3: ( rule__ExpCondicionalAnd__Group__0 )
            {
             before(grammarAccess.getExpCondicionalAndAccess().getGroup()); 
            // InternalExp1.g:144:3: ( rule__ExpCondicionalAnd__Group__0 )
            // InternalExp1.g:144:4: rule__ExpCondicionalAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpCondicionalAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpCondicionalAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpCondicionalAnd"


    // $ANTLR start "entryRuleExpIgualdade"
    // InternalExp1.g:153:1: entryRuleExpIgualdade : ruleExpIgualdade EOF ;
    public final void entryRuleExpIgualdade() throws RecognitionException {
        try {
            // InternalExp1.g:154:1: ( ruleExpIgualdade EOF )
            // InternalExp1.g:155:1: ruleExpIgualdade EOF
            {
             before(grammarAccess.getExpIgualdadeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpIgualdade();

            state._fsp--;

             after(grammarAccess.getExpIgualdadeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpIgualdade"


    // $ANTLR start "ruleExpIgualdade"
    // InternalExp1.g:162:1: ruleExpIgualdade : ( ( rule__ExpIgualdade__Group__0 ) ) ;
    public final void ruleExpIgualdade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:166:2: ( ( ( rule__ExpIgualdade__Group__0 ) ) )
            // InternalExp1.g:167:2: ( ( rule__ExpIgualdade__Group__0 ) )
            {
            // InternalExp1.g:167:2: ( ( rule__ExpIgualdade__Group__0 ) )
            // InternalExp1.g:168:3: ( rule__ExpIgualdade__Group__0 )
            {
             before(grammarAccess.getExpIgualdadeAccess().getGroup()); 
            // InternalExp1.g:169:3: ( rule__ExpIgualdade__Group__0 )
            // InternalExp1.g:169:4: rule__ExpIgualdade__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpIgualdade__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpIgualdadeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpIgualdade"


    // $ANTLR start "entryRuleExpAritmetica"
    // InternalExp1.g:178:1: entryRuleExpAritmetica : ruleExpAritmetica EOF ;
    public final void entryRuleExpAritmetica() throws RecognitionException {
        try {
            // InternalExp1.g:179:1: ( ruleExpAritmetica EOF )
            // InternalExp1.g:180:1: ruleExpAritmetica EOF
            {
             before(grammarAccess.getExpAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpAritmetica();

            state._fsp--;

             after(grammarAccess.getExpAritmeticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpAritmetica"


    // $ANTLR start "ruleExpAritmetica"
    // InternalExp1.g:187:1: ruleExpAritmetica : ( ( rule__ExpAritmetica__Group__0 ) ) ;
    public final void ruleExpAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:191:2: ( ( ( rule__ExpAritmetica__Group__0 ) ) )
            // InternalExp1.g:192:2: ( ( rule__ExpAritmetica__Group__0 ) )
            {
            // InternalExp1.g:192:2: ( ( rule__ExpAritmetica__Group__0 ) )
            // InternalExp1.g:193:3: ( rule__ExpAritmetica__Group__0 )
            {
             before(grammarAccess.getExpAritmeticaAccess().getGroup()); 
            // InternalExp1.g:194:3: ( rule__ExpAritmetica__Group__0 )
            // InternalExp1.g:194:4: rule__ExpAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpAritmetica"


    // $ANTLR start "entryRuleExpConcatenacao"
    // InternalExp1.g:203:1: entryRuleExpConcatenacao : ruleExpConcatenacao EOF ;
    public final void entryRuleExpConcatenacao() throws RecognitionException {
        try {
            // InternalExp1.g:204:1: ( ruleExpConcatenacao EOF )
            // InternalExp1.g:205:1: ruleExpConcatenacao EOF
            {
             before(grammarAccess.getExpConcatenacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpConcatenacao();

            state._fsp--;

             after(grammarAccess.getExpConcatenacaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpConcatenacao"


    // $ANTLR start "ruleExpConcatenacao"
    // InternalExp1.g:212:1: ruleExpConcatenacao : ( ( rule__ExpConcatenacao__Group__0 ) ) ;
    public final void ruleExpConcatenacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:216:2: ( ( ( rule__ExpConcatenacao__Group__0 ) ) )
            // InternalExp1.g:217:2: ( ( rule__ExpConcatenacao__Group__0 ) )
            {
            // InternalExp1.g:217:2: ( ( rule__ExpConcatenacao__Group__0 ) )
            // InternalExp1.g:218:3: ( rule__ExpConcatenacao__Group__0 )
            {
             before(grammarAccess.getExpConcatenacaoAccess().getGroup()); 
            // InternalExp1.g:219:3: ( rule__ExpConcatenacao__Group__0 )
            // InternalExp1.g:219:4: rule__ExpConcatenacao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcatenacao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpConcatenacaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpConcatenacao"


    // $ANTLR start "entryRuleExpUnaria"
    // InternalExp1.g:228:1: entryRuleExpUnaria : ruleExpUnaria EOF ;
    public final void entryRuleExpUnaria() throws RecognitionException {
        try {
            // InternalExp1.g:229:1: ( ruleExpUnaria EOF )
            // InternalExp1.g:230:1: ruleExpUnaria EOF
            {
             before(grammarAccess.getExpUnariaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpUnaria();

            state._fsp--;

             after(grammarAccess.getExpUnariaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpUnaria"


    // $ANTLR start "ruleExpUnaria"
    // InternalExp1.g:237:1: ruleExpUnaria : ( ( rule__ExpUnaria__Alternatives ) ) ;
    public final void ruleExpUnaria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:241:2: ( ( ( rule__ExpUnaria__Alternatives ) ) )
            // InternalExp1.g:242:2: ( ( rule__ExpUnaria__Alternatives ) )
            {
            // InternalExp1.g:242:2: ( ( rule__ExpUnaria__Alternatives ) )
            // InternalExp1.g:243:3: ( rule__ExpUnaria__Alternatives )
            {
             before(grammarAccess.getExpUnariaAccess().getAlternatives()); 
            // InternalExp1.g:244:3: ( rule__ExpUnaria__Alternatives )
            // InternalExp1.g:244:4: rule__ExpUnaria__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpUnariaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpUnaria"


    // $ANTLR start "entryRuleValorConcreto"
    // InternalExp1.g:253:1: entryRuleValorConcreto : ruleValorConcreto EOF ;
    public final void entryRuleValorConcreto() throws RecognitionException {
        try {
            // InternalExp1.g:254:1: ( ruleValorConcreto EOF )
            // InternalExp1.g:255:1: ruleValorConcreto EOF
            {
             before(grammarAccess.getValorConcretoRule()); 
            pushFollow(FOLLOW_1);
            ruleValorConcreto();

            state._fsp--;

             after(grammarAccess.getValorConcretoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValorConcreto"


    // $ANTLR start "ruleValorConcreto"
    // InternalExp1.g:262:1: ruleValorConcreto : ( ( rule__ValorConcreto__Alternatives ) ) ;
    public final void ruleValorConcreto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:266:2: ( ( ( rule__ValorConcreto__Alternatives ) ) )
            // InternalExp1.g:267:2: ( ( rule__ValorConcreto__Alternatives ) )
            {
            // InternalExp1.g:267:2: ( ( rule__ValorConcreto__Alternatives ) )
            // InternalExp1.g:268:3: ( rule__ValorConcreto__Alternatives )
            {
             before(grammarAccess.getValorConcretoAccess().getAlternatives()); 
            // InternalExp1.g:269:3: ( rule__ValorConcreto__Alternatives )
            // InternalExp1.g:269:4: rule__ValorConcreto__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValorConcreto__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValorConcretoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValorConcreto"


    // $ANTLR start "rule__ExpAritmetica__Alternatives_1_0"
    // InternalExp1.g:277:1: rule__ExpAritmetica__Alternatives_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__ExpAritmetica__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:281:1: ( ( '+' ) | ( '-' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExp1.g:282:2: ( '+' )
                    {
                    // InternalExp1.g:282:2: ( '+' )
                    // InternalExp1.g:283:3: '+'
                    {
                     before(grammarAccess.getExpAritmeticaAccess().getPlusSignKeyword_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getExpAritmeticaAccess().getPlusSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:288:2: ( '-' )
                    {
                    // InternalExp1.g:288:2: ( '-' )
                    // InternalExp1.g:289:3: '-'
                    {
                     before(grammarAccess.getExpAritmeticaAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getExpAritmeticaAccess().getHyphenMinusKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Alternatives_1_0"


    // $ANTLR start "rule__ExpUnaria__Alternatives"
    // InternalExp1.g:298:1: rule__ExpUnaria__Alternatives : ( ( ( rule__ExpUnaria__Group_0__0 ) ) | ( ( rule__ExpUnaria__Group_1__0 ) ) | ( ( rule__ExpUnaria__Group_2__0 ) ) | ( ruleValorConcreto ) );
    public final void rule__ExpUnaria__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:302:1: ( ( ( rule__ExpUnaria__Group_0__0 ) ) | ( ( rule__ExpUnaria__Group_1__0 ) ) | ( ( rule__ExpUnaria__Group_2__0 ) ) | ( ruleValorConcreto ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case RULE_VALORINTEIRO:
            case RULE_VALORBOOLEANO:
            case RULE_VALORSTRING:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalExp1.g:303:2: ( ( rule__ExpUnaria__Group_0__0 ) )
                    {
                    // InternalExp1.g:303:2: ( ( rule__ExpUnaria__Group_0__0 ) )
                    // InternalExp1.g:304:3: ( rule__ExpUnaria__Group_0__0 )
                    {
                     before(grammarAccess.getExpUnariaAccess().getGroup_0()); 
                    // InternalExp1.g:305:3: ( rule__ExpUnaria__Group_0__0 )
                    // InternalExp1.g:305:4: rule__ExpUnaria__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpUnaria__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpUnariaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:309:2: ( ( rule__ExpUnaria__Group_1__0 ) )
                    {
                    // InternalExp1.g:309:2: ( ( rule__ExpUnaria__Group_1__0 ) )
                    // InternalExp1.g:310:3: ( rule__ExpUnaria__Group_1__0 )
                    {
                     before(grammarAccess.getExpUnariaAccess().getGroup_1()); 
                    // InternalExp1.g:311:3: ( rule__ExpUnaria__Group_1__0 )
                    // InternalExp1.g:311:4: rule__ExpUnaria__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpUnaria__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpUnariaAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExp1.g:315:2: ( ( rule__ExpUnaria__Group_2__0 ) )
                    {
                    // InternalExp1.g:315:2: ( ( rule__ExpUnaria__Group_2__0 ) )
                    // InternalExp1.g:316:3: ( rule__ExpUnaria__Group_2__0 )
                    {
                     before(grammarAccess.getExpUnariaAccess().getGroup_2()); 
                    // InternalExp1.g:317:3: ( rule__ExpUnaria__Group_2__0 )
                    // InternalExp1.g:317:4: rule__ExpUnaria__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpUnaria__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpUnariaAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExp1.g:321:2: ( ruleValorConcreto )
                    {
                    // InternalExp1.g:321:2: ( ruleValorConcreto )
                    // InternalExp1.g:322:3: ruleValorConcreto
                    {
                     before(grammarAccess.getExpUnariaAccess().getValorConcretoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleValorConcreto();

                    state._fsp--;

                     after(grammarAccess.getExpUnariaAccess().getValorConcretoParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Alternatives"


    // $ANTLR start "rule__ValorConcreto__Alternatives"
    // InternalExp1.g:331:1: rule__ValorConcreto__Alternatives : ( ( RULE_VALORINTEIRO ) | ( RULE_VALORBOOLEANO ) | ( RULE_VALORSTRING ) );
    public final void rule__ValorConcreto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:335:1: ( ( RULE_VALORINTEIRO ) | ( RULE_VALORBOOLEANO ) | ( RULE_VALORSTRING ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_VALORINTEIRO:
                {
                alt4=1;
                }
                break;
            case RULE_VALORBOOLEANO:
                {
                alt4=2;
                }
                break;
            case RULE_VALORSTRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExp1.g:336:2: ( RULE_VALORINTEIRO )
                    {
                    // InternalExp1.g:336:2: ( RULE_VALORINTEIRO )
                    // InternalExp1.g:337:3: RULE_VALORINTEIRO
                    {
                     before(grammarAccess.getValorConcretoAccess().getVALORINTEIROTerminalRuleCall_0()); 
                    match(input,RULE_VALORINTEIRO,FOLLOW_2); 
                     after(grammarAccess.getValorConcretoAccess().getVALORINTEIROTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:342:2: ( RULE_VALORBOOLEANO )
                    {
                    // InternalExp1.g:342:2: ( RULE_VALORBOOLEANO )
                    // InternalExp1.g:343:3: RULE_VALORBOOLEANO
                    {
                     before(grammarAccess.getValorConcretoAccess().getVALORBOOLEANOTerminalRuleCall_1()); 
                    match(input,RULE_VALORBOOLEANO,FOLLOW_2); 
                     after(grammarAccess.getValorConcretoAccess().getVALORBOOLEANOTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExp1.g:348:2: ( RULE_VALORSTRING )
                    {
                    // InternalExp1.g:348:2: ( RULE_VALORSTRING )
                    // InternalExp1.g:349:3: RULE_VALORSTRING
                    {
                     before(grammarAccess.getValorConcretoAccess().getVALORSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_VALORSTRING,FOLLOW_2); 
                     after(grammarAccess.getValorConcretoAccess().getVALORSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorConcreto__Alternatives"


    // $ANTLR start "rule__ExpCondicionalOr__Group__0"
    // InternalExp1.g:358:1: rule__ExpCondicionalOr__Group__0 : rule__ExpCondicionalOr__Group__0__Impl rule__ExpCondicionalOr__Group__1 ;
    public final void rule__ExpCondicionalOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:362:1: ( rule__ExpCondicionalOr__Group__0__Impl rule__ExpCondicionalOr__Group__1 )
            // InternalExp1.g:363:2: rule__ExpCondicionalOr__Group__0__Impl rule__ExpCondicionalOr__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExpCondicionalOr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpCondicionalOr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group__0"


    // $ANTLR start "rule__ExpCondicionalOr__Group__0__Impl"
    // InternalExp1.g:370:1: rule__ExpCondicionalOr__Group__0__Impl : ( ruleExpCondicionalAnd ) ;
    public final void rule__ExpCondicionalOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:374:1: ( ( ruleExpCondicionalAnd ) )
            // InternalExp1.g:375:1: ( ruleExpCondicionalAnd )
            {
            // InternalExp1.g:375:1: ( ruleExpCondicionalAnd )
            // InternalExp1.g:376:2: ruleExpCondicionalAnd
            {
             before(grammarAccess.getExpCondicionalOrAccess().getExpCondicionalAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpCondicionalAnd();

            state._fsp--;

             after(grammarAccess.getExpCondicionalOrAccess().getExpCondicionalAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group__0__Impl"


    // $ANTLR start "rule__ExpCondicionalOr__Group__1"
    // InternalExp1.g:385:1: rule__ExpCondicionalOr__Group__1 : rule__ExpCondicionalOr__Group__1__Impl ;
    public final void rule__ExpCondicionalOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:389:1: ( rule__ExpCondicionalOr__Group__1__Impl )
            // InternalExp1.g:390:2: rule__ExpCondicionalOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpCondicionalOr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group__1"


    // $ANTLR start "rule__ExpCondicionalOr__Group__1__Impl"
    // InternalExp1.g:396:1: rule__ExpCondicionalOr__Group__1__Impl : ( ( rule__ExpCondicionalOr__Group_1__0 )* ) ;
    public final void rule__ExpCondicionalOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:400:1: ( ( ( rule__ExpCondicionalOr__Group_1__0 )* ) )
            // InternalExp1.g:401:1: ( ( rule__ExpCondicionalOr__Group_1__0 )* )
            {
            // InternalExp1.g:401:1: ( ( rule__ExpCondicionalOr__Group_1__0 )* )
            // InternalExp1.g:402:2: ( rule__ExpCondicionalOr__Group_1__0 )*
            {
             before(grammarAccess.getExpCondicionalOrAccess().getGroup_1()); 
            // InternalExp1.g:403:2: ( rule__ExpCondicionalOr__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExp1.g:403:3: rule__ExpCondicionalOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ExpCondicionalOr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getExpCondicionalOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group__1__Impl"


    // $ANTLR start "rule__ExpCondicionalOr__Group_1__0"
    // InternalExp1.g:412:1: rule__ExpCondicionalOr__Group_1__0 : rule__ExpCondicionalOr__Group_1__0__Impl rule__ExpCondicionalOr__Group_1__1 ;
    public final void rule__ExpCondicionalOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:416:1: ( rule__ExpCondicionalOr__Group_1__0__Impl rule__ExpCondicionalOr__Group_1__1 )
            // InternalExp1.g:417:2: rule__ExpCondicionalOr__Group_1__0__Impl rule__ExpCondicionalOr__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpCondicionalOr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpCondicionalOr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group_1__0"


    // $ANTLR start "rule__ExpCondicionalOr__Group_1__0__Impl"
    // InternalExp1.g:424:1: rule__ExpCondicionalOr__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__ExpCondicionalOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:428:1: ( ( 'or' ) )
            // InternalExp1.g:429:1: ( 'or' )
            {
            // InternalExp1.g:429:1: ( 'or' )
            // InternalExp1.g:430:2: 'or'
            {
             before(grammarAccess.getExpCondicionalOrAccess().getOrKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpCondicionalOrAccess().getOrKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group_1__0__Impl"


    // $ANTLR start "rule__ExpCondicionalOr__Group_1__1"
    // InternalExp1.g:439:1: rule__ExpCondicionalOr__Group_1__1 : rule__ExpCondicionalOr__Group_1__1__Impl ;
    public final void rule__ExpCondicionalOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:443:1: ( rule__ExpCondicionalOr__Group_1__1__Impl )
            // InternalExp1.g:444:2: rule__ExpCondicionalOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpCondicionalOr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group_1__1"


    // $ANTLR start "rule__ExpCondicionalOr__Group_1__1__Impl"
    // InternalExp1.g:450:1: rule__ExpCondicionalOr__Group_1__1__Impl : ( ruleExpCondicionalAnd ) ;
    public final void rule__ExpCondicionalOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:454:1: ( ( ruleExpCondicionalAnd ) )
            // InternalExp1.g:455:1: ( ruleExpCondicionalAnd )
            {
            // InternalExp1.g:455:1: ( ruleExpCondicionalAnd )
            // InternalExp1.g:456:2: ruleExpCondicionalAnd
            {
             before(grammarAccess.getExpCondicionalOrAccess().getExpCondicionalAndParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpCondicionalAnd();

            state._fsp--;

             after(grammarAccess.getExpCondicionalOrAccess().getExpCondicionalAndParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalOr__Group_1__1__Impl"


    // $ANTLR start "rule__ExpCondicionalAnd__Group__0"
    // InternalExp1.g:466:1: rule__ExpCondicionalAnd__Group__0 : rule__ExpCondicionalAnd__Group__0__Impl rule__ExpCondicionalAnd__Group__1 ;
    public final void rule__ExpCondicionalAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:470:1: ( rule__ExpCondicionalAnd__Group__0__Impl rule__ExpCondicionalAnd__Group__1 )
            // InternalExp1.g:471:2: rule__ExpCondicionalAnd__Group__0__Impl rule__ExpCondicionalAnd__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpCondicionalAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpCondicionalAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group__0"


    // $ANTLR start "rule__ExpCondicionalAnd__Group__0__Impl"
    // InternalExp1.g:478:1: rule__ExpCondicionalAnd__Group__0__Impl : ( ruleExpIgualdade ) ;
    public final void rule__ExpCondicionalAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:482:1: ( ( ruleExpIgualdade ) )
            // InternalExp1.g:483:1: ( ruleExpIgualdade )
            {
            // InternalExp1.g:483:1: ( ruleExpIgualdade )
            // InternalExp1.g:484:2: ruleExpIgualdade
            {
             before(grammarAccess.getExpCondicionalAndAccess().getExpIgualdadeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpIgualdade();

            state._fsp--;

             after(grammarAccess.getExpCondicionalAndAccess().getExpIgualdadeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group__0__Impl"


    // $ANTLR start "rule__ExpCondicionalAnd__Group__1"
    // InternalExp1.g:493:1: rule__ExpCondicionalAnd__Group__1 : rule__ExpCondicionalAnd__Group__1__Impl ;
    public final void rule__ExpCondicionalAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:497:1: ( rule__ExpCondicionalAnd__Group__1__Impl )
            // InternalExp1.g:498:2: rule__ExpCondicionalAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpCondicionalAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group__1"


    // $ANTLR start "rule__ExpCondicionalAnd__Group__1__Impl"
    // InternalExp1.g:504:1: rule__ExpCondicionalAnd__Group__1__Impl : ( ( rule__ExpCondicionalAnd__Group_1__0 )* ) ;
    public final void rule__ExpCondicionalAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:508:1: ( ( ( rule__ExpCondicionalAnd__Group_1__0 )* ) )
            // InternalExp1.g:509:1: ( ( rule__ExpCondicionalAnd__Group_1__0 )* )
            {
            // InternalExp1.g:509:1: ( ( rule__ExpCondicionalAnd__Group_1__0 )* )
            // InternalExp1.g:510:2: ( rule__ExpCondicionalAnd__Group_1__0 )*
            {
             before(grammarAccess.getExpCondicionalAndAccess().getGroup_1()); 
            // InternalExp1.g:511:2: ( rule__ExpCondicionalAnd__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExp1.g:511:3: rule__ExpCondicionalAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExpCondicionalAnd__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpCondicionalAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group__1__Impl"


    // $ANTLR start "rule__ExpCondicionalAnd__Group_1__0"
    // InternalExp1.g:520:1: rule__ExpCondicionalAnd__Group_1__0 : rule__ExpCondicionalAnd__Group_1__0__Impl rule__ExpCondicionalAnd__Group_1__1 ;
    public final void rule__ExpCondicionalAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:524:1: ( rule__ExpCondicionalAnd__Group_1__0__Impl rule__ExpCondicionalAnd__Group_1__1 )
            // InternalExp1.g:525:2: rule__ExpCondicionalAnd__Group_1__0__Impl rule__ExpCondicionalAnd__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpCondicionalAnd__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpCondicionalAnd__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group_1__0"


    // $ANTLR start "rule__ExpCondicionalAnd__Group_1__0__Impl"
    // InternalExp1.g:532:1: rule__ExpCondicionalAnd__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__ExpCondicionalAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:536:1: ( ( 'and' ) )
            // InternalExp1.g:537:1: ( 'and' )
            {
            // InternalExp1.g:537:1: ( 'and' )
            // InternalExp1.g:538:2: 'and'
            {
             before(grammarAccess.getExpCondicionalAndAccess().getAndKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpCondicionalAndAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group_1__0__Impl"


    // $ANTLR start "rule__ExpCondicionalAnd__Group_1__1"
    // InternalExp1.g:547:1: rule__ExpCondicionalAnd__Group_1__1 : rule__ExpCondicionalAnd__Group_1__1__Impl ;
    public final void rule__ExpCondicionalAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:551:1: ( rule__ExpCondicionalAnd__Group_1__1__Impl )
            // InternalExp1.g:552:2: rule__ExpCondicionalAnd__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpCondicionalAnd__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group_1__1"


    // $ANTLR start "rule__ExpCondicionalAnd__Group_1__1__Impl"
    // InternalExp1.g:558:1: rule__ExpCondicionalAnd__Group_1__1__Impl : ( ruleExpIgualdade ) ;
    public final void rule__ExpCondicionalAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:562:1: ( ( ruleExpIgualdade ) )
            // InternalExp1.g:563:1: ( ruleExpIgualdade )
            {
            // InternalExp1.g:563:1: ( ruleExpIgualdade )
            // InternalExp1.g:564:2: ruleExpIgualdade
            {
             before(grammarAccess.getExpCondicionalAndAccess().getExpIgualdadeParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpIgualdade();

            state._fsp--;

             after(grammarAccess.getExpCondicionalAndAccess().getExpIgualdadeParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpCondicionalAnd__Group_1__1__Impl"


    // $ANTLR start "rule__ExpIgualdade__Group__0"
    // InternalExp1.g:574:1: rule__ExpIgualdade__Group__0 : rule__ExpIgualdade__Group__0__Impl rule__ExpIgualdade__Group__1 ;
    public final void rule__ExpIgualdade__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:578:1: ( rule__ExpIgualdade__Group__0__Impl rule__ExpIgualdade__Group__1 )
            // InternalExp1.g:579:2: rule__ExpIgualdade__Group__0__Impl rule__ExpIgualdade__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpIgualdade__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpIgualdade__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group__0"


    // $ANTLR start "rule__ExpIgualdade__Group__0__Impl"
    // InternalExp1.g:586:1: rule__ExpIgualdade__Group__0__Impl : ( ruleExpAritmetica ) ;
    public final void rule__ExpIgualdade__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:590:1: ( ( ruleExpAritmetica ) )
            // InternalExp1.g:591:1: ( ruleExpAritmetica )
            {
            // InternalExp1.g:591:1: ( ruleExpAritmetica )
            // InternalExp1.g:592:2: ruleExpAritmetica
            {
             before(grammarAccess.getExpIgualdadeAccess().getExpAritmeticaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpAritmetica();

            state._fsp--;

             after(grammarAccess.getExpIgualdadeAccess().getExpAritmeticaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group__0__Impl"


    // $ANTLR start "rule__ExpIgualdade__Group__1"
    // InternalExp1.g:601:1: rule__ExpIgualdade__Group__1 : rule__ExpIgualdade__Group__1__Impl ;
    public final void rule__ExpIgualdade__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:605:1: ( rule__ExpIgualdade__Group__1__Impl )
            // InternalExp1.g:606:2: rule__ExpIgualdade__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpIgualdade__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group__1"


    // $ANTLR start "rule__ExpIgualdade__Group__1__Impl"
    // InternalExp1.g:612:1: rule__ExpIgualdade__Group__1__Impl : ( ( rule__ExpIgualdade__Group_1__0 )? ) ;
    public final void rule__ExpIgualdade__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:616:1: ( ( ( rule__ExpIgualdade__Group_1__0 )? ) )
            // InternalExp1.g:617:1: ( ( rule__ExpIgualdade__Group_1__0 )? )
            {
            // InternalExp1.g:617:1: ( ( rule__ExpIgualdade__Group_1__0 )? )
            // InternalExp1.g:618:2: ( rule__ExpIgualdade__Group_1__0 )?
            {
             before(grammarAccess.getExpIgualdadeAccess().getGroup_1()); 
            // InternalExp1.g:619:2: ( rule__ExpIgualdade__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExp1.g:619:3: rule__ExpIgualdade__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpIgualdade__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpIgualdadeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group__1__Impl"


    // $ANTLR start "rule__ExpIgualdade__Group_1__0"
    // InternalExp1.g:628:1: rule__ExpIgualdade__Group_1__0 : rule__ExpIgualdade__Group_1__0__Impl rule__ExpIgualdade__Group_1__1 ;
    public final void rule__ExpIgualdade__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:632:1: ( rule__ExpIgualdade__Group_1__0__Impl rule__ExpIgualdade__Group_1__1 )
            // InternalExp1.g:633:2: rule__ExpIgualdade__Group_1__0__Impl rule__ExpIgualdade__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpIgualdade__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpIgualdade__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group_1__0"


    // $ANTLR start "rule__ExpIgualdade__Group_1__0__Impl"
    // InternalExp1.g:640:1: rule__ExpIgualdade__Group_1__0__Impl : ( '==' ) ;
    public final void rule__ExpIgualdade__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:644:1: ( ( '==' ) )
            // InternalExp1.g:645:1: ( '==' )
            {
            // InternalExp1.g:645:1: ( '==' )
            // InternalExp1.g:646:2: '=='
            {
             before(grammarAccess.getExpIgualdadeAccess().getEqualsSignEqualsSignKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpIgualdadeAccess().getEqualsSignEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group_1__0__Impl"


    // $ANTLR start "rule__ExpIgualdade__Group_1__1"
    // InternalExp1.g:655:1: rule__ExpIgualdade__Group_1__1 : rule__ExpIgualdade__Group_1__1__Impl ;
    public final void rule__ExpIgualdade__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:659:1: ( rule__ExpIgualdade__Group_1__1__Impl )
            // InternalExp1.g:660:2: rule__ExpIgualdade__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpIgualdade__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group_1__1"


    // $ANTLR start "rule__ExpIgualdade__Group_1__1__Impl"
    // InternalExp1.g:666:1: rule__ExpIgualdade__Group_1__1__Impl : ( ruleExpAritmetica ) ;
    public final void rule__ExpIgualdade__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:670:1: ( ( ruleExpAritmetica ) )
            // InternalExp1.g:671:1: ( ruleExpAritmetica )
            {
            // InternalExp1.g:671:1: ( ruleExpAritmetica )
            // InternalExp1.g:672:2: ruleExpAritmetica
            {
             before(grammarAccess.getExpIgualdadeAccess().getExpAritmeticaParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpAritmetica();

            state._fsp--;

             after(grammarAccess.getExpIgualdadeAccess().getExpAritmeticaParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpIgualdade__Group_1__1__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group__0"
    // InternalExp1.g:682:1: rule__ExpAritmetica__Group__0 : rule__ExpAritmetica__Group__0__Impl rule__ExpAritmetica__Group__1 ;
    public final void rule__ExpAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:686:1: ( rule__ExpAritmetica__Group__0__Impl rule__ExpAritmetica__Group__1 )
            // InternalExp1.g:687:2: rule__ExpAritmetica__Group__0__Impl rule__ExpAritmetica__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExpAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__0"


    // $ANTLR start "rule__ExpAritmetica__Group__0__Impl"
    // InternalExp1.g:694:1: rule__ExpAritmetica__Group__0__Impl : ( ruleExpConcatenacao ) ;
    public final void rule__ExpAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:698:1: ( ( ruleExpConcatenacao ) )
            // InternalExp1.g:699:1: ( ruleExpConcatenacao )
            {
            // InternalExp1.g:699:1: ( ruleExpConcatenacao )
            // InternalExp1.g:700:2: ruleExpConcatenacao
            {
             before(grammarAccess.getExpAritmeticaAccess().getExpConcatenacaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpConcatenacao();

            state._fsp--;

             after(grammarAccess.getExpAritmeticaAccess().getExpConcatenacaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group__1"
    // InternalExp1.g:709:1: rule__ExpAritmetica__Group__1 : rule__ExpAritmetica__Group__1__Impl ;
    public final void rule__ExpAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:713:1: ( rule__ExpAritmetica__Group__1__Impl )
            // InternalExp1.g:714:2: rule__ExpAritmetica__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__1"


    // $ANTLR start "rule__ExpAritmetica__Group__1__Impl"
    // InternalExp1.g:720:1: rule__ExpAritmetica__Group__1__Impl : ( ( rule__ExpAritmetica__Group_1__0 )* ) ;
    public final void rule__ExpAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:724:1: ( ( ( rule__ExpAritmetica__Group_1__0 )* ) )
            // InternalExp1.g:725:1: ( ( rule__ExpAritmetica__Group_1__0 )* )
            {
            // InternalExp1.g:725:1: ( ( rule__ExpAritmetica__Group_1__0 )* )
            // InternalExp1.g:726:2: ( rule__ExpAritmetica__Group_1__0 )*
            {
             before(grammarAccess.getExpAritmeticaAccess().getGroup_1()); 
            // InternalExp1.g:727:2: ( rule__ExpAritmetica__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }
                else if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExp1.g:727:3: rule__ExpAritmetica__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ExpAritmetica__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExpAritmeticaAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__1__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group_1__0"
    // InternalExp1.g:736:1: rule__ExpAritmetica__Group_1__0 : rule__ExpAritmetica__Group_1__0__Impl rule__ExpAritmetica__Group_1__1 ;
    public final void rule__ExpAritmetica__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:740:1: ( rule__ExpAritmetica__Group_1__0__Impl rule__ExpAritmetica__Group_1__1 )
            // InternalExp1.g:741:2: rule__ExpAritmetica__Group_1__0__Impl rule__ExpAritmetica__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpAritmetica__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group_1__0"


    // $ANTLR start "rule__ExpAritmetica__Group_1__0__Impl"
    // InternalExp1.g:748:1: rule__ExpAritmetica__Group_1__0__Impl : ( ( rule__ExpAritmetica__Alternatives_1_0 ) ) ;
    public final void rule__ExpAritmetica__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:752:1: ( ( ( rule__ExpAritmetica__Alternatives_1_0 ) ) )
            // InternalExp1.g:753:1: ( ( rule__ExpAritmetica__Alternatives_1_0 ) )
            {
            // InternalExp1.g:753:1: ( ( rule__ExpAritmetica__Alternatives_1_0 ) )
            // InternalExp1.g:754:2: ( rule__ExpAritmetica__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAritmeticaAccess().getAlternatives_1_0()); 
            // InternalExp1.g:755:2: ( rule__ExpAritmetica__Alternatives_1_0 )
            // InternalExp1.g:755:3: rule__ExpAritmetica__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAritmeticaAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group_1__0__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group_1__1"
    // InternalExp1.g:763:1: rule__ExpAritmetica__Group_1__1 : rule__ExpAritmetica__Group_1__1__Impl ;
    public final void rule__ExpAritmetica__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:767:1: ( rule__ExpAritmetica__Group_1__1__Impl )
            // InternalExp1.g:768:2: rule__ExpAritmetica__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group_1__1"


    // $ANTLR start "rule__ExpAritmetica__Group_1__1__Impl"
    // InternalExp1.g:774:1: rule__ExpAritmetica__Group_1__1__Impl : ( ruleExpConcatenacao ) ;
    public final void rule__ExpAritmetica__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:778:1: ( ( ruleExpConcatenacao ) )
            // InternalExp1.g:779:1: ( ruleExpConcatenacao )
            {
            // InternalExp1.g:779:1: ( ruleExpConcatenacao )
            // InternalExp1.g:780:2: ruleExpConcatenacao
            {
             before(grammarAccess.getExpAritmeticaAccess().getExpConcatenacaoParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpConcatenacao();

            state._fsp--;

             after(grammarAccess.getExpAritmeticaAccess().getExpConcatenacaoParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group_1__1__Impl"


    // $ANTLR start "rule__ExpConcatenacao__Group__0"
    // InternalExp1.g:790:1: rule__ExpConcatenacao__Group__0 : rule__ExpConcatenacao__Group__0__Impl rule__ExpConcatenacao__Group__1 ;
    public final void rule__ExpConcatenacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:794:1: ( rule__ExpConcatenacao__Group__0__Impl rule__ExpConcatenacao__Group__1 )
            // InternalExp1.g:795:2: rule__ExpConcatenacao__Group__0__Impl rule__ExpConcatenacao__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ExpConcatenacao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpConcatenacao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group__0"


    // $ANTLR start "rule__ExpConcatenacao__Group__0__Impl"
    // InternalExp1.g:802:1: rule__ExpConcatenacao__Group__0__Impl : ( ruleExpUnaria ) ;
    public final void rule__ExpConcatenacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:806:1: ( ( ruleExpUnaria ) )
            // InternalExp1.g:807:1: ( ruleExpUnaria )
            {
            // InternalExp1.g:807:1: ( ruleExpUnaria )
            // InternalExp1.g:808:2: ruleExpUnaria
            {
             before(grammarAccess.getExpConcatenacaoAccess().getExpUnariaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpUnaria();

            state._fsp--;

             after(grammarAccess.getExpConcatenacaoAccess().getExpUnariaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group__0__Impl"


    // $ANTLR start "rule__ExpConcatenacao__Group__1"
    // InternalExp1.g:817:1: rule__ExpConcatenacao__Group__1 : rule__ExpConcatenacao__Group__1__Impl ;
    public final void rule__ExpConcatenacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:821:1: ( rule__ExpConcatenacao__Group__1__Impl )
            // InternalExp1.g:822:2: rule__ExpConcatenacao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcatenacao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group__1"


    // $ANTLR start "rule__ExpConcatenacao__Group__1__Impl"
    // InternalExp1.g:828:1: rule__ExpConcatenacao__Group__1__Impl : ( ( rule__ExpConcatenacao__Group_1__0 )* ) ;
    public final void rule__ExpConcatenacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:832:1: ( ( ( rule__ExpConcatenacao__Group_1__0 )* ) )
            // InternalExp1.g:833:1: ( ( rule__ExpConcatenacao__Group_1__0 )* )
            {
            // InternalExp1.g:833:1: ( ( rule__ExpConcatenacao__Group_1__0 )* )
            // InternalExp1.g:834:2: ( rule__ExpConcatenacao__Group_1__0 )*
            {
             before(grammarAccess.getExpConcatenacaoAccess().getGroup_1()); 
            // InternalExp1.g:835:2: ( rule__ExpConcatenacao__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExp1.g:835:3: rule__ExpConcatenacao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ExpConcatenacao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExpConcatenacaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group__1__Impl"


    // $ANTLR start "rule__ExpConcatenacao__Group_1__0"
    // InternalExp1.g:844:1: rule__ExpConcatenacao__Group_1__0 : rule__ExpConcatenacao__Group_1__0__Impl rule__ExpConcatenacao__Group_1__1 ;
    public final void rule__ExpConcatenacao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:848:1: ( rule__ExpConcatenacao__Group_1__0__Impl rule__ExpConcatenacao__Group_1__1 )
            // InternalExp1.g:849:2: rule__ExpConcatenacao__Group_1__0__Impl rule__ExpConcatenacao__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpConcatenacao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpConcatenacao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group_1__0"


    // $ANTLR start "rule__ExpConcatenacao__Group_1__0__Impl"
    // InternalExp1.g:856:1: rule__ExpConcatenacao__Group_1__0__Impl : ( '++' ) ;
    public final void rule__ExpConcatenacao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:860:1: ( ( '++' ) )
            // InternalExp1.g:861:1: ( '++' )
            {
            // InternalExp1.g:861:1: ( '++' )
            // InternalExp1.g:862:2: '++'
            {
             before(grammarAccess.getExpConcatenacaoAccess().getPlusSignPlusSignKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpConcatenacaoAccess().getPlusSignPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group_1__0__Impl"


    // $ANTLR start "rule__ExpConcatenacao__Group_1__1"
    // InternalExp1.g:871:1: rule__ExpConcatenacao__Group_1__1 : rule__ExpConcatenacao__Group_1__1__Impl ;
    public final void rule__ExpConcatenacao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:875:1: ( rule__ExpConcatenacao__Group_1__1__Impl )
            // InternalExp1.g:876:2: rule__ExpConcatenacao__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcatenacao__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group_1__1"


    // $ANTLR start "rule__ExpConcatenacao__Group_1__1__Impl"
    // InternalExp1.g:882:1: rule__ExpConcatenacao__Group_1__1__Impl : ( ruleExpUnaria ) ;
    public final void rule__ExpConcatenacao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:886:1: ( ( ruleExpUnaria ) )
            // InternalExp1.g:887:1: ( ruleExpUnaria )
            {
            // InternalExp1.g:887:1: ( ruleExpUnaria )
            // InternalExp1.g:888:2: ruleExpUnaria
            {
             before(grammarAccess.getExpConcatenacaoAccess().getExpUnariaParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpUnaria();

            state._fsp--;

             after(grammarAccess.getExpConcatenacaoAccess().getExpUnariaParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcatenacao__Group_1__1__Impl"


    // $ANTLR start "rule__ExpUnaria__Group_0__0"
    // InternalExp1.g:898:1: rule__ExpUnaria__Group_0__0 : rule__ExpUnaria__Group_0__0__Impl rule__ExpUnaria__Group_0__1 ;
    public final void rule__ExpUnaria__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:902:1: ( rule__ExpUnaria__Group_0__0__Impl rule__ExpUnaria__Group_0__1 )
            // InternalExp1.g:903:2: rule__ExpUnaria__Group_0__0__Impl rule__ExpUnaria__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpUnaria__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_0__0"


    // $ANTLR start "rule__ExpUnaria__Group_0__0__Impl"
    // InternalExp1.g:910:1: rule__ExpUnaria__Group_0__0__Impl : ( '-' ) ;
    public final void rule__ExpUnaria__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:914:1: ( ( '-' ) )
            // InternalExp1.g:915:1: ( '-' )
            {
            // InternalExp1.g:915:1: ( '-' )
            // InternalExp1.g:916:2: '-'
            {
             before(grammarAccess.getExpUnariaAccess().getHyphenMinusKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpUnariaAccess().getHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_0__0__Impl"


    // $ANTLR start "rule__ExpUnaria__Group_0__1"
    // InternalExp1.g:925:1: rule__ExpUnaria__Group_0__1 : rule__ExpUnaria__Group_0__1__Impl ;
    public final void rule__ExpUnaria__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:929:1: ( rule__ExpUnaria__Group_0__1__Impl )
            // InternalExp1.g:930:2: rule__ExpUnaria__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_0__1"


    // $ANTLR start "rule__ExpUnaria__Group_0__1__Impl"
    // InternalExp1.g:936:1: rule__ExpUnaria__Group_0__1__Impl : ( ruleExpressao ) ;
    public final void rule__ExpUnaria__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:940:1: ( ( ruleExpressao ) )
            // InternalExp1.g:941:1: ( ruleExpressao )
            {
            // InternalExp1.g:941:1: ( ruleExpressao )
            // InternalExp1.g:942:2: ruleExpressao
            {
             before(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_0__1__Impl"


    // $ANTLR start "rule__ExpUnaria__Group_1__0"
    // InternalExp1.g:952:1: rule__ExpUnaria__Group_1__0 : rule__ExpUnaria__Group_1__0__Impl rule__ExpUnaria__Group_1__1 ;
    public final void rule__ExpUnaria__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:956:1: ( rule__ExpUnaria__Group_1__0__Impl rule__ExpUnaria__Group_1__1 )
            // InternalExp1.g:957:2: rule__ExpUnaria__Group_1__0__Impl rule__ExpUnaria__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpUnaria__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_1__0"


    // $ANTLR start "rule__ExpUnaria__Group_1__0__Impl"
    // InternalExp1.g:964:1: rule__ExpUnaria__Group_1__0__Impl : ( 'not' ) ;
    public final void rule__ExpUnaria__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:968:1: ( ( 'not' ) )
            // InternalExp1.g:969:1: ( 'not' )
            {
            // InternalExp1.g:969:1: ( 'not' )
            // InternalExp1.g:970:2: 'not'
            {
             before(grammarAccess.getExpUnariaAccess().getNotKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpUnariaAccess().getNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_1__0__Impl"


    // $ANTLR start "rule__ExpUnaria__Group_1__1"
    // InternalExp1.g:979:1: rule__ExpUnaria__Group_1__1 : rule__ExpUnaria__Group_1__1__Impl ;
    public final void rule__ExpUnaria__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:983:1: ( rule__ExpUnaria__Group_1__1__Impl )
            // InternalExp1.g:984:2: rule__ExpUnaria__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_1__1"


    // $ANTLR start "rule__ExpUnaria__Group_1__1__Impl"
    // InternalExp1.g:990:1: rule__ExpUnaria__Group_1__1__Impl : ( ruleExpressao ) ;
    public final void rule__ExpUnaria__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:994:1: ( ( ruleExpressao ) )
            // InternalExp1.g:995:1: ( ruleExpressao )
            {
            // InternalExp1.g:995:1: ( ruleExpressao )
            // InternalExp1.g:996:2: ruleExpressao
            {
             before(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_1__1__Impl"


    // $ANTLR start "rule__ExpUnaria__Group_2__0"
    // InternalExp1.g:1006:1: rule__ExpUnaria__Group_2__0 : rule__ExpUnaria__Group_2__0__Impl rule__ExpUnaria__Group_2__1 ;
    public final void rule__ExpUnaria__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:1010:1: ( rule__ExpUnaria__Group_2__0__Impl rule__ExpUnaria__Group_2__1 )
            // InternalExp1.g:1011:2: rule__ExpUnaria__Group_2__0__Impl rule__ExpUnaria__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpUnaria__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_2__0"


    // $ANTLR start "rule__ExpUnaria__Group_2__0__Impl"
    // InternalExp1.g:1018:1: rule__ExpUnaria__Group_2__0__Impl : ( 'length' ) ;
    public final void rule__ExpUnaria__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:1022:1: ( ( 'length' ) )
            // InternalExp1.g:1023:1: ( 'length' )
            {
            // InternalExp1.g:1023:1: ( 'length' )
            // InternalExp1.g:1024:2: 'length'
            {
             before(grammarAccess.getExpUnariaAccess().getLengthKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpUnariaAccess().getLengthKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_2__0__Impl"


    // $ANTLR start "rule__ExpUnaria__Group_2__1"
    // InternalExp1.g:1033:1: rule__ExpUnaria__Group_2__1 : rule__ExpUnaria__Group_2__1__Impl ;
    public final void rule__ExpUnaria__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:1037:1: ( rule__ExpUnaria__Group_2__1__Impl )
            // InternalExp1.g:1038:2: rule__ExpUnaria__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_2__1"


    // $ANTLR start "rule__ExpUnaria__Group_2__1__Impl"
    // InternalExp1.g:1044:1: rule__ExpUnaria__Group_2__1__Impl : ( ruleExpressao ) ;
    public final void rule__ExpUnaria__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:1048:1: ( ( ruleExpressao ) )
            // InternalExp1.g:1049:1: ( ruleExpressao )
            {
            // InternalExp1.g:1049:1: ( ruleExpressao )
            // InternalExp1.g:1050:2: ruleExpressao
            {
             before(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Group_2__1__Impl"


    // $ANTLR start "rule__Exp1__ExpressoesAssignment"
    // InternalExp1.g:1060:1: rule__Exp1__ExpressoesAssignment : ( ruleExpressao ) ;
    public final void rule__Exp1__ExpressoesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:1064:1: ( ( ruleExpressao ) )
            // InternalExp1.g:1065:2: ( ruleExpressao )
            {
            // InternalExp1.g:1065:2: ( ruleExpressao )
            // InternalExp1.g:1066:3: ruleExpressao
            {
             before(grammarAccess.getExp1Access().getExpressoesExpressaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExp1Access().getExpressoesExpressaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__ExpressoesAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000308072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000308070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});

}