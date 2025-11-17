/**
 */
package base.policy.impl;

import base.autonomic.impl.AutonomicPackageImpl;

import base.common.impl.CommonPackageImpl;

import base.context.impl.ContextPackageImpl;

import base.impl.BasePackageImpl;

import base.metadata.impl.MetadataPackageImpl;

import base.policy.Policy;
import base.policy.PolicyDecision;
import base.policy.PolicyEvaluation;
import base.policy.PolicyEvaluationContext;
import base.policy.PolicyEvaluationHandler;
import base.policy.PolicyEvaluationPoint;
import base.policy.PolicyEvaluationRequest;
import base.policy.PolicyFactory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see base.policy.PolicyFactory
 * @generated
 */
public class PolicyPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "policy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.inf.ufg.br/mestrado/sb/base/policy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sb.base.policy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PolicyPackageImpl eINSTANCE = base.policy.impl.PolicyPackageImpl.init();

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyEvaluationPointImpl <em>Evaluation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyEvaluationPointImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationPoint()
	 * @generated
	 */
	public static final int POLICY_EVALUATION_POINT = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_POINT__SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_POINT__REQUEST = 1;

	/**
	 * The number of structural features of the '<em>Evaluation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyEvaluationRequestImpl <em>Evaluation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyEvaluationRequestImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationRequest()
	 * @generated
	 */
	public static final int POLICY_EVALUATION_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_REQUEST__HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_REQUEST__BINDINGS = 1;

	/**
	 * The number of structural features of the '<em>Evaluation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyEvaluationHandlerImpl <em>Evaluation Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyEvaluationHandlerImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationHandler()
	 * @generated
	 */
	public static final int POLICY_EVALUATION_HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_HANDLER__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Handler Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_HANDLER__HANDLER_IMPL = 1;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_HANDLER__EVALUATION = 2;

	/**
	 * The number of structural features of the '<em>Evaluation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyEvaluationContextImpl <em>Evaluation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyEvaluationContextImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationContext()
	 * @generated
	 */
	public static final int POLICY_EVALUATION_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_CONTEXT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Evaluation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyEvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyEvaluationImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluation()
	 * @generated
	 */
	public static final int POLICY_EVALUATION = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Context Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION__CONTEXT_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_EVALUATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicy()
	 * @generated
	 */
	public static final int POLICY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY__BUSINESS_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY__FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY__DECISION = 3;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link base.policy.impl.PolicyDecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.policy.impl.PolicyDecisionImpl
	 * @see base.policy.impl.PolicyPackageImpl#getPolicyDecision()
	 * @generated
	 */
	public static final int POLICY_DECISION = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_DECISION__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_DECISION__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_DECISION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_DECISION_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDecisionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see base.policy.impl.PolicyPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyPackageImpl() {
		super(eNS_URI, ((EFactory) PolicyFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PolicyPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyPackageImpl init() {
		if (isInited)
			return (PolicyPackageImpl) EPackage.Registry.INSTANCE.getEPackage(PolicyPackageImpl.eNS_URI);

		// Obtain or create and register package
		Object registeredPolicyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolicyPackageImpl thePolicyPackage = registeredPolicyPackage instanceof PolicyPackageImpl
				? (PolicyPackageImpl) registeredPolicyPackage
				: new PolicyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackageImpl.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl) (registeredPackage instanceof BasePackageImpl
				? registeredPackage
				: BasePackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackageImpl.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
				? registeredPackage
				: ContextPackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetadataPackageImpl.eNS_URI);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl) (registeredPackage instanceof MetadataPackageImpl
				? registeredPackage
				: MetadataPackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AutonomicPackageImpl.eNS_URI);
		AutonomicPackageImpl theAutonomicPackage = (AutonomicPackageImpl) (registeredPackage instanceof AutonomicPackageImpl
				? registeredPackage
				: AutonomicPackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackageImpl.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackageImpl.eINSTANCE);

		// Create package meta-data objects
		thePolicyPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theAutonomicPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		thePolicyPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theAutonomicPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolicyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyPackageImpl.eNS_URI, thePolicyPackage);
		return thePolicyPackage;
	}

	/**
	 * Returns the meta object for class '{@link base.policy.PolicyEvaluationPoint <em>Evaluation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Point</em>'.
	 * @see base.policy.PolicyEvaluationPoint
	 * @generated
	 */
	public EClass getPolicyEvaluationPoint() {
		return policyEvaluationPointEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.policy.PolicyEvaluationPoint#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see base.policy.PolicyEvaluationPoint#getSignal()
	 * @see #getPolicyEvaluationPoint()
	 * @generated
	 */
	public EReference getPolicyEvaluationPoint_Signal() {
		return (EReference) policyEvaluationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.policy.PolicyEvaluationPoint#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see base.policy.PolicyEvaluationPoint#getRequest()
	 * @see #getPolicyEvaluationPoint()
	 * @generated
	 */
	public EReference getPolicyEvaluationPoint_Request() {
		return (EReference) policyEvaluationPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.policy.PolicyEvaluationRequest <em>Evaluation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Request</em>'.
	 * @see base.policy.PolicyEvaluationRequest
	 * @generated
	 */
	public EClass getPolicyEvaluationRequest() {
		return policyEvaluationRequestEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.policy.PolicyEvaluationRequest#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler</em>'.
	 * @see base.policy.PolicyEvaluationRequest#getHandler()
	 * @see #getPolicyEvaluationRequest()
	 * @generated
	 */
	public EReference getPolicyEvaluationRequest_Handler() {
		return (EReference) policyEvaluationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.policy.PolicyEvaluationRequest#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see base.policy.PolicyEvaluationRequest#getBindings()
	 * @see #getPolicyEvaluationRequest()
	 * @generated
	 */
	public EReference getPolicyEvaluationRequest_Bindings() {
		return (EReference) policyEvaluationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.policy.PolicyEvaluationHandler <em>Evaluation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Handler</em>'.
	 * @see base.policy.PolicyEvaluationHandler
	 * @generated
	 */
	public EClass getPolicyEvaluationHandler() {
		return policyEvaluationHandlerEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.policy.PolicyEvaluationHandler#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see base.policy.PolicyEvaluationHandler#getParameters()
	 * @see #getPolicyEvaluationHandler()
	 * @generated
	 */
	public EReference getPolicyEvaluationHandler_Parameters() {
		return (EReference) policyEvaluationHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.PolicyEvaluationHandler#getHandlerImpl <em>Handler Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Impl</em>'.
	 * @see base.policy.PolicyEvaluationHandler#getHandlerImpl()
	 * @see #getPolicyEvaluationHandler()
	 * @generated
	 */
	public EAttribute getPolicyEvaluationHandler_HandlerImpl() {
		return (EAttribute) policyEvaluationHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.policy.PolicyEvaluationHandler#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see base.policy.PolicyEvaluationHandler#getEvaluation()
	 * @see #getPolicyEvaluationHandler()
	 * @generated
	 */
	public EReference getPolicyEvaluationHandler_Evaluation() {
		return (EReference) policyEvaluationHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.policy.PolicyEvaluationContext <em>Evaluation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Context</em>'.
	 * @see base.policy.PolicyEvaluationContext
	 * @generated
	 */
	public EClass getPolicyEvaluationContext() {
		return policyEvaluationContextEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.policy.PolicyEvaluationContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see base.policy.PolicyEvaluationContext#getParameters()
	 * @see #getPolicyEvaluationContext()
	 * @generated
	 */
	public EReference getPolicyEvaluationContext_Parameters() {
		return (EReference) policyEvaluationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.policy.PolicyEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see base.policy.PolicyEvaluation
	 * @generated
	 */
	public EClass getPolicyEvaluation() {
		return policyEvaluationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.policy.PolicyEvaluation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see base.policy.PolicyEvaluation#getFeature()
	 * @see #getPolicyEvaluation()
	 * @generated
	 */
	public EReference getPolicyEvaluation_Feature() {
		return (EReference) policyEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.policy.PolicyEvaluation#getContextBinding <em>Context Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Binding</em>'.
	 * @see base.policy.PolicyEvaluation#getContextBinding()
	 * @see #getPolicyEvaluation()
	 * @generated
	 */
	public EReference getPolicyEvaluation_ContextBinding() {
		return (EReference) policyEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.policy.PolicyEvaluation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see base.policy.PolicyEvaluation#getContext()
	 * @see #getPolicyEvaluation()
	 * @generated
	 */
	public EReference getPolicyEvaluation_Context() {
		return (EReference) policyEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.policy.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see base.policy.Policy
	 * @generated
	 */
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.policy.Policy#getName()
	 * @see #getPolicy()
	 * @generated
	 */
	public EAttribute getPolicy_Name() {
		return (EAttribute) policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.Policy#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Value</em>'.
	 * @see base.policy.Policy#getBusinessValue()
	 * @see #getPolicy()
	 * @generated
	 */
	public EAttribute getPolicy_BusinessValue() {
		return (EAttribute) policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.Policy#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see base.policy.Policy#getFeature()
	 * @see #getPolicy()
	 * @generated
	 */
	public EAttribute getPolicy_Feature() {
		return (EAttribute) policyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.policy.Policy#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision</em>'.
	 * @see base.policy.Policy#getDecision()
	 * @see #getPolicy()
	 * @generated
	 */
	public EReference getPolicy_Decision() {
		return (EReference) policyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link base.policy.PolicyDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see base.policy.PolicyDecision
	 * @generated
	 */
	public EClass getPolicyDecision() {
		return policyDecisionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.PolicyDecision#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see base.policy.PolicyDecision#getParameter()
	 * @see #getPolicyDecision()
	 * @generated
	 */
	public EAttribute getPolicyDecision_Parameter() {
		return (EAttribute) policyDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.PolicyDecision#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see base.policy.PolicyDecision#getOperation()
	 * @see #getPolicyDecision()
	 * @generated
	 */
	public EAttribute getPolicyDecision_Operation() {
		return (EAttribute) policyDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.policy.PolicyDecision#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see base.policy.PolicyDecision#getValue()
	 * @see #getPolicyDecision()
	 * @generated
	 */
	public EAttribute getPolicyDecision_Value() {
		return (EAttribute) policyDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PolicyFactory getPolicyFactory() {
		return (PolicyFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		policyEvaluationPointEClass = createEClass(POLICY_EVALUATION_POINT);
		createEReference(policyEvaluationPointEClass, POLICY_EVALUATION_POINT__SIGNAL);
		createEReference(policyEvaluationPointEClass, POLICY_EVALUATION_POINT__REQUEST);

		policyEvaluationRequestEClass = createEClass(POLICY_EVALUATION_REQUEST);
		createEReference(policyEvaluationRequestEClass, POLICY_EVALUATION_REQUEST__HANDLER);
		createEReference(policyEvaluationRequestEClass, POLICY_EVALUATION_REQUEST__BINDINGS);

		policyEvaluationHandlerEClass = createEClass(POLICY_EVALUATION_HANDLER);
		createEReference(policyEvaluationHandlerEClass, POLICY_EVALUATION_HANDLER__PARAMETERS);
		createEAttribute(policyEvaluationHandlerEClass, POLICY_EVALUATION_HANDLER__HANDLER_IMPL);
		createEReference(policyEvaluationHandlerEClass, POLICY_EVALUATION_HANDLER__EVALUATION);

		policyEvaluationContextEClass = createEClass(POLICY_EVALUATION_CONTEXT);
		createEReference(policyEvaluationContextEClass, POLICY_EVALUATION_CONTEXT__PARAMETERS);

		policyEvaluationEClass = createEClass(POLICY_EVALUATION);
		createEReference(policyEvaluationEClass, POLICY_EVALUATION__FEATURE);
		createEReference(policyEvaluationEClass, POLICY_EVALUATION__CONTEXT_BINDING);
		createEReference(policyEvaluationEClass, POLICY_EVALUATION__CONTEXT);

		policyEClass = createEClass(POLICY);
		createEAttribute(policyEClass, POLICY__NAME);
		createEAttribute(policyEClass, POLICY__BUSINESS_VALUE);
		createEAttribute(policyEClass, POLICY__FEATURE);
		createEReference(policyEClass, POLICY__DECISION);

		policyDecisionEClass = createEClass(POLICY_DECISION);
		createEAttribute(policyDecisionEClass, POLICY_DECISION__PARAMETER);
		createEAttribute(policyDecisionEClass, POLICY_DECISION__OPERATION);
		createEAttribute(policyDecisionEClass, POLICY_DECISION__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(CommonPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(policyEvaluationPointEClass, PolicyEvaluationPoint.class, "PolicyEvaluationPoint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationPoint_Signal(), theCommonPackage.getSignal(), null, "signal", null, 1, 1,
				PolicyEvaluationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluationPoint_Request(), this.getPolicyEvaluationRequest(), null, "request", null, 1,
				1, PolicyEvaluationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationRequestEClass, PolicyEvaluationRequest.class, "PolicyEvaluationRequest",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationRequest_Handler(), this.getPolicyEvaluationHandler(), null, "handler", null,
				1, 1, PolicyEvaluationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluationRequest_Bindings(), theCommonPackage.getParameterBinding(), null, "bindings",
				null, 0, -1, PolicyEvaluationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationHandlerEClass, PolicyEvaluationHandler.class, "PolicyEvaluationHandler",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationHandler_Parameters(), theCommonPackage.getParameter(), null, "parameters",
				null, 0, -1, PolicyEvaluationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyEvaluationHandler_HandlerImpl(), ecorePackage.getEString(), "handlerImpl", null, 1, 1,
				PolicyEvaluationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluationHandler_Evaluation(), this.getPolicyEvaluation(), null, "evaluation", null, 1,
				1, PolicyEvaluationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationContextEClass, PolicyEvaluationContext.class, "PolicyEvaluationContext",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationContext_Parameters(), theCommonPackage.getParameter(), null, "parameters",
				null, 0, -1, PolicyEvaluationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationEClass, PolicyEvaluation.class, "PolicyEvaluation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluation_Feature(), theCommonPackage.getValue(), null, "feature", null, 1, 1,
				PolicyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluation_ContextBinding(), theCommonPackage.getParameterBinding(), null,
				"contextBinding", null, 0, -1, PolicyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluation_Context(), this.getPolicyEvaluationContext(), null, "context", null, 1, 1,
				PolicyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 1, 1, Policy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_BusinessValue(), ecorePackage.getEIntegerObject(), "businessValue", null, 1, 1,
				Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Feature(), ecorePackage.getEString(), "feature", null, 1, 1, Policy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Decision(), this.getPolicyDecision(), null, "decision", null, 1, 1, Policy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyDecisionEClass, PolicyDecision.class, "PolicyDecision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDecision_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1,
				PolicyDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDecision_Operation(), ecorePackage.getEString(), "operation", null, 1, 1,
				PolicyDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDecision_Value(), ecorePackage.getEString(), "value", null, 1, 1, PolicyDecision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyEvaluationPointImpl <em>Evaluation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyEvaluationPointImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationPoint()
		 * @generated
		 */
		public static final EClass POLICY_EVALUATION_POINT = eINSTANCE.getPolicyEvaluationPoint();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_POINT__SIGNAL = eINSTANCE.getPolicyEvaluationPoint_Signal();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_POINT__REQUEST = eINSTANCE.getPolicyEvaluationPoint_Request();

		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyEvaluationRequestImpl <em>Evaluation Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyEvaluationRequestImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationRequest()
		 * @generated
		 */
		public static final EClass POLICY_EVALUATION_REQUEST = eINSTANCE.getPolicyEvaluationRequest();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_REQUEST__HANDLER = eINSTANCE
				.getPolicyEvaluationRequest_Handler();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_REQUEST__BINDINGS = eINSTANCE
				.getPolicyEvaluationRequest_Bindings();

		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyEvaluationHandlerImpl <em>Evaluation Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyEvaluationHandlerImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationHandler()
		 * @generated
		 */
		public static final EClass POLICY_EVALUATION_HANDLER = eINSTANCE.getPolicyEvaluationHandler();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_HANDLER__PARAMETERS = eINSTANCE
				.getPolicyEvaluationHandler_Parameters();

		/**
		 * The meta object literal for the '<em><b>Handler Impl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY_EVALUATION_HANDLER__HANDLER_IMPL = eINSTANCE
				.getPolicyEvaluationHandler_HandlerImpl();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_HANDLER__EVALUATION = eINSTANCE
				.getPolicyEvaluationHandler_Evaluation();

		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyEvaluationContextImpl <em>Evaluation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyEvaluationContextImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluationContext()
		 * @generated
		 */
		public static final EClass POLICY_EVALUATION_CONTEXT = eINSTANCE.getPolicyEvaluationContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION_CONTEXT__PARAMETERS = eINSTANCE
				.getPolicyEvaluationContext_Parameters();

		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyEvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyEvaluationImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicyEvaluation()
		 * @generated
		 */
		public static final EClass POLICY_EVALUATION = eINSTANCE.getPolicyEvaluation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION__FEATURE = eINSTANCE.getPolicyEvaluation_Feature();

		/**
		 * The meta object literal for the '<em><b>Context Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION__CONTEXT_BINDING = eINSTANCE
				.getPolicyEvaluation_ContextBinding();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_EVALUATION__CONTEXT = eINSTANCE.getPolicyEvaluation_Context();

		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicy()
		 * @generated
		 */
		public static final EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Business Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY__BUSINESS_VALUE = eINSTANCE.getPolicy_BusinessValue();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY__FEATURE = eINSTANCE.getPolicy_Feature();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY__DECISION = eINSTANCE.getPolicy_Decision();

		/**
		 * The meta object literal for the '{@link base.policy.impl.PolicyDecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.policy.impl.PolicyDecisionImpl
		 * @see base.policy.impl.PolicyPackageImpl#getPolicyDecision()
		 * @generated
		 */
		public static final EClass POLICY_DECISION = eINSTANCE.getPolicyDecision();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY_DECISION__PARAMETER = eINSTANCE.getPolicyDecision_Parameter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY_DECISION__OPERATION = eINSTANCE.getPolicyDecision_Operation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POLICY_DECISION__VALUE = eINSTANCE.getPolicyDecision_Value();

	}

} //PolicyPackageImpl
