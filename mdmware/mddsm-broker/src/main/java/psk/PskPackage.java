/**
 */
package psk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see psk.PskFactory
 * @model kind="package"
 * @generated
 */
public interface PskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/broker/psk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PskPackage eINSTANCE = psk.impl.PskPackageImpl.init();

	/**
	 * The meta object id for the '{@link psk.impl.PskImpl <em>Psk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.PskImpl
	 * @see psk.impl.PskPackageImpl#getPsk()
	 * @generated
	 */
	int PSK = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK__RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Comm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK__COMM = 3;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK__CMD = 4;

	/**
	 * The number of structural features of the '<em>Psk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Psk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psk.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.CommunicationImpl
	 * @see psk.impl.PskPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__API = 0;

	/**
	 * The feature id for the '<em><b>Data Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__DATA_SUPPORTED = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psk.impl.PSResourceImpl <em>PS Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.PSResourceImpl
	 * @see psk.impl.PskPackageImpl#getPSResource()
	 * @generated
	 */
	int PS_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__UUID = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Arrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__ARRANGE = 3;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__COMPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Primitive Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE__PRIMITIVE_RESOURCE = 5;

	/**
	 * The number of structural features of the '<em>PS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PS_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psk.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.ComponentImpl
	 * @see psk.impl.PskPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psk.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.CommandImpl
	 * @see psk.impl.PskPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DATA = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psk.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.SensorImpl
	 * @see psk.impl.PskPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = PS_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UUID = PS_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARAMETERS = PS_RESOURCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Arrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ARRANGE = PS_RESOURCE__ARRANGE;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COMPOSITION = PS_RESOURCE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Primitive Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PRIMITIVE_RESOURCE = PS_RESOURCE__PRIMITIVE_RESOURCE;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = PS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = PS_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psk.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.ActuatorImpl
	 * @see psk.impl.PskPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = PS_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__UUID = PS_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PARAMETERS = PS_RESOURCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Arrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ARRANGE = PS_RESOURCE__ARRANGE;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMPOSITION = PS_RESOURCE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Primitive Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PRIMITIVE_RESOURCE = PS_RESOURCE__PRIMITIVE_RESOURCE;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = PS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = PS_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psk.impl.SensingCommandImpl <em>Sensing Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.SensingCommandImpl
	 * @see psk.impl.PskPackageImpl#getSensingCommand()
	 * @generated
	 */
	int SENSING_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_COMMAND__ID = COMMAND__ID;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_COMMAND__PROCEDURE = COMMAND__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_COMMAND__COMPONENT = COMMAND__COMPONENT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_COMMAND__DATA = COMMAND__DATA;

	/**
	 * The number of structural features of the '<em>Sensing Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensing Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psk.impl.ActuationCommandImpl <em>Actuation Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.ActuationCommandImpl
	 * @see psk.impl.PskPackageImpl#getActuationCommand()
	 * @generated
	 */
	int ACTUATION_COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATION_COMMAND__ID = COMMAND__ID;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATION_COMMAND__PROCEDURE = COMMAND__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATION_COMMAND__COMPONENT = COMMAND__COMPONENT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATION_COMMAND__DATA = COMMAND__DATA;

	/**
	 * The number of structural features of the '<em>Actuation Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATION_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuation Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATION_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link psk.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.impl.ParameterImpl
	 * @see psk.impl.PskPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMPOSED = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link psk.CommAPIEnum <em>Comm API Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.CommAPIEnum
	 * @see psk.impl.PskPackageImpl#getCommAPIEnum()
	 * @generated
	 */
	int COMM_API_ENUM = 10;

	/**
	 * The meta object id for the '{@link psk.DataFormatEnum <em>Data Format Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.DataFormatEnum
	 * @see psk.impl.PskPackageImpl#getDataFormatEnum()
	 * @generated
	 */
	int DATA_FORMAT_ENUM = 11;

	/**
	 * The meta object id for the '{@link psk.ArrangementENum <em>Arrangement ENum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.ArrangementENum
	 * @see psk.impl.PskPackageImpl#getArrangementENum()
	 * @generated
	 */
	int ARRANGEMENT_ENUM = 12;

	/**
	 * The meta object id for the '{@link psk.CompositionEnum <em>Composition Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psk.CompositionEnum
	 * @see psk.impl.PskPackageImpl#getCompositionEnum()
	 * @generated
	 */
	int COMPOSITION_ENUM = 13;


	/**
	 * Returns the meta object for class '{@link psk.Psk <em>Psk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Psk</em>'.
	 * @see psk.Psk
	 * @generated
	 */
	EClass getPsk();

	/**
	 * Returns the meta object for the attribute '{@link psk.Psk#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see psk.Psk#getPlatform()
	 * @see #getPsk()
	 * @generated
	 */
	EAttribute getPsk_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.Psk#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see psk.Psk#getComponents()
	 * @see #getPsk()
	 * @generated
	 */
	EReference getPsk_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.Psk#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see psk.Psk#getResource()
	 * @see #getPsk()
	 * @generated
	 */
	EReference getPsk_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.Psk#getComm <em>Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm</em>'.
	 * @see psk.Psk#getComm()
	 * @see #getPsk()
	 * @generated
	 */
	EReference getPsk_Comm();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.Psk#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmd</em>'.
	 * @see psk.Psk#getCmd()
	 * @see #getPsk()
	 * @generated
	 */
	EReference getPsk_Cmd();

	/**
	 * Returns the meta object for class '{@link psk.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see psk.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link psk.Communication#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api</em>'.
	 * @see psk.Communication#getApi()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Api();

	/**
	 * Returns the meta object for the attribute '{@link psk.Communication#getDataSupported <em>Data Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Supported</em>'.
	 * @see psk.Communication#getDataSupported()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_DataSupported();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.Communication#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see psk.Communication#getTarget()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Target();

	/**
	 * Returns the meta object for class '{@link psk.PSResource <em>PS Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PS Resource</em>'.
	 * @see psk.PSResource
	 * @generated
	 */
	EClass getPSResource();

	/**
	 * Returns the meta object for the attribute '{@link psk.PSResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see psk.PSResource#getName()
	 * @see #getPSResource()
	 * @generated
	 */
	EAttribute getPSResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link psk.PSResource#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see psk.PSResource#getUuid()
	 * @see #getPSResource()
	 * @generated
	 */
	EAttribute getPSResource_Uuid();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.PSResource#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see psk.PSResource#getParameters()
	 * @see #getPSResource()
	 * @generated
	 */
	EReference getPSResource_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link psk.PSResource#getArrange <em>Arrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrange</em>'.
	 * @see psk.PSResource#getArrange()
	 * @see #getPSResource()
	 * @generated
	 */
	EAttribute getPSResource_Arrange();

	/**
	 * Returns the meta object for the attribute '{@link psk.PSResource#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition</em>'.
	 * @see psk.PSResource#getComposition()
	 * @see #getPSResource()
	 * @generated
	 */
	EAttribute getPSResource_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.PSResource#getPrimitiveResource <em>Primitive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Resource</em>'.
	 * @see psk.PSResource#getPrimitiveResource()
	 * @see #getPSResource()
	 * @generated
	 */
	EReference getPSResource_PrimitiveResource();

	/**
	 * Returns the meta object for class '{@link psk.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see psk.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link psk.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see psk.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link psk.Component#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see psk.Component#getAddress()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Address();

	/**
	 * Returns the meta object for class '{@link psk.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see psk.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link psk.Command#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see psk.Command#getId()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Id();

	/**
	 * Returns the meta object for the attribute list '{@link psk.Command#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Procedure</em>'.
	 * @see psk.Command#getProcedure()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Procedure();

	/**
	 * Returns the meta object for the reference '{@link psk.Command#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see psk.Command#getComponent()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Component();

	/**
	 * Returns the meta object for the attribute '{@link psk.Command#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see psk.Command#getData()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Data();

	/**
	 * Returns the meta object for class '{@link psk.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see psk.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link psk.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see psk.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link psk.SensingCommand <em>Sensing Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensing Command</em>'.
	 * @see psk.SensingCommand
	 * @generated
	 */
	EClass getSensingCommand();

	/**
	 * Returns the meta object for class '{@link psk.ActuationCommand <em>Actuation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuation Command</em>'.
	 * @see psk.ActuationCommand
	 * @generated
	 */
	EClass getActuationCommand();

	/**
	 * Returns the meta object for class '{@link psk.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see psk.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link psk.Parameter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see psk.Parameter#getAttribute()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link psk.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psk.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link psk.Parameter#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed</em>'.
	 * @see psk.Parameter#getComposed()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Composed();

	/**
	 * Returns the meta object for enum '{@link psk.CommAPIEnum <em>Comm API Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comm API Enum</em>'.
	 * @see psk.CommAPIEnum
	 * @generated
	 */
	EEnum getCommAPIEnum();

	/**
	 * Returns the meta object for enum '{@link psk.DataFormatEnum <em>Data Format Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Format Enum</em>'.
	 * @see psk.DataFormatEnum
	 * @generated
	 */
	EEnum getDataFormatEnum();

	/**
	 * Returns the meta object for enum '{@link psk.ArrangementENum <em>Arrangement ENum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrangement ENum</em>'.
	 * @see psk.ArrangementENum
	 * @generated
	 */
	EEnum getArrangementENum();

	/**
	 * Returns the meta object for enum '{@link psk.CompositionEnum <em>Composition Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Enum</em>'.
	 * @see psk.CompositionEnum
	 * @generated
	 */
	EEnum getCompositionEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PskFactory getPskFactory();

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
		 * The meta object literal for the '{@link psk.impl.PskImpl <em>Psk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.PskImpl
		 * @see psk.impl.PskPackageImpl#getPsk()
		 * @generated
		 */
		EClass PSK = eINSTANCE.getPsk();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSK__PLATFORM = eINSTANCE.getPsk_Platform();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSK__COMPONENTS = eINSTANCE.getPsk_Components();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSK__RESOURCE = eINSTANCE.getPsk_Resource();

		/**
		 * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSK__COMM = eINSTANCE.getPsk_Comm();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSK__CMD = eINSTANCE.getPsk_Cmd();

		/**
		 * The meta object literal for the '{@link psk.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.CommunicationImpl
		 * @see psk.impl.PskPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__API = eINSTANCE.getCommunication_Api();

		/**
		 * The meta object literal for the '<em><b>Data Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__DATA_SUPPORTED = eINSTANCE.getCommunication_DataSupported();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__TARGET = eINSTANCE.getCommunication_Target();

		/**
		 * The meta object literal for the '{@link psk.impl.PSResourceImpl <em>PS Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.PSResourceImpl
		 * @see psk.impl.PskPackageImpl#getPSResource()
		 * @generated
		 */
		EClass PS_RESOURCE = eINSTANCE.getPSResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_RESOURCE__NAME = eINSTANCE.getPSResource_Name();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_RESOURCE__UUID = eINSTANCE.getPSResource_Uuid();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_RESOURCE__PARAMETERS = eINSTANCE.getPSResource_Parameters();

		/**
		 * The meta object literal for the '<em><b>Arrange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_RESOURCE__ARRANGE = eINSTANCE.getPSResource_Arrange();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PS_RESOURCE__COMPOSITION = eINSTANCE.getPSResource_Composition();

		/**
		 * The meta object literal for the '<em><b>Primitive Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PS_RESOURCE__PRIMITIVE_RESOURCE = eINSTANCE.getPSResource_PrimitiveResource();

		/**
		 * The meta object literal for the '{@link psk.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.ComponentImpl
		 * @see psk.impl.PskPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ADDRESS = eINSTANCE.getComponent_Address();

		/**
		 * The meta object literal for the '{@link psk.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.CommandImpl
		 * @see psk.impl.PskPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ID = eINSTANCE.getCommand_Id();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__PROCEDURE = eINSTANCE.getCommand_Procedure();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMPONENT = eINSTANCE.getCommand_Component();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DATA = eINSTANCE.getCommand_Data();

		/**
		 * The meta object literal for the '{@link psk.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.SensorImpl
		 * @see psk.impl.PskPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link psk.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.ActuatorImpl
		 * @see psk.impl.PskPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link psk.impl.SensingCommandImpl <em>Sensing Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.SensingCommandImpl
		 * @see psk.impl.PskPackageImpl#getSensingCommand()
		 * @generated
		 */
		EClass SENSING_COMMAND = eINSTANCE.getSensingCommand();

		/**
		 * The meta object literal for the '{@link psk.impl.ActuationCommandImpl <em>Actuation Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.ActuationCommandImpl
		 * @see psk.impl.PskPackageImpl#getActuationCommand()
		 * @generated
		 */
		EClass ACTUATION_COMMAND = eINSTANCE.getActuationCommand();

		/**
		 * The meta object literal for the '{@link psk.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.impl.ParameterImpl
		 * @see psk.impl.PskPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ATTRIBUTE = eINSTANCE.getParameter_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__COMPOSED = eINSTANCE.getParameter_Composed();

		/**
		 * The meta object literal for the '{@link psk.CommAPIEnum <em>Comm API Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.CommAPIEnum
		 * @see psk.impl.PskPackageImpl#getCommAPIEnum()
		 * @generated
		 */
		EEnum COMM_API_ENUM = eINSTANCE.getCommAPIEnum();

		/**
		 * The meta object literal for the '{@link psk.DataFormatEnum <em>Data Format Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.DataFormatEnum
		 * @see psk.impl.PskPackageImpl#getDataFormatEnum()
		 * @generated
		 */
		EEnum DATA_FORMAT_ENUM = eINSTANCE.getDataFormatEnum();

		/**
		 * The meta object literal for the '{@link psk.ArrangementENum <em>Arrangement ENum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.ArrangementENum
		 * @see psk.impl.PskPackageImpl#getArrangementENum()
		 * @generated
		 */
		EEnum ARRANGEMENT_ENUM = eINSTANCE.getArrangementENum();

		/**
		 * The meta object literal for the '{@link psk.CompositionEnum <em>Composition Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psk.CompositionEnum
		 * @see psk.impl.PskPackageImpl#getCompositionEnum()
		 * @generated
		 */
		EEnum COMPOSITION_ENUM = eINSTANCE.getCompositionEnum();

	}

} //PskPackage
