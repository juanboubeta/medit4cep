/*
 * 
 */
package domain.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case CEPDomainEditPart.VISUAL_ID:
				return new CEPDomainEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventTypeNameEditPart.VISUAL_ID:
				return new EventTypeNameEditPart(view);

			case EventPropertyEditPart.VISUAL_ID:
				return new EventPropertyEditPart(view);

			case EventPropertyNameEditPart.VISUAL_ID:
				return new EventPropertyNameEditPart(view);

			case EventProperty2EditPart.VISUAL_ID:
				return new EventProperty2EditPart(view);

			case EventPropertyName2EditPart.VISUAL_ID:
				return new EventPropertyName2EditPart(view);

			case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new EventEventEventPropertiesCompartmentEditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartmentEditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
