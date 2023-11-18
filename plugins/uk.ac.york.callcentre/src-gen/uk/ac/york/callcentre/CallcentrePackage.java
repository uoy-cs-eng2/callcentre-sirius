/**
 */
package uk.ac.york.callcentre;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.callcentre.CallcentreFactory
 * @model kind="package"
 * @generated
 */
public interface CallcentrePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "callcentre";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.york.ac.uk/callcentre/1.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "callcentre";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CallcentrePackage eINSTANCE = uk.ac.york.callcentre.impl.CallcentrePackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.ModelImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TRANSITIONS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.StepImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMENTS = 4;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.TransitionImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.StatementImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__TEXT = STEP__TEXT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__INCOMING = STEP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__OUTGOING = STEP__OUTGOING;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__COMMENTS = STEP__COMMENTS;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.CallRedirectionImpl <em>Call Redirection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.CallRedirectionImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getCallRedirection()
	 * @generated
	 */
	int CALL_REDIRECTION = 4;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.InputQuestionImpl <em>Input Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.InputQuestionImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getInputQuestion()
	 * @generated
	 */
	int INPUT_QUESTION = 5;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.DecisionImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TEXT = STEP__TEXT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INCOMING = STEP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOING = STEP__OUTGOING;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__COMMENTS = STEP__COMMENTS;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION__TEXT = STEP__TEXT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION__INCOMING = STEP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION__OUTGOING = STEP__OUTGOING;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION__COMMENTS = STEP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION__NUMBER = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Redirection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Redirection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_REDIRECTION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION__TEXT = STEP__TEXT;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION__INCOMING = STEP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION__OUTGOING = STEP__OUTGOING;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION__COMMENTS = STEP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION__VARIABLE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_QUESTION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.callcentre.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.callcentre.impl.CommentImpl
	 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.york.callcentre.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.callcentre.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.callcentre.Model#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see uk.ac.york.callcentre.Model#getSteps()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.callcentre.Model#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see uk.ac.york.callcentre.Model#getTransitions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Transitions();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see uk.ac.york.callcentre.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.callcentre.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.Step#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uk.ac.york.callcentre.Step#getText()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Text();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.callcentre.Step#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see uk.ac.york.callcentre.Step#getIncoming()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.callcentre.Step#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see uk.ac.york.callcentre.Step#getOutgoing()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Outgoing();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.callcentre.Step#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see uk.ac.york.callcentre.Step#getComments()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Comments();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see uk.ac.york.callcentre.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.Transition#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uk.ac.york.callcentre.Transition#getText()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Text();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.callcentre.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see uk.ac.york.callcentre.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.callcentre.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see uk.ac.york.callcentre.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see uk.ac.york.callcentre.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.CallRedirection <em>Call Redirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Redirection</em>'.
	 * @see uk.ac.york.callcentre.CallRedirection
	 * @generated
	 */
	EClass getCallRedirection();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.CallRedirection#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see uk.ac.york.callcentre.CallRedirection#getNumber()
	 * @see #getCallRedirection()
	 * @generated
	 */
	EAttribute getCallRedirection_Number();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.InputQuestion <em>Input Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Question</em>'.
	 * @see uk.ac.york.callcentre.InputQuestion
	 * @generated
	 */
	EClass getInputQuestion();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.InputQuestion#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see uk.ac.york.callcentre.InputQuestion#getVariable()
	 * @see #getInputQuestion()
	 * @generated
	 */
	EAttribute getInputQuestion_Variable();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see uk.ac.york.callcentre.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.callcentre.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see uk.ac.york.callcentre.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see uk.ac.york.callcentre.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Author();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.callcentre.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uk.ac.york.callcentre.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CallcentreFactory getCallcentreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.ModelImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__STEPS = eINSTANCE.getModel_Steps();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TRANSITIONS = eINSTANCE.getModel_Transitions();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.StepImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TEXT = eINSTANCE.getStep_Text();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INCOMING = eINSTANCE.getStep_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTGOING = eINSTANCE.getStep_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__COMMENTS = eINSTANCE.getStep_Comments();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.TransitionImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TEXT = eINSTANCE.getTransition_Text();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.StatementImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.CallRedirectionImpl <em>Call Redirection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.CallRedirectionImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getCallRedirection()
		 * @generated
		 */
		EClass CALL_REDIRECTION = eINSTANCE.getCallRedirection();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_REDIRECTION__NUMBER = eINSTANCE.getCallRedirection_Number();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.InputQuestionImpl <em>Input Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.InputQuestionImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getInputQuestion()
		 * @generated
		 */
		EClass INPUT_QUESTION = eINSTANCE.getInputQuestion();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_QUESTION__VARIABLE = eINSTANCE.getInputQuestion_Variable();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.DecisionImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link uk.ac.york.callcentre.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.callcentre.impl.CommentImpl
		 * @see uk.ac.york.callcentre.impl.CallcentrePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

	}

} //CallcentrePackage
