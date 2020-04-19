/*
 * 
 */
package eventpattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import eventpattern.diagram.edit.parts.SmartContractEditPart;
import eventpattern.diagram.providers.EventpatternElementTypes;
import eventpattern.diagram.providers.EventpatternModelingAssistantProvider;

/**
 * @generated
 */
public class EventpatternModelingAssistantProviderOfSmartContractEditPart
		extends EventpatternModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.ContractFunction_3061);
		return types;
	}

}
