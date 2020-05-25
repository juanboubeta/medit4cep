/**
 */
package cepapp.tests;

import cepapp.CepappFactory;
import cepapp.SinkMongoDB;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sink Mongo DB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinkMongoDBTest extends MongoDBTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinkMongoDBTest.class);
	}

	/**
	 * Constructs a new Sink Mongo DB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkMongoDBTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sink Mongo DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinkMongoDB getFixture() {
		return (SinkMongoDB)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CepappFactory.eINSTANCE.createSinkMongoDB());
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

} //SinkMongoDBTest
