/*
 * 
 */
package smartcontract.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import smartcontract.diagram.part.SmartcontractVisualIDRegistry;

/**
 * @generated
 */
public class SmartcontractEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SmartcontractVisualIDRegistry.getVisualID(view)) {

			case SmartContractsEditPart.VISUAL_ID:
				return new SmartContractsEditPart(view);

			case SmartContractEditPart.VISUAL_ID:
				return new SmartContractEditPart(view);

			case SmartContractTypeNameEditPart.VISUAL_ID:
				return new SmartContractTypeNameEditPart(view);

			case ConstructorParameterEditPart.VISUAL_ID:
				return new ConstructorParameterEditPart(view);

			case ConstructorParameterNameEditPart.VISUAL_ID:
				return new ConstructorParameterNameEditPart(view);

			case ContractFunctionEditPart.VISUAL_ID:
				return new ContractFunctionEditPart(view);

			case ContractFunctionNameEditPart.VISUAL_ID:
				return new ContractFunctionNameEditPart(view);

			case InputParameterEditPart.VISUAL_ID:
				return new InputParameterEditPart(view);

			case InputParameterNameEditPart.VISUAL_ID:
				return new InputParameterNameEditPart(view);

			case OutputParameterEditPart.VISUAL_ID:
				return new OutputParameterEditPart(view);

			case OutputParameterNameEditPart.VISUAL_ID:
				return new OutputParameterNameEditPart(view);

			case SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID:
				return new SmartContractSmartContractSmartContractPropertiesCompartmentEditPart(view);

			case SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID:
				return new SmartContractSmartContractConstructorParametersContractCompartmentEditPart(view);

			case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
				return new ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart(view);

			case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
				return new ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart(view);
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
