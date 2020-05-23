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
	 * The meta object id for the '{@link cepapp.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.FileImpl
	 * @see cepapp.impl.CepappPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;

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
	 * The meta object id for the '{@link cepapp.impl.MQTTImpl <em>MQTT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.MQTTImpl
	 * @see cepapp.impl.CepappPackageImpl#getMQTT()
	 * @generated
	 */
	int MQTT = 8;

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
	 * The meta object id for the '{@link cepapp.impl.InputFileImpl <em>Input File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.InputFileImpl
	 * @see cepapp.impl.CepappPackageImpl#getInputFile()
	 * @generated
	 */
	int INPUT_FILE = 9;

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
	 * The meta object id for the '{@link cepapp.impl.SourceMqttImpl <em>Source Mqtt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SourceMqttImpl
	 * @see cepapp.impl.CepappPackageImpl#getSourceMqtt()
	 * @generated
	 */
	int SOURCE_MQTT = 10;

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
	int EVENT = 11;

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
	int EVENT_PROPERTY = 12;

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
	 * The meta object id for the '{@link cepapp.impl.ComplexEventImpl <em>Complex Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.ComplexEventImpl
	 * @see cepapp.impl.CepappPackageImpl#getComplexEvent()
	 * @generated
	 */
	int COMPLEX_EVENT = 13;

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
	int COMPLEX_EVENT_PROPERTY = 14;

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
	 * The meta object id for the '{@link cepapp.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.OutputFileImpl
	 * @see cepapp.impl.CepappPackageImpl#getOutputFile()
	 * @generated
	 */
	int OUTPUT_FILE = 15;

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
	 * The meta object id for the '{@link cepapp.impl.SinkMqttImpl <em>Sink Mqtt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.impl.SinkMqttImpl
	 * @see cepapp.impl.CepappPackageImpl#getSinkMqtt()
	 * @generated
	 */
	int SINK_MQTT = 16;

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
	int MAPPING_TYPE = 17;

	/**
	 * The meta object id for the '{@link cepapp.PropertyTypeValue <em>Property Type Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cepapp.PropertyTypeValue
	 * @see cepapp.impl.CepappPackageImpl#getPropertyTypeValue()
	 * @generated
	 */
	int PROPERTY_TYPE_VALUE = 18;


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
	 * Returns the meta object for class '{@link cepapp.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see cepapp.File
	 * @generated
	 */
	EClass getFile();

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
		 * The meta object literal for the '{@link cepapp.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cepapp.impl.FileImpl
		 * @see cepapp.impl.CepappPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

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
