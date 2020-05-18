/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.SourceEmail#getPort <em>Port</em>}</li>
 *   <li>{@link cepapp.SourceEmail#getFolder <em>Folder</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getSourceEmail()
 * @model annotation="gmf.node figure='svg' label.placement='none' tool.name='Source Email' svg.uri='platform:/plugin/es.uca.modeling.cep.app.figures/svg/SourceEmail.svg'"
 * @generated
 */
public interface SourceEmail extends Email, SourceElement, Origin {

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"993"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see cepapp.CepappPackage#getSourceEmail_Port()
	 * @model default="993"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link cepapp.SourceEmail#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(String)
	 * @see cepapp.CepappPackage#getSourceEmail_Folder()
	 * @model
	 * @generated
	 */
	String getFolder();

	/**
	 * Sets the value of the '{@link cepapp.SourceEmail#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(String value);

} // SourceEmail
