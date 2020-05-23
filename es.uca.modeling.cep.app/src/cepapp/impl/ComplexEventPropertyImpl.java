/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.ComplexEvent;
import cepapp.ComplexEventProperty;
import cepapp.PropertyTypeValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Event Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.ComplexEventPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventPropertyImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventPropertyImpl#getReferencedComplexEvent <em>Referenced Complex Event</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventPropertyImpl#getComplexEventProperties <em>Complex Event Properties</em>}</li>
 *   <li>{@link cepapp.impl.ComplexEventPropertyImpl#getReferencedComplexEventProperty <em>Referenced Complex Event Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexEventPropertyImpl extends EObjectImpl implements ComplexEventProperty {
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
	protected ComplexEventPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.COMPLEX_EVENT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT_PROPERTY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT_PROPERTY__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeValue getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PropertyTypeValue newType) {
		PropertyTypeValue oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEvent getReferencedComplexEvent() {
		if (eContainerFeatureID() != CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT) return null;
		return (ComplexEvent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedComplexEvent(ComplexEvent newReferencedComplexEvent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReferencedComplexEvent, CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedComplexEvent(ComplexEvent newReferencedComplexEvent) {
		if (newReferencedComplexEvent != eInternalContainer() || (eContainerFeatureID() != CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT && newReferencedComplexEvent != null)) {
			if (EcoreUtil.isAncestor(this, newReferencedComplexEvent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReferencedComplexEvent != null)
				msgs = ((InternalEObject)newReferencedComplexEvent).eInverseAdd(this, CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES, ComplexEvent.class, msgs);
			msgs = basicSetReferencedComplexEvent(newReferencedComplexEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT, newReferencedComplexEvent, newReferencedComplexEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexEventProperty> getComplexEventProperties() {
		if (complexEventProperties == null) {
			complexEventProperties = new EObjectContainmentWithInverseEList<ComplexEventProperty>(ComplexEventProperty.class, this, CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES, CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY);
		}
		return complexEventProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEventProperty getReferencedComplexEventProperty() {
		if (eContainerFeatureID() != CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY) return null;
		return (ComplexEventProperty)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedComplexEventProperty(ComplexEventProperty newReferencedComplexEventProperty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReferencedComplexEventProperty, CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedComplexEventProperty(ComplexEventProperty newReferencedComplexEventProperty) {
		if (newReferencedComplexEventProperty != eInternalContainer() || (eContainerFeatureID() != CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY && newReferencedComplexEventProperty != null)) {
			if (EcoreUtil.isAncestor(this, newReferencedComplexEventProperty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReferencedComplexEventProperty != null)
				msgs = ((InternalEObject)newReferencedComplexEventProperty).eInverseAdd(this, CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES, ComplexEventProperty.class, msgs);
			msgs = basicSetReferencedComplexEventProperty(newReferencedComplexEventProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY, newReferencedComplexEventProperty, newReferencedComplexEventProperty));
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
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReferencedComplexEvent((ComplexEvent)otherEnd, msgs);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComplexEventProperties()).basicAdd(otherEnd, msgs);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReferencedComplexEventProperty((ComplexEventProperty)otherEnd, msgs);
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
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				return basicSetReferencedComplexEvent(null, msgs);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES:
				return ((InternalEList<?>)getComplexEventProperties()).basicRemove(otherEnd, msgs);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				return basicSetReferencedComplexEventProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				return eInternalContainer().eInverseRemove(this, CepappPackage.COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES, ComplexEvent.class, msgs);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				return eInternalContainer().eInverseRemove(this, CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES, ComplexEventProperty.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CepappPackage.COMPLEX_EVENT_PROPERTY__NAME:
				return getName();
			case CepappPackage.COMPLEX_EVENT_PROPERTY__IMAGE_PATH:
				return getImagePath();
			case CepappPackage.COMPLEX_EVENT_PROPERTY__TYPE:
				return getType();
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				return getReferencedComplexEvent();
			case CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES:
				return getComplexEventProperties();
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				return getReferencedComplexEventProperty();
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
			case CepappPackage.COMPLEX_EVENT_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__TYPE:
				setType((PropertyTypeValue)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				setReferencedComplexEvent((ComplexEvent)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES:
				getComplexEventProperties().clear();
				getComplexEventProperties().addAll((Collection<? extends ComplexEventProperty>)newValue);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				setReferencedComplexEventProperty((ComplexEventProperty)newValue);
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
			case CepappPackage.COMPLEX_EVENT_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				setReferencedComplexEvent((ComplexEvent)null);
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES:
				getComplexEventProperties().clear();
				return;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				setReferencedComplexEventProperty((ComplexEventProperty)null);
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
			case CepappPackage.COMPLEX_EVENT_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case CepappPackage.COMPLEX_EVENT_PROPERTY__TYPE:
				return type != TYPE_EDEFAULT;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT:
				return getReferencedComplexEvent() != null;
			case CepappPackage.COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES:
				return complexEventProperties != null && !complexEventProperties.isEmpty();
			case CepappPackage.COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY:
				return getReferencedComplexEventProperty() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ComplexEventPropertyImpl
