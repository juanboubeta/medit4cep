/**
 */
package eventpattern.tests;

import eventpattern.BatchingEventInterval;
import eventpattern.EventpatternFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Batching Event Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BatchingEventIntervalTest extends DataWindowTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(BatchingEventIntervalTest.class);
	}

  /**
	 * Constructs a new Batching Event Interval test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BatchingEventIntervalTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Batching Event Interval test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected BatchingEventInterval getFixture()
  {
		return (BatchingEventInterval)fixture;
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
		setFixture(EventpatternFactory.eINSTANCE.createBatchingEventInterval());
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

} //BatchingEventIntervalTest
