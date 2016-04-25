/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.exp1.exp1.Exp1;
import org.xtext.example.exp1.exp1.Exp1Package;
import org.xtext.example.exp1.services.Exp1GrammarAccess;

@SuppressWarnings("all")
public class Exp1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Exp1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Exp1Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Exp1Package.EXP1:
				sequence_Exp1(context, (Exp1) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Exp1 returns Exp1
	 *
	 * Constraint:
	 *     expressoes+=Expressao+
	 */
	protected void sequence_Exp1(ISerializationContext context, Exp1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
