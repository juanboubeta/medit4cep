/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.Multiplication;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplicationTest extends ArithmeticOperatorTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(MultiplicationTest.class);
	}

  /**
	 * Constructs a new Multiplication test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MultiplicationTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Multiplication test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected Multiplication getFixture()
  {
		return (Multiplication)fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(EventpatternFactory.eINSTANCE.createMultiplication());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //MultiplicationTest
