/**
 */
package eventpattern.impl;

import eventpattern.BatchingTimeInterval;
import eventpattern.EventpatternPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batching Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getYears <em>Years</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getMonths <em>Months</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getDays <em>Days</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getMilliseconds <em>Milliseconds</em>}</li>
 *   <li>{@link eventpattern.impl.BatchingTimeIntervalImpl#getStartTimestamp <em>Start Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchingTimeIntervalImpl extends DataWindowImpl implements BatchingTimeInterval
{
  /**
	 * The default value of the '{@link #getYears() <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
  protected static final int YEARS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
  protected int years = YEARS_EDEFAULT;

  /**
	 * The default value of the '{@link #getMonths() <em>Months</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMonths()
	 * @generated
	 * @ordered
	 */
  protected static final int MONTHS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMonths() <em>Months</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMonths()
	 * @generated
	 * @ordered
	 */
  protected int months = MONTHS_EDEFAULT;

  /**
	 * The default value of the '{@link #getWeeks() <em>Weeks</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWeeks()
	 * @generated
	 * @ordered
	 */
  protected static final int WEEKS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getWeeks() <em>Weeks</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWeeks()
	 * @generated
	 * @ordered
	 */
  protected int weeks = WEEKS_EDEFAULT;

  /**
	 * The default value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
  protected static final int DAYS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
  protected int days = DAYS_EDEFAULT;

  /**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
  protected static final int HOURS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
  protected int hours = HOURS_EDEFAULT;

  /**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
  protected static final int MINUTES_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
  protected int minutes = MINUTES_EDEFAULT;

  /**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
  protected static final int SECONDS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
  protected int seconds = SECONDS_EDEFAULT;

  /**
	 * The default value of the '{@link #getMilliseconds() <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMilliseconds()
	 * @generated
	 * @ordered
	 */
  protected static final int MILLISECONDS_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMilliseconds() <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMilliseconds()
	 * @generated
	 * @ordered
	 */
  protected int milliseconds = MILLISECONDS_EDEFAULT;

  /**
	 * The default value of the '{@link #getStartTimestamp() <em>Start Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIMESTAMP_EDEFAULT = 0L;

		/**
	 * The cached value of the '{@link #getStartTimestamp() <em>Start Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long startTimestamp = START_TIMESTAMP_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BatchingTimeIntervalImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EventpatternPackage.Literals.BATCHING_TIME_INTERVAL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getYears()
  {
		return years;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setYears(int newYears)
  {
		int oldYears = years;
		years = newYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__YEARS, oldYears, years));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMonths()
  {
		return months;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMonths(int newMonths)
  {
		int oldMonths = months;
		months = newMonths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__MONTHS, oldMonths, months));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getWeeks()
  {
		return weeks;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWeeks(int newWeeks)
  {
		int oldWeeks = weeks;
		weeks = newWeeks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__WEEKS, oldWeeks, weeks));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getDays()
  {
		return days;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDays(int newDays)
  {
		int oldDays = days;
		days = newDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__DAYS, oldDays, days));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getHours()
  {
		return hours;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHours(int newHours)
  {
		int oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__HOURS, oldHours, hours));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinutes()
  {
		return minutes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinutes(int newMinutes)
  {
		int oldMinutes = minutes;
		minutes = newMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__MINUTES, oldMinutes, minutes));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getSeconds()
  {
		return seconds;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSeconds(int newSeconds)
  {
		int oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__SECONDS, oldSeconds, seconds));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMilliseconds()
  {
		return milliseconds;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMilliseconds(int newMilliseconds)
  {
		int oldMilliseconds = milliseconds;
		milliseconds = newMilliseconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__MILLISECONDS, oldMilliseconds, milliseconds));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartTimestamp() {
		return startTimestamp;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimestamp(long newStartTimestamp) {
		long oldStartTimestamp = startTimestamp;
		startTimestamp = newStartTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_TIME_INTERVAL__START_TIMESTAMP, oldStartTimestamp, startTimestamp));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_TIME_INTERVAL__YEARS:
				return getYears();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MONTHS:
				return getMonths();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__WEEKS:
				return getWeeks();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__DAYS:
				return getDays();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__HOURS:
				return getHours();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MINUTES:
				return getMinutes();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__SECONDS:
				return getSeconds();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MILLISECONDS:
				return getMilliseconds();
			case EventpatternPackage.BATCHING_TIME_INTERVAL__START_TIMESTAMP:
				return getStartTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_TIME_INTERVAL__YEARS:
				setYears((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MONTHS:
				setMonths((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__WEEKS:
				setWeeks((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__DAYS:
				setDays((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__HOURS:
				setHours((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MINUTES:
				setMinutes((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__SECONDS:
				setSeconds((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MILLISECONDS:
				setMilliseconds((Integer)newValue);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__START_TIMESTAMP:
				setStartTimestamp((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_TIME_INTERVAL__YEARS:
				setYears(YEARS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MONTHS:
				setMonths(MONTHS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__WEEKS:
				setWeeks(WEEKS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__DAYS:
				setDays(DAYS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MILLISECONDS:
				setMilliseconds(MILLISECONDS_EDEFAULT);
				return;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__START_TIMESTAMP:
				setStartTimestamp(START_TIMESTAMP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_TIME_INTERVAL__YEARS:
				return years != YEARS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MONTHS:
				return months != MONTHS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__WEEKS:
				return weeks != WEEKS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__DAYS:
				return days != DAYS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__HOURS:
				return hours != HOURS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MINUTES:
				return minutes != MINUTES_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__SECONDS:
				return seconds != SECONDS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__MILLISECONDS:
				return milliseconds != MILLISECONDS_EDEFAULT;
			case EventpatternPackage.BATCHING_TIME_INTERVAL__START_TIMESTAMP:
				return startTimestamp != START_TIMESTAMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (years: ");
		result.append(years);
		result.append(", months: ");
		result.append(months);
		result.append(", weeks: ");
		result.append(weeks);
		result.append(", days: ");
		result.append(days);
		result.append(", hours: ");
		result.append(hours);
		result.append(", minutes: ");
		result.append(minutes);
		result.append(", seconds: ");
		result.append(seconds);
		result.append(", milliseconds: ");
		result.append(milliseconds);
		result.append(", startTimestamp: ");
		result.append(startTimestamp);
		result.append(')');
		return result.toString();
	}

} //BatchingTimeIntervalImpl
