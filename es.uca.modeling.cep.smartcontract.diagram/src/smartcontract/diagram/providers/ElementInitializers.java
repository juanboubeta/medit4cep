/*
 * 
 */
package smartcontract.diagram.providers;

import smartcontract.diagram.part.SmartcontractDiagramEditorPlugin;

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
		ElementInitializers cached = SmartcontractDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			SmartcontractDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
