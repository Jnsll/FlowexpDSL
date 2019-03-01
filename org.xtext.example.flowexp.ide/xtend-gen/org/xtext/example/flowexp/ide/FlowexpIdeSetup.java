/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.flowexp.FlowexpRuntimeModule;
import org.xtext.example.flowexp.FlowexpStandaloneSetup;
import org.xtext.example.flowexp.ide.FlowexpIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FlowexpIdeSetup extends FlowexpStandaloneSetup {
  @Override
  public Injector createInjector() {
    FlowexpRuntimeModule _flowexpRuntimeModule = new FlowexpRuntimeModule();
    FlowexpIdeModule _flowexpIdeModule = new FlowexpIdeModule();
    return Guice.createInjector(Modules2.mixin(_flowexpRuntimeModule, _flowexpIdeModule));
  }
}