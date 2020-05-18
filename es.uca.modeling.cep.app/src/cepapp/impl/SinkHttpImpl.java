/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.Destination;
import cepapp.Link;
import cepapp.SinkElement;
import cepapp.SinkHttp;

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
 * An implementation of the model object '<em><b>Sink Http</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.SinkHttpImpl#getInboundLink <em>Inbound Link</em>}</li>
 *   <li>{@link cepapp.impl.SinkHttpImpl#getBasic_auth_username <em>Basic auth username</em>}</li>
 *   <li>{@link cepapp.impl.SinkHttpImpl#getBasic_auth_password <em>Basic auth password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinkHttpImpl extends HttpImpl implements SinkHttp {
	/**
	 * The cached value of the '{@link #getInboundLink() <em>Inbound Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> inboundLink;

	/**
	 * The default value of the '{@link #getBasic_auth_username() <em>Basic auth username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic_auth_username()
	 * @generated
	 * @ordered
	 */
	protected static final String BASIC_AUTH_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasic_auth_username() <em>Basic auth username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic_auth_username()
	 * @generated
	 * @ordered
	 */
	protected String basic_auth_username = BASIC_AUTH_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasic_auth_password() <em>Basic auth password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic_auth_password()
	 * @generated
	 * @ordered
	 */
	protected static final String BASIC_AUTH_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasic_auth_password() <em>Basic auth password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic_auth_password()
	 * @generated
	 * @ordered
	 */
	protected String basic_auth_password = BASIC_AUTH_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkHttpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.SINK_HTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getInboundLink() {
		if (inboundLink == null) {
			inboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CepappPackage.SINK_HTTP__INBOUND_LINK, CepappPackage.LINK__DESTINATION);
		}
		return inboundLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasic_auth_username() {
		return basic_auth_username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic_auth_username(String newBasic_auth_username) {
		String oldBasic_auth_username = basic_auth_username;
		basic_auth_username = newBasic_auth_username;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.SINK_HTTP__BASIC_AUTH_USERNAME, oldBasic_auth_username, basic_auth_username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasic_auth_password() {
		return basic_auth_password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic_auth_password(String newBasic_auth_password) {
		String oldBasic_auth_password = basic_auth_password;
		basic_auth_password = newBasic_auth_password;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CepappPackage.SINK_HTTP__BASIC_AUTH_PASSWORD, oldBasic_auth_password, basic_auth_password));
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
			case CepappPackage.SINK_HTTP__INBOUND_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInboundLink()).basicAdd(otherEnd, msgs);
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
			case CepappPackage.SINK_HTTP__INBOUND_LINK:
				return ((InternalEList<?>)getInboundLink()).basicRemove(otherEnd, msgs);
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
			case CepappPackage.SINK_HTTP__INBOUND_LINK:
				return getInboundLink();
			case CepappPackage.SINK_HTTP__BASIC_AUTH_USERNAME:
				return getBasic_auth_username();
			case CepappPackage.SINK_HTTP__BASIC_AUTH_PASSWORD:
				return getBasic_auth_password();
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
			case CepappPackage.SINK_HTTP__INBOUND_LINK:
				getInboundLink().clear();
				getInboundLink().addAll((Collection<? extends Link>)newValue);
				return;
			case CepappPackage.SINK_HTTP__BASIC_AUTH_USERNAME:
				setBasic_auth_username((String)newValue);
				return;
			case CepappPackage.SINK_HTTP__BASIC_AUTH_PASSWORD:
				setBasic_auth_password((String)newValue);
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
			case CepappPackage.SINK_HTTP__INBOUND_LINK:
				getInboundLink().clear();
				return;
			case CepappPackage.SINK_HTTP__BASIC_AUTH_USERNAME:
				setBasic_auth_username(BASIC_AUTH_USERNAME_EDEFAULT);
				return;
			case CepappPackage.SINK_HTTP__BASIC_AUTH_PASSWORD:
				setBasic_auth_password(BASIC_AUTH_PASSWORD_EDEFAULT);
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
			case CepappPackage.SINK_HTTP__INBOUND_LINK:
				return inboundLink != null && !inboundLink.isEmpty();
			case CepappPackage.SINK_HTTP__BASIC_AUTH_USERNAME:
				return BASIC_AUTH_USERNAME_EDEFAULT == null ? basic_auth_username != null : !BASIC_AUTH_USERNAME_EDEFAULT.equals(basic_auth_username);
			case CepappPackage.SINK_HTTP__BASIC_AUTH_PASSWORD:
				return BASIC_AUTH_PASSWORD_EDEFAULT == null ? basic_auth_password != null : !BASIC_AUTH_PASSWORD_EDEFAULT.equals(basic_auth_password);
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
		if (baseClass == SinkElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Destination.class) {
			switch (derivedFeatureID) {
				case CepappPackage.SINK_HTTP__INBOUND_LINK: return CepappPackage.DESTINATION__INBOUND_LINK;
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
		if (baseClass == SinkElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Destination.class) {
			switch (baseFeatureID) {
				case CepappPackage.DESTINATION__INBOUND_LINK: return CepappPackage.SINK_HTTP__INBOUND_LINK;
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
		result.append(" (basic_auth_username: ");
		result.append(basic_auth_username);
		result.append(", basic_auth_password: ");
		result.append(basic_auth_password);
		result.append(')');
		return result.toString();
	}

} //SinkHttpImpl
