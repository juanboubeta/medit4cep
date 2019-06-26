/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.GreaterThan;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreaterThanTest extends ComparisonOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GreaterThanTest.class);
	}

	/**
	 * Constructs a new Greater Than test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Greater Than test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GreaterThan getFixture() {
		return (GreaterThan)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventpatternFactory.eINSTANCE.createGreaterThan());
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

} //GreaterThanTest
