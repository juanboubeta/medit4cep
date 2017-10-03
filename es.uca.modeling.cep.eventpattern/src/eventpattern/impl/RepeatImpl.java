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
import eventpattern.Repeat;
import eventpattern.WithinTimerElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.RepeatImpl#getOutboundLink <em>Outbound Link</em>}</li>
 *   <li>{@link eventpattern.impl.RepeatImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatImpl extends UnaryOperatorImpl implements Repeat
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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
  protected static final int COUNT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
  protected int count = COUNT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RepeatImpl()
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
		return EventpatternPackage.Literals.REPEAT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getOutboundLink()
  {
		if (outboundLink == null) {
			outboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, EventpatternPackage.REPEAT__OUTBOUND_LINK, EventpatternPackage.LINK__OPERAND);
		}
		return outboundLink;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getCount()
  {
		return count;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCount(int newCount)
  {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.REPEAT__COUNT, oldCount, count));
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
			case EventpatternPackage.REPEAT__OUTBOUND_LINK:
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
			case EventpatternPackage.REPEAT__OUTBOUND_LINK:
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
			case EventpatternPackage.REPEAT__OUTBOUND_LINK:
				return getOutboundLink();
			case EventpatternPackage.REPEAT__COUNT:
				return getCount();
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
			case EventpatternPackage.REPEAT__OUTBOUND_LINK:
				getOutboundLink().clear();
				getOutboundLink().addAll((Collection<? extends Link>)newValue);
				return;
			case EventpatternPackage.REPEAT__COUNT:
				setCount((Integer)newValue);
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
			case EventpatternPackage.REPEAT__OUTBOUND_LINK:
				getOutboundLink().clear();
				return;
			case EventpatternPackage.REPEAT__COUNT:
				setCount(COUNT_EDEFAULT);
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
			case EventpatternPackage.REPEAT__OUTBOUND_LINK:
				return outboundLink != null && !outboundLink.isEmpty();
			case EventpatternPackage.REPEAT__COUNT:
				return count != COUNT_EDEFAULT;
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
				case EventpatternPackage.REPEAT__OUTBOUND_LINK: return EventpatternPackage.OPERAND__OUTBOUND_LINK;
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
				case EventpatternPackage.OPERAND__OUTBOUND_LINK: return EventpatternPackage.REPEAT__OUTBOUND_LINK;
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

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //RepeatImpl
