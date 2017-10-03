/**
 */
package eventpattern.impl;

import eventpattern.EventpatternPackage;
import eventpattern.NaryOperator;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NaryOperatorImpl extends OperatorImpl implements NaryOperator
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NaryOperatorImpl()
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
		return EventpatternPackage.Literals.NARY_OPERATOR;
	}

} //NaryOperatorImpl
