/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.flowexp.flowexp.Person
import org.xtext.example.flowexp.flowexp.FlowexpPackage

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FlowexpValidator extends AbstractFlowexpValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					FlowexpPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def checkNameUppercase(Person person) {
		val premierChar = person.name.substring(0, 1).toUpperCase
		val premierCharBis = person.name.substring(0, 1)
		if (premierChar != premierCharBis) {
			error('''Name must start with an upper case''', 
				person,
				FlowexpPackage.eINSTANCE.person_Name
			)
		}
	}

}