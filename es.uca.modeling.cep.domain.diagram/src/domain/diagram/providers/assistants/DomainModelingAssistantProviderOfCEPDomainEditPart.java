/*
 * 
 */
package domain.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import domain.diagram.providers.DomainElementTypes;
import domain.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfCEPDomainEditPart extends DomainModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.Event_2001);
		return types;
	}

}
