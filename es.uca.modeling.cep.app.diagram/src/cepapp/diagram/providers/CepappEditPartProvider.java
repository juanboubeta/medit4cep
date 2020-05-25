/*
 * 
 */
package cepapp.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import cepapp.diagram.edit.parts.CEPAppEditPart;
import cepapp.diagram.edit.parts.CepappEditPartFactory;
import cepapp.diagram.part.CepappVisualIDRegistry;

/**
 * @generated
 */
public class CepappEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public CepappEditPartProvider() {
		super(new CepappEditPartFactory(), CepappVisualIDRegistry.TYPED_INSTANCE, CEPAppEditPart.MODEL_ID);
	}

}
