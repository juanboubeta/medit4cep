/*
 * 
 */
package cepapp.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import cepapp.diagram.edit.parts.ComplexEventEditPart;
import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.edit.parts.OutputFileEditPart;
import cepapp.diagram.edit.parts.SinkEmailEditPart;
import cepapp.diagram.edit.parts.SinkHttpEditPart;
import cepapp.diagram.edit.parts.SinkMongoDBEditPart;
import cepapp.diagram.edit.parts.SinkMqttEditPart;
import cepapp.diagram.edit.parts.SinkRDBMSEditPart;
import cepapp.diagram.providers.CepappElementTypes;
import cepapp.diagram.providers.CepappModelingAssistantProvider;

/**
 * @generated
 */
public class CepappModelingAssistantProviderOfComplexEventEditPart extends CepappModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CepappElementTypes.ComplexEventProperty_3003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ComplexEventEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ComplexEventEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CepappElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ComplexEventEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ComplexEventEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InMemoryOutputEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof OutputFileEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SinkMqttEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EventEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ComplexEventEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ComplexEventEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CepappElementTypes.Link_4001) {
			types.add(CepappElementTypes.InMemoryOutput_2012);
			types.add(CepappElementTypes.OutputFile_2005);
			types.add(CepappElementTypes.SinkMqtt_2008);
			types.add(CepappElementTypes.Event_2009);
		}
		return types;
	}

}
