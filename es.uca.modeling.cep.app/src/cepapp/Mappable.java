/**
 */
package cepapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mappable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.Mappable#getMappingType <em>Mapping Type</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getMappable()
 * @model abstract="true"
 * @generated
 */
public interface Mappable extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cepapp.MappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Type</em>' attribute.
	 * @see cepapp.MappingType
	 * @see #setMappingType(MappingType)
	 * @see cepapp.CepappPackage#getMappable_MappingType()
	 * @model
	 * @generated
	 */
	MappingType getMappingType();

	/**
	 * Sets the value of the '{@link cepapp.Mappable#getMappingType <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Type</em>' attribute.
	 * @see cepapp.MappingType
	 * @see #getMappingType()
	 * @generated
	 */
	void setMappingType(MappingType value);

} // Mappable
