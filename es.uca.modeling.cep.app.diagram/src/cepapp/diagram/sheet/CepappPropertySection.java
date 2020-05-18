
/*
 * 
 */
package cepapp.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositePropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import cepapp.ComplexEvent;
import cepapp.ComplexEventProperty;
import cepapp.Event;
import cepapp.EventProperty;
import es.uca.modeling.cep.domain.figures.PropertyImagePathPropertyDescriptor;

/**
 * @generated
 */
public class CepappPropertySection extends DefaultPropertySection implements IPropertySourceProvider {

	/**
	* Modify/unwrap selection.
	* @generated
	*/
	@Override
	protected Object transformSelection(Object selected) {
		selected = /*super.*/transformSelectionToDomain(selected);
		return selected;
	}

	/**
	 * @generated NOT
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);

			if (ips != null) {

				if (object instanceof EventProperty || object instanceof Event || object instanceof ComplexEvent
						|| object instanceof ComplexEventProperty) {

					return new PropertySource(object, ips) {
						protected IPropertyDescriptor createPropertyDescriptor(
								IItemPropertyDescriptor itemPropertyDescriptor) {

							EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(object);

							if (feature.getName().equalsIgnoreCase("imagePath")) {
								return new PropertyImagePathPropertyDescriptor(object, itemPropertyDescriptor, "Misc");
							} else {
								return new EMFCompositeSourcePropertyDescriptor(object, itemPropertyDescriptor, "Misc");
							}
						}
					};
				}

				return new EMFCompositePropertySource(object, ips, "Misc");
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object).getAdapter(IPropertySource.class);
		}
		return null;
	}
}
