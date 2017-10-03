/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Operand#getOutboundLink <em>Outbound Link</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getOperand()
 * @model abstract="true"
 * @generated
 */
public interface Operand extends EObject
{
  /**
	 * Returns the value of the '<em><b>Outbound Link</b></em>' reference list.
	 * The list contents are of type {@link eventpattern.Link}.
	 * It is bidirectional and its opposite is '{@link eventpattern.Link#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outbound Link</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Link</em>' reference list.
	 * @see eventpattern.EventpatternPackage#getOperand_OutboundLink()
	 * @see eventpattern.Link#getOperand
	 * @model opposite="operand"
	 * @generated
	 */
  EList<Link> getOutboundLink();

} // Operand
