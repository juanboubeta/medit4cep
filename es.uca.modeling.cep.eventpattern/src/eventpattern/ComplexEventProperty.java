/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Event Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.ComplexEventProperty#getName <em>Name</em>}</li>
 *   <li>{@link eventpattern.ComplexEventProperty#getImagePath <em>Image Path</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getComplexEventProperty()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='New Complex Event Property' tool.description='Add a new complex event property'"
 * @generated
 */
public interface ComplexEventProperty extends UnaryOperator
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eventpattern.EventpatternPackage#getComplexEventProperty_Name()
	 * @model default=" "
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link eventpattern.ComplexEventProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see eventpattern.EventpatternPackage#getComplexEventProperty_ImagePath()
	 * @model
	 * @generated
	 */
  String getImagePath();

  /**
	 * Sets the value of the '{@link eventpattern.ComplexEventProperty#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
  void setImagePath(String value);

} // ComplexEventProperty
