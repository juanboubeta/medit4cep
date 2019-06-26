/**
 */
package smartcontract;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.ContractFunction#getName <em>Name</em>}</li>
 *   <li>{@link smartcontract.ContractFunction#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link smartcontract.ContractFunction#getReferencedSmartContract <em>Referenced Smart Contract</em>}</li>
 *   <li>{@link smartcontract.ContractFunction#getInputParametersFunction <em>Input Parameters Function</em>}</li>
 *   <li>{@link smartcontract.ContractFunction#getOutputParametersFunction <em>Output Parameters Function</em>}</li>
 * </ul>
 *
 * @see smartcontract.SmartcontractPackage#getContractFunction()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Contract Function' tool.description='Add a Contract Function' resizable='false'"
 * @generated
 */
public interface ContractFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartcontract.SmartcontractPackage#getContractFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartcontract.ContractFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see smartcontract.SmartcontractPackage#getContractFunction_ImagePath()
	 * @model
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link smartcontract.ContractFunction#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Smart Contract</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartcontract.SmartContract#getSmartContractProperties <em>Smart Contract Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Smart Contract</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Smart Contract</em>' container reference.
	 * @see #setReferencedSmartContract(SmartContract)
	 * @see smartcontract.SmartcontractPackage#getContractFunction_ReferencedSmartContract()
	 * @see smartcontract.SmartContract#getSmartContractProperties
	 * @model opposite="SmartContractProperties" transient="false"
	 * @generated
	 */
	SmartContract getReferencedSmartContract();

	/**
	 * Sets the value of the '{@link smartcontract.ContractFunction#getReferencedSmartContract <em>Referenced Smart Contract</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Smart Contract</em>' container reference.
	 * @see #getReferencedSmartContract()
	 * @generated
	 */
	void setReferencedSmartContract(SmartContract value);

	/**
	 * Returns the value of the '<em><b>Input Parameters Function</b></em>' containment reference list.
	 * The list contents are of type {@link smartcontract.InputParameter}.
	 * It is bidirectional and its opposite is '{@link smartcontract.InputParameter#getInputReferencedFunction <em>Input Referenced Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters Function</em>' containment reference list.
	 * @see smartcontract.SmartcontractPackage#getContractFunction_InputParametersFunction()
	 * @see smartcontract.InputParameter#getInputReferencedFunction
	 * @model opposite="InputReferencedFunction" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<InputParameter> getInputParametersFunction();

	/**
	 * Returns the value of the '<em><b>Output Parameters Function</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link smartcontract.OutputParameter#getOutputReferencedFunction <em>Output Referenced Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameters Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters Function</em>' containment reference.
	 * @see #setOutputParametersFunction(OutputParameter)
	 * @see smartcontract.SmartcontractPackage#getContractFunction_OutputParametersFunction()
	 * @see smartcontract.OutputParameter#getOutputReferencedFunction
	 * @model opposite="OutputReferencedFunction" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	OutputParameter getOutputParametersFunction();

	/**
	 * Sets the value of the '{@link smartcontract.ContractFunction#getOutputParametersFunction <em>Output Parameters Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameters Function</em>' containment reference.
	 * @see #getOutputParametersFunction()
	 * @generated
	 */
	void setOutputParametersFunction(OutputParameter value);

} // ContractFunction
