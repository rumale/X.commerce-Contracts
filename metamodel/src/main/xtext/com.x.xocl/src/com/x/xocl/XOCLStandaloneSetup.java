
package com.x.xocl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XOCLStandaloneSetup extends XOCLStandaloneSetupGenerated{

	public static void doSetup() {
		new XOCLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

