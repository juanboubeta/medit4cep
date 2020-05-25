/**
 */
package cepapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.Origin#getOutboundLink <em>Outbound Link</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getOrigin()
 * @model abstract="true"
 * @generated
 */
public interface Origin extends EObject {
	/**
	 * Returns the value of the '<em><b>Outbound Link</b></em>' reference list.
	 * The list contents are of type {@link cepapp.Link}.
	 * It is bidirectional and its opposite is '{@link cepapp.Link#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Link</em>' reference list.
	 * @see cepapp.CepappPackage#getOrigin_OutboundLink()
	 * @see cepapp.Link#getOrigin
	 * @model opposite="origin"
	 * @generated
	 */
	EList<Link> getOutboundLink();

} // Origin
