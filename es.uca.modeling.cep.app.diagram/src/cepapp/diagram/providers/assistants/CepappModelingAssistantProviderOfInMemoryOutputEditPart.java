/*
 * 
 */
package cepapp.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.providers.CepappElementTypes;
import cepapp.diagram.providers.CepappModelingAssistantProvider;

/**
 * @generated
 */
public class CepappModelingAssistantProviderOfInMemoryOutputEditPart extends CepappModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((InMemoryOutputEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(InMemoryOutputEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CepappElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((InMemoryOutputEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(InMemoryOutputEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CepappElementTypes.Link_4001) {
			types.add(CepappElementTypes.InMemoryInput_2011);
			types.add(CepappElementTypes.InputFile_2001);
			types.add(CepappElementTypes.SourceMqtt_2004);
			types.add(CepappElementTypes.ComplexEvent_2010);
		}
		return types;
	}

}
