/**
 */
package eventpattern.impl;

import eventpattern.EventpatternPackage;
import eventpattern.NotEqual;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotEqualImpl extends ComparisonOperatorImpl implements NotEqual
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NotEqualImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EventpatternPackage.Literals.NOT_EQUAL;
	}

} //NotEqualImpl
