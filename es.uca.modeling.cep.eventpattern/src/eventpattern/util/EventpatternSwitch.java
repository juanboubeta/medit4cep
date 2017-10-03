/**
 */
package eventpattern.util;

import eventpattern.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eventpattern.EventpatternPackage
 * @generated
 */
public class EventpatternSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EventpatternPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EventpatternSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EventpatternPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case EventpatternPackage.CEP_EVENT_PATTERN: {
				CEPEventPattern cepEventPattern = (CEPEventPattern)theEObject;
				T result = caseCEPEventPattern(cepEventPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseOperator(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseOperator(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.NARY_OPERATOR: {
				NaryOperator naryOperator = (NaryOperator)theEObject;
				T result = caseNaryOperator(naryOperator);
				if (result == null) result = caseOperator(naryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.OPERAND: {
				Operand operand = (Operand)theEObject;
				T result = caseOperand(operand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EVENT_PATTERN_ELEMENT: {
				EventPatternElement eventPatternElement = (EventPatternElement)theEObject;
				T result = caseEventPatternElement(eventPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.COMPLEX_EVENT: {
				ComplexEvent complexEvent = (ComplexEvent)theEObject;
				T result = caseComplexEvent(complexEvent);
				if (result == null) result = caseOperand(complexEvent);
				if (result == null) result = caseOperator(complexEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.COMPLEX_EVENT_PROPERTY: {
				ComplexEventProperty complexEventProperty = (ComplexEventProperty)theEObject;
				T result = caseComplexEventProperty(complexEventProperty);
				if (result == null) result = caseUnaryOperator(complexEventProperty);
				if (result == null) result = caseOperator(complexEventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseUnaryOperator(action);
				if (result == null) result = caseOperator(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.DATA_WINDOW: {
				DataWindow dataWindow = (DataWindow)theEObject;
				T result = caseDataWindow(dataWindow);
				if (result == null) result = caseEventPatternElement(dataWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.SLIDING_EVENT_INTERVAL: {
				SlidingEventInterval slidingEventInterval = (SlidingEventInterval)theEObject;
				T result = caseSlidingEventInterval(slidingEventInterval);
				if (result == null) result = caseDataWindow(slidingEventInterval);
				if (result == null) result = caseEventPatternElement(slidingEventInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.BATCHING_EVENT_INTERVAL: {
				BatchingEventInterval batchingEventInterval = (BatchingEventInterval)theEObject;
				T result = caseBatchingEventInterval(batchingEventInterval);
				if (result == null) result = caseDataWindow(batchingEventInterval);
				if (result == null) result = caseEventPatternElement(batchingEventInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.SLIDING_TIME_INTERVAL: {
				SlidingTimeInterval slidingTimeInterval = (SlidingTimeInterval)theEObject;
				T result = caseSlidingTimeInterval(slidingTimeInterval);
				if (result == null) result = caseDataWindow(slidingTimeInterval);
				if (result == null) result = caseEventPatternElement(slidingTimeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.BATCHING_TIME_INTERVAL: {
				BatchingTimeInterval batchingTimeInterval = (BatchingTimeInterval)theEObject;
				T result = caseBatchingTimeInterval(batchingTimeInterval);
				if (result == null) result = caseDataWindow(batchingTimeInterval);
				if (result == null) result = caseEventPatternElement(batchingTimeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EVENT_PATTERN_CONDITION: {
				EventPatternCondition eventPatternCondition = (EventPatternCondition)theEObject;
				T result = caseEventPatternCondition(eventPatternCondition);
				if (result == null) result = caseEventPatternElement(eventPatternCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.AGGREGATION_OPERATOR: {
				AggregationOperator aggregationOperator = (AggregationOperator)theEObject;
				T result = caseAggregationOperator(aggregationOperator);
				if (result == null) result = caseUnaryOperator(aggregationOperator);
				if (result == null) result = caseOperand(aggregationOperator);
				if (result == null) result = caseEventPatternCondition(aggregationOperator);
				if (result == null) result = caseOperator(aggregationOperator);
				if (result == null) result = caseEventPatternElement(aggregationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.CONDITION_OPERATOR: {
				ConditionOperator conditionOperator = (ConditionOperator)theEObject;
				T result = caseConditionOperator(conditionOperator);
				if (result == null) result = caseOperator(conditionOperator);
				if (result == null) result = caseConditionOperand(conditionOperator);
				if (result == null) result = caseOperand(conditionOperator);
				if (result == null) result = caseEventPatternCondition(conditionOperator);
				if (result == null) result = caseWithinTimerElement(conditionOperator);
				if (result == null) result = caseEventPatternElement(conditionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.CONDITION_OPERAND: {
				ConditionOperand conditionOperand = (ConditionOperand)theEObject;
				T result = caseConditionOperand(conditionOperand);
				if (result == null) result = caseOperand(conditionOperand);
				if (result == null) result = caseEventPatternCondition(conditionOperand);
				if (result == null) result = caseWithinTimerElement(conditionOperand);
				if (result == null) result = caseEventPatternElement(conditionOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.PATTERN_OPERATOR: {
				PatternOperator patternOperator = (PatternOperator)theEObject;
				T result = casePatternOperator(patternOperator);
				if (result == null) result = caseOperator(patternOperator);
				if (result == null) result = casePatternOperand(patternOperator);
				if (result == null) result = caseWithinTimerElement(patternOperator);
				if (result == null) result = caseOperand(patternOperator);
				if (result == null) result = caseEventPatternCondition(patternOperator);
				if (result == null) result = caseEventPatternElement(patternOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.PATTERN_OPERAND: {
				PatternOperand patternOperand = (PatternOperand)theEObject;
				T result = casePatternOperand(patternOperand);
				if (result == null) result = caseOperand(patternOperand);
				if (result == null) result = caseEventPatternCondition(patternOperand);
				if (result == null) result = caseEventPatternElement(patternOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.ARITHMETIC_OPERATOR: {
				ArithmeticOperator arithmeticOperator = (ArithmeticOperator)theEObject;
				T result = caseArithmeticOperator(arithmeticOperator);
				if (result == null) result = caseBinaryOperator(arithmeticOperator);
				if (result == null) result = caseConditionOperator(arithmeticOperator);
				if (result == null) result = caseOperator(arithmeticOperator);
				if (result == null) result = caseConditionOperand(arithmeticOperator);
				if (result == null) result = caseOperand(arithmeticOperator);
				if (result == null) result = caseEventPatternCondition(arithmeticOperator);
				if (result == null) result = caseWithinTimerElement(arithmeticOperator);
				if (result == null) result = caseEventPatternElement(arithmeticOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.COMPARISON_OPERATOR: {
				ComparisonOperator comparisonOperator = (ComparisonOperator)theEObject;
				T result = caseComparisonOperator(comparisonOperator);
				if (result == null) result = caseBinaryOperator(comparisonOperator);
				if (result == null) result = caseConditionOperator(comparisonOperator);
				if (result == null) result = caseOperator(comparisonOperator);
				if (result == null) result = caseConditionOperand(comparisonOperator);
				if (result == null) result = caseOperand(comparisonOperator);
				if (result == null) result = caseEventPatternCondition(comparisonOperator);
				if (result == null) result = caseWithinTimerElement(comparisonOperator);
				if (result == null) result = caseEventPatternElement(comparisonOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = caseConditionOperator(logicalOperator);
				if (result == null) result = casePatternOperator(logicalOperator);
				if (result == null) result = caseOperator(logicalOperator);
				if (result == null) result = caseConditionOperand(logicalOperator);
				if (result == null) result = casePatternOperand(logicalOperator);
				if (result == null) result = caseOperand(logicalOperator);
				if (result == null) result = caseEventPatternCondition(logicalOperator);
				if (result == null) result = caseWithinTimerElement(logicalOperator);
				if (result == null) result = caseEventPatternElement(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.GROUP_BY: {
				GroupBy groupBy = (GroupBy)theEObject;
				T result = caseGroupBy(groupBy);
				if (result == null) result = caseNaryOperator(groupBy);
				if (result == null) result = caseEventPatternCondition(groupBy);
				if (result == null) result = caseOperator(groupBy);
				if (result == null) result = caseEventPatternElement(groupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EVERY: {
				Every every = (Every)theEObject;
				T result = caseEvery(every);
				if (result == null) result = caseUnaryOperator(every);
				if (result == null) result = casePatternOperator(every);
				if (result == null) result = caseOperator(every);
				if (result == null) result = casePatternOperand(every);
				if (result == null) result = caseWithinTimerElement(every);
				if (result == null) result = caseOperand(every);
				if (result == null) result = caseEventPatternCondition(every);
				if (result == null) result = caseEventPatternElement(every);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EVERY_DISTINCT: {
				EveryDistinct everyDistinct = (EveryDistinct)theEObject;
				T result = caseEveryDistinct(everyDistinct);
				if (result == null) result = caseNaryOperator(everyDistinct);
				if (result == null) result = casePatternOperator(everyDistinct);
				if (result == null) result = caseOperator(everyDistinct);
				if (result == null) result = casePatternOperand(everyDistinct);
				if (result == null) result = caseWithinTimerElement(everyDistinct);
				if (result == null) result = caseOperand(everyDistinct);
				if (result == null) result = caseEventPatternCondition(everyDistinct);
				if (result == null) result = caseEventPatternElement(everyDistinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.REPEAT: {
				Repeat repeat = (Repeat)theEObject;
				T result = caseRepeat(repeat);
				if (result == null) result = caseUnaryOperator(repeat);
				if (result == null) result = casePatternOperator(repeat);
				if (result == null) result = caseOperator(repeat);
				if (result == null) result = casePatternOperand(repeat);
				if (result == null) result = caseWithinTimerElement(repeat);
				if (result == null) result = caseOperand(repeat);
				if (result == null) result = caseEventPatternCondition(repeat);
				if (result == null) result = caseEventPatternElement(repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.UNTIL: {
				Until until = (Until)theEObject;
				T result = caseUntil(until);
				if (result == null) result = caseBinaryOperator(until);
				if (result == null) result = casePatternOperator(until);
				if (result == null) result = caseOperator(until);
				if (result == null) result = casePatternOperand(until);
				if (result == null) result = caseWithinTimerElement(until);
				if (result == null) result = caseOperand(until);
				if (result == null) result = caseEventPatternCondition(until);
				if (result == null) result = caseEventPatternElement(until);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseUnaryOperator(range);
				if (result == null) result = casePatternOperator(range);
				if (result == null) result = caseOperator(range);
				if (result == null) result = casePatternOperand(range);
				if (result == null) result = caseWithinTimerElement(range);
				if (result == null) result = caseOperand(range);
				if (result == null) result = caseEventPatternCondition(range);
				if (result == null) result = caseEventPatternElement(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.FOLLOWED_BY: {
				FollowedBy followedBy = (FollowedBy)theEObject;
				T result = caseFollowedBy(followedBy);
				if (result == null) result = caseNaryOperator(followedBy);
				if (result == null) result = casePatternOperator(followedBy);
				if (result == null) result = caseOperator(followedBy);
				if (result == null) result = casePatternOperand(followedBy);
				if (result == null) result = caseWithinTimerElement(followedBy);
				if (result == null) result = caseOperand(followedBy);
				if (result == null) result = caseEventPatternCondition(followedBy);
				if (result == null) result = caseEventPatternElement(followedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseBinaryOperator(while_);
				if (result == null) result = casePatternOperator(while_);
				if (result == null) result = caseOperator(while_);
				if (result == null) result = casePatternOperand(while_);
				if (result == null) result = caseWithinTimerElement(while_);
				if (result == null) result = caseOperand(while_);
				if (result == null) result = caseEventPatternCondition(while_);
				if (result == null) result = caseEventPatternElement(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseNaryOperator(and);
				if (result == null) result = caseLogicalOperator(and);
				if (result == null) result = caseConditionOperator(and);
				if (result == null) result = casePatternOperator(and);
				if (result == null) result = caseOperator(and);
				if (result == null) result = caseConditionOperand(and);
				if (result == null) result = casePatternOperand(and);
				if (result == null) result = caseOperand(and);
				if (result == null) result = caseEventPatternCondition(and);
				if (result == null) result = caseWithinTimerElement(and);
				if (result == null) result = caseEventPatternElement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseNaryOperator(or);
				if (result == null) result = caseLogicalOperator(or);
				if (result == null) result = caseConditionOperator(or);
				if (result == null) result = casePatternOperator(or);
				if (result == null) result = caseOperator(or);
				if (result == null) result = caseConditionOperand(or);
				if (result == null) result = casePatternOperand(or);
				if (result == null) result = caseOperand(or);
				if (result == null) result = caseEventPatternCondition(or);
				if (result == null) result = caseWithinTimerElement(or);
				if (result == null) result = caseEventPatternElement(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseUnaryOperator(not);
				if (result == null) result = caseLogicalOperator(not);
				if (result == null) result = caseConditionOperator(not);
				if (result == null) result = casePatternOperator(not);
				if (result == null) result = caseOperator(not);
				if (result == null) result = caseConditionOperand(not);
				if (result == null) result = casePatternOperand(not);
				if (result == null) result = caseOperand(not);
				if (result == null) result = caseEventPatternCondition(not);
				if (result == null) result = caseWithinTimerElement(not);
				if (result == null) result = caseEventPatternElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseArithmeticOperator(addition);
				if (result == null) result = caseBinaryOperator(addition);
				if (result == null) result = caseConditionOperator(addition);
				if (result == null) result = caseOperator(addition);
				if (result == null) result = caseConditionOperand(addition);
				if (result == null) result = caseOperand(addition);
				if (result == null) result = caseEventPatternCondition(addition);
				if (result == null) result = caseWithinTimerElement(addition);
				if (result == null) result = caseEventPatternElement(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.SUBTRACTION: {
				Subtraction subtraction = (Subtraction)theEObject;
				T result = caseSubtraction(subtraction);
				if (result == null) result = caseArithmeticOperator(subtraction);
				if (result == null) result = caseBinaryOperator(subtraction);
				if (result == null) result = caseConditionOperator(subtraction);
				if (result == null) result = caseOperator(subtraction);
				if (result == null) result = caseConditionOperand(subtraction);
				if (result == null) result = caseOperand(subtraction);
				if (result == null) result = caseEventPatternCondition(subtraction);
				if (result == null) result = caseWithinTimerElement(subtraction);
				if (result == null) result = caseEventPatternElement(subtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseArithmeticOperator(multiplication);
				if (result == null) result = caseBinaryOperator(multiplication);
				if (result == null) result = caseConditionOperator(multiplication);
				if (result == null) result = caseOperator(multiplication);
				if (result == null) result = caseConditionOperand(multiplication);
				if (result == null) result = caseOperand(multiplication);
				if (result == null) result = caseEventPatternCondition(multiplication);
				if (result == null) result = caseWithinTimerElement(multiplication);
				if (result == null) result = caseEventPatternElement(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseArithmeticOperator(division);
				if (result == null) result = caseBinaryOperator(division);
				if (result == null) result = caseConditionOperator(division);
				if (result == null) result = caseOperator(division);
				if (result == null) result = caseConditionOperand(division);
				if (result == null) result = caseOperand(division);
				if (result == null) result = caseEventPatternCondition(division);
				if (result == null) result = caseWithinTimerElement(division);
				if (result == null) result = caseEventPatternElement(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.MODULUS: {
				Modulus modulus = (Modulus)theEObject;
				T result = caseModulus(modulus);
				if (result == null) result = caseArithmeticOperator(modulus);
				if (result == null) result = caseBinaryOperator(modulus);
				if (result == null) result = caseConditionOperator(modulus);
				if (result == null) result = caseOperator(modulus);
				if (result == null) result = caseConditionOperand(modulus);
				if (result == null) result = caseOperand(modulus);
				if (result == null) result = caseEventPatternCondition(modulus);
				if (result == null) result = caseWithinTimerElement(modulus);
				if (result == null) result = caseEventPatternElement(modulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseComparisonOperator(equal);
				if (result == null) result = caseBinaryOperator(equal);
				if (result == null) result = caseConditionOperator(equal);
				if (result == null) result = caseOperator(equal);
				if (result == null) result = caseConditionOperand(equal);
				if (result == null) result = caseOperand(equal);
				if (result == null) result = caseEventPatternCondition(equal);
				if (result == null) result = caseWithinTimerElement(equal);
				if (result == null) result = caseEventPatternElement(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseComparisonOperator(notEqual);
				if (result == null) result = caseBinaryOperator(notEqual);
				if (result == null) result = caseConditionOperator(notEqual);
				if (result == null) result = caseOperator(notEqual);
				if (result == null) result = caseConditionOperand(notEqual);
				if (result == null) result = caseOperand(notEqual);
				if (result == null) result = caseEventPatternCondition(notEqual);
				if (result == null) result = caseWithinTimerElement(notEqual);
				if (result == null) result = caseEventPatternElement(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseComparisonOperator(lessThan);
				if (result == null) result = caseBinaryOperator(lessThan);
				if (result == null) result = caseConditionOperator(lessThan);
				if (result == null) result = caseOperator(lessThan);
				if (result == null) result = caseConditionOperand(lessThan);
				if (result == null) result = caseOperand(lessThan);
				if (result == null) result = caseEventPatternCondition(lessThan);
				if (result == null) result = caseWithinTimerElement(lessThan);
				if (result == null) result = caseEventPatternElement(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseComparisonOperator(greaterThan);
				if (result == null) result = caseBinaryOperator(greaterThan);
				if (result == null) result = caseConditionOperator(greaterThan);
				if (result == null) result = caseOperator(greaterThan);
				if (result == null) result = caseConditionOperand(greaterThan);
				if (result == null) result = caseOperand(greaterThan);
				if (result == null) result = caseEventPatternCondition(greaterThan);
				if (result == null) result = caseWithinTimerElement(greaterThan);
				if (result == null) result = caseEventPatternElement(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.LESS_EQUAL: {
				LessEqual lessEqual = (LessEqual)theEObject;
				T result = caseLessEqual(lessEqual);
				if (result == null) result = caseComparisonOperator(lessEqual);
				if (result == null) result = caseBinaryOperator(lessEqual);
				if (result == null) result = caseConditionOperator(lessEqual);
				if (result == null) result = caseOperator(lessEqual);
				if (result == null) result = caseConditionOperand(lessEqual);
				if (result == null) result = caseOperand(lessEqual);
				if (result == null) result = caseEventPatternCondition(lessEqual);
				if (result == null) result = caseWithinTimerElement(lessEqual);
				if (result == null) result = caseEventPatternElement(lessEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.GREATER_EQUAL: {
				GreaterEqual greaterEqual = (GreaterEqual)theEObject;
				T result = caseGreaterEqual(greaterEqual);
				if (result == null) result = caseComparisonOperator(greaterEqual);
				if (result == null) result = caseBinaryOperator(greaterEqual);
				if (result == null) result = caseConditionOperator(greaterEqual);
				if (result == null) result = caseOperator(greaterEqual);
				if (result == null) result = caseConditionOperand(greaterEqual);
				if (result == null) result = caseOperand(greaterEqual);
				if (result == null) result = caseEventPatternCondition(greaterEqual);
				if (result == null) result = caseWithinTimerElement(greaterEqual);
				if (result == null) result = caseEventPatternElement(greaterEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.MAX: {
				Max max = (Max)theEObject;
				T result = caseMax(max);
				if (result == null) result = caseAggregationOperator(max);
				if (result == null) result = caseUnaryOperator(max);
				if (result == null) result = caseOperand(max);
				if (result == null) result = caseEventPatternCondition(max);
				if (result == null) result = caseOperator(max);
				if (result == null) result = caseEventPatternElement(max);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.MIN: {
				Min min = (Min)theEObject;
				T result = caseMin(min);
				if (result == null) result = caseAggregationOperator(min);
				if (result == null) result = caseUnaryOperator(min);
				if (result == null) result = caseOperand(min);
				if (result == null) result = caseEventPatternCondition(min);
				if (result == null) result = caseOperator(min);
				if (result == null) result = caseEventPatternElement(min);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.AVG: {
				Avg avg = (Avg)theEObject;
				T result = caseAvg(avg);
				if (result == null) result = caseAggregationOperator(avg);
				if (result == null) result = caseUnaryOperator(avg);
				if (result == null) result = caseOperand(avg);
				if (result == null) result = caseEventPatternCondition(avg);
				if (result == null) result = caseOperator(avg);
				if (result == null) result = caseEventPatternElement(avg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseAggregationOperator(count);
				if (result == null) result = caseUnaryOperator(count);
				if (result == null) result = caseOperand(count);
				if (result == null) result = caseEventPatternCondition(count);
				if (result == null) result = caseOperator(count);
				if (result == null) result = caseEventPatternElement(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.SUM: {
				Sum sum = (Sum)theEObject;
				T result = caseSum(sum);
				if (result == null) result = caseAggregationOperator(sum);
				if (result == null) result = caseUnaryOperator(sum);
				if (result == null) result = caseOperand(sum);
				if (result == null) result = caseEventPatternCondition(sum);
				if (result == null) result = caseOperator(sum);
				if (result == null) result = caseEventPatternElement(sum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.WITHIN_TIMER: {
				WithinTimer withinTimer = (WithinTimer)theEObject;
				T result = caseWithinTimer(withinTimer);
				if (result == null) result = casePatternOperand(withinTimer);
				if (result == null) result = caseOperand(withinTimer);
				if (result == null) result = caseEventPatternCondition(withinTimer);
				if (result == null) result = caseEventPatternElement(withinTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.WITHIN_TIMER_ELEMENT: {
				WithinTimerElement withinTimerElement = (WithinTimerElement)theEObject;
				T result = caseWithinTimerElement(withinTimerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = casePatternOperand(timeInterval);
				if (result == null) result = caseOperand(timeInterval);
				if (result == null) result = caseEventPatternCondition(timeInterval);
				if (result == null) result = caseEventPatternElement(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.TIME_SCHEDULE: {
				TimeSchedule timeSchedule = (TimeSchedule)theEObject;
				T result = caseTimeSchedule(timeSchedule);
				if (result == null) result = casePatternOperand(timeSchedule);
				if (result == null) result = caseOperand(timeSchedule);
				if (result == null) result = caseEventPatternCondition(timeSchedule);
				if (result == null) result = caseEventPatternElement(timeSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = casePatternOperand(event);
				if (result == null) result = caseWithinTimerElement(event);
				if (result == null) result = caseOperand(event);
				if (result == null) result = caseEventPatternCondition(event);
				if (result == null) result = caseEventPatternElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EVENT_PROPERTY: {
				EventProperty eventProperty = (EventProperty)theEObject;
				T result = caseEventProperty(eventProperty);
				if (result == null) result = caseConditionOperand(eventProperty);
				if (result == null) result = caseOperand(eventProperty);
				if (result == null) result = caseEventPatternCondition(eventProperty);
				if (result == null) result = caseWithinTimerElement(eventProperty);
				if (result == null) result = caseEventPatternElement(eventProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseConditionOperand(value);
				if (result == null) result = caseOperand(value);
				if (result == null) result = caseEventPatternCondition(value);
				if (result == null) result = caseWithinTimerElement(value);
				if (result == null) result = caseEventPatternElement(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.EMAIL: {
				Email email = (Email)theEObject;
				T result = caseEmail(email);
				if (result == null) result = caseAction(email);
				if (result == null) result = caseUnaryOperator(email);
				if (result == null) result = caseOperator(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventpatternPackage.TWITTER: {
				Twitter twitter = (Twitter)theEObject;
				T result = caseTwitter(twitter);
				if (result == null) result = caseAction(twitter);
				if (result == null) result = caseUnaryOperator(twitter);
				if (result == null) result = caseOperator(twitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>CEP Event Pattern</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEP Event Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCEPEventPattern(CEPEventPattern object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLink(Link object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperator(Operator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseUnaryOperator(UnaryOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBinaryOperator(BinaryOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNaryOperator(NaryOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperand(Operand object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Event Pattern Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEventPatternElement(EventPatternElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Event</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseComplexEvent(ComplexEvent object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Event Property</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseComplexEventProperty(ComplexEventProperty object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAction(Action object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Window</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDataWindow(DataWindow object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Sliding Event Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sliding Event Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSlidingEventInterval(SlidingEventInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Batching Event Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batching Event Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBatchingEventInterval(BatchingEventInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Sliding Time Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sliding Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSlidingTimeInterval(SlidingTimeInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Batching Time Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batching Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBatchingTimeInterval(BatchingTimeInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Event Pattern Condition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Pattern Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEventPatternCondition(EventPatternCondition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAggregationOperator(AggregationOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConditionOperator(ConditionOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Operand</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConditionOperand(ConditionOperand object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePatternOperator(PatternOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Operand</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePatternOperand(PatternOperand object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArithmeticOperator(ArithmeticOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseComparisonOperator(ComparisonOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLogicalOperator(LogicalOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupBy(GroupBy object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Every</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Every</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEvery(Every object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Every Distinct</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Every Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEveryDistinct(EveryDistinct object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRepeat(Repeat object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseUntil(Until object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRange(Range object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Followed By</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Followed By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFollowedBy(FollowedBy object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWhile(While object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnd(And object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOr(Or object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNot(Not object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAddition(Addition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSubtraction(Subtraction object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMultiplication(Multiplication object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDivision(Division object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Modulus</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseModulus(Modulus object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEqual(Equal object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNotEqual(NotEqual object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLessThan(LessThan object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGreaterThan(GreaterThan object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Less Equal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLessEqual(LessEqual object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Equal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseGreaterEqual(GreaterEqual object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Max</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMax(Max object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Min</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMin(Min object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Avg</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAvg(Avg object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCount(Count object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSum(Sum object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Within Timer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWithinTimer(WithinTimer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Within Timer Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within Timer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWithinTimerElement(WithinTimerElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTimeInterval(TimeInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Schedule</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTimeSchedule(TimeSchedule object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEvent(Event object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Event Property</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEventProperty(EventProperty object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValue(Value object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEmail(Email object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Twitter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTwitter(Twitter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //EventpatternSwitch
