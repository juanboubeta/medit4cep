/**
 */
package eventpattern.impl;

import eventpattern.DataWindow;
import eventpattern.EventPatternCondition;
import eventpattern.EventpatternPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.DataWindowImpl#getEventPatternConditions <em>Event Pattern Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataWindowImpl extends EventPatternElementImpl implements DataWindow
{
  /**
	 * The cached value of the '{@link #getEventPatternConditions() <em>Event Pattern Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEventPatternConditions()
	 * @generated
	 * @ordered
	 */
  protected EList<EventPatternCondition> eventPatternConditions;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DataWindowImpl()
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
		return EventpatternPackage.Literals.DATA_WINDOW;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EventPatternCondition> getEventPatternConditions()
  {
		if (eventPatternConditions == null) {
			eventPatternConditions = new EObjectContainmentEList<EventPatternCondition>(EventPatternCondition.class, this, EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS);
		}
		return eventPatternConditions;
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
			case EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS:
				return ((InternalEList<?>)getEventPatternConditions()).basicRemove(otherEnd, msgs);
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
			case EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS:
				return getEventPatternConditions();
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
			case EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS:
				getEventPatternConditions().clear();
				getEventPatternConditions().addAll((Collection<? extends EventPatternCondition>)newValue);
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
			case EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS:
				getEventPatternConditions().clear();
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
			case EventpatternPackage.DATA_WINDOW__EVENT_PATTERN_CONDITIONS:
				return eventPatternConditions != null && !eventPatternConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataWindowImpl
