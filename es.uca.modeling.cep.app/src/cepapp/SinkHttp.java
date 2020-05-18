/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink Http</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.SinkHttp#getBasic_auth_username <em>Basic auth username</em>}</li>
 *   <li>{@link cepapp.SinkHttp#getBasic_auth_password <em>Basic auth password</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getSinkHttp()
 * @model annotation="gmf.node figure='svg' label.placement='none' tool.name='Sink HTTP' svg.uri='platform:/plugin/es.uca.modeling.cep.app.figures/svg/SinkHttp.svg'"
 * @generated
 */
public interface SinkHttp extends Http, SinkElement, Destination {
	/**
	 * Returns the value of the '<em><b>Basic auth username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic auth username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic auth username</em>' attribute.
	 * @see #setBasic_auth_username(String)
	 * @see cepapp.CepappPackage#getSinkHttp_Basic_auth_username()
	 * @model
	 * @generated
	 */
	String getBasic_auth_username();

	/**
	 * Sets the value of the '{@link cepapp.SinkHttp#getBasic_auth_username <em>Basic auth username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic auth username</em>' attribute.
	 * @see #getBasic_auth_username()
	 * @generated
	 */
	void setBasic_auth_username(String value);

	/**
	 * Returns the value of the '<em><b>Basic auth password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic auth password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic auth password</em>' attribute.
	 * @see #setBasic_auth_password(String)
	 * @see cepapp.CepappPackage#getSinkHttp_Basic_auth_password()
	 * @model
	 * @generated
	 */
	String getBasic_auth_password();

	/**
	 * Sets the value of the '{@link cepapp.SinkHttp#getBasic_auth_password <em>Basic auth password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic auth password</em>' attribute.
	 * @see #getBasic_auth_password()
	 * @generated
	 */
	void setBasic_auth_password(String value);

} // SinkHttp
