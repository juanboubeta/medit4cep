/**
 */
package cepapp.tests;

import cepapp.CepappFactory;
import cepapp.SinkMqtt;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sink Mqtt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinkMqttTest extends MQTTTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinkMqttTest.class);
	}

	/**
	 * Constructs a new Sink Mqtt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkMqttTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sink Mqtt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinkMqtt getFixture() {
		return (SinkMqtt)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CepappFactory.eINSTANCE.createSinkMqtt());
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

} //SinkMqttTest
