/**
 */
package cepapp.impl;

import cepapp.CepappPackage;
import cepapp.Destination;
import cepapp.Link;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cepapp.impl.DestinationImpl#getInboundLink <em>Inbound Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DestinationImpl extends EObjectImpl implements Destination {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CepappPackage.Literals.DESTINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getInboundLink() {
		if (inboundLink == null) {
			inboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CepappPackage.DESTINATION__INBOUND_LINK, CepappPackage.LINK__DESTINATION);
		}
		return inboundLink;
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
			case CepappPackage.DESTINATION__INBOUND_LINK:
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
			case CepappPackage.DESTINATION__INBOUND_LINK:
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
			case CepappPackage.DESTINATION__INBOUND_LINK:
				return getInboundLink();
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
			case CepappPackage.DESTINATION__INBOUND_LINK:
				getInboundLink().clear();
				getInboundLink().addAll((Collection<? extends Link>)newValue);
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
			case CepappPackage.DESTINATION__INBOUND_LINK:
				getInboundLink().clear();
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
			case CepappPackage.DESTINATION__INBOUND_LINK:
				return inboundLink != null && !inboundLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DestinationImpl
