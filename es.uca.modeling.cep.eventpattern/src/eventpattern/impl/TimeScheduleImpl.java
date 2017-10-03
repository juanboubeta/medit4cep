/**
 */
package eventpattern.impl;

import eventpattern.EventpatternPackage;
import eventpattern.TimeSchedule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.TimeScheduleImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link eventpattern.impl.TimeScheduleImpl#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link eventpattern.impl.TimeScheduleImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link eventpattern.impl.TimeScheduleImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link eventpattern.impl.TimeScheduleImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link eventpattern.impl.TimeScheduleImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeScheduleImpl extends PatternOperandImpl implements TimeSchedule
{
  /**
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
  protected static final int DAY_OF_WEEK_EDEFAULT = -1;

  /**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
  protected int dayOfWeek = DAY_OF_WEEK_EDEFAULT;

  /**
	 * The default value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDayOfMonth()
	 * @generated
	 * @ordered
	 */
  protected static final int DAY_OF_MONTH_EDEFAULT = -1;

  /**
	 * The cached value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDayOfMonth()
	 * @generated
	 * @ordered
	 */
  protected int dayOfMonth = DAY_OF_MONTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
  protected static final int MONTH_EDEFAULT = -1;

  /**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
  protected int month = MONTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
  protected static final int HOUR_EDEFAULT = -1;

  /**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
  protected int hour = HOUR_EDEFAULT;

  /**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
  protected static final int MINUTE_EDEFAULT = -1;

  /**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
  protected int minute = MINUTE_EDEFAULT;

  /**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
  protected static final int SECOND_EDEFAULT = -1;

  /**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
  protected int second = SECOND_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TimeScheduleImpl()
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
		return EventpatternPackage.Literals.TIME_SCHEDULE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getDayOfWeek()
  {
		return dayOfWeek;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDayOfWeek(int newDayOfWeek)
  {
		int oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.TIME_SCHEDULE__DAY_OF_WEEK, oldDayOfWeek, dayOfWeek));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getDayOfMonth()
  {
		return dayOfMonth;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDayOfMonth(int newDayOfMonth)
  {
		int oldDayOfMonth = dayOfMonth;
		dayOfMonth = newDayOfMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.TIME_SCHEDULE__DAY_OF_MONTH, oldDayOfMonth, dayOfMonth));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMonth()
  {
		return month;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMonth(int newMonth)
  {
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.TIME_SCHEDULE__MONTH, oldMonth, month));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getHour()
  {
		return hour;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHour(int newHour)
  {
		int oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.TIME_SCHEDULE__HOUR, oldHour, hour));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinute()
  {
		return minute;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinute(int newMinute)
  {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.TIME_SCHEDULE__MINUTE, oldMinute, minute));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getSecond()
  {
		return second;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSecond(int newSecond)
  {
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.TIME_SCHEDULE__SECOND, oldSecond, second));
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
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_WEEK:
				return getDayOfWeek();
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_MONTH:
				return getDayOfMonth();
			case EventpatternPackage.TIME_SCHEDULE__MONTH:
				return getMonth();
			case EventpatternPackage.TIME_SCHEDULE__HOUR:
				return getHour();
			case EventpatternPackage.TIME_SCHEDULE__MINUTE:
				return getMinute();
			case EventpatternPackage.TIME_SCHEDULE__SECOND:
				return getSecond();
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
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_WEEK:
				setDayOfWeek((Integer)newValue);
				return;
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_MONTH:
				setDayOfMonth((Integer)newValue);
				return;
			case EventpatternPackage.TIME_SCHEDULE__MONTH:
				setMonth((Integer)newValue);
				return;
			case EventpatternPackage.TIME_SCHEDULE__HOUR:
				setHour((Integer)newValue);
				return;
			case EventpatternPackage.TIME_SCHEDULE__MINUTE:
				setMinute((Integer)newValue);
				return;
			case EventpatternPackage.TIME_SCHEDULE__SECOND:
				setSecond((Integer)newValue);
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
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_WEEK:
				setDayOfWeek(DAY_OF_WEEK_EDEFAULT);
				return;
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_MONTH:
				setDayOfMonth(DAY_OF_MONTH_EDEFAULT);
				return;
			case EventpatternPackage.TIME_SCHEDULE__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case EventpatternPackage.TIME_SCHEDULE__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case EventpatternPackage.TIME_SCHEDULE__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case EventpatternPackage.TIME_SCHEDULE__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_WEEK:
				return dayOfWeek != DAY_OF_WEEK_EDEFAULT;
			case EventpatternPackage.TIME_SCHEDULE__DAY_OF_MONTH:
				return dayOfMonth != DAY_OF_MONTH_EDEFAULT;
			case EventpatternPackage.TIME_SCHEDULE__MONTH:
				return month != MONTH_EDEFAULT;
			case EventpatternPackage.TIME_SCHEDULE__HOUR:
				return hour != HOUR_EDEFAULT;
			case EventpatternPackage.TIME_SCHEDULE__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case EventpatternPackage.TIME_SCHEDULE__SECOND:
				return second != SECOND_EDEFAULT;
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
		result.append(" (dayOfWeek: ");
		result.append(dayOfWeek);
		result.append(", dayOfMonth: ");
		result.append(dayOfMonth);
		result.append(", month: ");
		result.append(month);
		result.append(", hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} //TimeScheduleImpl
