/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.TimeInterval#getYears <em>Years</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getMonths <em>Months</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getDays <em>Days</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getHours <em>Hours</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link eventpattern.TimeInterval#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getTimeInterval()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/TimeInterval.svg' size='30,30' resizable='false' margin='0' label.placement='external' label.icon='false' label='years, months, weeks, days, hours, minutes, seconds, milliseconds' label.parser='MessageFormatParser' label.readOnly='true' label.view.pattern=' {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} ' tool.name='Time Interval' tool.description='Add a time interval'"
 * @generated
 */
public interface TimeInterval extends PatternOperand
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Years()
	 * @model
	 * @generated
	 */
  int getYears();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getYears <em>Years</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Months()
	 * @model
	 * @generated
	 */
  int getMonths();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getMonths <em>Months</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Weeks()
	 * @model
	 * @generated
	 */
  int getWeeks();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getWeeks <em>Weeks</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Days()
	 * @model
	 * @generated
	 */
  int getDays();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getDays <em>Days</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Hours()
	 * @model
	 * @generated
	 */
  int getHours();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getHours <em>Hours</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Minutes()
	 * @model
	 * @generated
	 */
  int getMinutes();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getMinutes <em>Minutes</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Seconds()
	 * @model
	 * @generated
	 */
  int getSeconds();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getSeconds <em>Seconds</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getTimeInterval_Milliseconds()
	 * @model
	 * @generated
	 */
  int getMilliseconds();

  /**
	 * Sets the value of the '{@link eventpattern.TimeInterval#getMilliseconds <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milliseconds</em>' attribute.
	 * @see #getMilliseconds()
	 * @generated
	 */
  void setMilliseconds(int value);

} // TimeInterval
