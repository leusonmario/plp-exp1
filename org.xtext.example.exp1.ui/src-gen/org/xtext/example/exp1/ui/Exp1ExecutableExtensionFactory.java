/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.exp1.ui.internal.Exp1Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Exp1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Exp1Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Exp1Activator.getInstance().getInjector(Exp1Activator.ORG_XTEXT_EXAMPLE_EXP1_EXP1);
	}
	
}
