/**
 */
package eventpattern.provider;


import eventpattern.EventpatternFactory;
import eventpattern.EventpatternPackage;
import eventpattern.WithinTimer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eventpattern.WithinTimer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WithinTimerItemProvider
  extends PatternOperandItemProvider
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
  public WithinTimerItemProvider(AdapterFactory adapterFactory)
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
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addYearsPropertyDescriptor(object);
      addMonthsPropertyDescriptor(object);
      addWeeksPropertyDescriptor(object);
      addDaysPropertyDescriptor(object);
      addHoursPropertyDescriptor(object);
      addMinutesPropertyDescriptor(object);
      addSecondsPropertyDescriptor(object);
      addMillisecondsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Years feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addYearsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_years_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_years_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__YEARS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Months feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMonthsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_months_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_months_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__MONTHS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Weeks feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addWeeksPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_weeks_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_weeks_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__WEEKS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Days feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDaysPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_days_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_days_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__DAYS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Hours feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHoursPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_hours_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_hours_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__HOURS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Minutes feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMinutesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_minutes_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_minutes_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__MINUTES,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Seconds feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSecondsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_seconds_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_seconds_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__SECONDS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Milliseconds feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMillisecondsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_WithinTimer_milliseconds_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WithinTimer_milliseconds_feature", "_UI_WithinTimer_type"),
         EventpatternPackage.Literals.WITHIN_TIMER__MILLISECONDS,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS);
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
   * This returns WithinTimer.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/WithinTimer"));
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
    WithinTimer withinTimer = (WithinTimer)object;
    return getString("_UI_WithinTimer_type") + " " + withinTimer.getYears();
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

    switch (notification.getFeatureID(WithinTimer.class))
    {
      case EventpatternPackage.WITHIN_TIMER__YEARS:
      case EventpatternPackage.WITHIN_TIMER__MONTHS:
      case EventpatternPackage.WITHIN_TIMER__WEEKS:
      case EventpatternPackage.WITHIN_TIMER__DAYS:
      case EventpatternPackage.WITHIN_TIMER__HOURS:
      case EventpatternPackage.WITHIN_TIMER__MINUTES:
      case EventpatternPackage.WITHIN_TIMER__SECONDS:
      case EventpatternPackage.WITHIN_TIMER__MILLISECONDS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS:
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
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createEvery()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createEveryDistinct()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createRepeat()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createUntil()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createRange()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createFollowedBy()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createWhile()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createAnd()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createOr()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createNot()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createAddition()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createSubtraction()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createMultiplication()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createDivision()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createModulus()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createEqual()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createNotEqual()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createLessThan()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createGreaterThan()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createLessEqual()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createGreaterEqual()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createEvent()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createEventProperty()));

    newChildDescriptors.add
      (createChildParameter
        (EventpatternPackage.Literals.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS,
         EventpatternFactory.eINSTANCE.createValue()));
  }

}
