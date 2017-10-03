/**
 */
package eventpattern;

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
 * @see eventpattern.EventpatternFactory
 * @model kind="package"
 * @generated
 */
public interface EventpatternPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "eventpattern";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "www.uca.es/modeling/cep/eventpattern";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "eventpattern";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EventpatternPackage eINSTANCE = eventpattern.impl.EventpatternPackageImpl.init();

  /**
	 * The meta object id for the '{@link eventpattern.impl.CEPEventPatternImpl <em>CEP Event Pattern</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.CEPEventPatternImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getCEPEventPattern()
	 * @generated
	 */
  int CEP_EVENT_PATTERN = 0;

  /**
	 * The feature id for the '<em><b>Pattern Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__PATTERN_NAME = 0;

  /**
	 * The feature id for the '<em><b>Pattern Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__PATTERN_DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__DOMAIN_NAME = 2;

  /**
	 * The feature id for the '<em><b>Pattern Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__PATTERN_CREATION_DATE = 3;

  /**
	 * The feature id for the '<em><b>Pattern Deployed</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__PATTERN_DEPLOYED = 4;

  /**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__LINKS = 5;

  /**
	 * The feature id for the '<em><b>Event Pattern Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS = 6;

  /**
	 * The feature id for the '<em><b>Complex Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__COMPLEX_EVENT = 7;

  /**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN__ACTIONS = 8;

  /**
	 * The number of structural features of the '<em>CEP Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CEP_EVENT_PATTERN_FEATURE_COUNT = 9;

  /**
	 * The meta object id for the '{@link eventpattern.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.LinkImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getLink()
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
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__OPERAND = 1;

  /**
	 * The feature id for the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK__OPERATOR = 2;

  /**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINK_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link eventpattern.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.OperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getOperator()
	 * @generated
	 */
  int OPERATOR = 2;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATOR__INBOUND_LINK = 0;

  /**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATOR_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.UnaryOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getUnaryOperator()
	 * @generated
	 */
  int UNARY_OPERATOR = 3;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNARY_OPERATOR__INBOUND_LINK = OPERATOR__INBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNARY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.BinaryOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getBinaryOperator()
	 * @generated
	 */
  int BINARY_OPERATOR = 4;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINARY_OPERATOR__INBOUND_LINK = OPERATOR__INBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINARY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.NaryOperatorImpl <em>Nary Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.NaryOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getNaryOperator()
	 * @generated
	 */
  int NARY_OPERATOR = 5;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NARY_OPERATOR__INBOUND_LINK = OPERATOR__INBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Nary Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NARY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.OperandImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getOperand()
	 * @generated
	 */
  int OPERAND = 6;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERAND__OUTBOUND_LINK = 0;

  /**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERAND_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EventPatternElementImpl <em>Event Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EventPatternElementImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEventPatternElement()
	 * @generated
	 */
  int EVENT_PATTERN_ELEMENT = 7;

  /**
	 * The number of structural features of the '<em>Event Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PATTERN_ELEMENT_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ComplexEventImpl <em>Complex Event</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ComplexEventImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getComplexEvent()
	 * @generated
	 */
  int COMPLEX_EVENT = 8;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT__OUTBOUND_LINK = OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT__INBOUND_LINK = OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT__TYPE_NAME = OPERAND_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT__IMAGE_PATH = OPERAND_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Complex Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES = OPERAND_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Complex Event</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ComplexEventPropertyImpl <em>Complex Event Property</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ComplexEventPropertyImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getComplexEventProperty()
	 * @generated
	 */
  int COMPLEX_EVENT_PROPERTY = 9;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT_PROPERTY__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT_PROPERTY__NAME = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT_PROPERTY__IMAGE_PATH = UNARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Complex Event Property</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPLEX_EVENT_PROPERTY_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ActionImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getAction()
	 * @generated
	 */
  int ACTION = 10;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTION__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTION_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.DataWindowImpl <em>Data Window</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.DataWindowImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getDataWindow()
	 * @generated
	 */
  int DATA_WINDOW = 11;

  /**
	 * The feature id for the '<em><b>Event Pattern Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_WINDOW__EVENT_PATTERN_CONDITIONS = EVENT_PATTERN_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Data Window</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_WINDOW_FEATURE_COUNT = EVENT_PATTERN_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.SlidingEventIntervalImpl <em>Sliding Event Interval</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.SlidingEventIntervalImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getSlidingEventInterval()
	 * @generated
	 */
  int SLIDING_EVENT_INTERVAL = 12;

  /**
	 * The feature id for the '<em><b>Event Pattern Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_EVENT_INTERVAL__EVENT_PATTERN_CONDITIONS = DATA_WINDOW__EVENT_PATTERN_CONDITIONS;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_EVENT_INTERVAL__SIZE = DATA_WINDOW_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Sliding Event Interval</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_EVENT_INTERVAL_FEATURE_COUNT = DATA_WINDOW_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.BatchingEventIntervalImpl <em>Batching Event Interval</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.BatchingEventIntervalImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getBatchingEventInterval()
	 * @generated
	 */
  int BATCHING_EVENT_INTERVAL = 13;

  /**
	 * The feature id for the '<em><b>Event Pattern Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_EVENT_INTERVAL__EVENT_PATTERN_CONDITIONS = DATA_WINDOW__EVENT_PATTERN_CONDITIONS;

  /**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_EVENT_INTERVAL__SIZE = DATA_WINDOW_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Batching Event Interval</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_EVENT_INTERVAL_FEATURE_COUNT = DATA_WINDOW_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.SlidingTimeIntervalImpl <em>Sliding Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.SlidingTimeIntervalImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getSlidingTimeInterval()
	 * @generated
	 */
  int SLIDING_TIME_INTERVAL = 14;

  /**
	 * The feature id for the '<em><b>Event Pattern Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__EVENT_PATTERN_CONDITIONS = DATA_WINDOW__EVENT_PATTERN_CONDITIONS;

  /**
	 * The feature id for the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__YEARS = DATA_WINDOW_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__MONTHS = DATA_WINDOW_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Weeks</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__WEEKS = DATA_WINDOW_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__DAYS = DATA_WINDOW_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__HOURS = DATA_WINDOW_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__MINUTES = DATA_WINDOW_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__SECONDS = DATA_WINDOW_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL__MILLISECONDS = DATA_WINDOW_FEATURE_COUNT + 7;

  /**
	 * The number of structural features of the '<em>Sliding Time Interval</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SLIDING_TIME_INTERVAL_FEATURE_COUNT = DATA_WINDOW_FEATURE_COUNT + 8;

  /**
	 * The meta object id for the '{@link eventpattern.impl.BatchingTimeIntervalImpl <em>Batching Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.BatchingTimeIntervalImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getBatchingTimeInterval()
	 * @generated
	 */
  int BATCHING_TIME_INTERVAL = 15;

  /**
	 * The feature id for the '<em><b>Event Pattern Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__EVENT_PATTERN_CONDITIONS = DATA_WINDOW__EVENT_PATTERN_CONDITIONS;

  /**
	 * The feature id for the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__YEARS = DATA_WINDOW_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__MONTHS = DATA_WINDOW_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Weeks</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__WEEKS = DATA_WINDOW_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__DAYS = DATA_WINDOW_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__HOURS = DATA_WINDOW_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__MINUTES = DATA_WINDOW_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__SECONDS = DATA_WINDOW_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL__MILLISECONDS = DATA_WINDOW_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Start Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHING_TIME_INTERVAL__START_TIMESTAMP = DATA_WINDOW_FEATURE_COUNT + 8;

		/**
	 * The number of structural features of the '<em>Batching Time Interval</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BATCHING_TIME_INTERVAL_FEATURE_COUNT = DATA_WINDOW_FEATURE_COUNT + 9;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EventPatternConditionImpl <em>Event Pattern Condition</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EventPatternConditionImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEventPatternCondition()
	 * @generated
	 */
  int EVENT_PATTERN_CONDITION = 16;

  /**
	 * The number of structural features of the '<em>Event Pattern Condition</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PATTERN_CONDITION_FEATURE_COUNT = EVENT_PATTERN_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.AggregationOperatorImpl <em>Aggregation Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.AggregationOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getAggregationOperator()
	 * @generated
	 */
  int AGGREGATION_OPERATOR = 17;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGGREGATION_OPERATOR__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGGREGATION_OPERATOR__OUTBOUND_LINK = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGGREGATION_OPERATOR_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ConditionOperatorImpl <em>Condition Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ConditionOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getConditionOperator()
	 * @generated
	 */
  int CONDITION_OPERATOR = 18;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION_OPERATOR__INBOUND_LINK = OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION_OPERATOR__OUTBOUND_LINK = OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Condition Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ConditionOperandImpl <em>Condition Operand</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ConditionOperandImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getConditionOperand()
	 * @generated
	 */
  int CONDITION_OPERAND = 19;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION_OPERAND__OUTBOUND_LINK = OPERAND__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Condition Operand</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONDITION_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.PatternOperatorImpl <em>Pattern Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.PatternOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getPatternOperator()
	 * @generated
	 */
  int PATTERN_OPERATOR = 20;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PATTERN_OPERATOR__INBOUND_LINK = OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PATTERN_OPERATOR__OUTBOUND_LINK = OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Pattern Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PATTERN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.PatternOperandImpl <em>Pattern Operand</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.PatternOperandImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getPatternOperand()
	 * @generated
	 */
  int PATTERN_OPERAND = 21;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PATTERN_OPERAND__OUTBOUND_LINK = OPERAND__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Pattern Operand</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PATTERN_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ArithmeticOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getArithmeticOperator()
	 * @generated
	 */
  int ARITHMETIC_OPERATOR = 22;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARITHMETIC_OPERATOR__INBOUND_LINK = BINARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARITHMETIC_OPERATOR__OUTBOUND_LINK = BINARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Arithmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ARITHMETIC_OPERATOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ComparisonOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getComparisonOperator()
	 * @generated
	 */
  int COMPARISON_OPERATOR = 23;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARISON_OPERATOR__INBOUND_LINK = BINARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARISON_OPERATOR__OUTBOUND_LINK = BINARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARISON_OPERATOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.LogicalOperatorImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getLogicalOperator()
	 * @generated
	 */
  int LOGICAL_OPERATOR = 24;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGICAL_OPERATOR__INBOUND_LINK = CONDITION_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGICAL_OPERATOR__OUTBOUND_LINK = CONDITION_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOGICAL_OPERATOR_FEATURE_COUNT = CONDITION_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EveryImpl <em>Every</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EveryImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEvery()
	 * @generated
	 */
  int EVERY = 25;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVERY__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVERY__OUTBOUND_LINK = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Every</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVERY_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EveryDistinctImpl <em>Every Distinct</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EveryDistinctImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEveryDistinct()
	 * @generated
	 */
  int EVERY_DISTINCT = 26;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVERY_DISTINCT__INBOUND_LINK = NARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVERY_DISTINCT__OUTBOUND_LINK = NARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Every Distinct</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVERY_DISTINCT_FEATURE_COUNT = NARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.RepeatImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getRepeat()
	 * @generated
	 */
  int REPEAT = 27;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT__OUTBOUND_LINK = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT__COUNT = UNARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REPEAT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link eventpattern.impl.UntilImpl <em>Until</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.UntilImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getUntil()
	 * @generated
	 */
  int UNTIL = 28;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNTIL__INBOUND_LINK = BINARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNTIL__OUTBOUND_LINK = BINARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Until</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNTIL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.RangeImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getRange()
	 * @generated
	 */
  int RANGE = 29;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE__OUTBOUND_LINK = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Low Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE__LOW_ENDPOINT = UNARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>High Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE__HIGH_ENDPOINT = UNARY_OPERATOR_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RANGE_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link eventpattern.impl.FollowedByImpl <em>Followed By</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.FollowedByImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getFollowedBy()
	 * @generated
	 */
  int FOLLOWED_BY = 30;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLLOWED_BY__INBOUND_LINK = NARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLLOWED_BY__OUTBOUND_LINK = NARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Followed By</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLLOWED_BY_FEATURE_COUNT = NARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.WhileImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getWhile()
	 * @generated
	 */
  int WHILE = 31;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE__INBOUND_LINK = BINARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE__OUTBOUND_LINK = BINARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.AndImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getAnd()
	 * @generated
	 */
  int AND = 32;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__INBOUND_LINK = NARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__OUTBOUND_LINK = NARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND_FEATURE_COUNT = NARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.OrImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getOr()
	 * @generated
	 */
  int OR = 33;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__INBOUND_LINK = NARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__OUTBOUND_LINK = NARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR_FEATURE_COUNT = NARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.NotImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getNot()
	 * @generated
	 */
  int NOT = 34;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT__INBOUND_LINK = UNARY_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT__OUTBOUND_LINK = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link eventpattern.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.AdditionImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getAddition()
	 * @generated
	 */
  int ADDITION = 35;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION__INBOUND_LINK = ARITHMETIC_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION__OUTBOUND_LINK = ARITHMETIC_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.SubtractionImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getSubtraction()
	 * @generated
	 */
  int SUBTRACTION = 36;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION__INBOUND_LINK = ARITHMETIC_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION__OUTBOUND_LINK = ARITHMETIC_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.MultiplicationImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getMultiplication()
	 * @generated
	 */
  int MULTIPLICATION = 37;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION__INBOUND_LINK = ARITHMETIC_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION__OUTBOUND_LINK = ARITHMETIC_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.DivisionImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getDivision()
	 * @generated
	 */
  int DIVISION = 38;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION__INBOUND_LINK = ARITHMETIC_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION__OUTBOUND_LINK = ARITHMETIC_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ModulusImpl <em>Modulus</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ModulusImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getModulus()
	 * @generated
	 */
  int MODULUS = 39;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULUS__INBOUND_LINK = ARITHMETIC_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULUS__OUTBOUND_LINK = ARITHMETIC_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Modulus</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULUS_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EqualImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEqual()
	 * @generated
	 */
  int EQUAL = 40;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUAL__INBOUND_LINK = COMPARISON_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUAL__OUTBOUND_LINK = COMPARISON_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUAL_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.NotEqualImpl <em>Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.NotEqualImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getNotEqual()
	 * @generated
	 */
  int NOT_EQUAL = 41;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_EQUAL__INBOUND_LINK = COMPARISON_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_EQUAL__OUTBOUND_LINK = COMPARISON_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOT_EQUAL_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.LessThanImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getLessThan()
	 * @generated
	 */
  int LESS_THAN = 42;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LESS_THAN__INBOUND_LINK = COMPARISON_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LESS_THAN__OUTBOUND_LINK = COMPARISON_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LESS_THAN_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.GreaterThanImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getGreaterThan()
	 * @generated
	 */
  int GREATER_THAN = 43;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GREATER_THAN__INBOUND_LINK = COMPARISON_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GREATER_THAN__OUTBOUND_LINK = COMPARISON_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GREATER_THAN_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.LessEqualImpl <em>Less Equal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.LessEqualImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getLessEqual()
	 * @generated
	 */
  int LESS_EQUAL = 44;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LESS_EQUAL__INBOUND_LINK = COMPARISON_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LESS_EQUAL__OUTBOUND_LINK = COMPARISON_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Less Equal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LESS_EQUAL_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.GreaterEqualImpl <em>Greater Equal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.GreaterEqualImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getGreaterEqual()
	 * @generated
	 */
  int GREATER_EQUAL = 45;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GREATER_EQUAL__INBOUND_LINK = COMPARISON_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GREATER_EQUAL__OUTBOUND_LINK = COMPARISON_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Greater Equal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GREATER_EQUAL_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.MaxImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getMax()
	 * @generated
	 */
  int MAX = 46;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAX__INBOUND_LINK = AGGREGATION_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAX__OUTBOUND_LINK = AGGREGATION_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAX_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.MinImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getMin()
	 * @generated
	 */
  int MIN = 47;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MIN__INBOUND_LINK = AGGREGATION_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MIN__OUTBOUND_LINK = AGGREGATION_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MIN_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.AvgImpl <em>Avg</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.AvgImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getAvg()
	 * @generated
	 */
  int AVG = 48;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AVG__INBOUND_LINK = AGGREGATION_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AVG__OUTBOUND_LINK = AGGREGATION_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Avg</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AVG_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.CountImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getCount()
	 * @generated
	 */
  int COUNT = 49;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUNT__INBOUND_LINK = AGGREGATION_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUNT__OUTBOUND_LINK = AGGREGATION_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUNT_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.SumImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getSum()
	 * @generated
	 */
  int SUM = 50;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUM__INBOUND_LINK = AGGREGATION_OPERATOR__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUM__OUTBOUND_LINK = AGGREGATION_OPERATOR__OUTBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUM_FEATURE_COUNT = AGGREGATION_OPERATOR_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.WithinTimerImpl <em>Within Timer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.WithinTimerImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getWithinTimer()
	 * @generated
	 */
  int WITHIN_TIMER = 51;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__OUTBOUND_LINK = PATTERN_OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__YEARS = PATTERN_OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__MONTHS = PATTERN_OPERAND_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Weeks</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__WEEKS = PATTERN_OPERAND_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__DAYS = PATTERN_OPERAND_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__HOURS = PATTERN_OPERAND_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__MINUTES = PATTERN_OPERAND_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__SECONDS = PATTERN_OPERAND_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__MILLISECONDS = PATTERN_OPERAND_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Within Timer Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER__WITHIN_TIMER_ELEMENTS = PATTERN_OPERAND_FEATURE_COUNT + 8;

  /**
	 * The number of structural features of the '<em>Within Timer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER_FEATURE_COUNT = PATTERN_OPERAND_FEATURE_COUNT + 9;

  /**
	 * The meta object id for the '{@link eventpattern.impl.WithinTimerElementImpl <em>Within Timer Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.WithinTimerElementImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getWithinTimerElement()
	 * @generated
	 */
  int WITHIN_TIMER_ELEMENT = 52;

  /**
	 * The number of structural features of the '<em>Within Timer Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WITHIN_TIMER_ELEMENT_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link eventpattern.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.TimeIntervalImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getTimeInterval()
	 * @generated
	 */
  int TIME_INTERVAL = 53;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__OUTBOUND_LINK = PATTERN_OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__YEARS = PATTERN_OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__MONTHS = PATTERN_OPERAND_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Weeks</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__WEEKS = PATTERN_OPERAND_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__DAYS = PATTERN_OPERAND_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__HOURS = PATTERN_OPERAND_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__MINUTES = PATTERN_OPERAND_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__SECONDS = PATTERN_OPERAND_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL__MILLISECONDS = PATTERN_OPERAND_FEATURE_COUNT + 7;

  /**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_INTERVAL_FEATURE_COUNT = PATTERN_OPERAND_FEATURE_COUNT + 8;

  /**
	 * The meta object id for the '{@link eventpattern.impl.TimeScheduleImpl <em>Time Schedule</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.TimeScheduleImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getTimeSchedule()
	 * @generated
	 */
  int TIME_SCHEDULE = 54;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__OUTBOUND_LINK = PATTERN_OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__DAY_OF_WEEK = PATTERN_OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Day Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__DAY_OF_MONTH = PATTERN_OPERAND_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__MONTH = PATTERN_OPERAND_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__HOUR = PATTERN_OPERAND_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__MINUTE = PATTERN_OPERAND_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE__SECOND = PATTERN_OPERAND_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Time Schedule</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIME_SCHEDULE_FEATURE_COUNT = PATTERN_OPERAND_FEATURE_COUNT + 6;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EventImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEvent()
	 * @generated
	 */
  int EVENT = 55;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__OUTBOUND_LINK = PATTERN_OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__TYPE_NAME = PATTERN_OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__IMAGE_PATH = PATTERN_OPERAND_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT__EVENT_PROPERTIES = PATTERN_OPERAND_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_FEATURE_COUNT = PATTERN_OPERAND_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EventPropertyImpl <em>Event Property</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EventPropertyImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEventProperty()
	 * @generated
	 */
  int EVENT_PROPERTY = 56;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__OUTBOUND_LINK = CONDITION_OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__NAME = CONDITION_OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__TYPE = CONDITION_OPERAND_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__IMAGE_PATH = CONDITION_OPERAND_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Referenced Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__REFERENCED_EVENT = CONDITION_OPERAND_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Event Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__EVENT_PROPERTIES = CONDITION_OPERAND_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Referenced Event Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY__REFERENCED_EVENT_PROPERTY = CONDITION_OPERAND_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Event Property</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EVENT_PROPERTY_FEATURE_COUNT = CONDITION_OPERAND_FEATURE_COUNT + 6;

  /**
	 * The meta object id for the '{@link eventpattern.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.ValueImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getValue()
	 * @generated
	 */
  int VALUE = 57;

  /**
	 * The feature id for the '<em><b>Outbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__OUTBOUND_LINK = CONDITION_OPERAND__OUTBOUND_LINK;

  /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__VALUE = CONDITION_OPERAND_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__TYPE = CONDITION_OPERAND_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FEATURE_COUNT = CONDITION_OPERAND_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link eventpattern.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.EmailImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getEmail()
	 * @generated
	 */
  int EMAIL = 58;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__INBOUND_LINK = ACTION__INBOUND_LINK;

  /**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__TO = ACTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Cc</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__CC = ACTION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__FROM = ACTION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__SUBJECT = ACTION_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__HOST = ACTION_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__PORT = ACTION_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__USER = ACTION_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL__PASSWORD = ACTION_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__DESCRIPTION = ACTION_FEATURE_COUNT + 8;

		/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMAIL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 9;

  /**
	 * The meta object id for the '{@link eventpattern.impl.TwitterImpl <em>Twitter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.impl.TwitterImpl
	 * @see eventpattern.impl.EventpatternPackageImpl#getTwitter()
	 * @generated
	 */
  int TWITTER = 59;

  /**
	 * The feature id for the '<em><b>Inbound Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TWITTER__INBOUND_LINK = ACTION__INBOUND_LINK;

  /**
	 * The number of structural features of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TWITTER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link eventpattern.PropertyTypeValue <em>Property Type Value</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see eventpattern.PropertyTypeValue
	 * @see eventpattern.impl.EventpatternPackageImpl#getPropertyTypeValue()
	 * @generated
	 */
  int PROPERTY_TYPE_VALUE = 60;


  /**
	 * Returns the meta object for class '{@link eventpattern.CEPEventPattern <em>CEP Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEP Event Pattern</em>'.
	 * @see eventpattern.CEPEventPattern
	 * @generated
	 */
  EClass getCEPEventPattern();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.CEPEventPattern#getPatternName <em>Pattern Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Name</em>'.
	 * @see eventpattern.CEPEventPattern#getPatternName()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EAttribute getCEPEventPattern_PatternName();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.CEPEventPattern#getPatternDescription <em>Pattern Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Description</em>'.
	 * @see eventpattern.CEPEventPattern#getPatternDescription()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EAttribute getCEPEventPattern_PatternDescription();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.CEPEventPattern#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see eventpattern.CEPEventPattern#getDomainName()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EAttribute getCEPEventPattern_DomainName();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.CEPEventPattern#getPatternCreationDate <em>Pattern Creation Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Creation Date</em>'.
	 * @see eventpattern.CEPEventPattern#getPatternCreationDate()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EAttribute getCEPEventPattern_PatternCreationDate();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.CEPEventPattern#isPatternDeployed <em>Pattern Deployed</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Deployed</em>'.
	 * @see eventpattern.CEPEventPattern#isPatternDeployed()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EAttribute getCEPEventPattern_PatternDeployed();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.CEPEventPattern#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see eventpattern.CEPEventPattern#getLinks()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EReference getCEPEventPattern_Links();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.CEPEventPattern#getEventPatternElements <em>Event Pattern Elements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Pattern Elements</em>'.
	 * @see eventpattern.CEPEventPattern#getEventPatternElements()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EReference getCEPEventPattern_EventPatternElements();

  /**
	 * Returns the meta object for the containment reference '{@link eventpattern.CEPEventPattern#getComplexEvent <em>Complex Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Event</em>'.
	 * @see eventpattern.CEPEventPattern#getComplexEvent()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EReference getCEPEventPattern_ComplexEvent();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.CEPEventPattern#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see eventpattern.CEPEventPattern#getActions()
	 * @see #getCEPEventPattern()
	 * @generated
	 */
  EReference getCEPEventPattern_Actions();

  /**
	 * Returns the meta object for class '{@link eventpattern.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see eventpattern.Link
	 * @generated
	 */
  EClass getLink();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Link#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see eventpattern.Link#getOrder()
	 * @see #getLink()
	 * @generated
	 */
  EAttribute getLink_Order();

  /**
	 * Returns the meta object for the reference '{@link eventpattern.Link#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see eventpattern.Link#getOperand()
	 * @see #getLink()
	 * @generated
	 */
  EReference getLink_Operand();

  /**
	 * Returns the meta object for the reference '{@link eventpattern.Link#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator</em>'.
	 * @see eventpattern.Link#getOperator()
	 * @see #getLink()
	 * @generated
	 */
  EReference getLink_Operator();

  /**
	 * Returns the meta object for class '{@link eventpattern.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see eventpattern.Operator
	 * @generated
	 */
  EClass getOperator();

  /**
	 * Returns the meta object for the reference list '{@link eventpattern.Operator#getInboundLink <em>Inbound Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Link</em>'.
	 * @see eventpattern.Operator#getInboundLink()
	 * @see #getOperator()
	 * @generated
	 */
  EReference getOperator_InboundLink();

  /**
	 * Returns the meta object for class '{@link eventpattern.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see eventpattern.UnaryOperator
	 * @generated
	 */
  EClass getUnaryOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see eventpattern.BinaryOperator
	 * @generated
	 */
  EClass getBinaryOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.NaryOperator <em>Nary Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary Operator</em>'.
	 * @see eventpattern.NaryOperator
	 * @generated
	 */
  EClass getNaryOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see eventpattern.Operand
	 * @generated
	 */
  EClass getOperand();

  /**
	 * Returns the meta object for the reference list '{@link eventpattern.Operand#getOutboundLink <em>Outbound Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Link</em>'.
	 * @see eventpattern.Operand#getOutboundLink()
	 * @see #getOperand()
	 * @generated
	 */
  EReference getOperand_OutboundLink();

  /**
	 * Returns the meta object for class '{@link eventpattern.EventPatternElement <em>Event Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Pattern Element</em>'.
	 * @see eventpattern.EventPatternElement
	 * @generated
	 */
  EClass getEventPatternElement();

  /**
	 * Returns the meta object for class '{@link eventpattern.ComplexEvent <em>Complex Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Event</em>'.
	 * @see eventpattern.ComplexEvent
	 * @generated
	 */
  EClass getComplexEvent();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.ComplexEvent#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see eventpattern.ComplexEvent#getTypeName()
	 * @see #getComplexEvent()
	 * @generated
	 */
  EAttribute getComplexEvent_TypeName();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.ComplexEvent#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see eventpattern.ComplexEvent#getImagePath()
	 * @see #getComplexEvent()
	 * @generated
	 */
  EAttribute getComplexEvent_ImagePath();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.ComplexEvent#getComplexEventProperties <em>Complex Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Event Properties</em>'.
	 * @see eventpattern.ComplexEvent#getComplexEventProperties()
	 * @see #getComplexEvent()
	 * @generated
	 */
  EReference getComplexEvent_ComplexEventProperties();

  /**
	 * Returns the meta object for class '{@link eventpattern.ComplexEventProperty <em>Complex Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Event Property</em>'.
	 * @see eventpattern.ComplexEventProperty
	 * @generated
	 */
  EClass getComplexEventProperty();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.ComplexEventProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eventpattern.ComplexEventProperty#getName()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
  EAttribute getComplexEventProperty_Name();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.ComplexEventProperty#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see eventpattern.ComplexEventProperty#getImagePath()
	 * @see #getComplexEventProperty()
	 * @generated
	 */
  EAttribute getComplexEventProperty_ImagePath();

  /**
	 * Returns the meta object for class '{@link eventpattern.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see eventpattern.Action
	 * @generated
	 */
  EClass getAction();

  /**
	 * Returns the meta object for class '{@link eventpattern.DataWindow <em>Data Window</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Window</em>'.
	 * @see eventpattern.DataWindow
	 * @generated
	 */
  EClass getDataWindow();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.DataWindow#getEventPatternConditions <em>Event Pattern Conditions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Pattern Conditions</em>'.
	 * @see eventpattern.DataWindow#getEventPatternConditions()
	 * @see #getDataWindow()
	 * @generated
	 */
  EReference getDataWindow_EventPatternConditions();

  /**
	 * Returns the meta object for class '{@link eventpattern.SlidingEventInterval <em>Sliding Event Interval</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliding Event Interval</em>'.
	 * @see eventpattern.SlidingEventInterval
	 * @generated
	 */
  EClass getSlidingEventInterval();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingEventInterval#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eventpattern.SlidingEventInterval#getSize()
	 * @see #getSlidingEventInterval()
	 * @generated
	 */
  EAttribute getSlidingEventInterval_Size();

  /**
	 * Returns the meta object for class '{@link eventpattern.BatchingEventInterval <em>Batching Event Interval</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batching Event Interval</em>'.
	 * @see eventpattern.BatchingEventInterval
	 * @generated
	 */
  EClass getBatchingEventInterval();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingEventInterval#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eventpattern.BatchingEventInterval#getSize()
	 * @see #getBatchingEventInterval()
	 * @generated
	 */
  EAttribute getBatchingEventInterval_Size();

  /**
	 * Returns the meta object for class '{@link eventpattern.SlidingTimeInterval <em>Sliding Time Interval</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliding Time Interval</em>'.
	 * @see eventpattern.SlidingTimeInterval
	 * @generated
	 */
  EClass getSlidingTimeInterval();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years</em>'.
	 * @see eventpattern.SlidingTimeInterval#getYears()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Years();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getMonths <em>Months</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months</em>'.
	 * @see eventpattern.SlidingTimeInterval#getMonths()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Months();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weeks</em>'.
	 * @see eventpattern.SlidingTimeInterval#getWeeks()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Weeks();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see eventpattern.SlidingTimeInterval#getDays()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Days();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see eventpattern.SlidingTimeInterval#getHours()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Hours();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see eventpattern.SlidingTimeInterval#getMinutes()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Minutes();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see eventpattern.SlidingTimeInterval#getSeconds()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Seconds();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.SlidingTimeInterval#getMilliseconds <em>Milliseconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milliseconds</em>'.
	 * @see eventpattern.SlidingTimeInterval#getMilliseconds()
	 * @see #getSlidingTimeInterval()
	 * @generated
	 */
  EAttribute getSlidingTimeInterval_Milliseconds();

  /**
	 * Returns the meta object for class '{@link eventpattern.BatchingTimeInterval <em>Batching Time Interval</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batching Time Interval</em>'.
	 * @see eventpattern.BatchingTimeInterval
	 * @generated
	 */
  EClass getBatchingTimeInterval();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years</em>'.
	 * @see eventpattern.BatchingTimeInterval#getYears()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Years();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getMonths <em>Months</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months</em>'.
	 * @see eventpattern.BatchingTimeInterval#getMonths()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Months();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weeks</em>'.
	 * @see eventpattern.BatchingTimeInterval#getWeeks()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Weeks();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see eventpattern.BatchingTimeInterval#getDays()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Days();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see eventpattern.BatchingTimeInterval#getHours()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Hours();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see eventpattern.BatchingTimeInterval#getMinutes()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Minutes();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see eventpattern.BatchingTimeInterval#getSeconds()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Seconds();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getMilliseconds <em>Milliseconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milliseconds</em>'.
	 * @see eventpattern.BatchingTimeInterval#getMilliseconds()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
  EAttribute getBatchingTimeInterval_Milliseconds();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.BatchingTimeInterval#getStartTimestamp <em>Start Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Timestamp</em>'.
	 * @see eventpattern.BatchingTimeInterval#getStartTimestamp()
	 * @see #getBatchingTimeInterval()
	 * @generated
	 */
	EAttribute getBatchingTimeInterval_StartTimestamp();

		/**
	 * Returns the meta object for class '{@link eventpattern.EventPatternCondition <em>Event Pattern Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Pattern Condition</em>'.
	 * @see eventpattern.EventPatternCondition
	 * @generated
	 */
  EClass getEventPatternCondition();

  /**
	 * Returns the meta object for class '{@link eventpattern.AggregationOperator <em>Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Operator</em>'.
	 * @see eventpattern.AggregationOperator
	 * @generated
	 */
  EClass getAggregationOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.ConditionOperator <em>Condition Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Operator</em>'.
	 * @see eventpattern.ConditionOperator
	 * @generated
	 */
  EClass getConditionOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.ConditionOperand <em>Condition Operand</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Operand</em>'.
	 * @see eventpattern.ConditionOperand
	 * @generated
	 */
  EClass getConditionOperand();

  /**
	 * Returns the meta object for class '{@link eventpattern.PatternOperator <em>Pattern Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Operator</em>'.
	 * @see eventpattern.PatternOperator
	 * @generated
	 */
  EClass getPatternOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.PatternOperand <em>Pattern Operand</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Operand</em>'.
	 * @see eventpattern.PatternOperand
	 * @generated
	 */
  EClass getPatternOperand();

  /**
	 * Returns the meta object for class '{@link eventpattern.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operator</em>'.
	 * @see eventpattern.ArithmeticOperator
	 * @generated
	 */
  EClass getArithmeticOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator</em>'.
	 * @see eventpattern.ComparisonOperator
	 * @generated
	 */
  EClass getComparisonOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see eventpattern.LogicalOperator
	 * @generated
	 */
  EClass getLogicalOperator();

  /**
	 * Returns the meta object for class '{@link eventpattern.Every <em>Every</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Every</em>'.
	 * @see eventpattern.Every
	 * @generated
	 */
  EClass getEvery();

  /**
	 * Returns the meta object for class '{@link eventpattern.EveryDistinct <em>Every Distinct</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Every Distinct</em>'.
	 * @see eventpattern.EveryDistinct
	 * @generated
	 */
  EClass getEveryDistinct();

  /**
	 * Returns the meta object for class '{@link eventpattern.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see eventpattern.Repeat
	 * @generated
	 */
  EClass getRepeat();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Repeat#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see eventpattern.Repeat#getCount()
	 * @see #getRepeat()
	 * @generated
	 */
  EAttribute getRepeat_Count();

  /**
	 * Returns the meta object for class '{@link eventpattern.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until</em>'.
	 * @see eventpattern.Until
	 * @generated
	 */
  EClass getUntil();

  /**
	 * Returns the meta object for class '{@link eventpattern.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see eventpattern.Range
	 * @generated
	 */
  EClass getRange();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Range#getLowEndpoint <em>Low Endpoint</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Endpoint</em>'.
	 * @see eventpattern.Range#getLowEndpoint()
	 * @see #getRange()
	 * @generated
	 */
  EAttribute getRange_LowEndpoint();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Range#getHighEndpoint <em>High Endpoint</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Endpoint</em>'.
	 * @see eventpattern.Range#getHighEndpoint()
	 * @see #getRange()
	 * @generated
	 */
  EAttribute getRange_HighEndpoint();

  /**
	 * Returns the meta object for class '{@link eventpattern.FollowedBy <em>Followed By</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Followed By</em>'.
	 * @see eventpattern.FollowedBy
	 * @generated
	 */
  EClass getFollowedBy();

  /**
	 * Returns the meta object for class '{@link eventpattern.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see eventpattern.While
	 * @generated
	 */
  EClass getWhile();

  /**
	 * Returns the meta object for class '{@link eventpattern.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see eventpattern.And
	 * @generated
	 */
  EClass getAnd();

  /**
	 * Returns the meta object for class '{@link eventpattern.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see eventpattern.Or
	 * @generated
	 */
  EClass getOr();

  /**
	 * Returns the meta object for class '{@link eventpattern.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see eventpattern.Not
	 * @generated
	 */
  EClass getNot();

  /**
	 * Returns the meta object for class '{@link eventpattern.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see eventpattern.Addition
	 * @generated
	 */
  EClass getAddition();

  /**
	 * Returns the meta object for class '{@link eventpattern.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see eventpattern.Subtraction
	 * @generated
	 */
  EClass getSubtraction();

  /**
	 * Returns the meta object for class '{@link eventpattern.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see eventpattern.Multiplication
	 * @generated
	 */
  EClass getMultiplication();

  /**
	 * Returns the meta object for class '{@link eventpattern.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see eventpattern.Division
	 * @generated
	 */
  EClass getDivision();

  /**
	 * Returns the meta object for class '{@link eventpattern.Modulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulus</em>'.
	 * @see eventpattern.Modulus
	 * @generated
	 */
  EClass getModulus();

  /**
	 * Returns the meta object for class '{@link eventpattern.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see eventpattern.Equal
	 * @generated
	 */
  EClass getEqual();

  /**
	 * Returns the meta object for class '{@link eventpattern.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see eventpattern.NotEqual
	 * @generated
	 */
  EClass getNotEqual();

  /**
	 * Returns the meta object for class '{@link eventpattern.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see eventpattern.LessThan
	 * @generated
	 */
  EClass getLessThan();

  /**
	 * Returns the meta object for class '{@link eventpattern.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see eventpattern.GreaterThan
	 * @generated
	 */
  EClass getGreaterThan();

  /**
	 * Returns the meta object for class '{@link eventpattern.LessEqual <em>Less Equal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Equal</em>'.
	 * @see eventpattern.LessEqual
	 * @generated
	 */
  EClass getLessEqual();

  /**
	 * Returns the meta object for class '{@link eventpattern.GreaterEqual <em>Greater Equal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equal</em>'.
	 * @see eventpattern.GreaterEqual
	 * @generated
	 */
  EClass getGreaterEqual();

  /**
	 * Returns the meta object for class '{@link eventpattern.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see eventpattern.Max
	 * @generated
	 */
  EClass getMax();

  /**
	 * Returns the meta object for class '{@link eventpattern.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see eventpattern.Min
	 * @generated
	 */
  EClass getMin();

  /**
	 * Returns the meta object for class '{@link eventpattern.Avg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg</em>'.
	 * @see eventpattern.Avg
	 * @generated
	 */
  EClass getAvg();

  /**
	 * Returns the meta object for class '{@link eventpattern.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see eventpattern.Count
	 * @generated
	 */
  EClass getCount();

  /**
	 * Returns the meta object for class '{@link eventpattern.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see eventpattern.Sum
	 * @generated
	 */
  EClass getSum();

  /**
	 * Returns the meta object for class '{@link eventpattern.WithinTimer <em>Within Timer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Timer</em>'.
	 * @see eventpattern.WithinTimer
	 * @generated
	 */
  EClass getWithinTimer();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years</em>'.
	 * @see eventpattern.WithinTimer#getYears()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Years();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getMonths <em>Months</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months</em>'.
	 * @see eventpattern.WithinTimer#getMonths()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Months();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weeks</em>'.
	 * @see eventpattern.WithinTimer#getWeeks()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Weeks();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see eventpattern.WithinTimer#getDays()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Days();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see eventpattern.WithinTimer#getHours()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Hours();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see eventpattern.WithinTimer#getMinutes()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Minutes();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see eventpattern.WithinTimer#getSeconds()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Seconds();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.WithinTimer#getMilliseconds <em>Milliseconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milliseconds</em>'.
	 * @see eventpattern.WithinTimer#getMilliseconds()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EAttribute getWithinTimer_Milliseconds();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.WithinTimer#getWithinTimerElements <em>Within Timer Elements</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Within Timer Elements</em>'.
	 * @see eventpattern.WithinTimer#getWithinTimerElements()
	 * @see #getWithinTimer()
	 * @generated
	 */
  EReference getWithinTimer_WithinTimerElements();

  /**
	 * Returns the meta object for class '{@link eventpattern.WithinTimerElement <em>Within Timer Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Timer Element</em>'.
	 * @see eventpattern.WithinTimerElement
	 * @generated
	 */
  EClass getWithinTimerElement();

  /**
	 * Returns the meta object for class '{@link eventpattern.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see eventpattern.TimeInterval
	 * @generated
	 */
  EClass getTimeInterval();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years</em>'.
	 * @see eventpattern.TimeInterval#getYears()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Years();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getMonths <em>Months</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months</em>'.
	 * @see eventpattern.TimeInterval#getMonths()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Months();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weeks</em>'.
	 * @see eventpattern.TimeInterval#getWeeks()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Weeks();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see eventpattern.TimeInterval#getDays()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Days();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see eventpattern.TimeInterval#getHours()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Hours();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see eventpattern.TimeInterval#getMinutes()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Minutes();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see eventpattern.TimeInterval#getSeconds()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Seconds();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeInterval#getMilliseconds <em>Milliseconds</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milliseconds</em>'.
	 * @see eventpattern.TimeInterval#getMilliseconds()
	 * @see #getTimeInterval()
	 * @generated
	 */
  EAttribute getTimeInterval_Milliseconds();

  /**
	 * Returns the meta object for class '{@link eventpattern.TimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Schedule</em>'.
	 * @see eventpattern.TimeSchedule
	 * @generated
	 */
  EClass getTimeSchedule();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeSchedule#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see eventpattern.TimeSchedule#getDayOfWeek()
	 * @see #getTimeSchedule()
	 * @generated
	 */
  EAttribute getTimeSchedule_DayOfWeek();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeSchedule#getDayOfMonth <em>Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Month</em>'.
	 * @see eventpattern.TimeSchedule#getDayOfMonth()
	 * @see #getTimeSchedule()
	 * @generated
	 */
  EAttribute getTimeSchedule_DayOfMonth();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeSchedule#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see eventpattern.TimeSchedule#getMonth()
	 * @see #getTimeSchedule()
	 * @generated
	 */
  EAttribute getTimeSchedule_Month();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeSchedule#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see eventpattern.TimeSchedule#getHour()
	 * @see #getTimeSchedule()
	 * @generated
	 */
  EAttribute getTimeSchedule_Hour();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeSchedule#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see eventpattern.TimeSchedule#getMinute()
	 * @see #getTimeSchedule()
	 * @generated
	 */
  EAttribute getTimeSchedule_Minute();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.TimeSchedule#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see eventpattern.TimeSchedule#getSecond()
	 * @see #getTimeSchedule()
	 * @generated
	 */
  EAttribute getTimeSchedule_Second();

  /**
	 * Returns the meta object for class '{@link eventpattern.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see eventpattern.Event
	 * @generated
	 */
  EClass getEvent();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Event#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see eventpattern.Event#getTypeName()
	 * @see #getEvent()
	 * @generated
	 */
  EAttribute getEvent_TypeName();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Event#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see eventpattern.Event#getImagePath()
	 * @see #getEvent()
	 * @generated
	 */
  EAttribute getEvent_ImagePath();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.Event#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Properties</em>'.
	 * @see eventpattern.Event#getEventProperties()
	 * @see #getEvent()
	 * @generated
	 */
  EReference getEvent_EventProperties();

  /**
	 * Returns the meta object for class '{@link eventpattern.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Property</em>'.
	 * @see eventpattern.EventProperty
	 * @generated
	 */
  EClass getEventProperty();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.EventProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eventpattern.EventProperty#getName()
	 * @see #getEventProperty()
	 * @generated
	 */
  EAttribute getEventProperty_Name();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.EventProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eventpattern.EventProperty#getType()
	 * @see #getEventProperty()
	 * @generated
	 */
  EAttribute getEventProperty_Type();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.EventProperty#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see eventpattern.EventProperty#getImagePath()
	 * @see #getEventProperty()
	 * @generated
	 */
  EAttribute getEventProperty_ImagePath();

  /**
	 * Returns the meta object for the container reference '{@link eventpattern.EventProperty#getReferencedEvent <em>Referenced Event</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Event</em>'.
	 * @see eventpattern.EventProperty#getReferencedEvent()
	 * @see #getEventProperty()
	 * @generated
	 */
  EReference getEventProperty_ReferencedEvent();

  /**
	 * Returns the meta object for the containment reference list '{@link eventpattern.EventProperty#getEventProperties <em>Event Properties</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Properties</em>'.
	 * @see eventpattern.EventProperty#getEventProperties()
	 * @see #getEventProperty()
	 * @generated
	 */
  EReference getEventProperty_EventProperties();

  /**
	 * Returns the meta object for the container reference '{@link eventpattern.EventProperty#getReferencedEventProperty <em>Referenced Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referenced Event Property</em>'.
	 * @see eventpattern.EventProperty#getReferencedEventProperty()
	 * @see #getEventProperty()
	 * @generated
	 */
  EReference getEventProperty_ReferencedEventProperty();

  /**
	 * Returns the meta object for class '{@link eventpattern.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see eventpattern.Value
	 * @generated
	 */
  EClass getValue();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eventpattern.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
  EAttribute getValue_Value();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Value#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eventpattern.Value#getType()
	 * @see #getValue()
	 * @generated
	 */
  EAttribute getValue_Type();

  /**
	 * Returns the meta object for class '{@link eventpattern.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see eventpattern.Email
	 * @generated
	 */
  EClass getEmail();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see eventpattern.Email#getTo()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_To();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getCc <em>Cc</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc</em>'.
	 * @see eventpattern.Email#getCc()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_Cc();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see eventpattern.Email#getFrom()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_From();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see eventpattern.Email#getSubject()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_Subject();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see eventpattern.Email#getHost()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_Host();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see eventpattern.Email#getPort()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_Port();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see eventpattern.Email#getUser()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_User();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see eventpattern.Email#getPassword()
	 * @see #getEmail()
	 * @generated
	 */
  EAttribute getEmail_Password();

  /**
	 * Returns the meta object for the attribute '{@link eventpattern.Email#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eventpattern.Email#getDescription()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Description();

		/**
	 * Returns the meta object for class '{@link eventpattern.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter</em>'.
	 * @see eventpattern.Twitter
	 * @generated
	 */
  EClass getTwitter();

  /**
	 * Returns the meta object for enum '{@link eventpattern.PropertyTypeValue <em>Property Type Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type Value</em>'.
	 * @see eventpattern.PropertyTypeValue
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
  EventpatternFactory getEventpatternFactory();

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
		 * The meta object literal for the '{@link eventpattern.impl.CEPEventPatternImpl <em>CEP Event Pattern</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.CEPEventPatternImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getCEPEventPattern()
		 * @generated
		 */
    EClass CEP_EVENT_PATTERN = eINSTANCE.getCEPEventPattern();

    /**
		 * The meta object literal for the '<em><b>Pattern Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_EVENT_PATTERN__PATTERN_NAME = eINSTANCE.getCEPEventPattern_PatternName();

    /**
		 * The meta object literal for the '<em><b>Pattern Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_EVENT_PATTERN__PATTERN_DESCRIPTION = eINSTANCE.getCEPEventPattern_PatternDescription();

    /**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_EVENT_PATTERN__DOMAIN_NAME = eINSTANCE.getCEPEventPattern_DomainName();

    /**
		 * The meta object literal for the '<em><b>Pattern Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_EVENT_PATTERN__PATTERN_CREATION_DATE = eINSTANCE.getCEPEventPattern_PatternCreationDate();

    /**
		 * The meta object literal for the '<em><b>Pattern Deployed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CEP_EVENT_PATTERN__PATTERN_DEPLOYED = eINSTANCE.getCEPEventPattern_PatternDeployed();

    /**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CEP_EVENT_PATTERN__LINKS = eINSTANCE.getCEPEventPattern_Links();

    /**
		 * The meta object literal for the '<em><b>Event Pattern Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS = eINSTANCE.getCEPEventPattern_EventPatternElements();

    /**
		 * The meta object literal for the '<em><b>Complex Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CEP_EVENT_PATTERN__COMPLEX_EVENT = eINSTANCE.getCEPEventPattern_ComplexEvent();

    /**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CEP_EVENT_PATTERN__ACTIONS = eINSTANCE.getCEPEventPattern_Actions();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.LinkImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getLink()
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
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LINK__OPERAND = eINSTANCE.getLink_Operand();

    /**
		 * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LINK__OPERATOR = eINSTANCE.getLink_Operator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.OperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getOperator()
		 * @generated
		 */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
		 * The meta object literal for the '<em><b>Inbound Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OPERATOR__INBOUND_LINK = eINSTANCE.getOperator_InboundLink();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.UnaryOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getUnaryOperator()
		 * @generated
		 */
    EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.BinaryOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getBinaryOperator()
		 * @generated
		 */
    EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.NaryOperatorImpl <em>Nary Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.NaryOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getNaryOperator()
		 * @generated
		 */
    EClass NARY_OPERATOR = eINSTANCE.getNaryOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.OperandImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getOperand()
		 * @generated
		 */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
		 * The meta object literal for the '<em><b>Outbound Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OPERAND__OUTBOUND_LINK = eINSTANCE.getOperand_OutboundLink();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.EventPatternElementImpl <em>Event Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EventPatternElementImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEventPatternElement()
		 * @generated
		 */
    EClass EVENT_PATTERN_ELEMENT = eINSTANCE.getEventPatternElement();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.ComplexEventImpl <em>Complex Event</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ComplexEventImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getComplexEvent()
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
		 * The meta object literal for the '{@link eventpattern.impl.ComplexEventPropertyImpl <em>Complex Event Property</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ComplexEventPropertyImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getComplexEventProperty()
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
		 * The meta object literal for the '{@link eventpattern.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ActionImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getAction()
		 * @generated
		 */
    EClass ACTION = eINSTANCE.getAction();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.DataWindowImpl <em>Data Window</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.DataWindowImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getDataWindow()
		 * @generated
		 */
    EClass DATA_WINDOW = eINSTANCE.getDataWindow();

    /**
		 * The meta object literal for the '<em><b>Event Pattern Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DATA_WINDOW__EVENT_PATTERN_CONDITIONS = eINSTANCE.getDataWindow_EventPatternConditions();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.SlidingEventIntervalImpl <em>Sliding Event Interval</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.SlidingEventIntervalImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getSlidingEventInterval()
		 * @generated
		 */
    EClass SLIDING_EVENT_INTERVAL = eINSTANCE.getSlidingEventInterval();

    /**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_EVENT_INTERVAL__SIZE = eINSTANCE.getSlidingEventInterval_Size();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.BatchingEventIntervalImpl <em>Batching Event Interval</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.BatchingEventIntervalImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getBatchingEventInterval()
		 * @generated
		 */
    EClass BATCHING_EVENT_INTERVAL = eINSTANCE.getBatchingEventInterval();

    /**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_EVENT_INTERVAL__SIZE = eINSTANCE.getBatchingEventInterval_Size();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.SlidingTimeIntervalImpl <em>Sliding Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.SlidingTimeIntervalImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getSlidingTimeInterval()
		 * @generated
		 */
    EClass SLIDING_TIME_INTERVAL = eINSTANCE.getSlidingTimeInterval();

    /**
		 * The meta object literal for the '<em><b>Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__YEARS = eINSTANCE.getSlidingTimeInterval_Years();

    /**
		 * The meta object literal for the '<em><b>Months</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__MONTHS = eINSTANCE.getSlidingTimeInterval_Months();

    /**
		 * The meta object literal for the '<em><b>Weeks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__WEEKS = eINSTANCE.getSlidingTimeInterval_Weeks();

    /**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__DAYS = eINSTANCE.getSlidingTimeInterval_Days();

    /**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__HOURS = eINSTANCE.getSlidingTimeInterval_Hours();

    /**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__MINUTES = eINSTANCE.getSlidingTimeInterval_Minutes();

    /**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__SECONDS = eINSTANCE.getSlidingTimeInterval_Seconds();

    /**
		 * The meta object literal for the '<em><b>Milliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SLIDING_TIME_INTERVAL__MILLISECONDS = eINSTANCE.getSlidingTimeInterval_Milliseconds();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.BatchingTimeIntervalImpl <em>Batching Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.BatchingTimeIntervalImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getBatchingTimeInterval()
		 * @generated
		 */
    EClass BATCHING_TIME_INTERVAL = eINSTANCE.getBatchingTimeInterval();

    /**
		 * The meta object literal for the '<em><b>Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__YEARS = eINSTANCE.getBatchingTimeInterval_Years();

    /**
		 * The meta object literal for the '<em><b>Months</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__MONTHS = eINSTANCE.getBatchingTimeInterval_Months();

    /**
		 * The meta object literal for the '<em><b>Weeks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__WEEKS = eINSTANCE.getBatchingTimeInterval_Weeks();

    /**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__DAYS = eINSTANCE.getBatchingTimeInterval_Days();

    /**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__HOURS = eINSTANCE.getBatchingTimeInterval_Hours();

    /**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__MINUTES = eINSTANCE.getBatchingTimeInterval_Minutes();

    /**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__SECONDS = eINSTANCE.getBatchingTimeInterval_Seconds();

    /**
		 * The meta object literal for the '<em><b>Milliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BATCHING_TIME_INTERVAL__MILLISECONDS = eINSTANCE.getBatchingTimeInterval_Milliseconds();

    /**
		 * The meta object literal for the '<em><b>Start Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCHING_TIME_INTERVAL__START_TIMESTAMP = eINSTANCE.getBatchingTimeInterval_StartTimestamp();

				/**
		 * The meta object literal for the '{@link eventpattern.impl.EventPatternConditionImpl <em>Event Pattern Condition</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EventPatternConditionImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEventPatternCondition()
		 * @generated
		 */
    EClass EVENT_PATTERN_CONDITION = eINSTANCE.getEventPatternCondition();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.AggregationOperatorImpl <em>Aggregation Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.AggregationOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getAggregationOperator()
		 * @generated
		 */
    EClass AGGREGATION_OPERATOR = eINSTANCE.getAggregationOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.ConditionOperatorImpl <em>Condition Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ConditionOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getConditionOperator()
		 * @generated
		 */
    EClass CONDITION_OPERATOR = eINSTANCE.getConditionOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.ConditionOperandImpl <em>Condition Operand</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ConditionOperandImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getConditionOperand()
		 * @generated
		 */
    EClass CONDITION_OPERAND = eINSTANCE.getConditionOperand();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.PatternOperatorImpl <em>Pattern Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.PatternOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getPatternOperator()
		 * @generated
		 */
    EClass PATTERN_OPERATOR = eINSTANCE.getPatternOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.PatternOperandImpl <em>Pattern Operand</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.PatternOperandImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getPatternOperand()
		 * @generated
		 */
    EClass PATTERN_OPERAND = eINSTANCE.getPatternOperand();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ArithmeticOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getArithmeticOperator()
		 * @generated
		 */
    EClass ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ComparisonOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getComparisonOperator()
		 * @generated
		 */
    EClass COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.LogicalOperatorImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getLogicalOperator()
		 * @generated
		 */
    EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.EveryImpl <em>Every</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EveryImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEvery()
		 * @generated
		 */
    EClass EVERY = eINSTANCE.getEvery();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.EveryDistinctImpl <em>Every Distinct</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EveryDistinctImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEveryDistinct()
		 * @generated
		 */
    EClass EVERY_DISTINCT = eINSTANCE.getEveryDistinct();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.RepeatImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getRepeat()
		 * @generated
		 */
    EClass REPEAT = eINSTANCE.getRepeat();

    /**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REPEAT__COUNT = eINSTANCE.getRepeat_Count();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.UntilImpl <em>Until</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.UntilImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getUntil()
		 * @generated
		 */
    EClass UNTIL = eINSTANCE.getUntil();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.RangeImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getRange()
		 * @generated
		 */
    EClass RANGE = eINSTANCE.getRange();

    /**
		 * The meta object literal for the '<em><b>Low Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RANGE__LOW_ENDPOINT = eINSTANCE.getRange_LowEndpoint();

    /**
		 * The meta object literal for the '<em><b>High Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RANGE__HIGH_ENDPOINT = eINSTANCE.getRange_HighEndpoint();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.FollowedByImpl <em>Followed By</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.FollowedByImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getFollowedBy()
		 * @generated
		 */
    EClass FOLLOWED_BY = eINSTANCE.getFollowedBy();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.WhileImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getWhile()
		 * @generated
		 */
    EClass WHILE = eINSTANCE.getWhile();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.AndImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getAnd()
		 * @generated
		 */
    EClass AND = eINSTANCE.getAnd();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.OrImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getOr()
		 * @generated
		 */
    EClass OR = eINSTANCE.getOr();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.NotImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getNot()
		 * @generated
		 */
    EClass NOT = eINSTANCE.getNot();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.AdditionImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getAddition()
		 * @generated
		 */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.SubtractionImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getSubtraction()
		 * @generated
		 */
    EClass SUBTRACTION = eINSTANCE.getSubtraction();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.MultiplicationImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getMultiplication()
		 * @generated
		 */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.DivisionImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getDivision()
		 * @generated
		 */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.ModulusImpl <em>Modulus</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ModulusImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getModulus()
		 * @generated
		 */
    EClass MODULUS = eINSTANCE.getModulus();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EqualImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEqual()
		 * @generated
		 */
    EClass EQUAL = eINSTANCE.getEqual();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.NotEqualImpl <em>Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.NotEqualImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getNotEqual()
		 * @generated
		 */
    EClass NOT_EQUAL = eINSTANCE.getNotEqual();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.LessThanImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getLessThan()
		 * @generated
		 */
    EClass LESS_THAN = eINSTANCE.getLessThan();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.GreaterThanImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getGreaterThan()
		 * @generated
		 */
    EClass GREATER_THAN = eINSTANCE.getGreaterThan();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.LessEqualImpl <em>Less Equal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.LessEqualImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getLessEqual()
		 * @generated
		 */
    EClass LESS_EQUAL = eINSTANCE.getLessEqual();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.GreaterEqualImpl <em>Greater Equal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.GreaterEqualImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getGreaterEqual()
		 * @generated
		 */
    EClass GREATER_EQUAL = eINSTANCE.getGreaterEqual();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.MaxImpl <em>Max</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.MaxImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getMax()
		 * @generated
		 */
    EClass MAX = eINSTANCE.getMax();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.MinImpl <em>Min</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.MinImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getMin()
		 * @generated
		 */
    EClass MIN = eINSTANCE.getMin();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.AvgImpl <em>Avg</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.AvgImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getAvg()
		 * @generated
		 */
    EClass AVG = eINSTANCE.getAvg();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.CountImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getCount()
		 * @generated
		 */
    EClass COUNT = eINSTANCE.getCount();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.SumImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getSum()
		 * @generated
		 */
    EClass SUM = eINSTANCE.getSum();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.WithinTimerImpl <em>Within Timer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.WithinTimerImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getWithinTimer()
		 * @generated
		 */
    EClass WITHIN_TIMER = eINSTANCE.getWithinTimer();

    /**
		 * The meta object literal for the '<em><b>Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__YEARS = eINSTANCE.getWithinTimer_Years();

    /**
		 * The meta object literal for the '<em><b>Months</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__MONTHS = eINSTANCE.getWithinTimer_Months();

    /**
		 * The meta object literal for the '<em><b>Weeks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__WEEKS = eINSTANCE.getWithinTimer_Weeks();

    /**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__DAYS = eINSTANCE.getWithinTimer_Days();

    /**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__HOURS = eINSTANCE.getWithinTimer_Hours();

    /**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__MINUTES = eINSTANCE.getWithinTimer_Minutes();

    /**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__SECONDS = eINSTANCE.getWithinTimer_Seconds();

    /**
		 * The meta object literal for the '<em><b>Milliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WITHIN_TIMER__MILLISECONDS = eINSTANCE.getWithinTimer_Milliseconds();

    /**
		 * The meta object literal for the '<em><b>Within Timer Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WITHIN_TIMER__WITHIN_TIMER_ELEMENTS = eINSTANCE.getWithinTimer_WithinTimerElements();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.WithinTimerElementImpl <em>Within Timer Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.WithinTimerElementImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getWithinTimerElement()
		 * @generated
		 */
    EClass WITHIN_TIMER_ELEMENT = eINSTANCE.getWithinTimerElement();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.TimeIntervalImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getTimeInterval()
		 * @generated
		 */
    EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

    /**
		 * The meta object literal for the '<em><b>Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__YEARS = eINSTANCE.getTimeInterval_Years();

    /**
		 * The meta object literal for the '<em><b>Months</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__MONTHS = eINSTANCE.getTimeInterval_Months();

    /**
		 * The meta object literal for the '<em><b>Weeks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__WEEKS = eINSTANCE.getTimeInterval_Weeks();

    /**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__DAYS = eINSTANCE.getTimeInterval_Days();

    /**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__HOURS = eINSTANCE.getTimeInterval_Hours();

    /**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__MINUTES = eINSTANCE.getTimeInterval_Minutes();

    /**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__SECONDS = eINSTANCE.getTimeInterval_Seconds();

    /**
		 * The meta object literal for the '<em><b>Milliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_INTERVAL__MILLISECONDS = eINSTANCE.getTimeInterval_Milliseconds();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.TimeScheduleImpl <em>Time Schedule</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.TimeScheduleImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getTimeSchedule()
		 * @generated
		 */
    EClass TIME_SCHEDULE = eINSTANCE.getTimeSchedule();

    /**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_SCHEDULE__DAY_OF_WEEK = eINSTANCE.getTimeSchedule_DayOfWeek();

    /**
		 * The meta object literal for the '<em><b>Day Of Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_SCHEDULE__DAY_OF_MONTH = eINSTANCE.getTimeSchedule_DayOfMonth();

    /**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_SCHEDULE__MONTH = eINSTANCE.getTimeSchedule_Month();

    /**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_SCHEDULE__HOUR = eINSTANCE.getTimeSchedule_Hour();

    /**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_SCHEDULE__MINUTE = eINSTANCE.getTimeSchedule_Minute();

    /**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIME_SCHEDULE__SECOND = eINSTANCE.getTimeSchedule_Second();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EventImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEvent()
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
		 * The meta object literal for the '{@link eventpattern.impl.EventPropertyImpl <em>Event Property</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EventPropertyImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEventProperty()
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
		 * The meta object literal for the '{@link eventpattern.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.ValueImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getValue()
		 * @generated
		 */
    EClass VALUE = eINSTANCE.getValue();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VALUE__TYPE = eINSTANCE.getValue_Type();

    /**
		 * The meta object literal for the '{@link eventpattern.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.EmailImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getEmail()
		 * @generated
		 */
    EClass EMAIL = eINSTANCE.getEmail();

    /**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__TO = eINSTANCE.getEmail_To();

    /**
		 * The meta object literal for the '<em><b>Cc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__CC = eINSTANCE.getEmail_Cc();

    /**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__FROM = eINSTANCE.getEmail_From();

    /**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__SUBJECT = eINSTANCE.getEmail_Subject();

    /**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__HOST = eINSTANCE.getEmail_Host();

    /**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__PORT = eINSTANCE.getEmail_Port();

    /**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__USER = eINSTANCE.getEmail_User();

    /**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMAIL__PASSWORD = eINSTANCE.getEmail_Password();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__DESCRIPTION = eINSTANCE.getEmail_Description();

				/**
		 * The meta object literal for the '{@link eventpattern.impl.TwitterImpl <em>Twitter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.impl.TwitterImpl
		 * @see eventpattern.impl.EventpatternPackageImpl#getTwitter()
		 * @generated
		 */
    EClass TWITTER = eINSTANCE.getTwitter();

    /**
		 * The meta object literal for the '{@link eventpattern.PropertyTypeValue <em>Property Type Value</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see eventpattern.PropertyTypeValue
		 * @see eventpattern.impl.EventpatternPackageImpl#getPropertyTypeValue()
		 * @generated
		 */
    EEnum PROPERTY_TYPE_VALUE = eINSTANCE.getPropertyTypeValue();

  }

} //EventpatternPackage
