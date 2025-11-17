/**
 */
package adapter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see adapter.AdapterFactory
 * @model kind="package"
 * @generated
 */
public interface AdapterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adapter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/broker/adapter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adapter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdapterPackage eINSTANCE = adapter.impl.AdapterPackageImpl.init();

	/**
	 * The meta object id for the '{@link adapter.impl.AdapterImpl <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.AdapterImpl
	 * @see adapter.impl.AdapterPackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__MAPPER = 2;

	/**
	 * The feature id for the '<em><b>Dispatcher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__DISPATCHER = 3;

	/**
	 * The feature id for the '<em><b>Domain Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__DOMAIN_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Platform Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__PLATFORM_ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.MapperImpl <em>Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.MapperImpl
	 * @see adapter.impl.AdapterPackageImpl#getMapper()
	 * @generated
	 */
	int MAPPER = 1;

	/**
	 * The feature id for the '<em><b>Components Related</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__COMPONENTS_RELATED = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.FunctionImpl
	 * @see adapter.impl.AdapterPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMS = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.DispatcherImpl <em>Dispatcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.DispatcherImpl
	 * @see adapter.impl.AdapterPackageImpl#getDispatcher()
	 * @generated
	 */
	int DISPATCHER = 3;

	/**
	 * The feature id for the '<em><b>Comm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHER__COMM = 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHER__CMD = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHER__FUNCTION = 2;

	/**
	 * The number of structural features of the '<em>Dispatcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dispatcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.ComponentsImpl
	 * @see adapter.impl.AdapterPackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__ID = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link adapter.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see adapter.Adapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for the attribute '{@link adapter.Adapter#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see adapter.Adapter#getPlatform()
	 * @see #getAdapter()
	 * @generated
	 */
	EAttribute getAdapter_Platform();

	/**
	 * Returns the meta object for the attribute '{@link adapter.Adapter#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see adapter.Adapter#getDomain()
	 * @see #getAdapter()
	 * @generated
	 */
	EAttribute getAdapter_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link adapter.Adapter#getMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapper</em>'.
	 * @see adapter.Adapter#getMapper()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Mapper();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.Adapter#getDispatcher <em>Dispatcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispatcher</em>'.
	 * @see adapter.Adapter#getDispatcher()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_Dispatcher();

	/**
	 * Returns the meta object for the containment reference '{@link adapter.Adapter#getDomainElements <em>Domain Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Elements</em>'.
	 * @see adapter.Adapter#getDomainElements()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_DomainElements();

	/**
	 * Returns the meta object for the containment reference '{@link adapter.Adapter#getPlatformElements <em>Platform Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform Elements</em>'.
	 * @see adapter.Adapter#getPlatformElements()
	 * @see #getAdapter()
	 * @generated
	 */
	EReference getAdapter_PlatformElements();

	/**
	 * Returns the meta object for class '{@link adapter.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapper</em>'.
	 * @see adapter.Mapper
	 * @generated
	 */
	EClass getMapper();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.Mapper#getComponentsRelated <em>Components Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components Related</em>'.
	 * @see adapter.Mapper#getComponentsRelated()
	 * @see #getMapper()
	 * @generated
	 */
	EReference getMapper_ComponentsRelated();

	/**
	 * Returns the meta object for the containment reference '{@link adapter.Mapper#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see adapter.Mapper#getFunction()
	 * @see #getMapper()
	 * @generated
	 */
	EReference getMapper_Function();

	/**
	 * Returns the meta object for class '{@link adapter.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see adapter.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link adapter.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adapter.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link adapter.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see adapter.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Body();

	/**
	 * Returns the meta object for the attribute list '{@link adapter.Function#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Params</em>'.
	 * @see adapter.Function#getParams()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Params();

	/**
	 * Returns the meta object for class '{@link adapter.Dispatcher <em>Dispatcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatcher</em>'.
	 * @see adapter.Dispatcher
	 * @generated
	 */
	EClass getDispatcher();

	/**
	 * Returns the meta object for the reference list '{@link adapter.Dispatcher#getComm <em>Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comm</em>'.
	 * @see adapter.Dispatcher#getComm()
	 * @see #getDispatcher()
	 * @generated
	 */
	EReference getDispatcher_Comm();

	/**
	 * Returns the meta object for the reference list '{@link adapter.Dispatcher#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cmd</em>'.
	 * @see adapter.Dispatcher#getCmd()
	 * @see #getDispatcher()
	 * @generated
	 */
	EReference getDispatcher_Cmd();

	/**
	 * Returns the meta object for the containment reference '{@link adapter.Dispatcher#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see adapter.Dispatcher#getFunction()
	 * @see #getDispatcher()
	 * @generated
	 */
	EReference getDispatcher_Function();

	/**
	 * Returns the meta object for class '{@link adapter.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see adapter.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the attribute '{@link adapter.Components#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see adapter.Components#getId()
	 * @see #getComponents()
	 * @generated
	 */
	EAttribute getComponents_Id();

	/**
	 * Returns the meta object for the reference '{@link adapter.Components#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see adapter.Components#getResource()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Resource();

	/**
	 * Returns the meta object for the reference '{@link adapter.Components#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see adapter.Components#getEntity()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Entity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdapterFactory getAdapterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link adapter.impl.AdapterImpl <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.AdapterImpl
		 * @see adapter.impl.AdapterPackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER__PLATFORM = eINSTANCE.getAdapter_Platform();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER__DOMAIN = eINSTANCE.getAdapter_Domain();

		/**
		 * The meta object literal for the '<em><b>Mapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__MAPPER = eINSTANCE.getAdapter_Mapper();

		/**
		 * The meta object literal for the '<em><b>Dispatcher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__DISPATCHER = eINSTANCE.getAdapter_Dispatcher();

		/**
		 * The meta object literal for the '<em><b>Domain Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__DOMAIN_ELEMENTS = eINSTANCE.getAdapter_DomainElements();

		/**
		 * The meta object literal for the '<em><b>Platform Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER__PLATFORM_ELEMENTS = eINSTANCE.getAdapter_PlatformElements();

		/**
		 * The meta object literal for the '{@link adapter.impl.MapperImpl <em>Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.MapperImpl
		 * @see adapter.impl.AdapterPackageImpl#getMapper()
		 * @generated
		 */
		EClass MAPPER = eINSTANCE.getMapper();

		/**
		 * The meta object literal for the '<em><b>Components Related</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPER__COMPONENTS_RELATED = eINSTANCE.getMapper_ComponentsRelated();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPER__FUNCTION = eINSTANCE.getMapper_Function();

		/**
		 * The meta object literal for the '{@link adapter.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.FunctionImpl
		 * @see adapter.impl.AdapterPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

		/**
		 * The meta object literal for the '{@link adapter.impl.DispatcherImpl <em>Dispatcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.DispatcherImpl
		 * @see adapter.impl.AdapterPackageImpl#getDispatcher()
		 * @generated
		 */
		EClass DISPATCHER = eINSTANCE.getDispatcher();

		/**
		 * The meta object literal for the '<em><b>Comm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCHER__COMM = eINSTANCE.getDispatcher_Comm();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCHER__CMD = eINSTANCE.getDispatcher_Cmd();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCHER__FUNCTION = eINSTANCE.getDispatcher_Function();

		/**
		 * The meta object literal for the '{@link adapter.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.ComponentsImpl
		 * @see adapter.impl.AdapterPackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS__ID = eINSTANCE.getComponents_Id();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__RESOURCE = eINSTANCE.getComponents_Resource();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__ENTITY = eINSTANCE.getComponents_Entity();

	}

} //AdapterPackage
