/*
 * 
 */
package smartcontract.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import smartcontract.diagram.edit.parts.SmartContractsEditPart;
import smartcontract.diagram.edit.parts.SmartcontractEditPartFactory;
import smartcontract.diagram.part.SmartcontractVisualIDRegistry;

/**
 * @generated
 */
public class SmartcontractEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public SmartcontractEditPartProvider() {
		super(new SmartcontractEditPartFactory(), SmartcontractVisualIDRegistry.TYPED_INSTANCE,
				SmartContractsEditPart.MODEL_ID);
	}

}
