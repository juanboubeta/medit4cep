/**
 */
package domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "domain";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "www.uca.es/modeling/cep/domain";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "domain";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  DomainPackage eINSTANCE = domain.impl.DomainPackageImpl.init();

  /**
	 * The meta object id for the '{@link domain.impl.CEPDomainImpl <em>CEP Domain</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see domain.impl.CEPDomainImpl
	 * @see domain.impl.DomainPackageImpl#getCEPDomain()
	 * @generated
	 */
  int CEP_DOMAIN = 0;

  /**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_DOMAIN__DOMAIN_NAME = 0;

  /**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_DOMAIN__DOMAIN_DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Domain Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_DOMAIN__DOMAIN_CREATION_DATE = 2;

  /**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_DOMAIN__EVENTS = 3;

  /**
	 * The number of structural features of the '<em>CEP Domain</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_DOMAIN_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link domain.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see domain.impl.EventImpl
	 * @see domain.impl.DomainPackageImpl#getEvent()
	 * @generated
	 */
  int EVENT = 1;

  /**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__TYPE_NAME = 0;

  /**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__IMAGE_PATH = 1;

  /**
	 * The feature id for the '<em><b>Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__EVENT_PROPERTIES = 2;

  /**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link domain.impl.EventPropertyImpl <em>Event Property</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see domain.impl.EventPropertyImpl
	 * @see domain.impl.DomainPackageImpl#getEventProperty()
	 * @generated
	 */
  int EVENT_PROPERTY = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__NAME = 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__TYPE = 1;

  /**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__IMAGE_PATH = 2;

  /**
	 * The feature id for the '<em><b>Referenced Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__REFERENCED_EVENT = 3;

  /**
	 * The feature id for the '<em><b>Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__EVENT_PROPERTIES = 4;

  /**
	 * The feature id for the '<em><b>Referenced Event Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY = 5;

  /**
	 * The number of structural features of the '<em>Event Property</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link domain.PropertyTypeValue <em>Property Type Value</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see domain.PropertyTypeValue
	 * @see domain.impl.DomainPackageImpl#getPropertyTypeValue()
	 * @generated
	 */
  int PROPERTY_TYPE_VALUE = 3;


  /**
	 * Returns the meta object for class '{@link domain.CEPDomain <em>CEP Domain</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEP Domain</em>'.
	 * @see domain.CEPDomain
	 * @generated
	 */
  EClass getCEPDomain();

  /**
	 * Returns the meta object for the attribute '{@link domain.CEPDomain#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see domain.CEPDomain#getDomainName()
	 * @see #getCEPDomain()
	 * @generated
	 */
  EAttribute getCEPDomain_DomainName();

  /**
	 * Returns the meta object for the attribute '{@link domain.CEPDomain#getDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see domain.CEPDomain#getDomainDescription()
	 * @see #getCEPDomain()
	 * @generated
	 */
  EAttribute getCEPDomain_DomainDescription();

  /**
	 * Returns the meta object for the attribute '{@link domain.CEPDomain#getDomainCreationDate <em>Domain Creation Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Creation Date</em>'.
	 * @see domain.CEPDomain#getDomainCreationDate()
	 * @see #getCEPDomain()
	 * @generated
	 */
  EAttribute getCEPDomain_DomainCreationDate();

  /**
	 * Returns the meta object for the containment reference list '{@link domain.CEPDomain#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see domain.CEPDomain#getEvents()
	 * @see #getCEPDomain()
	 * @generated
	 */
  EReference getCEPDomain_Events();

  /**
	 * Returns the meta object for class '{@link domain.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see domain.Event
	 * @generated
	 */
  EClass getEvent();

  /**
	 * Returns the meta object for the attribute '{@link domain.Event#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see domain.Event#getTypeName()
	 * @see #getEvent()
	 * @generated
	 */
  EAttribute getEvent_TypeName();

  /**
	 * Returns the meta object for the attribute '{@link domain.Event#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see domain.Event#getImagePath()
	 * @see #getEvent()
	 * @generated
	 */
  EAttribute getEvent_ImagePath();

  /**
	 * Returns the meta object for the containment reference list '{@link domain.Event#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Properties</em>'.
	 * @see domain.Event#getEventProperties()
	 * @see #getEvent()
	 * @generated
	 */
  EReference getEvent_EventProperties();

  /**
	 * Returns the meta object for class '{@link domain.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Property</em>'.
	 * @see domain.EventProperty
	 * @generated
	 */
  EClass getEventProperty();

  /**
	 * Returns the meta object for the attribute '{@link domain.EventProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.EventProperty#getName()
	 * @see #getEventProperty()
	 * @generated
	 */
  EAttribute getEventProperty_Name();

  /**
	 * Returns the meta object for the attribute '{@link domain.EventProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see domain.EventProperty#getType()
	 * @see #getEventProperty()
	 * @generated
	 */
  EAttribute getEventProperty_Type();

  /**
	 * Returns the meta object for the attribute '{@link domain.EventProperty#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see domain.EventProperty#getImagePath()
	 * @see #getEventProperty()
	 * @generated
	 */
  EAttribute getEventProperty_ImagePath();

  /**
	 * Returns the meta object for the container reference '{@link domain.EventProperty#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Event</em>'.
	 * @see domain.EventProperty#getReferencedEvent()
	 * @see #getEventProperty()
	 * @generated
	 */
  EReference getEventProperty_ReferencedEvent();

  /**
	 * Returns the meta object for the containment reference list '{@link domain.EventProperty#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Properties</em>'.
	 * @see domain.EventProperty#getEventProperties()
	 * @see #getEventProperty()
	 * @generated
	 */
  EReference getEventProperty_EventProperties();

  /**
	 * Returns the meta object for the container reference '{@link domain.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Event Property</em>'.
	 * @see domain.EventProperty#getReferencedEventProperty()
	 * @see #getEventProperty()
	 * @generated
	 */
  EReference getEventProperty_ReferencedEventProperty();

  /**
	 * Returns the meta object for enum '{@link domain.PropertyTypeValue <em>Property Type Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type Value</em>'.
	 * @see domain.PropertyTypeValue
	 * @generated
	 */
  EEnum getPropertyTypeValue();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  DomainFactory getDomainFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link domain.impl.CEPDomainImpl <em>CEP Domain</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see domain.impl.CEPDomainImpl
		 * @see domain.impl.DomainPackageImpl#getCEPDomain()
		 * @generated
		 */
    EClass CEP_DOMAIN = eINSTANCE.getCEPDomain();

    /**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_DOMAIN__DOMAIN_NAME = eINSTANCE.getCEPDomain_DomainName();

    /**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_DOMAIN__DOMAIN_DESCRIPTION = eINSTANCE.getCEPDomain_DomainDescription();

    /**
		 * The meta object literal for the '<em><b>Domain Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_DOMAIN__DOMAIN_CREATION_DATE = eINSTANCE.getCEPDomain_DomainCreationDate();

    /**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CEP_DOMAIN__EVENTS = eINSTANCE.getCEPDomain_Events();

    /**
		 * The meta object literal for the '{@link domain.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see domain.impl.EventImpl
		 * @see domain.impl.DomainPackageImpl#getEvent()
		 * @generated
		 */
    EClass EVENT = eINSTANCE.getEvent();

    /**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENT__TYPE_NAME = eINSTANCE.getEvent_TypeName();

    /**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENT__IMAGE_PATH = eINSTANCE.getEvent_ImagePath();

    /**
		 * The meta object literal for the '<em><b>Event Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENT__EVENT_PROPERTIES = eINSTANCE.getEvent_EventProperties();

    /**
		 * The meta object literal for the '{@link domain.impl.EventPropertyImpl <em>Event Property</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see domain.impl.EventPropertyImpl
		 * @see domain.impl.DomainPackageImpl#getEventProperty()
		 * @generated
		 */
    EClass EVENT_PROPERTY = eINSTANCE.getEventProperty();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENT_PROPERTY__NAME = eINSTANCE.getEventProperty_Name();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENT_PROPERTY__TYPE = eINSTANCE.getEventProperty_Type();

    /**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EVENT_PROPERTY__IMAGE_PATH = eINSTANCE.getEventProperty_ImagePath();

    /**
		 * The meta object literal for the '<em><b>Referenced Event</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENT_PROPERTY__REFERENCED_EVENT = eINSTANCE.getEventProperty_ReferencedEvent();

    /**
		 * The meta object literal for the '<em><b>Event Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENT_PROPERTY__EVENT_PROPERTIES = eINSTANCE.getEventProperty_EventProperties();

    /**
		 * The meta object literal for the '<em><b>Referenced Event Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY = eINSTANCE.getEventProperty_ReferencedEventProperty();

    /**
		 * The meta object literal for the '{@link domain.PropertyTypeValue <em>Property Type Value</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see domain.PropertyTypeValue
		 * @see domain.impl.DomainPackageImpl#getPropertyTypeValue()
		 * @generated
		 */
    EEnum PROPERTY_TYPE_VALUE = eINSTANCE.getPropertyTypeValue();

  }

} //DomainPackage
