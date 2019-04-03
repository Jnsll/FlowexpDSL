package org.xtext.example.flowexp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.flowexp.services.FlowexpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowexpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Schema'", "':'", "'Phase'", "'Modelname'", "'Init'", "'batch'", "'one'", "'init'", "'forecast'", "'whole'", "'template'", "','", "'timestep'", "'period'", "'periodicity'", "'sea rise'", "'daily'", "'monthly'", "'semester'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFlowexpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowexpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowexpParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFlowexp.g"; }



     	private FlowexpGrammarAccess grammarAccess;

        public InternalFlowexpParser(TokenStream input, FlowexpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FlowexpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFlowexp.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFlowexp.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalFlowexp.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFlowexp.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Schema' otherlv_1= ':' ( (lv_expr_2_0= ruleExpNb ) ) otherlv_3= 'Phase' otherlv_4= ':' ( (lv_phase_5_0= rulePhase ) ) otherlv_6= 'Modelname' otherlv_7= ':' ( (lv_modelname_8_0= RULE_STRING ) ) otherlv_9= 'Init' otherlv_10= ':' ( (lv_init_11_0= ruleInit ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_modelname_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_expr_2_0 = null;

        AntlrDatatypeRuleToken lv_phase_5_0 = null;

        EObject lv_init_11_0 = null;



        	enterRule();

        try {
            // InternalFlowexp.g:77:2: ( (otherlv_0= 'Schema' otherlv_1= ':' ( (lv_expr_2_0= ruleExpNb ) ) otherlv_3= 'Phase' otherlv_4= ':' ( (lv_phase_5_0= rulePhase ) ) otherlv_6= 'Modelname' otherlv_7= ':' ( (lv_modelname_8_0= RULE_STRING ) ) otherlv_9= 'Init' otherlv_10= ':' ( (lv_init_11_0= ruleInit ) ) ) )
            // InternalFlowexp.g:78:2: (otherlv_0= 'Schema' otherlv_1= ':' ( (lv_expr_2_0= ruleExpNb ) ) otherlv_3= 'Phase' otherlv_4= ':' ( (lv_phase_5_0= rulePhase ) ) otherlv_6= 'Modelname' otherlv_7= ':' ( (lv_modelname_8_0= RULE_STRING ) ) otherlv_9= 'Init' otherlv_10= ':' ( (lv_init_11_0= ruleInit ) ) )
            {
            // InternalFlowexp.g:78:2: (otherlv_0= 'Schema' otherlv_1= ':' ( (lv_expr_2_0= ruleExpNb ) ) otherlv_3= 'Phase' otherlv_4= ':' ( (lv_phase_5_0= rulePhase ) ) otherlv_6= 'Modelname' otherlv_7= ':' ( (lv_modelname_8_0= RULE_STRING ) ) otherlv_9= 'Init' otherlv_10= ':' ( (lv_init_11_0= ruleInit ) ) )
            // InternalFlowexp.g:79:3: otherlv_0= 'Schema' otherlv_1= ':' ( (lv_expr_2_0= ruleExpNb ) ) otherlv_3= 'Phase' otherlv_4= ':' ( (lv_phase_5_0= rulePhase ) ) otherlv_6= 'Modelname' otherlv_7= ':' ( (lv_modelname_8_0= RULE_STRING ) ) otherlv_9= 'Init' otherlv_10= ':' ( (lv_init_11_0= ruleInit ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSchemaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            		
            // InternalFlowexp.g:87:3: ( (lv_expr_2_0= ruleExpNb ) )
            // InternalFlowexp.g:88:4: (lv_expr_2_0= ruleExpNb )
            {
            // InternalFlowexp.g:88:4: (lv_expr_2_0= ruleExpNb )
            // InternalFlowexp.g:89:5: lv_expr_2_0= ruleExpNb
            {

            					newCompositeNode(grammarAccess.getModelAccess().getExprExpNbParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_expr_2_0=ruleExpNb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.xtext.example.flowexp.Flowexp.ExpNb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getPhaseKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getColonKeyword_4());
            		
            // InternalFlowexp.g:114:3: ( (lv_phase_5_0= rulePhase ) )
            // InternalFlowexp.g:115:4: (lv_phase_5_0= rulePhase )
            {
            // InternalFlowexp.g:115:4: (lv_phase_5_0= rulePhase )
            // InternalFlowexp.g:116:5: lv_phase_5_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPhasePhaseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_phase_5_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"phase",
            						lv_phase_5_0,
            						"org.xtext.example.flowexp.Flowexp.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getModelnameKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getColonKeyword_7());
            		
            // InternalFlowexp.g:141:3: ( (lv_modelname_8_0= RULE_STRING ) )
            // InternalFlowexp.g:142:4: (lv_modelname_8_0= RULE_STRING )
            {
            // InternalFlowexp.g:142:4: (lv_modelname_8_0= RULE_STRING )
            // InternalFlowexp.g:143:5: lv_modelname_8_0= RULE_STRING
            {
            lv_modelname_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_modelname_8_0, grammarAccess.getModelAccess().getModelnameSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelname",
            						lv_modelname_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getInitKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getColonKeyword_10());
            		
            // InternalFlowexp.g:167:3: ( (lv_init_11_0= ruleInit ) )
            // InternalFlowexp.g:168:4: (lv_init_11_0= ruleInit )
            {
            // InternalFlowexp.g:168:4: (lv_init_11_0= ruleInit )
            // InternalFlowexp.g:169:5: lv_init_11_0= ruleInit
            {

            					newCompositeNode(grammarAccess.getModelAccess().getInitInitParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_init_11_0=ruleInit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_11_0,
            						"org.xtext.example.flowexp.Flowexp.Init");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpNb"
    // InternalFlowexp.g:190:1: entryRuleExpNb returns [EObject current=null] : iv_ruleExpNb= ruleExpNb EOF ;
    public final EObject entryRuleExpNb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpNb = null;


        try {
            // InternalFlowexp.g:190:46: (iv_ruleExpNb= ruleExpNb EOF )
            // InternalFlowexp.g:191:2: iv_ruleExpNb= ruleExpNb EOF
            {
             newCompositeNode(grammarAccess.getExpNbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpNb=ruleExpNb();

            state._fsp--;

             current =iv_ruleExpNb; 
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
    // $ANTLR end "entryRuleExpNb"


    // $ANTLR start "ruleExpNb"
    // InternalFlowexp.g:197:1: ruleExpNb returns [EObject current=null] : ( ( () otherlv_1= 'batch' ) | ( () otherlv_3= 'one' ) ) ;
    public final EObject ruleExpNb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFlowexp.g:203:2: ( ( ( () otherlv_1= 'batch' ) | ( () otherlv_3= 'one' ) ) )
            // InternalFlowexp.g:204:2: ( ( () otherlv_1= 'batch' ) | ( () otherlv_3= 'one' ) )
            {
            // InternalFlowexp.g:204:2: ( ( () otherlv_1= 'batch' ) | ( () otherlv_3= 'one' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFlowexp.g:205:3: ( () otherlv_1= 'batch' )
                    {
                    // InternalFlowexp.g:205:3: ( () otherlv_1= 'batch' )
                    // InternalFlowexp.g:206:4: () otherlv_1= 'batch'
                    {
                    // InternalFlowexp.g:206:4: ()
                    // InternalFlowexp.g:207:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpNbAccess().getExpNbBatchAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpNbAccess().getBatchKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFlowexp.g:219:3: ( () otherlv_3= 'one' )
                    {
                    // InternalFlowexp.g:219:3: ( () otherlv_3= 'one' )
                    // InternalFlowexp.g:220:4: () otherlv_3= 'one'
                    {
                    // InternalFlowexp.g:220:4: ()
                    // InternalFlowexp.g:221:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpNbAccess().getExpNbOneAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpNbAccess().getOneKeyword_1_1());
                    			

                    }


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
    // $ANTLR end "ruleExpNb"


    // $ANTLR start "entryRulePhase"
    // InternalFlowexp.g:236:1: entryRulePhase returns [String current=null] : iv_rulePhase= rulePhase EOF ;
    public final String entryRulePhase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhase = null;


        try {
            // InternalFlowexp.g:236:45: (iv_rulePhase= rulePhase EOF )
            // InternalFlowexp.g:237:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase.getText(); 
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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalFlowexp.g:243:1: rulePhase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'init' | kw= 'forecast' | kw= 'whole' ) ;
    public final AntlrDatatypeRuleToken rulePhase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFlowexp.g:249:2: ( (kw= 'init' | kw= 'forecast' | kw= 'whole' ) )
            // InternalFlowexp.g:250:2: (kw= 'init' | kw= 'forecast' | kw= 'whole' )
            {
            // InternalFlowexp.g:250:2: (kw= 'init' | kw= 'forecast' | kw= 'whole' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFlowexp.g:251:3: kw= 'init'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhaseAccess().getInitKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFlowexp.g:257:3: kw= 'forecast'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhaseAccess().getForecastKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFlowexp.g:263:3: kw= 'whole'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhaseAccess().getWholeKeyword_2());
                    		

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
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleInit"
    // InternalFlowexp.g:272:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalFlowexp.g:272:45: (iv_ruleInit= ruleInit EOF )
            // InternalFlowexp.g:273:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit; 
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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalFlowexp.g:279:1: ruleInit returns [EObject current=null] : (this_InitOne_0= ruleInitOne | ruleInitBatch ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        EObject this_InitOne_0 = null;



        	enterRule();

        try {
            // InternalFlowexp.g:285:2: ( (this_InitOne_0= ruleInitOne | ruleInitBatch ) )
            // InternalFlowexp.g:286:2: (this_InitOne_0= ruleInitOne | ruleInitBatch )
            {
            // InternalFlowexp.g:286:2: (this_InitOne_0= ruleInitOne | ruleInitBatch )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFlowexp.g:287:3: this_InitOne_0= ruleInitOne
                    {

                    			newCompositeNode(grammarAccess.getInitAccess().getInitOneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitOne_0=ruleInitOne();

                    state._fsp--;


                    			current = this_InitOne_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFlowexp.g:296:3: ruleInitBatch
                    {

                    			newCompositeNode(grammarAccess.getInitAccess().getInitBatchParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleInitBatch();

                    state._fsp--;


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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleInitOne"
    // InternalFlowexp.g:307:1: entryRuleInitOne returns [EObject current=null] : iv_ruleInitOne= ruleInitOne EOF ;
    public final EObject entryRuleInitOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitOne = null;


        try {
            // InternalFlowexp.g:307:48: (iv_ruleInitOne= ruleInitOne EOF )
            // InternalFlowexp.g:308:2: iv_ruleInitOne= ruleInitOne EOF
            {
             newCompositeNode(grammarAccess.getInitOneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitOne=ruleInitOne();

            state._fsp--;

             current =iv_ruleInitOne; 
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
    // $ANTLR end "entryRuleInitOne"


    // $ANTLR start "ruleInitOne"
    // InternalFlowexp.g:314:1: ruleInitOne returns [EObject current=null] : (otherlv_0= 'template' ( (lv_filename_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) ) )* otherlv_4= 'timestep' ( (lv_tval_5_0= RULE_INT ) ) otherlv_6= 'period' ( (lv_pval_7_0= RULE_INT ) ) otherlv_8= 'periodicity' rulePeriodicity otherlv_10= 'sea rise' ( (lv_srval_11_0= RULE_INT ) ) ) ;
    public final EObject ruleInitOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filename_1_0=null;
        Token otherlv_2=null;
        Token lv_filename_3_0=null;
        Token otherlv_4=null;
        Token lv_tval_5_0=null;
        Token otherlv_6=null;
        Token lv_pval_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_srval_11_0=null;


        	enterRule();

        try {
            // InternalFlowexp.g:320:2: ( (otherlv_0= 'template' ( (lv_filename_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) ) )* otherlv_4= 'timestep' ( (lv_tval_5_0= RULE_INT ) ) otherlv_6= 'period' ( (lv_pval_7_0= RULE_INT ) ) otherlv_8= 'periodicity' rulePeriodicity otherlv_10= 'sea rise' ( (lv_srval_11_0= RULE_INT ) ) ) )
            // InternalFlowexp.g:321:2: (otherlv_0= 'template' ( (lv_filename_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) ) )* otherlv_4= 'timestep' ( (lv_tval_5_0= RULE_INT ) ) otherlv_6= 'period' ( (lv_pval_7_0= RULE_INT ) ) otherlv_8= 'periodicity' rulePeriodicity otherlv_10= 'sea rise' ( (lv_srval_11_0= RULE_INT ) ) )
            {
            // InternalFlowexp.g:321:2: (otherlv_0= 'template' ( (lv_filename_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) ) )* otherlv_4= 'timestep' ( (lv_tval_5_0= RULE_INT ) ) otherlv_6= 'period' ( (lv_pval_7_0= RULE_INT ) ) otherlv_8= 'periodicity' rulePeriodicity otherlv_10= 'sea rise' ( (lv_srval_11_0= RULE_INT ) ) )
            // InternalFlowexp.g:322:3: otherlv_0= 'template' ( (lv_filename_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) ) )* otherlv_4= 'timestep' ( (lv_tval_5_0= RULE_INT ) ) otherlv_6= 'period' ( (lv_pval_7_0= RULE_INT ) ) otherlv_8= 'periodicity' rulePeriodicity otherlv_10= 'sea rise' ( (lv_srval_11_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getInitOneAccess().getTemplateKeyword_0());
            		
            // InternalFlowexp.g:326:3: ( (lv_filename_1_0= RULE_STRING ) )
            // InternalFlowexp.g:327:4: (lv_filename_1_0= RULE_STRING )
            {
            // InternalFlowexp.g:327:4: (lv_filename_1_0= RULE_STRING )
            // InternalFlowexp.g:328:5: lv_filename_1_0= RULE_STRING
            {
            lv_filename_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_filename_1_0, grammarAccess.getInitOneAccess().getFilenameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitOneRule());
            					}
            					addWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalFlowexp.g:344:3: (otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFlowexp.g:345:4: otherlv_2= ',' ( (lv_filename_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInitOneAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFlowexp.g:349:4: ( (lv_filename_3_0= RULE_STRING ) )
            	    // InternalFlowexp.g:350:5: (lv_filename_3_0= RULE_STRING )
            	    {
            	    // InternalFlowexp.g:350:5: (lv_filename_3_0= RULE_STRING )
            	    // InternalFlowexp.g:351:6: lv_filename_3_0= RULE_STRING
            	    {
            	    lv_filename_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(lv_filename_3_0, grammarAccess.getInitOneAccess().getFilenameSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInitOneRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"filename",
            	    							lv_filename_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getInitOneAccess().getTimestepKeyword_3());
            		
            // InternalFlowexp.g:372:3: ( (lv_tval_5_0= RULE_INT ) )
            // InternalFlowexp.g:373:4: (lv_tval_5_0= RULE_INT )
            {
            // InternalFlowexp.g:373:4: (lv_tval_5_0= RULE_INT )
            // InternalFlowexp.g:374:5: lv_tval_5_0= RULE_INT
            {
            lv_tval_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_tval_5_0, grammarAccess.getInitOneAccess().getTvalINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tval",
            						lv_tval_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getInitOneAccess().getPeriodKeyword_5());
            		
            // InternalFlowexp.g:394:3: ( (lv_pval_7_0= RULE_INT ) )
            // InternalFlowexp.g:395:4: (lv_pval_7_0= RULE_INT )
            {
            // InternalFlowexp.g:395:4: (lv_pval_7_0= RULE_INT )
            // InternalFlowexp.g:396:5: lv_pval_7_0= RULE_INT
            {
            lv_pval_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_pval_7_0, grammarAccess.getInitOneAccess().getPvalINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pval",
            						lv_pval_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getInitOneAccess().getPeriodicityKeyword_7());
            		

            			newCompositeNode(grammarAccess.getInitOneAccess().getPeriodicityParserRuleCall_8());
            		
            pushFollow(FOLLOW_16);
            rulePeriodicity();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getInitOneAccess().getSeaRiseKeyword_9());
            		
            // InternalFlowexp.g:427:3: ( (lv_srval_11_0= RULE_INT ) )
            // InternalFlowexp.g:428:4: (lv_srval_11_0= RULE_INT )
            {
            // InternalFlowexp.g:428:4: (lv_srval_11_0= RULE_INT )
            // InternalFlowexp.g:429:5: lv_srval_11_0= RULE_INT
            {
            lv_srval_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_srval_11_0, grammarAccess.getInitOneAccess().getSrvalINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"srval",
            						lv_srval_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleInitOne"


    // $ANTLR start "entryRulePeriodicity"
    // InternalFlowexp.g:449:1: entryRulePeriodicity returns [String current=null] : iv_rulePeriodicity= rulePeriodicity EOF ;
    public final String entryRulePeriodicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePeriodicity = null;


        try {
            // InternalFlowexp.g:449:51: (iv_rulePeriodicity= rulePeriodicity EOF )
            // InternalFlowexp.g:450:2: iv_rulePeriodicity= rulePeriodicity EOF
            {
             newCompositeNode(grammarAccess.getPeriodicityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriodicity=rulePeriodicity();

            state._fsp--;

             current =iv_rulePeriodicity.getText(); 
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
    // $ANTLR end "entryRulePeriodicity"


    // $ANTLR start "rulePeriodicity"
    // InternalFlowexp.g:456:1: rulePeriodicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'daily' | kw= 'monthly' | kw= 'semester' ) ;
    public final AntlrDatatypeRuleToken rulePeriodicity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFlowexp.g:462:2: ( (kw= 'daily' | kw= 'monthly' | kw= 'semester' ) )
            // InternalFlowexp.g:463:2: (kw= 'daily' | kw= 'monthly' | kw= 'semester' )
            {
            // InternalFlowexp.g:463:2: (kw= 'daily' | kw= 'monthly' | kw= 'semester' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFlowexp.g:464:3: kw= 'daily'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPeriodicityAccess().getDailyKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFlowexp.g:470:3: kw= 'monthly'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPeriodicityAccess().getMonthlyKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFlowexp.g:476:3: kw= 'semester'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPeriodicityAccess().getSemesterKeyword_2());
                    		

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
    // $ANTLR end "rulePeriodicity"


    // $ANTLR start "entryRuleInitBatch"
    // InternalFlowexp.g:485:1: entryRuleInitBatch returns [String current=null] : iv_ruleInitBatch= ruleInitBatch EOF ;
    public final String entryRuleInitBatch() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitBatch = null;


        try {
            // InternalFlowexp.g:485:49: (iv_ruleInitBatch= ruleInitBatch EOF )
            // InternalFlowexp.g:486:2: iv_ruleInitBatch= ruleInitBatch EOF
            {
             newCompositeNode(grammarAccess.getInitBatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitBatch=ruleInitBatch();

            state._fsp--;

             current =iv_ruleInitBatch.getText(); 
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
    // $ANTLR end "entryRuleInitBatch"


    // $ANTLR start "ruleInitBatch"
    // InternalFlowexp.g:492:1: ruleInitBatch returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'template' ;
    public final AntlrDatatypeRuleToken ruleInitBatch() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFlowexp.g:498:2: (kw= 'template' )
            // InternalFlowexp.g:499:2: kw= 'template'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInitBatchAccess().getTemplateKeyword());
            	

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
    // $ANTLR end "ruleInitBatch"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}