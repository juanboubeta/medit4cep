/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.Until;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Until</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UntilTest extends BinaryOperatorTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(UntilTest.class);
	}

  /**
	 * Constructs a new Until test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UntilTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Until test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected Until getFixture()
  {
		return (Until)fixture;
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
		setFixture(EventpatternFactory.eINSTANCE.createUntil());
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

} //UntilTest
