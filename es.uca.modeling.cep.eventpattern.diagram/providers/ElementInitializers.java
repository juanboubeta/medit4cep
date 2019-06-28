/*
 * 
 */
package eventpattern.diagram.providers;

import eventpattern.diagram.part.EventpatternDiagramEditorPlugin;

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
		ElementInitializers cached = EventpatternDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			EventpatternDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
