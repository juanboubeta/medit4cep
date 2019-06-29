/**
 */
package domain.impl;

import domain.CEPDomain;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.Event;
import domain.EventProperty;
import domain.PropertyTypeValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cepDomainEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventPropertyEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum propertyTypeValueEEnum = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private DomainPackageImpl()
  {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static DomainPackage init()
  {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomainPackageImpl theDomainPackage = registeredDomainPackage instanceof DomainPackageImpl ? (DomainPackageImpl)registeredDomainPackage : new DomainPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCEPDomain()
  {
		return cepDomainEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCEPDomain_DomainName()
  {
		return (EAttribute)cepDomainEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCEPDomain_DomainDescription()
  {
		return (EAttribute)cepDomainEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCEPDomain_DomainCreationDate()
  {
		return (EAttribute)cepDomainEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCEPDomain_Events()
  {
		return (EReference)cepDomainEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEvent()
  {
		return eventEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEvent_TypeName()
  {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEvent_ImagePath()
  {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEvent_EventProperties()
  {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEventProperty()
  {
		return eventPropertyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEventProperty_Name()
  {
		return (EAttribute)eventPropertyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEventProperty_Type()
  {
		return (EAttribute)eventPropertyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEventProperty_ImagePath()
  {
		return (EAttribute)eventPropertyEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEventProperty_ReferencedEvent()
  {
		return (EReference)eventPropertyEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEventProperty_EventProperties()
  {
		return (EReference)eventPropertyEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEventProperty_ReferencedEventProperty()
  {
		return (EReference)eventPropertyEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getPropertyTypeValue()
  {
		return propertyTypeValueEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DomainFactory getDomainFactory()
  {
		return (DomainFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cepDomainEClass = createEClass(CEP_DOMAIN);
		createEAttribute(cepDomainEClass, CEP_DOMAIN__DOMAIN_NAME);
		createEAttribute(cepDomainEClass, CEP_DOMAIN__DOMAIN_DESCRIPTION);
		createEAttribute(cepDomainEClass, CEP_DOMAIN__DOMAIN_CREATION_DATE);
		createEReference(cepDomainEClass, CEP_DOMAIN__EVENTS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__TYPE_NAME);
		createEAttribute(eventEClass, EVENT__IMAGE_PATH);
		createEReference(eventEClass, EVENT__EVENT_PROPERTIES);

		eventPropertyEClass = createEClass(EVENT_PROPERTY);
		createEAttribute(eventPropertyEClass, EVENT_PROPERTY__NAME);
		createEAttribute(eventPropertyEClass, EVENT_PROPERTY__TYPE);
		createEAttribute(eventPropertyEClass, EVENT_PROPERTY__IMAGE_PATH);
		createEReference(eventPropertyEClass, EVENT_PROPERTY__REFERENCED_EVENT);
		createEReference(eventPropertyEClass, EVENT_PROPERTY__EVENT_PROPERTIES);
		createEReference(eventPropertyEClass, EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY);

		// Create enums
		propertyTypeValueEEnum = createEEnum(PROPERTY_TYPE_VALUE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cepDomainEClass, CEPDomain.class, "CEPDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEPDomain_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, CEPDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEPDomain_DomainDescription(), ecorePackage.getEString(), "domainDescription", null, 0, 1, CEPDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEPDomain_DomainCreationDate(), ecorePackage.getEDate(), "domainCreationDate", null, 0, 1, CEPDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPDomain_Events(), this.getEvent(), null, "events", null, 0, -1, CEPDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_EventProperties(), this.getEventProperty(), this.getEventProperty_ReferencedEvent(), "eventProperties", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventPropertyEClass, EventProperty.class, "EventProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventProperty_Type(), this.getPropertyTypeValue(), "type", null, 0, 1, EventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventProperty_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, EventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventProperty_ReferencedEvent(), this.getEvent(), this.getEvent_EventProperties(), "referencedEvent", null, 0, 1, EventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventProperty_EventProperties(), this.getEventProperty(), this.getEventProperty_ReferencedEventProperty(), "eventProperties", null, 0, -1, EventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventProperty_ReferencedEventProperty(), this.getEventProperty(), this.getEventProperty_EventProperties(), "referencedEventProperty", null, 0, 1, EventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyTypeValueEEnum, PropertyTypeValue.class, "PropertyTypeValue");
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.UNKNOWN);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.BOOLEAN);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.INTEGER);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.LONG);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.DOUBLE);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.FLOAT);
		addEEnumLiteral(propertyTypeValueEEnum, PropertyTypeValue.STRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
	}

  /**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmfAnnotations()
  {
		String source = "gmf.diagram";
		addAnnotation
		  (cepDomainEClass,
		   source,
		   new String[] {
			   "model.extension", "domain",
			   "diagram.extension", "domain_diagram"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_1Annotations()
  {
		String source = "gmf.node";
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "typeName",
			   "border.color", "110,110,110",
			   "tool.name", "Event",
			   "tool.description", "Add an event",
			   "resizable", "false"
		   });
		addAnnotation
		  (eventPropertyEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "name",
			   "border.color", "110,110,110",
			   "tool.name", "Event Property",
			   "tool.description", "Add an event property",
			   "resizable", "false"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_2Annotations()
  {
		String source = "gmf.compartment";
		addAnnotation
		  (getEvent_EventProperties(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getEventProperty_EventProperties(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
	}

} //DomainPackageImpl
