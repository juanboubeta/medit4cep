/**
 */
package eventpattern.impl;

import eventpattern.EventpatternPackage;
import eventpattern.WithinTimer;
import eventpattern.WithinTimerElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Within Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getYears <em>Years</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getMonths <em>Months</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getDays <em>Days</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getMilliseconds <em>Milliseconds</em>}</li>
 *   <li>{@link eventpattern.impl.WithinTimerImpl#getWithinTimerElements <em>Within Timer Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithinTimerImpl extends PatternOperandImpl implements WithinTimer
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
	 * The cached value of the '{@link #getWithinTimerElements() <em>Within Timer Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWithinTimerElements()
	 * @generated
	 * @ordered
	 */
  protected EList<WithinTimerElement> withinTimerElements;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WithinTimerImpl()
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
		return EventpatternPackage.Literals.WITHIN_TIMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__YEARS, oldYears, years));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__MONTHS, oldMonths, months));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__WEEKS, oldWeeks, weeks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__DAYS, oldDays, days));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__HOURS, oldHours, hours));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__MINUTES, oldMinutes, minutes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__SECONDS, oldSeconds, seconds));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.WITHIN_TIMER__MILLISECONDS, oldMilliseconds, milliseconds));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<WithinTimerElement> getWithinTimerElements()
  {
		if (withinTimerElements == null) {
			withinTimerElements = new EObjectContainmentEList<WithinTimerElement>(WithinTimerElement.class, this, EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS);
		}
		return withinTimerElements;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS:
				return ((InternalEList<?>)getWithinTimerElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case EventpatternPackage.WITHIN_TIMER__YEARS:
				return getYears();
			case EventpatternPackage.WITHIN_TIMER__MONTHS:
				return getMonths();
			case EventpatternPackage.WITHIN_TIMER__WEEKS:
				return getWeeks();
			case EventpatternPackage.WITHIN_TIMER__DAYS:
				return getDays();
			case EventpatternPackage.WITHIN_TIMER__HOURS:
				return getHours();
			case EventpatternPackage.WITHIN_TIMER__MINUTES:
				return getMinutes();
			case EventpatternPackage.WITHIN_TIMER__SECONDS:
				return getSeconds();
			case EventpatternPackage.WITHIN_TIMER__MILLISECONDS:
				return getMilliseconds();
			case EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS:
				return getWithinTimerElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EventpatternPackage.WITHIN_TIMER__YEARS:
				setYears((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__MONTHS:
				setMonths((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__WEEKS:
				setWeeks((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__DAYS:
				setDays((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__HOURS:
				setHours((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__MINUTES:
				setMinutes((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__SECONDS:
				setSeconds((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__MILLISECONDS:
				setMilliseconds((Integer)newValue);
				return;
			case EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS:
				getWithinTimerElements().clear();
				getWithinTimerElements().addAll((Collection<? extends WithinTimerElement>)newValue);
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
			case EventpatternPackage.WITHIN_TIMER__YEARS:
				setYears(YEARS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__MONTHS:
				setMonths(MONTHS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__WEEKS:
				setWeeks(WEEKS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__DAYS:
				setDays(DAYS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__MILLISECONDS:
				setMilliseconds(MILLISECONDS_EDEFAULT);
				return;
			case EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS:
				getWithinTimerElements().clear();
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
			case EventpatternPackage.WITHIN_TIMER__YEARS:
				return years != YEARS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__MONTHS:
				return months != MONTHS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__WEEKS:
				return weeks != WEEKS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__DAYS:
				return days != DAYS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__HOURS:
				return hours != HOURS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__MINUTES:
				return minutes != MINUTES_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__SECONDS:
				return seconds != SECONDS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__MILLISECONDS:
				return milliseconds != MILLISECONDS_EDEFAULT;
			case EventpatternPackage.WITHIN_TIMER__WITHIN_TIMER_ELEMENTS:
				return withinTimerElements != null && !withinTimerElements.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //WithinTimerImpl
