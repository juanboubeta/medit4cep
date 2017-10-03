/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - modifications marked as @generated NOT
 ******************************************************************************/

package eventpattern.impl;

import eventpattern.ComplexEventProperty;
import eventpattern.EventProperty;
import eventpattern.EventpatternPackage;
import eventpattern.Link;
import eventpattern.Operand;
import eventpattern.Operator;
import eventpattern.PropertyTypeValue;
import eventpattern.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.LinkImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link eventpattern.impl.LinkImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link eventpattern.impl.LinkImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link
{
  /**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
  protected static final int ORDER_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
  protected int order = ORDER_EDEFAULT;

  /**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
  protected Operand operand;

  /**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
  protected Operator operator;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LinkImpl()
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
		return EventpatternPackage.Literals.LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getOrder()
  {
		return order;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrder(int newOrder)
  {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.LINK__ORDER, oldOrder, order));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Operand getOperand()
  {
		if (operand != null && operand.eIsProxy()) {
			InternalEObject oldOperand = (InternalEObject)operand;
			operand = (Operand)eResolveProxy(oldOperand);
			if (operand != oldOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventpatternPackage.LINK__OPERAND, oldOperand, operand));
			}
		}
		return operand;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Operand basicGetOperand()
  {
		return operand;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOperand(Operand newOperand, NotificationChain msgs)
  {
		Operand oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventpatternPackage.LINK__OPERAND, oldOperand, newOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperand(Operand newOperand)
  {
		if (newOperand != operand) {
			NotificationChain msgs = null;
			if (operand != null)
				msgs = ((InternalEObject)operand).eInverseRemove(this, EventpatternPackage.OPERAND__OUTBOUND_LINK, Operand.class, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EventpatternPackage.OPERAND__OUTBOUND_LINK, Operand.class, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.LINK__OPERAND, newOperand, newOperand));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Operator getOperator()
  {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (Operator)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventpatternPackage.LINK__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Operator basicGetOperator()
  {
		return operator;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs)
  {
    Operator oldOperator = operator;
        
    // If ComplexEventProperty is directly linked by an EventProperty, 
    // then the empty name of this ComplexEventProperty will be automatically set to the same name of the EventProperty.   
    if (newOperator != null && newOperator.eClass().getName().equals("ComplexEventProperty") && 
    		((ComplexEventProperty)newOperator).getName().trim().equals("")) {
    	
    	if (this.getOperand().eClass().getName().equals("EventProperty")) {
    		((ComplexEventProperty)newOperator).setName(((EventProperty)this.getOperand()).getName());
    		((ComplexEventProperty)newOperator).setImagePath(((EventProperty)this.getOperand()).getImagePath());
    	}
    }
    
    operator = newOperator;
        
    // If an operator (LogicalOperator, ArithmeticOperator or ComparisonOperator) is linked by 
    // two operands (an EventProperty and a Value), then the type of this Value will be set to the same 
    // type of this EventProperty.
    /*
    if (newOperator != null && newOperator.getInboundLink().size() == 2) {
    	
		if (newOperator.getInboundLink().get(0).getOperand().eClass().getName().equals("Value") || 
			 newOperator.getInboundLink().get(1).getOperand().eClass().getName().equals("EventProperty")) {
			
			((Value)newOperator.getInboundLink().get(0).getOperand()).
				setType(((EventProperty)newOperator.getInboundLink().get(1).getOperand()).getType());
			
			
		}
		else if (newOperator.getInboundLink().get(0).getOperand().eClass().getName().equals("EventProperty") || 
   			 newOperator.getInboundLink().get(1).getOperand().eClass().getName().equals("Value")) {
			
			((Value)newOperator.getInboundLink().get(1).getOperand()).
				setType(((EventProperty)newOperator.getInboundLink().get(0).getOperand()).getType());
			
		}
		
    }
    */
    
    // Generate automatically link orders
    if (this.getOrder() == 0) {    
    	int automaticOrder = operator.getInboundLink().size();	
        this.setOrder(automaticOrder);
    }
    
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventpatternPackage.LINK__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperator(Operator newOperator)
  {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EventpatternPackage.OPERATOR__INBOUND_LINK, Operator.class, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EventpatternPackage.OPERATOR__INBOUND_LINK, Operator.class, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.LINK__OPERATOR, newOperator, newOperator));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EventpatternPackage.LINK__OPERAND:
				if (operand != null)
					msgs = ((InternalEObject)operand).eInverseRemove(this, EventpatternPackage.OPERAND__OUTBOUND_LINK, Operand.class, msgs);
				return basicSetOperand((Operand)otherEnd, msgs);
			case EventpatternPackage.LINK__OPERATOR:
				if (operator != null)
					msgs = ((InternalEObject)operator).eInverseRemove(this, EventpatternPackage.OPERATOR__INBOUND_LINK, Operator.class, msgs);
				return basicSetOperator((Operator)otherEnd, msgs);
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
			case EventpatternPackage.LINK__OPERAND:
				return basicSetOperand(null, msgs);
			case EventpatternPackage.LINK__OPERATOR:
				return basicSetOperator(null, msgs);
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
			case EventpatternPackage.LINK__ORDER:
				return getOrder();
			case EventpatternPackage.LINK__OPERAND:
				if (resolve) return getOperand();
				return basicGetOperand();
			case EventpatternPackage.LINK__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EventpatternPackage.LINK__ORDER:
				setOrder((Integer)newValue);
				return;
			case EventpatternPackage.LINK__OPERAND:
				setOperand((Operand)newValue);
				return;
			case EventpatternPackage.LINK__OPERATOR:
				setOperator((Operator)newValue);
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
			case EventpatternPackage.LINK__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case EventpatternPackage.LINK__OPERAND:
				setOperand((Operand)null);
				return;
			case EventpatternPackage.LINK__OPERATOR:
				setOperator((Operator)null);
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
			case EventpatternPackage.LINK__ORDER:
				return order != ORDER_EDEFAULT;
			case EventpatternPackage.LINK__OPERAND:
				return operand != null;
			case EventpatternPackage.LINK__OPERATOR:
				return operator != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
