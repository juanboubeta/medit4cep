/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Value#getValue <em>Value</em>}</li>
 *   <li>{@link eventpattern.Value#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getValue()
 * @model annotation="gmf.node figure='rounded' label='value' label.text='' label.icon='false' margin='0' border.color='110,110,110' border.width='3' size='30,30' tool.name='Value' tool.description='Add a value'"
 * @generated
 */
public interface Value extends ConditionOperand
{
  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eventpattern.EventpatternPackage#getValue_Value()
	 * @model default=" "
	 * @generated
	 */
  String getValue();

  /**
	 * Sets the value of the '{@link eventpattern.Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eventpattern.PropertyTypeValue}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eventpattern.PropertyTypeValue
	 * @see #setType(PropertyTypeValue)
	 * @see eventpattern.EventpatternPackage#getValue_Type()
	 * @model
	 * @generated
	 */
  PropertyTypeValue getType();

  /**
	 * Sets the value of the '{@link eventpattern.Value#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eventpattern.PropertyTypeValue
	 * @see #getType()
	 * @generated
	 */
  void setType(PropertyTypeValue value);

} // Value
