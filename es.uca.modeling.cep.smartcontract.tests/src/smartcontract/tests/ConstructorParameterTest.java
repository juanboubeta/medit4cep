/**
 */
package smartcontract.tests;

import junit.textui.TestRunner;

import smartcontract.ConstructorParameter;
import smartcontract.SmartcontractFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constructor Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructorParameterTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstructorParameterTest.class);
	}

	/**
	 * Constructs a new Constructor Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constructor Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstructorParameter getFixture() {
		return (ConstructorParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartcontractFactory.eINSTANCE.createConstructorParameter());
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

} //ConstructorParameterTest
