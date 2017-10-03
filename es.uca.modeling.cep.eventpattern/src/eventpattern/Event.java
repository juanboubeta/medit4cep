/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Event#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link eventpattern.Event#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.Event#getEventProperties <em>Event Properties</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getEvent()
 * @model annotation="gmf.node figure='rectangle' label='typeName' border.color='110,110,110' tool.name='Event' tool.description='Add an event' resizable='false' label.readOnly='true'"
 * @generated
 */
public interface Event extends PatternOperand, WithinTimerElement
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
	 * @see eventpattern.EventpatternPackage#getEvent_TypeName()
	 * @model
	 * @generated
	 */
  String getTypeName();

  /**
	 * Sets the value of the '{@link eventpattern.Event#getTypeName <em>Type Name</em>}' attribute.
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
	 * @see eventpattern.EventpatternPackage#getEvent_ImagePath()
	 * @model
	 * @generated
	 */
  String getImagePath();

  /**
	 * Sets the value of the '{@link eventpattern.Event#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
  void setImagePath(String value);

  /**
	 * Returns the value of the '<em><b>Event Properties</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.EventProperty}.
	 * It is bidirectional and its opposite is '{@link eventpattern.EventProperty#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Properties</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getEvent_EventProperties()
	 * @see eventpattern.EventProperty#getReferencedEvent
	 * @model opposite="referencedEvent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
  EList<EventProperty> getEventProperties();

} // Event
