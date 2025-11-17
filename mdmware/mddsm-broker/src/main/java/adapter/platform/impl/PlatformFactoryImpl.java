/**
 */
package adapter.platform.impl;

import adapter.platform.*;

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
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory(PlatformPackage.eNS_URI);
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
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
			case PlatformPackage.PLATFORM_ELEMENTS: return createPlatformElements();
			case PlatformPackage.PS_COMM: return createPSComm();
			case PlatformPackage.PS_CMD: return createPSCmd();
			case PlatformPackage.PS_RESOURCE: return createPSResource();
			case PlatformPackage.PS_COMPONENT: return createPSComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformElements createPlatformElements() {
		PlatformElementsImpl platformElements = new PlatformElementsImpl();
		return platformElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSComm createPSComm() {
		PSCommImpl psComm = new PSCommImpl();
		return psComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSCmd createPSCmd() {
		PSCmdImpl psCmd = new PSCmdImpl();
		return psCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSResource createPSResource() {
		PSResourceImpl psResource = new PSResourceImpl();
		return psResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSComponent createPSComponent() {
		PSComponentImpl psComponent = new PSComponentImpl();
		return psComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
