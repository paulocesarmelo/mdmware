/**
 */
package base.policy.impl;

import base.policy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyFactoryImpl extends EFactoryImpl implements PolicyFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PolicyFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolicyFactoryImpl init() {
		try {
			PolicyFactoryImpl thePolicyFactory = (PolicyFactoryImpl) EPackage.Registry.INSTANCE
					.getEFactory(PolicyPackageImpl.eNS_URI);
			if (thePolicyFactory != null) {
				return thePolicyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolicyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PolicyPackageImpl.POLICY_EVALUATION_POINT:
			return createPolicyEvaluationPoint();
		case PolicyPackageImpl.POLICY_EVALUATION_REQUEST:
			return createPolicyEvaluationRequest();
		case PolicyPackageImpl.POLICY_EVALUATION_HANDLER:
			return createPolicyEvaluationHandler();
		case PolicyPackageImpl.POLICY_EVALUATION_CONTEXT:
			return createPolicyEvaluationContext();
		case PolicyPackageImpl.POLICY_EVALUATION:
			return createPolicyEvaluation();
		case PolicyPackageImpl.POLICY:
			return createPolicy();
		case PolicyPackageImpl.POLICY_DECISION:
			return createPolicyDecision();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEvaluationPoint createPolicyEvaluationPoint() {
		PolicyEvaluationPointImpl policyEvaluationPoint = new PolicyEvaluationPointImpl();
		return policyEvaluationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEvaluationRequest createPolicyEvaluationRequest() {
		PolicyEvaluationRequestImpl policyEvaluationRequest = new PolicyEvaluationRequestImpl();
		return policyEvaluationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEvaluationHandler createPolicyEvaluationHandler() {
		PolicyEvaluationHandlerImpl policyEvaluationHandler = new PolicyEvaluationHandlerImpl();
		return policyEvaluationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEvaluationContext createPolicyEvaluationContext() {
		PolicyEvaluationContextImpl policyEvaluationContext = new PolicyEvaluationContextImpl();
		return policyEvaluationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEvaluation createPolicyEvaluation() {
		PolicyEvaluationImpl policyEvaluation = new PolicyEvaluationImpl();
		return policyEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyDecision createPolicyDecision() {
		PolicyDecisionImpl policyDecision = new PolicyDecisionImpl();
		return policyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyPackageImpl getPolicyPackage() {
		return (PolicyPackageImpl) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolicyPackageImpl getPackage() {
		return PolicyPackageImpl.eINSTANCE;
	}

} //PolicyFactoryImpl
