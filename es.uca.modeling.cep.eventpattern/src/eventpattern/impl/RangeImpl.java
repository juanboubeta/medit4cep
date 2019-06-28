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
import eventpattern.Range;
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
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.RangeImpl#getOutboundLink <em>Outbound Link</em>}</li>
 *   <li>{@link eventpattern.impl.RangeImpl#getLowEndpoint <em>Low Endpoint</em>}</li>
 *   <li>{@link eventpattern.impl.RangeImpl#getHighEndpoint <em>High Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends UnaryOperatorImpl implements Range
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
	 * The default value of the '{@link #getLowEndpoint() <em>Low Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLowEndpoint()
	 * @generated
	 * @ordered
	 */
  protected static final int LOW_ENDPOINT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getLowEndpoint() <em>Low Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLowEndpoint()
	 * @generated
	 * @ordered
	 */
  protected int lowEndpoint = LOW_ENDPOINT_EDEFAULT;

  /**
	 * The default value of the '{@link #getHighEndpoint() <em>High Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHighEndpoint()
	 * @generated
	 * @ordered
	 */
  protected static final int HIGH_ENDPOINT_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getHighEndpoint() <em>High Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHighEndpoint()
	 * @generated
	 * @ordered
	 */
  protected int highEndpoint = HIGH_ENDPOINT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RangeImpl()
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
		return EventpatternPackage.Literals.RANGE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getOutboundLink()
  {
		if (outboundLink == null) {
			outboundLink = new EObjectWithInverseResolvingEList<Link>(Link.class, this, EventpatternPackage.RANGE__OUTBOUND_LINK, EventpatternPackage.LINK__OPERAND);
		}
		return outboundLink;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getLowEndpoint()
  {
		return lowEndpoint;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLowEndpoint(int newLowEndpoint)
  {
		int oldLowEndpoint = lowEndpoint;
		lowEndpoint = newLowEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.RANGE__LOW_ENDPOINT, oldLowEndpoint, lowEndpoint));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getHighEndpoint()
  {
		return highEndpoint;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHighEndpoint(int newHighEndpoint)
  {
		int oldHighEndpoint = highEndpoint;
		highEndpoint = newHighEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.RANGE__HIGH_ENDPOINT, oldHighEndpoint, highEndpoint));
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
			case EventpatternPackage.RANGE__OUTBOUND_LINK:
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
			case EventpatternPackage.RANGE__OUTBOUND_LINK:
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
			case EventpatternPackage.RANGE__OUTBOUND_LINK:
				return getOutboundLink();
			case EventpatternPackage.RANGE__LOW_ENDPOINT:
				return getLowEndpoint();
			case EventpatternPackage.RANGE__HIGH_ENDPOINT:
				return getHighEndpoint();
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
			case EventpatternPackage.RANGE__OUTBOUND_LINK:
				getOutboundLink().clear();
				getOutboundLink().addAll((Collection<? extends Link>)newValue);
				return;
			case EventpatternPackage.RANGE__LOW_ENDPOINT:
				setLowEndpoint((Integer)newValue);
				return;
			case EventpatternPackage.RANGE__HIGH_ENDPOINT:
				setHighEndpoint((Integer)newValue);
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
			case EventpatternPackage.RANGE__OUTBOUND_LINK:
				getOutboundLink().clear();
				return;
			case EventpatternPackage.RANGE__LOW_ENDPOINT:
				setLowEndpoint(LOW_ENDPOINT_EDEFAULT);
				return;
			case EventpatternPackage.RANGE__HIGH_ENDPOINT:
				setHighEndpoint(HIGH_ENDPOINT_EDEFAULT);
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
			case EventpatternPackage.RANGE__OUTBOUND_LINK:
				return outboundLink != null && !outboundLink.isEmpty();
			case EventpatternPackage.RANGE__LOW_ENDPOINT:
				return lowEndpoint != LOW_ENDPOINT_EDEFAULT;
			case EventpatternPackage.RANGE__HIGH_ENDPOINT:
				return highEndpoint != HIGH_ENDPOINT_EDEFAULT;
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
				case EventpatternPackage.RANGE__OUTBOUND_LINK: return EventpatternPackage.OPERAND__OUTBOUND_LINK;
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
				case EventpatternPackage.OPERAND__OUTBOUND_LINK: return EventpatternPackage.RANGE__OUTBOUND_LINK;
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
		result.append(" (lowEndpoint: ");
		result.append(lowEndpoint);
		result.append(", highEndpoint: ");
		result.append(highEndpoint);
		result.append(')');
		return result.toString();
	}

} //RangeImpl
