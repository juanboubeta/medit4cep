/**
 */
package eventpattern.impl;

import eventpattern.Action;
import eventpattern.Addition;
import eventpattern.AggregationOperator;
import eventpattern.And;
import eventpattern.ArithmeticOperator;
import eventpattern.Avg;
import eventpattern.BatchingEventInterval;
import eventpattern.BatchingTimeInterval;
import eventpattern.BinaryOperator;
import eventpattern.CEPEventPattern;
import eventpattern.ComparisonOperator;
import eventpattern.ComplexEvent;
import eventpattern.ComplexEventProperty;
import eventpattern.ConditionOperand;
import eventpattern.ConditionOperator;
import eventpattern.Count;
import eventpattern.DataWindow;
import eventpattern.Division;
import eventpattern.Email;
import eventpattern.Equal;
import eventpattern.Event;
import eventpattern.EventPatternCondition;
import eventpattern.EventPatternElement;
import eventpattern.EventProperty;
import eventpattern.EventpatternFactory;
import eventpattern.EventpatternPackage;
import eventpattern.Every;
import eventpattern.EveryDistinct;
import eventpattern.FollowedBy;
import eventpattern.GreaterEqual;
import eventpattern.GreaterThan;
import eventpattern.LessEqual;
import eventpattern.LessThan;
import eventpattern.Link;
import eventpattern.LogicalOperator;
import eventpattern.Max;
import eventpattern.Min;
import eventpattern.Modulus;
import eventpattern.Multiplication;
import eventpattern.NaryOperator;
import eventpattern.Not;
import eventpattern.NotEqual;
import eventpattern.Operand;
import eventpattern.Operator;
import eventpattern.Or;
import eventpattern.PatternOperand;
import eventpattern.PatternOperator;
import eventpattern.PropertyTypeValue;
import eventpattern.Range;
import eventpattern.Repeat;
import eventpattern.SlidingEventInterval;
import eventpattern.SlidingTimeInterval;
import eventpattern.Subtraction;
import eventpattern.Sum;
import eventpattern.TimeInterval;
import eventpattern.TimeSchedule;
import eventpattern.Twitter;
import eventpattern.UnaryOperator;
import eventpattern.Until;
import eventpattern.Value;
import eventpattern.While;
import eventpattern.WithinTimer;
import eventpattern.WithinTimerElement;

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
public class EventpatternPackageImpl extends EPackageImpl implements EventpatternPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cepEventPatternEClass = null;

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
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naryOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventPatternElementEClass = null;

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
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataWindowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slidingEventIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass batchingEventIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slidingTimeIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass batchingTimeIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventPatternConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregationOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass everyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass everyDistinctEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass untilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass followedByEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lessThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greaterThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lessEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greaterEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withinTimerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withinTimerElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeScheduleEClass = null;

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
  private EClass valueEClass = null;

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
  private EClass twitterEClass = null;

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
   * @see eventpattern.EventpatternPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EventpatternPackageImpl()
  {
    super(eNS_URI, EventpatternFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EventpatternPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EventpatternPackage init()
  {
    if (isInited) return (EventpatternPackage)EPackage.Registry.INSTANCE.getEPackage(EventpatternPackage.eNS_URI);

    // Obtain or create and register package
    EventpatternPackageImpl theEventpatternPackage = (EventpatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventpatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventpatternPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEventpatternPackage.createPackageContents();

    // Initialize created meta-data
    theEventpatternPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEventpatternPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EventpatternPackage.eNS_URI, theEventpatternPackage);
    return theEventpatternPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCEPEventPattern()
  {
    return cepEventPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCEPEventPattern_PatternName()
  {
    return (EAttribute)cepEventPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCEPEventPattern_PatternDescription()
  {
    return (EAttribute)cepEventPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCEPEventPattern_DomainName()
  {
    return (EAttribute)cepEventPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCEPEventPattern_PatternCreationDate()
  {
    return (EAttribute)cepEventPatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCEPEventPattern_PatternDeployed()
  {
    return (EAttribute)cepEventPatternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCEPEventPattern_Links()
  {
    return (EReference)cepEventPatternEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCEPEventPattern_EventPatternElements()
  {
    return (EReference)cepEventPatternEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCEPEventPattern_ComplexEvent()
  {
    return (EReference)cepEventPatternEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCEPEventPattern_Actions()
  {
    return (EReference)cepEventPatternEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Order()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Operand()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Operator()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_InboundLink()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryOperator()
  {
    return unaryOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryOperator()
  {
    return binaryOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaryOperator()
  {
    return naryOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperand()
  {
    return operandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperand_OutboundLink()
  {
    return (EReference)operandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventPatternElement()
  {
    return eventPatternElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexEvent()
  {
    return complexEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexEvent_TypeName()
  {
    return (EAttribute)complexEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexEvent_ImagePath()
  {
    return (EAttribute)complexEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexEvent_ComplexEventProperties()
  {
    return (EReference)complexEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexEventProperty()
  {
    return complexEventPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexEventProperty_Name()
  {
    return (EAttribute)complexEventPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexEventProperty_ImagePath()
  {
    return (EAttribute)complexEventPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataWindow()
  {
    return dataWindowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataWindow_EventPatternConditions()
  {
    return (EReference)dataWindowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlidingEventInterval()
  {
    return slidingEventIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingEventInterval_Size()
  {
    return (EAttribute)slidingEventIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBatchingEventInterval()
  {
    return batchingEventIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingEventInterval_Size()
  {
    return (EAttribute)batchingEventIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlidingTimeInterval()
  {
    return slidingTimeIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Years()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Months()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Weeks()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Days()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Hours()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Minutes()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Seconds()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlidingTimeInterval_Milliseconds()
  {
    return (EAttribute)slidingTimeIntervalEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBatchingTimeInterval()
  {
    return batchingTimeIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Years()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Months()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Weeks()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Days()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Hours()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Minutes()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Seconds()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBatchingTimeInterval_Milliseconds()
  {
    return (EAttribute)batchingTimeIntervalEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventPatternCondition()
  {
    return eventPatternConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregationOperator()
  {
    return aggregationOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionOperator()
  {
    return conditionOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionOperand()
  {
    return conditionOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternOperator()
  {
    return patternOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternOperand()
  {
    return patternOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArithmeticOperator()
  {
    return arithmeticOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonOperator()
  {
    return comparisonOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalOperator()
  {
    return logicalOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvery()
  {
    return everyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEveryDistinct()
  {
    return everyDistinctEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeat()
  {
    return repeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeat_Count()
  {
    return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUntil()
  {
    return untilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRange()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_LowEndpoint()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRange_HighEndpoint()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFollowedBy()
  {
    return followedByEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile()
  {
    return whileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd()
  {
    return andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOr()
  {
    return orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNot()
  {
    return notEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddition()
  {
    return additionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtraction()
  {
    return subtractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplication()
  {
    return multiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivision()
  {
    return divisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModulus()
  {
    return modulusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqual()
  {
    return equalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotEqual()
  {
    return notEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLessThan()
  {
    return lessThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterThan()
  {
    return greaterThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLessEqual()
  {
    return lessEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterEqual()
  {
    return greaterEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMax()
  {
    return maxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMin()
  {
    return minEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAvg()
  {
    return avgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCount()
  {
    return countEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSum()
  {
    return sumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithinTimer()
  {
    return withinTimerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Years()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Months()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Weeks()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Days()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Hours()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Minutes()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Seconds()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithinTimer_Milliseconds()
  {
    return (EAttribute)withinTimerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithinTimer_WithinTimerElements()
  {
    return (EReference)withinTimerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithinTimerElement()
  {
    return withinTimerElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeInterval()
  {
    return timeIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Years()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Months()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Weeks()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Days()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Hours()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Minutes()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Seconds()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeInterval_Milliseconds()
  {
    return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeSchedule()
  {
    return timeScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSchedule_DayOfWeek()
  {
    return (EAttribute)timeScheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSchedule_DayOfMonth()
  {
    return (EAttribute)timeScheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSchedule_Month()
  {
    return (EAttribute)timeScheduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSchedule_Hour()
  {
    return (EAttribute)timeScheduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSchedule_Minute()
  {
    return (EAttribute)timeScheduleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeSchedule_Second()
  {
    return (EAttribute)timeScheduleEClass.getEStructuralFeatures().get(5);
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
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Value()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Type()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmail()
  {
    return emailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_To()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Cc()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_From()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Subject()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Host()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Port()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_User()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Password()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwitter()
  {
    return twitterEClass;
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
  public EventpatternFactory getEventpatternFactory()
  {
    return (EventpatternFactory)getEFactoryInstance();
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
    cepEventPatternEClass = createEClass(CEP_EVENT_PATTERN);
    createEAttribute(cepEventPatternEClass, CEP_EVENT_PATTERN__PATTERN_NAME);
    createEAttribute(cepEventPatternEClass, CEP_EVENT_PATTERN__PATTERN_DESCRIPTION);
    createEAttribute(cepEventPatternEClass, CEP_EVENT_PATTERN__DOMAIN_NAME);
    createEAttribute(cepEventPatternEClass, CEP_EVENT_PATTERN__PATTERN_CREATION_DATE);
    createEAttribute(cepEventPatternEClass, CEP_EVENT_PATTERN__PATTERN_DEPLOYED);
    createEReference(cepEventPatternEClass, CEP_EVENT_PATTERN__LINKS);
    createEReference(cepEventPatternEClass, CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS);
    createEReference(cepEventPatternEClass, CEP_EVENT_PATTERN__COMPLEX_EVENT);
    createEReference(cepEventPatternEClass, CEP_EVENT_PATTERN__ACTIONS);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__ORDER);
    createEReference(linkEClass, LINK__OPERAND);
    createEReference(linkEClass, LINK__OPERATOR);

    operatorEClass = createEClass(OPERATOR);
    createEReference(operatorEClass, OPERATOR__INBOUND_LINK);

    unaryOperatorEClass = createEClass(UNARY_OPERATOR);

    binaryOperatorEClass = createEClass(BINARY_OPERATOR);

    naryOperatorEClass = createEClass(NARY_OPERATOR);

    operandEClass = createEClass(OPERAND);
    createEReference(operandEClass, OPERAND__OUTBOUND_LINK);

    eventPatternElementEClass = createEClass(EVENT_PATTERN_ELEMENT);

    complexEventEClass = createEClass(COMPLEX_EVENT);
    createEAttribute(complexEventEClass, COMPLEX_EVENT__TYPE_NAME);
    createEAttribute(complexEventEClass, COMPLEX_EVENT__IMAGE_PATH);
    createEReference(complexEventEClass, COMPLEX_EVENT__COMPLEX_EVENT_PROPERTIES);

    complexEventPropertyEClass = createEClass(COMPLEX_EVENT_PROPERTY);
    createEAttribute(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__NAME);
    createEAttribute(complexEventPropertyEClass, COMPLEX_EVENT_PROPERTY__IMAGE_PATH);

    actionEClass = createEClass(ACTION);

    dataWindowEClass = createEClass(DATA_WINDOW);
    createEReference(dataWindowEClass, DATA_WINDOW__EVENT_PATTERN_CONDITIONS);

    slidingEventIntervalEClass = createEClass(SLIDING_EVENT_INTERVAL);
    createEAttribute(slidingEventIntervalEClass, SLIDING_EVENT_INTERVAL__SIZE);

    batchingEventIntervalEClass = createEClass(BATCHING_EVENT_INTERVAL);
    createEAttribute(batchingEventIntervalEClass, BATCHING_EVENT_INTERVAL__SIZE);

    slidingTimeIntervalEClass = createEClass(SLIDING_TIME_INTERVAL);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__YEARS);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__MONTHS);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__WEEKS);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__DAYS);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__HOURS);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__MINUTES);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__SECONDS);
    createEAttribute(slidingTimeIntervalEClass, SLIDING_TIME_INTERVAL__MILLISECONDS);

    batchingTimeIntervalEClass = createEClass(BATCHING_TIME_INTERVAL);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__YEARS);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__MONTHS);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__WEEKS);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__DAYS);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__HOURS);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__MINUTES);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__SECONDS);
    createEAttribute(batchingTimeIntervalEClass, BATCHING_TIME_INTERVAL__MILLISECONDS);

    eventPatternConditionEClass = createEClass(EVENT_PATTERN_CONDITION);

    aggregationOperatorEClass = createEClass(AGGREGATION_OPERATOR);

    conditionOperatorEClass = createEClass(CONDITION_OPERATOR);

    conditionOperandEClass = createEClass(CONDITION_OPERAND);

    patternOperatorEClass = createEClass(PATTERN_OPERATOR);

    patternOperandEClass = createEClass(PATTERN_OPERAND);

    arithmeticOperatorEClass = createEClass(ARITHMETIC_OPERATOR);

    comparisonOperatorEClass = createEClass(COMPARISON_OPERATOR);

    logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);

    everyEClass = createEClass(EVERY);

    everyDistinctEClass = createEClass(EVERY_DISTINCT);

    repeatEClass = createEClass(REPEAT);
    createEAttribute(repeatEClass, REPEAT__COUNT);

    untilEClass = createEClass(UNTIL);

    rangeEClass = createEClass(RANGE);
    createEAttribute(rangeEClass, RANGE__LOW_ENDPOINT);
    createEAttribute(rangeEClass, RANGE__HIGH_ENDPOINT);

    followedByEClass = createEClass(FOLLOWED_BY);

    whileEClass = createEClass(WHILE);

    andEClass = createEClass(AND);

    orEClass = createEClass(OR);

    notEClass = createEClass(NOT);

    additionEClass = createEClass(ADDITION);

    subtractionEClass = createEClass(SUBTRACTION);

    multiplicationEClass = createEClass(MULTIPLICATION);

    divisionEClass = createEClass(DIVISION);

    modulusEClass = createEClass(MODULUS);

    equalEClass = createEClass(EQUAL);

    notEqualEClass = createEClass(NOT_EQUAL);

    lessThanEClass = createEClass(LESS_THAN);

    greaterThanEClass = createEClass(GREATER_THAN);

    lessEqualEClass = createEClass(LESS_EQUAL);

    greaterEqualEClass = createEClass(GREATER_EQUAL);

    maxEClass = createEClass(MAX);

    minEClass = createEClass(MIN);

    avgEClass = createEClass(AVG);

    countEClass = createEClass(COUNT);

    sumEClass = createEClass(SUM);

    withinTimerEClass = createEClass(WITHIN_TIMER);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__YEARS);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__MONTHS);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__WEEKS);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__DAYS);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__HOURS);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__MINUTES);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__SECONDS);
    createEAttribute(withinTimerEClass, WITHIN_TIMER__MILLISECONDS);
    createEReference(withinTimerEClass, WITHIN_TIMER__WITHIN_TIMER_ELEMENTS);

    withinTimerElementEClass = createEClass(WITHIN_TIMER_ELEMENT);

    timeIntervalEClass = createEClass(TIME_INTERVAL);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__YEARS);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__MONTHS);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__WEEKS);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__DAYS);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__HOURS);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__MINUTES);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__SECONDS);
    createEAttribute(timeIntervalEClass, TIME_INTERVAL__MILLISECONDS);

    timeScheduleEClass = createEClass(TIME_SCHEDULE);
    createEAttribute(timeScheduleEClass, TIME_SCHEDULE__DAY_OF_WEEK);
    createEAttribute(timeScheduleEClass, TIME_SCHEDULE__DAY_OF_MONTH);
    createEAttribute(timeScheduleEClass, TIME_SCHEDULE__MONTH);
    createEAttribute(timeScheduleEClass, TIME_SCHEDULE__HOUR);
    createEAttribute(timeScheduleEClass, TIME_SCHEDULE__MINUTE);
    createEAttribute(timeScheduleEClass, TIME_SCHEDULE__SECOND);

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

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__VALUE);
    createEAttribute(valueEClass, VALUE__TYPE);

    emailEClass = createEClass(EMAIL);
    createEAttribute(emailEClass, EMAIL__TO);
    createEAttribute(emailEClass, EMAIL__CC);
    createEAttribute(emailEClass, EMAIL__FROM);
    createEAttribute(emailEClass, EMAIL__SUBJECT);
    createEAttribute(emailEClass, EMAIL__HOST);
    createEAttribute(emailEClass, EMAIL__PORT);
    createEAttribute(emailEClass, EMAIL__USER);
    createEAttribute(emailEClass, EMAIL__PASSWORD);

    twitterEClass = createEClass(TWITTER);

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
    unaryOperatorEClass.getESuperTypes().add(this.getOperator());
    binaryOperatorEClass.getESuperTypes().add(this.getOperator());
    naryOperatorEClass.getESuperTypes().add(this.getOperator());
    complexEventEClass.getESuperTypes().add(this.getOperand());
    complexEventPropertyEClass.getESuperTypes().add(this.getUnaryOperator());
    actionEClass.getESuperTypes().add(this.getUnaryOperator());
    dataWindowEClass.getESuperTypes().add(this.getEventPatternElement());
    slidingEventIntervalEClass.getESuperTypes().add(this.getDataWindow());
    batchingEventIntervalEClass.getESuperTypes().add(this.getDataWindow());
    slidingTimeIntervalEClass.getESuperTypes().add(this.getDataWindow());
    batchingTimeIntervalEClass.getESuperTypes().add(this.getDataWindow());
    eventPatternConditionEClass.getESuperTypes().add(this.getEventPatternElement());
    aggregationOperatorEClass.getESuperTypes().add(this.getUnaryOperator());
    aggregationOperatorEClass.getESuperTypes().add(this.getOperand());
    aggregationOperatorEClass.getESuperTypes().add(this.getEventPatternCondition());
    conditionOperatorEClass.getESuperTypes().add(this.getOperator());
    conditionOperatorEClass.getESuperTypes().add(this.getConditionOperand());
    conditionOperatorEClass.getESuperTypes().add(this.getEventPatternCondition());
    conditionOperatorEClass.getESuperTypes().add(this.getWithinTimerElement());
    conditionOperandEClass.getESuperTypes().add(this.getOperand());
    conditionOperandEClass.getESuperTypes().add(this.getEventPatternCondition());
    conditionOperandEClass.getESuperTypes().add(this.getWithinTimerElement());
    patternOperatorEClass.getESuperTypes().add(this.getOperator());
    patternOperatorEClass.getESuperTypes().add(this.getPatternOperand());
    patternOperatorEClass.getESuperTypes().add(this.getEventPatternCondition());
    patternOperatorEClass.getESuperTypes().add(this.getWithinTimerElement());
    patternOperandEClass.getESuperTypes().add(this.getOperand());
    patternOperandEClass.getESuperTypes().add(this.getEventPatternCondition());
    arithmeticOperatorEClass.getESuperTypes().add(this.getBinaryOperator());
    arithmeticOperatorEClass.getESuperTypes().add(this.getConditionOperator());
    comparisonOperatorEClass.getESuperTypes().add(this.getBinaryOperator());
    comparisonOperatorEClass.getESuperTypes().add(this.getConditionOperator());
    logicalOperatorEClass.getESuperTypes().add(this.getConditionOperator());
    logicalOperatorEClass.getESuperTypes().add(this.getPatternOperator());
    everyEClass.getESuperTypes().add(this.getUnaryOperator());
    everyEClass.getESuperTypes().add(this.getPatternOperator());
    everyDistinctEClass.getESuperTypes().add(this.getNaryOperator());
    everyDistinctEClass.getESuperTypes().add(this.getPatternOperator());
    repeatEClass.getESuperTypes().add(this.getUnaryOperator());
    repeatEClass.getESuperTypes().add(this.getPatternOperator());
    untilEClass.getESuperTypes().add(this.getBinaryOperator());
    untilEClass.getESuperTypes().add(this.getPatternOperator());
    rangeEClass.getESuperTypes().add(this.getUnaryOperator());
    rangeEClass.getESuperTypes().add(this.getPatternOperator());
    followedByEClass.getESuperTypes().add(this.getNaryOperator());
    followedByEClass.getESuperTypes().add(this.getPatternOperator());
    whileEClass.getESuperTypes().add(this.getBinaryOperator());
    whileEClass.getESuperTypes().add(this.getPatternOperator());
    andEClass.getESuperTypes().add(this.getNaryOperator());
    andEClass.getESuperTypes().add(this.getLogicalOperator());
    orEClass.getESuperTypes().add(this.getNaryOperator());
    orEClass.getESuperTypes().add(this.getLogicalOperator());
    notEClass.getESuperTypes().add(this.getUnaryOperator());
    notEClass.getESuperTypes().add(this.getLogicalOperator());
    additionEClass.getESuperTypes().add(this.getArithmeticOperator());
    subtractionEClass.getESuperTypes().add(this.getArithmeticOperator());
    multiplicationEClass.getESuperTypes().add(this.getArithmeticOperator());
    divisionEClass.getESuperTypes().add(this.getArithmeticOperator());
    modulusEClass.getESuperTypes().add(this.getArithmeticOperator());
    equalEClass.getESuperTypes().add(this.getComparisonOperator());
    notEqualEClass.getESuperTypes().add(this.getComparisonOperator());
    lessThanEClass.getESuperTypes().add(this.getComparisonOperator());
    greaterThanEClass.getESuperTypes().add(this.getComparisonOperator());
    lessEqualEClass.getESuperTypes().add(this.getComparisonOperator());
    greaterEqualEClass.getESuperTypes().add(this.getComparisonOperator());
    maxEClass.getESuperTypes().add(this.getAggregationOperator());
    minEClass.getESuperTypes().add(this.getAggregationOperator());
    avgEClass.getESuperTypes().add(this.getAggregationOperator());
    countEClass.getESuperTypes().add(this.getAggregationOperator());
    sumEClass.getESuperTypes().add(this.getAggregationOperator());
    withinTimerEClass.getESuperTypes().add(this.getPatternOperand());
    timeIntervalEClass.getESuperTypes().add(this.getPatternOperand());
    timeScheduleEClass.getESuperTypes().add(this.getPatternOperand());
    eventEClass.getESuperTypes().add(this.getPatternOperand());
    eventEClass.getESuperTypes().add(this.getWithinTimerElement());
    eventPropertyEClass.getESuperTypes().add(this.getConditionOperand());
    valueEClass.getESuperTypes().add(this.getConditionOperand());
    emailEClass.getESuperTypes().add(this.getAction());
    twitterEClass.getESuperTypes().add(this.getAction());

    // Initialize classes and features; add operations and parameters
    initEClass(cepEventPatternEClass, CEPEventPattern.class, "CEPEventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCEPEventPattern_PatternName(), ecorePackage.getEString(), "patternName", null, 0, 1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCEPEventPattern_PatternDescription(), ecorePackage.getEString(), "patternDescription", null, 0, 1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCEPEventPattern_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCEPEventPattern_PatternCreationDate(), ecorePackage.getEDate(), "patternCreationDate", null, 0, 1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCEPEventPattern_PatternDeployed(), ecorePackage.getEBoolean(), "patternDeployed", null, 0, 1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCEPEventPattern_Links(), this.getLink(), null, "links", null, 0, -1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCEPEventPattern_EventPatternElements(), this.getEventPatternElement(), null, "eventPatternElements", null, 0, -1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCEPEventPattern_ComplexEvent(), this.getComplexEvent(), null, "complexEvent", null, 0, 1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCEPEventPattern_Actions(), this.getAction(), null, "actions", null, 0, -1, CEPEventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLink_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Operand(), this.getOperand(), this.getOperand_OutboundLink(), "operand", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Operator(), this.getOperator(), this.getOperator_InboundLink(), "operator", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperator_InboundLink(), this.getLink(), this.getLink_Operator(), "inboundLink", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryOperatorEClass, BinaryOperator.class, "BinaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(naryOperatorEClass, NaryOperator.class, "NaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operandEClass, Operand.class, "Operand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperand_OutboundLink(), this.getLink(), this.getLink_Operand(), "outboundLink", null, 0, -1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventPatternElementEClass, EventPatternElement.class, "EventPatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexEventEClass, ComplexEvent.class, "ComplexEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexEvent_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ComplexEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexEvent_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ComplexEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexEvent_ComplexEventProperties(), this.getComplexEventProperty(), null, "complexEventProperties", null, 0, -1, ComplexEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexEventPropertyEClass, ComplexEventProperty.class, "ComplexEventProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexEventProperty_Name(), ecorePackage.getEString(), "name", " ", 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexEventProperty_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ComplexEventProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataWindowEClass, DataWindow.class, "DataWindow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataWindow_EventPatternConditions(), this.getEventPatternCondition(), null, "eventPatternConditions", null, 0, -1, DataWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slidingEventIntervalEClass, SlidingEventInterval.class, "SlidingEventInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlidingEventInterval_Size(), ecorePackage.getEInt(), "size", null, 0, 1, SlidingEventInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(batchingEventIntervalEClass, BatchingEventInterval.class, "BatchingEventInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBatchingEventInterval_Size(), ecorePackage.getEInt(), "size", null, 0, 1, BatchingEventInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slidingTimeIntervalEClass, SlidingTimeInterval.class, "SlidingTimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlidingTimeInterval_Years(), ecorePackage.getEInt(), "years", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Months(), ecorePackage.getEInt(), "months", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Weeks(), ecorePackage.getEInt(), "weeks", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Days(), ecorePackage.getEInt(), "days", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Minutes(), ecorePackage.getEInt(), "minutes", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Seconds(), ecorePackage.getEInt(), "seconds", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlidingTimeInterval_Milliseconds(), ecorePackage.getEInt(), "milliseconds", null, 0, 1, SlidingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(batchingTimeIntervalEClass, BatchingTimeInterval.class, "BatchingTimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBatchingTimeInterval_Years(), ecorePackage.getEInt(), "years", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Months(), ecorePackage.getEInt(), "months", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Weeks(), ecorePackage.getEInt(), "weeks", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Days(), ecorePackage.getEInt(), "days", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Minutes(), ecorePackage.getEInt(), "minutes", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Seconds(), ecorePackage.getEInt(), "seconds", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBatchingTimeInterval_Milliseconds(), ecorePackage.getEInt(), "milliseconds", null, 0, 1, BatchingTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventPatternConditionEClass, EventPatternCondition.class, "EventPatternCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aggregationOperatorEClass, AggregationOperator.class, "AggregationOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionOperatorEClass, ConditionOperator.class, "ConditionOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionOperandEClass, ConditionOperand.class, "ConditionOperand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patternOperatorEClass, PatternOperator.class, "PatternOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patternOperandEClass, PatternOperand.class, "PatternOperand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arithmeticOperatorEClass, ArithmeticOperator.class, "ArithmeticOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparisonOperatorEClass, ComparisonOperator.class, "ComparisonOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(everyEClass, Every.class, "Every", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(everyDistinctEClass, EveryDistinct.class, "EveryDistinct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeat_Count(), ecorePackage.getEInt(), "count", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(untilEClass, Until.class, "Until", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRange_LowEndpoint(), ecorePackage.getEInt(), "lowEndpoint", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRange_HighEndpoint(), ecorePackage.getEInt(), "highEndpoint", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(followedByEClass, FollowedBy.class, "FollowedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modulusEClass, Modulus.class, "Modulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notEqualEClass, NotEqual.class, "NotEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lessEqualEClass, LessEqual.class, "LessEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(greaterEqualEClass, GreaterEqual.class, "GreaterEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maxEClass, Max.class, "Max", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minEClass, Min.class, "Min", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(avgEClass, Avg.class, "Avg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(withinTimerEClass, WithinTimer.class, "WithinTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWithinTimer_Years(), ecorePackage.getEInt(), "years", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Months(), ecorePackage.getEInt(), "months", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Weeks(), ecorePackage.getEInt(), "weeks", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Days(), ecorePackage.getEInt(), "days", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Minutes(), ecorePackage.getEInt(), "minutes", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Seconds(), ecorePackage.getEInt(), "seconds", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWithinTimer_Milliseconds(), ecorePackage.getEInt(), "milliseconds", null, 0, 1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithinTimer_WithinTimerElements(), this.getWithinTimerElement(), null, "withinTimerElements", null, 0, -1, WithinTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withinTimerElementEClass, WithinTimerElement.class, "WithinTimerElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeInterval_Years(), ecorePackage.getEInt(), "years", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Months(), ecorePackage.getEInt(), "months", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Weeks(), ecorePackage.getEInt(), "weeks", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Days(), ecorePackage.getEInt(), "days", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Minutes(), ecorePackage.getEInt(), "minutes", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Seconds(), ecorePackage.getEInt(), "seconds", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeInterval_Milliseconds(), ecorePackage.getEInt(), "milliseconds", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeScheduleEClass, TimeSchedule.class, "TimeSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeSchedule_DayOfWeek(), ecorePackage.getEInt(), "dayOfWeek", "-1", 0, 1, TimeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSchedule_DayOfMonth(), ecorePackage.getEInt(), "dayOfMonth", "-1", 0, 1, TimeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSchedule_Month(), ecorePackage.getEInt(), "month", "-1", 0, 1, TimeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSchedule_Hour(), ecorePackage.getEInt(), "hour", "-1", 0, 1, TimeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSchedule_Minute(), ecorePackage.getEInt(), "minute", "-1", 0, 1, TimeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeSchedule_Second(), ecorePackage.getEInt(), "second", "-1", 0, 1, TimeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", " ", 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValue_Type(), this.getPropertyTypeValue(), "type", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmail_To(), ecorePackage.getEString(), "to", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_Cc(), ecorePackage.getEString(), "cc", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_From(), ecorePackage.getEString(), "from", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_Host(), ecorePackage.getEString(), "host", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_Port(), ecorePackage.getEInt(), "port", "25", 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_User(), ecorePackage.getEString(), "user", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmail_Password(), ecorePackage.getEString(), "password", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(twitterEClass, Twitter.class, "Twitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (cepEventPatternEClass, 
       source, 
       new String[] 
       {
       "model.extension", "pattern",
       "diagram.extension", "pattern_diagram"
       });																																														
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.link";			
    addAnnotation
      (linkEClass, 
       source, 
       new String[] 
       {
       "label", "order",
       "source", "operand",
       "target", "operator",
       "source.constraint", "self <> oppositeEnd \r\n\tand ( \r\n\t   (self.oclIsKindOf(ComplexEvent) and oppositeEnd.oclIsKindOf(Action))\r\n\t   or ((self.oclIsKindOf(Value) or self.oclIsKindOf(EventProperty) or \r\n\t        self.oclIsKindOf(AggregationOperator) or self.oclIsKindOf(ArithmeticOperator)) \r\n\t        and oppositeEnd.oclIsKindOf(ComplexEventProperty)) \r\n\t   or (self.oclIsKindOf(PatternOperand) and oppositeEnd.oclIsKindOf(PatternOperator))\r\n\t   or ((self.oclIsTypeOf(EventProperty) or self.oclIsTypeOf(Value)) \r\n\t      and (oppositeEnd.oclIsKindOf(LogicalOperator) or oppositeEnd.oclIsKindOf(ComparisonOperator) \r\n\t         or oppositeEnd.oclIsKindOf(ArithmeticOperator))) \r\n\t   or (self.oclIsKindOf(ComparisonOperator) and oppositeEnd.oclIsKindOf(LogicalOperator))        \r\n\t   or (self.oclIsKindOf(ArithmeticOperator) and (oppositeEnd.oclIsKindOf(ArithmeticOperator) \r\n\t      or oppositeEnd.oclIsKindOf(ComparisonOperator)))  \r\n\t   or ((self.oclIsTypeOf(EventProperty) or self.oclIsKindOf(ArithmeticOperator)) \r\n\t      and oppositeEnd.oclIsKindOf(AggregationOperator)) \r\n\t   or (self.oclIsKindOf(AggregationOperator) and oppositeEnd.oclIsKindOf(ArithmeticOperator))   \r\n\t   or (self.oclIsKindOf(ComparisonOperator) and oppositeEnd.oclIsTypeOf(While))\r\n\t   or (self.oclIsTypeOf(EventProperty) and oppositeEnd.oclIsTypeOf(EveryDistinct))  \r\n\t)",
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
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (complexEventEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label", "typeName",
       "border.color", "110,110,110",
       "label.view.pattern", "New Complex Event: {0}",
       "label.readOnly", "true",
       "tool.name", "New Complex Event",
       "tool.description", "Add a new complex event"
       });			
    addAnnotation
      (complexEventPropertyEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label", "name",
       "border.color", "110,110,110",
       "tool.name", "New Complex Event Property",
       "tool.description", "Add a new complex event property"
       });			
    addAnnotation
      (slidingEventIntervalEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "border.style", "dash",
       "label", "size",
       "border.color", "110,110,110",
       "color", "230,230,250",
       "label.view.pattern", "Sliding Event Interval: {0}",
       "label.edit.pattern", "{0, number}",
       "tool.name", "Sliding Event Interval",
       "tool.description", "Add a sliding event interval window"
       });		
    addAnnotation
      (batchingEventIntervalEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "border.style", "dash",
       "label", "size",
       "border.color", "110,110,110",
       "color", "230,230,250",
       "label.view.pattern", "Batching Event Interval: {0}",
       "label.edit.pattern", "{0, number}",
       "tool.name", "Batching Event Interval",
       "tool.description", "Add a batching event interval window"
       });		
    addAnnotation
      (slidingTimeIntervalEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "border.style", "dash",
       "border.color", "110,110,110",
       "color", "230,230,250",
       "label", "years, months, weeks, days, hours, minutes, seconds, milliseconds",
       "label.parser", "MessageFormatParser",
       "label.readOnly", "true",
       "label.view.pattern", "Sliding Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}",
       "tool.name", "Sliding Time Interval",
       "tool.description", "Add a sliding time interval window"
       });		
    addAnnotation
      (batchingTimeIntervalEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "border.style", "dash",
       "border.color", "110,110,110",
       "color", "230,230,250",
       "label", "years, months, weeks, days, hours, minutes, seconds, milliseconds",
       "label.parser", "MessageFormatParser",
       "label.readOnly", "true",
       "label.view.pattern", "Batching Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}",
       "tool.name", "Batching Time Interval",
       "tool.description", "Add a batching time interval window"
       });		
    addAnnotation
      (everyEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Every.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Every",
       "tool.description", "Add an every operator"
       });		
    addAnnotation
      (everyDistinctEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/EveryDistinct.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Every Distinct",
       "tool.description", "Add an every-distinct operator"
       });		
    addAnnotation
      (repeatEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "label", "count",
       "label.view.pattern", "{0}",
       "label.edit.pattern", "{0, number}",
       "border.color", "38,110,159",
       "border.width", "3",
       "label.icon", "false",
       "color", "255,255,255",
       "size", "30,30",
       "resizable", "false",
       "tool.name", "Repeat",
       "tool.description", "Add a repeat operator"
       });		
    addAnnotation
      (untilEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Until.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Until",
       "tool.description", "Add an until operator"
       });		
    addAnnotation
      (rangeEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "label", "lowEndpoint, highEndpoint",
       "color", "255,255,255",
       "border.color", "38,110,159",
       "border.width", "3",
       "label.icon", "false",
       "size", "30,30",
       "label.view.pattern", "[{0, number}:{1, number}]",
       "label.edit.pattern", "{0}:{1}",
       "resizable", "false",
       "tool.name", "Range",
       "tool.description", "Add a range operator"
       });		
    addAnnotation
      (followedByEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/FollowedBy.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Followed By",
       "tool.description", "Add a followed-by operator"
       });		
    addAnnotation
      (whileEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/While.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "While",
       "tool.description", "Add a while operator"
       });		
    addAnnotation
      (andEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/And.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "And",
       "tool.description", "Add an and operator"
       });		
    addAnnotation
      (orEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Or.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Or",
       "tool.description", "Add an or operator"
       });		
    addAnnotation
      (notEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Not.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Not",
       "tool.description", "Add a not operator"
       });		
    addAnnotation
      (additionEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Addition.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Addition",
       "tool.description", "Add an addition operator"
       });		
    addAnnotation
      (subtractionEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Subtraction.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Subtraction",
       "tool.description", "Add a subtraction operator"
       });		
    addAnnotation
      (multiplicationEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Multiplication.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Multiplication",
       "tool.description", "Add a multiplication operator"
       });		
    addAnnotation
      (divisionEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Division.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Division",
       "tool.description", "Add a division operator"
       });		
    addAnnotation
      (modulusEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Modulus.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Modulus",
       "tool.description", "Add a modulus operator"
       });		
    addAnnotation
      (equalEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Equal.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Equal",
       "tool.description", "Add an equal operator"
       });		
    addAnnotation
      (notEqualEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/NotEqual.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Not Equal",
       "tool.description", "Add a not-equal operator"
       });		
    addAnnotation
      (lessThanEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/LessThan.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Less Than",
       "tool.description", "Add a less-than operator"
       });		
    addAnnotation
      (greaterThanEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/GreaterThan.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Greater Than",
       "tool.description", "Add a greater-than operator"
       });		
    addAnnotation
      (lessEqualEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/LessEqual.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Less Equal",
       "tool.description", "Add a less-than-or-equal-to operator"
       });		
    addAnnotation
      (greaterEqualEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/GreaterEqual.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Greater Equal",
       "tool.description", "Add a greater-than-or-equal-to operator"
       });		
    addAnnotation
      (maxEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Max.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Max",
       "tool.description", "Add a max operator"
       });		
    addAnnotation
      (minEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Min.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Min",
       "tool.description", "Add a min operator"
       });		
    addAnnotation
      (avgEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Avg.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Avg",
       "tool.description", "Add an avg operator"
       });		
    addAnnotation
      (countEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Count.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Count",
       "tool.description", "Add a count operator"
       });		
    addAnnotation
      (sumEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Sum.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Sum",
       "tool.description", "Add a sum operator"
       });		
    addAnnotation
      (withinTimerEClass, 
       source, 
       new String[] 
       {
       "figure", "rounded",
       "color", "255,248,220",
       "border.color", "110,110,110",
       "label", "years, months, weeks, days, hours, minutes, seconds, milliseconds",
       "label.parser", "MessageFormatParser",
       "label.readOnly", "true",
       "label.view.pattern", "Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}",
       "tool.name", "Within Timer",
       "tool.description", "Add a within timer"
       });			
    addAnnotation
      (timeIntervalEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/TimeInterval.svg",
       "size", "30,30",
       "resizable", "false",
       "margin", "0",
       "label.placement", "external",
       "label.icon", "false",
       "label", "years, months, weeks, days, hours, minutes, seconds, milliseconds",
       "label.parser", "MessageFormatParser",
       "label.readOnly", "true",
       "label.view.pattern", " {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} ",
       "tool.name", "Time Interval",
       "tool.description", "Add a time interval"
       });		
    addAnnotation
      (timeScheduleEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/TimeSchedule.svg",
       "size", "30,30",
       "resizable", "false",
       "margin", "0",
       "label.placement", "external",
       "label.icon", "false",
       "label", "dayOfWeek, dayOfMonth, month, hour, minute, second",
       "label.parser", "MessageFormatParser",
       "label.readOnly", "true",
       "label.view.pattern", " {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} ",
       "tool.name", "Time Schedule",
       "tool.description", "Add a time schedule"
       });		
    addAnnotation
      (eventEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label", "typeName",
       "border.color", "110,110,110",
       "tool.name", "Event",
       "tool.description", "Add an event",
       "resizable", "false",
       "label.readOnly", "true"
       });			
    addAnnotation
      (eventPropertyEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "label", "name",
       "border.color", "110,110,110",
       "tool.name", "Event Property",
       "tool.description", "Add an event property",
       "resizable", "false",
       "label.readOnly", "true"
       });			
    addAnnotation
      (valueEClass, 
       source, 
       new String[] 
       {
       "figure", "rounded",
       "label", "value",
       "label.text", "",
       "label.icon", "false",
       "margin", "0",
       "border.color", "110,110,110",
       "border.width", "3",
       "size", "30,30",
       "tool.name", "Value",
       "tool.description", "Add a value"
       });		
    addAnnotation
      (emailEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Email.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Email",
       "tool.description", "Add an email action"
       });		
    addAnnotation
      (twitterEClass, 
       source, 
       new String[] 
       {
       "figure", "svg",
       "svg.uri", "platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Twitter.svg",
       "size", "30,30",
       "label.placement", "none",
       "resizable", "false",
       "margin", "0",
       "tool.name", "Twitter",
       "tool.description", "Add a twitter action"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";					
    addAnnotation
      (getComplexEvent_ComplexEventProperties(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });			
    addAnnotation
      (getDataWindow_EventPatternConditions(), 
       source, 
       new String[] 
       {
       });																																	
    addAnnotation
      (getWithinTimer_WithinTimerElements(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getEvent_EventProperties(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });			
    addAnnotation
      (getEventProperty_EventProperties(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });			
  }

} //EventpatternPackageImpl
