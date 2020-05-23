/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.InputFile#getDir_uri <em>Dir uri</em>}</li>
 *   <li>{@link cepapp.InputFile#getFile_uri <em>File uri</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getInputFile()
 * @model annotation="gmf.node figure='svg' label.placement='none' tool.name='Input File' svg.uri='platform:/plugin/es.uca.modeling.cep.app.figures/svg/InputFile.svg'"
 * @generated
 */
public interface InputFile extends File, SourceElement, Origin {
	/**
	 * Returns the value of the '<em><b>Dir uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir uri</em>' attribute.
	 * @see #setDir_uri(String)
	 * @see cepapp.CepappPackage#getInputFile_Dir_uri()
	 * @model
	 * @generated
	 */
	String getDir_uri();

	/**
	 * Sets the value of the '{@link cepapp.InputFile#getDir_uri <em>Dir uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir uri</em>' attribute.
	 * @see #getDir_uri()
	 * @generated
	 */
	void setDir_uri(String value);

	/**
	 * Returns the value of the '<em><b>File uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File uri</em>' attribute.
	 * @see #setFile_uri(String)
	 * @see cepapp.CepappPackage#getInputFile_File_uri()
	 * @model
	 * @generated
	 */
	String getFile_uri();

	/**
	 * Sets the value of the '{@link cepapp.InputFile#getFile_uri <em>File uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File uri</em>' attribute.
	 * @see #getFile_uri()
	 * @generated
	 */
	void setFile_uri(String value);

} // InputFile
