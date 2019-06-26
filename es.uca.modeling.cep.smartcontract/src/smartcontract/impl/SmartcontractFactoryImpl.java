/**
 */
package smartcontract.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smartcontract.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartcontractFactoryImpl extends EFactoryImpl implements SmartcontractFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartcontractFactory init() {
		try {
			SmartcontractFactory theSmartcontractFactory = (SmartcontractFactory)EPackage.Registry.INSTANCE.getEFactory(SmartcontractPackage.eNS_URI);
			if (theSmartcontractFactory != null) {
				return theSmartcontractFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartcontractFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartcontractFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SmartcontractPackage.SMART_CONTRACTS: return createSmartContracts();
			case SmartcontractPackage.SMART_CONTRACT: return createSmartContract();
			case SmartcontractPackage.CONTRACT_FUNCTION: return createContractFunction();
			case SmartcontractPackage.INPUT_PARAMETER: return createInputParameter();
			case SmartcontractPackage.OUTPUT_PARAMETER: return createOutputParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SmartcontractPackage.PROPERTY_TYPE_VALUE:
				return createPropertyTypeValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SmartcontractPackage.PROPERTY_TYPE_VALUE:
				return convertPropertyTypeValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContracts createSmartContracts() {
		SmartContractsImpl smartContracts = new SmartContractsImpl();
		return smartContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContract createSmartContract() {
		SmartContractImpl smartContract = new SmartContractImpl();
		return smartContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFunction createContractFunction() {
		ContractFunctionImpl contractFunction = new ContractFunctionImpl();
		return contractFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameter createInputParameter() {
		InputParameterImpl inputParameter = new InputParameterImpl();
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameter createOutputParameter() {
		OutputParameterImpl outputParameter = new OutputParameterImpl();
		return outputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeValue createPropertyTypeValueFromString(EDataType eDataType, String initialValue) {
		PropertyTypeValue result = PropertyTypeValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartcontractPackage getSmartcontractPackage() {
		return (SmartcontractPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartcontractPackage getPackage() {
		return SmartcontractPackage.eINSTANCE;
	}

} //SmartcontractFactoryImpl
