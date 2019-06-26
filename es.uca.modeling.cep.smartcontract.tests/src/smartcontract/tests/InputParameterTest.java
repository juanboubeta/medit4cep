/**
 */
package smartcontract.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smartcontract.InputParameter;
import smartcontract.SmartcontractFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputParameterTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputParameterTest.class);
	}

	/**
	 * Constructs a new Input Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputParameter getFixture() {
		return (InputParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartcontractFactory.eINSTANCE.createInputParameter());
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

} //InputParameterTest
