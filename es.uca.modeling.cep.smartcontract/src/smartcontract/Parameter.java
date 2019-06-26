/**
 */
package smartcontract;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link smartcontract.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see smartcontract.SmartcontractPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends EObject {

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
	 * @see smartcontract.SmartcontractPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartcontract.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smartcontract.PropertyTypeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see smartcontract.PropertyTypeValue
	 * @see #setType(PropertyTypeValue)
	 * @see smartcontract.SmartcontractPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	PropertyTypeValue getType();

	/**
	 * Sets the value of the '{@link smartcontract.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see smartcontract.PropertyTypeValue
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyTypeValue value);
} // Parameter
