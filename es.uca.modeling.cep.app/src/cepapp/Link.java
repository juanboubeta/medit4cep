/**
 */
package cepapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cepapp.Link#getOrder <em>Order</em>}</li>
 *   <li>{@link cepapp.Link#getOrigin <em>Origin</em>}</li>
 *   <li>{@link cepapp.Link#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see cepapp.CepappPackage#getLink()
 * @model annotation="gmf.link label='' source='origin' target='destination' source.constraint='self &lt;&gt; oppositeEnd\n\tand (\n\t\t(self.oclIsKindOf(SourceElement) and oppositeEnd.oclIsKindOf(SourceElement))\n\t\tor (self.oclIsKindOf(SinkElement) and oppositeEnd.oclIsKindOf(SinkElement))\n\t)' target.constraint='self &lt;&gt; oppositeEnd' source.decoration='none' target.decoration='arrow' color='110,110,110' tool.name='Link' tool.description='Add a link'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see cepapp.CepappPackage#getLink_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link cepapp.Link#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cepapp.Origin#getOutboundLink <em>Outbound Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Origin)
	 * @see cepapp.CepappPackage#getLink_Origin()
	 * @see cepapp.Origin#getOutboundLink
	 * @model opposite="outboundLink"
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link cepapp.Link#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cepapp.Destination#getInboundLink <em>Inbound Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Destination)
	 * @see cepapp.CepappPackage#getLink_Destination()
	 * @see cepapp.Destination#getInboundLink
	 * @model opposite="inboundLink"
	 * @generated
	 */
	Destination getDestination();

	/**
	 * Sets the value of the '{@link cepapp.Link#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Destination value);

} // Link
