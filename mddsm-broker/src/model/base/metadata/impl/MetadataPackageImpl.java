/**
 */
package base.metadata.impl;

import base.autonomic.impl.AutonomicPackageImpl;

import base.common.impl.CommonPackageImpl;

import base.context.impl.ContextPackageImpl;

import base.impl.BasePackageImpl;

import base.metadata.Annotable;
import base.metadata.Attribute;
import base.metadata.Feature;
import base.metadata.MetadataFactory;

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
 * @see base.metadata.MetadataFactory
 * @generated
 */
public class MetadataPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "metadata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.inf.ufg.br/mestrado/sb/base/metadata";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sb.base.metadata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetadataPackageImpl eINSTANCE = base.metadata.impl.MetadataPackageImpl.init();

	/**
	 * The meta object id for the '{@link base.metadata.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.metadata.impl.FeatureImpl
	 * @see base.metadata.impl.MetadataPackageImpl#getFeature()
	 * @generated
	 */
	public static final int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE__SUB_FEATURES = 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.metadata.Annotable <em>Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.metadata.Annotable
	 * @see base.metadata.impl.MetadataPackageImpl#getAnnotable()
	 * @generated
	 */
	public static final int ANNOTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTABLE__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link base.metadata.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.metadata.impl.AttributeImpl
	 * @see base.metadata.impl.MetadataPackageImpl#getAttribute()
	 * @generated
	 */
	public static final int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

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
	 * @see base.metadata.impl.MetadataPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetadataPackageImpl() {
		super(eNS_URI, ((EFactory) MetadataFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link MetadataPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetadataPackageImpl init() {
		if (isInited)
			return (MetadataPackageImpl) EPackage.Registry.INSTANCE.getEPackage(MetadataPackageImpl.eNS_URI);

		// Obtain or create and register package
		Object registeredMetadataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetadataPackageImpl theMetadataPackage = registeredMetadataPackage instanceof MetadataPackageImpl
				? (MetadataPackageImpl) registeredMetadataPackage
				: new MetadataPackageImpl();

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
		theMetadataPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theAutonomicPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theMetadataPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theAutonomicPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetadataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetadataPackageImpl.eNS_URI, theMetadataPackage);
		return theMetadataPackage;
	}

	/**
	 * Returns the meta object for class '{@link base.metadata.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see base.metadata.Feature
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.metadata.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.metadata.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.metadata.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see base.metadata.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	public EReference getFeature_Attributes() {
		return (EReference) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.metadata.Feature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Features</em>'.
	 * @see base.metadata.Feature#getSubFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	public EReference getFeature_SubFeatures() {
		return (EReference) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.metadata.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable</em>'.
	 * @see base.metadata.Annotable
	 * @generated
	 */
	public EClass getAnnotable() {
		return annotableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.metadata.Annotable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.metadata.Annotable#getName()
	 * @see #getAnnotable()
	 * @generated
	 */
	public EAttribute getAnnotable_Name() {
		return (EAttribute) annotableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.metadata.Annotable#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see base.metadata.Annotable#getFeatures()
	 * @see #getAnnotable()
	 * @generated
	 */
	public EReference getAnnotable_Features() {
		return (EReference) annotableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.metadata.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see base.metadata.Attribute
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.metadata.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.metadata.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.metadata.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see base.metadata.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public MetadataFactory getMetadataFactory() {
		return (MetadataFactory) getEFactoryInstance();
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
		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__ATTRIBUTES);
		createEReference(featureEClass, FEATURE__SUB_FEATURES);

		annotableEClass = createEClass(ANNOTABLE);
		createEAttribute(annotableEClass, ANNOTABLE__NAME);
		createEReference(annotableEClass, ANNOTABLE__FEATURES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 1, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_SubFeatures(), this.getFeature(), null, "subFeatures", null, 0, -1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotableEClass, Annotable.class, "Annotable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Annotable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotable_Features(), this.getFeature(), null, "features", null, 0, -1, Annotable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class,
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
		 * The meta object literal for the '{@link base.metadata.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.metadata.impl.FeatureImpl
		 * @see base.metadata.impl.MetadataPackageImpl#getFeature()
		 * @generated
		 */
		public static final EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '<em><b>Sub Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FEATURE__SUB_FEATURES = eINSTANCE.getFeature_SubFeatures();

		/**
		 * The meta object literal for the '{@link base.metadata.Annotable <em>Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.metadata.Annotable
		 * @see base.metadata.impl.MetadataPackageImpl#getAnnotable()
		 * @generated
		 */
		public static final EClass ANNOTABLE = eINSTANCE.getAnnotable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANNOTABLE__NAME = eINSTANCE.getAnnotable_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANNOTABLE__FEATURES = eINSTANCE.getAnnotable_Features();

		/**
		 * The meta object literal for the '{@link base.metadata.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.metadata.impl.AttributeImpl
		 * @see base.metadata.impl.MetadataPackageImpl#getAttribute()
		 * @generated
		 */
		public static final EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

	}

} //MetadataPackageImpl
