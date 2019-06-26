/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.WithinTimer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Within Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WithinTimerTest extends PatternOperandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WithinTimerTest.class);
	}

	/**
	 * Constructs a new Within Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinTimerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Within Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WithinTimer getFixture() {
		return (WithinTimer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventpatternFactory.eINSTANCE.createWithinTimer());
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

} //WithinTimerTest
