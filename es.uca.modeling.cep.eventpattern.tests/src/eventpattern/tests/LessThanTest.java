/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.LessThan;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Less Than</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessThanTest extends ComparisonOperatorTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(LessThanTest.class);
	}

  /**
	 * Constructs a new Less Than test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LessThanTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Less Than test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected LessThan getFixture()
  {
		return (LessThan)fixture;
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
		setFixture(EventpatternFactory.eINSTANCE.createLessThan());
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

} //LessThanTest
