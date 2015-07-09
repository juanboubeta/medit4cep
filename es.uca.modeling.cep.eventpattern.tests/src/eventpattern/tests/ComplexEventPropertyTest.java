/**
 */
package eventpattern.tests;

import eventpattern.ComplexEventProperty;
import eventpattern.EventpatternFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Event Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexEventPropertyTest extends UnaryOperatorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ComplexEventPropertyTest.class);
  }

  /**
   * Constructs a new Complex Event Property test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexEventPropertyTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Complex Event Property test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ComplexEventProperty getFixture()
  {
    return (ComplexEventProperty)fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createComplexEventProperty());
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

} //ComplexEventPropertyTest
