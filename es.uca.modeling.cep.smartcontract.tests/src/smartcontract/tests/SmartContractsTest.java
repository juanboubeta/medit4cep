/**
 */
package smartcontract.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smartcontract.SmartContracts;
import smartcontract.SmartcontractFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Smart Contracts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartContractsTest extends TestCase {

	/**
	 * The fixture for this Smart Contracts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContracts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SmartContractsTest.class);
	}

	/**
	 * Constructs a new Smart Contracts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContractsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Smart Contracts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SmartContracts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Smart Contracts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContracts getFixture() {
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
		setFixture(SmartcontractFactory.eINSTANCE.createSmartContracts());
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

} //SmartContractsTest
