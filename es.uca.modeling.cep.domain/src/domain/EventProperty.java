/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.EventProperty#getName <em>Name</em>}</li>
 *   <li>{@link domain.EventProperty#getType <em>Type</em>}</li>
 *   <li>{@link domain.EventProperty#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link domain.EventProperty#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link domain.EventProperty#getEventProperties <em>Event Properties</em>}</li>
 *   <li>{@link domain.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getEventProperty()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Event Property' tool.description='Add an event property' resizable='false'"
 * @generated
 */
public interface EventProperty extends EObject
{
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
	 * @see domain.DomainPackage#getEventProperty_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.EventProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link domain.PropertyTypeValue}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domain.PropertyTypeValue
	 * @see #setType(PropertyTypeValue)
	 * @see domain.DomainPackage#getEventProperty_Type()
	 * @model
	 * @generated
	 */
  PropertyTypeValue getType();

  /**
	 * Sets the value of the '{@link domain.EventProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domain.PropertyTypeValue
	 * @see #getType()
	 * @generated
	 */
  void setType(PropertyTypeValue value);

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
	 * @see domain.DomainPackage#getEventProperty_ImagePath()
	 * @model
	 * @generated
	 */
  String getImagePath();

  /**
	 * Sets the value of the '{@link domain.EventProperty#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
  void setImagePath(String value);

  /**
	 * Returns the value of the '<em><b>Referenced Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Event#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Event</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event</em>' container reference.
	 * @see #setReferencedEvent(Event)
	 * @see domain.DomainPackage#getEventProperty_ReferencedEvent()
	 * @see domain.Event#getEventProperties
	 * @model opposite="eventProperties" transient="false"
	 * @generated
	 */
  Event getReferencedEvent();

  /**
	 * Sets the value of the '{@link domain.EventProperty#getReferencedEvent <em>Referenced Event</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' container reference.
	 * @see #getReferencedEvent()
	 * @generated
	 */
  void setReferencedEvent(Event value);

  /**
	 * Returns the value of the '<em><b>Event Properties</b></em>' containment reference list.
	 * The list contents are of type {@link domain.EventProperty}.
	 * It is bidirectional and its opposite is '{@link domain.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Properties</em>' containment reference list.
	 * @see domain.DomainPackage#getEventProperty_EventProperties()
	 * @see domain.EventProperty#getReferencedEventProperty
	 * @model opposite="referencedEventProperty" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
  EList<EventProperty> getEventProperties();

  /**
	 * Returns the value of the '<em><b>Referenced Event Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.EventProperty#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Event Property</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event Property</em>' container reference.
	 * @see #setReferencedEventProperty(EventProperty)
	 * @see domain.DomainPackage#getEventProperty_ReferencedEventProperty()
	 * @see domain.EventProperty#getEventProperties
	 * @model opposite="eventProperties" transient="false"
	 * @generated
	 */
  EventProperty getReferencedEventProperty();

  /**
	 * Sets the value of the '{@link domain.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event Property</em>' container reference.
	 * @see #getReferencedEventProperty()
	 * @generated
	 */
  void setReferencedEventProperty(EventProperty value);

} // EventProperty
