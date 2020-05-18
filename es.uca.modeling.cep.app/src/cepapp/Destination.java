/**
 */
package cepapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.Destination#getInboundLink <em>Inbound Link</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getDestination()
 * @model abstract="true"
 * @generated
 */
public interface Destination extends EObject {
	/**
	 * Returns the value of the '<em><b>Inbound Link</b></em>' reference list.
	 * The list contents are of type {@link cepapp.Link}.
	 * It is bidirectional and its opposite is '{@link cepapp.Link#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Link</em>' reference list.
	 * @see cepapp.CepappPackage#getDestination_InboundLink()
	 * @see cepapp.Link#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<Link> getInboundLink();

} // Destination
