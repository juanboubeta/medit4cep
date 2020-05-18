/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.Mappable;
import cepapp.MappingType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mappable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.MappableImpl#getMappingType <em>Mapping Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappableImpl extends EObjectImpl implements Mappable {
	/**
	 * The default value of the '{@link #getMappingType() <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected static final MappingType MAPPING_TYPE_EDEFAULT = MappingType.PASS_THROUGH;

	/**
	 * The cached value of the '{@link #getMappingType() <em>Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingType()
	 * @generated
	 * @ordered
	 */
	protected MappingType mappingType = MAPPING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.MAPPABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType getMappingType() {
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingType(MappingType newMappingType) {
		MappingType oldMappingType = mappingType;
		mappingType = newMappingType == null ? MAPPING_TYPE_EDEFAULT : newMappingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.MAPPABLE__MAPPING_TYPE, oldMappingType, mappingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CepappPackage.MAPPABLE__MAPPING_TYPE:
				return getMappingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CepappPackage.MAPPABLE__MAPPING_TYPE:
				setMappingType((MappingType)newValue);
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
			case CepappPackage.MAPPABLE__MAPPING_TYPE:
				setMappingType(MAPPING_TYPE_EDEFAULT);
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
			case CepappPackage.MAPPABLE__MAPPING_TYPE:
				return mappingType != MAPPING_TYPE_EDEFAULT;
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
		result.append(" (mappingType: ");
		result.append(mappingType);
		result.append(')');
		return result.toString();
	}

} //MappableImpl
