/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.GreaterEqual;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Greater Equal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreaterEqualTest extends ComparisonOperatorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(GreaterEqualTest.class);
  }

  /**
   * Constructs a new Greater Equal test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreaterEqualTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Greater Equal test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected GreaterEqual getFixture()
  {
    return (GreaterEqual)fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createGreaterEqual());
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

} //GreaterEqualTest
