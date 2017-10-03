/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.TimeSchedule#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link eventpattern.TimeSchedule#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link eventpattern.TimeSchedule#getMonth <em>Month</em>}</li>
 *   <li>{@link eventpattern.TimeSchedule#getHour <em>Hour</em>}</li>
 *   <li>{@link eventpattern.TimeSchedule#getMinute <em>Minute</em>}</li>
 *   <li>{@link eventpattern.TimeSchedule#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getTimeSchedule()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/TimeSchedule.svg' size='30,30' resizable='false' margin='0' label.placement='external' label.icon='false' label='dayOfWeek, dayOfMonth, month, hour, minute, second' label.parser='MessageFormatParser' label.readOnly='true' label.view.pattern=' {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} ' tool.name='Time Schedule' tool.description='Add a time schedule'"
 * @generated
 */
public interface TimeSchedule extends PatternOperand
{
  /**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day Of Week</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see #setDayOfWeek(int)
	 * @see eventpattern.EventpatternPackage#getTimeSchedule_DayOfWeek()
	 * @model default="-1"
	 * @generated
	 */
  int getDayOfWeek();

  /**
	 * Sets the value of the '{@link eventpattern.TimeSchedule#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' attribute.
	 * @see #getDayOfWeek()
	 * @generated
	 */
  void setDayOfWeek(int value);

  /**
	 * Returns the value of the '<em><b>Day Of Month</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day Of Month</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Month</em>' attribute.
	 * @see #setDayOfMonth(int)
	 * @see eventpattern.EventpatternPackage#getTimeSchedule_DayOfMonth()
	 * @model default="-1"
	 * @generated
	 */
  int getDayOfMonth();

  /**
	 * Sets the value of the '{@link eventpattern.TimeSchedule#getDayOfMonth <em>Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Month</em>' attribute.
	 * @see #getDayOfMonth()
	 * @generated
	 */
  void setDayOfMonth(int value);

  /**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(int)
	 * @see eventpattern.EventpatternPackage#getTimeSchedule_Month()
	 * @model default="-1"
	 * @generated
	 */
  int getMonth();

  /**
	 * Sets the value of the '{@link eventpattern.TimeSchedule#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
  void setMonth(int value);

  /**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hour</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see eventpattern.EventpatternPackage#getTimeSchedule_Hour()
	 * @model default="-1"
	 * @generated
	 */
  int getHour();

  /**
	 * Sets the value of the '{@link eventpattern.TimeSchedule#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
  void setHour(int value);

  /**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see eventpattern.EventpatternPackage#getTimeSchedule_Minute()
	 * @model default="-1"
	 * @generated
	 */
  int getMinute();

  /**
	 * Sets the value of the '{@link eventpattern.TimeSchedule#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
  void setMinute(int value);

  /**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @see eventpattern.EventpatternPackage#getTimeSchedule_Second()
	 * @model default="-1"
	 * @generated
	 */
  int getSecond();

  /**
	 * Sets the value of the '{@link eventpattern.TimeSchedule#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
  void setSecond(int value);

} // TimeSchedule
