/**
 */
package smartcontract;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartcontract.InputParameter#getInputReferencedFunction <em>Input Referenced Function</em>}</li>
 * </ul>
 *
 * @see smartcontract.SmartcontractPackage#getInputParameter()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Input Parameter' tool.description='Add an Input Parameter' resizable='false'"
 * @generated
 */
public interface InputParameter extends Parameter {

	/**
	 * Returns the value of the '<em><b>Input Referenced Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartcontract.ContractFunction#getInputParametersFunction <em>Input Parameters Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Referenced Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Referenced Function</em>' container reference.
	 * @see #setInputReferencedFunction(ContractFunction)
	 * @see smartcontract.SmartcontractPackage#getInputParameter_InputReferencedFunction()
	 * @see smartcontract.ContractFunction#getInputParametersFunction
	 * @model opposite="InputParametersFunction" transient="false"
	 * @generated
	 */
	ContractFunction getInputReferencedFunction();

	/**
	 * Sets the value of the '{@link smartcontract.InputParameter#getInputReferencedFunction <em>Input Referenced Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Referenced Function</em>' container reference.
	 * @see #getInputReferencedFunction()
	 * @generated
	 */
	void setInputReferencedFunction(ContractFunction value);

} // InputParameter
