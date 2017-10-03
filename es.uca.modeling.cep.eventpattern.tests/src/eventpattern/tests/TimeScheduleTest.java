/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.TimeSchedule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeScheduleTest extends PatternOperandTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(TimeScheduleTest.class);
	}

  /**
	 * Constructs a new Time Schedule test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TimeScheduleTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Time Schedule test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected TimeSchedule getFixture()
  {
		return (TimeSchedule)fixture;
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
		setFixture(EventpatternFactory.eINSTANCE.createTimeSchedule());
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

} //TimeScheduleTest
