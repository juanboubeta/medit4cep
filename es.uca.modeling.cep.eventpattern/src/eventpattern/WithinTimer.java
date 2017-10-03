/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Within Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.WithinTimer#getYears <em>Years</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getMonths <em>Months</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getDays <em>Days</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getHours <em>Hours</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getMilliseconds <em>Milliseconds</em>}</li>
 *   <li>{@link eventpattern.WithinTimer#getWithinTimerElements <em>Within Timer Elements</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getWithinTimer()
 * @model annotation="gmf.node figure='rounded' color='255,248,220' border.color='110,110,110' label='years, months, weeks, days, hours, minutes, seconds, milliseconds' label.parser='MessageFormatParser' label.readOnly='true' label.view.pattern='Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}' tool.name='Within Timer' tool.description='Add a within timer'"
 * @generated
 */
public interface WithinTimer extends PatternOperand
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Years()
	 * @model
	 * @generated
	 */
  int getYears();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getYears <em>Years</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Months()
	 * @model
	 * @generated
	 */
  int getMonths();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getMonths <em>Months</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Weeks()
	 * @model
	 * @generated
	 */
  int getWeeks();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getWeeks <em>Weeks</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Days()
	 * @model
	 * @generated
	 */
  int getDays();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getDays <em>Days</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Hours()
	 * @model
	 * @generated
	 */
  int getHours();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getHours <em>Hours</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Minutes()
	 * @model
	 * @generated
	 */
  int getMinutes();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getMinutes <em>Minutes</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Seconds()
	 * @model
	 * @generated
	 */
  int getSeconds();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getSeconds <em>Seconds</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getWithinTimer_Milliseconds()
	 * @model
	 * @generated
	 */
  int getMilliseconds();

  /**
	 * Sets the value of the '{@link eventpattern.WithinTimer#getMilliseconds <em>Milliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milliseconds</em>' attribute.
	 * @see #getMilliseconds()
	 * @generated
	 */
  void setMilliseconds(int value);

  /**
	 * Returns the value of the '<em><b>Within Timer Elements</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.WithinTimerElement}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Within Timer Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Within Timer Elements</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getWithinTimer_WithinTimerElements()
	 * @model containment="true"
	 * @generated
	 */
  EList<WithinTimerElement> getWithinTimerElements();

} // WithinTimer
