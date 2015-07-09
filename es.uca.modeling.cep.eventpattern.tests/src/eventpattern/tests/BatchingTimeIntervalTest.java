/**
 */
package eventpattern.tests;

import eventpattern.BatchingTimeInterval;
import eventpattern.EventpatternFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Batching Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BatchingTimeIntervalTest extends DataWindowTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BatchingTimeIntervalTest.class);
  }

  /**
   * Constructs a new Batching Time Interval test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BatchingTimeIntervalTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Batching Time Interval test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected BatchingTimeInterval getFixture()
  {
    return (BatchingTimeInterval)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(EventpatternFactory.eINSTANCE.createBatchingTimeInterval());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //BatchingTimeIntervalTest
