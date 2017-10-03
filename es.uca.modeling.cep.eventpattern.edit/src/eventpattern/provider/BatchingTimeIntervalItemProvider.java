/**
 */
package eventpattern.provider;


import eventpattern.BatchingTimeInterval;
import eventpattern.EventpatternPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link eventpattern.BatchingTimeInterval} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BatchingTimeIntervalItemProvider
  extends DataWindowItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BatchingTimeIntervalItemProvider(AdapterFactory adapterFactory)
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

			addYearsPropertyDescriptor(object);
			addMonthsPropertyDescriptor(object);
			addWeeksPropertyDescriptor(object);
			addDaysPropertyDescriptor(object);
			addHoursPropertyDescriptor(object);
			addMinutesPropertyDescriptor(object);
			addSecondsPropertyDescriptor(object);
			addMillisecondsPropertyDescriptor(object);
			addStartTimestampPropertyDescriptor(object);
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
				 getString("_UI_BatchingTimeInterval_years_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_years_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__YEARS,
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
				 getString("_UI_BatchingTimeInterval_months_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_months_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__MONTHS,
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
				 getString("_UI_BatchingTimeInterval_weeks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_weeks_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__WEEKS,
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
				 getString("_UI_BatchingTimeInterval_days_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_days_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__DAYS,
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
				 getString("_UI_BatchingTimeInterval_hours_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_hours_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__HOURS,
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
				 getString("_UI_BatchingTimeInterval_minutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_minutes_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__MINUTES,
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
				 getString("_UI_BatchingTimeInterval_seconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_seconds_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__SECONDS,
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
				 getString("_UI_BatchingTimeInterval_milliseconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_milliseconds_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__MILLISECONDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Start Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BatchingTimeInterval_startTimestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BatchingTimeInterval_startTimestamp_feature", "_UI_BatchingTimeInterval_type"),
				 EventpatternPackage.Literals.BATCHING_TIME_INTERVAL__START_TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This returns BatchingTimeInterval.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BatchingTimeInterval"));
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
		BatchingTimeInterval batchingTimeInterval = (BatchingTimeInterval)object;
		return getString("_UI_BatchingTimeInterval_type") + " " + batchingTimeInterval.getYears();
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

		switch (notification.getFeatureID(BatchingTimeInterval.class)) {
			case EventpatternPackage.BATCHING_TIME_INTERVAL__YEARS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MONTHS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__WEEKS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__DAYS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__HOURS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MINUTES:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__SECONDS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MILLISECONDS:
			case EventpatternPackage.BATCHING_TIME_INTERVAL__START_TIMESTAMP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
