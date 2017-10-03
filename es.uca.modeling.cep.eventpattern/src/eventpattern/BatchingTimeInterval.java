/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batching Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.BatchingTimeInterval#getYears <em>Years</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getMonths <em>Months</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getDays <em>Days</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getHours <em>Hours</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getMilliseconds <em>Milliseconds</em>}</li>
 *   <li>{@link eventpattern.BatchingTimeInterval#getStartTimestamp <em>Start Timestamp</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval()
 * @model annotation="gmf.node figure='rectangle' border.style='dash' border.color='110,110,110' color='230,230,250' label='years, months, weeks, days, hours, minutes, seconds, milliseconds' label.parser='MessageFormatParser' label.readOnly='true' label.view.pattern='Batching Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}' tool.name='Batching Time Interval' tool.description='Add a batching time interval window'"
 * @generated
 */
public interface BatchingTimeInterval extends DataWindow
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Years()
	 * @model
	 * @generated
	 */
  int getYears();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getYears <em>Years</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Months()
	 * @model
	 * @generated
	 */
  int getMonths();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getMonths <em>Months</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Weeks()
	 * @model
	 * @generated
	 */
  int getWeeks();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getWeeks <em>Weeks</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Days()
	 * @model
	 * @generated
	 */
  int getDays();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getDays <em>Days</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Hours()
	 * @model
	 * @generated
	 */
  int getHours();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getHours <em>Hours</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Minutes()
	 * @model
	 * @generated
	 */
  int getMinutes();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getMinutes <em>Minutes</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Seconds()
	 * @model
	 * @generated
	 */
  int getSeconds();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getSeconds <em>Seconds</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_Milliseconds()
	 * @model
	 * @generated
	 */
  int getMilliseconds();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getMilliseconds <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milliseconds</em>' attribute.
	 * @see #getMilliseconds()
	 * @generated
	 */
  void setMilliseconds(int value);

		/**
	 * Returns the value of the '<em><b>Start Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Timestamp</em>' attribute.
	 * @see #setStartTimestamp(long)
	 * @see eventpattern.EventpatternPackage#getBatchingTimeInterval_StartTimestamp()
	 * @model
	 * @generated
	 */
	long getStartTimestamp();

		/**
	 * Sets the value of the '{@link eventpattern.BatchingTimeInterval#getStartTimestamp <em>Start Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Timestamp</em>' attribute.
	 * @see #getStartTimestamp()
	 * @generated
	 */
	void setStartTimestamp(long value);

} // BatchingTimeInterval
