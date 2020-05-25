/**
 */
package cepapp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Event Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.ComplexEventProperty#getName <em>Name</em>}</li>
 *   <li>{@link cepapp.ComplexEventProperty#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link cepapp.ComplexEventProperty#getType <em>Type</em>}</li>
 *   <li>{@link cepapp.ComplexEventProperty#getReferencedComplexEvent <em>Referenced Complex Event</em>}</li>
 *   <li>{@link cepapp.ComplexEventProperty#getComplexEventProperties <em>Complex Event Properties</em>}</li>
 *   <li>{@link cepapp.ComplexEventProperty#getReferencedComplexEventProperty <em>Referenced Complex Event Property</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getComplexEventProperty()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='New Complex Event Property' tool.description='Add a new complex event property'"
 * @generated
 */
public interface ComplexEventProperty extends EObject {
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
	 * @see cepapp.CepappPackage#getComplexEventProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEventProperty#getName <em>Name</em>}' attribute.
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
	 * @see cepapp.CepappPackage#getComplexEventProperty_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEventProperty#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cepapp.PropertyTypeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cepapp.PropertyTypeValue
	 * @see #setType(PropertyTypeValue)
	 * @see cepapp.CepappPackage#getComplexEventProperty_Type()
	 * @model
	 * @generated
	 */
	PropertyTypeValue getType();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEventProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cepapp.PropertyTypeValue
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyTypeValue value);

	/**
	 * Returns the value of the '<em><b>Referenced Complex Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cepapp.ComplexEvent#getComplexEventProperties <em>Complex Event Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Complex Event</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Complex Event</em>' container reference.
	 * @see #setReferencedComplexEvent(ComplexEvent)
	 * @see cepapp.CepappPackage#getComplexEventProperty_ReferencedComplexEvent()
	 * @see cepapp.ComplexEvent#getComplexEventProperties
	 * @model opposite="complexEventProperties" transient="false"
	 * @generated
	 */
	ComplexEvent getReferencedComplexEvent();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEventProperty#getReferencedComplexEvent <em>Referenced Complex Event</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Complex Event</em>' container reference.
	 * @see #getReferencedComplexEvent()
	 * @generated
	 */
	void setReferencedComplexEvent(ComplexEvent value);

	/**
	 * Returns the value of the '<em><b>Complex Event Properties</b></em>' containment reference list.
	 * The list contents are of type {@link cepapp.ComplexEventProperty}.
	 * It is bidirectional and its opposite is '{@link cepapp.ComplexEventProperty#getReferencedComplexEventProperty <em>Referenced Complex Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Event Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Event Properties</em>' containment reference list.
	 * @see cepapp.CepappPackage#getComplexEventProperty_ComplexEventProperties()
	 * @see cepapp.ComplexEventProperty#getReferencedComplexEventProperty
	 * @model opposite="referencedComplexEventProperty" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ComplexEventProperty> getComplexEventProperties();

	/**
	 * Returns the value of the '<em><b>Referenced Complex Event Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cepapp.ComplexEventProperty#getComplexEventProperties <em>Complex Event Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Complex Event Property</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Complex Event Property</em>' container reference.
	 * @see #setReferencedComplexEventProperty(ComplexEventProperty)
	 * @see cepapp.CepappPackage#getComplexEventProperty_ReferencedComplexEventProperty()
	 * @see cepapp.ComplexEventProperty#getComplexEventProperties
	 * @model opposite="complexEventProperties" transient="false"
	 * @generated
	 */
	ComplexEventProperty getReferencedComplexEventProperty();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEventProperty#getReferencedComplexEventProperty <em>Referenced Complex Event Property</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Complex Event Property</em>' container reference.
	 * @see #getReferencedComplexEventProperty()
	 * @generated
	 */
	void setReferencedComplexEventProperty(ComplexEventProperty value);

} // ComplexEventProperty
