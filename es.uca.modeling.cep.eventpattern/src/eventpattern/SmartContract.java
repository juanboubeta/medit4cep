/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.SmartContract#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link eventpattern.SmartContract#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.SmartContract#getContractfunctions <em>Contractfunctions</em>}</li>
 *   <li>{@link eventpattern.SmartContract#getSmartContractProperties <em>Smart Contract Properties</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getSmartContract()
 * @model annotation="gmf.node figure='rectangle' label='typeName' border.color='110,110,110' tool.name='Smart Contract' tool.description='Add a SmartContract' resizable='false' label.readOnly='true'"
 * @generated
 */
public interface SmartContract extends UnaryOperator {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see eventpattern.EventpatternPackage#getSmartContract_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link eventpattern.SmartContract#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

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
	 * @see eventpattern.EventpatternPackage#getSmartContract_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link eventpattern.SmartContract#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Contractfunctions</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.ContractFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractfunctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractfunctions</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getSmartContract_Contractfunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractFunction> getContractfunctions();

	/**
	 * Returns the value of the '<em><b>Smart Contract Properties</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.ContractFunction}.
	 * It is bidirectional and its opposite is '{@link eventpattern.ContractFunction#getReferencedSmartContract <em>Referenced Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smart Contract Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smart Contract Properties</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getSmartContract_SmartContractProperties()
	 * @see eventpattern.ContractFunction#getReferencedSmartContract
	 * @model opposite="referencedSmartContract" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ContractFunction> getSmartContractProperties();

} // SmartContract
