/**
 */
package smartcontract.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartcontract.ContractFunction;
import smartcontract.SmartContract;
import smartcontract.SmartcontractPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.impl.SmartContractImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link smartcontract.impl.SmartContractImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link smartcontract.impl.SmartContractImpl#getSmartContractProperties <em>Smart Contract Properties</em>}</li>
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
		return SmartcontractPackage.Literals.SMART_CONTRACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcontractPackage.SMART_CONTRACT__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartcontractPackage.SMART_CONTRACT__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractFunction> getSmartContractProperties() {
		if (smartContractProperties == null) {
			smartContractProperties = new EObjectContainmentWithInverseEList<ContractFunction>(ContractFunction.class, this, SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES, SmartcontractPackage.CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT);
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
			case SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
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
			case SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
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
			case SmartcontractPackage.SMART_CONTRACT__TYPE_NAME:
				return getTypeName();
			case SmartcontractPackage.SMART_CONTRACT__IMAGE_PATH:
				return getImagePath();
			case SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
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
			case SmartcontractPackage.SMART_CONTRACT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case SmartcontractPackage.SMART_CONTRACT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
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
			case SmartcontractPackage.SMART_CONTRACT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case SmartcontractPackage.SMART_CONTRACT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
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
			case SmartcontractPackage.SMART_CONTRACT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case SmartcontractPackage.SMART_CONTRACT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case SmartcontractPackage.SMART_CONTRACT__SMART_CONTRACT_PROPERTIES:
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
		result.append(')');
		return result.toString();
	}

} //SmartContractImpl
