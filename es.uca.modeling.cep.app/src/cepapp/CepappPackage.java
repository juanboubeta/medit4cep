/**
 */
package cepapp;

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
 * @see cepapp.CepappFactory
 * @model kind="package"
 * @generated
 */
public interface CepappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cepapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.uca.es/modeling/cep/cepapp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cepapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CepappPackage eINSTANCE = cepapp.impl.CepappPackageImpl.init();

	/**
	 * The meta object id for the '{@link cepapp.impl.CEPAppImpl <em>CEP App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.CEPAppImpl
	 * @see cepapp.impl.CepappPackageImpl#getCEPApp()
	 * @generated
	 */
	int CEP_APP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__DOMAIN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__SOURCE_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Sink Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__SINK_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP__LINKS = 6;

	/**
	 * The number of structural features of the '<em>CEP App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_APP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link cepapp.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.LinkImpl
	 * @see cepapp.impl.CepappPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DESTINATION = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cepapp.impl.OriginImpl <em>Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.OriginImpl
	 * @see cepapp.impl.CepappPackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 2;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__OUTBOUND_LINK = 0;

	/**
	 * The number of structural features of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.DestinationImpl <em>Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.DestinationImpl
	 * @see cepapp.impl.CepappPackageImpl#getDestination()
	 * @generated
	 */
	int DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION__INBOUND_LINK = 0;

	/**
	 * The number of structural features of the '<em>Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SourceElementImpl
	 * @see cepapp.impl.CepappPackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cepapp.impl.SinkElementImpl <em>Sink Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SinkElementImpl
	 * @see cepapp.impl.CepappPackageImpl#getSinkElement()
	 * @generated
	 */
	int SINK_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Sink Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cepapp.impl.MappableImpl <em>Mappable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.MappableImpl
	 * @see cepapp.impl.CepappPackageImpl#getMappable()
	 * @generated
	 */
	int MAPPABLE = 6;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE__MAPPING_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Mappable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.InMemoryImpl <em>In Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.InMemoryImpl
	 * @see cepapp.impl.CepappPackageImpl#getInMemory()
	 * @generated
	 */
	int IN_MEMORY = 7;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY__MAPPING_TYPE = MAPPABLE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY__TOPIC = MAPPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_FEATURE_COUNT = MAPPABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.FileImpl
	 * @see cepapp.impl.CepappPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 8;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MAPPING_TYPE = MAPPABLE__MAPPING_TYPE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = MAPPABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cepapp.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.EmailImpl
	 * @see cepapp.impl.CepappPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__MAPPING_TYPE = MAPPABLE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__USERNAME = MAPPABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__PASSWORD = MAPPABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__HOST = MAPPABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = MAPPABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cepapp.impl.HttpImpl <em>Http</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.HttpImpl
	 * @see cepapp.impl.CepappPackageImpl#getHttp()
	 * @generated
	 */
	int HTTP = 10;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__MAPPING_TYPE = MAPPABLE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__URL = MAPPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_FEATURE_COUNT = MAPPABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.DatabaseImpl
	 * @see cepapp.impl.CepappPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 11;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__MAPPING_TYPE = MAPPABLE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Primary key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PRIMARY_KEY = MAPPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = MAPPABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.MongoDBImpl <em>Mongo DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.MongoDBImpl
	 * @see cepapp.impl.CepappPackageImpl#getMongoDB()
	 * @generated
	 */
	int MONGO_DB = 12;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__MAPPING_TYPE = DATABASE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Primary key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__PRIMARY_KEY = DATABASE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__URI = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__INDEX = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__COLLECTION_NAME = DATABASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mongo DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cepapp.impl.MQTTImpl <em>MQTT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.MQTTImpl
	 * @see cepapp.impl.CepappPackageImpl#getMQTT()
	 * @generated
	 */
	int MQTT = 13;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__MAPPING_TYPE = MAPPABLE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__URL = MAPPABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__TOPIC = MAPPABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__USERNAME = MAPPABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__PASSWORD = MAPPABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__CLIENT_ID = MAPPABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_FEATURE_COUNT = MAPPABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link cepapp.impl.InMemoryInputImpl <em>In Memory Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.InMemoryInputImpl
	 * @see cepapp.impl.CepappPackageImpl#getInMemoryInput()
	 * @generated
	 */
	int IN_MEMORY_INPUT = 14;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_INPUT__MAPPING_TYPE = IN_MEMORY__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_INPUT__TOPIC = IN_MEMORY__TOPIC;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_INPUT__OUTBOUND_LINK = IN_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Memory Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_INPUT_FEATURE_COUNT = IN_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.SourceEmailImpl <em>Source Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SourceEmailImpl
	 * @see cepapp.impl.CepappPackageImpl#getSourceEmail()
	 * @generated
	 */
	int SOURCE_EMAIL = 15;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__MAPPING_TYPE = EMAIL__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__USERNAME = EMAIL__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__PASSWORD = EMAIL__PASSWORD;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__HOST = EMAIL__HOST;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__OUTBOUND_LINK = EMAIL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__PORT = EMAIL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL__FOLDER = EMAIL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EMAIL_FEATURE_COUNT = EMAIL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cepapp.impl.InputFileImpl <em>Input File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.InputFileImpl
	 * @see cepapp.impl.CepappPackageImpl#getInputFile()
	 * @generated
	 */
	int INPUT_FILE = 16;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__MAPPING_TYPE = FILE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__OUTBOUND_LINK = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dir uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__DIR_URI = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__FILE_URI = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cepapp.impl.SourceHttpImpl <em>Source Http</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SourceHttpImpl
	 * @see cepapp.impl.CepappPackageImpl#getSourceHttp()
	 * @generated
	 */
	int SOURCE_HTTP = 17;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_HTTP__MAPPING_TYPE = HTTP__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_HTTP__URL = HTTP__URL;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_HTTP__OUTBOUND_LINK = HTTP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_HTTP_FEATURE_COUNT = HTTP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.SourceMqttImpl <em>Source Mqtt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SourceMqttImpl
	 * @see cepapp.impl.CepappPackageImpl#getSourceMqtt()
	 * @generated
	 */
	int SOURCE_MQTT = 18;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__MAPPING_TYPE = MQTT__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__URL = MQTT__URL;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__TOPIC = MQTT__TOPIC;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__USERNAME = MQTT__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__PASSWORD = MQTT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Client id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__CLIENT_ID = MQTT__CLIENT_ID;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT__OUTBOUND_LINK = MQTT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Mqtt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MQTT_FEATURE_COUNT = MQTT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.EventImpl
	 * @see cepapp.impl.CepappPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 19;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INBOUND_LINK = SOURCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE_NAME = SOURCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IMAGE_PATH = SOURCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_PROPERTIES = SOURCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = SOURCE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link cepapp.impl.EventPropertyImpl <em>Event Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.EventPropertyImpl
	 * @see cepapp.impl.CepappPackageImpl#getEventProperty()
	 * @generated
	 */
	int EVENT_PROPERTY = 20;

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
	 * The meta object id for the '{@link cepapp.impl.InMemoryOutputImpl <em>In Memory Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.InMemoryOutputImpl
	 * @see cepapp.impl.CepappPackageImpl#getInMemoryOutput()
	 * @generated
	 */
	int IN_MEMORY_OUTPUT = 21;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_OUTPUT__MAPPING_TYPE = IN_MEMORY__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_OUTPUT__TOPIC = IN_MEMORY__TOPIC;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_OUTPUT__INBOUND_LINK = IN_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Memory Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MEMORY_OUTPUT_FEATURE_COUNT = IN_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.ComplexEventImpl <em>Complex Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.ComplexEventImpl
	 * @see cepapp.impl.CepappPackageImpl#getComplexEvent()
	 * @generated
	 */
	int COMPLEX_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT__OUTBOUND_LINK = SINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT__TYPE_NAME = SINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT__IMAGE_PATH = SINK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Complex Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES = SINK_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Complex Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_FEATURE_COUNT = SINK_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link cepapp.impl.ComplexEventPropertyImpl <em>Complex Event Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.ComplexEventPropertyImpl
	 * @see cepapp.impl.CepappPackageImpl#getComplexEventProperty()
	 * @generated
	 */
	int COMPLEX_EVENT_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY__IMAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Referenced Complex Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Complex Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Referenced Complex Event Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Complex Event Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVENT_PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link cepapp.impl.SinkEmailImpl <em>Sink Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SinkEmailImpl
	 * @see cepapp.impl.CepappPackageImpl#getSinkEmail()
	 * @generated
	 */
	int SINK_EMAIL = 24;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__MAPPING_TYPE = EMAIL__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__USERNAME = EMAIL__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__PASSWORD = EMAIL__PASSWORD;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__HOST = EMAIL__HOST;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__INBOUND_LINK = EMAIL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__ADDRESS = EMAIL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__TO = EMAIL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL__SUBJECT = EMAIL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sink Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_EMAIL_FEATURE_COUNT = EMAIL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link cepapp.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.OutputFileImpl
	 * @see cepapp.impl.CepappPackageImpl#getOutputFile()
	 * @generated
	 */
	int OUTPUT_FILE = 25;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__MAPPING_TYPE = FILE__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__INBOUND_LINK = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__PATH = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cepapp.impl.SinkMongoDBImpl <em>Sink Mongo DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SinkMongoDBImpl
	 * @see cepapp.impl.CepappPackageImpl#getSinkMongoDB()
	 * @generated
	 */
	int SINK_MONGO_DB = 26;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB__MAPPING_TYPE = MONGO_DB__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Primary key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB__PRIMARY_KEY = MONGO_DB__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB__URI = MONGO_DB__URI;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB__INDEX = MONGO_DB__INDEX;

	/**
	 * The feature id for the '<em><b>Collection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB__COLLECTION_NAME = MONGO_DB__COLLECTION_NAME;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB__INBOUND_LINK = MONGO_DB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sink Mongo DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MONGO_DB_FEATURE_COUNT = MONGO_DB_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.impl.SinkHttpImpl <em>Sink Http</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SinkHttpImpl
	 * @see cepapp.impl.CepappPackageImpl#getSinkHttp()
	 * @generated
	 */
	int SINK_HTTP = 27;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_HTTP__MAPPING_TYPE = HTTP__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_HTTP__URL = HTTP__URL;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_HTTP__INBOUND_LINK = HTTP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic auth username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_HTTP__BASIC_AUTH_USERNAME = HTTP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basic auth password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_HTTP__BASIC_AUTH_PASSWORD = HTTP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sink Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_HTTP_FEATURE_COUNT = HTTP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cepapp.impl.SinkMqttImpl <em>Sink Mqtt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SinkMqttImpl
	 * @see cepapp.impl.CepappPackageImpl#getSinkMqtt()
	 * @generated
	 */
	int SINK_MQTT = 28;

	/**
	 * The feature id for the '<em><b>Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__MAPPING_TYPE = MQTT__MAPPING_TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__URL = MQTT__URL;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__TOPIC = MQTT__TOPIC;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__USERNAME = MQTT__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__PASSWORD = MQTT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Client id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__CLIENT_ID = MQTT__CLIENT_ID;

	/**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT__INBOUND_LINK = MQTT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sink Mqtt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_MQTT_FEATURE_COUNT = MQTT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cepapp.MappingType <em>Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.MappingType
	 * @see cepapp.impl.CepappPackageImpl#getMappingType()
	 * @generated
	 */
	int MAPPING_TYPE = 29;

	/**
	 * The meta object id for the '{@link cepapp.PropertyTypeValue <em>Property Type Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.PropertyTypeValue
	 * @see cepapp.impl.CepappPackageImpl#getPropertyTypeValue()
	 * @generated
	 */
	int PROPERTY_TYPE_VALUE = 30;


	/**
	 * Returns the meta object for class '{@link cepapp.CEPApp <em>CEP App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEP App</em>'.
	 * @see cepapp.CEPApp
	 * @generated
	 */
	EClass getCEPApp();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.CEPApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cepapp.CEPApp#getName()
	 * @see #getCEPApp()
	 * @generated
	 */
	EAttribute getCEPApp_Name();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.CEPApp#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cepapp.CEPApp#getDescription()
	 * @see #getCEPApp()
	 * @generated
	 */
	EAttribute getCEPApp_Description();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.CEPApp#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see cepapp.CEPApp#getCreationDate()
	 * @see #getCEPApp()
	 * @generated
	 */
	EAttribute getCEPApp_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.CEPApp#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see cepapp.CEPApp#getDomainName()
	 * @see #getCEPApp()
	 * @generated
	 */
	EAttribute getCEPApp_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.CEPApp#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Elements</em>'.
	 * @see cepapp.CEPApp#getSourceElements()
	 * @see #getCEPApp()
	 * @generated
	 */
	EReference getCEPApp_SourceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.CEPApp#getSinkElements <em>Sink Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sink Elements</em>'.
	 * @see cepapp.CEPApp#getSinkElements()
	 * @see #getCEPApp()
	 * @generated
	 */
	EReference getCEPApp_SinkElements();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.CEPApp#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see cepapp.CEPApp#getLinks()
	 * @see #getCEPApp()
	 * @generated
	 */
	EReference getCEPApp_Links();

	/**
	 * Returns the meta object for class '{@link cepapp.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see cepapp.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Link#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see cepapp.Link#getOrder()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Order();

	/**
	 * Returns the meta object for the reference '{@link cepapp.Link#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see cepapp.Link#getOrigin()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link cepapp.Link#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see cepapp.Link#getDestination()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Destination();

	/**
	 * Returns the meta object for class '{@link cepapp.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin</em>'.
	 * @see cepapp.Origin
	 * @generated
	 */
	EClass getOrigin();

	/**
	 * Returns the meta object for the reference list '{@link cepapp.Origin#getOutboundLink <em>Outbound Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Link</em>'.
	 * @see cepapp.Origin#getOutboundLink()
	 * @see #getOrigin()
	 * @generated
	 */
	EReference getOrigin_OutboundLink();

	/**
	 * Returns the meta object for class '{@link cepapp.Destination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination</em>'.
	 * @see cepapp.Destination
	 * @generated
	 */
	EClass getDestination();

	/**
	 * Returns the meta object for the reference list '{@link cepapp.Destination#getInboundLink <em>Inbound Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Link</em>'.
	 * @see cepapp.Destination#getInboundLink()
	 * @see #getDestination()
	 * @generated
	 */
	EReference getDestination_InboundLink();

	/**
	 * Returns the meta object for class '{@link cepapp.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see cepapp.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for class '{@link cepapp.SinkElement <em>Sink Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Element</em>'.
	 * @see cepapp.SinkElement
	 * @generated
	 */
	EClass getSinkElement();

	/**
	 * Returns the meta object for class '{@link cepapp.Mappable <em>Mappable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappable</em>'.
	 * @see cepapp.Mappable
	 * @generated
	 */
	EClass getMappable();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Mappable#getMappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Type</em>'.
	 * @see cepapp.Mappable#getMappingType()
	 * @see #getMappable()
	 * @generated
	 */
	EAttribute getMappable_MappingType();

	/**
	 * Returns the meta object for class '{@link cepapp.InMemory <em>In Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Memory</em>'.
	 * @see cepapp.InMemory
	 * @generated
	 */
	EClass getInMemory();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.InMemory#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see cepapp.InMemory#getTopic()
	 * @see #getInMemory()
	 * @generated
	 */
	EAttribute getInMemory_Topic();

	/**
	 * Returns the meta object for class '{@link cepapp.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see cepapp.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link cepapp.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see cepapp.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Email#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see cepapp.Email#getUsername()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Username();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Email#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see cepapp.Email#getPassword()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Password();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Email#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see cepapp.Email#getHost()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Host();

	/**
	 * Returns the meta object for class '{@link cepapp.Http <em>Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http</em>'.
	 * @see cepapp.Http
	 * @generated
	 */
	EClass getHttp();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Http#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see cepapp.Http#getUrl()
	 * @see #getHttp()
	 * @generated
	 */
	EAttribute getHttp_Url();

	/**
	 * Returns the meta object for class '{@link cepapp.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see cepapp.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Database#getPrimary_key <em>Primary key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary key</em>'.
	 * @see cepapp.Database#getPrimary_key()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Primary_key();

	/**
	 * Returns the meta object for class '{@link cepapp.MongoDB <em>Mongo DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo DB</em>'.
	 * @see cepapp.MongoDB
	 * @generated
	 */
	EClass getMongoDB();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MongoDB#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see cepapp.MongoDB#getUri()
	 * @see #getMongoDB()
	 * @generated
	 */
	EAttribute getMongoDB_Uri();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MongoDB#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see cepapp.MongoDB#getIndex()
	 * @see #getMongoDB()
	 * @generated
	 */
	EAttribute getMongoDB_Index();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MongoDB#getCollectionName <em>Collection Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Name</em>'.
	 * @see cepapp.MongoDB#getCollectionName()
	 * @see #getMongoDB()
	 * @generated
	 */
	EAttribute getMongoDB_CollectionName();

	/**
	 * Returns the meta object for class '{@link cepapp.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MQTT</em>'.
	 * @see cepapp.MQTT
	 * @generated
	 */
	EClass getMQTT();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MQTT#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see cepapp.MQTT#getUrl()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_Url();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MQTT#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see cepapp.MQTT#getTopic()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_Topic();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MQTT#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see cepapp.MQTT#getUsername()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_Username();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MQTT#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see cepapp.MQTT#getPassword()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_Password();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.MQTT#getClient_id <em>Client id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client id</em>'.
	 * @see cepapp.MQTT#getClient_id()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_Client_id();

	/**
	 * Returns the meta object for class '{@link cepapp.InMemoryInput <em>In Memory Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Memory Input</em>'.
	 * @see cepapp.InMemoryInput
	 * @generated
	 */
	EClass getInMemoryInput();

	/**
	 * Returns the meta object for class '{@link cepapp.SourceEmail <em>Source Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Email</em>'.
	 * @see cepapp.SourceEmail
	 * @generated
	 */
	EClass getSourceEmail();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SourceEmail#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see cepapp.SourceEmail#getPort()
	 * @see #getSourceEmail()
	 * @generated
	 */
	EAttribute getSourceEmail_Port();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SourceEmail#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see cepapp.SourceEmail#getFolder()
	 * @see #getSourceEmail()
	 * @generated
	 */
	EAttribute getSourceEmail_Folder();

	/**
	 * Returns the meta object for class '{@link cepapp.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input File</em>'.
	 * @see cepapp.InputFile
	 * @generated
	 */
	EClass getInputFile();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.InputFile#getDir_uri <em>Dir uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir uri</em>'.
	 * @see cepapp.InputFile#getDir_uri()
	 * @see #getInputFile()
	 * @generated
	 */
	EAttribute getInputFile_Dir_uri();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.InputFile#getFile_uri <em>File uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File uri</em>'.
	 * @see cepapp.InputFile#getFile_uri()
	 * @see #getInputFile()
	 * @generated
	 */
	EAttribute getInputFile_File_uri();

	/**
	 * Returns the meta object for class '{@link cepapp.SourceHttp <em>Source Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Http</em>'.
	 * @see cepapp.SourceHttp
	 * @generated
	 */
	EClass getSourceHttp();

	/**
	 * Returns the meta object for class '{@link cepapp.SourceMqtt <em>Source Mqtt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Mqtt</em>'.
	 * @see cepapp.SourceMqtt
	 * @generated
	 */
	EClass getSourceMqtt();

	/**
	 * Returns the meta object for class '{@link cepapp.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see cepapp.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Event#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see cepapp.Event#getTypeName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.Event#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see cepapp.Event#getImagePath()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ImagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.Event#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Properties</em>'.
	 * @see cepapp.Event#getEventProperties()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_EventProperties();

	/**
	 * Returns the meta object for class '{@link cepapp.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Property</em>'.
	 * @see cepapp.EventProperty
	 * @generated
	 */
	EClass getEventProperty();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.EventProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cepapp.EventProperty#getName()
	 * @see #getEventProperty()
	 * @generated
	 */
	EAttribute getEventProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.EventProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cepapp.EventProperty#getType()
	 * @see #getEventProperty()
	 * @generated
	 */
	EAttribute getEventProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.EventProperty#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see cepapp.EventProperty#getImagePath()
	 * @see #getEventProperty()
	 * @generated
	 */
	EAttribute getEventProperty_ImagePath();

	/**
	 * Returns the meta object for the container reference '{@link cepapp.EventProperty#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Event</em>'.
	 * @see cepapp.EventProperty#getReferencedEvent()
	 * @see #getEventProperty()
	 * @generated
	 */
	EReference getEventProperty_ReferencedEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.EventProperty#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Properties</em>'.
	 * @see cepapp.EventProperty#getEventProperties()
	 * @see #getEventProperty()
	 * @generated
	 */
	EReference getEventProperty_EventProperties();

	/**
	 * Returns the meta object for the container reference '{@link cepapp.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Event Property</em>'.
	 * @see cepapp.EventProperty#getReferencedEventProperty()
	 * @see #getEventProperty()
	 * @generated
	 */
	EReference getEventProperty_ReferencedEventProperty();

	/**
	 * Returns the meta object for class '{@link cepapp.InMemoryOutput <em>In Memory Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Memory Output</em>'.
	 * @see cepapp.InMemoryOutput
	 * @generated
	 */
	EClass getInMemoryOutput();

	/**
	 * Returns the meta object for class '{@link cepapp.ComplexEvent <em>Complex Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Event</em>'.
	 * @see cepapp.ComplexEvent
	 * @generated
	 */
	EClass getComplexEvent();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.ComplexEvent#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see cepapp.ComplexEvent#getTypeName()
	 * @see #getComplexEvent()
	 * @generated
	 */
	EAttribute getComplexEvent_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.ComplexEvent#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see cepapp.ComplexEvent#getImagePath()
	 * @see #getComplexEvent()
	 * @generated
	 */
	EAttribute getComplexEvent_ImagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.ComplexEvent#getComplexEventProperties <em>Complex Event Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Event Properties</em>'.
	 * @see cepapp.ComplexEvent#getComplexEventProperties()
	 * @see #getComplexEvent()
	 * @generated
	 */
	EReference getComplexEvent_ComplexEventProperties();

	/**
	 * Returns the meta object for class '{@link cepapp.ComplexEventProperty <em>Complex Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Event Property</em>'.
	 * @see cepapp.ComplexEventProperty
	 * @generated
	 */
	EClass getComplexEventProperty();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.ComplexEventProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cepapp.ComplexEventProperty#getName()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
	EAttribute getComplexEventProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.ComplexEventProperty#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see cepapp.ComplexEventProperty#getImagePath()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
	EAttribute getComplexEventProperty_ImagePath();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.ComplexEventProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cepapp.ComplexEventProperty#getType()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
	EAttribute getComplexEventProperty_Type();

	/**
	 * Returns the meta object for the container reference '{@link cepapp.ComplexEventProperty#getReferencedComplexEvent <em>Referenced Complex Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Complex Event</em>'.
	 * @see cepapp.ComplexEventProperty#getReferencedComplexEvent()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
	EReference getComplexEventProperty_ReferencedComplexEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link cepapp.ComplexEventProperty#getComplexEventProperties <em>Complex Event Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Event Properties</em>'.
	 * @see cepapp.ComplexEventProperty#getComplexEventProperties()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
	EReference getComplexEventProperty_ComplexEventProperties();

	/**
	 * Returns the meta object for the container reference '{@link cepapp.ComplexEventProperty#getReferencedComplexEventProperty <em>Referenced Complex Event Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Complex Event Property</em>'.
	 * @see cepapp.ComplexEventProperty#getReferencedComplexEventProperty()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
	EReference getComplexEventProperty_ReferencedComplexEventProperty();

	/**
	 * Returns the meta object for class '{@link cepapp.SinkEmail <em>Sink Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Email</em>'.
	 * @see cepapp.SinkEmail
	 * @generated
	 */
	EClass getSinkEmail();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SinkEmail#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see cepapp.SinkEmail#getAddress()
	 * @see #getSinkEmail()
	 * @generated
	 */
	EAttribute getSinkEmail_Address();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SinkEmail#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see cepapp.SinkEmail#getTo()
	 * @see #getSinkEmail()
	 * @generated
	 */
	EAttribute getSinkEmail_To();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SinkEmail#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see cepapp.SinkEmail#getSubject()
	 * @see #getSinkEmail()
	 * @generated
	 */
	EAttribute getSinkEmail_Subject();

	/**
	 * Returns the meta object for class '{@link cepapp.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output File</em>'.
	 * @see cepapp.OutputFile
	 * @generated
	 */
	EClass getOutputFile();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.OutputFile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see cepapp.OutputFile#getPath()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_Path();

	/**
	 * Returns the meta object for class '{@link cepapp.SinkMongoDB <em>Sink Mongo DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Mongo DB</em>'.
	 * @see cepapp.SinkMongoDB
	 * @generated
	 */
	EClass getSinkMongoDB();

	/**
	 * Returns the meta object for class '{@link cepapp.SinkHttp <em>Sink Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Http</em>'.
	 * @see cepapp.SinkHttp
	 * @generated
	 */
	EClass getSinkHttp();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SinkHttp#getBasic_auth_username <em>Basic auth username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic auth username</em>'.
	 * @see cepapp.SinkHttp#getBasic_auth_username()
	 * @see #getSinkHttp()
	 * @generated
	 */
	EAttribute getSinkHttp_Basic_auth_username();

	/**
	 * Returns the meta object for the attribute '{@link cepapp.SinkHttp#getBasic_auth_password <em>Basic auth password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic auth password</em>'.
	 * @see cepapp.SinkHttp#getBasic_auth_password()
	 * @see #getSinkHttp()
	 * @generated
	 */
	EAttribute getSinkHttp_Basic_auth_password();

	/**
	 * Returns the meta object for class '{@link cepapp.SinkMqtt <em>Sink Mqtt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Mqtt</em>'.
	 * @see cepapp.SinkMqtt
	 * @generated
	 */
	EClass getSinkMqtt();

	/**
	 * Returns the meta object for enum '{@link cepapp.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Type</em>'.
	 * @see cepapp.MappingType
	 * @generated
	 */
	EEnum getMappingType();

	/**
	 * Returns the meta object for enum '{@link cepapp.PropertyTypeValue <em>Property Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type Value</em>'.
	 * @see cepapp.PropertyTypeValue
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
	CepappFactory getCepappFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link cepapp.impl.CEPAppImpl <em>CEP App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.CEPAppImpl
		 * @see cepapp.impl.CepappPackageImpl#getCEPApp()
		 * @generated
		 */
		EClass CEP_APP = eINSTANCE.getCEPApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEP_APP__NAME = eINSTANCE.getCEPApp_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEP_APP__DESCRIPTION = eINSTANCE.getCEPApp_Description();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEP_APP__CREATION_DATE = eINSTANCE.getCEPApp_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEP_APP__DOMAIN_NAME = eINSTANCE.getCEPApp_DomainName();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEP_APP__SOURCE_ELEMENTS = eINSTANCE.getCEPApp_SourceElements();

		/**
		 * The meta object literal for the '<em><b>Sink Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEP_APP__SINK_ELEMENTS = eINSTANCE.getCEPApp_SinkElements();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEP_APP__LINKS = eINSTANCE.getCEPApp_Links();

		/**
		 * The meta object literal for the '{@link cepapp.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.LinkImpl
		 * @see cepapp.impl.CepappPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ORDER = eINSTANCE.getLink_Order();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ORIGIN = eINSTANCE.getLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DESTINATION = eINSTANCE.getLink_Destination();

		/**
		 * The meta object literal for the '{@link cepapp.impl.OriginImpl <em>Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.OriginImpl
		 * @see cepapp.impl.CepappPackageImpl#getOrigin()
		 * @generated
		 */
		EClass ORIGIN = eINSTANCE.getOrigin();

		/**
		 * The meta object literal for the '<em><b>Outbound Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIGIN__OUTBOUND_LINK = eINSTANCE.getOrigin_OutboundLink();

		/**
		 * The meta object literal for the '{@link cepapp.impl.DestinationImpl <em>Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.DestinationImpl
		 * @see cepapp.impl.CepappPackageImpl#getDestination()
		 * @generated
		 */
		EClass DESTINATION = eINSTANCE.getDestination();

		/**
		 * The meta object literal for the '<em><b>Inbound Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION__INBOUND_LINK = eINSTANCE.getDestination_InboundLink();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SourceElementImpl
		 * @see cepapp.impl.CepappPackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SinkElementImpl <em>Sink Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SinkElementImpl
		 * @see cepapp.impl.CepappPackageImpl#getSinkElement()
		 * @generated
		 */
		EClass SINK_ELEMENT = eINSTANCE.getSinkElement();

		/**
		 * The meta object literal for the '{@link cepapp.impl.MappableImpl <em>Mappable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.MappableImpl
		 * @see cepapp.impl.CepappPackageImpl#getMappable()
		 * @generated
		 */
		EClass MAPPABLE = eINSTANCE.getMappable();

		/**
		 * The meta object literal for the '<em><b>Mapping Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPABLE__MAPPING_TYPE = eINSTANCE.getMappable_MappingType();

		/**
		 * The meta object literal for the '{@link cepapp.impl.InMemoryImpl <em>In Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.InMemoryImpl
		 * @see cepapp.impl.CepappPackageImpl#getInMemory()
		 * @generated
		 */
		EClass IN_MEMORY = eINSTANCE.getInMemory();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_MEMORY__TOPIC = eINSTANCE.getInMemory_Topic();

		/**
		 * The meta object literal for the '{@link cepapp.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.FileImpl
		 * @see cepapp.impl.CepappPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link cepapp.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.EmailImpl
		 * @see cepapp.impl.CepappPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__USERNAME = eINSTANCE.getEmail_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__PASSWORD = eINSTANCE.getEmail_Password();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__HOST = eINSTANCE.getEmail_Host();

		/**
		 * The meta object literal for the '{@link cepapp.impl.HttpImpl <em>Http</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.HttpImpl
		 * @see cepapp.impl.CepappPackageImpl#getHttp()
		 * @generated
		 */
		EClass HTTP = eINSTANCE.getHttp();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP__URL = eINSTANCE.getHttp_Url();

		/**
		 * The meta object literal for the '{@link cepapp.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.DatabaseImpl
		 * @see cepapp.impl.CepappPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Primary key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PRIMARY_KEY = eINSTANCE.getDatabase_Primary_key();

		/**
		 * The meta object literal for the '{@link cepapp.impl.MongoDBImpl <em>Mongo DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.MongoDBImpl
		 * @see cepapp.impl.CepappPackageImpl#getMongoDB()
		 * @generated
		 */
		EClass MONGO_DB = eINSTANCE.getMongoDB();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__URI = eINSTANCE.getMongoDB_Uri();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__INDEX = eINSTANCE.getMongoDB_Index();

		/**
		 * The meta object literal for the '<em><b>Collection Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__COLLECTION_NAME = eINSTANCE.getMongoDB_CollectionName();

		/**
		 * The meta object literal for the '{@link cepapp.impl.MQTTImpl <em>MQTT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.MQTTImpl
		 * @see cepapp.impl.CepappPackageImpl#getMQTT()
		 * @generated
		 */
		EClass MQTT = eINSTANCE.getMQTT();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__URL = eINSTANCE.getMQTT_Url();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__TOPIC = eINSTANCE.getMQTT_Topic();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__USERNAME = eINSTANCE.getMQTT_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__PASSWORD = eINSTANCE.getMQTT_Password();

		/**
		 * The meta object literal for the '<em><b>Client id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__CLIENT_ID = eINSTANCE.getMQTT_Client_id();

		/**
		 * The meta object literal for the '{@link cepapp.impl.InMemoryInputImpl <em>In Memory Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.InMemoryInputImpl
		 * @see cepapp.impl.CepappPackageImpl#getInMemoryInput()
		 * @generated
		 */
		EClass IN_MEMORY_INPUT = eINSTANCE.getInMemoryInput();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SourceEmailImpl <em>Source Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SourceEmailImpl
		 * @see cepapp.impl.CepappPackageImpl#getSourceEmail()
		 * @generated
		 */
		EClass SOURCE_EMAIL = eINSTANCE.getSourceEmail();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_EMAIL__PORT = eINSTANCE.getSourceEmail_Port();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_EMAIL__FOLDER = eINSTANCE.getSourceEmail_Folder();

		/**
		 * The meta object literal for the '{@link cepapp.impl.InputFileImpl <em>Input File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.InputFileImpl
		 * @see cepapp.impl.CepappPackageImpl#getInputFile()
		 * @generated
		 */
		EClass INPUT_FILE = eINSTANCE.getInputFile();

		/**
		 * The meta object literal for the '<em><b>Dir uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FILE__DIR_URI = eINSTANCE.getInputFile_Dir_uri();

		/**
		 * The meta object literal for the '<em><b>File uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FILE__FILE_URI = eINSTANCE.getInputFile_File_uri();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SourceHttpImpl <em>Source Http</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SourceHttpImpl
		 * @see cepapp.impl.CepappPackageImpl#getSourceHttp()
		 * @generated
		 */
		EClass SOURCE_HTTP = eINSTANCE.getSourceHttp();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SourceMqttImpl <em>Source Mqtt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SourceMqttImpl
		 * @see cepapp.impl.CepappPackageImpl#getSourceMqtt()
		 * @generated
		 */
		EClass SOURCE_MQTT = eINSTANCE.getSourceMqtt();

		/**
		 * The meta object literal for the '{@link cepapp.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.EventImpl
		 * @see cepapp.impl.CepappPackageImpl#getEvent()
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
		 * The meta object literal for the '{@link cepapp.impl.EventPropertyImpl <em>Event Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.EventPropertyImpl
		 * @see cepapp.impl.CepappPackageImpl#getEventProperty()
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
		 * The meta object literal for the '{@link cepapp.impl.InMemoryOutputImpl <em>In Memory Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.InMemoryOutputImpl
		 * @see cepapp.impl.CepappPackageImpl#getInMemoryOutput()
		 * @generated
		 */
		EClass IN_MEMORY_OUTPUT = eINSTANCE.getInMemoryOutput();

		/**
		 * The meta object literal for the '{@link cepapp.impl.ComplexEventImpl <em>Complex Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.ComplexEventImpl
		 * @see cepapp.impl.CepappPackageImpl#getComplexEvent()
		 * @generated
		 */
		EClass COMPLEX_EVENT = eINSTANCE.getComplexEvent();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_EVENT__TYPE_NAME = eINSTANCE.getComplexEvent_TypeName();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_EVENT__IMAGE_PATH = eINSTANCE.getComplexEvent_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Complex Event Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES = eINSTANCE.getComplexEvent_ComplexEventProperties();

		/**
		 * The meta object literal for the '{@link cepapp.impl.ComplexEventPropertyImpl <em>Complex Event Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.ComplexEventPropertyImpl
		 * @see cepapp.impl.CepappPackageImpl#getComplexEventProperty()
		 * @generated
		 */
		EClass COMPLEX_EVENT_PROPERTY = eINSTANCE.getComplexEventProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_EVENT_PROPERTY__NAME = eINSTANCE.getComplexEventProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_EVENT_PROPERTY__IMAGE_PATH = eINSTANCE.getComplexEventProperty_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_EVENT_PROPERTY__TYPE = eINSTANCE.getComplexEventProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Referenced Complex Event</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT = eINSTANCE.getComplexEventProperty_ReferencedComplexEvent();

		/**
		 * The meta object literal for the '<em><b>Complex Event Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_EVENT_PROPERTY__COMPLEX_EVENT_PROPERTIES = eINSTANCE.getComplexEventProperty_ComplexEventProperties();

		/**
		 * The meta object literal for the '<em><b>Referenced Complex Event Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_EVENT_PROPERTY__REFERENCED_COMPLEX_EVENT_PROPERTY = eINSTANCE.getComplexEventProperty_ReferencedComplexEventProperty();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SinkEmailImpl <em>Sink Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SinkEmailImpl
		 * @see cepapp.impl.CepappPackageImpl#getSinkEmail()
		 * @generated
		 */
		EClass SINK_EMAIL = eINSTANCE.getSinkEmail();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK_EMAIL__ADDRESS = eINSTANCE.getSinkEmail_Address();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK_EMAIL__TO = eINSTANCE.getSinkEmail_To();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK_EMAIL__SUBJECT = eINSTANCE.getSinkEmail_Subject();

		/**
		 * The meta object literal for the '{@link cepapp.impl.OutputFileImpl <em>Output File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.OutputFileImpl
		 * @see cepapp.impl.CepappPackageImpl#getOutputFile()
		 * @generated
		 */
		EClass OUTPUT_FILE = eINSTANCE.getOutputFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FILE__PATH = eINSTANCE.getOutputFile_Path();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SinkMongoDBImpl <em>Sink Mongo DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SinkMongoDBImpl
		 * @see cepapp.impl.CepappPackageImpl#getSinkMongoDB()
		 * @generated
		 */
		EClass SINK_MONGO_DB = eINSTANCE.getSinkMongoDB();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SinkHttpImpl <em>Sink Http</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SinkHttpImpl
		 * @see cepapp.impl.CepappPackageImpl#getSinkHttp()
		 * @generated
		 */
		EClass SINK_HTTP = eINSTANCE.getSinkHttp();

		/**
		 * The meta object literal for the '<em><b>Basic auth username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK_HTTP__BASIC_AUTH_USERNAME = eINSTANCE.getSinkHttp_Basic_auth_username();

		/**
		 * The meta object literal for the '<em><b>Basic auth password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK_HTTP__BASIC_AUTH_PASSWORD = eINSTANCE.getSinkHttp_Basic_auth_password();

		/**
		 * The meta object literal for the '{@link cepapp.impl.SinkMqttImpl <em>Sink Mqtt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.SinkMqttImpl
		 * @see cepapp.impl.CepappPackageImpl#getSinkMqtt()
		 * @generated
		 */
		EClass SINK_MQTT = eINSTANCE.getSinkMqtt();

		/**
		 * The meta object literal for the '{@link cepapp.MappingType <em>Mapping Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.MappingType
		 * @see cepapp.impl.CepappPackageImpl#getMappingType()
		 * @generated
		 */
		EEnum MAPPING_TYPE = eINSTANCE.getMappingType();

		/**
		 * The meta object literal for the '{@link cepapp.PropertyTypeValue <em>Property Type Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.PropertyTypeValue
		 * @see cepapp.impl.CepappPackageImpl#getPropertyTypeValue()
		 * @generated
		 */
		EEnum PROPERTY_TYPE_VALUE = eINSTANCE.getPropertyTypeValue();

	}

} //CepappPackage
