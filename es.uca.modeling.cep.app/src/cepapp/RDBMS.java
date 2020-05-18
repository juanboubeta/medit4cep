/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDBMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.RDBMS#getJdbc_url <em>Jdbc url</em>}</li>
 *   <li>{@link cepapp.RDBMS#getUsername <em>Username</em>}</li>
 *   <li>{@link cepapp.RDBMS#getPassword <em>Password</em>}</li>
 *   <li>{@link cepapp.RDBMS#getJdbc_driver_name <em>Jdbc driver name</em>}</li>
 *   <li>{@link cepapp.RDBMS#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getRDBMS()
 * @model abstract="true"
 * @generated
 */
public interface RDBMS extends Database {
	/**
	 * Returns the value of the '<em><b>Jdbc url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc url</em>' attribute.
	 * @see #setJdbc_url(String)
	 * @see cepapp.CepappPackage#getRDBMS_Jdbc_url()
	 * @model
	 * @generated
	 */
	String getJdbc_url();

	/**
	 * Sets the value of the '{@link cepapp.RDBMS#getJdbc_url <em>Jdbc url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc url</em>' attribute.
	 * @see #getJdbc_url()
	 * @generated
	 */
	void setJdbc_url(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see cepapp.CepappPackage#getRDBMS_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link cepapp.RDBMS#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see cepapp.CepappPackage#getRDBMS_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link cepapp.RDBMS#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc driver name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc driver name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc driver name</em>' attribute.
	 * @see #setJdbc_driver_name(String)
	 * @see cepapp.CepappPackage#getRDBMS_Jdbc_driver_name()
	 * @model
	 * @generated
	 */
	String getJdbc_driver_name();

	/**
	 * Sets the value of the '{@link cepapp.RDBMS#getJdbc_driver_name <em>Jdbc driver name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc driver name</em>' attribute.
	 * @see #getJdbc_driver_name()
	 * @generated
	 */
	void setJdbc_driver_name(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see cepapp.CepappPackage#getRDBMS_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link cepapp.RDBMS#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

} // RDBMS
