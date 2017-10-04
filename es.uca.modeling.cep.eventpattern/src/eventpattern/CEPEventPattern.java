/**
 */
package eventpattern;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEP Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.CEPEventPattern#getPatternName <em>Pattern Name</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getPatternDescription <em>Pattern Description</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getPatternPriority <em>Pattern Priority</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getPatternCreationDate <em>Pattern Creation Date</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#isPatternDeployed <em>Pattern Deployed</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getLinks <em>Links</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getEventPatternElements <em>Event Pattern Elements</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getComplexEvent <em>Complex Event</em>}</li>
 *   <li>{@link eventpattern.CEPEventPattern#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getCEPEventPattern()
 * @model annotation="gmf.diagram model.extension='pattern' diagram.extension='pattern_diagram'"
 * @generated
 */
public interface CEPEventPattern extends EObject
{
  /**
	 * Returns the value of the '<em><b>Pattern Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Name</em>' attribute.
	 * @see #setPatternName(String)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_PatternName()
	 * @model
	 * @generated
	 */
  String getPatternName();

  /**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#getPatternName <em>Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Name</em>' attribute.
	 * @see #getPatternName()
	 * @generated
	 */
  void setPatternName(String value);

  /**
	 * Returns the value of the '<em><b>Pattern Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Description</em>' attribute.
	 * @see #setPatternDescription(String)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_PatternDescription()
	 * @model
	 * @generated
	 */
  String getPatternDescription();

  /**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#getPatternDescription <em>Pattern Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Description</em>' attribute.
	 * @see #getPatternDescription()
	 * @generated
	 */
  void setPatternDescription(String value);

  /**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_DomainName()
	 * @model
	 * @generated
	 */
  String getDomainName();

  /**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
  void setDomainName(String value);

  /**
	 * Returns the value of the '<em><b>Pattern Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Priority</em>' attribute.
	 * @see #setPatternPriority(Integer)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_PatternPriority()
	 * @model default="0"
	 * @generated
	 */
	Integer getPatternPriority();

		/**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#getPatternPriority <em>Pattern Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Priority</em>' attribute.
	 * @see #getPatternPriority()
	 * @generated
	 */
	void setPatternPriority(Integer value);

		/**
	 * Returns the value of the '<em><b>Pattern Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Creation Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Creation Date</em>' attribute.
	 * @see #setPatternCreationDate(Date)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_PatternCreationDate()
	 * @model
	 * @generated
	 */
  Date getPatternCreationDate();

  /**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#getPatternCreationDate <em>Pattern Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Creation Date</em>' attribute.
	 * @see #getPatternCreationDate()
	 * @generated
	 */
  void setPatternCreationDate(Date value);

  /**
	 * Returns the value of the '<em><b>Pattern Deployed</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Deployed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Deployed</em>' attribute.
	 * @see #setPatternDeployed(boolean)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_PatternDeployed()
	 * @model
	 * @generated
	 */
  boolean isPatternDeployed();

  /**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#isPatternDeployed <em>Pattern Deployed</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Deployed</em>' attribute.
	 * @see #isPatternDeployed()
	 * @generated
	 */
  void setPatternDeployed(boolean value);

  /**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.Link}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_Links()
	 * @model containment="true"
	 * @generated
	 */
  EList<Link> getLinks();

  /**
	 * Returns the value of the '<em><b>Event Pattern Elements</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.EventPatternElement}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Pattern Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Pattern Elements</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_EventPatternElements()
	 * @model containment="true"
	 * @generated
	 */
  EList<EventPatternElement> getEventPatternElements();

  /**
	 * Returns the value of the '<em><b>Complex Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Event</em>' containment reference.
	 * @see #setComplexEvent(ComplexEvent)
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_ComplexEvent()
	 * @model containment="true"
	 * @generated
	 */
  ComplexEvent getComplexEvent();

  /**
	 * Sets the value of the '{@link eventpattern.CEPEventPattern#getComplexEvent <em>Complex Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Event</em>' containment reference.
	 * @see #getComplexEvent()
	 * @generated
	 */
  void setComplexEvent(ComplexEvent value);

  /**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link eventpattern.Action}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see eventpattern.EventpatternPackage#getCEPEventPattern_Actions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Action> getActions();

} // CEPEventPattern
