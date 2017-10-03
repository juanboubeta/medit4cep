/**
 */
package eventpattern.provider;


import eventpattern.DataWindow;
import eventpattern.EventpatternFactory;
import eventpattern.EventpatternPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eventpattern.DataWindow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWindowItemProvider
  extends EventPatternElementItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataWindowItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		return getString("_UI_DataWindow_type");
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

		switch (notification.getFeatureID(DataWindow.class)) {
			case EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS:
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
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createEvery()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createEveryDistinct()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createUntil()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createFollowedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createModulus()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createLessEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createGreaterEqual()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createMax()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createMin()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createAvg()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createSum()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createWithinTimer()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createTimeSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createEventProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EventpatternPackage.Literals.DATA_WINDOW__EVENT_PATTERN_CONDITIONS,
				 EventpatternFactory.eINSTANCE.createValue()));
	}

}
