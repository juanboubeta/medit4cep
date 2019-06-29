/**
 */
package domain;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEP Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.CEPDomain#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link domain.CEPDomain#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link domain.CEPDomain#getDomainCreationDate <em>Domain Creation Date</em>}</li>
 *   <li>{@link domain.CEPDomain#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getCEPDomain()
 * @model annotation="gmf.diagram model.extension='domain' diagram.extension='domain_diagram'"
 * @generated
 */
public interface CEPDomain extends EObject
{
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
	 * @see domain.DomainPackage#getCEPDomain_DomainName()
	 * @model
	 * @generated
	 */
  String getDomainName();

  /**
	 * Sets the value of the '{@link domain.CEPDomain#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
  void setDomainName(String value);

  /**
	 * Returns the value of the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Description</em>' attribute.
	 * @see #setDomainDescription(String)
	 * @see domain.DomainPackage#getCEPDomain_DomainDescription()
	 * @model
	 * @generated
	 */
  String getDomainDescription();

  /**
	 * Sets the value of the '{@link domain.CEPDomain#getDomainDescription <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Description</em>' attribute.
	 * @see #getDomainDescription()
	 * @generated
	 */
  void setDomainDescription(String value);

  /**
	 * Returns the value of the '<em><b>Domain Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Creation Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Creation Date</em>' attribute.
	 * @see #setDomainCreationDate(Date)
	 * @see domain.DomainPackage#getCEPDomain_DomainCreationDate()
	 * @model
	 * @generated
	 */
  Date getDomainCreationDate();

  /**
	 * Sets the value of the '{@link domain.CEPDomain#getDomainCreationDate <em>Domain Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Creation Date</em>' attribute.
	 * @see #getDomainCreationDate()
	 * @generated
	 */
  void setDomainCreationDate(Date value);

  /**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Event}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see domain.DomainPackage#getCEPDomain_Events()
	 * @model containment="true"
	 * @generated
	 */
  EList<Event> getEvents();

} // CEPDomain
