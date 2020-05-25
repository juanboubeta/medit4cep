/**
 */
package cepapp.tests;

import cepapp.CepappFactory;
import cepapp.SinkRDBMS;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sink RDBMS</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinkRDBMSTest extends RDBMSTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinkRDBMSTest.class);
	}

	/**
	 * Constructs a new Sink RDBMS test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkRDBMSTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sink RDBMS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinkRDBMS getFixture() {
		return (SinkRDBMS)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	/*@Override
	protected void setUp() throws Exception {
		setFixture(CepappFactory.eINSTANCE.createSinkRDBMS());
	}*/

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

} //SinkRDBMSTest
