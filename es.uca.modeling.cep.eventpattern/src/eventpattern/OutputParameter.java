/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.OutputParameter#getOutputReferencedFunction <em>Output Referenced Function</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getOutputParameter()
 * @model annotation="gmf.node figure='rectangle' label='name' border.color='110,110,110' tool.name='Output Parameter' tool.description='Add an Output Parameter' resizable='false' label.readOnly='true'"
 * @generated
 */
public interface OutputParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Output Referenced Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eventpattern.ContractFunction#getOutputParametersFunction <em>Output Parameters Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Referenced Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Referenced Function</em>' container reference.
	 * @see #setOutputReferencedFunction(ContractFunction)
	 * @see eventpattern.EventpatternPackage#getOutputParameter_OutputReferencedFunction()
	 * @see eventpattern.ContractFunction#getOutputParametersFunction
	 * @model opposite="OutputParametersFunction" transient="false"
	 * @generated
	 */
	ContractFunction getOutputReferencedFunction();

	/**
	 * Sets the value of the '{@link eventpattern.OutputParameter#getOutputReferencedFunction <em>Output Referenced Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Referenced Function</em>' container reference.
	 * @see #getOutputReferencedFunction()
	 * @generated
	 */
	void setOutputReferencedFunction(ContractFunction value);

} // OutputParameter
