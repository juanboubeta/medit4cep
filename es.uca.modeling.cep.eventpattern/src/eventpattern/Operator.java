/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Operator#getInboundLink <em>Inbound Link</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject
{
  /**
	 * Returns the value of the '<em><b>Inbound Link</b></em>' reference list.
	 * The list contents are of type {@link eventpattern.Link}.
	 * It is bidirectional and its opposite is '{@link eventpattern.Link#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inbound Link</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Link</em>' reference list.
	 * @see eventpattern.EventpatternPackage#getOperator_InboundLink()
	 * @see eventpattern.Link#getOperator
	 * @model opposite="operator"
	 * @generated
	 */
  EList<Link> getInboundLink();

} // Operator
