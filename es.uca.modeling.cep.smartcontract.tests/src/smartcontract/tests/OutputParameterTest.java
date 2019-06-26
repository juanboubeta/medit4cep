/**
 */
package smartcontract.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smartcontract.OutputParameter;
import smartcontract.SmartcontractFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputParameterTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputParameterTest.class);
	}

	/**
	 * Constructs a new Output Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputParameter getFixture() {
		return (OutputParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartcontractFactory.eINSTANCE.createOutputParameter());
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

} //OutputParameterTest
