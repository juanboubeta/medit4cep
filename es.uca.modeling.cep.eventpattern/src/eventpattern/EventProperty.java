/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.EventProperty#getName <em>Name</em>}</li>
 *   <li>{@link eventpattern.EventProperty#getType <em>Type</em>}</li>
 *   <li>{@link eventpattern.EventProperty#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.EventProperty#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link eventpattern.EventProperty#getEventProperties <em>Event Properties</em>}</li>
 *   <li>{@link eventpattern.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getEventProperty()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Event Property' tool.description='Add an event property' resizable='false' label.readOnly='true'"
 * @generated
 */
public interface EventProperty extends ConditionOperand
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
	 * @see eventpattern.EventpatternPackage#getEventProperty_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link eventpattern.EventProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eventpattern.PropertyTypeValue}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eventpattern.PropertyTypeValue
	 * @see #setType(PropertyTypeValue)
	 * @see eventpattern.EventpatternPackage#getEventProperty_Type()
	 * @model
	 * @generated
	 */
  PropertyTypeValue getType();

  /**
	 * Sets the value of the '{@link eventpattern.EventProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eventpattern.PropertyTypeValue
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
	 * @see eventpattern.EventpatternPackage#getEventProperty_ImagePath()
	 * @model
	 * @generated
	 */
  String getImagePath();

  /**
	 * Sets the value of the '{@link eventpattern.EventProperty#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
  void setImagePath(String value);

  /**
	 * Returns the value of the '<em><b>Referenced Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eventpattern.Event#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Event</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event</em>' container reference.
	 * @see #setReferencedEvent(Event)
	 * @see eventpattern.EventpatternPackage#getEventProperty_ReferencedEvent()
	 * @see eventpattern.Event#getEventProperties
	 * @model opposite="eventProperties" transient="false"
	 * @generated
	 */
  Event getReferencedEvent();

  /**
	 * Sets the value of the '{@link eventpattern.EventProperty#getReferencedEvent <em>Referenced Event</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event</em>' container reference.
	 * @see #getReferencedEvent()
	 * @generated
	 */
  void setReferencedEvent(Event value);

  /**
	 * Returns the value of the '<em><b>Event Properties</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.EventProperty}.
	 * It is bidirectional and its opposite is '{@link eventpattern.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Properties</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getEventProperty_EventProperties()
	 * @see eventpattern.EventProperty#getReferencedEventProperty
	 * @model opposite="referencedEventProperty" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
  EList<EventProperty> getEventProperties();

  /**
	 * Returns the value of the '<em><b>Referenced Event Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eventpattern.EventProperty#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Event Property</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Event Property</em>' container reference.
	 * @see #setReferencedEventProperty(EventProperty)
	 * @see eventpattern.EventpatternPackage#getEventProperty_ReferencedEventProperty()
	 * @see eventpattern.EventProperty#getEventProperties
	 * @model opposite="eventProperties" transient="false"
	 * @generated
	 */
  EventProperty getReferencedEventProperty();

  /**
	 * Sets the value of the '{@link eventpattern.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Event Property</em>' container reference.
	 * @see #getReferencedEventProperty()
	 * @generated
	 */
  void setReferencedEventProperty(EventProperty value);

} // EventProperty
