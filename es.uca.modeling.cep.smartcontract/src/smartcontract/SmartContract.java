/**
 */
package smartcontract;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.SmartContract#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link smartcontract.SmartContract#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link smartcontract.SmartContract#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link smartcontract.SmartContract#getContractAddress <em>Contract Address</em>}</li>
 *   <li>{@link smartcontract.SmartContract#getContractfunctions <em>Contractfunctions</em>}</li>
 *   <li>{@link smartcontract.SmartContract#getSmartContractProperties <em>Smart Contract Properties</em>}</li>
 * </ul>
 *
 * @see smartcontract.SmartcontractPackage#getSmartContract()
 * @model annotation="gmf.node figure='rectangle' label='typeName' border.color='110,110,110' tool.name='Smart Contract' tool.description='Add a SmartContract' resizable='false'"
 * @generated
 */
public interface SmartContract extends EObject {
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
	 * @see smartcontract.SmartcontractPackage#getSmartContract_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContract#getTypeName <em>Type Name</em>}' attribute.
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
	 * @see smartcontract.SmartcontractPackage#getSmartContract_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContract#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see smartcontract.SmartcontractPackage#getSmartContract_PrivateKey()
	 * @model
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContract#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Contract Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Address</em>' attribute.
	 * @see #setContractAddress(String)
	 * @see smartcontract.SmartcontractPackage#getSmartContract_ContractAddress()
	 * @model
	 * @generated
	 */
	String getContractAddress();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContract#getContractAddress <em>Contract Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Address</em>' attribute.
	 * @see #getContractAddress()
	 * @generated
	 */
	void setContractAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contractfunctions</b></em>' containment reference list.
	 * The list contents are of type {@link smartcontract.ContractFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractfunctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractfunctions</em>' containment reference list.
	 * @see smartcontract.SmartcontractPackage#getSmartContract_Contractfunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractFunction> getContractfunctions();

	/**
	 * Returns the value of the '<em><b>Smart Contract Properties</b></em>' containment reference list.
	 * The list contents are of type {@link smartcontract.ContractFunction}.
	 * It is bidirectional and its opposite is '{@link smartcontract.ContractFunction#getReferencedSmartContract <em>Referenced Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smart Contract Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smart Contract Properties</em>' containment reference list.
	 * @see smartcontract.SmartcontractPackage#getSmartContract_SmartContractProperties()
	 * @see smartcontract.ContractFunction#getReferencedSmartContract
	 * @model opposite="referencedSmartContract" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ContractFunction> getSmartContractProperties();

} // SmartContract
