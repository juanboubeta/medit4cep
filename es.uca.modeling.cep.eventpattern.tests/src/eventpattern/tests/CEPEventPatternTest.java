/**
 */
package eventpattern.tests;

import eventpattern.CEPEventPattern;
import eventpattern.EventpatternFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CEP Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CEPEventPatternTest extends TestCase
{

  /**
   * The fixture for this CEP Event Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CEPEventPattern fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CEPEventPatternTest.class);
  }

  /**
   * Constructs a new CEP Event Pattern test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CEPEventPatternTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this CEP Event Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(CEPEventPattern fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this CEP Event Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CEPEventPattern getFixture()
  {
    return fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createCEPEventPattern());
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

} //CEPEventPatternTest
