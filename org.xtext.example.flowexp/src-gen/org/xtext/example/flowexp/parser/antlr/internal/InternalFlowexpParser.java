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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'people'", "'greetings'", "'person'", "';'", "'Hello'", "'!'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalFlowexp.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'people' ( (lv_people_1_0= rulePerson ) )* otherlv_2= 'greetings' ( (lv_greetings_3_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_people_1_0 = null;

        EObject lv_greetings_3_0 = null;



        	enterRule();

        try {
            // InternalFlowexp.g:77:2: ( (otherlv_0= 'people' ( (lv_people_1_0= rulePerson ) )* otherlv_2= 'greetings' ( (lv_greetings_3_0= ruleGreeting ) )* ) )
            // InternalFlowexp.g:78:2: (otherlv_0= 'people' ( (lv_people_1_0= rulePerson ) )* otherlv_2= 'greetings' ( (lv_greetings_3_0= ruleGreeting ) )* )
            {
            // InternalFlowexp.g:78:2: (otherlv_0= 'people' ( (lv_people_1_0= rulePerson ) )* otherlv_2= 'greetings' ( (lv_greetings_3_0= ruleGreeting ) )* )
            // InternalFlowexp.g:79:3: otherlv_0= 'people' ( (lv_people_1_0= rulePerson ) )* otherlv_2= 'greetings' ( (lv_greetings_3_0= ruleGreeting ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPeopleKeyword_0());
            		
            // InternalFlowexp.g:83:3: ( (lv_people_1_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFlowexp.g:84:4: (lv_people_1_0= rulePerson )
            	    {
            	    // InternalFlowexp.g:84:4: (lv_people_1_0= rulePerson )
            	    // InternalFlowexp.g:85:5: lv_people_1_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPeoplePersonParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_people_1_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"people",
            	    						lv_people_1_0,
            	    						"org.xtext.example.flowexp.Flowexp.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getGreetingsKeyword_2());
            		
            // InternalFlowexp.g:106:3: ( (lv_greetings_3_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFlowexp.g:107:4: (lv_greetings_3_0= ruleGreeting )
            	    {
            	    // InternalFlowexp.g:107:4: (lv_greetings_3_0= ruleGreeting )
            	    // InternalFlowexp.g:108:5: lv_greetings_3_0= ruleGreeting
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_greetings_3_0=ruleGreeting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"greetings",
            	    						lv_greetings_3_0,
            	    						"org.xtext.example.flowexp.Flowexp.Greeting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // InternalFlowexp.g:129:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalFlowexp.g:129:47: (iv_rulePerson= rulePerson EOF )
            // InternalFlowexp.g:130:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalFlowexp.g:136:1: rulePerson returns [EObject current=null] : (otherlv_0= 'person' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFlowexp.g:142:2: ( (otherlv_0= 'person' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalFlowexp.g:143:2: (otherlv_0= 'person' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalFlowexp.g:143:2: (otherlv_0= 'person' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalFlowexp.g:144:3: otherlv_0= 'person' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalFlowexp.g:148:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFlowexp.g:149:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFlowexp.g:149:4: (lv_name_1_0= RULE_STRING )
            // InternalFlowexp.g:150:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleGreeting"
    // InternalFlowexp.g:174:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalFlowexp.g:174:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalFlowexp.g:175:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalFlowexp.g:181:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFlowexp.g:187:2: ( (otherlv_0= 'Hello' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalFlowexp.g:188:2: (otherlv_0= 'Hello' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalFlowexp.g:188:2: (otherlv_0= 'Hello' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // InternalFlowexp.g:189:3: otherlv_0= 'Hello' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
            		
            // InternalFlowexp.g:193:3: ( (otherlv_1= RULE_ID ) )
            // InternalFlowexp.g:194:4: (otherlv_1= RULE_ID )
            {
            // InternalFlowexp.g:194:4: (otherlv_1= RULE_ID )
            // InternalFlowexp.g:195:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}