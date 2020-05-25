/**
 */
package cepapp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.ComplexEvent#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link cepapp.ComplexEvent#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link cepapp.ComplexEvent#getComplexEventProperties <em>Complex Event Properties</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getComplexEvent()
 * @model annotation="gmf.node figure='rectangle' label='typeName' border.color='110,110,110' label.readOnly='true' tool.name='New Complex Event' tool.description='Add a new complex event'"
 * @generated
 */
public interface ComplexEvent extends SinkElement, Origin {
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
	 * @see cepapp.CepappPackage#getComplexEvent_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEvent#getTypeName <em>Type Name</em>}' attribute.
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
	 * @see cepapp.CepappPackage#getComplexEvent_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link cepapp.ComplexEvent#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Complex Event Properties</b></em>' containment reference list.
	 * The list contents are of type {@link cepapp.ComplexEventProperty}.
	 * It is bidirectional and its opposite is '{@link cepapp.ComplexEventProperty#getReferencedComplexEvent <em>Referenced Complex Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Event Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Event Properties</em>' containment reference list.
	 * @see cepapp.CepappPackage#getComplexEvent_ComplexEventProperties()
	 * @see cepapp.ComplexEventProperty#getReferencedComplexEvent
	 * @model opposite="referencedComplexEvent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ComplexEventProperty> getComplexEventProperties();

} // ComplexEvent
