/*
* 
*/
package cepapp.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import cepapp.diagram.edit.commands.ComplexEventCreateCommand;
import cepapp.diagram.edit.commands.EventCreateCommand;
import cepapp.diagram.edit.commands.InputFileCreateCommand;
import cepapp.diagram.edit.commands.OutputFileCreateCommand;
import cepapp.diagram.edit.commands.SinkMqttCreateCommand;
import cepapp.diagram.edit.commands.SourceMqttCreateCommand;
import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class CEPAppItemSemanticEditPolicy extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CEPAppItemSemanticEditPolicy() {
		super(CepappElementTypes.CEPApp_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {

		if (CepappElementTypes.InputFile_2001 == req.getElementType()) {
			return getGEFWrapper(new InputFileCreateCommand(req));
		}
		if (CepappElementTypes.SourceMqtt_2004 == req.getElementType()) {
			return getGEFWrapper(new SourceMqttCreateCommand(req));
		}
		if (CepappElementTypes.OutputFile_2005 == req.getElementType()) {
			return getGEFWrapper(new OutputFileCreateCommand(req));
		}
		if (CepappElementTypes.SinkMqtt_2008 == req.getElementType()) {
			return getGEFWrapper(new SinkMqttCreateCommand(req));
		}
		if (CepappElementTypes.Event_2009 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (CepappElementTypes.ComplexEvent_2010 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
