/**
 */
package eventpattern.impl;

import eventpattern.ContractFunction;
import eventpattern.EventpatternPackage;
import eventpattern.SmartContract;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.SmartContractImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link eventpattern.impl.SmartContractImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link eventpattern.impl.SmartContractImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link eventpattern.impl.SmartContractImpl#getContractAddress <em>Contract Address</em>}</li>
 *   <li>{@link eventpattern.impl.SmartContractImpl#getContractfunctions <em>Contractfunctions</em>}</li>
 *   <li>{@link eventpattern.impl.SmartContractImpl#getSmartContractProperties <em>Smart Contract Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartContractImpl extends EObjectImpl implements SmartContract {
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
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContractAddress() <em>Contract Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContractAddress() <em>Contract Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractAddress()
	 * @generated
	 * @ordered
	 */
	protected String contractAddress = CONTRACT_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContractfunctions() <em>Contractfunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFunction> contractfunctions;

	/**
	 * The cached value of the '{@link #getSmartContractProperties() <em>Smart Contract Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartContractProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFunction> smartContractProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventpatternPackage.Literals.SMART_CONTRACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.SMART_CONTRACT__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.SMART_CONTRACT__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.SMART_CONTRACT__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContractAddress() {
		return contractAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractAddress(String newContractAddress) {
		String oldContractAddress = contractAddress;
		contractAddress = newContractAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.SMART_CONTRACT__CONTRACT_ADDRESS, oldContractAddress, contractAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractFunction> getContractfunctions() {
		if (contractfunctions == null) {
			contractfunctions = new EObjectContainmentEList<ContractFunction>(ContractFunction.class, this, EventpatternPackage.SMART_CONTRACT__CONTRACTFUNCTIONS);
		}
		return contractfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractFunction> getSmartContractProperties() {
		if (smartContractProperties == null) {
			smartContractProperties = new EObjectContainmentWithInverseEList<ContractFunction>(ContractFunction.class, this, EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES, EventpatternPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT);
		}
		return smartContractProperties;
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
			case EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSmartContractProperties()).basicAdd(otherEnd, msgs);
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
			case EventpatternPackage.SMART_CONTRACT__CONTRACTFUNCTIONS:
				return ((InternalEList<?>)getContractfunctions()).basicRemove(otherEnd, msgs);
			case EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
				return ((InternalEList<?>)getSmartContractProperties()).basicRemove(otherEnd, msgs);
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
			case EventpatternPackage.SMART_CONTRACT__TYPE_NAME:
				return getTypeName();
			case EventpatternPackage.SMART_CONTRACT__IMAGE_PATH:
				return getImagePath();
			case EventpatternPackage.SMART_CONTRACT__PRIVATE_KEY:
				return getPrivateKey();
			case EventpatternPackage.SMART_CONTRACT__CONTRACT_ADDRESS:
				return getContractAddress();
			case EventpatternPackage.SMART_CONTRACT__CONTRACTFUNCTIONS:
				return getContractfunctions();
			case EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
				return getSmartContractProperties();
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
			case EventpatternPackage.SMART_CONTRACT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EventpatternPackage.SMART_CONTRACT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case EventpatternPackage.SMART_CONTRACT__PRIVATE_KEY:
				setPrivateKey((String)newValue);
				return;
			case EventpatternPackage.SMART_CONTRACT__CONTRACT_ADDRESS:
				setContractAddress((String)newValue);
				return;
			case EventpatternPackage.SMART_CONTRACT__CONTRACTFUNCTIONS:
				getContractfunctions().clear();
				getContractfunctions().addAll((Collection<? extends ContractFunction>)newValue);
				return;
			case EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
				getSmartContractProperties().clear();
				getSmartContractProperties().addAll((Collection<? extends ContractFunction>)newValue);
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
			case EventpatternPackage.SMART_CONTRACT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EventpatternPackage.SMART_CONTRACT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case EventpatternPackage.SMART_CONTRACT__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
				return;
			case EventpatternPackage.SMART_CONTRACT__CONTRACT_ADDRESS:
				setContractAddress(CONTRACT_ADDRESS_EDEFAULT);
				return;
			case EventpatternPackage.SMART_CONTRACT__CONTRACTFUNCTIONS:
				getContractfunctions().clear();
				return;
			case EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
				getSmartContractProperties().clear();
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
			case EventpatternPackage.SMART_CONTRACT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EventpatternPackage.SMART_CONTRACT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case EventpatternPackage.SMART_CONTRACT__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
			case EventpatternPackage.SMART_CONTRACT__CONTRACT_ADDRESS:
				return CONTRACT_ADDRESS_EDEFAULT == null ? contractAddress != null : !CONTRACT_ADDRESS_EDEFAULT.equals(contractAddress);
			case EventpatternPackage.SMART_CONTRACT__CONTRACTFUNCTIONS:
				return contractfunctions != null && !contractfunctions.isEmpty();
			case EventpatternPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
				return smartContractProperties != null && !smartContractProperties.isEmpty();
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(", contractAddress: ");
		result.append(contractAddress);
		result.append(')');
		return result.toString();
	}

} //SmartContractImpl
