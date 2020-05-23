/*
 * 
 */
package cepapp.diagram.providers;

import cepapp.diagram.part.CepappDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CepappDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CepappDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
