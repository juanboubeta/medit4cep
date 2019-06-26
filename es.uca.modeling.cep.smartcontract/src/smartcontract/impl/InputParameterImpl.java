/**
 */
package smartcontract.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import smartcontract.ContractFunction;
import smartcontract.InputParameter;
import smartcontract.PropertyTypeValue;
import smartcontract.SmartcontractPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.impl.InputParameterImpl#getInputReferencedFunction <em>Input Referenced Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputParameterImpl extends ParameterImpl implements InputParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartcontractPackage.Literals.INPUT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFunction getInputReferencedFunction() {
		if (eContainerFeatureID() != SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION) return null;
		return (ContractFunction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputReferencedFunction(ContractFunction newInputReferencedFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInputReferencedFunction, SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputReferencedFunction(ContractFunction newInputReferencedFunction) {
		if (newInputReferencedFunction != eInternalContainer() || (eContainerFeatureID() != SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION && newInputReferencedFunction != null)) {
			if (EcoreUtil.isAncestor(this, newInputReferencedFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInputReferencedFunction != null)
				msgs = ((InternalEObject)newInputReferencedFunction).eInverseAdd(this, SmartcontractPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION, ContractFunction.class, msgs);
			msgs = basicSetInputReferencedFunction(newInputReferencedFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION, newInputReferencedFunction, newInputReferencedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInputReferencedFunction((ContractFunction)otherEnd, msgs);
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
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				return basicSetInputReferencedFunction(null, msgs);
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
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				return eInternalContainer().eInverseRemove(this, SmartcontractPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION, ContractFunction.class, msgs);
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
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				return getInputReferencedFunction();
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
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				setInputReferencedFunction((ContractFunction)newValue);
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
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				setInputReferencedFunction((ContractFunction)null);
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
			case SmartcontractPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION:
				return getInputReferencedFunction() != null;
		}
		return super.eIsSet(featureID);
	}

} //InputParameterImpl
