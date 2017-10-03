/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batching Event Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.BatchingEventInterval#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getBatchingEventInterval()
 * @model annotation="gmf.node figure='rectangle' border.style='dash' label='size' border.color='110,110,110' color='230,230,250' label.view.pattern='Batching Event Interval: {0}' label.edit.pattern='{0, number}' tool.name='Batching Event Interval' tool.description='Add a batching event interval window'"
 * @generated
 */
public interface BatchingEventInterval extends DataWindow
{
  /**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see eventpattern.EventpatternPackage#getBatchingEventInterval_Size()
	 * @model
	 * @generated
	 */
  int getSize();

  /**
	 * Sets the value of the '{@link eventpattern.BatchingEventInterval#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
  void setSize(int value);

} // BatchingEventInterval
