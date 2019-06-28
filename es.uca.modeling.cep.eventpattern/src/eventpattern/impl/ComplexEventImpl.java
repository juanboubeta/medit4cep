/**
 */
package eventpattern.impl;

import eventpattern.ComplexEvent;
import eventpattern.ComplexEventProperty;
import eventpattern.EventpatternPackage;

import eventpattern.Link;
import eventpattern.Operator;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.ComplexEventImpl#getInboundLink <em>Inbound Link</em>}</li>
 *   <li>{@link eventpattern.impl.ComplexEventImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link eventpattern.impl.ComplexEventImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.impl.ComplexEventImpl#getComplexEventProperties <em>Complex Event Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexEventImpl extends OperandImpl implements ComplexEvent
{
  /**
	 * The cached value of the '{@link #getInboundLink() <em>Inbound Link</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInboundLink()
	 * @generated
	 * @ordered
	 */
  protected EList<Link> inboundLink;

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
	 * The cached value of the '{@link #getComplexEventProperties() <em>Complex Event Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComplexEventProperties()
	 * @generated
	 * @ordered
	 */
  protected EList<ComplexEventProperty> complexEventProperties;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ComplexEventImpl()
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
		return EventpatternPackage.Literals.COMPLEX_EVENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getInboundLink()
  {
		if (inboundLink == null) {
			inboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK, EventpatternPackage.LINK__OPERATOR);
		}
		return inboundLink;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.COMPLEX_EVENT__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.COMPLEX_EVENT__IMAGE_PATH, oldImagePath, imagePath));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ComplexEventProperty> getComplexEventProperties()
  {
		if (complexEventProperties == null) {
			complexEventProperties = new EObjectContainmentEList<ComplexEventProperty>(ComplexEventProperty.class, this, EventpatternPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES);
		}
		return complexEventProperties;
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
			case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInboundLink()).basicAdd(otherEnd, msgs);
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
			case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK:
				return ((InternalEList<?>)getInboundLink()).basicRemove(otherEnd, msgs);
			case EventpatternPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
				return ((InternalEList<?>)getComplexEventProperties()).basicRemove(otherEnd, msgs);
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
			case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK:
				return getInboundLink();
			case EventpatternPackage.COMPLEX_EVENT__TYPE_NAME:
				return getTypeName();
			case EventpatternPackage.COMPLEX_EVENT__IMAGE_PATH:
				return getImagePath();
			case EventpatternPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
				return getComplexEventProperties();
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
			case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK:
				getInboundLink().clear();
				getInboundLink().addAll((Collection<? extends Link>)newValue);
				return;
			case EventpatternPackage.COMPLEX_EVENT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EventpatternPackage.COMPLEX_EVENT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case EventpatternPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
				getComplexEventProperties().clear();
				getComplexEventProperties().addAll((Collection<? extends ComplexEventProperty>)newValue);
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
			case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK:
				getInboundLink().clear();
				return;
			case EventpatternPackage.COMPLEX_EVENT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EventpatternPackage.COMPLEX_EVENT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case EventpatternPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
				getComplexEventProperties().clear();
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
			case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK:
				return inboundLink != null && !inboundLink.isEmpty();
			case EventpatternPackage.COMPLEX_EVENT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EventpatternPackage.COMPLEX_EVENT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case EventpatternPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
				return complexEventProperties != null && !complexEventProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Operator.class) {
			switch (derivedFeatureID) {
				case EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK: return EventpatternPackage.OPERATOR__INBOUND_LINK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Operator.class) {
			switch (baseFeatureID) {
				case EventpatternPackage.OPERATOR__INBOUND_LINK: return EventpatternPackage.COMPLEX_EVENT__INBOUND_LINK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //ComplexEventImpl
