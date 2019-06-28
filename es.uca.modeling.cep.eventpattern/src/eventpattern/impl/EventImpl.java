/**
 */
package eventpattern.impl;

import eventpattern.Event;
import eventpattern.EventProperty;
import eventpattern.EventpatternPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.EventImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link eventpattern.impl.EventImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.impl.EventImpl#getEventProperties <em>Event Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends PatternOperandImpl implements Event
{
  /**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
  protected static final String TYPE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
  protected String typeName = TYPE_NAME_EDEFAULT;

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
  protected EventImpl()
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
		return EventpatternPackage.Literals.EVENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTypeName()
  {
		return typeName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeName(String newTypeName)
  {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EVENT__IMAGE_PATH, oldImagePath, imagePath));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EventProperty> getEventProperties()
  {
		if (eventProperties == null) {
			eventProperties = new EObjectContainmentWithInverseEList<EventProperty>(EventProperty.class, this, EventpatternPackage.EVENT__EVENT_PROPERTIES, EventpatternPackage.EVENT_PROPERTY__REFERENCED_EVENT);
		}
		return eventProperties;
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
			case EventpatternPackage.EVENT__EVENT_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventProperties()).basicAdd(otherEnd, msgs);
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
			case EventpatternPackage.EVENT__EVENT_PROPERTIES:
				return ((InternalEList<?>)getEventProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case EventpatternPackage.EVENT__TYPE_NAME:
				return getTypeName();
			case EventpatternPackage.EVENT__IMAGE_PATH:
				return getImagePath();
			case EventpatternPackage.EVENT__EVENT_PROPERTIES:
				return getEventProperties();
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
			case EventpatternPackage.EVENT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EventpatternPackage.EVENT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case EventpatternPackage.EVENT__EVENT_PROPERTIES:
				getEventProperties().clear();
				getEventProperties().addAll((Collection<? extends EventProperty>)newValue);
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
			case EventpatternPackage.EVENT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EventpatternPackage.EVENT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case EventpatternPackage.EVENT__EVENT_PROPERTIES:
				getEventProperties().clear();
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
			case EventpatternPackage.EVENT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EventpatternPackage.EVENT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case EventpatternPackage.EVENT__EVENT_PROPERTIES:
				return eventProperties != null && !eventProperties.isEmpty();
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //EventImpl
