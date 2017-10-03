/*
 * 
 */
package eventpattern.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import eventpattern.diagram.edit.parts.CEPEventPatternEditPart;
import eventpattern.diagram.edit.parts.EventpatternEditPartFactory;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;

/**
 * @generated
 */
public class EventpatternEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public EventpatternEditPartProvider() {
		super(new EventpatternEditPartFactory(), EventpatternVisualIDRegistry.TYPED_INSTANCE,
				CEPEventPatternEditPart.MODEL_ID);
	}

}
