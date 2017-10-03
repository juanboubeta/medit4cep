/**
 */
package eventpattern.impl;

import eventpattern.BinaryOperator;
import eventpattern.EventpatternPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BinaryOperatorImpl extends OperatorImpl implements BinaryOperator
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BinaryOperatorImpl()
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
		return EventpatternPackage.Literals.BINARY_OPERATOR;
	}

} //BinaryOperatorImpl
