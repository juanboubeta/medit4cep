/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.OutputFile#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getOutputFile()
 * @model annotation="gmf.node figure='svg' label.placement='none' tool.name='Output File' svg.uri='platform:/plugin/es.uca.modeling.cep.app.figures/svg/OutputFile.svg'"
 * @generated
 */
public interface OutputFile extends File, SinkElement, Destination {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see cepapp.CepappPackage#getOutputFile_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link cepapp.OutputFile#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // OutputFile
