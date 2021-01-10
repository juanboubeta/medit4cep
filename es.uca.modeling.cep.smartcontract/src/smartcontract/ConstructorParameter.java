/**
 */
package smartcontract;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.ConstructorParameter#getValue <em>Value</em>}</li>
 *   <li>{@link smartcontract.ConstructorParameter#getConstructorParameterReferencedContract <em>Constructor Parameter Referenced Contract</em>}</li>
 * </ul>
 *
 * @see smartcontract.SmartcontractPackage#getConstructorParameter()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Constructor Parameter' tool.description='Add an Constructor Parameter' resizable='false'"
 * @generated
 */
public interface ConstructorParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see smartcontract.SmartcontractPackage#getConstructorParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link smartcontract.ConstructorParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Constructor Parameter Referenced Contract</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartcontract.SmartContract#getConstructorParametersContract <em>Constructor Parameters Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Parameter Referenced Contract</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Parameter Referenced Contract</em>' container reference.
	 * @see #setConstructorParameterReferencedContract(SmartContract)
	 * @see smartcontract.SmartcontractPackage#getConstructorParameter_ConstructorParameterReferencedContract()
	 * @see smartcontract.SmartContract#getConstructorParametersContract
	 * @model opposite="ConstructorParametersContract" transient="false"
	 * @generated
	 */
	SmartContract getConstructorParameterReferencedContract();

	/**
	 * Sets the value of the '{@link smartcontract.ConstructorParameter#getConstructorParameterReferencedContract <em>Constructor Parameter Referenced Contract</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Parameter Referenced Contract</em>' container reference.
	 * @see #getConstructorParameterReferencedContract()
	 * @generated
	 */
	void setConstructorParameterReferencedContract(SmartContract value);

} // ConstructorParameter
