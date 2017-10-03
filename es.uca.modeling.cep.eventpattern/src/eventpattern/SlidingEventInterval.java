/**
 */
package eventpattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sliding Event Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.SlidingEventInterval#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getSlidingEventInterval()
 * @model annotation="gmf.node figure='rectangle' border.style='dash' label='size' border.color='110,110,110' color='230,230,250' label.view.pattern='Sliding Event Interval: {0}' label.edit.pattern='{0, number}' tool.name='Sliding Event Interval' tool.description='Add a sliding event interval window'"
 * @generated
 */
public interface SlidingEventInterval extends DataWindow
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
	 * @see eventpattern.EventpatternPackage#getSlidingEventInterval_Size()
	 * @model
	 * @generated
	 */
  int getSize();

  /**
	 * Sets the value of the '{@link eventpattern.SlidingEventInterval#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
  void setSize(int value);

} // SlidingEventInterval
