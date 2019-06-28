/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.SlidingEventInterval;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sliding Event Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlidingEventIntervalTest extends DataWindowTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(SlidingEventIntervalTest.class);
	}

  /**
	 * Constructs a new Sliding Event Interval test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SlidingEventIntervalTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Sliding Event Interval test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected SlidingEventInterval getFixture()
  {
		return (SlidingEventInterval)fixture;
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
		setFixture(EventpatternFactory.eINSTANCE.createSlidingEventInterval());
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

} //SlidingEventIntervalTest
