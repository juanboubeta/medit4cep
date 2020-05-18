/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.Twitter#getConsumer_key <em>Consumer key</em>}</li>
 *   <li>{@link cepapp.Twitter#getConsumer_secret <em>Consumer secret</em>}</li>
 *   <li>{@link cepapp.Twitter#getAccess_token <em>Access token</em>}</li>
 *   <li>{@link cepapp.Twitter#getAccess_token_secret <em>Access token secret</em>}</li>
 *   <li>{@link cepapp.Twitter#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getTwitter()
 * @model annotation="gmf.node figure='svg' label.placement='none' tool.name='Source Twitter' svg.uri='platform:/plugin/es.uca.modeling.cep.app.figures/svg/Twitter.svg'"
 * @generated
 */
public interface Twitter extends Mappable, SourceElement, Origin {
	/**
	 * Returns the value of the '<em><b>Consumer key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer key</em>' attribute.
	 * @see #setConsumer_key(String)
	 * @see cepapp.CepappPackage#getTwitter_Consumer_key()
	 * @model
	 * @generated
	 */
	String getConsumer_key();

	/**
	 * Sets the value of the '{@link cepapp.Twitter#getConsumer_key <em>Consumer key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer key</em>' attribute.
	 * @see #getConsumer_key()
	 * @generated
	 */
	void setConsumer_key(String value);

	/**
	 * Returns the value of the '<em><b>Consumer secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer secret</em>' attribute.
	 * @see #setConsumer_secret(String)
	 * @see cepapp.CepappPackage#getTwitter_Consumer_secret()
	 * @model
	 * @generated
	 */
	String getConsumer_secret();

	/**
	 * Sets the value of the '{@link cepapp.Twitter#getConsumer_secret <em>Consumer secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer secret</em>' attribute.
	 * @see #getConsumer_secret()
	 * @generated
	 */
	void setConsumer_secret(String value);

	/**
	 * Returns the value of the '<em><b>Access token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access token</em>' attribute.
	 * @see #setAccess_token(String)
	 * @see cepapp.CepappPackage#getTwitter_Access_token()
	 * @model
	 * @generated
	 */
	String getAccess_token();

	/**
	 * Sets the value of the '{@link cepapp.Twitter#getAccess_token <em>Access token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access token</em>' attribute.
	 * @see #getAccess_token()
	 * @generated
	 */
	void setAccess_token(String value);

	/**
	 * Returns the value of the '<em><b>Access token secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access token secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access token secret</em>' attribute.
	 * @see #setAccess_token_secret(String)
	 * @see cepapp.CepappPackage#getTwitter_Access_token_secret()
	 * @model
	 * @generated
	 */
	String getAccess_token_secret();

	/**
	 * Sets the value of the '{@link cepapp.Twitter#getAccess_token_secret <em>Access token secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access token secret</em>' attribute.
	 * @see #getAccess_token_secret()
	 * @generated
	 */
	void setAccess_token_secret(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link cepapp.twitter_mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see cepapp.twitter_mode
	 * @see #setMode(twitter_mode)
	 * @see cepapp.CepappPackage#getTwitter_Mode()
	 * @model
	 * @generated
	 */
	twitter_mode getMode();

	/**
	 * Sets the value of the '{@link cepapp.Twitter#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see cepapp.twitter_mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(twitter_mode value);

} // Twitter
