/**
 */
package smartcontract;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smartcontract.SmartcontractFactory
 * @model kind="package"
 * @generated
 */
public interface SmartcontractPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartcontract";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.uca.es/modeling/smartcontract";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartcontract";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartcontractPackage eINSTANCE = smartcontract.impl.SmartcontractPackageImpl.init();

	/**
	 * The meta object id for the '{@link smartcontract.impl.SmartContractsImpl <em>Smart Contracts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.impl.SmartContractsImpl
	 * @see smartcontract.impl.SmartcontractPackageImpl#getSmartContracts()
	 * @generated
	 */
	int SMART_CONTRACTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACTS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACTS__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Smartcontracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACTS__SMARTCONTRACTS = 3;

	/**
	 * The number of structural features of the '<em>Smart Contracts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACTS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link smartcontract.impl.SmartContractImpl <em>Smart Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.impl.SmartContractImpl
	 * @see smartcontract.impl.SmartcontractPackageImpl#getSmartContract()
	 * @generated
	 */
	int SMART_CONTRACT = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__IMAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Smart Contract Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__SMART_CONTRACT_PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link smartcontract.impl.ContractFunctionImpl <em>Contract Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.impl.ContractFunctionImpl
	 * @see smartcontract.impl.SmartcontractPackageImpl#getContractFunction()
	 * @generated
	 */
	int CONTRACT_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FUNCTION__IMAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Referenced Smart Contract</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT = 2;

	/**
	 * The feature id for the '<em><b>Input Parameters Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Output Parameters Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION = 4;

	/**
	 * The number of structural features of the '<em>Contract Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link smartcontract.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.impl.ParameterImpl
	 * @see smartcontract.impl.SmartcontractPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link smartcontract.impl.InputParameterImpl <em>Input Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.impl.InputParameterImpl
	 * @see smartcontract.impl.SmartcontractPackageImpl#getInputParameter()
	 * @generated
	 */
	int INPUT_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Input Referenced Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartcontract.impl.OutputParameterImpl <em>Output Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.impl.OutputParameterImpl
	 * @see smartcontract.impl.SmartcontractPackageImpl#getOutputParameter()
	 * @generated
	 */
	int OUTPUT_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Output Referenced Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartcontract.PropertyTypeValue <em>Property Type Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartcontract.PropertyTypeValue
	 * @see smartcontract.impl.SmartcontractPackageImpl#getPropertyTypeValue()
	 * @generated
	 */
	int PROPERTY_TYPE_VALUE = 6;


	/**
	 * Returns the meta object for class '{@link smartcontract.SmartContracts <em>Smart Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Contracts</em>'.
	 * @see smartcontract.SmartContracts
	 * @generated
	 */
	EClass getSmartContracts();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.SmartContracts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcontract.SmartContracts#getName()
	 * @see #getSmartContracts()
	 * @generated
	 */
	EAttribute getSmartContracts_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.SmartContracts#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see smartcontract.SmartContracts#getDescription()
	 * @see #getSmartContracts()
	 * @generated
	 */
	EAttribute getSmartContracts_Description();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.SmartContracts#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see smartcontract.SmartContracts#getCreationDate()
	 * @see #getSmartContracts()
	 * @generated
	 */
	EAttribute getSmartContracts_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcontract.SmartContracts#getSmartcontracts <em>Smartcontracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smartcontracts</em>'.
	 * @see smartcontract.SmartContracts#getSmartcontracts()
	 * @see #getSmartContracts()
	 * @generated
	 */
	EReference getSmartContracts_Smartcontracts();

	/**
	 * Returns the meta object for class '{@link smartcontract.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Contract</em>'.
	 * @see smartcontract.SmartContract
	 * @generated
	 */
	EClass getSmartContract();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.SmartContract#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see smartcontract.SmartContract#getTypeName()
	 * @see #getSmartContract()
	 * @generated
	 */
	EAttribute getSmartContract_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.SmartContract#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see smartcontract.SmartContract#getImagePath()
	 * @see #getSmartContract()
	 * @generated
	 */
	EAttribute getSmartContract_ImagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcontract.SmartContract#getSmartContractProperties <em>Smart Contract Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smart Contract Properties</em>'.
	 * @see smartcontract.SmartContract#getSmartContractProperties()
	 * @see #getSmartContract()
	 * @generated
	 */
	EReference getSmartContract_SmartContractProperties();

	/**
	 * Returns the meta object for class '{@link smartcontract.ContractFunction <em>Contract Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Function</em>'.
	 * @see smartcontract.ContractFunction
	 * @generated
	 */
	EClass getContractFunction();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.ContractFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcontract.ContractFunction#getName()
	 * @see #getContractFunction()
	 * @generated
	 */
	EAttribute getContractFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.ContractFunction#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see smartcontract.ContractFunction#getImagePath()
	 * @see #getContractFunction()
	 * @generated
	 */
	EAttribute getContractFunction_ImagePath();

	/**
	 * Returns the meta object for the container reference '{@link smartcontract.ContractFunction#getReferencedSmartContract <em>Referenced Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Smart Contract</em>'.
	 * @see smartcontract.ContractFunction#getReferencedSmartContract()
	 * @see #getContractFunction()
	 * @generated
	 */
	EReference getContractFunction_ReferencedSmartContract();

	/**
	 * Returns the meta object for the containment reference list '{@link smartcontract.ContractFunction#getInputParametersFunction <em>Input Parameters Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters Function</em>'.
	 * @see smartcontract.ContractFunction#getInputParametersFunction()
	 * @see #getContractFunction()
	 * @generated
	 */
	EReference getContractFunction_InputParametersFunction();

	/**
	 * Returns the meta object for the containment reference '{@link smartcontract.ContractFunction#getOutputParametersFunction <em>Output Parameters Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters Function</em>'.
	 * @see smartcontract.ContractFunction#getOutputParametersFunction()
	 * @see #getContractFunction()
	 * @generated
	 */
	EReference getContractFunction_OutputParametersFunction();

	/**
	 * Returns the meta object for class '{@link smartcontract.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see smartcontract.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartcontract.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartcontract.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smartcontract.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link smartcontract.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter</em>'.
	 * @see smartcontract.InputParameter
	 * @generated
	 */
	EClass getInputParameter();

	/**
	 * Returns the meta object for the container reference '{@link smartcontract.InputParameter#getInputReferencedFunction <em>Input Referenced Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Input Referenced Function</em>'.
	 * @see smartcontract.InputParameter#getInputReferencedFunction()
	 * @see #getInputParameter()
	 * @generated
	 */
	EReference getInputParameter_InputReferencedFunction();

	/**
	 * Returns the meta object for class '{@link smartcontract.OutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameter</em>'.
	 * @see smartcontract.OutputParameter
	 * @generated
	 */
	EClass getOutputParameter();

	/**
	 * Returns the meta object for the container reference '{@link smartcontract.OutputParameter#getOutputReferencedFunction <em>Output Referenced Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Output Referenced Function</em>'.
	 * @see smartcontract.OutputParameter#getOutputReferencedFunction()
	 * @see #getOutputParameter()
	 * @generated
	 */
	EReference getOutputParameter_OutputReferencedFunction();

	/**
	 * Returns the meta object for enum '{@link smartcontract.PropertyTypeValue <em>Property Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type Value</em>'.
	 * @see smartcontract.PropertyTypeValue
	 * @generated
	 */
	EEnum getPropertyTypeValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartcontractFactory getSmartcontractFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smartcontract.impl.SmartContractsImpl <em>Smart Contracts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.impl.SmartContractsImpl
		 * @see smartcontract.impl.SmartcontractPackageImpl#getSmartContracts()
		 * @generated
		 */
		EClass SMART_CONTRACTS = eINSTANCE.getSmartContracts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACTS__NAME = eINSTANCE.getSmartContracts_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACTS__DESCRIPTION = eINSTANCE.getSmartContracts_Description();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACTS__CREATION_DATE = eINSTANCE.getSmartContracts_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Smartcontracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CONTRACTS__SMARTCONTRACTS = eINSTANCE.getSmartContracts_Smartcontracts();

		/**
		 * The meta object literal for the '{@link smartcontract.impl.SmartContractImpl <em>Smart Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.impl.SmartContractImpl
		 * @see smartcontract.impl.SmartcontractPackageImpl#getSmartContract()
		 * @generated
		 */
		EClass SMART_CONTRACT = eINSTANCE.getSmartContract();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACT__TYPE_NAME = eINSTANCE.getSmartContract_TypeName();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACT__IMAGE_PATH = eINSTANCE.getSmartContract_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Smart Contract Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CONTRACT__SMART_CONTRACT_PROPERTIES = eINSTANCE.getSmartContract_SmartContractProperties();

		/**
		 * The meta object literal for the '{@link smartcontract.impl.ContractFunctionImpl <em>Contract Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.impl.ContractFunctionImpl
		 * @see smartcontract.impl.SmartcontractPackageImpl#getContractFunction()
		 * @generated
		 */
		EClass CONTRACT_FUNCTION = eINSTANCE.getContractFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_FUNCTION__NAME = eINSTANCE.getContractFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT_FUNCTION__IMAGE_PATH = eINSTANCE.getContractFunction_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Referenced Smart Contract</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT = eINSTANCE.getContractFunction_ReferencedSmartContract();

		/**
		 * The meta object literal for the '<em><b>Input Parameters Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION = eINSTANCE.getContractFunction_InputParametersFunction();

		/**
		 * The meta object literal for the '<em><b>Output Parameters Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION = eINSTANCE.getContractFunction_OutputParametersFunction();

		/**
		 * The meta object literal for the '{@link smartcontract.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.impl.ParameterImpl
		 * @see smartcontract.impl.SmartcontractPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link smartcontract.impl.InputParameterImpl <em>Input Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.impl.InputParameterImpl
		 * @see smartcontract.impl.SmartcontractPackageImpl#getInputParameter()
		 * @generated
		 */
		EClass INPUT_PARAMETER = eINSTANCE.getInputParameter();

		/**
		 * The meta object literal for the '<em><b>Input Referenced Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION = eINSTANCE.getInputParameter_InputReferencedFunction();

		/**
		 * The meta object literal for the '{@link smartcontract.impl.OutputParameterImpl <em>Output Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.impl.OutputParameterImpl
		 * @see smartcontract.impl.SmartcontractPackageImpl#getOutputParameter()
		 * @generated
		 */
		EClass OUTPUT_PARAMETER = eINSTANCE.getOutputParameter();

		/**
		 * The meta object literal for the '<em><b>Output Referenced Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION = eINSTANCE.getOutputParameter_OutputReferencedFunction();

		/**
		 * The meta object literal for the '{@link smartcontract.PropertyTypeValue <em>Property Type Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartcontract.PropertyTypeValue
		 * @see smartcontract.impl.SmartcontractPackageImpl#getPropertyTypeValue()
		 * @generated
		 */
		EEnum PROPERTY_TYPE_VALUE = eINSTANCE.getPropertyTypeValue();

	}

} //SmartcontractPackage
