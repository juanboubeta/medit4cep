/**
 */
package eventpattern.impl;

import eventpattern.Email;
import eventpattern.EventpatternPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.EmailImpl#getTo <em>To</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getFrom <em>From</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getHost <em>Host</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getUser <em>User</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link eventpattern.impl.EmailImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailImpl extends ActionImpl implements Email
{
  /**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
  protected static final String TO_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
  protected String to = TO_EDEFAULT;

  /**
	 * The default value of the '{@link #getCc() <em>Cc</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCc()
	 * @generated
	 * @ordered
	 */
  protected static final String CC_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCc() <em>Cc</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCc()
	 * @generated
	 * @ordered
	 */
  protected String cc = CC_EDEFAULT;

  /**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
  protected static final String FROM_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
  protected String from = FROM_EDEFAULT;

  /**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
  protected static final String SUBJECT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
  protected String subject = SUBJECT_EDEFAULT;

  /**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
  protected static final String HOST_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
  protected String host = HOST_EDEFAULT;

  /**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
  protected static final int PORT_EDEFAULT = 25;

  /**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
  protected int port = PORT_EDEFAULT;

  /**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
  protected static final String USER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
  protected String user = USER_EDEFAULT;

  /**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
  protected String password = PASSWORD_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = " ";

		/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EmailImpl()
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
		return EventpatternPackage.Literals.EMAIL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTo()
  {
		return to;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTo(String newTo)
  {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__TO, oldTo, to));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getCc()
  {
		return cc;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCc(String newCc)
  {
		String oldCc = cc;
		cc = newCc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__CC, oldCc, cc));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFrom()
  {
		return from;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFrom(String newFrom)
  {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__FROM, oldFrom, from));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSubject()
  {
		return subject;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSubject(String newSubject)
  {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__SUBJECT, oldSubject, subject));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getHost()
  {
		return host;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHost(String newHost)
  {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__HOST, oldHost, host));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getPort()
  {
		return port;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPort(int newPort)
  {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__PORT, oldPort, port));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUser()
  {
		return user;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUser(String newUser)
  {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__USER, oldUser, user));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getPassword()
  {
		return password;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPassword(String newPassword)
  {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__PASSWORD, oldPassword, password));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.EMAIL__DESCRIPTION, oldDescription, description));
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
			case EventpatternPackage.EMAIL__TO:
				return getTo();
			case EventpatternPackage.EMAIL__CC:
				return getCc();
			case EventpatternPackage.EMAIL__FROM:
				return getFrom();
			case EventpatternPackage.EMAIL__SUBJECT:
				return getSubject();
			case EventpatternPackage.EMAIL__HOST:
				return getHost();
			case EventpatternPackage.EMAIL__PORT:
				return getPort();
			case EventpatternPackage.EMAIL__USER:
				return getUser();
			case EventpatternPackage.EMAIL__PASSWORD:
				return getPassword();
			case EventpatternPackage.EMAIL__DESCRIPTION:
				return getDescription();
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
			case EventpatternPackage.EMAIL__TO:
				setTo((String)newValue);
				return;
			case EventpatternPackage.EMAIL__CC:
				setCc((String)newValue);
				return;
			case EventpatternPackage.EMAIL__FROM:
				setFrom((String)newValue);
				return;
			case EventpatternPackage.EMAIL__SUBJECT:
				setSubject((String)newValue);
				return;
			case EventpatternPackage.EMAIL__HOST:
				setHost((String)newValue);
				return;
			case EventpatternPackage.EMAIL__PORT:
				setPort((Integer)newValue);
				return;
			case EventpatternPackage.EMAIL__USER:
				setUser((String)newValue);
				return;
			case EventpatternPackage.EMAIL__PASSWORD:
				setPassword((String)newValue);
				return;
			case EventpatternPackage.EMAIL__DESCRIPTION:
				setDescription((String)newValue);
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
			case EventpatternPackage.EMAIL__TO:
				setTo(TO_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__CC:
				setCc(CC_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__USER:
				setUser(USER_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EventpatternPackage.EMAIL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case EventpatternPackage.EMAIL__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case EventpatternPackage.EMAIL__CC:
				return CC_EDEFAULT == null ? cc != null : !CC_EDEFAULT.equals(cc);
			case EventpatternPackage.EMAIL__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case EventpatternPackage.EMAIL__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case EventpatternPackage.EMAIL__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case EventpatternPackage.EMAIL__PORT:
				return port != PORT_EDEFAULT;
			case EventpatternPackage.EMAIL__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case EventpatternPackage.EMAIL__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EventpatternPackage.EMAIL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (to: ");
		result.append(to);
		result.append(", cc: ");
		result.append(cc);
		result.append(", from: ");
		result.append(from);
		result.append(", subject: ");
		result.append(subject);
		result.append(", host: ");
		result.append(host);
		result.append(", port: ");
		result.append(port);
		result.append(", user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EmailImpl
