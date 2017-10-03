/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Range#getLowEndpoint <em>Low Endpoint</em>}</li>
 *   <li>{@link eventpattern.Range#getHighEndpoint <em>High Endpoint</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getRange()
 * @model annotation="gmf.node figure='ellipse' label='lowEndpoint, highEndpoint' color='255,255,255' border.color='38,110,159' border.width='3' label.icon='false' size='30,30' label.view.pattern='[{0, number}:{1, number}]' label.edit.pattern='{0}:{1}' resizable='false' tool.name='Range' tool.description='Add a range operator'"
 * @generated
 */
public interface Range extends UnaryOperator, PatternOperator
{
  /**
	 * Returns the value of the '<em><b>Low Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Endpoint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Endpoint</em>' attribute.
	 * @see #setLowEndpoint(int)
	 * @see eventpattern.EventpatternPackage#getRange_LowEndpoint()
	 * @model
	 * @generated
	 */
  int getLowEndpoint();

  /**
	 * Sets the value of the '{@link eventpattern.Range#getLowEndpoint <em>Low Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Endpoint</em>' attribute.
	 * @see #getLowEndpoint()
	 * @generated
	 */
  void setLowEndpoint(int value);

  /**
	 * Returns the value of the '<em><b>High Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High Endpoint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>High Endpoint</em>' attribute.
	 * @see #setHighEndpoint(int)
	 * @see eventpattern.EventpatternPackage#getRange_HighEndpoint()
	 * @model
	 * @generated
	 */
  int getHighEndpoint();

  /**
	 * Sets the value of the '{@link eventpattern.Range#getHighEndpoint <em>High Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Endpoint</em>' attribute.
	 * @see #getHighEndpoint()
	 * @generated
	 */
  void setHighEndpoint(int value);

} // Range
