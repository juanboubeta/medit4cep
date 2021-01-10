/**
 */
package smartcontract.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import smartcontract.ConstructorParameter;
import smartcontract.SmartContract;
import smartcontract.SmartcontractPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.impl.ConstructorParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link smartcontract.impl.ConstructorParameterImpl#getConstructorParameterReferencedContract <em>Constructor Parameter Referenced Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorParameterImpl extends ParameterImpl implements ConstructorParameter {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartcontractPackage.Literals.CONSTRUCTOR_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcontractPackage.CONSTRUCTOR_PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContract getConstructorParameterReferencedContract() {
		if (eContainerFeatureID() != SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT) return null;
		return (SmartContract)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructorParameterReferencedContract(SmartContract newConstructorParameterReferencedContract, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstructorParameterReferencedContract, SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorParameterReferencedContract(SmartContract newConstructorParameterReferencedContract) {
		if (newConstructorParameterReferencedContract != eInternalContainer() || (eContainerFeatureID() != SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT && newConstructorParameterReferencedContract != null)) {
			if (EcoreUtil.isAncestor(this, newConstructorParameterReferencedContract))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstructorParameterReferencedContract != null)
				msgs = ((InternalEObject)newConstructorParameterReferencedContract).eInverseAdd(this, SmartcontractPackage.SMART_CONTRACT__CONSTRUCTOR_PARAMETERS_CONTRACT, SmartContract.class, msgs);
			msgs = basicSetConstructorParameterReferencedContract(newConstructorParameterReferencedContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT, newConstructorParameterReferencedContract, newConstructorParameterReferencedContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstructorParameterReferencedContract((SmartContract)otherEnd, msgs);
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
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				return basicSetConstructorParameterReferencedContract(null, msgs);
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
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				return eInternalContainer().eInverseRemove(this, SmartcontractPackage.SMART_CONTRACT__CONSTRUCTOR_PARAMETERS_CONTRACT, SmartContract.class, msgs);
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
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__VALUE:
				return getValue();
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				return getConstructorParameterReferencedContract();
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
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				setConstructorParameterReferencedContract((SmartContract)newValue);
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
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				setConstructorParameterReferencedContract((SmartContract)null);
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
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SmartcontractPackage.CONSTRUCTOR_PARAMETER__CONSTRUCTOR_PARAMETER_REFERENCED_CONTRACT:
				return getConstructorParameterReferencedContract() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConstructorParameterImpl
