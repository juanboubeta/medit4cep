/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Repeat#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getRepeat()
 * @model annotation="gmf.node figure='ellipse' label='count' label.view.pattern='{0}' label.edit.pattern='{0, number}' border.color='38,110,159' border.width='3' label.icon='false' color='255,255,255' size='30,30' resizable='false' tool.name='Repeat' tool.description='Add a repeat operator'"
 * @generated
 */
public interface Repeat extends UnaryOperator, PatternOperator
{
  /**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see eventpattern.EventpatternPackage#getRepeat_Count()
	 * @model
	 * @generated
	 */
  int getCount();

  /**
	 * Sets the value of the '{@link eventpattern.Repeat#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
  void setCount(int value);

} // Repeat
