/**
 */
package cepapp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.Database#getPrimary_key <em>Primary key</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getDatabase()
 * @model abstract="true"
 * @generated
 */
public interface Database extends Mappable {
	/**
	 * Returns the value of the '<em><b>Primary key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary key</em>' attribute.
	 * @see #setPrimary_key(String)
	 * @see cepapp.CepappPackage#getDatabase_Primary_key()
	 * @model
	 * @generated
	 */
	String getPrimary_key();

	/**
	 * Sets the value of the '{@link cepapp.Database#getPrimary_key <em>Primary key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary key</em>' attribute.
	 * @see #getPrimary_key()
	 * @generated
	 */
	void setPrimary_key(String value);

} // Database
