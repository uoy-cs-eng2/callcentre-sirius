/**
 */
package uk.ac.york.callcentre;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Redirection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.callcentre.CallRedirection#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.callcentre.CallcentrePackage#getCallRedirection()
 * @model
 * @generated
 */
public interface CallRedirection extends Step {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see uk.ac.york.callcentre.CallcentrePackage#getCallRedirection_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link uk.ac.york.callcentre.CallRedirection#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

} // CallRedirection
