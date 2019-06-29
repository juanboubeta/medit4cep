/*
 * 
 */
package domain.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import domain.diagram.edit.parts.CEPDomainEditPart;
import domain.diagram.edit.parts.DomainEditPartFactory;
import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, CEPDomainEditPart.MODEL_ID);
	}

}
