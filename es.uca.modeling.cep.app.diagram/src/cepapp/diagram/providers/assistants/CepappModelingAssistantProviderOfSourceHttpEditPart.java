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

import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.edit.parts.OutputFileEditPart;
import cepapp.diagram.edit.parts.SinkEmailEditPart;
import cepapp.diagram.edit.parts.SinkHttpEditPart;
import cepapp.diagram.edit.parts.SinkMongoDBEditPart;
import cepapp.diagram.edit.parts.SinkMqttEditPart;
import cepapp.diagram.edit.parts.SinkRDBMSEditPart;
import cepapp.diagram.edit.parts.SourceHttpEditPart;
import cepapp.diagram.providers.CepappElementTypes;
import cepapp.diagram.providers.CepappModelingAssistantProvider;

/**
 * @generated
 */
public class CepappModelingAssistantProviderOfSourceHttpEditPart extends CepappModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SourceHttpEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SourceHttpEditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((SourceHttpEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SourceHttpEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SinkMongoDBEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof InMemoryOutputEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SinkEmailEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof OutputFileEditPart) {
			types.add(CepappElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SinkHttpEditPart) {
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
		return doGetTypesForTarget((SourceHttpEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SourceHttpEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CepappElementTypes.Link_4001) {
			types.add(CepappElementTypes.SinkMongoDB_2019);
			types.add(CepappElementTypes.InMemoryOutput_2023);
			types.add(CepappElementTypes.SinkEmail_2024);
			types.add(CepappElementTypes.OutputFile_2005);
			types.add(CepappElementTypes.SinkHttp_2007);
			types.add(CepappElementTypes.SinkMqtt_2008);
			types.add(CepappElementTypes.Event_2009);
		}
		return types;
	}

}
