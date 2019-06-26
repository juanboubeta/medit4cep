/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.Modulus;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modulus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulusTest extends ArithmeticOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModulusTest.class);
	}

	/**
	 * Constructs a new Modulus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modulus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Modulus getFixture() {
		return (Modulus)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventpatternFactory.eINSTANCE.createModulus());
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

} //ModulusTest
