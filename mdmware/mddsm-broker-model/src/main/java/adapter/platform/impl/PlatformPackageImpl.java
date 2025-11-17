/**
 */
package adapter.platform.impl;

import adapter.AdapterPackage;

import adapter.domain.DomainPackage;

import adapter.domain.impl.DomainPackageImpl;

import adapter.impl.AdapterPackageImpl;

import adapter.platform.PSCmd;
import adapter.platform.PSComm;
import adapter.platform.PSComponent;
import adapter.platform.PSResource;
import adapter.platform.PlatformElements;
import adapter.platform.PlatformFactory;
import adapter.platform.PlatformPackage;

import dsk.DskPackage;

import dsk.common.CommonPackage;

import dsk.common.impl.CommonPackageImpl;

import dsk.impl.DskPackageImpl;

import m4md.M4mdPackage;

import m4md.impl.M4mdPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import psk.PskPackage;

import psk.impl.PskPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psCommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psComponentEClass = null;

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
	 * @see adapter.platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlatformPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlatformPackageImpl thePlatformPackage = registeredPlatformPackage instanceof PlatformPackageImpl ? (PlatformPackageImpl)registeredPlatformPackage : new PlatformPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);
		AdapterPackageImpl theAdapterPackage = (AdapterPackageImpl)(registeredPackage instanceof AdapterPackageImpl ? registeredPackage : AdapterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PskPackage.eNS_URI);
		PskPackageImpl thePskPackage = (PskPackageImpl)(registeredPackage instanceof PskPackageImpl ? registeredPackage : PskPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DskPackage.eNS_URI);
		DskPackageImpl theDskPackage = (DskPackageImpl)(registeredPackage instanceof DskPackageImpl ? registeredPackage : DskPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);
		M4mdPackageImpl theM4mdPackage = (M4mdPackageImpl)(registeredPackage instanceof M4mdPackageImpl ? registeredPackage : M4mdPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();
		theAdapterPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		thePskPackage.createPackageContents();
		theDskPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theM4mdPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();
		theAdapterPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		thePskPackage.initializePackageContents();
		theDskPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theM4mdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatformPackage.eNS_URI, thePlatformPackage);
		return thePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformElements() {
		return platformElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformElements_Resources() {
		return (EReference)platformElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformElements_Comm() {
		return (EReference)platformElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformElements_Cmd() {
		return (EReference)platformElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformElements_Comp() {
		return (EReference)platformElementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSComm() {
		return psCommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSCmd() {
		return psCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSResource() {
		return psResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSComponent() {
		return psComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		platformElementsEClass = createEClass(PLATFORM_ELEMENTS);
		createEReference(platformElementsEClass, PLATFORM_ELEMENTS__RESOURCES);
		createEReference(platformElementsEClass, PLATFORM_ELEMENTS__COMM);
		createEReference(platformElementsEClass, PLATFORM_ELEMENTS__CMD);
		createEReference(platformElementsEClass, PLATFORM_ELEMENTS__COMP);

		psCommEClass = createEClass(PS_COMM);

		psCmdEClass = createEClass(PS_CMD);

		psResourceEClass = createEClass(PS_RESOURCE);

		psComponentEClass = createEClass(PS_COMPONENT);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PskPackage thePskPackage = (PskPackage)EPackage.Registry.INSTANCE.getEPackage(PskPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		psCommEClass.getESuperTypes().add(thePskPackage.getCommunication());
		psCmdEClass.getESuperTypes().add(thePskPackage.getCommand());
		psResourceEClass.getESuperTypes().add(thePskPackage.getPSResource());
		psComponentEClass.getESuperTypes().add(thePskPackage.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(platformElementsEClass, PlatformElements.class, "PlatformElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformElements_Resources(), this.getPSResource(), null, "resources", null, 0, -1, PlatformElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformElements_Comm(), this.getPSComm(), null, "comm", null, 0, -1, PlatformElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformElements_Cmd(), this.getPSCmd(), null, "cmd", null, 0, -1, PlatformElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformElements_Comp(), this.getPSComponent(), null, "comp", null, 0, -1, PlatformElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psCommEClass, PSComm.class, "PSComm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(psCmdEClass, PSCmd.class, "PSCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(psResourceEClass, PSResource.class, "PSResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(psComponentEClass, PSComponent.class, "PSComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //PlatformPackageImpl
