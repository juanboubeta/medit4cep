/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.LessEqual;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Less Equal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessEqualTest extends ComparisonOperatorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(LessEqualTest.class);
  }

  /**
   * Constructs a new Less Equal test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessEqualTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Less Equal test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected LessEqual getFixture()
  {
    return (LessEqual)fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createLessEqual());
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

} //LessEqualTest
