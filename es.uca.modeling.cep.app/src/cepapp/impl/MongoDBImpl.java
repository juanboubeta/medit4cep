/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.MongoDB;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mongo DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.MongoDBImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link cepapp.impl.MongoDBImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link cepapp.impl.MongoDBImpl#getCollectionName <em>Collection Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MongoDBImpl extends DatabaseImpl implements MongoDB {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionName() <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionName() <em>Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionName()
	 * @generated
	 * @ordered
	 */
	protected String collectionName = COLLECTION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MongoDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.MONGO_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.MONGO_DB__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.MONGO_DB__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionName() {
		return collectionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionName(String newCollectionName) {
		String oldCollectionName = collectionName;
		collectionName = newCollectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.MONGO_DB__COLLECTION_NAME, oldCollectionName, collectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CepappPackage.MONGO_DB__URI:
				return getUri();
			case CepappPackage.MONGO_DB__INDEX:
				return getIndex();
			case CepappPackage.MONGO_DB__COLLECTION_NAME:
				return getCollectionName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CepappPackage.MONGO_DB__URI:
				setUri((String)newValue);
				return;
			case CepappPackage.MONGO_DB__INDEX:
				setIndex((String)newValue);
				return;
			case CepappPackage.MONGO_DB__COLLECTION_NAME:
				setCollectionName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CepappPackage.MONGO_DB__URI:
				setUri(URI_EDEFAULT);
				return;
			case CepappPackage.MONGO_DB__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case CepappPackage.MONGO_DB__COLLECTION_NAME:
				setCollectionName(COLLECTION_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CepappPackage.MONGO_DB__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case CepappPackage.MONGO_DB__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case CepappPackage.MONGO_DB__COLLECTION_NAME:
				return COLLECTION_NAME_EDEFAULT == null ? collectionName != null : !COLLECTION_NAME_EDEFAULT.equals(collectionName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", index: ");
		result.append(index);
		result.append(", collectionName: ");
		result.append(collectionName);
		result.append(')');
		return result.toString();
	}

} //MongoDBImpl
