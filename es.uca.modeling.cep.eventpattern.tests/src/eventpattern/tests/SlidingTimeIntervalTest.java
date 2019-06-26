/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.SlidingTimeInterval;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sliding Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlidingTimeIntervalTest extends DataWindowTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SlidingTimeIntervalTest.class);
	}

	/**
	 * Constructs a new Sliding Time Interval test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlidingTimeIntervalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sliding Time Interval test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SlidingTimeInterval getFixture() {
		return (SlidingTimeInterval)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventpatternFactory.eINSTANCE.createSlidingTimeInterval());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SlidingTimeIntervalTest
