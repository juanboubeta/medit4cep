/**
 */
package eventpattern.impl;

import eventpattern.EventPatternCondition;
import eventpattern.EventPatternElement;
import eventpattern.EventpatternPackage;
import eventpattern.Link;
import eventpattern.Operand;
import eventpattern.PatternOperand;
import eventpattern.PatternOperator;
import eventpattern.Until;
import eventpattern.WithinTimerElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.UntilImpl#getOutboundLink <em>Outbound Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UntilImpl extends BinaryOperatorImpl implements Until
{
  /**
	 * The cached value of the '{@link #getOutboundLink() <em>Outbound Link</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOutboundLink()
	 * @generated
	 * @ordered
	 */
  protected EList<Link> outboundLink;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UntilImpl()
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
		return EventpatternPackage.Literals.UNTIL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getOutboundLink()
  {
		if (outboundLink == null) {
			outboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, EventpatternPackage.UNTIL__OUTBOUND_LINK, EventpatternPackage.LINK__OPERAND);
		}
		return outboundLink;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EventpatternPackage.UNTIL__OUTBOUND_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundLink()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EventpatternPackage.UNTIL__OUTBOUND_LINK:
				return ((InternalEList<?>)getOutboundLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EventpatternPackage.UNTIL__OUTBOUND_LINK:
				return getOutboundLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EventpatternPackage.UNTIL__OUTBOUND_LINK:
				getOutboundLink().clear();
				getOutboundLink().addAll((Collection<? extends Link>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.UNTIL__OUTBOUND_LINK:
				getOutboundLink().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.UNTIL__OUTBOUND_LINK:
				return outboundLink != null && !outboundLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Operand.class) {
			switch (derivedFeatureID) {
				case EventpatternPackage.UNTIL__OUTBOUND_LINK: return EventpatternPackage.OPERAND__OUTBOUND_LINK;
				default: return -1;
			}
		}
		if (baseClass == EventPatternElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventPatternCondition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PatternOperand.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WithinTimerElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PatternOperator.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Operand.class) {
			switch (baseFeatureID) {
				case EventpatternPackage.OPERAND__OUTBOUND_LINK: return EventpatternPackage.UNTIL__OUTBOUND_LINK;
				default: return -1;
			}
		}
		if (baseClass == EventPatternElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventPatternCondition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PatternOperand.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == WithinTimerElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PatternOperator.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UntilImpl
