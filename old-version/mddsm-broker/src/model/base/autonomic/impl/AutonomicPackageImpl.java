/**
 */
package base.autonomic.impl;

import base.autonomic.AutonomicFactory;
import base.autonomic.ChangePlan;
import base.autonomic.ChangeRequest;
import base.autonomic.Symptom;

import base.common.impl.CommonPackageImpl;

import base.context.impl.ContextPackageImpl;

import base.impl.BasePackageImpl;

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
 * @see base.autonomic.AutonomicFactory
 * @generated
 */
public class AutonomicPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "autonomic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.inf.ufg.br/mestrado/sb/base/autonomic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sb.base.autonomic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AutonomicPackageImpl eINSTANCE = base.autonomic.impl.AutonomicPackageImpl.init();

	/**
	 * The meta object id for the '{@link base.autonomic.impl.SymptomImpl <em>Symptom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.autonomic.impl.SymptomImpl
	 * @see base.autonomic.impl.AutonomicPackageImpl#getSymptom()
	 * @generated
	 */
	public static final int SYMPTOM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYMPTOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYMPTOM__BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYMPTOM__CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>Symptom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYMPTOM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.autonomic.impl.ChangeRequestImpl <em>Change Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.autonomic.impl.ChangeRequestImpl
	 * @see base.autonomic.impl.AutonomicPackageImpl#getChangeRequest()
	 * @generated
	 */
	public static final int CHANGE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_REQUEST__BASED_ON = 1;

	/**
	 * The number of structural features of the '<em>Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link base.autonomic.impl.ChangePlanImpl <em>Change Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.autonomic.impl.ChangePlanImpl
	 * @see base.autonomic.impl.AutonomicPackageImpl#getChangePlan()
	 * @generated
	 */
	public static final int CHANGE_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_PLAN__BASED_ON = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_PLAN__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_PLAN__NAME = 2;

	/**
	 * The number of structural features of the '<em>Change Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_PLAN_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symptomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePlanEClass = null;

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
	 * @see base.autonomic.impl.AutonomicPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AutonomicPackageImpl() {
		super(eNS_URI, ((EFactory) AutonomicFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link AutonomicPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AutonomicPackageImpl init() {
		if (isInited)
			return (AutonomicPackageImpl) EPackage.Registry.INSTANCE.getEPackage(AutonomicPackageImpl.eNS_URI);

		// Obtain or create and register package
		Object registeredAutonomicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AutonomicPackageImpl theAutonomicPackage = registeredAutonomicPackage instanceof AutonomicPackageImpl
				? (AutonomicPackageImpl) registeredAutonomicPackage
				: new AutonomicPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackageImpl.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackageImpl.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theAutonomicPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theAutonomicPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAutonomicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AutonomicPackageImpl.eNS_URI, theAutonomicPackage);
		return theAutonomicPackage;
	}

	/**
	 * Returns the meta object for class '{@link base.autonomic.Symptom <em>Symptom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symptom</em>'.
	 * @see base.autonomic.Symptom
	 * @generated
	 */
	public EClass getSymptom() {
		return symptomEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.autonomic.Symptom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.autonomic.Symptom#getName()
	 * @see #getSymptom()
	 * @generated
	 */
	public EAttribute getSymptom_Name() {
		return (EAttribute) symptomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.autonomic.Symptom#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see base.autonomic.Symptom#getBindings()
	 * @see #getSymptom()
	 * @generated
	 */
	public EReference getSymptom_Bindings() {
		return (EReference) symptomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.autonomic.Symptom#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see base.autonomic.Symptom#getConditions()
	 * @see #getSymptom()
	 * @generated
	 */
	public EReference getSymptom_Conditions() {
		return (EReference) symptomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.autonomic.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Request</em>'.
	 * @see base.autonomic.ChangeRequest
	 * @generated
	 */
	public EClass getChangeRequest() {
		return changeRequestEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.autonomic.ChangeRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.autonomic.ChangeRequest#getName()
	 * @see #getChangeRequest()
	 * @generated
	 */
	public EAttribute getChangeRequest_Name() {
		return (EAttribute) changeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link base.autonomic.ChangeRequest#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Based On</em>'.
	 * @see base.autonomic.ChangeRequest#getBasedOn()
	 * @see #getChangeRequest()
	 * @generated
	 */
	public EReference getChangeRequest_BasedOn() {
		return (EReference) changeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.autonomic.ChangePlan <em>Change Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Plan</em>'.
	 * @see base.autonomic.ChangePlan
	 * @generated
	 */
	public EClass getChangePlan() {
		return changePlanEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.autonomic.ChangePlan#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Based On</em>'.
	 * @see base.autonomic.ChangePlan#getBasedOn()
	 * @see #getChangePlan()
	 * @generated
	 */
	public EReference getChangePlan_BasedOn() {
		return (EReference) changePlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.autonomic.ChangePlan#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see base.autonomic.ChangePlan#getAction()
	 * @see #getChangePlan()
	 * @generated
	 */
	public EReference getChangePlan_Action() {
		return (EReference) changePlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.autonomic.ChangePlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.autonomic.ChangePlan#getName()
	 * @see #getChangePlan()
	 * @generated
	 */
	public EAttribute getChangePlan_Name() {
		return (EAttribute) changePlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AutonomicFactory getAutonomicFactory() {
		return (AutonomicFactory) getEFactoryInstance();
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
		symptomEClass = createEClass(SYMPTOM);
		createEAttribute(symptomEClass, SYMPTOM__NAME);
		createEReference(symptomEClass, SYMPTOM__BINDINGS);
		createEReference(symptomEClass, SYMPTOM__CONDITIONS);

		changeRequestEClass = createEClass(CHANGE_REQUEST);
		createEAttribute(changeRequestEClass, CHANGE_REQUEST__NAME);
		createEReference(changeRequestEClass, CHANGE_REQUEST__BASED_ON);

		changePlanEClass = createEClass(CHANGE_PLAN);
		createEReference(changePlanEClass, CHANGE_PLAN__BASED_ON);
		createEReference(changePlanEClass, CHANGE_PLAN__ACTION);
		createEAttribute(changePlanEClass, CHANGE_PLAN__NAME);
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
		initEClass(symptomEClass, Symptom.class, "Symptom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymptom_Name(), ecorePackage.getEString(), "name", null, 1, 1, Symptom.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymptom_Bindings(), theCommonPackage.getBinding(), null, "bindings", null, 1, -1,
				Symptom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymptom_Conditions(), theCommonPackage.getCondition(), null, "conditions", null, 1, -1,
				Symptom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRequestEClass, ChangeRequest.class, "ChangeRequest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeRequest_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChangeRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeRequest_BasedOn(), this.getSymptom(), null, "basedOn", null, 1, 1, ChangeRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePlanEClass, ChangePlan.class, "ChangePlan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePlan_BasedOn(), this.getChangeRequest(), null, "basedOn", null, 1, 1, ChangePlan.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePlan_Action(), theCommonPackage.getActionExecution(), null, "action", null, 1, 1,
				ChangePlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePlan_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChangePlan.class,
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
		 * The meta object literal for the '{@link base.autonomic.impl.SymptomImpl <em>Symptom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.autonomic.impl.SymptomImpl
		 * @see base.autonomic.impl.AutonomicPackageImpl#getSymptom()
		 * @generated
		 */
		public static final EClass SYMPTOM = eINSTANCE.getSymptom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYMPTOM__NAME = eINSTANCE.getSymptom_Name();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYMPTOM__BINDINGS = eINSTANCE.getSymptom_Bindings();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYMPTOM__CONDITIONS = eINSTANCE.getSymptom_Conditions();

		/**
		 * The meta object literal for the '{@link base.autonomic.impl.ChangeRequestImpl <em>Change Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.autonomic.impl.ChangeRequestImpl
		 * @see base.autonomic.impl.AutonomicPackageImpl#getChangeRequest()
		 * @generated
		 */
		public static final EClass CHANGE_REQUEST = eINSTANCE.getChangeRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHANGE_REQUEST__NAME = eINSTANCE.getChangeRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_REQUEST__BASED_ON = eINSTANCE.getChangeRequest_BasedOn();

		/**
		 * The meta object literal for the '{@link base.autonomic.impl.ChangePlanImpl <em>Change Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.autonomic.impl.ChangePlanImpl
		 * @see base.autonomic.impl.AutonomicPackageImpl#getChangePlan()
		 * @generated
		 */
		public static final EClass CHANGE_PLAN = eINSTANCE.getChangePlan();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_PLAN__BASED_ON = eINSTANCE.getChangePlan_BasedOn();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_PLAN__ACTION = eINSTANCE.getChangePlan_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHANGE_PLAN__NAME = eINSTANCE.getChangePlan_Name();

	}

} //AutonomicPackageImpl
