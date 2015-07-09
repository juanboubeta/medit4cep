/**
 */
package domain.impl;

import domain.CEPDomain;
import domain.DomainPackage;
import domain.Event;

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
 * An implementation of the model object '<em><b>CEP Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domain.impl.CEPDomainImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link domain.impl.CEPDomainImpl#getDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link domain.impl.CEPDomainImpl#getDomainCreationDate <em>Domain Creation Date</em>}</li>
 *   <li>{@link domain.impl.CEPDomainImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CEPDomainImpl extends EObjectImpl implements CEPDomain
{
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
   * The default value of the '{@link #getDomainDescription() <em>Domain Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainDescription()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainDescription() <em>Domain Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainDescription()
   * @generated
   * @ordered
   */
  protected String domainDescription = DOMAIN_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getDomainCreationDate() <em>Domain Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainCreationDate()
   * @generated
   * @ordered
   */
  protected static final Date DOMAIN_CREATION_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainCreationDate() <em>Domain Creation Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainCreationDate()
   * @generated
   * @ordered
   */
  protected Date domainCreationDate = DOMAIN_CREATION_DATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CEPDomainImpl()
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
    return DomainPackage.Literals.CEP_DOMAIN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CEP_DOMAIN__DOMAIN_NAME, oldDomainName, domainName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomainDescription()
  {
    return domainDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainDescription(String newDomainDescription)
  {
    String oldDomainDescription = domainDescription;
    domainDescription = newDomainDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CEP_DOMAIN__DOMAIN_DESCRIPTION, oldDomainDescription, domainDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getDomainCreationDate()
  {
    return domainCreationDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainCreationDate(Date newDomainCreationDate)
  {
    Date oldDomainCreationDate = domainCreationDate;
    domainCreationDate = newDomainCreationDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CEP_DOMAIN__DOMAIN_CREATION_DATE, oldDomainCreationDate, domainCreationDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, DomainPackage.CEP_DOMAIN__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainPackage.CEP_DOMAIN__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case DomainPackage.CEP_DOMAIN__DOMAIN_NAME:
        return getDomainName();
      case DomainPackage.CEP_DOMAIN__DOMAIN_DESCRIPTION:
        return getDomainDescription();
      case DomainPackage.CEP_DOMAIN__DOMAIN_CREATION_DATE:
        return getDomainCreationDate();
      case DomainPackage.CEP_DOMAIN__EVENTS:
        return getEvents();
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
    switch (featureID)
    {
      case DomainPackage.CEP_DOMAIN__DOMAIN_NAME:
        setDomainName((String)newValue);
        return;
      case DomainPackage.CEP_DOMAIN__DOMAIN_DESCRIPTION:
        setDomainDescription((String)newValue);
        return;
      case DomainPackage.CEP_DOMAIN__DOMAIN_CREATION_DATE:
        setDomainCreationDate((Date)newValue);
        return;
      case DomainPackage.CEP_DOMAIN__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
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
    switch (featureID)
    {
      case DomainPackage.CEP_DOMAIN__DOMAIN_NAME:
        setDomainName(DOMAIN_NAME_EDEFAULT);
        return;
      case DomainPackage.CEP_DOMAIN__DOMAIN_DESCRIPTION:
        setDomainDescription(DOMAIN_DESCRIPTION_EDEFAULT);
        return;
      case DomainPackage.CEP_DOMAIN__DOMAIN_CREATION_DATE:
        setDomainCreationDate(DOMAIN_CREATION_DATE_EDEFAULT);
        return;
      case DomainPackage.CEP_DOMAIN__EVENTS:
        getEvents().clear();
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
    switch (featureID)
    {
      case DomainPackage.CEP_DOMAIN__DOMAIN_NAME:
        return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
      case DomainPackage.CEP_DOMAIN__DOMAIN_DESCRIPTION:
        return DOMAIN_DESCRIPTION_EDEFAULT == null ? domainDescription != null : !DOMAIN_DESCRIPTION_EDEFAULT.equals(domainDescription);
      case DomainPackage.CEP_DOMAIN__DOMAIN_CREATION_DATE:
        return DOMAIN_CREATION_DATE_EDEFAULT == null ? domainCreationDate != null : !DOMAIN_CREATION_DATE_EDEFAULT.equals(domainCreationDate);
      case DomainPackage.CEP_DOMAIN__EVENTS:
        return events != null && !events.isEmpty();
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
    result.append(" (domainName: ");
    result.append(domainName);
    result.append(", domainDescription: ");
    result.append(domainDescription);
    result.append(", domainCreationDate: ");
    result.append(domainCreationDate);
    result.append(')');
    return result.toString();
  }

} //CEPDomainImpl
