/**
 */
package eventpattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.DataWindow#getEventPatternConditions <em>Event Pattern Conditions</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getDataWindow()
 * @model abstract="true"
 * @generated
 */
public interface DataWindow extends EventPatternElement
{
  /**
	 * Returns the value of the '<em><b>Event Pattern Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.EventPatternCondition}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Pattern Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Pattern Conditions</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getDataWindow_EventPatternConditions()
	 * @model containment="true"
	 * @generated
	 */
  EList<EventPatternCondition> getEventPatternConditions();

} // DataWindow
