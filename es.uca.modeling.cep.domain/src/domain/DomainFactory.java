/**
 */
package domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  DomainFactory eINSTANCE = domain.impl.DomainFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>CEP Domain</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEP Domain</em>'.
	 * @generated
	 */
  CEPDomain createCEPDomain();

  /**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
  Event createEvent();

  /**
	 * Returns a new object of class '<em>Event Property</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Property</em>'.
	 * @generated
	 */
  EventProperty createEventProperty();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  DomainPackage getDomainPackage();

} //DomainFactory
