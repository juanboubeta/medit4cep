/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.InputParameter#getInputReferencedFunction <em>Input Referenced Function</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getInputParameter()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Input Parameter' tool.description='Add an Input Parameter' resizable='false' label.readOnly='true'"
 * @generated
 */
public interface InputParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Input Referenced Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eventpattern.ContractFunction#getInputParametersFunction <em>Input Parameters Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Referenced Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Referenced Function</em>' container reference.
	 * @see #setInputReferencedFunction(ContractFunction)
	 * @see eventpattern.EventpatternPackage#getInputParameter_InputReferencedFunction()
	 * @see eventpattern.ContractFunction#getInputParametersFunction
	 * @model opposite="InputParametersFunction" transient="false"
	 * @generated
	 */
	ContractFunction getInputReferencedFunction();

	/**
	 * Sets the value of the '{@link eventpattern.InputParameter#getInputReferencedFunction <em>Input Referenced Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Referenced Function</em>' container reference.
	 * @see #getInputReferencedFunction()
	 * @generated
	 */
	void setInputReferencedFunction(ContractFunction value);

} // InputParameter
