/*
 * 
 */
package cepapp.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import cepapp.diagram.part.CepappVisualIDRegistry;

/**
 * @generated
 */
public class CepappEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CepappVisualIDRegistry.getVisualID(view)) {

			case CEPAppEditPart.VISUAL_ID:
				return new CEPAppEditPart(view);

			case SinkMongoDBEditPart.VISUAL_ID:
				return new SinkMongoDBEditPart(view);

			case InMemoryInputEditPart.VISUAL_ID:
				return new InMemoryInputEditPart(view);

			case SourceEmailEditPart.VISUAL_ID:
				return new SourceEmailEditPart(view);

			case InputFileEditPart.VISUAL_ID:
				return new InputFileEditPart(view);

			case SourceHttpEditPart.VISUAL_ID:
				return new SourceHttpEditPart(view);

			case SourceMqttEditPart.VISUAL_ID:
				return new SourceMqttEditPart(view);

			case InMemoryOutputEditPart.VISUAL_ID:
				return new InMemoryOutputEditPart(view);

			case SinkEmailEditPart.VISUAL_ID:
				return new SinkEmailEditPart(view);

			case OutputFileEditPart.VISUAL_ID:
				return new OutputFileEditPart(view);

			case SinkHttpEditPart.VISUAL_ID:
				return new SinkHttpEditPart(view);

			case SinkMqttEditPart.VISUAL_ID:
				return new SinkMqttEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventTypeNameEditPart.VISUAL_ID:
				return new EventTypeNameEditPart(view);

			case ComplexEventEditPart.VISUAL_ID:
				return new ComplexEventEditPart(view);

			case ComplexEventTypeNameEditPart.VISUAL_ID:
				return new ComplexEventTypeNameEditPart(view);

			case EventPropertyEditPart.VISUAL_ID:
				return new EventPropertyEditPart(view);

			case EventPropertyNameEditPart.VISUAL_ID:
				return new EventPropertyNameEditPart(view);

			case EventProperty2EditPart.VISUAL_ID:
				return new EventProperty2EditPart(view);

			case EventPropertyName2EditPart.VISUAL_ID:
				return new EventPropertyName2EditPart(view);

			case ComplexEventPropertyEditPart.VISUAL_ID:
				return new ComplexEventPropertyEditPart(view);

			case ComplexEventPropertyNameEditPart.VISUAL_ID:
				return new ComplexEventPropertyNameEditPart(view);

			case ComplexEventProperty2EditPart.VISUAL_ID:
				return new ComplexEventProperty2EditPart(view);

			case ComplexEventPropertyName2EditPart.VISUAL_ID:
				return new ComplexEventPropertyName2EditPart(view);

			case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new EventEventEventPropertiesCompartmentEditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartmentEditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartment2EditPart(view);

			case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart(view);

			case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart(view);

			case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID:
				return new ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart(view);

			case LinkEditPart.VISUAL_ID:
				return new LinkEditPart(view);

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
