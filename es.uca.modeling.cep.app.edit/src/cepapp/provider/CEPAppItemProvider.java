/**
 */
package cepapp.provider;


import cepapp.CEPApp;
import cepapp.CepappFactory;
import cepapp.CepappPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cepapp.CEPApp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CEPAppItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEPAppItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPApp_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPApp_name_feature", "_UI_CEPApp_type"),
				 CepappPackage.Literals.CEP_APP__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPApp_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPApp_description_feature", "_UI_CEPApp_type"),
				 CepappPackage.Literals.CEP_APP__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPApp_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPApp_creationDate_feature", "_UI_CEPApp_type"),
				 CepappPackage.Literals.CEP_APP__CREATION_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPApp_domainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPApp_domainName_feature", "_UI_CEPApp_type"),
				 CepappPackage.Literals.CEP_APP__DOMAIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CepappPackage.Literals.CEP_APP__SOURCE_ELEMENTS);
			childrenFeatures.add(CepappPackage.Literals.CEP_APP__SINK_ELEMENTS);
			childrenFeatures.add(CepappPackage.Literals.CEP_APP__LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CEPApp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CEPApp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CEPApp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CEPApp_type") :
			getString("_UI_CEPApp_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CEPApp.class)) {
			case CepappPackage.CEP_APP__NAME:
			case CepappPackage.CEP_APP__DESCRIPTION:
			case CepappPackage.CEP_APP__CREATION_DATE:
			case CepappPackage.CEP_APP__DOMAIN_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CepappPackage.CEP_APP__SOURCE_ELEMENTS:
			case CepappPackage.CEP_APP__SINK_ELEMENTS:
			case CepappPackage.CEP_APP__LINKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);


		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SOURCE_ELEMENTS,
				 CepappFactory.eINSTANCE.createInputFile()));

		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SOURCE_ELEMENTS,
				 CepappFactory.eINSTANCE.createSourceMqtt()));

		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SOURCE_ELEMENTS,
				 CepappFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SINK_ELEMENTS,
				 CepappFactory.eINSTANCE.createComplexEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SINK_ELEMENTS,
				 CepappFactory.eINSTANCE.createOutputFile()));

		/*newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SINK_ELEMENTS,
				 CepappFactory.eINSTANCE.createSinkRDBMS()));
		*/

		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__SINK_ELEMENTS,
				 CepappFactory.eINSTANCE.createSinkMqtt()));

		newChildDescriptors.add
			(createChildParameter
				(CepappPackage.Literals.CEP_APP__LINKS,
				 CepappFactory.eINSTANCE.createLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CepappEditPlugin.INSTANCE;
	}

}
