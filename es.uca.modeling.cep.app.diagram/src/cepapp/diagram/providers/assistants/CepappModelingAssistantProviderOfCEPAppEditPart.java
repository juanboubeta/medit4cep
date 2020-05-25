/*
 * 
 */
package cepapp.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import cepapp.diagram.providers.CepappElementTypes;
import cepapp.diagram.providers.CepappModelingAssistantProvider;

/**
 * @generated
 */
public class CepappModelingAssistantProviderOfCEPAppEditPart extends CepappModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(CepappElementTypes.InMemoryInput_2011);
		types.add(CepappElementTypes.InputFile_2001);
		types.add(CepappElementTypes.SourceMqtt_2004);
		types.add(CepappElementTypes.InMemoryOutput_2012);
		types.add(CepappElementTypes.OutputFile_2005);
		types.add(CepappElementTypes.SinkMqtt_2008);
		types.add(CepappElementTypes.Event_2009);
		types.add(CepappElementTypes.ComplexEvent_2010);
		return types;
	}

}
