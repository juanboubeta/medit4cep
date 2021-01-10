/**
 */
package smartcontract;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see smartcontract.SmartcontractPackage
 * @generated
 */
public interface SmartcontractFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartcontractFactory eINSTANCE = smartcontract.impl.SmartcontractFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Smart Contracts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Contracts</em>'.
	 * @generated
	 */
	SmartContracts createSmartContracts();

	/**
	 * Returns a new object of class '<em>Smart Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Contract</em>'.
	 * @generated
	 */
	SmartContract createSmartContract();

	/**
	 * Returns a new object of class '<em>Contract Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Function</em>'.
	 * @generated
	 */
	ContractFunction createContractFunction();

	/**
	 * Returns a new object of class '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameter</em>'.
	 * @generated
	 */
	InputParameter createInputParameter();

	/**
	 * Returns a new object of class '<em>Output Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Parameter</em>'.
	 * @generated
	 */
	OutputParameter createOutputParameter();

	/**
	 * Returns a new object of class '<em>Constructor Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Parameter</em>'.
	 * @generated
	 */
	ConstructorParameter createConstructorParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmartcontractPackage getSmartcontractPackage();

} //SmartcontractFactory
