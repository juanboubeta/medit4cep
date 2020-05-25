/**
 */
package cepapp.tests;

import cepapp.CepappFactory;
import cepapp.InMemoryOutput;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>In Memory Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InMemoryOutputTest extends InMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InMemoryOutputTest.class);
	}

	/**
	 * Constructs a new In Memory Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMemoryOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this In Memory Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InMemoryOutput getFixture() {
		return (InMemoryOutput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CepappFactory.eINSTANCE.createInMemoryOutput());
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

} //InMemoryOutputTest
