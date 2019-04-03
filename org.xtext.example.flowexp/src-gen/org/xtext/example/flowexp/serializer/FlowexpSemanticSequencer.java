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
import org.xtext.example.flowexp.flowexp.ExpNbBatch;
import org.xtext.example.flowexp.flowexp.ExpNbOne;
import org.xtext.example.flowexp.flowexp.FlowexpPackage;
import org.xtext.example.flowexp.flowexp.InitOne;
import org.xtext.example.flowexp.flowexp.Model;
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
			case FlowexpPackage.EXP_NB_BATCH:
				sequence_ExpNb(context, (ExpNbBatch) semanticObject); 
				return; 
			case FlowexpPackage.EXP_NB_ONE:
				sequence_ExpNb(context, (ExpNbOne) semanticObject); 
				return; 
			case FlowexpPackage.INIT_ONE:
				sequence_InitOne(context, (InitOne) semanticObject); 
				return; 
			case FlowexpPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ExpNb returns ExpNbBatch
	 *
	 * Constraint:
	 *     {ExpNbBatch}
	 */
	protected void sequence_ExpNb(ISerializationContext context, ExpNbBatch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpNb returns ExpNbOne
	 *
	 * Constraint:
	 *     {ExpNbOne}
	 */
	protected void sequence_ExpNb(ISerializationContext context, ExpNbOne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Init returns InitOne
	 *     InitOne returns InitOne
	 *
	 * Constraint:
	 *     (filename+=STRING filename+=STRING* tval=INT pval=INT srval=INT)
	 */
	protected void sequence_InitOne(ISerializationContext context, InitOne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (expr=ExpNb phase=Phase modelname=STRING init=Init)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FlowexpPackage.Literals.MODEL__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowexpPackage.Literals.MODEL__EXPR));
			if (transientValues.isValueTransient(semanticObject, FlowexpPackage.Literals.MODEL__PHASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowexpPackage.Literals.MODEL__PHASE));
			if (transientValues.isValueTransient(semanticObject, FlowexpPackage.Literals.MODEL__MODELNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowexpPackage.Literals.MODEL__MODELNAME));
			if (transientValues.isValueTransient(semanticObject, FlowexpPackage.Literals.MODEL__INIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowexpPackage.Literals.MODEL__INIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getExprExpNbParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getModelAccess().getPhasePhaseParserRuleCall_5_0(), semanticObject.getPhase());
		feeder.accept(grammarAccess.getModelAccess().getModelnameSTRINGTerminalRuleCall_8_0(), semanticObject.getModelname());
		feeder.accept(grammarAccess.getModelAccess().getInitInitParserRuleCall_11_0(), semanticObject.getInit());
		feeder.finish();
	}
	
	
}
