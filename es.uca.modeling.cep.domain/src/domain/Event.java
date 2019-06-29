/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Event#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link domain.Event#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link domain.Event#getEventProperties <em>Event Properties</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getEvent()
 * @model annotation="gmf.node figure='rectangle' label='typeName' border.color='110,110,110' tool.name='Event' tool.description='Add an event' resizable='false'"
 * @generated
 */
public interface Event extends EObject
{
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
	 * @see domain.DomainPackage#getEvent_TypeName()
	 * @model
	 * @generated
	 */
  String getTypeName();

  /**
	 * Sets the value of the '{@link domain.Event#getTypeName <em>Type Name</em>}' attribute.
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
	 * @see domain.DomainPackage#getEvent_ImagePath()
	 * @model
	 * @generated
	 */
  String getImagePath();

  /**
	 * Sets the value of the '{@link domain.Event#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
  void setImagePath(String value);

  /**
	 * Returns the value of the '<em><b>Event Properties</b></em>' containment reference list.
	 * The list contents are of type {@link domain.EventProperty}.
	 * It is bidirectional and its opposite is '{@link domain.EventProperty#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Properties</em>' containment reference list.
	 * @see domain.DomainPackage#getEvent_EventProperties()
	 * @see domain.EventProperty#getReferencedEvent
	 * @model opposite="referencedEvent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
  EList<EventProperty> getEventProperties();

} // Event
