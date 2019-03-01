/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.flowexp.flowexp.FlowexpPackage;
import org.xtext.example.flowexp.flowexp.Greeting;
import org.xtext.example.flowexp.flowexp.Model;
import org.xtext.example.flowexp.flowexp.Person;
import org.xtext.example.flowexp.services.FlowexpGrammarAccess;

@SuppressWarnings("all")
public class FlowexpSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FlowexpGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FlowexpPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FlowexpPackage.GREETING:
				sequence_Greeting(context, (Greeting) semanticObject); 
				return; 
			case FlowexpPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case FlowexpPackage.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Greeting returns Greeting
	 *
	 * Constraint:
	 *     person=[Person|ID]
	 */
	protected void sequence_Greeting(ISerializationContext context, Greeting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FlowexpPackage.Literals.GREETING__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowexpPackage.Literals.GREETING__PERSON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_1_0_1(), semanticObject.eGet(FlowexpPackage.Literals.GREETING__PERSON, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (people+=Person* greetings+=Greeting*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FlowexpPackage.Literals.PERSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowexpPackage.Literals.PERSON__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}