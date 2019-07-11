/**
 */
package smartcontract.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartcontract.ContractFunction;
import smartcontract.InputParameter;
import smartcontract.OutputParameter;
import smartcontract.Parameter;
import smartcontract.PropertyTypeValue;
import smartcontract.SmartContract;
import smartcontract.SmartContracts;
import smartcontract.SmartcontractFactory;
import smartcontract.SmartcontractPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartcontractPackageImpl extends EPackageImpl implements SmartcontractPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartContractsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeValueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see smartcontract.SmartcontractPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmartcontractPackageImpl() {
		super(eNS_URI, SmartcontractFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmartcontractPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmartcontractPackage init() {
		if (isInited) return (SmartcontractPackage)EPackage.Registry.INSTANCE.getEPackage(SmartcontractPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmartcontractPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmartcontractPackageImpl theSmartcontractPackage = registeredSmartcontractPackage instanceof SmartcontractPackageImpl ? (SmartcontractPackageImpl)registeredSmartcontractPackage : new SmartcontractPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSmartcontractPackage.createPackageContents();

		// Initialize created meta-data
		theSmartcontractPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmartcontractPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmartcontractPackage.eNS_URI, theSmartcontractPackage);
		return theSmartcontractPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartContracts() {
		return smartContractsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContracts_Name() {
		return (EAttribute)smartContractsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContracts_Description() {
		return (EAttribute)smartContractsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContracts_CreationDate() {
		return (EAttribute)smartContractsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContracts_Smartcontracts() {
		return (EReference)smartContractsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartContract() {
		return smartContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContract_TypeName() {
		return (EAttribute)smartContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContract_ImagePath() {
		return (EAttribute)smartContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContract_Contractfunctions() {
		return (EReference)smartContractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContract_SmartContractProperties() {
		return (EReference)smartContractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractFunction() {
		return contractFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractFunction_Name() {
		return (EAttribute)contractFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractFunction_ImagePath() {
		return (EAttribute)contractFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFunction_ReferencedSmartContract() {
		return (EReference)contractFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFunction_InputParametersFunction() {
		return (EReference)contractFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFunction_OutputParametersFunction() {
		return (EReference)contractFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParameter() {
		return inputParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParameter_InputReferencedFunction() {
		return (EReference)inputParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputParameter() {
		return outputParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputParameter_OutputReferencedFunction() {
		return (EReference)outputParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyTypeValue() {
		return propertyTypeValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartcontractFactory getSmartcontractFactory() {
		return (SmartcontractFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		smartContractsEClass = createEClass(SMART_CONTRACTS);
		createEAttribute(smartContractsEClass, SMART_CONTRACTS__NAME);
		createEAttribute(smartContractsEClass, SMART_CONTRACTS__DESCRIPTION);
		createEAttribute(smartContractsEClass, SMART_CONTRACTS__CREATION_DATE);
		createEReference(smartContractsEClass, SMART_CONTRACTS__SMARTCONTRACTS);

		smartContractEClass = createEClass(SMART_CONTRACT);
		createEAttribute(smartContractEClass, SMART_CONTRACT__TYPE_NAME);
		createEAttribute(smartContractEClass, SMART_CONTRACT__IMAGE_PATH);
		createEReference(smartContractEClass, SMART_CONTRACT__CONTRACTFUNCTIONS);
		createEReference(smartContractEClass, SMART_CONTRACT__SMART_CONTRACT_PROPERTIES);

		contractFunctionEClass = createEClass(CONTRACT_FUNCTION);
		createEAttribute(contractFunctionEClass, CONTRACT_FUNCTION__NAME);
		createEAttribute(contractFunctionEClass, CONTRACT_FUNCTION__IMAGE_PATH);
		createEReference(contractFunctionEClass, CONTRACT_FUNCTION__REFERENCED_SMART_CONTRACT);
		createEReference(contractFunctionEClass, CONTRACT_FUNCTION__INPUT_PARAMETERS_FUNCTION);
		createEReference(contractFunctionEClass, CONTRACT_FUNCTION__OUTPUT_PARAMETERS_FUNCTION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		inputParameterEClass = createEClass(INPUT_PARAMETER);
		createEReference(inputParameterEClass, INPUT_PARAMETER__INPUT_REFERENCED_FUNCTION);

		outputParameterEClass = createEClass(OUTPUT_PARAMETER);
		createEReference(outputParameterEClass, OUTPUT_PARAMETER__OUTPUT_REFERENCED_FUNCTION);

		// Create enums
		propertyTypeValueEEnum = createEEnum(PROPERTY_TYPE_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputParameterEClass.getESuperTypes().add(this.getParameter());
		outputParameterEClass.getESuperTypes().add(this.getParameter());

		// Initialize classes and features; add operations and parameters
		initEClass(smartContractsEClass, SmartContracts.class, "SmartContracts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartContracts_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmartContracts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartContracts_Description(), ecorePackage.getEString(), "description", null, 0, 1, SmartContracts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartContracts_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, SmartContracts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartContracts_Smartcontracts(), this.getSmartContract(), null, "smartcontracts", null, 0, -1, SmartContracts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartContractEClass, SmartContract.class, "SmartContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartContract_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartContract_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartContract_Contractfunctions(), this.getContractFunction(), null, "contractfunctions", null, 0, -1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartContract_SmartContractProperties(), this.getContractFunction(), this.getContractFunction_ReferencedSmartContract(), "SmartContractProperties", null, 0, -1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractFunctionEClass, ContractFunction.class, "ContractFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContractFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractFunction_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ContractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractFunction_ReferencedSmartContract(), this.getSmartContract(), this.getSmartContract_SmartContractProperties(), "referencedSmartContract", null, 0, 1, ContractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractFunction_InputParametersFunction(), this.getInputParameter(), this.getInputParameter_InputReferencedFunction(), "InputParametersFunction", null, 0, -1, ContractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractFunction_OutputParametersFunction(), this.getOutputParameter(), this.getOutputParameter_OutputReferencedFunction(), "OutputParametersFunction", null, 0, 1, ContractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getPropertyTypeValue(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParameterEClass, InputParameter.class, "InputParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParameter_InputReferencedFunction(), this.getContractFunction(), this.getContractFunction_InputParametersFunction(), "InputReferencedFunction", null, 0, 1, InputParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputParameterEClass, OutputParameter.class, "OutputParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputParameter_OutputReferencedFunction(), this.getContractFunction(), this.getContractFunction_OutputParametersFunction(), "OutputReferencedFunction", null, 0, 1, OutputParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyTypeValueEEnum, PropertyTypeValue.class, "PropertyTypeValue");
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.UNKNOWN);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.BOOLEAN);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.INTEGER);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.LONG);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.DOUBLE);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.FLOAT);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.STRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (smartContractsEClass,
		   source,
		   new String[] {
			   "model.extension", "smartc",
			   "diagram.extension", "smartc_diagram"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (smartContractEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "typeName",
			   "border.color", "110,110,110",
			   "tool.name", "Smart Contract",
			   "tool.description", "Add a SmartContract",
			   "resizable", "false"
		   });
		addAnnotation
		  (contractFunctionEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "name",
			   "border.color", "110,110,110",
			   "tool.name", "Contract Function",
			   "tool.description", "Add a Contract Function",
			   "resizable", "false"
		   });
		addAnnotation
		  (inputParameterEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "name",
			   "border.color", "110,110,110",
			   "tool.name", "Input Parameter",
			   "tool.description", "Add an Input Parameter",
			   "resizable", "false"
		   });
		addAnnotation
		  (outputParameterEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "name",
			   "border.color", "110,110,110",
			   "tool.name", "Output Parameter",
			   "tool.description", "Add an Output Parameter",
			   "resizable", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getSmartContract_SmartContractProperties(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getContractFunction_InputParametersFunction(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getContractFunction_OutputParametersFunction(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
	}

} //SmartcontractPackageImpl
