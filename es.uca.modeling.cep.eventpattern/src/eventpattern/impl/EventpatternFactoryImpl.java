/**
 */
package eventpattern.impl;

import eventpattern.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventpatternFactoryImpl extends EFactoryImpl implements EventpatternFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EventpatternFactory init()
  {
		try {
			EventpatternFactory theEventpatternFactory = (EventpatternFactory)EPackage.Registry.INSTANCE.getEFactory(EventpatternPackage.eNS_URI);
			if (theEventpatternFactory != null) {
				return theEventpatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EventpatternFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EventpatternFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case EventpatternPackage.CEP_EVENT_PATTERN: return createCEPEventPattern();
			case EventpatternPackage.LINK: return createLink();
			case EventpatternPackage.COMPLEX_EVENT: return createComplexEvent();
			case EventpatternPackage.COMPLEX_EVENT_PROPERTY: return createComplexEventProperty();
			case EventpatternPackage.SLIDING_EVENT_INTERVAL: return createSlidingEventInterval();
			case EventpatternPackage.BATCHING_EVENT_INTERVAL: return createBatchingEventInterval();
			case EventpatternPackage.SLIDING_TIME_INTERVAL: return createSlidingTimeInterval();
			case EventpatternPackage.BATCHING_TIME_INTERVAL: return createBatchingTimeInterval();
			case EventpatternPackage.EVERY: return createEvery();
			case EventpatternPackage.EVERY_DISTINCT: return createEveryDistinct();
			case EventpatternPackage.REPEAT: return createRepeat();
			case EventpatternPackage.UNTIL: return createUntil();
			case EventpatternPackage.RANGE: return createRange();
			case EventpatternPackage.FOLLOWED_BY: return createFollowedBy();
			case EventpatternPackage.WHILE: return createWhile();
			case EventpatternPackage.AND: return createAnd();
			case EventpatternPackage.OR: return createOr();
			case EventpatternPackage.NOT: return createNot();
			case EventpatternPackage.ADDITION: return createAddition();
			case EventpatternPackage.SUBTRACTION: return createSubtraction();
			case EventpatternPackage.MULTIPLICATION: return createMultiplication();
			case EventpatternPackage.DIVISION: return createDivision();
			case EventpatternPackage.MODULUS: return createModulus();
			case EventpatternPackage.EQUAL: return createEqual();
			case EventpatternPackage.NOT_EQUAL: return createNotEqual();
			case EventpatternPackage.LESS_THAN: return createLessThan();
			case EventpatternPackage.GREATER_THAN: return createGreaterThan();
			case EventpatternPackage.LESS_EQUAL: return createLessEqual();
			case EventpatternPackage.GREATER_EQUAL: return createGreaterEqual();
			case EventpatternPackage.MAX: return createMax();
			case EventpatternPackage.MIN: return createMin();
			case EventpatternPackage.AVG: return createAvg();
			case EventpatternPackage.COUNT: return createCount();
			case EventpatternPackage.SUM: return createSum();
			case EventpatternPackage.WITHIN_TIMER: return createWithinTimer();
			case EventpatternPackage.TIME_INTERVAL: return createTimeInterval();
			case EventpatternPackage.TIME_SCHEDULE: return createTimeSchedule();
			case EventpatternPackage.EVENT: return createEvent();
			case EventpatternPackage.EVENT_PROPERTY: return createEventProperty();
			case EventpatternPackage.VALUE: return createValue();
			case EventpatternPackage.EMAIL: return createEmail();
			case EventpatternPackage.TWITTER: return createTwitter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case EventpatternPackage.PROPERTY_TYPE_VALUE:
				return createPropertyTypeValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case EventpatternPackage.PROPERTY_TYPE_VALUE:
				return convertPropertyTypeValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CEPEventPattern createCEPEventPattern()
  {
		CEPEventPatternImpl cepEventPattern = new CEPEventPatternImpl();
		return cepEventPattern;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Link createLink()
  {
		LinkImpl link = new LinkImpl();
		return link;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComplexEvent createComplexEvent()
  {
		ComplexEventImpl complexEvent = new ComplexEventImpl();
		return complexEvent;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComplexEventProperty createComplexEventProperty()
  {
		ComplexEventPropertyImpl complexEventProperty = new ComplexEventPropertyImpl();
		return complexEventProperty;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SlidingEventInterval createSlidingEventInterval()
  {
		SlidingEventIntervalImpl slidingEventInterval = new SlidingEventIntervalImpl();
		return slidingEventInterval;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BatchingEventInterval createBatchingEventInterval()
  {
		BatchingEventIntervalImpl batchingEventInterval = new BatchingEventIntervalImpl();
		return batchingEventInterval;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SlidingTimeInterval createSlidingTimeInterval()
  {
		SlidingTimeIntervalImpl slidingTimeInterval = new SlidingTimeIntervalImpl();
		return slidingTimeInterval;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BatchingTimeInterval createBatchingTimeInterval()
  {
		BatchingTimeIntervalImpl batchingTimeInterval = new BatchingTimeIntervalImpl();
		return batchingTimeInterval;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Every createEvery()
  {
		EveryImpl every = new EveryImpl();
		return every;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EveryDistinct createEveryDistinct()
  {
		EveryDistinctImpl everyDistinct = new EveryDistinctImpl();
		return everyDistinct;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Repeat createRepeat()
  {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Until createUntil()
  {
		UntilImpl until = new UntilImpl();
		return until;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Range createRange()
  {
		RangeImpl range = new RangeImpl();
		return range;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FollowedBy createFollowedBy()
  {
		FollowedByImpl followedBy = new FollowedByImpl();
		return followedBy;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public While createWhile()
  {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public And createAnd()
  {
		AndImpl and = new AndImpl();
		return and;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Or createOr()
  {
		OrImpl or = new OrImpl();
		return or;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Not createNot()
  {
		NotImpl not = new NotImpl();
		return not;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Addition createAddition()
  {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Subtraction createSubtraction()
  {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Multiplication createMultiplication()
  {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Division createDivision()
  {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Modulus createModulus()
  {
		ModulusImpl modulus = new ModulusImpl();
		return modulus;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Equal createEqual()
  {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotEqual createNotEqual()
  {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LessThan createLessThan()
  {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GreaterThan createGreaterThan()
  {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LessEqual createLessEqual()
  {
		LessEqualImpl lessEqual = new LessEqualImpl();
		return lessEqual;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GreaterEqual createGreaterEqual()
  {
		GreaterEqualImpl greaterEqual = new GreaterEqualImpl();
		return greaterEqual;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Max createMax()
  {
		MaxImpl max = new MaxImpl();
		return max;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Min createMin()
  {
		MinImpl min = new MinImpl();
		return min;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Avg createAvg()
  {
		AvgImpl avg = new AvgImpl();
		return avg;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Count createCount()
  {
		CountImpl count = new CountImpl();
		return count;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sum createSum()
  {
		SumImpl sum = new SumImpl();
		return sum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WithinTimer createWithinTimer()
  {
		WithinTimerImpl withinTimer = new WithinTimerImpl();
		return withinTimer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TimeInterval createTimeInterval()
  {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TimeSchedule createTimeSchedule()
  {
		TimeScheduleImpl timeSchedule = new TimeScheduleImpl();
		return timeSchedule;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Event createEvent()
  {
		EventImpl event = new EventImpl();
		return event;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EventProperty createEventProperty()
  {
		EventPropertyImpl eventProperty = new EventPropertyImpl();
		return eventProperty;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value createValue()
  {
		ValueImpl value = new ValueImpl();
		return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Email createEmail()
  {
		EmailImpl email = new EmailImpl();
		return email;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Twitter createTwitter()
  {
		TwitterImpl twitter = new TwitterImpl();
		return twitter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PropertyTypeValue createPropertyTypeValueFromString(EDataType eDataType, String initialValue)
  {
		PropertyTypeValue result = PropertyTypeValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPropertyTypeValueToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EventpatternPackage getEventpatternPackage()
  {
		return (EventpatternPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EventpatternPackage getPackage()
  {
		return EventpatternPackage.eINSTANCE;
	}

} //EventpatternFactoryImpl
