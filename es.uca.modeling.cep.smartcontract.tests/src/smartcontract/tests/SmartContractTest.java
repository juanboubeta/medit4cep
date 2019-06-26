/**
 */
package smartcontract.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smartcontract.SmartContract;
import smartcontract.SmartcontractFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartContractTest extends TestCase {

	/**
	 * The fixture for this Smart Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContract fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SmartContractTest.class);
	}

	/**
	 * Constructs a new Smart Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Smart Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SmartContract fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Smart Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContract getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmartcontractFactory.eINSTANCE.createSmartContract());
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

} //SmartContractTest
