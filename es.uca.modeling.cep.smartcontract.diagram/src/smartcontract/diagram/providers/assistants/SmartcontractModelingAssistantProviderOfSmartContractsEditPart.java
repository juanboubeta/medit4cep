/*
 * 
 */
package smartcontract.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import smartcontract.diagram.providers.SmartcontractElementTypes;
import smartcontract.diagram.providers.SmartcontractModelingAssistantProvider;

/**
 * @generated
 */
public class SmartcontractModelingAssistantProviderOfSmartContractsEditPart
		extends SmartcontractModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SmartcontractElementTypes.SmartContract_2002);
		return types;
	}

}
