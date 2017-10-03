/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Email#getTo <em>To</em>}</li>
 *   <li>{@link eventpattern.Email#getCc <em>Cc</em>}</li>
 *   <li>{@link eventpattern.Email#getFrom <em>From</em>}</li>
 *   <li>{@link eventpattern.Email#getSubject <em>Subject</em>}</li>
 *   <li>{@link eventpattern.Email#getHost <em>Host</em>}</li>
 *   <li>{@link eventpattern.Email#getPort <em>Port</em>}</li>
 *   <li>{@link eventpattern.Email#getUser <em>User</em>}</li>
 *   <li>{@link eventpattern.Email#getPassword <em>Password</em>}</li>
 *   <li>{@link eventpattern.Email#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getEmail()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Email.svg' size='30,30' label='description' label.icon='false' label.placement='external' resizable='false' margin='0' tool.name='Email' tool.description='Add an email action'"
 * @generated
 */
public interface Email extends Action
{
  /**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see eventpattern.EventpatternPackage#getEmail_To()
	 * @model
	 * @generated
	 */
  String getTo();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
  void setTo(String value);

  /**
	 * Returns the value of the '<em><b>Cc</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc</em>' attribute.
	 * @see #setCc(String)
	 * @see eventpattern.EventpatternPackage#getEmail_Cc()
	 * @model
	 * @generated
	 */
  String getCc();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getCc <em>Cc</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc</em>' attribute.
	 * @see #getCc()
	 * @generated
	 */
  void setCc(String value);

  /**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see eventpattern.EventpatternPackage#getEmail_From()
	 * @model
	 * @generated
	 */
  String getFrom();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
  void setFrom(String value);

  /**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see eventpattern.EventpatternPackage#getEmail_Subject()
	 * @model
	 * @generated
	 */
  String getSubject();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
  void setSubject(String value);

  /**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see eventpattern.EventpatternPackage#getEmail_Host()
	 * @model
	 * @generated
	 */
  String getHost();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
  void setHost(String value);

  /**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see eventpattern.EventpatternPackage#getEmail_Port()
	 * @model default="25"
	 * @generated
	 */
  int getPort();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
  void setPort(int value);

  /**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see eventpattern.EventpatternPackage#getEmail_User()
	 * @model
	 * @generated
	 */
  String getUser();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
  void setUser(String value);

  /**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see eventpattern.EventpatternPackage#getEmail_Password()
	 * @model
	 * @generated
	 */
  String getPassword();

  /**
	 * Sets the value of the '{@link eventpattern.Email#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
  void setPassword(String value);

		/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eventpattern.EventpatternPackage#getEmail_Description()
	 * @model default=" "
	 * @generated
	 */
	String getDescription();

		/**
	 * Sets the value of the '{@link eventpattern.Email#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Email
