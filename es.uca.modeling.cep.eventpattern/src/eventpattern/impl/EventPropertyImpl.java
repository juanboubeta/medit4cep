/**
 */
package eventpattern.impl;

import eventpattern.Event;
import eventpattern.EventProperty;
import eventpattern.EventpatternPackage;
import eventpattern.PropertyTypeValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.EventPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link eventpattern.impl.EventPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link eventpattern.impl.EventPropertyImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.impl.EventPropertyImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link eventpattern.impl.EventPropertyImpl#getEventProperties <em>Event Properties</em>}</li>
 *   <li>{@link eventpattern.impl.EventPropertyImpl#getReferencedEventProperty <em>Referenced Event Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventPropertyImpl extends ConditionOperandImpl implements EventProperty
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final PropertyTypeValue TYPE_EDEFAULT = PropertyTypeValue.UNKNOWN;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected PropertyTypeValue type = TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
  protected static final String IMAGE_PATH_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
  protected String imagePath = IMAGE_PATH_EDEFAULT;

  /**
	 * The cached value of the '{@link #getEventProperties() <em>Event Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEventProperties()
	 * @generated
	 * @ordered
	 */
  protected EList<EventProperty> eventProperties;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EventPropertyImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EventpatternPackage.Literals.EVENT_PROPERTY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT_PROPERTY__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PropertyTypeValue getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(PropertyTypeValue newType)
  {
		PropertyTypeValue oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT_PROPERTY__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getImagePath()
  {
		return imagePath;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImagePath(String newImagePath)
  {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT_PROPERTY__IMAGE_PATH, oldImagePath, imagePath));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Event getReferencedEvent()
  {
		if (eContainerFeatureID() != EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT) return null;
		return (Event)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReferencedEvent(Event newReferencedEvent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newReferencedEvent, EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReferencedEvent(Event newReferencedEvent)
  {
		if (newReferencedEvent != eInternalContainer() || (eContainerFeatureID() != EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT && newReferencedEvent != null)) {
			if (EcoreUtil.isAncestor(this, newReferencedEvent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReferencedEvent != null)
				msgs = ((InternalEObject)newReferencedEvent).eInverseAdd(this, EventpatternPackage.EVENT__EVENT_PROPERTIES, Event.class, msgs);
			msgs = basicSetReferencedEvent(newReferencedEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT, newReferencedEvent, newReferencedEvent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EventProperty> getEventProperties()
  {
		if (eventProperties == null) {
			eventProperties = new EObjectContainmentWithInverseEList<EventProperty>(EventProperty.class, this, EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES, EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY);
		}
		return eventProperties;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EventProperty getReferencedEventProperty()
  {
		if (eContainerFeatureID() != EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY) return null;
		return (EventProperty)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReferencedEventProperty(EventProperty newReferencedEventProperty, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newReferencedEventProperty, EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReferencedEventProperty(EventProperty newReferencedEventProperty)
  {
		if (newReferencedEventProperty != eInternalContainer() || (eContainerFeatureID() != EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY && newReferencedEventProperty != null)) {
			if (EcoreUtil.isAncestor(this, newReferencedEventProperty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReferencedEventProperty != null)
				msgs = ((InternalEObject)newReferencedEventProperty).eInverseAdd(this, EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES, EventProperty.class, msgs);
			msgs = basicSetReferencedEventProperty(newReferencedEventProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY, newReferencedEventProperty, newReferencedEventProperty));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReferencedEvent((Event)otherEnd, msgs);
			case EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventProperties()).basicAdd(otherEnd, msgs);
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReferencedEventProperty((EventProperty)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				return basicSetReferencedEvent(null, msgs);
			case EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES:
				return ((InternalEList<?>)getEventProperties()).basicRemove(otherEnd, msgs);
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				return basicSetReferencedEventProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				return eInternalContainer().eInverseRemove(this, EventpatternPackage.EVENT__EVENT_PROPERTIES, Event.class, msgs);
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				return eInternalContainer().eInverseRemove(this, EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES, EventProperty.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EventpatternPackage.EVENT_PROPERTY__NAME:
				return getName();
			case EventpatternPackage.EVENT_PROPERTY__TYPE:
				return getType();
			case EventpatternPackage.EVENT_PROPERTY__IMAGE_PATH:
				return getImagePath();
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				return getReferencedEvent();
			case EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES:
				return getEventProperties();
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				return getReferencedEventProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EventpatternPackage.EVENT_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case EventpatternPackage.EVENT_PROPERTY__TYPE:
				setType((PropertyTypeValue)newValue);
				return;
			case EventpatternPackage.EVENT_PROPERTY__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				setReferencedEvent((Event)newValue);
				return;
			case EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES:
				getEventProperties().clear();
				getEventProperties().addAll((Collection<? extends EventProperty>)newValue);
				return;
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				setReferencedEventProperty((EventProperty)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.EVENT_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EventpatternPackage.EVENT_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EventpatternPackage.EVENT_PROPERTY__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				setReferencedEvent((Event)null);
				return;
			case EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES:
				getEventProperties().clear();
				return;
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				setReferencedEventProperty((EventProperty)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.EVENT_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EventpatternPackage.EVENT_PROPERTY__TYPE:
				return type != TYPE_EDEFAULT;
			case EventpatternPackage.EVENT_PROPERTY__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT:
				return getReferencedEvent() != null;
			case EventpatternPackage.EVENT_PROPERTY__EVENT_PROPERTIES:
				return eventProperties != null && !eventProperties.isEmpty();
			case EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY:
				return getReferencedEventProperty() != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //EventPropertyImpl
