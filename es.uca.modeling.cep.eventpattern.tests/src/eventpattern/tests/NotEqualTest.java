/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.NotEqual;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Equal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotEqualTest extends ComparisonOperatorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(NotEqualTest.class);
  }

  /**
   * Constructs a new Not Equal test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEqualTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Not Equal test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected NotEqual getFixture()
  {
    return (NotEqual)fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createNotEqual());
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

} //NotEqualTest
