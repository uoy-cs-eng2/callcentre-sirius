/**
 */
package uk.ac.york.callcentre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.callcentre.Step#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.callcentre.Step#getText <em>Text</em>}</li>
 *   <li>{@link uk.ac.york.callcentre.Step#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link uk.ac.york.callcentre.Step#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uk.ac.york.callcentre.Step#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.callcentre.CallcentrePackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.callcentre.CallcentrePackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.callcentre.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see uk.ac.york.callcentre.CallcentrePackage#getStep_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link uk.ac.york.callcentre.Step#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.callcentre.Transition}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.callcentre.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see uk.ac.york.callcentre.CallcentrePackage#getStep_Incoming()
	 * @see uk.ac.york.callcentre.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.callcentre.Transition}.
	 * It is bidirectional and its opposite is '{@link uk.ac.york.callcentre.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see uk.ac.york.callcentre.CallcentrePackage#getStep_Outgoing()
	 * @see uk.ac.york.callcentre.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.callcentre.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see uk.ac.york.callcentre.CallcentrePackage#getStep_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // Step
