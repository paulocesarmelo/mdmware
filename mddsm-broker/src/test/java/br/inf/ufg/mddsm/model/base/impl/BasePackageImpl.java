/**
 */
package base.impl;

import base.AutonomicManager;
import base.BaseFactory;
import base.Handler;
import base.Instance;
import base.InstanceResourceManager;
import base.Manager;
import base.PolicyManager;
import base.ResourceManager;
import base.StateManager;

import base.autonomic.impl.AutonomicPackageImpl;

import base.common.impl.CommonPackageImpl;

import base.context.impl.ContextPackageImpl;

import base.metadata.impl.MetadataPackageImpl;

import base.policy.impl.PolicyPackageImpl;

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
 * @see base.BaseFactory
 * @generated
 */
public class BasePackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.inf.ufg.br/mestrado/sb/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sb.base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasePackageImpl eINSTANCE = base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link base.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ManagerImpl
	 * @see base.impl.BasePackageImpl#getManager()
	 * @generated
	 */
	public static final int MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__NAME = MetadataPackageImpl.ANNOTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__FEATURES = MetadataPackageImpl.ANNOTABLE__FEATURES;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__IFACE = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__ACTIONS = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__HANDLERS = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__STATE_MANAGER = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__RESOURCE_MANAGER = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Autonomic Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__AUTONOMIC_MANAGER = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Policy Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER__POLICY_MANAGER = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER_FEATURE_COUNT = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link base.ResourceManager <em>Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.ResourceManager
	 * @see base.impl.BasePackageImpl#getResourceManager()
	 * @generated
	 */
	public static final int RESOURCE_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MANAGER__IFACE = 0;

	/**
	 * The number of structural features of the '<em>Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link base.impl.StateManagerImpl <em>State Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.StateManagerImpl
	 * @see base.impl.BasePackageImpl#getStateManager()
	 * @generated
	 */
	public static final int STATE_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>State Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MANAGER__STATE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>State Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link base.impl.AutonomicManagerImpl <em>Autonomic Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.AutonomicManagerImpl
	 * @see base.impl.BasePackageImpl#getAutonomicManager()
	 * @generated
	 */
	public static final int AUTONOMIC_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Identifies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMIC_MANAGER__IDENTIFIES = 0;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMIC_MANAGER__REQUESTS = 1;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMIC_MANAGER__PLANS = 2;

	/**
	 * The number of structural features of the '<em>Autonomic Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMIC_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.impl.PolicyManagerImpl <em>Policy Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.PolicyManagerImpl
	 * @see base.impl.BasePackageImpl#getPolicyManager()
	 * @generated
	 */
	public static final int POLICY_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_MANAGER__POINTS = 0;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_MANAGER__HANDLERS = 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_MANAGER__POLICIES = 2;

	/**
	 * The number of structural features of the '<em>Policy Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.HandlerImpl
	 * @see base.impl.BasePackageImpl#getHandler()
	 * @generated
	 */
	public static final int HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HANDLER__SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HANDLER__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HANDLER__ENABLED = 2;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HANDLER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.impl.InstanceResourceManagerImpl <em>Instance Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.InstanceResourceManagerImpl
	 * @see base.impl.BasePackageImpl#getInstanceResourceManager()
	 * @generated
	 */
	public static final int INSTANCE_RESOURCE_MANAGER = 6;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_RESOURCE_MANAGER__IFACE = RESOURCE_MANAGER__IFACE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_RESOURCE_MANAGER__INSTANCES = RESOURCE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_RESOURCE_MANAGER__NAME = RESOURCE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_RESOURCE_MANAGER_FEATURE_COUNT = RESOURCE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link base.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.InstanceImpl
	 * @see base.impl.BasePackageImpl#getInstance()
	 * @generated
	 */
	public static final int INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE__NAME = MetadataPackageImpl.ANNOTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE__FEATURES = MetadataPackageImpl.ANNOTABLE__FEATURES;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE__IMPL = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE__IFACE = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_FEATURE_COUNT = MetadataPackageImpl.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autonomicManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceResourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

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
	 * @see base.impl.BasePackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, ((EFactory) BaseFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link BasePackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackageImpl init() {
		if (isInited)
			return (BasePackageImpl) EPackage.Registry.INSTANCE.getEPackage(BasePackageImpl.eNS_URI);

		// Obtain or create and register package
		Object registeredBasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasePackageImpl theBasePackage = registeredBasePackage instanceof BasePackageImpl
				? (BasePackageImpl) registeredBasePackage
				: new BasePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackageImpl.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackageImpl.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackageImpl.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theAutonomicPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theAutonomicPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackageImpl.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * Returns the meta object for class '{@link base.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see base.Manager
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getIface <em>Iface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iface</em>'.
	 * @see base.Manager#getIface()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_Iface() {
		return (EReference) managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.Manager#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see base.Manager#getActions()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_Actions() {
		return (EReference) managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.Manager#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see base.Manager#getHandlers()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_Handlers() {
		return (EReference) managerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getStateManager <em>State Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Manager</em>'.
	 * @see base.Manager#getStateManager()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_StateManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Manager</em>'.
	 * @see base.Manager#getResourceManager()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_ResourceManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getAutonomicManager <em>Autonomic Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autonomic Manager</em>'.
	 * @see base.Manager#getAutonomicManager()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_AutonomicManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getPolicyManager <em>Policy Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Manager</em>'.
	 * @see base.Manager#getPolicyManager()
	 * @see #getManager()
	 * @generated
	 */
	public EReference getManager_PolicyManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link base.ResourceManager <em>Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Manager</em>'.
	 * @see base.ResourceManager
	 * @generated
	 */
	public EClass getResourceManager() {
		return resourceManagerEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.ResourceManager#getIface <em>Iface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iface</em>'.
	 * @see base.ResourceManager#getIface()
	 * @see #getResourceManager()
	 * @generated
	 */
	public EReference getResourceManager_Iface() {
		return (EReference) resourceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.StateManager <em>State Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Manager</em>'.
	 * @see base.StateManager
	 * @generated
	 */
	public EClass getStateManager() {
		return stateManagerEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.StateManager#getStateTypes <em>State Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Types</em>'.
	 * @see base.StateManager#getStateTypes()
	 * @see #getStateManager()
	 * @generated
	 */
	public EReference getStateManager_StateTypes() {
		return (EReference) stateManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.AutonomicManager <em>Autonomic Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autonomic Manager</em>'.
	 * @see base.AutonomicManager
	 * @generated
	 */
	public EClass getAutonomicManager() {
		return autonomicManagerEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.AutonomicManager#getIdentifies <em>Identifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifies</em>'.
	 * @see base.AutonomicManager#getIdentifies()
	 * @see #getAutonomicManager()
	 * @generated
	 */
	public EReference getAutonomicManager_Identifies() {
		return (EReference) autonomicManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.AutonomicManager#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requests</em>'.
	 * @see base.AutonomicManager#getRequests()
	 * @see #getAutonomicManager()
	 * @generated
	 */
	public EReference getAutonomicManager_Requests() {
		return (EReference) autonomicManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.AutonomicManager#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see base.AutonomicManager#getPlans()
	 * @see #getAutonomicManager()
	 * @generated
	 */
	public EReference getAutonomicManager_Plans() {
		return (EReference) autonomicManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.PolicyManager <em>Policy Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Manager</em>'.
	 * @see base.PolicyManager
	 * @generated
	 */
	public EClass getPolicyManager() {
		return policyManagerEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.PolicyManager#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see base.PolicyManager#getPoints()
	 * @see #getPolicyManager()
	 * @generated
	 */
	public EReference getPolicyManager_Points() {
		return (EReference) policyManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.PolicyManager#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see base.PolicyManager#getHandlers()
	 * @see #getPolicyManager()
	 * @generated
	 */
	public EReference getPolicyManager_Handlers() {
		return (EReference) policyManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.PolicyManager#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see base.PolicyManager#getPolicies()
	 * @see #getPolicyManager()
	 * @generated
	 */
	public EReference getPolicyManager_Policies() {
		return (EReference) policyManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see base.Handler
	 * @generated
	 */
	public EClass getHandler() {
		return handlerEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.Handler#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see base.Handler#getSignal()
	 * @see #getHandler()
	 * @generated
	 */
	public EReference getHandler_Signal() {
		return (EReference) handlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.Handler#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see base.Handler#getAction()
	 * @see #getHandler()
	 * @generated
	 */
	public EReference getHandler_Action() {
		return (EReference) handlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.Handler#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see base.Handler#isEnabled()
	 * @see #getHandler()
	 * @generated
	 */
	public EAttribute getHandler_Enabled() {
		return (EAttribute) handlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.InstanceResourceManager <em>Instance Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Resource Manager</em>'.
	 * @see base.InstanceResourceManager
	 * @generated
	 */
	public EClass getInstanceResourceManager() {
		return instanceResourceManagerEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.InstanceResourceManager#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see base.InstanceResourceManager#getInstances()
	 * @see #getInstanceResourceManager()
	 * @generated
	 */
	public EReference getInstanceResourceManager_Instances() {
		return (EReference) instanceResourceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.InstanceResourceManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.InstanceResourceManager#getName()
	 * @see #getInstanceResourceManager()
	 * @generated
	 */
	public EAttribute getInstanceResourceManager_Name() {
		return (EAttribute) instanceResourceManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see base.Instance
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.Instance#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see base.Instance#getImpl()
	 * @see #getInstance()
	 * @generated
	 */
	public EAttribute getInstance_Impl() {
		return (EAttribute) instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link base.Instance#getIface <em>Iface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iface</em>'.
	 * @see base.Instance#getIface()
	 * @see #getInstance()
	 * @generated
	 */
	public EReference getInstance_Iface() {
		return (EReference) instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory) getEFactoryInstance();
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
		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__IFACE);
		createEReference(managerEClass, MANAGER__ACTIONS);
		createEReference(managerEClass, MANAGER__HANDLERS);
		createEReference(managerEClass, MANAGER__STATE_MANAGER);
		createEReference(managerEClass, MANAGER__RESOURCE_MANAGER);
		createEReference(managerEClass, MANAGER__AUTONOMIC_MANAGER);
		createEReference(managerEClass, MANAGER__POLICY_MANAGER);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);
		createEReference(resourceManagerEClass, RESOURCE_MANAGER__IFACE);

		stateManagerEClass = createEClass(STATE_MANAGER);
		createEReference(stateManagerEClass, STATE_MANAGER__STATE_TYPES);

		autonomicManagerEClass = createEClass(AUTONOMIC_MANAGER);
		createEReference(autonomicManagerEClass, AUTONOMIC_MANAGER__IDENTIFIES);
		createEReference(autonomicManagerEClass, AUTONOMIC_MANAGER__REQUESTS);
		createEReference(autonomicManagerEClass, AUTONOMIC_MANAGER__PLANS);

		policyManagerEClass = createEClass(POLICY_MANAGER);
		createEReference(policyManagerEClass, POLICY_MANAGER__POINTS);
		createEReference(policyManagerEClass, POLICY_MANAGER__HANDLERS);
		createEReference(policyManagerEClass, POLICY_MANAGER__POLICIES);

		handlerEClass = createEClass(HANDLER);
		createEReference(handlerEClass, HANDLER__SIGNAL);
		createEReference(handlerEClass, HANDLER__ACTION);
		createEAttribute(handlerEClass, HANDLER__ENABLED);

		instanceResourceManagerEClass = createEClass(INSTANCE_RESOURCE_MANAGER);
		createEReference(instanceResourceManagerEClass, INSTANCE_RESOURCE_MANAGER__INSTANCES);
		createEAttribute(instanceResourceManagerEClass, INSTANCE_RESOURCE_MANAGER__NAME);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__IMPL);
		createEReference(instanceEClass, INSTANCE__IFACE);
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
		ContextPackageImpl theContextPackage = (ContextPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(ContextPackageImpl.eNS_URI);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(MetadataPackageImpl.eNS_URI);
		AutonomicPackageImpl theAutonomicPackage = (AutonomicPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(AutonomicPackageImpl.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(PolicyPackageImpl.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) EPackage.Registry.INSTANCE
				.getEPackage(CommonPackageImpl.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContextPackage);
		getESubpackages().add(theMetadataPackage);
		getESubpackages().add(theAutonomicPackage);
		getESubpackages().add(thePolicyPackage);
		getESubpackages().add(theCommonPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managerEClass.getESuperTypes().add(theMetadataPackage.getAnnotable());
		instanceResourceManagerEClass.getESuperTypes().add(this.getResourceManager());
		instanceEClass.getESuperTypes().add(theMetadataPackage.getAnnotable());

		// Initialize classes and features; add operations and parameters
		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_Iface(), theCommonPackage.getInterface(), null, "iface", null, 1, 1, Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_Actions(), theCommonPackage.getAction(), null, "actions", null, 0, -1, Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_Handlers(), this.getHandler(), null, "handlers", null, 0, -1, Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_StateManager(), this.getStateManager(), null, "stateManager", null, 0, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ResourceManager(), this.getResourceManager(), null, "resourceManager", null, 0, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_AutonomicManager(), this.getAutonomicManager(), null, "autonomicManager", null, 0, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_PolicyManager(), this.getPolicyManager(), null, "policyManager", null, 1, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceManagerEClass, ResourceManager.class, "ResourceManager", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceManager_Iface(), theCommonPackage.getInterface(), null, "iface", null, 1, 1,
				ResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateManagerEClass, StateManager.class, "StateManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateManager_StateTypes(), theContextPackage.getState(), null, "stateTypes", null, 0, -1,
				StateManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autonomicManagerEClass, AutonomicManager.class, "AutonomicManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutonomicManager_Identifies(), theAutonomicPackage.getSymptom(), null, "identifies", null, 0,
				-1, AutonomicManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutonomicManager_Requests(), theAutonomicPackage.getChangeRequest(), null, "requests", null,
				0, -1, AutonomicManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutonomicManager_Plans(), theAutonomicPackage.getChangePlan(), null, "plans", null, 0, -1,
				AutonomicManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyManagerEClass, PolicyManager.class, "PolicyManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyManager_Points(), thePolicyPackage.getPolicyEvaluationPoint(), null, "points", null, 0,
				-1, PolicyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyManager_Handlers(), thePolicyPackage.getPolicyEvaluationHandler(), null, "handlers",
				null, 0, -1, PolicyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyManager_Policies(), thePolicyPackage.getPolicy(), null, "policies", null, 0, -1,
				PolicyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerEClass, Handler.class, "Handler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandler_Signal(), theCommonPackage.getSignal(), null, "signal", null, 1, 1, Handler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHandler_Action(), theCommonPackage.getActionExecution(), null, "action", null, 1, 1,
				Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandler_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 1, 1, Handler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceResourceManagerEClass, InstanceResourceManager.class, "InstanceResourceManager",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceResourceManager_Instances(), this.getInstance(), null, "instances", null, 0, -1,
				InstanceResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceResourceManager_Name(), ecorePackage.getEString(), "Name", null, 0, 1,
				InstanceResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_Impl(), ecorePackage.getEString(), "impl", null, 1, 1, Instance.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Iface(), theCommonPackage.getInterface(), null, "iface", null, 1, 1, Instance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link base.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ManagerImpl
		 * @see base.impl.BasePackageImpl#getManager()
		 * @generated
		 */
		public static final EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Iface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__IFACE = eINSTANCE.getManager_Iface();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__ACTIONS = eINSTANCE.getManager_Actions();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__HANDLERS = eINSTANCE.getManager_Handlers();

		/**
		 * The meta object literal for the '<em><b>State Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__STATE_MANAGER = eINSTANCE.getManager_StateManager();

		/**
		 * The meta object literal for the '<em><b>Resource Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__RESOURCE_MANAGER = eINSTANCE.getManager_ResourceManager();

		/**
		 * The meta object literal for the '<em><b>Autonomic Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__AUTONOMIC_MANAGER = eINSTANCE.getManager_AutonomicManager();

		/**
		 * The meta object literal for the '<em><b>Policy Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MANAGER__POLICY_MANAGER = eINSTANCE.getManager_PolicyManager();

		/**
		 * The meta object literal for the '{@link base.ResourceManager <em>Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.ResourceManager
		 * @see base.impl.BasePackageImpl#getResourceManager()
		 * @generated
		 */
		public static final EClass RESOURCE_MANAGER = eINSTANCE.getResourceManager();

		/**
		 * The meta object literal for the '<em><b>Iface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESOURCE_MANAGER__IFACE = eINSTANCE.getResourceManager_Iface();

		/**
		 * The meta object literal for the '{@link base.impl.StateManagerImpl <em>State Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.StateManagerImpl
		 * @see base.impl.BasePackageImpl#getStateManager()
		 * @generated
		 */
		public static final EClass STATE_MANAGER = eINSTANCE.getStateManager();

		/**
		 * The meta object literal for the '<em><b>State Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MANAGER__STATE_TYPES = eINSTANCE.getStateManager_StateTypes();

		/**
		 * The meta object literal for the '{@link base.impl.AutonomicManagerImpl <em>Autonomic Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.AutonomicManagerImpl
		 * @see base.impl.BasePackageImpl#getAutonomicManager()
		 * @generated
		 */
		public static final EClass AUTONOMIC_MANAGER = eINSTANCE.getAutonomicManager();

		/**
		 * The meta object literal for the '<em><b>Identifies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUTONOMIC_MANAGER__IDENTIFIES = eINSTANCE.getAutonomicManager_Identifies();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUTONOMIC_MANAGER__REQUESTS = eINSTANCE.getAutonomicManager_Requests();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUTONOMIC_MANAGER__PLANS = eINSTANCE.getAutonomicManager_Plans();

		/**
		 * The meta object literal for the '{@link base.impl.PolicyManagerImpl <em>Policy Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.PolicyManagerImpl
		 * @see base.impl.BasePackageImpl#getPolicyManager()
		 * @generated
		 */
		public static final EClass POLICY_MANAGER = eINSTANCE.getPolicyManager();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_MANAGER__POINTS = eINSTANCE.getPolicyManager_Points();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_MANAGER__HANDLERS = eINSTANCE.getPolicyManager_Handlers();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POLICY_MANAGER__POLICIES = eINSTANCE.getPolicyManager_Policies();

		/**
		 * The meta object literal for the '{@link base.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.HandlerImpl
		 * @see base.impl.BasePackageImpl#getHandler()
		 * @generated
		 */
		public static final EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HANDLER__SIGNAL = eINSTANCE.getHandler_Signal();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HANDLER__ACTION = eINSTANCE.getHandler_Action();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HANDLER__ENABLED = eINSTANCE.getHandler_Enabled();

		/**
		 * The meta object literal for the '{@link base.impl.InstanceResourceManagerImpl <em>Instance Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.InstanceResourceManagerImpl
		 * @see base.impl.BasePackageImpl#getInstanceResourceManager()
		 * @generated
		 */
		public static final EClass INSTANCE_RESOURCE_MANAGER = eINSTANCE.getInstanceResourceManager();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INSTANCE_RESOURCE_MANAGER__INSTANCES = eINSTANCE
				.getInstanceResourceManager_Instances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INSTANCE_RESOURCE_MANAGER__NAME = eINSTANCE.getInstanceResourceManager_Name();

		/**
		 * The meta object literal for the '{@link base.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.InstanceImpl
		 * @see base.impl.BasePackageImpl#getInstance()
		 * @generated
		 */
		public static final EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INSTANCE__IMPL = eINSTANCE.getInstance_Impl();

		/**
		 * The meta object literal for the '<em><b>Iface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INSTANCE__IFACE = eINSTANCE.getInstance_Iface();

	}

} //BasePackageImpl
