/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui.tests;

import alma.mde.project.ui.internal.ProjectActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ProjectActivator.getInstance().getInjector("org.xtext.example.mydsl.MyDsl");
	}

}
