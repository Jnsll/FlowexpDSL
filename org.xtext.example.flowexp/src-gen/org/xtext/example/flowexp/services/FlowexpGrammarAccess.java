/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class FlowexpGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.flowexp.Flowexp.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPeopleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPeopleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPeoplePersonParserRuleCall_1_0 = (RuleCall)cPeopleAssignment_1.eContents().get(0);
		private final Keyword cGreetingsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGreetingsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGreetingsGreetingParserRuleCall_3_0 = (RuleCall)cGreetingsAssignment_3.eContents().get(0);
		
		//Model:
		//	'people'
		//	people+=Person*
		//	'greetings'
		//	greetings+=Greeting*;
		@Override public ParserRule getRule() { return rule; }
		
		//'people' people+=Person* 'greetings' greetings+=Greeting*
		public Group getGroup() { return cGroup; }
		
		//'people'
		public Keyword getPeopleKeyword_0() { return cPeopleKeyword_0; }
		
		//people+=Person*
		public Assignment getPeopleAssignment_1() { return cPeopleAssignment_1; }
		
		//Person
		public RuleCall getPeoplePersonParserRuleCall_1_0() { return cPeoplePersonParserRuleCall_1_0; }
		
		//'greetings'
		public Keyword getGreetingsKeyword_2() { return cGreetingsKeyword_2; }
		
		//greetings+=Greeting*
		public Assignment getGreetingsAssignment_3() { return cGreetingsAssignment_3; }
		
		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_3_0() { return cGreetingsGreetingParserRuleCall_3_0; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.flowexp.Flowexp.Person");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Person:
		//	"person" name=STRING ';';
		@Override public ParserRule getRule() { return rule; }
		
		//"person" name=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//"person"
		public Keyword getPersonKeyword_0() { return cPersonKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.flowexp.Flowexp.Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHelloKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPersonAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPersonPersonCrossReference_1_0 = (CrossReference)cPersonAssignment_1.eContents().get(0);
		private final RuleCall cPersonPersonIDTerminalRuleCall_1_0_1 = (RuleCall)cPersonPersonCrossReference_1_0.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Greeting:
		//	'Hello' person=[Person] '!';
		@Override public ParserRule getRule() { return rule; }
		
		//'Hello' person=[Person] '!'
		public Group getGroup() { return cGroup; }
		
		//'Hello'
		public Keyword getHelloKeyword_0() { return cHelloKeyword_0; }
		
		//person=[Person]
		public Assignment getPersonAssignment_1() { return cPersonAssignment_1; }
		
		//[Person]
		public CrossReference getPersonPersonCrossReference_1_0() { return cPersonPersonCrossReference_1_0; }
		
		//ID
		public RuleCall getPersonPersonIDTerminalRuleCall_1_0_1() { return cPersonPersonIDTerminalRuleCall_1_0_1; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
	}
	
	
	private final ModelElements pModel;
	private final PersonElements pPerson;
	private final GreetingElements pGreeting;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FlowexpGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPerson = new PersonElements();
		this.pGreeting = new GreetingElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.flowexp.Flowexp".equals(grammar.getName())) {
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

	
	//Model:
	//	'people'
	//	people+=Person*
	//	'greetings'
	//	greetings+=Greeting*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Person:
	//	"person" name=STRING ';';
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//Greeting:
	//	'Hello' person=[Person] '!';
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
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
	//	'/*'->'*/';
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