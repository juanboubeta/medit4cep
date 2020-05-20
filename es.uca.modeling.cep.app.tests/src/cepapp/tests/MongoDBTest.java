/**
 */
package cepapp.tests;

import cepapp.MongoDB;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mongo DB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class MongoDBTest extends DatabaseTest {

	/**
	 * Constructs a new Mongo DB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongoDBTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mongo DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MongoDB getFixture() {
		return (MongoDB)fixture;
	}

} //MongoDBTest
