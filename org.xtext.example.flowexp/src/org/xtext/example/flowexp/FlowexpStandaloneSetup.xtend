/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class FlowexpStandaloneSetup extends FlowexpStandaloneSetupGenerated {

	def static void doSetup() {
		new FlowexpStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
