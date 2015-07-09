/**
 */
package eventpattern.tests;

import eventpattern.EventpatternFactory;
import eventpattern.FollowedBy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Followed By</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FollowedByTest extends NaryOperatorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(FollowedByTest.class);
  }

  /**
   * Constructs a new Followed By test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FollowedByTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Followed By test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected FollowedBy getFixture()
  {
    return (FollowedBy)fixture;
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
    setFixture(EventpatternFactory.eINSTANCE.createFollowedBy());
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

} //FollowedByTest
