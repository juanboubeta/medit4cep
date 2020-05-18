/**
 */
package cepapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.MongoDB#getUri <em>Uri</em>}</li>
 *   <li>{@link cepapp.MongoDB#getIndex <em>Index</em>}</li>
 *   <li>{@link cepapp.MongoDB#getCollectionName <em>Collection Name</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getMongoDB()
 * @model abstract="true"
 * @generated
 */
public interface MongoDB extends Database {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see cepapp.CepappPackage#getMongoDB_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link cepapp.MongoDB#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

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
	 * @see cepapp.CepappPackage#getMongoDB_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link cepapp.MongoDB#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Name</em>' attribute.
	 * @see #setCollectionName(String)
	 * @see cepapp.CepappPackage#getMongoDB_CollectionName()
	 * @model
	 * @generated
	 */
	String getCollectionName();

	/**
	 * Sets the value of the '{@link cepapp.MongoDB#getCollectionName <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Name</em>' attribute.
	 * @see #getCollectionName()
	 * @generated
	 */
	void setCollectionName(String value);

} // MongoDB
