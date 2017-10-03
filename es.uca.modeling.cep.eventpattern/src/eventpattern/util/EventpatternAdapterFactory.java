/**
 */
package eventpattern.util;

import eventpattern.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eventpattern.EventpatternPackage
 * @generated
 */
public class EventpatternAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EventpatternPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EventpatternAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EventpatternPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EventpatternSwitch<Adapter> modelSwitch =
    new EventpatternSwitch<Adapter>() {
			@Override
			public Adapter caseCEPEventPattern(CEPEventPattern object) {
				return createCEPEventPatternAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object) {
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseNaryOperator(NaryOperator object) {
				return createNaryOperatorAdapter();
			}
			@Override
			public Adapter caseOperand(Operand object) {
				return createOperandAdapter();
			}
			@Override
			public Adapter caseEventPatternElement(EventPatternElement object) {
				return createEventPatternElementAdapter();
			}
			@Override
			public Adapter caseComplexEvent(ComplexEvent object) {
				return createComplexEventAdapter();
			}
			@Override
			public Adapter caseComplexEventProperty(ComplexEventProperty object) {
				return createComplexEventPropertyAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseDataWindow(DataWindow object) {
				return createDataWindowAdapter();
			}
			@Override
			public Adapter caseSlidingEventInterval(SlidingEventInterval object) {
				return createSlidingEventIntervalAdapter();
			}
			@Override
			public Adapter caseBatchingEventInterval(BatchingEventInterval object) {
				return createBatchingEventIntervalAdapter();
			}
			@Override
			public Adapter caseSlidingTimeInterval(SlidingTimeInterval object) {
				return createSlidingTimeIntervalAdapter();
			}
			@Override
			public Adapter caseBatchingTimeInterval(BatchingTimeInterval object) {
				return createBatchingTimeIntervalAdapter();
			}
			@Override
			public Adapter caseEventPatternCondition(EventPatternCondition object) {
				return createEventPatternConditionAdapter();
			}
			@Override
			public Adapter caseAggregationOperator(AggregationOperator object) {
				return createAggregationOperatorAdapter();
			}
			@Override
			public Adapter caseConditionOperator(ConditionOperator object) {
				return createConditionOperatorAdapter();
			}
			@Override
			public Adapter caseConditionOperand(ConditionOperand object) {
				return createConditionOperandAdapter();
			}
			@Override
			public Adapter casePatternOperator(PatternOperator object) {
				return createPatternOperatorAdapter();
			}
			@Override
			public Adapter casePatternOperand(PatternOperand object) {
				return createPatternOperandAdapter();
			}
			@Override
			public Adapter caseArithmeticOperator(ArithmeticOperator object) {
				return createArithmeticOperatorAdapter();
			}
			@Override
			public Adapter caseComparisonOperator(ComparisonOperator object) {
				return createComparisonOperatorAdapter();
			}
			@Override
			public Adapter caseLogicalOperator(LogicalOperator object) {
				return createLogicalOperatorAdapter();
			}
			@Override
			public Adapter caseGroupBy(GroupBy object) {
				return createGroupByAdapter();
			}
			@Override
			public Adapter caseEvery(Every object) {
				return createEveryAdapter();
			}
			@Override
			public Adapter caseEveryDistinct(EveryDistinct object) {
				return createEveryDistinctAdapter();
			}
			@Override
			public Adapter caseRepeat(Repeat object) {
				return createRepeatAdapter();
			}
			@Override
			public Adapter caseUntil(Until object) {
				return createUntilAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseFollowedBy(FollowedBy object) {
				return createFollowedByAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseAddition(Addition object) {
				return createAdditionAdapter();
			}
			@Override
			public Adapter caseSubtraction(Subtraction object) {
				return createSubtractionAdapter();
			}
			@Override
			public Adapter caseMultiplication(Multiplication object) {
				return createMultiplicationAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseModulus(Modulus object) {
				return createModulusAdapter();
			}
			@Override
			public Adapter caseEqual(Equal object) {
				return createEqualAdapter();
			}
			@Override
			public Adapter caseNotEqual(NotEqual object) {
				return createNotEqualAdapter();
			}
			@Override
			public Adapter caseLessThan(LessThan object) {
				return createLessThanAdapter();
			}
			@Override
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseLessEqual(LessEqual object) {
				return createLessEqualAdapter();
			}
			@Override
			public Adapter caseGreaterEqual(GreaterEqual object) {
				return createGreaterEqualAdapter();
			}
			@Override
			public Adapter caseMax(Max object) {
				return createMaxAdapter();
			}
			@Override
			public Adapter caseMin(Min object) {
				return createMinAdapter();
			}
			@Override
			public Adapter caseAvg(Avg object) {
				return createAvgAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseSum(Sum object) {
				return createSumAdapter();
			}
			@Override
			public Adapter caseWithinTimer(WithinTimer object) {
				return createWithinTimerAdapter();
			}
			@Override
			public Adapter caseWithinTimerElement(WithinTimerElement object) {
				return createWithinTimerElementAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseTimeSchedule(TimeSchedule object) {
				return createTimeScheduleAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventProperty(EventProperty object) {
				return createEventPropertyAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseEmail(Email object) {
				return createEmailAdapter();
			}
			@Override
			public Adapter caseTwitter(Twitter object) {
				return createTwitterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.CEPEventPattern <em>CEP Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.CEPEventPattern
	 * @generated
	 */
  public Adapter createCEPEventPatternAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Link
	 * @generated
	 */
  public Adapter createLinkAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Operator
	 * @generated
	 */
  public Adapter createOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.UnaryOperator
	 * @generated
	 */
  public Adapter createUnaryOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.BinaryOperator
	 * @generated
	 */
  public Adapter createBinaryOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.NaryOperator <em>Nary Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.NaryOperator
	 * @generated
	 */
  public Adapter createNaryOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Operand
	 * @generated
	 */
  public Adapter createOperandAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.EventPatternElement <em>Event Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.EventPatternElement
	 * @generated
	 */
  public Adapter createEventPatternElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.ComplexEvent <em>Complex Event</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.ComplexEvent
	 * @generated
	 */
  public Adapter createComplexEventAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.ComplexEventProperty <em>Complex Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.ComplexEventProperty
	 * @generated
	 */
  public Adapter createComplexEventPropertyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Action
	 * @generated
	 */
  public Adapter createActionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.DataWindow <em>Data Window</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.DataWindow
	 * @generated
	 */
  public Adapter createDataWindowAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.SlidingEventInterval <em>Sliding Event Interval</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.SlidingEventInterval
	 * @generated
	 */
  public Adapter createSlidingEventIntervalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.BatchingEventInterval <em>Batching Event Interval</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.BatchingEventInterval
	 * @generated
	 */
  public Adapter createBatchingEventIntervalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.SlidingTimeInterval <em>Sliding Time Interval</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.SlidingTimeInterval
	 * @generated
	 */
  public Adapter createSlidingTimeIntervalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.BatchingTimeInterval <em>Batching Time Interval</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.BatchingTimeInterval
	 * @generated
	 */
  public Adapter createBatchingTimeIntervalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.EventPatternCondition <em>Event Pattern Condition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.EventPatternCondition
	 * @generated
	 */
  public Adapter createEventPatternConditionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.AggregationOperator <em>Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.AggregationOperator
	 * @generated
	 */
  public Adapter createAggregationOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.ConditionOperator <em>Condition Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.ConditionOperator
	 * @generated
	 */
  public Adapter createConditionOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.ConditionOperand <em>Condition Operand</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.ConditionOperand
	 * @generated
	 */
  public Adapter createConditionOperandAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.PatternOperator <em>Pattern Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.PatternOperator
	 * @generated
	 */
  public Adapter createPatternOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.PatternOperand <em>Pattern Operand</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.PatternOperand
	 * @generated
	 */
  public Adapter createPatternOperandAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.ArithmeticOperator
	 * @generated
	 */
  public Adapter createArithmeticOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.ComparisonOperator
	 * @generated
	 */
  public Adapter createComparisonOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.LogicalOperator
	 * @generated
	 */
  public Adapter createLogicalOperatorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.GroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.GroupBy
	 * @generated
	 */
	public Adapter createGroupByAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link eventpattern.Every <em>Every</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Every
	 * @generated
	 */
  public Adapter createEveryAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.EveryDistinct <em>Every Distinct</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.EveryDistinct
	 * @generated
	 */
  public Adapter createEveryDistinctAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Repeat
	 * @generated
	 */
  public Adapter createRepeatAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Until
	 * @generated
	 */
  public Adapter createUntilAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Range
	 * @generated
	 */
  public Adapter createRangeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.FollowedBy <em>Followed By</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.FollowedBy
	 * @generated
	 */
  public Adapter createFollowedByAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.While
	 * @generated
	 */
  public Adapter createWhileAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.And
	 * @generated
	 */
  public Adapter createAndAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Or
	 * @generated
	 */
  public Adapter createOrAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Not
	 * @generated
	 */
  public Adapter createNotAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Addition
	 * @generated
	 */
  public Adapter createAdditionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Subtraction
	 * @generated
	 */
  public Adapter createSubtractionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Multiplication
	 * @generated
	 */
  public Adapter createMultiplicationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Division
	 * @generated
	 */
  public Adapter createDivisionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Modulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Modulus
	 * @generated
	 */
  public Adapter createModulusAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Equal
	 * @generated
	 */
  public Adapter createEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.NotEqual
	 * @generated
	 */
  public Adapter createNotEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.LessThan
	 * @generated
	 */
  public Adapter createLessThanAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.GreaterThan
	 * @generated
	 */
  public Adapter createGreaterThanAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.LessEqual <em>Less Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.LessEqual
	 * @generated
	 */
  public Adapter createLessEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.GreaterEqual <em>Greater Equal</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.GreaterEqual
	 * @generated
	 */
  public Adapter createGreaterEqualAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Max
	 * @generated
	 */
  public Adapter createMaxAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Min
	 * @generated
	 */
  public Adapter createMinAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Avg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Avg
	 * @generated
	 */
  public Adapter createAvgAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Count
	 * @generated
	 */
  public Adapter createCountAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Sum
	 * @generated
	 */
  public Adapter createSumAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.WithinTimer <em>Within Timer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.WithinTimer
	 * @generated
	 */
  public Adapter createWithinTimerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.WithinTimerElement <em>Within Timer Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.WithinTimerElement
	 * @generated
	 */
  public Adapter createWithinTimerElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.TimeInterval
	 * @generated
	 */
  public Adapter createTimeIntervalAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.TimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.TimeSchedule
	 * @generated
	 */
  public Adapter createTimeScheduleAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Event
	 * @generated
	 */
  public Adapter createEventAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.EventProperty <em>Event Property</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.EventProperty
	 * @generated
	 */
  public Adapter createEventPropertyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Value
	 * @generated
	 */
  public Adapter createValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Email
	 * @generated
	 */
  public Adapter createEmailAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eventpattern.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eventpattern.Twitter
	 * @generated
	 */
  public Adapter createTwitterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //EventpatternAdapterFactory
