/**
 */
package adapter.platform;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import psk.PskPackage;

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
 * @see adapter.platform.PlatformFactory
 * @model kind="package"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/broker/adapter/platform";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = adapter.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link adapter.platform.impl.PlatformElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.platform.impl.PlatformElementsImpl
	 * @see adapter.platform.impl.PlatformPackageImpl#getPlatformElements()
	 * @generated
	 */
	int PLATFORM_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENTS__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Comm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENTS__COMM = 1;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENTS__CMD = 2;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENTS__COMP = 3;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.platform.impl.PSCommImpl <em>PS Comm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.platform.impl.PSCommImpl
	 * @see adapter.platform.impl.PlatformPackageImpl#getPSComm()
	 * @generated
	 */
	int PS_COMM = 1;

	/**
	 * The feature id for the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMM__API = PskPackage.COMMUNICATION__API;

	/**
	 * The feature id for the '<em><b>Data Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMM__DATA_SUPPORTED = PskPackage.COMMUNICATION__DATA_SUPPORTED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMM__TARGET = PskPackage.COMMUNICATION__TARGET;

	/**
	 * The number of structural features of the '<em>PS Comm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMM_FEATURE_COUNT = PskPackage.COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PS Comm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMM_OPERATION_COUNT = PskPackage.COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adapter.platform.impl.PSCmdImpl <em>PS Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.platform.impl.PSCmdImpl
	 * @see adapter.platform.impl.PlatformPackageImpl#getPSCmd()
	 * @generated
	 */
	int PS_CMD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CMD__ID = PskPackage.COMMAND__ID;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CMD__PROCEDURE = PskPackage.COMMAND__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CMD__COMPONENT = PskPackage.COMMAND__COMPONENT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CMD__DATA = PskPackage.COMMAND__DATA;

	/**
	 * The number of structural features of the '<em>PS Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CMD_FEATURE_COUNT = PskPackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PS Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_CMD_OPERATION_COUNT = PskPackage.COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adapter.platform.impl.PSResourceImpl <em>PS Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.platform.impl.PSResourceImpl
	 * @see adapter.platform.impl.PlatformPackageImpl#getPSResource()
	 * @generated
	 */
	int PS_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__NAME = PskPackage.PS_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__UUID = PskPackage.PS_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__PARAMETERS = PskPackage.PS_RESOURCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Arrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__ARRANGE = PskPackage.PS_RESOURCE__ARRANGE;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__COMPOSITION = PskPackage.PS_RESOURCE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Primitive Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__PRIMITIVE_RESOURCE = PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE;

	/**
	 * The number of structural features of the '<em>PS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE_FEATURE_COUNT = PskPackage.PS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE_OPERATION_COUNT = PskPackage.PS_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adapter.platform.impl.PSComponentImpl <em>PS Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.platform.impl.PSComponentImpl
	 * @see adapter.platform.impl.PlatformPackageImpl#getPSComponent()
	 * @generated
	 */
	int PS_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMPONENT__NAME = PskPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMPONENT__ADDRESS = PskPackage.COMPONENT__ADDRESS;

	/**
	 * The number of structural features of the '<em>PS Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMPONENT_FEATURE_COUNT = PskPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PS Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_COMPONENT_OPERATION_COUNT = PskPackage.COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link adapter.platform.PlatformElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see adapter.platform.PlatformElements
	 * @generated
	 */
	EClass getPlatformElements();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.platform.PlatformElements#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see adapter.platform.PlatformElements#getResources()
	 * @see #getPlatformElements()
	 * @generated
	 */
	EReference getPlatformElements_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.platform.PlatformElements#getComm <em>Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm</em>'.
	 * @see adapter.platform.PlatformElements#getComm()
	 * @see #getPlatformElements()
	 * @generated
	 */
	EReference getPlatformElements_Comm();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.platform.PlatformElements#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmd</em>'.
	 * @see adapter.platform.PlatformElements#getCmd()
	 * @see #getPlatformElements()
	 * @generated
	 */
	EReference getPlatformElements_Cmd();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.platform.PlatformElements#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comp</em>'.
	 * @see adapter.platform.PlatformElements#getComp()
	 * @see #getPlatformElements()
	 * @generated
	 */
	EReference getPlatformElements_Comp();

	/**
	 * Returns the meta object for class '{@link adapter.platform.PSComm <em>PS Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Comm</em>'.
	 * @see adapter.platform.PSComm
	 * @generated
	 */
	EClass getPSComm();

	/**
	 * Returns the meta object for class '{@link adapter.platform.PSCmd <em>PS Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Cmd</em>'.
	 * @see adapter.platform.PSCmd
	 * @generated
	 */
	EClass getPSCmd();

	/**
	 * Returns the meta object for class '{@link adapter.platform.PSResource <em>PS Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Resource</em>'.
	 * @see adapter.platform.PSResource
	 * @generated
	 */
	EClass getPSResource();

	/**
	 * Returns the meta object for class '{@link adapter.platform.PSComponent <em>PS Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Component</em>'.
	 * @see adapter.platform.PSComponent
	 * @generated
	 */
	EClass getPSComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

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
		 * The meta object literal for the '{@link adapter.platform.impl.PlatformElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.platform.impl.PlatformElementsImpl
		 * @see adapter.platform.impl.PlatformPackageImpl#getPlatformElements()
		 * @generated
		 */
		EClass PLATFORM_ELEMENTS = eINSTANCE.getPlatformElements();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_ELEMENTS__RESOURCES = eINSTANCE.getPlatformElements_Resources();

		/**
		 * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_ELEMENTS__COMM = eINSTANCE.getPlatformElements_Comm();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_ELEMENTS__CMD = eINSTANCE.getPlatformElements_Cmd();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_ELEMENTS__COMP = eINSTANCE.getPlatformElements_Comp();

		/**
		 * The meta object literal for the '{@link adapter.platform.impl.PSCommImpl <em>PS Comm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.platform.impl.PSCommImpl
		 * @see adapter.platform.impl.PlatformPackageImpl#getPSComm()
		 * @generated
		 */
		EClass PS_COMM = eINSTANCE.getPSComm();

		/**
		 * The meta object literal for the '{@link adapter.platform.impl.PSCmdImpl <em>PS Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.platform.impl.PSCmdImpl
		 * @see adapter.platform.impl.PlatformPackageImpl#getPSCmd()
		 * @generated
		 */
		EClass PS_CMD = eINSTANCE.getPSCmd();

		/**
		 * The meta object literal for the '{@link adapter.platform.impl.PSResourceImpl <em>PS Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.platform.impl.PSResourceImpl
		 * @see adapter.platform.impl.PlatformPackageImpl#getPSResource()
		 * @generated
		 */
		EClass PS_RESOURCE = eINSTANCE.getPSResource();

		/**
		 * The meta object literal for the '{@link adapter.platform.impl.PSComponentImpl <em>PS Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.platform.impl.PSComponentImpl
		 * @see adapter.platform.impl.PlatformPackageImpl#getPSComponent()
		 * @generated
		 */
		EClass PS_COMPONENT = eINSTANCE.getPSComponent();

	}

} //PlatformPackage
