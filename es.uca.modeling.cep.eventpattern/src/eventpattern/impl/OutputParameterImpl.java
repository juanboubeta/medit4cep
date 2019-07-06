/**
 */
package eventpattern.impl;

import eventpattern.ContractFunction;
import eventpattern.EventpatternPackage;
import eventpattern.OutputParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.OutputParameterImpl#getOutputReferencedFunction <em>Output Referenced Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputParameterImpl extends ParameterImpl implements OutputParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventpatternPackage.Literals.OUTPUT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFunction getOutputReferencedFunction() {
		if (eContainerFeatureID() != EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION) return null;
		return (ContractFunction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputReferencedFunction(ContractFunction newOutputReferencedFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutputReferencedFunction, EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputReferencedFunction(ContractFunction newOutputReferencedFunction) {
		if (newOutputReferencedFunction != eInternalContainer() || (eContainerFeatureID() != EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION && newOutputReferencedFunction != null)) {
			if (EcoreUtil.isAncestor(this, newOutputReferencedFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutputReferencedFunction != null)
				msgs = ((InternalEObject)newOutputReferencedFunction).eInverseAdd(this, EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION, ContractFunction.class, msgs);
			msgs = basicSetOutputReferencedFunction(newOutputReferencedFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION, newOutputReferencedFunction, newOutputReferencedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutputReferencedFunction((ContractFunction)otherEnd, msgs);
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
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				return basicSetOutputReferencedFunction(null, msgs);
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
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				return eInternalContainer().eInverseRemove(this, EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION, ContractFunction.class, msgs);
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
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				return getOutputReferencedFunction();
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
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				setOutputReferencedFunction((ContractFunction)newValue);
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
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				setOutputReferencedFunction((ContractFunction)null);
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
			case EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION:
				return getOutputReferencedFunction() != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputParameterImpl
