/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.ComplexEvent;
import cepapp.ComplexEventProperty;
import cepapp.Link;
import cepapp.Origin;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link cepapp.impl.ComplexEventImpl#getOutboundLink <em>Outbound Link</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventImpl#getComplexEventProperties <em>Complex Event Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexEventImpl extends SinkElementImpl implements ComplexEvent {
	/**
	 * The cached value of the '{@link #getOutboundLink() <em>Outbound Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> outboundLink;

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
	protected ComplexEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.COMPLEX_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getOutboundLink() {
		if (outboundLink == null) {
			outboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK, CepappPackage.LINK__ORIGIN);
		}
		return outboundLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexEventProperty> getComplexEventProperties() {
		if (complexEventProperties == null) {
			complexEventProperties = new EObjectContainmentWithInverseEList<ComplexEventProperty>(ComplexEventProperty.class, this, CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES, CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundLink()).basicAdd(otherEnd, msgs);
			case CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComplexEventProperties()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK:
				return ((InternalEList<?>)getOutboundLink()).basicRemove(otherEnd, msgs);
			case CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK:
				return getOutboundLink();
			case CepappPackage.COMPLEX_EVENT__TYPE_NAME:
				return getTypeName();
			case CepappPackage.COMPLEX_EVENT__IMAGE_PATH:
				return getImagePath();
			case CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK:
				getOutboundLink().clear();
				getOutboundLink().addAll((Collection<? extends Link>)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK:
				getOutboundLink().clear();
				return;
			case CepappPackage.COMPLEX_EVENT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case CepappPackage.COMPLEX_EVENT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK:
				return outboundLink != null && !outboundLink.isEmpty();
			case CepappPackage.COMPLEX_EVENT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case CepappPackage.COMPLEX_EVENT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Origin.class) {
			switch (derivedFeatureID) {
				case CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK: return CepappPackage.ORIGIN__OUTBOUND_LINK;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Origin.class) {
			switch (baseFeatureID) {
				case CepappPackage.ORIGIN__OUTBOUND_LINK: return CepappPackage.COMPLEX_EVENT__OUTBOUND_LINK;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //ComplexEventImpl
