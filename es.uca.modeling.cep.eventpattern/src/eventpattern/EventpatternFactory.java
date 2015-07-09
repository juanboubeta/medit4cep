/**
 */
package eventpattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eventpattern.EventpatternPackage
 * @generated
 */
public interface EventpatternFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EventpatternFactory eINSTANCE = eventpattern.impl.EventpatternFactoryImpl.init();

  /**
   * Returns a new object of class '<em>CEP Event Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CEP Event Pattern</em>'.
   * @generated
   */
  CEPEventPattern createCEPEventPattern();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Complex Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Event</em>'.
   * @generated
   */
  ComplexEvent createComplexEvent();

  /**
   * Returns a new object of class '<em>Complex Event Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Event Property</em>'.
   * @generated
   */
  ComplexEventProperty createComplexEventProperty();

  /**
   * Returns a new object of class '<em>Sliding Event Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sliding Event Interval</em>'.
   * @generated
   */
  SlidingEventInterval createSlidingEventInterval();

  /**
   * Returns a new object of class '<em>Batching Event Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Batching Event Interval</em>'.
   * @generated
   */
  BatchingEventInterval createBatchingEventInterval();

  /**
   * Returns a new object of class '<em>Sliding Time Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sliding Time Interval</em>'.
   * @generated
   */
  SlidingTimeInterval createSlidingTimeInterval();

  /**
   * Returns a new object of class '<em>Batching Time Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Batching Time Interval</em>'.
   * @generated
   */
  BatchingTimeInterval createBatchingTimeInterval();

  /**
   * Returns a new object of class '<em>Every</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Every</em>'.
   * @generated
   */
  Every createEvery();

  /**
   * Returns a new object of class '<em>Every Distinct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Every Distinct</em>'.
   * @generated
   */
  EveryDistinct createEveryDistinct();

  /**
   * Returns a new object of class '<em>Repeat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat</em>'.
   * @generated
   */
  Repeat createRepeat();

  /**
   * Returns a new object of class '<em>Until</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Until</em>'.
   * @generated
   */
  Until createUntil();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns a new object of class '<em>Followed By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Followed By</em>'.
   * @generated
   */
  FollowedBy createFollowedBy();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition</em>'.
   * @generated
   */
  Addition createAddition();

  /**
   * Returns a new object of class '<em>Subtraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtraction</em>'.
   * @generated
   */
  Subtraction createSubtraction();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns a new object of class '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division</em>'.
   * @generated
   */
  Division createDivision();

  /**
   * Returns a new object of class '<em>Modulus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modulus</em>'.
   * @generated
   */
  Modulus createModulus();

  /**
   * Returns a new object of class '<em>Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equal</em>'.
   * @generated
   */
  Equal createEqual();

  /**
   * Returns a new object of class '<em>Not Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Equal</em>'.
   * @generated
   */
  NotEqual createNotEqual();

  /**
   * Returns a new object of class '<em>Less Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Than</em>'.
   * @generated
   */
  LessThan createLessThan();

  /**
   * Returns a new object of class '<em>Greater Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Than</em>'.
   * @generated
   */
  GreaterThan createGreaterThan();

  /**
   * Returns a new object of class '<em>Less Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Equal</em>'.
   * @generated
   */
  LessEqual createLessEqual();

  /**
   * Returns a new object of class '<em>Greater Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Equal</em>'.
   * @generated
   */
  GreaterEqual createGreaterEqual();

  /**
   * Returns a new object of class '<em>Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max</em>'.
   * @generated
   */
  Max createMax();

  /**
   * Returns a new object of class '<em>Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min</em>'.
   * @generated
   */
  Min createMin();

  /**
   * Returns a new object of class '<em>Avg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avg</em>'.
   * @generated
   */
  Avg createAvg();

  /**
   * Returns a new object of class '<em>Count</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count</em>'.
   * @generated
   */
  Count createCount();

  /**
   * Returns a new object of class '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum</em>'.
   * @generated
   */
  Sum createSum();

  /**
   * Returns a new object of class '<em>Within Timer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Within Timer</em>'.
   * @generated
   */
  WithinTimer createWithinTimer();

  /**
   * Returns a new object of class '<em>Time Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Interval</em>'.
   * @generated
   */
  TimeInterval createTimeInterval();

  /**
   * Returns a new object of class '<em>Time Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Schedule</em>'.
   * @generated
   */
  TimeSchedule createTimeSchedule();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Event Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Property</em>'.
   * @generated
   */
  EventProperty createEventProperty();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Email</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Email</em>'.
   * @generated
   */
  Email createEmail();

  /**
   * Returns a new object of class '<em>Twitter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Twitter</em>'.
   * @generated
   */
  Twitter createTwitter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EventpatternPackage getEventpatternPackage();

} //EventpatternFactory
