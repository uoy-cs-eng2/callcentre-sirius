/**
 */
package uk.ac.york.callcentre;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.callcentre.InputQuestion#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.callcentre.CallcentrePackage#getInputQuestion()
 * @model
 * @generated
 */
public interface InputQuestion extends Step {

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see uk.ac.york.callcentre.CallcentrePackage#getInputQuestion_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link uk.ac.york.callcentre.InputQuestion#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);
} // InputQuestion
