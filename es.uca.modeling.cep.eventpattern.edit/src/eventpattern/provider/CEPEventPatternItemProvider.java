/**
 */
package eventpattern.provider;


import eventpattern.CEPEventPattern;
import eventpattern.EventpatternFactory;
import eventpattern.EventpatternPackage;

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
 * This is the item provider adapter for a {@link eventpattern.CEPEventPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CEPEventPatternItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CEPEventPatternItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPatternNamePropertyDescriptor(object);
			addPatternDescriptionPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
			addPatternPriorityPropertyDescriptor(object);
			addPatternCreationDatePropertyDescriptor(object);
			addPatternDeployedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Pattern Name feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPatternNamePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPEventPattern_patternName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPEventPattern_patternName_feature", "_UI_CEPEventPattern_type"),
				 EventpatternPackage.Literals.CEP_EVENT_PATTERN__PATTERN_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Pattern Description feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPatternDescriptionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPEventPattern_patternDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPEventPattern_patternDescription_feature", "_UI_CEPEventPattern_type"),
				 EventpatternPackage.Literals.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION,
				 true,
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
  protected void addDomainNamePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPEventPattern_domainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPEventPattern_domainName_feature", "_UI_CEPEventPattern_type"),
				 EventpatternPackage.Literals.CEP_EVENT_PATTERN__DOMAIN_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Pattern Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPEventPattern_patternPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPEventPattern_patternPriority_feature", "_UI_CEPEventPattern_type"),
				 EventpatternPackage.Literals.CEP_EVENT_PATTERN__PATTERN_PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Pattern Creation Date feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPatternCreationDatePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPEventPattern_patternCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPEventPattern_patternCreationDate_feature", "_UI_CEPEventPattern_type"),
				 EventpatternPackage.Literals.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Pattern Deployed feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPatternDeployedPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CEPEventPattern_patternDeployed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CEPEventPattern_patternDeployed_feature", "_UI_CEPEventPattern_type"),
				 EventpatternPackage.Literals.CEP_EVENT_PATTERN__PATTERN_DEPLOYED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EventpatternPackage.Literals.CEP_EVENT_PATTERN__LINKS);
			childrenFeatures.add(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS);
			childrenFeatures.add(EventpatternPackage.Literals.CEP_EVENT_PATTERN__COMPLEX_EVENT);
			childrenFeatures.add(EventpatternPackage.Literals.CEP_EVENT_PATTERN__SMART_CONTRACTS);
			childrenFeatures.add(EventpatternPackage.Literals.CEP_EVENT_PATTERN__ACTIONS);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns CEPEventPattern.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CEPEventPattern"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((CEPEventPattern)object).getPatternName();
		return label == null || label.length() == 0 ?
			getString("_UI_CEPEventPattern_type") :
			getString("_UI_CEPEventPattern_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(CEPEventPattern.class)) {
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_NAME:
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION:
			case EventpatternPackage.CEP_EVENT_PATTERN__DOMAIN_NAME:
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_PRIORITY:
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE:
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DEPLOYED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__LINKS:
			case EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS:
			case EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT:
			case EventpatternPackage.CEP_EVENT_PATTERN__SMART_CONTRACTS:
			case EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__LINKS,
				 EventpatternFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createSlidingEventInterval()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createBatchingEventInterval()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createSlidingTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createBatchingTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createGroupBy()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createEvery()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createEveryDistinct()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createFollowedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createModulus()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createLessEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createGreaterEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createMax()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createMin()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createAvg()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createWithinTimer()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createTimeSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS,
				 EventpatternFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__COMPLEX_EVENT,
				 EventpatternFactory.eINSTANCE.createComplexEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__SMART_CONTRACTS,
				 EventpatternFactory.eINSTANCE.createSmartContract()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__ACTIONS,
				 EventpatternFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.CEP_EVENT_PATTERN__ACTIONS,
				 EventpatternFactory.eINSTANCE.createTwitter()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return EventpatternEditPlugin.INSTANCE;
	}

}
