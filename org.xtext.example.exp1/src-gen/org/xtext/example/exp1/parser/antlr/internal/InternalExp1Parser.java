package org.xtext.example.exp1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.exp1.services.Exp1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExp1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALORINTEIRO", "RULE_VALORBOOLEANO", "RULE_VALORSTRING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'or'", "'and'", "'=='", "'+'", "'-'", "'++'", "'not'", "'length'"
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

        public InternalExp1Parser(TokenStream input, Exp1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Exp1";
       	}

       	@Override
       	protected Exp1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExp1"
    // InternalExp1.g:64:1: entryRuleExp1 returns [EObject current=null] : iv_ruleExp1= ruleExp1 EOF ;
    public final EObject entryRuleExp1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp1 = null;


        try {
            // InternalExp1.g:64:45: (iv_ruleExp1= ruleExp1 EOF )
            // InternalExp1.g:65:2: iv_ruleExp1= ruleExp1 EOF
            {
             newCompositeNode(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp1=ruleExp1();

            state._fsp--;

             current =iv_ruleExp1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // InternalExp1.g:71:1: ruleExp1 returns [EObject current=null] : ( (lv_expressoes_0_0= ruleExpressao ) )* ;
    public final EObject ruleExp1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expressoes_0_0 = null;



        	enterRule();

        try {
            // InternalExp1.g:77:2: ( ( (lv_expressoes_0_0= ruleExpressao ) )* )
            // InternalExp1.g:78:2: ( (lv_expressoes_0_0= ruleExpressao ) )*
            {
            // InternalExp1.g:78:2: ( (lv_expressoes_0_0= ruleExpressao ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_VALORINTEIRO && LA1_0<=RULE_VALORSTRING)||LA1_0==18||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExp1.g:79:3: (lv_expressoes_0_0= ruleExpressao )
            	    {
            	    // InternalExp1.g:79:3: (lv_expressoes_0_0= ruleExpressao )
            	    // InternalExp1.g:80:4: lv_expressoes_0_0= ruleExpressao
            	    {

            	    				newCompositeNode(grammarAccess.getExp1Access().getExpressoesExpressaoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressoes_0_0=ruleExpressao();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExp1Rule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressoes",
            	    					lv_expressoes_0_0,
            	    					"org.xtext.example.exp1.Exp1.Expressao");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleExpressao"
    // InternalExp1.g:100:1: entryRuleExpressao returns [String current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final String entryRuleExpressao() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressao = null;


        try {
            // InternalExp1.g:100:49: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalExp1.g:101:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalExp1.g:107:1: ruleExpressao returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ExpCondicionalOr_0= ruleExpCondicionalOr ;
    public final AntlrDatatypeRuleToken ruleExpressao() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExpCondicionalOr_0 = null;



        	enterRule();

        try {
            // InternalExp1.g:113:2: (this_ExpCondicionalOr_0= ruleExpCondicionalOr )
            // InternalExp1.g:114:2: this_ExpCondicionalOr_0= ruleExpCondicionalOr
            {

            		newCompositeNode(grammarAccess.getExpressaoAccess().getExpCondicionalOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExpCondicionalOr_0=ruleExpCondicionalOr();

            state._fsp--;


            		current.merge(this_ExpCondicionalOr_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleExpCondicionalOr"
    // InternalExp1.g:127:1: entryRuleExpCondicionalOr returns [String current=null] : iv_ruleExpCondicionalOr= ruleExpCondicionalOr EOF ;
    public final String entryRuleExpCondicionalOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpCondicionalOr = null;


        try {
            // InternalExp1.g:127:56: (iv_ruleExpCondicionalOr= ruleExpCondicionalOr EOF )
            // InternalExp1.g:128:2: iv_ruleExpCondicionalOr= ruleExpCondicionalOr EOF
            {
             newCompositeNode(grammarAccess.getExpCondicionalOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpCondicionalOr=ruleExpCondicionalOr();

            state._fsp--;

             current =iv_ruleExpCondicionalOr.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpCondicionalOr"


    // $ANTLR start "ruleExpCondicionalOr"
    // InternalExp1.g:134:1: ruleExpCondicionalOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpCondicionalAnd_0= ruleExpCondicionalAnd (kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd )* ) ;
    public final AntlrDatatypeRuleToken ruleExpCondicionalOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpCondicionalAnd_0 = null;

        AntlrDatatypeRuleToken this_ExpCondicionalAnd_2 = null;



        	enterRule();

        try {
            // InternalExp1.g:140:2: ( (this_ExpCondicionalAnd_0= ruleExpCondicionalAnd (kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd )* ) )
            // InternalExp1.g:141:2: (this_ExpCondicionalAnd_0= ruleExpCondicionalAnd (kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd )* )
            {
            // InternalExp1.g:141:2: (this_ExpCondicionalAnd_0= ruleExpCondicionalAnd (kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd )* )
            // InternalExp1.g:142:3: this_ExpCondicionalAnd_0= ruleExpCondicionalAnd (kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd )*
            {

            			newCompositeNode(grammarAccess.getExpCondicionalOrAccess().getExpCondicionalAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_ExpCondicionalAnd_0=ruleExpCondicionalAnd();

            state._fsp--;


            			current.merge(this_ExpCondicionalAnd_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalExp1.g:152:3: (kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExp1.g:153:4: kw= 'or' this_ExpCondicionalAnd_2= ruleExpCondicionalAnd
            	    {
            	    kw=(Token)match(input,14,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getExpCondicionalOrAccess().getOrKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getExpCondicionalOrAccess().getExpCondicionalAndParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_4);
            	    this_ExpCondicionalAnd_2=ruleExpCondicionalAnd();

            	    state._fsp--;


            	    				current.merge(this_ExpCondicionalAnd_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpCondicionalOr"


    // $ANTLR start "entryRuleExpCondicionalAnd"
    // InternalExp1.g:173:1: entryRuleExpCondicionalAnd returns [String current=null] : iv_ruleExpCondicionalAnd= ruleExpCondicionalAnd EOF ;
    public final String entryRuleExpCondicionalAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpCondicionalAnd = null;


        try {
            // InternalExp1.g:173:57: (iv_ruleExpCondicionalAnd= ruleExpCondicionalAnd EOF )
            // InternalExp1.g:174:2: iv_ruleExpCondicionalAnd= ruleExpCondicionalAnd EOF
            {
             newCompositeNode(grammarAccess.getExpCondicionalAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpCondicionalAnd=ruleExpCondicionalAnd();

            state._fsp--;

             current =iv_ruleExpCondicionalAnd.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpCondicionalAnd"


    // $ANTLR start "ruleExpCondicionalAnd"
    // InternalExp1.g:180:1: ruleExpCondicionalAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpIgualdade_0= ruleExpIgualdade (kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade )* ) ;
    public final AntlrDatatypeRuleToken ruleExpCondicionalAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpIgualdade_0 = null;

        AntlrDatatypeRuleToken this_ExpIgualdade_2 = null;



        	enterRule();

        try {
            // InternalExp1.g:186:2: ( (this_ExpIgualdade_0= ruleExpIgualdade (kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade )* ) )
            // InternalExp1.g:187:2: (this_ExpIgualdade_0= ruleExpIgualdade (kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade )* )
            {
            // InternalExp1.g:187:2: (this_ExpIgualdade_0= ruleExpIgualdade (kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade )* )
            // InternalExp1.g:188:3: this_ExpIgualdade_0= ruleExpIgualdade (kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade )*
            {

            			newCompositeNode(grammarAccess.getExpCondicionalAndAccess().getExpIgualdadeParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_ExpIgualdade_0=ruleExpIgualdade();

            state._fsp--;


            			current.merge(this_ExpIgualdade_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalExp1.g:198:3: (kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExp1.g:199:4: kw= 'and' this_ExpIgualdade_2= ruleExpIgualdade
            	    {
            	    kw=(Token)match(input,15,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getExpCondicionalAndAccess().getAndKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getExpCondicionalAndAccess().getExpIgualdadeParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_6);
            	    this_ExpIgualdade_2=ruleExpIgualdade();

            	    state._fsp--;


            	    				current.merge(this_ExpIgualdade_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpCondicionalAnd"


    // $ANTLR start "entryRuleExpIgualdade"
    // InternalExp1.g:219:1: entryRuleExpIgualdade returns [String current=null] : iv_ruleExpIgualdade= ruleExpIgualdade EOF ;
    public final String entryRuleExpIgualdade() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpIgualdade = null;


        try {
            // InternalExp1.g:219:52: (iv_ruleExpIgualdade= ruleExpIgualdade EOF )
            // InternalExp1.g:220:2: iv_ruleExpIgualdade= ruleExpIgualdade EOF
            {
             newCompositeNode(grammarAccess.getExpIgualdadeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpIgualdade=ruleExpIgualdade();

            state._fsp--;

             current =iv_ruleExpIgualdade.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpIgualdade"


    // $ANTLR start "ruleExpIgualdade"
    // InternalExp1.g:226:1: ruleExpIgualdade returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpAritmetica_0= ruleExpAritmetica (kw= '==' this_ExpAritmetica_2= ruleExpAritmetica )? ) ;
    public final AntlrDatatypeRuleToken ruleExpIgualdade() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpAritmetica_0 = null;

        AntlrDatatypeRuleToken this_ExpAritmetica_2 = null;



        	enterRule();

        try {
            // InternalExp1.g:232:2: ( (this_ExpAritmetica_0= ruleExpAritmetica (kw= '==' this_ExpAritmetica_2= ruleExpAritmetica )? ) )
            // InternalExp1.g:233:2: (this_ExpAritmetica_0= ruleExpAritmetica (kw= '==' this_ExpAritmetica_2= ruleExpAritmetica )? )
            {
            // InternalExp1.g:233:2: (this_ExpAritmetica_0= ruleExpAritmetica (kw= '==' this_ExpAritmetica_2= ruleExpAritmetica )? )
            // InternalExp1.g:234:3: this_ExpAritmetica_0= ruleExpAritmetica (kw= '==' this_ExpAritmetica_2= ruleExpAritmetica )?
            {

            			newCompositeNode(grammarAccess.getExpIgualdadeAccess().getExpAritmeticaParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_ExpAritmetica_0=ruleExpAritmetica();

            state._fsp--;


            			current.merge(this_ExpAritmetica_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalExp1.g:244:3: (kw= '==' this_ExpAritmetica_2= ruleExpAritmetica )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExp1.g:245:4: kw= '==' this_ExpAritmetica_2= ruleExpAritmetica
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpIgualdadeAccess().getEqualsSignEqualsSignKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getExpIgualdadeAccess().getExpAritmeticaParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ExpAritmetica_2=ruleExpAritmetica();

                    state._fsp--;


                    				current.merge(this_ExpAritmetica_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpIgualdade"


    // $ANTLR start "entryRuleExpAritmetica"
    // InternalExp1.g:265:1: entryRuleExpAritmetica returns [String current=null] : iv_ruleExpAritmetica= ruleExpAritmetica EOF ;
    public final String entryRuleExpAritmetica() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpAritmetica = null;


        try {
            // InternalExp1.g:265:53: (iv_ruleExpAritmetica= ruleExpAritmetica EOF )
            // InternalExp1.g:266:2: iv_ruleExpAritmetica= ruleExpAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpAritmetica=ruleExpAritmetica();

            state._fsp--;

             current =iv_ruleExpAritmetica.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpAritmetica"


    // $ANTLR start "ruleExpAritmetica"
    // InternalExp1.g:272:1: ruleExpAritmetica returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpConcatenacao_0= ruleExpConcatenacao ( (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao )* ) ;
    public final AntlrDatatypeRuleToken ruleExpAritmetica() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpConcatenacao_0 = null;

        AntlrDatatypeRuleToken this_ExpConcatenacao_3 = null;



        	enterRule();

        try {
            // InternalExp1.g:278:2: ( (this_ExpConcatenacao_0= ruleExpConcatenacao ( (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao )* ) )
            // InternalExp1.g:279:2: (this_ExpConcatenacao_0= ruleExpConcatenacao ( (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao )* )
            {
            // InternalExp1.g:279:2: (this_ExpConcatenacao_0= ruleExpConcatenacao ( (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao )* )
            // InternalExp1.g:280:3: this_ExpConcatenacao_0= ruleExpConcatenacao ( (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao )*
            {

            			newCompositeNode(grammarAccess.getExpAritmeticaAccess().getExpConcatenacaoParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_ExpConcatenacao_0=ruleExpConcatenacao();

            state._fsp--;


            			current.merge(this_ExpConcatenacao_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalExp1.g:290:3: ( (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }
                else if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExp1.g:291:4: (kw= '+' | kw= '-' ) this_ExpConcatenacao_3= ruleExpConcatenacao
            	    {
            	    // InternalExp1.g:291:4: (kw= '+' | kw= '-' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==17) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==18) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalExp1.g:292:5: kw= '+'
            	            {
            	            kw=(Token)match(input,17,FOLLOW_11); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getExpAritmeticaAccess().getPlusSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalExp1.g:298:5: kw= '-'
            	            {
            	            kw=(Token)match(input,18,FOLLOW_11); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getExpAritmeticaAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getExpAritmeticaAccess().getExpConcatenacaoParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_10);
            	    this_ExpConcatenacao_3=ruleExpConcatenacao();

            	    state._fsp--;


            	    				current.merge(this_ExpConcatenacao_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpAritmetica"


    // $ANTLR start "entryRuleExpConcatenacao"
    // InternalExp1.g:319:1: entryRuleExpConcatenacao returns [String current=null] : iv_ruleExpConcatenacao= ruleExpConcatenacao EOF ;
    public final String entryRuleExpConcatenacao() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpConcatenacao = null;


        try {
            // InternalExp1.g:319:55: (iv_ruleExpConcatenacao= ruleExpConcatenacao EOF )
            // InternalExp1.g:320:2: iv_ruleExpConcatenacao= ruleExpConcatenacao EOF
            {
             newCompositeNode(grammarAccess.getExpConcatenacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpConcatenacao=ruleExpConcatenacao();

            state._fsp--;

             current =iv_ruleExpConcatenacao.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpConcatenacao"


    // $ANTLR start "ruleExpConcatenacao"
    // InternalExp1.g:326:1: ruleExpConcatenacao returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpUnaria_0= ruleExpUnaria (kw= '++' this_ExpUnaria_2= ruleExpUnaria )* ) ;
    public final AntlrDatatypeRuleToken ruleExpConcatenacao() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpUnaria_0 = null;

        AntlrDatatypeRuleToken this_ExpUnaria_2 = null;



        	enterRule();

        try {
            // InternalExp1.g:332:2: ( (this_ExpUnaria_0= ruleExpUnaria (kw= '++' this_ExpUnaria_2= ruleExpUnaria )* ) )
            // InternalExp1.g:333:2: (this_ExpUnaria_0= ruleExpUnaria (kw= '++' this_ExpUnaria_2= ruleExpUnaria )* )
            {
            // InternalExp1.g:333:2: (this_ExpUnaria_0= ruleExpUnaria (kw= '++' this_ExpUnaria_2= ruleExpUnaria )* )
            // InternalExp1.g:334:3: this_ExpUnaria_0= ruleExpUnaria (kw= '++' this_ExpUnaria_2= ruleExpUnaria )*
            {

            			newCompositeNode(grammarAccess.getExpConcatenacaoAccess().getExpUnariaParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_ExpUnaria_0=ruleExpUnaria();

            state._fsp--;


            			current.merge(this_ExpUnaria_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalExp1.g:344:3: (kw= '++' this_ExpUnaria_2= ruleExpUnaria )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExp1.g:345:4: kw= '++' this_ExpUnaria_2= ruleExpUnaria
            	    {
            	    kw=(Token)match(input,19,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getExpConcatenacaoAccess().getPlusSignPlusSignKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getExpConcatenacaoAccess().getExpUnariaParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_12);
            	    this_ExpUnaria_2=ruleExpUnaria();

            	    state._fsp--;


            	    				current.merge(this_ExpUnaria_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpConcatenacao"


    // $ANTLR start "entryRuleExpUnaria"
    // InternalExp1.g:365:1: entryRuleExpUnaria returns [String current=null] : iv_ruleExpUnaria= ruleExpUnaria EOF ;
    public final String entryRuleExpUnaria() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpUnaria = null;


        try {
            // InternalExp1.g:365:49: (iv_ruleExpUnaria= ruleExpUnaria EOF )
            // InternalExp1.g:366:2: iv_ruleExpUnaria= ruleExpUnaria EOF
            {
             newCompositeNode(grammarAccess.getExpUnariaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpUnaria=ruleExpUnaria();

            state._fsp--;

             current =iv_ruleExpUnaria.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpUnaria"


    // $ANTLR start "ruleExpUnaria"
    // InternalExp1.g:372:1: ruleExpUnaria returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' this_Expressao_1= ruleExpressao ) | (kw= 'not' this_Expressao_3= ruleExpressao ) | (kw= 'length' this_Expressao_5= ruleExpressao ) | this_ValorConcreto_6= ruleValorConcreto ) ;
    public final AntlrDatatypeRuleToken ruleExpUnaria() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expressao_1 = null;

        AntlrDatatypeRuleToken this_Expressao_3 = null;

        AntlrDatatypeRuleToken this_Expressao_5 = null;

        AntlrDatatypeRuleToken this_ValorConcreto_6 = null;



        	enterRule();

        try {
            // InternalExp1.g:378:2: ( ( (kw= '-' this_Expressao_1= ruleExpressao ) | (kw= 'not' this_Expressao_3= ruleExpressao ) | (kw= 'length' this_Expressao_5= ruleExpressao ) | this_ValorConcreto_6= ruleValorConcreto ) )
            // InternalExp1.g:379:2: ( (kw= '-' this_Expressao_1= ruleExpressao ) | (kw= 'not' this_Expressao_3= ruleExpressao ) | (kw= 'length' this_Expressao_5= ruleExpressao ) | this_ValorConcreto_6= ruleValorConcreto )
            {
            // InternalExp1.g:379:2: ( (kw= '-' this_Expressao_1= ruleExpressao ) | (kw= 'not' this_Expressao_3= ruleExpressao ) | (kw= 'length' this_Expressao_5= ruleExpressao ) | this_ValorConcreto_6= ruleValorConcreto )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case RULE_VALORINTEIRO:
            case RULE_VALORBOOLEANO:
            case RULE_VALORSTRING:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExp1.g:380:3: (kw= '-' this_Expressao_1= ruleExpressao )
                    {
                    // InternalExp1.g:380:3: (kw= '-' this_Expressao_1= ruleExpressao )
                    // InternalExp1.g:381:4: kw= '-' this_Expressao_1= ruleExpressao
                    {
                    kw=(Token)match(input,18,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpUnariaAccess().getHyphenMinusKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Expressao_1=ruleExpressao();

                    state._fsp--;


                    				current.merge(this_Expressao_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:398:3: (kw= 'not' this_Expressao_3= ruleExpressao )
                    {
                    // InternalExp1.g:398:3: (kw= 'not' this_Expressao_3= ruleExpressao )
                    // InternalExp1.g:399:4: kw= 'not' this_Expressao_3= ruleExpressao
                    {
                    kw=(Token)match(input,20,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpUnariaAccess().getNotKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Expressao_3=ruleExpressao();

                    state._fsp--;


                    				current.merge(this_Expressao_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExp1.g:416:3: (kw= 'length' this_Expressao_5= ruleExpressao )
                    {
                    // InternalExp1.g:416:3: (kw= 'length' this_Expressao_5= ruleExpressao )
                    // InternalExp1.g:417:4: kw= 'length' this_Expressao_5= ruleExpressao
                    {
                    kw=(Token)match(input,21,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExpUnariaAccess().getLengthKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getExpUnariaAccess().getExpressaoParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Expressao_5=ruleExpressao();

                    state._fsp--;


                    				current.merge(this_Expressao_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalExp1.g:434:3: this_ValorConcreto_6= ruleValorConcreto
                    {

                    			newCompositeNode(grammarAccess.getExpUnariaAccess().getValorConcretoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValorConcreto_6=ruleValorConcreto();

                    state._fsp--;


                    			current.merge(this_ValorConcreto_6);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpUnaria"


    // $ANTLR start "entryRuleValorConcreto"
    // InternalExp1.g:448:1: entryRuleValorConcreto returns [String current=null] : iv_ruleValorConcreto= ruleValorConcreto EOF ;
    public final String entryRuleValorConcreto() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValorConcreto = null;


        try {
            // InternalExp1.g:448:53: (iv_ruleValorConcreto= ruleValorConcreto EOF )
            // InternalExp1.g:449:2: iv_ruleValorConcreto= ruleValorConcreto EOF
            {
             newCompositeNode(grammarAccess.getValorConcretoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValorConcreto=ruleValorConcreto();

            state._fsp--;

             current =iv_ruleValorConcreto.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValorConcreto"


    // $ANTLR start "ruleValorConcreto"
    // InternalExp1.g:455:1: ruleValorConcreto returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALORINTEIRO_0= RULE_VALORINTEIRO | this_VALORBOOLEANO_1= RULE_VALORBOOLEANO | this_VALORSTRING_2= RULE_VALORSTRING ) ;
    public final AntlrDatatypeRuleToken ruleValorConcreto() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VALORINTEIRO_0=null;
        Token this_VALORBOOLEANO_1=null;
        Token this_VALORSTRING_2=null;


        	enterRule();

        try {
            // InternalExp1.g:461:2: ( (this_VALORINTEIRO_0= RULE_VALORINTEIRO | this_VALORBOOLEANO_1= RULE_VALORBOOLEANO | this_VALORSTRING_2= RULE_VALORSTRING ) )
            // InternalExp1.g:462:2: (this_VALORINTEIRO_0= RULE_VALORINTEIRO | this_VALORBOOLEANO_1= RULE_VALORBOOLEANO | this_VALORSTRING_2= RULE_VALORSTRING )
            {
            // InternalExp1.g:462:2: (this_VALORINTEIRO_0= RULE_VALORINTEIRO | this_VALORBOOLEANO_1= RULE_VALORBOOLEANO | this_VALORSTRING_2= RULE_VALORSTRING )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_VALORINTEIRO:
                {
                alt9=1;
                }
                break;
            case RULE_VALORBOOLEANO:
                {
                alt9=2;
                }
                break;
            case RULE_VALORSTRING:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalExp1.g:463:3: this_VALORINTEIRO_0= RULE_VALORINTEIRO
                    {
                    this_VALORINTEIRO_0=(Token)match(input,RULE_VALORINTEIRO,FOLLOW_2); 

                    			current.merge(this_VALORINTEIRO_0);
                    		

                    			newLeafNode(this_VALORINTEIRO_0, grammarAccess.getValorConcretoAccess().getVALORINTEIROTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExp1.g:471:3: this_VALORBOOLEANO_1= RULE_VALORBOOLEANO
                    {
                    this_VALORBOOLEANO_1=(Token)match(input,RULE_VALORBOOLEANO,FOLLOW_2); 

                    			current.merge(this_VALORBOOLEANO_1);
                    		

                    			newLeafNode(this_VALORBOOLEANO_1, grammarAccess.getValorConcretoAccess().getVALORBOOLEANOTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExp1.g:479:3: this_VALORSTRING_2= RULE_VALORSTRING
                    {
                    this_VALORSTRING_2=(Token)match(input,RULE_VALORSTRING,FOLLOW_2); 

                    			current.merge(this_VALORSTRING_2);
                    		

                    			newLeafNode(this_VALORSTRING_2, grammarAccess.getValorConcretoAccess().getVALORSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValorConcreto"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000340072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000344070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000348070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000340070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000360070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003C0070L});

}