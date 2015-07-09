/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.EveryDistinct;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Every Distinct</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EveryDistinctTest extends NaryOperatorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EveryDistinctTest.class);
  }

  /**
   * Constructs a new Every Distinct test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveryDistinctTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Every Distinct test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EveryDistinct getFixture()
  {
    return (EveryDistinct)fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createEveryDistinct());
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

} //EveryDistinctTest
