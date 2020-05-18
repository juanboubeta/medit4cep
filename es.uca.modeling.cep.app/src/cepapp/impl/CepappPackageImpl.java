/**
 */
package cepapp.impl;

import cepapp.CEPApp;
import cepapp.CepappFactory;
import cepapp.CepappPackage;
import cepapp.ComplexEvent;
import cepapp.ComplexEventProperty;
import cepapp.Database;
import cepapp.Destination;
import cepapp.Email;
import cepapp.Event;
import cepapp.EventProperty;
import cepapp.File;
import cepapp.Http;
import cepapp.InMemory;
import cepapp.InMemoryInput;
import cepapp.InMemoryOutput;
import cepapp.InputFile;
import cepapp.Link;
import cepapp.Mappable;
import cepapp.MappingType;
import cepapp.MongoDB;
import cepapp.Origin;
import cepapp.OutputFile;
import cepapp.PropertyTypeValue;
import cepapp.SinkElement;
import cepapp.SinkEmail;
import cepapp.SinkHttp;
import cepapp.SinkMongoDB;
import cepapp.SinkMqtt;
import cepapp.SinkRDBMS;
import cepapp.SourceElement;
import cepapp.SourceEmail;
import cepapp.SourceHttp;
import cepapp.SourceMqtt;
import cepapp.Twitter;
import cepapp.twitter_mode;

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
public class CepappPackageImpl extends EPackageImpl implements CepappPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cepAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inMemoryInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEmailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceHttpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceMqttEClass = null;

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
	private EClass inMemoryOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEventPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEmailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkMongoDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkHttpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkMqttEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingTypeEEnum = null;

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
	 * @see cepapp.CepappPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CepappPackageImpl() {
		super(eNS_URI, CepappFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CepappPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CepappPackage init() {
		if (isInited) return (CepappPackage)EPackage.Registry.INSTANCE.getEPackage(CepappPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCepappPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CepappPackageImpl theCepappPackage = registeredCepappPackage instanceof CepappPackageImpl ? (CepappPackageImpl)registeredCepappPackage : new CepappPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCepappPackage.createPackageContents();

		// Initialize created meta-data
		theCepappPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCepappPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CepappPackage.eNS_URI, theCepappPackage);
		return theCepappPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEPApp() {
		return cepAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEPApp_Name() {
		return (EAttribute)cepAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEPApp_Description() {
		return (EAttribute)cepAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEPApp_CreationDate() {
		return (EAttribute)cepAppEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEPApp_DomainName() {
		return (EAttribute)cepAppEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEPApp_SourceElements() {
		return (EReference)cepAppEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEPApp_SinkElements() {
		return (EReference)cepAppEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEPApp_Links() {
		return (EReference)cepAppEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Order() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Origin() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Destination() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrigin() {
		return originEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrigin_OutboundLink() {
		return (EReference)originEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestination() {
		return destinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestination_InboundLink() {
		return (EReference)destinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElement() {
		return sourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkElement() {
		return sinkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappable() {
		return mappableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappable_MappingType() {
		return (EAttribute)mappableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInMemory() {
		return inMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInMemory_Topic() {
		return (EAttribute)inMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmail() {
		return emailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_Username() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_Password() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_Host() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttp() {
		return httpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttp_Url() {
		return (EAttribute)httpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Primary_key() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMongoDB() {
		return mongoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoDB_Uri() {
		return (EAttribute)mongoDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoDB_Index() {
		return (EAttribute)mongoDBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoDB_CollectionName() {
		return (EAttribute)mongoDBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMQTT() {
		return mqttEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_Url() {
		return (EAttribute)mqttEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_Topic() {
		return (EAttribute)mqttEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_Username() {
		return (EAttribute)mqttEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_Password() {
		return (EAttribute)mqttEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_Client_id() {
		return (EAttribute)mqttEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInMemoryInput() {
		return inMemoryInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceEmail() {
		return sourceEmailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceEmail_Port() {
		return (EAttribute)sourceEmailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceEmail_Folder() {
		return (EAttribute)sourceEmailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputFile() {
		return inputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputFile_Dir_uri() {
		return (EAttribute)inputFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputFile_File_uri() {
		return (EAttribute)inputFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceHttp() {
		return sourceHttpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceMqtt() {
		return sourceMqttEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_TypeName() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_ImagePath() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_EventProperties() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventProperty() {
		return eventPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventProperty_Name() {
		return (EAttribute)eventPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventProperty_Type() {
		return (EAttribute)eventPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventProperty_ImagePath() {
		return (EAttribute)eventPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventProperty_ReferencedEvent() {
		return (EReference)eventPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventProperty_EventProperties() {
		return (EReference)eventPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventProperty_ReferencedEventProperty() {
		return (EReference)eventPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInMemoryOutput() {
		return inMemoryOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexEvent() {
		return complexEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexEvent_TypeName() {
		return (EAttribute)complexEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexEvent_ImagePath() {
		return (EAttribute)complexEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEvent_ComplexEventProperties() {
		return (EReference)complexEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexEventProperty() {
		return complexEventPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexEventProperty_Name() {
		return (EAttribute)complexEventPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexEventProperty_ImagePath() {
		return (EAttribute)complexEventPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexEventProperty_Type() {
		return (EAttribute)complexEventPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEventProperty_ReferencedComplexEvent() {
		return (EReference)complexEventPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEventProperty_ComplexEventProperties() {
		return (EReference)complexEventPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEventProperty_ReferencedComplexEventProperty() {
		return (EReference)complexEventPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkEmail() {
		return sinkEmailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinkEmail_Address() {
		return (EAttribute)sinkEmailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinkEmail_To() {
		return (EAttribute)sinkEmailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinkEmail_Subject() {
		return (EAttribute)sinkEmailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputFile() {
		return outputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputFile_Path() {
		return (EAttribute)outputFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkMongoDB() {
		return sinkMongoDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkHttp() {
		return sinkHttpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinkHttp_Basic_auth_username() {
		return (EAttribute)sinkHttpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinkHttp_Basic_auth_password() {
		return (EAttribute)sinkHttpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkMqtt() {
		return sinkMqttEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMappingType() {
		return mappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyTypeValue() {
		return propertyTypeValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CepappFactory getCepappFactory() {
		return (CepappFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cepAppEClass = createEClass(CEP_APP);
		createEAttribute(cepAppEClass, CEP_APP__NAME);
		createEAttribute(cepAppEClass, CEP_APP__DESCRIPTION);
		createEAttribute(cepAppEClass, CEP_APP__CREATION_DATE);
		createEAttribute(cepAppEClass, CEP_APP__DOMAIN_NAME);
		createEReference(cepAppEClass, CEP_APP__SOURCE_ELEMENTS);
		createEReference(cepAppEClass, CEP_APP__SINK_ELEMENTS);
		createEReference(cepAppEClass, CEP_APP__LINKS);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__ORDER);
		createEReference(linkEClass, LINK__ORIGIN);
		createEReference(linkEClass, LINK__DESTINATION);

		originEClass = createEClass(ORIGIN);
		createEReference(originEClass, ORIGIN__OUTBOUND_LINK);

		destinationEClass = createEClass(DESTINATION);
		createEReference(destinationEClass, DESTINATION__INBOUND_LINK);

		sourceElementEClass = createEClass(SOURCE_ELEMENT);

		sinkElementEClass = createEClass(SINK_ELEMENT);

		mappableEClass = createEClass(MAPPABLE);
		createEAttribute(mappableEClass, MAPPABLE__MAPPING_TYPE);

		inMemoryEClass = createEClass(IN_MEMORY);
		createEAttribute(inMemoryEClass, IN_MEMORY__TOPIC);

		fileEClass = createEClass(FILE);

		emailEClass = createEClass(EMAIL);
		createEAttribute(emailEClass, EMAIL__USERNAME);
		createEAttribute(emailEClass, EMAIL__PASSWORD);
		createEAttribute(emailEClass, EMAIL__HOST);

		httpEClass = createEClass(HTTP);
		createEAttribute(httpEClass, HTTP__URL);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__PRIMARY_KEY);

		mongoDBEClass = createEClass(MONGO_DB);
		createEAttribute(mongoDBEClass, MONGO_DB__URI);
		createEAttribute(mongoDBEClass, MONGO_DB__INDEX);
		createEAttribute(mongoDBEClass, MONGO_DB__COLLECTION_NAME);

		mqttEClass = createEClass(MQTT);
		createEAttribute(mqttEClass, MQTT__URL);
		createEAttribute(mqttEClass, MQTT__TOPIC);
		createEAttribute(mqttEClass, MQTT__USERNAME);
		createEAttribute(mqttEClass, MQTT__PASSWORD);
		createEAttribute(mqttEClass, MQTT__CLIENT_ID);

		inMemoryInputEClass = createEClass(IN_MEMORY_INPUT);

		sourceEmailEClass = createEClass(SOURCE_EMAIL);
		createEAttribute(sourceEmailEClass, SOURCE_EMAIL__PORT);
		createEAttribute(sourceEmailEClass, SOURCE_EMAIL__FOLDER);

		inputFileEClass = createEClass(INPUT_FILE);
		createEAttribute(inputFileEClass, INPUT_FILE__DIR_URI);
		createEAttribute(inputFileEClass, INPUT_FILE__FILE_URI);

		sourceHttpEClass = createEClass(SOURCE_HTTP);

		sourceMqttEClass = createEClass(SOURCE_MQTT);

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

		inMemoryOutputEClass = createEClass(IN_MEMORY_OUTPUT);

		complexEventEClass = createEClass(COMPLEX_EVENT);
		createEAttribute(complexEventEClass, COMPLEX_EVENT__TYPE_NAME);
		createEAttribute(complexEventEClass, COMPLEX_EVENT__IMAGE_PATH);
		createEReference(complexEventEClass, COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES);

		complexEventPropertyEClass = createEClass(COMPLEX_EVENT_PROPERTY);
		createEAttribute(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__NAME);
		createEAttribute(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__IMAGE_PATH);
		createEAttribute(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__TYPE);
		createEReference(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT);
		createEReference(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES);
		createEReference(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY);

		sinkEmailEClass = createEClass(SINK_EMAIL);
		createEAttribute(sinkEmailEClass, SINK_EMAIL__ADDRESS);
		createEAttribute(sinkEmailEClass, SINK_EMAIL__TO);
		createEAttribute(sinkEmailEClass, SINK_EMAIL__SUBJECT);

		outputFileEClass = createEClass(OUTPUT_FILE);
		createEAttribute(outputFileEClass, OUTPUT_FILE__PATH);

		sinkMongoDBEClass = createEClass(SINK_MONGO_DB);

		sinkHttpEClass = createEClass(SINK_HTTP);
		createEAttribute(sinkHttpEClass, SINK_HTTP__BASIC_AUTH_USERNAME);
		createEAttribute(sinkHttpEClass, SINK_HTTP__BASIC_AUTH_PASSWORD);

		sinkMqttEClass = createEClass(SINK_MQTT);

		// Create enums
		mappingTypeEEnum = createEEnum(MAPPING_TYPE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inMemoryEClass.getESuperTypes().add(this.getMappable());
		fileEClass.getESuperTypes().add(this.getMappable());
		emailEClass.getESuperTypes().add(this.getMappable());
		httpEClass.getESuperTypes().add(this.getMappable());
		databaseEClass.getESuperTypes().add(this.getMappable());
		mongoDBEClass.getESuperTypes().add(this.getDatabase());
		mqttEClass.getESuperTypes().add(this.getMappable());
		inMemoryInputEClass.getESuperTypes().add(this.getInMemory());
		inMemoryInputEClass.getESuperTypes().add(this.getSourceElement());
		inMemoryInputEClass.getESuperTypes().add(this.getOrigin());
		sourceEmailEClass.getESuperTypes().add(this.getEmail());
		sourceEmailEClass.getESuperTypes().add(this.getSourceElement());
		sourceEmailEClass.getESuperTypes().add(this.getOrigin());
		inputFileEClass.getESuperTypes().add(this.getFile());
		inputFileEClass.getESuperTypes().add(this.getSourceElement());
		inputFileEClass.getESuperTypes().add(this.getOrigin());
		sourceHttpEClass.getESuperTypes().add(this.getHttp());
		sourceHttpEClass.getESuperTypes().add(this.getSourceElement());
		sourceHttpEClass.getESuperTypes().add(this.getOrigin());
		sourceMqttEClass.getESuperTypes().add(this.getMQTT());
		sourceMqttEClass.getESuperTypes().add(this.getSourceElement());
		sourceMqttEClass.getESuperTypes().add(this.getOrigin());
		eventEClass.getESuperTypes().add(this.getSourceElement());
		eventEClass.getESuperTypes().add(this.getDestination());
		inMemoryOutputEClass.getESuperTypes().add(this.getInMemory());
		inMemoryOutputEClass.getESuperTypes().add(this.getSinkElement());
		inMemoryOutputEClass.getESuperTypes().add(this.getDestination());
		complexEventEClass.getESuperTypes().add(this.getSinkElement());
		complexEventEClass.getESuperTypes().add(this.getOrigin());
		sinkEmailEClass.getESuperTypes().add(this.getEmail());
		sinkEmailEClass.getESuperTypes().add(this.getSinkElement());
		sinkEmailEClass.getESuperTypes().add(this.getDestination());
		outputFileEClass.getESuperTypes().add(this.getFile());
		outputFileEClass.getESuperTypes().add(this.getSinkElement());
		outputFileEClass.getESuperTypes().add(this.getDestination());
		sinkMongoDBEClass.getESuperTypes().add(this.getMongoDB());
		sinkMongoDBEClass.getESuperTypes().add(this.getSinkElement());
		sinkMongoDBEClass.getESuperTypes().add(this.getDestination());
		sinkHttpEClass.getESuperTypes().add(this.getHttp());
		sinkHttpEClass.getESuperTypes().add(this.getSinkElement());
		sinkHttpEClass.getESuperTypes().add(this.getDestination());
		sinkMqttEClass.getESuperTypes().add(this.getMQTT());
		sinkMqttEClass.getESuperTypes().add(this.getSinkElement());
		sinkMqttEClass.getESuperTypes().add(this.getDestination());

		// Initialize classes and features; add operations and parameters
		initEClass(cepAppEClass, CEPApp.class, "CEPApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEPApp_Name(), ecorePackage.getEString(), "name", null, 0, 1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEPApp_Description(), ecorePackage.getEString(), "description", null, 0, 1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEPApp_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEPApp_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPApp_SourceElements(), this.getSourceElement(), null, "sourceElements", null, 0, -1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPApp_SinkElements(), this.getSinkElement(), null, "sinkElements", null, 0, -1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPApp_Links(), this.getLink(), null, "links", null, 0, -1, CEPApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Origin(), this.getOrigin(), this.getOrigin_OutboundLink(), "origin", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Destination(), this.getDestination(), this.getDestination_InboundLink(), "destination", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(originEClass, Origin.class, "Origin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrigin_OutboundLink(), this.getLink(), this.getLink_Origin(), "outboundLink", null, 0, -1, Origin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destinationEClass, Destination.class, "Destination", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestination_InboundLink(), this.getLink(), this.getLink_Destination(), "inboundLink", null, 0, -1, Destination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceElementEClass, SourceElement.class, "SourceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkElementEClass, SinkElement.class, "SinkElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappableEClass, Mappable.class, "Mappable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappable_MappingType(), this.getMappingType(), "mappingType", null, 0, 1, Mappable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inMemoryEClass, InMemory.class, "InMemory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInMemory_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, InMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emailEClass, Email.class, "Email", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmail_Username(), ecorePackage.getEString(), "username", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmail_Password(), ecorePackage.getEString(), "password", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmail_Host(), ecorePackage.getEString(), "host", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpEClass, Http.class, "Http", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttp_Url(), ecorePackage.getEString(), "url", null, 0, 1, Http.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Primary_key(), ecorePackage.getEString(), "primary_key", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mongoDBEClass, MongoDB.class, "MongoDB", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMongoDB_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, MongoDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDB_Index(), ecorePackage.getEString(), "index", null, 0, 1, MongoDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoDB_CollectionName(), ecorePackage.getEString(), "collectionName", null, 0, 1, MongoDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mqttEClass, cepapp.MQTT.class, "MQTT", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMQTT_Url(), ecorePackage.getEString(), "url", null, 0, 1, cepapp.MQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMQTT_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, cepapp.MQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMQTT_Username(), ecorePackage.getEString(), "username", null, 0, 1, cepapp.MQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMQTT_Password(), ecorePackage.getEString(), "password", null, 0, 1, cepapp.MQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMQTT_Client_id(), ecorePackage.getEString(), "client_id", null, 0, 1, cepapp.MQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inMemoryInputEClass, InMemoryInput.class, "InMemoryInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEmailEClass, SourceEmail.class, "SourceEmail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceEmail_Port(), ecorePackage.getEInt(), "port", "993", 0, 1, SourceEmail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceEmail_Folder(), ecorePackage.getEString(), "folder", null, 0, 1, SourceEmail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputFileEClass, InputFile.class, "InputFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputFile_Dir_uri(), ecorePackage.getEString(), "dir_uri", null, 0, 1, InputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputFile_File_uri(), ecorePackage.getEString(), "file_uri", null, 0, 1, InputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceHttpEClass, SourceHttp.class, "SourceHttp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceMqttEClass, SourceMqtt.class, "SourceMqtt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(inMemoryOutputEClass, InMemoryOutput.class, "InMemoryOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexEventEClass, ComplexEvent.class, "ComplexEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexEvent_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ComplexEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexEvent_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ComplexEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexEvent_ComplexEventProperties(), this.getComplexEventProperty(), this.getComplexEventProperty_ReferencedComplexEvent(), "complexEventProperties", null, 0, -1, ComplexEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEventPropertyEClass, ComplexEventProperty.class, "ComplexEventProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexEventProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexEventProperty_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexEventProperty_Type(), this.getPropertyTypeValue(), "type", null, 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexEventProperty_ReferencedComplexEvent(), this.getComplexEvent(), this.getComplexEvent_ComplexEventProperties(), "referencedComplexEvent", null, 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexEventProperty_ComplexEventProperties(), this.getComplexEventProperty(), this.getComplexEventProperty_ReferencedComplexEventProperty(), "complexEventProperties", null, 0, -1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexEventProperty_ReferencedComplexEventProperty(), this.getComplexEventProperty(), this.getComplexEventProperty_ComplexEventProperties(), "referencedComplexEventProperty", null, 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinkEmailEClass, SinkEmail.class, "SinkEmail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSinkEmail_Address(), ecorePackage.getEString(), "address", null, 0, 1, SinkEmail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSinkEmail_To(), ecorePackage.getEString(), "to", null, 0, 1, SinkEmail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSinkEmail_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, SinkEmail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputFileEClass, OutputFile.class, "OutputFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, OutputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinkMongoDBEClass, SinkMongoDB.class, "SinkMongoDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkHttpEClass, SinkHttp.class, "SinkHttp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSinkHttp_Basic_auth_username(), ecorePackage.getEString(), "basic_auth_username", null, 0, 1, SinkHttp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSinkHttp_Basic_auth_password(), ecorePackage.getEString(), "basic_auth_password", null, 0, 1, SinkHttp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinkMqttEClass, SinkMqtt.class, "SinkMqtt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(mappingTypeEEnum, MappingType.class, "MappingType");
		addEEnumLiteral(mappingTypeEEnum, MappingType.PASS_THROUGH);
		addEEnumLiteral(mappingTypeEEnum, MappingType.JSON);
		addEEnumLiteral(mappingTypeEEnum, MappingType.XML);

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
		// gmf.link
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (cepAppEClass,
		   source,
		   new String[] {
			   "model.extension", "cepapp",
			   "diagram.extension", "cepapp_diagram"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "label", "",
			   "source", "origin",
			   "target", "destination",
			   "source.constraint", "self <> oppositeEnd\n\tand (\n\t\t(self.oclIsKindOf(SourceElement) and oppositeEnd.oclIsKindOf(SourceElement))\n\t\tor (self.oclIsKindOf(SinkElement) and oppositeEnd.oclIsKindOf(SinkElement))\n\t)",
			   "target.constraint", "self <> oppositeEnd",
			   "source.decoration", "none",
			   "target.decoration", "arrow",
			   "color", "110,110,110",
			   "tool.name", "Link",
			   "tool.description", "Add a link"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (inMemoryInputEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "In Memory Source",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/InMemoryInput.svg"
		   });
		addAnnotation
		  (sourceEmailEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Source Email",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/SourceEmail.svg"
		   });
		addAnnotation
		  (inputFileEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Input File",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/InputFile.svg"
		   });
		addAnnotation
		  (sourceHttpEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Source HTTP",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/SourceHttp.svg"
		   });
		addAnnotation
		  (sourceMqttEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Source MQTT",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/SourceMqtt.svg"
		   });
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
		addAnnotation
		  (inMemoryOutputEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "In Memory Sink",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/InMemoryOutput.svg"
		   });
		addAnnotation
		  (complexEventEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "typeName",
			   "border.color", "110,110,110",
			   "label.readOnly", "true",
			   "tool.name", "New Complex Event",
			   "tool.description", "Add a new complex event"
		   });
		addAnnotation
		  (complexEventPropertyEClass,
		   source,
		   new String[] {
			   "figure", "rectangle",
			   "label", "name",
			   "border.color", "110,110,110",
			   "tool.name", "New Complex Event Property",
			   "tool.description", "Add a new complex event property"
		   });
		addAnnotation
		  (sinkEmailEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Sink Email",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/SinkEmail.svg"
		   });
		addAnnotation
		  (outputFileEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Output File",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/OutputFile.svg"
		   });
		addAnnotation
		  (sinkMongoDBEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Sink MongoDB",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/MongoDB.svg"
		   });
		addAnnotation
		  (sinkHttpEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Sink HTTP",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/SinkHttp.svg"
		   });
		addAnnotation
		  (sinkMqttEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "label.placement", "none",
			   "tool.name", "Sink MQTT",
			   "svg.uri", "platform:/plugin/es.uca.modeling.cep.app.figures/svg/SinkMqtt.svg"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
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
		addAnnotation
		  (getComplexEvent_ComplexEventProperties(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getComplexEventProperty_ComplexEventProperties(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
	}

} //CepappPackageImpl
