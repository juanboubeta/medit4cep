/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliding Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.SlidingTimeInterval#getYears <em>Years</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getMonths <em>Months</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getDays <em>Days</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getHours <em>Hours</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link eventpattern.SlidingTimeInterval#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval()
 * @model annotation="gmf.node figure='rectangle' border.style='dash' border.color='110,110,110' color='230,230,250' label='years, months, weeks, days, hours, minutes, seconds, milliseconds' label.parser='MessageFormatParser' label.readOnly='true' label.view.pattern='Sliding Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}' tool.name='Sliding Time Interval' tool.description='Add a sliding time interval window'"
 * @generated
 */
public interface SlidingTimeInterval extends DataWindow
{
  /**
	 * Returns the value of the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Years</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' attribute.
	 * @see #setYears(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Years()
	 * @model
	 * @generated
	 */
  int getYears();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getYears <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years</em>' attribute.
	 * @see #getYears()
	 * @generated
	 */
  void setYears(int value);

  /**
	 * Returns the value of the '<em><b>Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Months</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Months</em>' attribute.
	 * @see #setMonths(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Months()
	 * @model
	 * @generated
	 */
  int getMonths();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getMonths <em>Months</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Months</em>' attribute.
	 * @see #getMonths()
	 * @generated
	 */
  void setMonths(int value);

  /**
	 * Returns the value of the '<em><b>Weeks</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weeks</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeks</em>' attribute.
	 * @see #setWeeks(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Weeks()
	 * @model
	 * @generated
	 */
  int getWeeks();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getWeeks <em>Weeks</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weeks</em>' attribute.
	 * @see #getWeeks()
	 * @generated
	 */
  void setWeeks(int value);

  /**
	 * Returns the value of the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Days</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' attribute.
	 * @see #setDays(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Days()
	 * @model
	 * @generated
	 */
  int getDays();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getDays <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days</em>' attribute.
	 * @see #getDays()
	 * @generated
	 */
  void setDays(int value);

  /**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hours</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Hours()
	 * @model
	 * @generated
	 */
  int getHours();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
  void setHours(int value);

  /**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Minutes()
	 * @model
	 * @generated
	 */
  int getMinutes();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
  void setMinutes(int value);

  /**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Seconds()
	 * @model
	 * @generated
	 */
  int getSeconds();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
  void setSeconds(int value);

  /**
	 * Returns the value of the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Milliseconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Milliseconds</em>' attribute.
	 * @see #setMilliseconds(int)
	 * @see eventpattern.EventpatternPackage#getSlidingTimeInterval_Milliseconds()
	 * @model
	 * @generated
	 */
  int getMilliseconds();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingTimeInterval#getMilliseconds <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milliseconds</em>' attribute.
	 * @see #getMilliseconds()
	 * @generated
	 */
  void setMilliseconds(int value);

} // SlidingTimeInterval
