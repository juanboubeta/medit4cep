/**
 */
package eventpattern.impl;

import eventpattern.Action;
import eventpattern.CEPEventPattern;
import eventpattern.ComplexEvent;
import eventpattern.EventPatternElement;
import eventpattern.EventpatternPackage;
import eventpattern.Link;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CEP Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getPatternName <em>Pattern Name</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getPatternDescription <em>Pattern Description</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getPatternPriority <em>Pattern Priority</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getPatternCreationDate <em>Pattern Creation Date</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#isPatternDeployed <em>Pattern Deployed</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getEventPatternElements <em>Event Pattern Elements</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getComplexEvent <em>Complex Event</em>}</li>
 *   <li>{@link eventpattern.impl.CEPEventPatternImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEPEventPatternImpl extends EObjectImpl implements CEPEventPattern
{
  /**
	 * The default value of the '{@link #getPatternName() <em>Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPatternName()
	 * @generated
	 * @ordered
	 */
  protected static final String PATTERN_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPatternName() <em>Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPatternName()
	 * @generated
	 * @ordered
	 */
  protected String patternName = PATTERN_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getPatternDescription() <em>Pattern Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPatternDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String PATTERN_DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPatternDescription() <em>Pattern Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPatternDescription()
	 * @generated
	 * @ordered
	 */
  protected String patternDescription = PATTERN_DESCRIPTION_EDEFAULT;

  /**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
  protected static final String DOMAIN_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
  protected String domainName = DOMAIN_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getPatternPriority() <em>Pattern Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PATTERN_PRIORITY_EDEFAULT = new Integer(0);

		/**
	 * The cached value of the '{@link #getPatternPriority() <em>Pattern Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer patternPriority = PATTERN_PRIORITY_EDEFAULT;

		/**
	 * The default value of the '{@link #getPatternCreationDate() <em>Pattern Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPatternCreationDate()
	 * @generated
	 * @ordered
	 */
  protected static final Date PATTERN_CREATION_DATE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPatternCreationDate() <em>Pattern Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPatternCreationDate()
	 * @generated
	 * @ordered
	 */
  protected Date patternCreationDate = PATTERN_CREATION_DATE_EDEFAULT;

  /**
	 * The default value of the '{@link #isPatternDeployed() <em>Pattern Deployed</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isPatternDeployed()
	 * @generated
	 * @ordered
	 */
  protected static final boolean PATTERN_DEPLOYED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isPatternDeployed() <em>Pattern Deployed</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isPatternDeployed()
	 * @generated
	 * @ordered
	 */
  protected boolean patternDeployed = PATTERN_DEPLOYED_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
  protected EList<Link> links;

  /**
	 * The cached value of the '{@link #getEventPatternElements() <em>Event Pattern Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEventPatternElements()
	 * @generated
	 * @ordered
	 */
  protected EList<EventPatternElement> eventPatternElements;

  /**
	 * The cached value of the '{@link #getComplexEvent() <em>Complex Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComplexEvent()
	 * @generated
	 * @ordered
	 */
  protected ComplexEvent complexEvent;

  /**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
  protected EList<Action> actions;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CEPEventPatternImpl()
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
		return EventpatternPackage.Literals.CEP_EVENT_PATTERN;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getPatternName()
  {
		return patternName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPatternName(String newPatternName)
  {
		String oldPatternName = patternName;
		patternName = newPatternName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_NAME, oldPatternName, patternName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getPatternDescription()
  {
		return patternDescription;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPatternDescription(String newPatternDescription)
  {
		String oldPatternDescription = patternDescription;
		patternDescription = newPatternDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION, oldPatternDescription, patternDescription));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDomainName()
  {
		return domainName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDomainName(String newDomainName)
  {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__DOMAIN_NAME, oldDomainName, domainName));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPatternPriority() {
		return patternPriority;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternPriority(Integer newPatternPriority) {
		Integer oldPatternPriority = patternPriority;
		patternPriority = newPatternPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_PRIORITY, oldPatternPriority, patternPriority));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getPatternCreationDate()
  {
		return patternCreationDate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPatternCreationDate(Date newPatternCreationDate)
  {
		Date oldPatternCreationDate = patternCreationDate;
		patternCreationDate = newPatternCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE, oldPatternCreationDate, patternCreationDate));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isPatternDeployed()
  {
		return patternDeployed;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPatternDeployed(boolean newPatternDeployed)
  {
		boolean oldPatternDeployed = patternDeployed;
		patternDeployed = newPatternDeployed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DEPLOYED, oldPatternDeployed, patternDeployed));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Link> getLinks()
  {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, EventpatternPackage.CEP_EVENT_PATTERN__LINKS);
		}
		return links;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EventPatternElement> getEventPatternElements()
  {
		if (eventPatternElements == null) {
			eventPatternElements = new EObjectContainmentEList<EventPatternElement>(EventPatternElement.class, this, EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS);
		}
		return eventPatternElements;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComplexEvent getComplexEvent()
  {
		return complexEvent;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetComplexEvent(ComplexEvent newComplexEvent, NotificationChain msgs)
  {
		ComplexEvent oldComplexEvent = complexEvent;
		complexEvent = newComplexEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT, oldComplexEvent, newComplexEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setComplexEvent(ComplexEvent newComplexEvent)
  {
		if (newComplexEvent != complexEvent) {
			NotificationChain msgs = null;
			if (complexEvent != null)
				msgs = ((InternalEObject)complexEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT, null, msgs);
			if (newComplexEvent != null)
				msgs = ((InternalEObject)newComplexEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT, null, msgs);
			msgs = basicSetComplexEvent(newComplexEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT, newComplexEvent, newComplexEvent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Action> getActions()
  {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS);
		}
		return actions;
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
			case EventpatternPackage.CEP_EVENT_PATTERN__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS:
				return ((InternalEList<?>)getEventPatternElements()).basicRemove(otherEnd, msgs);
			case EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT:
				return basicSetComplexEvent(null, msgs);
			case EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_NAME:
				return getPatternName();
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION:
				return getPatternDescription();
			case EventpatternPackage.CEP_EVENT_PATTERN__DOMAIN_NAME:
				return getDomainName();
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_PRIORITY:
				return getPatternPriority();
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE:
				return getPatternCreationDate();
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DEPLOYED:
				return isPatternDeployed();
			case EventpatternPackage.CEP_EVENT_PATTERN__LINKS:
				return getLinks();
			case EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS:
				return getEventPatternElements();
			case EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT:
				return getComplexEvent();
			case EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS:
				return getActions();
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
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_NAME:
				setPatternName((String)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION:
				setPatternDescription((String)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_PRIORITY:
				setPatternPriority((Integer)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE:
				setPatternCreationDate((Date)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DEPLOYED:
				setPatternDeployed((Boolean)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS:
				getEventPatternElements().clear();
				getEventPatternElements().addAll((Collection<? extends EventPatternElement>)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT:
				setComplexEvent((ComplexEvent)newValue);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_NAME:
				setPatternName(PATTERN_NAME_EDEFAULT);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION:
				setPatternDescription(PATTERN_DESCRIPTION_EDEFAULT);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_PRIORITY:
				setPatternPriority(PATTERN_PRIORITY_EDEFAULT);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE:
				setPatternCreationDate(PATTERN_CREATION_DATE_EDEFAULT);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DEPLOYED:
				setPatternDeployed(PATTERN_DEPLOYED_EDEFAULT);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__LINKS:
				getLinks().clear();
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS:
				getEventPatternElements().clear();
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT:
				setComplexEvent((ComplexEvent)null);
				return;
			case EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS:
				getActions().clear();
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
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_NAME:
				return PATTERN_NAME_EDEFAULT == null ? patternName != null : !PATTERN_NAME_EDEFAULT.equals(patternName);
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DESCRIPTION:
				return PATTERN_DESCRIPTION_EDEFAULT == null ? patternDescription != null : !PATTERN_DESCRIPTION_EDEFAULT.equals(patternDescription);
			case EventpatternPackage.CEP_EVENT_PATTERN__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_PRIORITY:
				return PATTERN_PRIORITY_EDEFAULT == null ? patternPriority != null : !PATTERN_PRIORITY_EDEFAULT.equals(patternPriority);
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_CREATION_DATE:
				return PATTERN_CREATION_DATE_EDEFAULT == null ? patternCreationDate != null : !PATTERN_CREATION_DATE_EDEFAULT.equals(patternCreationDate);
			case EventpatternPackage.CEP_EVENT_PATTERN__PATTERN_DEPLOYED:
				return patternDeployed != PATTERN_DEPLOYED_EDEFAULT;
			case EventpatternPackage.CEP_EVENT_PATTERN__LINKS:
				return links != null && !links.isEmpty();
			case EventpatternPackage.CEP_EVENT_PATTERN__EVENT_PATTERN_ELEMENTS:
				return eventPatternElements != null && !eventPatternElements.isEmpty();
			case EventpatternPackage.CEP_EVENT_PATTERN__COMPLEX_EVENT:
				return complexEvent != null;
			case EventpatternPackage.CEP_EVENT_PATTERN__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (patternName: ");
		result.append(patternName);
		result.append(", patternDescription: ");
		result.append(patternDescription);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(", patternPriority: ");
		result.append(patternPriority);
		result.append(", patternCreationDate: ");
		result.append(patternCreationDate);
		result.append(", patternDeployed: ");
		result.append(patternDeployed);
		result.append(')');
		return result.toString();
	}

} //CEPEventPatternImpl
