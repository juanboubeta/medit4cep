/**
 */
package smartcontract.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smartcontract.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smartcontract.SmartcontractPackage
 * @generated
 */
public class SmartcontractAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmartcontractPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartcontractAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmartcontractPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartcontractSwitch<Adapter> modelSwitch =
		new SmartcontractSwitch<Adapter>() {
			@Override
			public Adapter caseSmartContracts(SmartContracts object) {
				return createSmartContractsAdapter();
			}
			@Override
			public Adapter caseSmartContract(SmartContract object) {
				return createSmartContractAdapter();
			}
			@Override
			public Adapter caseContractFunction(ContractFunction object) {
				return createContractFunctionAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseInputParameter(InputParameter object) {
				return createInputParameterAdapter();
			}
			@Override
			public Adapter caseOutputParameter(OutputParameter object) {
				return createOutputParameterAdapter();
			}
			@Override
			public Adapter caseConstructorParameter(ConstructorParameter object) {
				return createConstructorParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.SmartContracts <em>Smart Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.SmartContracts
	 * @generated
	 */
	public Adapter createSmartContractsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.SmartContract
	 * @generated
	 */
	public Adapter createSmartContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.ContractFunction <em>Contract Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.ContractFunction
	 * @generated
	 */
	public Adapter createContractFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.InputParameter
	 * @generated
	 */
	public Adapter createInputParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.OutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.OutputParameter
	 * @generated
	 */
	public Adapter createOutputParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smartcontract.ConstructorParameter <em>Constructor Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smartcontract.ConstructorParameter
	 * @generated
	 */
	public Adapter createConstructorParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SmartcontractAdapterFactory
