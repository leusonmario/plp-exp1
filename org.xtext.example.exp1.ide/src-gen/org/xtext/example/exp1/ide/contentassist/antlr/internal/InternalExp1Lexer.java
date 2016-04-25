package org.xtext.example.exp1.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExp1Lexer extends Lexer {
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

    public InternalExp1Lexer() {;} 
    public InternalExp1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExp1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalExp1.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:11:7: ( '+' )
            // InternalExp1.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:12:7: ( '-' )
            // InternalExp1.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:13:7: ( 'or' )
            // InternalExp1.g:13:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:14:7: ( 'and' )
            // InternalExp1.g:14:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:15:7: ( '==' )
            // InternalExp1.g:15:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:16:7: ( '++' )
            // InternalExp1.g:16:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:17:7: ( 'not' )
            // InternalExp1.g:17:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:18:7: ( 'length' )
            // InternalExp1.g:18:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_VALORINTEIRO"
    public final void mRULE_VALORINTEIRO() throws RecognitionException {
        try {
            int _type = RULE_VALORINTEIRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1075:19: ( '1' .. '9' ( '0' .. '9' )* )
            // InternalExp1.g:1075:21: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // InternalExp1.g:1075:30: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExp1.g:1075:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALORINTEIRO"

    // $ANTLR start "RULE_VALORBOOLEANO"
    public final void mRULE_VALORBOOLEANO() throws RecognitionException {
        try {
            int _type = RULE_VALORBOOLEANO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1077:20: ( ( 'true' | 'false' ) )
            // InternalExp1.g:1077:22: ( 'true' | 'false' )
            {
            // InternalExp1.g:1077:22: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExp1.g:1077:23: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalExp1.g:1077:30: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALORBOOLEANO"

    // $ANTLR start "RULE_VALORSTRING"
    public final void mRULE_VALORSTRING() throws RecognitionException {
        try {
            int _type = RULE_VALORSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1079:18: ( ( 'a' .. 'z' )? )
            // InternalExp1.g:1079:20: ( 'a' .. 'z' )?
            {
            // InternalExp1.g:1079:20: ( 'a' .. 'z' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalExp1.g:1079:21: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALORSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1081:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalExp1.g:1081:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalExp1.g:1081:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExp1.g:1081:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalExp1.g:1081:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExp1.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1083:10: ( ( '0' .. '9' )+ )
            // InternalExp1.g:1083:12: ( '0' .. '9' )+
            {
            // InternalExp1.g:1083:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExp1.g:1083:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1085:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalExp1.g:1085:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalExp1.g:1085:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExp1.g:1085:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalExp1.g:1085:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalExp1.g:1085:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExp1.g:1085:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalExp1.g:1085:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalExp1.g:1085:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalExp1.g:1085:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExp1.g:1085:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1087:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalExp1.g:1087:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalExp1.g:1087:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExp1.g:1087:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1089:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalExp1.g:1089:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalExp1.g:1089:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExp1.g:1089:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalExp1.g:1089:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExp1.g:1089:41: ( '\\r' )? '\\n'
                    {
                    // InternalExp1.g:1089:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalExp1.g:1089:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1091:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalExp1.g:1091:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalExp1.g:1091:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExp1.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExp1.g:1093:16: ( . )
            // InternalExp1.g:1093:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalExp1.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_VALORINTEIRO | RULE_VALORBOOLEANO | RULE_VALORSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=18;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalExp1.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalExp1.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalExp1.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalExp1.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalExp1.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalExp1.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalExp1.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalExp1.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalExp1.g:1:58: RULE_VALORINTEIRO
                {
                mRULE_VALORINTEIRO(); 

                }
                break;
            case 10 :
                // InternalExp1.g:1:76: RULE_VALORBOOLEANO
                {
                mRULE_VALORBOOLEANO(); 

                }
                break;
            case 11 :
                // InternalExp1.g:1:95: RULE_VALORSTRING
                {
                mRULE_VALORSTRING(); 

                }
                break;
            case 12 :
                // InternalExp1.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalExp1.g:1:120: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalExp1.g:1:129: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalExp1.g:1:141: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalExp1.g:1:157: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalExp1.g:1:173: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalExp1.g:1:181: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\14\1\26\1\uffff\2\14\1\24\2\14\1\36\3\14\1\uffff\1\24\2\uffff\3\24\5\uffff\1\47\1\uffff\1\31\1\uffff\2\31\1\uffff\1\36\2\31\6\uffff\1\55\1\56\3\31\2\uffff\1\31\1\63\2\31\1\uffff\1\63\1\66\1\uffff";
    static final String DFA15_eofS =
        "\67\uffff";
    static final String DFA15_minS =
        "\1\0\1\53\1\uffff\2\60\1\75\6\60\1\uffff\1\101\2\uffff\2\0\1\52\5\uffff\1\60\1\uffff\1\144\1\uffff\1\164\1\156\1\uffff\1\60\1\165\1\154\6\uffff\2\60\1\147\1\145\1\163\2\uffff\1\164\1\60\1\145\1\150\1\uffff\2\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\53\1\uffff\2\172\1\75\2\172\1\71\3\172\1\uffff\1\172\2\uffff\2\uffff\1\57\5\uffff\1\172\1\uffff\1\144\1\uffff\1\164\1\156\1\uffff\1\71\1\165\1\154\6\uffff\2\172\1\147\1\145\1\163\2\uffff\1\164\1\172\1\145\1\150\1\uffff\2\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\11\uffff\1\13\1\uffff\1\14\1\15\3\uffff\1\21\1\22\1\6\1\1\1\2\1\uffff\1\14\1\uffff\1\5\2\uffff\1\11\3\uffff\1\15\1\16\1\17\1\20\1\21\1\3\5\uffff\1\4\1\7\4\uffff\1\12\2\uffff\1\10";
    static final String DFA15_specialS =
        "\1\1\17\uffff\1\0\1\2\45\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\3\24\1\1\1\24\1\2\1\24\1\22\1\17\11\10\3\24\1\5\3\24\32\16\3\24\1\15\1\16\1\24\1\4\4\13\1\12\5\13\1\7\1\13\1\6\1\3\4\13\1\11\6\13\uff85\24",
            "\1\25",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\30\10\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\32\14\31",
            "\1\33",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31\1\34\13\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\35\25\31",
            "\12\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\40\10\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\41\31\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\0\43",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "",
            "\12\37",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\64",
            "\1\65",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_VALORINTEIRO | RULE_VALORBOOLEANO | RULE_VALORSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_16 = input.LA(1);

                        s = -1;
                        if ( ((LA15_16>='\u0000' && LA15_16<='\uFFFF')) ) {s = 35;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='+') ) {s = 1;}

                        else if ( (LA15_0=='-') ) {s = 2;}

                        else if ( (LA15_0=='o') ) {s = 3;}

                        else if ( (LA15_0=='a') ) {s = 4;}

                        else if ( (LA15_0=='=') ) {s = 5;}

                        else if ( (LA15_0=='n') ) {s = 6;}

                        else if ( (LA15_0=='l') ) {s = 7;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 8;}

                        else if ( (LA15_0=='t') ) {s = 9;}

                        else if ( (LA15_0=='f') ) {s = 10;}

                        else if ( ((LA15_0>='b' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 11;}

                        else if ( (LA15_0=='^') ) {s = 13;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_') ) {s = 14;}

                        else if ( (LA15_0=='0') ) {s = 15;}

                        else if ( (LA15_0=='\"') ) {s = 16;}

                        else if ( (LA15_0=='\'') ) {s = 17;}

                        else if ( (LA15_0=='/') ) {s = 18;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 19;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='*')||LA15_0==','||LA15_0=='.'||(LA15_0>=':' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_17 = input.LA(1);

                        s = -1;
                        if ( ((LA15_17>='\u0000' && LA15_17<='\uFFFF')) ) {s = 35;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}