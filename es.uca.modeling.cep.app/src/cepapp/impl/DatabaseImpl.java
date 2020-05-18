/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.Database;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.DatabaseImpl#getPrimary_key <em>Primary key</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DatabaseImpl extends MappableImpl implements Database {
	/**
	 * The default value of the '{@link #getPrimary_key() <em>Primary key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_key()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPrimary_key() <em>Primary key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_key()
	 * @generated
	 * @ordered
	 */
	protected String primary_key = PRIMARY_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimary_key() {
		return primary_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary_key(String newPrimary_key) {
		String oldPrimary_key = primary_key;
		primary_key = newPrimary_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.DATABASE__PRIMARY_KEY, oldPrimary_key, primary_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CepappPackage.DATABASE__PRIMARY_KEY:
				return getPrimary_key();
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
			case CepappPackage.DATABASE__PRIMARY_KEY:
				setPrimary_key((String)newValue);
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
			case CepappPackage.DATABASE__PRIMARY_KEY:
				setPrimary_key(PRIMARY_KEY_EDEFAULT);
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
			case CepappPackage.DATABASE__PRIMARY_KEY:
				return PRIMARY_KEY_EDEFAULT == null ? primary_key != null : !PRIMARY_KEY_EDEFAULT.equals(primary_key);
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
		result.append(" (primary_key: ");
		result.append(primary_key);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
