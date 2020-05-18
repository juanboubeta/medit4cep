/**
 */
package cepapp.tests;

import cepapp.CepappFactory;
import cepapp.SinkHttp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sink Http</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinkHttpTest extends HttpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinkHttpTest.class);
	}

	/**
	 * Constructs a new Sink Http test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkHttpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sink Http test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinkHttp getFixture() {
		return (SinkHttp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CepappFactory.eINSTANCE.createSinkHttp());
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

} //SinkHttpTest
