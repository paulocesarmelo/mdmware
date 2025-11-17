/**
 */
package adapter.domain.impl;

import adapter.AdapterPackage;

import adapter.domain.DSEntity;
import adapter.domain.DomainElements;
import adapter.domain.DomainFactory;
import adapter.domain.DomainPackage;

import adapter.impl.AdapterPackageImpl;

import adapter.platform.PlatformPackage;

import adapter.platform.impl.PlatformPackageImpl;

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
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementsEClass = null;

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
	 * @see adapter.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomainPackageImpl theDomainPackage = registeredDomainPackage instanceof DomainPackageImpl ? (DomainPackageImpl)registeredDomainPackage : new DomainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);
		AdapterPackageImpl theAdapterPackage = (AdapterPackageImpl)(registeredPackage instanceof AdapterPackageImpl ? registeredPackage : AdapterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(registeredPackage instanceof PlatformPackageImpl ? registeredPackage : PlatformPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PskPackage.eNS_URI);
		PskPackageImpl thePskPackage = (PskPackageImpl)(registeredPackage instanceof PskPackageImpl ? registeredPackage : PskPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DskPackage.eNS_URI);
		DskPackageImpl theDskPackage = (DskPackageImpl)(registeredPackage instanceof DskPackageImpl ? registeredPackage : DskPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);
		M4mdPackageImpl theM4mdPackage = (M4mdPackageImpl)(registeredPackage instanceof M4mdPackageImpl ? registeredPackage : M4mdPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theAdapterPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		thePskPackage.createPackageContents();
		theDskPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theM4mdPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theAdapterPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		thePskPackage.initializePackageContents();
		theDskPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theM4mdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSEntity() {
		return dsEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainElements() {
		return domainElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainElements_Entities() {
		return (EReference)domainElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
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
		dsEntityEClass = createEClass(DS_ENTITY);

		domainElementsEClass = createEClass(DOMAIN_ELEMENTS);
		createEReference(domainElementsEClass, DOMAIN_ELEMENTS__ENTITIES);
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
		DskPackage theDskPackage = (DskPackage)EPackage.Registry.INSTANCE.getEPackage(DskPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dsEntityEClass.getESuperTypes().add(theDskPackage.getEDSEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dsEntityEClass, DSEntity.class, "DSEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainElementsEClass, DomainElements.class, "DomainElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainElements_Entities(), this.getDSEntity(), null, "entities", null, 0, -1, DomainElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DomainPackageImpl
