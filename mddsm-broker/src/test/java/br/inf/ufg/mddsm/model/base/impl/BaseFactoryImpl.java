/**
 */
package base.impl;

import base.*;

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
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BaseFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseFactoryImpl init() {
		try {
			BaseFactoryImpl theBaseFactory = (BaseFactoryImpl) EPackage.Registry.INSTANCE
					.getEFactory(BasePackageImpl.eNS_URI);
			if (theBaseFactory != null) {
				return theBaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl() {
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
		case BasePackageImpl.MANAGER:
			return createManager();
		case BasePackageImpl.STATE_MANAGER:
			return createStateManager();
		case BasePackageImpl.AUTONOMIC_MANAGER:
			return createAutonomicManager();
		case BasePackageImpl.POLICY_MANAGER:
			return createPolicyManager();
		case BasePackageImpl.HANDLER:
			return createHandler();
		case BasePackageImpl.INSTANCE_RESOURCE_MANAGER:
			return createInstanceResourceManager();
		case BasePackageImpl.INSTANCE:
			return createInstance();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateManager createStateManager() {
		StateManagerImpl stateManager = new StateManagerImpl();
		return stateManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutonomicManager createAutonomicManager() {
		AutonomicManagerImpl autonomicManager = new AutonomicManagerImpl();
		return autonomicManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyManager createPolicyManager() {
		PolicyManagerImpl policyManager = new PolicyManagerImpl();
		return policyManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler createHandler() {
		HandlerImpl handler = new HandlerImpl();
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceResourceManager createInstanceResourceManager() {
		InstanceResourceManagerImpl instanceResourceManager = new InstanceResourceManagerImpl();
		return instanceResourceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePackageImpl getBasePackage() {
		return (BasePackageImpl) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackageImpl getPackage() {
		return BasePackageImpl.eINSTANCE;
	}

} //BaseFactoryImpl
