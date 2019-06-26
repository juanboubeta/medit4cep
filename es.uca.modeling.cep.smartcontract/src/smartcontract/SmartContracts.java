/**
 */
package smartcontract;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Contracts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.SmartContracts#getName <em>Name</em>}</li>
 *   <li>{@link smartcontract.SmartContracts#getDescription <em>Description</em>}</li>
 *   <li>{@link smartcontract.SmartContracts#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link smartcontract.SmartContracts#getSmartcontracts <em>Smartcontracts</em>}</li>
 * </ul>
 *
 * @see smartcontract.SmartcontractPackage#getSmartContracts()
 * @model annotation="gmf.diagram model.extension='smartc' diagram.extension='smartc_diagram'"
 * @generated
 */
public interface SmartContracts extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartcontract.SmartcontractPackage#getSmartContracts_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContracts#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see smartcontract.SmartcontractPackage#getSmartContracts_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContracts#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see smartcontract.SmartcontractPackage#getSmartContracts_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link smartcontract.SmartContracts#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Smartcontracts</b></em>' containment reference list.
	 * The list contents are of type {@link smartcontract.SmartContract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smartcontracts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartcontracts</em>' containment reference list.
	 * @see smartcontract.SmartcontractPackage#getSmartContracts_Smartcontracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartContract> getSmartcontracts();

} // SmartContracts
