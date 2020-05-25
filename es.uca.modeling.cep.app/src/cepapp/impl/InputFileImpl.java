/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.InputFile;
import cepapp.Link;
import cepapp.Origin;
import cepapp.SourceElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.InputFileImpl#getOutboundLink <em>Outbound Link</em>}</li>
 *   <li>{@link cepapp.impl.InputFileImpl#getDir_uri <em>Dir uri</em>}</li>
 *   <li>{@link cepapp.impl.InputFileImpl#getFile_uri <em>File uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputFileImpl extends FileImpl implements InputFile {
	/**
	 * The cached value of the '{@link #getOutboundLink() <em>Outbound Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> outboundLink;

	/**
	 * The default value of the '{@link #getDir_uri() <em>Dir uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir_uri()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDir_uri() <em>Dir uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir_uri()
	 * @generated
	 * @ordered
	 */
	protected String dir_uri = DIR_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_uri() <em>File uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_uri()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_uri() <em>File uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_uri()
	 * @generated
	 * @ordered
	 */
	protected String file_uri = FILE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.INPUT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getOutboundLink() {
		if (outboundLink == null) {
			outboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CepappPackage.INPUT_FILE__OUTBOUND_LINK, CepappPackage.LINK__ORIGIN);
		}
		return outboundLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDir_uri() {
		return dir_uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir_uri(String newDir_uri) {
		String oldDir_uri = dir_uri;
		dir_uri = newDir_uri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.INPUT_FILE__DIR_URI, oldDir_uri, dir_uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile_uri() {
		return file_uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile_uri(String newFile_uri) {
		String oldFile_uri = file_uri;
		file_uri = newFile_uri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.INPUT_FILE__FILE_URI, oldFile_uri, file_uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CepappPackage.INPUT_FILE__OUTBOUND_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundLink()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CepappPackage.INPUT_FILE__OUTBOUND_LINK:
				return ((InternalEList<?>)getOutboundLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CepappPackage.INPUT_FILE__OUTBOUND_LINK:
				return getOutboundLink();
			case CepappPackage.INPUT_FILE__DIR_URI:
				return getDir_uri();
			case CepappPackage.INPUT_FILE__FILE_URI:
				return getFile_uri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CepappPackage.INPUT_FILE__OUTBOUND_LINK:
				getOutboundLink().clear();
				getOutboundLink().addAll((Collection<? extends Link>)newValue);
				return;
			case CepappPackage.INPUT_FILE__DIR_URI:
				setDir_uri((String)newValue);
				return;
			case CepappPackage.INPUT_FILE__FILE_URI:
				setFile_uri((String)newValue);
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
			case CepappPackage.INPUT_FILE__OUTBOUND_LINK:
				getOutboundLink().clear();
				return;
			case CepappPackage.INPUT_FILE__DIR_URI:
				setDir_uri(DIR_URI_EDEFAULT);
				return;
			case CepappPackage.INPUT_FILE__FILE_URI:
				setFile_uri(FILE_URI_EDEFAULT);
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
			case CepappPackage.INPUT_FILE__OUTBOUND_LINK:
				return outboundLink != null && !outboundLink.isEmpty();
			case CepappPackage.INPUT_FILE__DIR_URI:
				return DIR_URI_EDEFAULT == null ? dir_uri != null : !DIR_URI_EDEFAULT.equals(dir_uri);
			case CepappPackage.INPUT_FILE__FILE_URI:
				return FILE_URI_EDEFAULT == null ? file_uri != null : !FILE_URI_EDEFAULT.equals(file_uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SourceElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Origin.class) {
			switch (derivedFeatureID) {
				case CepappPackage.INPUT_FILE__OUTBOUND_LINK: return CepappPackage.ORIGIN__OUTBOUND_LINK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SourceElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Origin.class) {
			switch (baseFeatureID) {
				case CepappPackage.ORIGIN__OUTBOUND_LINK: return CepappPackage.INPUT_FILE__OUTBOUND_LINK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (dir_uri: ");
		result.append(dir_uri);
		result.append(", file_uri: ");
		result.append(file_uri);
		result.append(')');
		return result.toString();
	}

} //InputFileImpl
