/**
 */
package base.policy;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface PolicyFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyFactory INSTANCE = base.policy.impl.PolicyFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Evaluation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Point</em>'.
	 * @generated
	 */
	PolicyEvaluationPoint createPolicyEvaluationPoint();

	/**
	 * Returns a new object of class '<em>Evaluation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Request</em>'.
	 * @generated
	 */
	PolicyEvaluationRequest createPolicyEvaluationRequest();

	/**
	 * Returns a new object of class '<em>Evaluation Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Handler</em>'.
	 * @generated
	 */
	PolicyEvaluationHandler createPolicyEvaluationHandler();

	/**
	 * Returns a new object of class '<em>Evaluation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Context</em>'.
	 * @generated
	 */
	PolicyEvaluationContext createPolicyEvaluationContext();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	PolicyEvaluation createPolicyEvaluation();

	/**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
	Policy createPolicy();

	/**
	 * Returns a new object of class '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision</em>'.
	 * @generated
	 */
	PolicyDecision createPolicyDecision();

} //PolicyFactory
