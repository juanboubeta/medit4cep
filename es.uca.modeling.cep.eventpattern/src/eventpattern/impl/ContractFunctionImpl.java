/**
 */
package eventpattern.impl;

import eventpattern.ContractFunction;
import eventpattern.EventpatternPackage;
import eventpattern.InputParameter;
import eventpattern.OutputParameter;
import eventpattern.SmartContract;

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
 * An implementation of the model object '<em><b>Contract Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.ContractFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eventpattern.impl.ContractFunctionImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.impl.ContractFunctionImpl#getReferencedSmartContract <em>Referenced Smart Contract</em>}</li>
 *   <li>{@link eventpattern.impl.ContractFunctionImpl#getInputParametersFunction <em>Input Parameters Function</em>}</li>
 *   <li>{@link eventpattern.impl.ContractFunctionImpl#getOutputParametersFunction <em>Output Parameters Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractFunctionImpl extends EObjectImpl implements ContractFunction {
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
	 * The cached value of the '{@link #getInputParametersFunction() <em>Input Parameters Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParametersFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameter> inputParametersFunction;

	/**
	 * The cached value of the '{@link #getOutputParametersFunction() <em>Output Parameters Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParametersFunction()
	 * @generated
	 * @ordered
	 */
	protected OutputParameter outputParametersFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventpatternPackage.Literals.CONTRACT_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CONTRACT_FUNCTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CONTRACT_FUNCTION__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContract getReferencedSmartContract() {
		if (eContainerFeatureID() != EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT) return null;
		return (SmartContract)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedSmartContract(SmartContract newReferencedSmartContract, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReferencedSmartContract, EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedSmartContract(SmartContract newReferencedSmartContract) {
		if (newReferencedSmartContract != eInternalContainer() || (eContainerFeatureID() != EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT && newReferencedSmartContract != null)) {
			if (EcoreUtil.isAncestor(this, newReferencedSmartContract))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReferencedSmartContract != null)
				msgs = ((InternalEObject)newReferencedSmartContract).eInverseAdd(this, EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES, SmartContract.class, msgs);
			msgs = basicSetReferencedSmartContract(newReferencedSmartContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT, newReferencedSmartContract, newReferencedSmartContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameter> getInputParametersFunction() {
		if (inputParametersFunction == null) {
			inputParametersFunction = new EObjectContainmentWithInverseEList<InputParameter>(InputParameter.class, this, EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION, EventpatternPackage.INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION);
		}
		return inputParametersFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameter getOutputParametersFunction() {
		return outputParametersFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputParametersFunction(OutputParameter newOutputParametersFunction, NotificationChain msgs) {
		OutputParameter oldOutputParametersFunction = outputParametersFunction;
		outputParametersFunction = newOutputParametersFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION, oldOutputParametersFunction, newOutputParametersFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParametersFunction(OutputParameter newOutputParametersFunction) {
		if (newOutputParametersFunction != outputParametersFunction) {
			NotificationChain msgs = null;
			if (outputParametersFunction != null)
				msgs = ((InternalEObject)outputParametersFunction).eInverseRemove(this, EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION, OutputParameter.class, msgs);
			if (newOutputParametersFunction != null)
				msgs = ((InternalEObject)newOutputParametersFunction).eInverseAdd(this, EventpatternPackage.OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION, OutputParameter.class, msgs);
			msgs = basicSetOutputParametersFunction(newOutputParametersFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION, newOutputParametersFunction, newOutputParametersFunction));
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
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReferencedSmartContract((SmartContract)otherEnd, msgs);
			case EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputParametersFunction()).basicAdd(otherEnd, msgs);
			case EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION:
				if (outputParametersFunction != null)
					msgs = ((InternalEObject)outputParametersFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION, null, msgs);
				return basicSetOutputParametersFunction((OutputParameter)otherEnd, msgs);
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
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				return basicSetReferencedSmartContract(null, msgs);
			case EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION:
				return ((InternalEList<?>)getInputParametersFunction()).basicRemove(otherEnd, msgs);
			case EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION:
				return basicSetOutputParametersFunction(null, msgs);
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
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				return eInternalContainer().eInverseRemove(this, EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES, SmartContract.class, msgs);
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
			case EventpatternPackage.CONTRACT_FUNCTION__NAME:
				return getName();
			case EventpatternPackage.CONTRACT_FUNCTION__IMAGE_PATH:
				return getImagePath();
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				return getReferencedSmartContract();
			case EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION:
				return getInputParametersFunction();
			case EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION:
				return getOutputParametersFunction();
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
			case EventpatternPackage.CONTRACT_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				setReferencedSmartContract((SmartContract)newValue);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION:
				getInputParametersFunction().clear();
				getInputParametersFunction().addAll((Collection<? extends InputParameter>)newValue);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION:
				setOutputParametersFunction((OutputParameter)newValue);
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
			case EventpatternPackage.CONTRACT_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				setReferencedSmartContract((SmartContract)null);
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION:
				getInputParametersFunction().clear();
				return;
			case EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION:
				setOutputParametersFunction((OutputParameter)null);
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
			case EventpatternPackage.CONTRACT_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EventpatternPackage.CONTRACT_FUNCTION__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT:
				return getReferencedSmartContract() != null;
			case EventpatternPackage.CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION:
				return inputParametersFunction != null && !inputParametersFunction.isEmpty();
			case EventpatternPackage.CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION:
				return outputParametersFunction != null;
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
		result.append(')');
		return result.toString();
	}

} //ContractFunctionImpl
