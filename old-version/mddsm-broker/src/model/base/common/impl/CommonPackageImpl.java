/**
 */
package base.common.impl;

import base.autonomic.impl.AutonomicPackageImpl;

import base.common.Action;
import base.common.ActionExecution;
import base.common.Bindable;
import base.common.Binding;
import base.common.Call;
import base.common.CommonFactory;
import base.common.Condition;
import base.common.EnqueueCall;
import base.common.Event;
import base.common.ExpressionValue;
import base.common.Interface;
import base.common.MacroAction;
import base.common.Parameter;
import base.common.ParameterBinding;
import base.common.ParameterValue;
import base.common.SequenceAction;
import base.common.Signal;
import base.common.SignalSource;
import base.common.Value;

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
 * @see base.common.CommonFactory
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.inf.ufg.br/mestrado/sb/base/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sb.base.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonPackageImpl eINSTANCE = base.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link base.common.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ParameterImpl
	 * @see base.common.impl.CommonPackageImpl#getParameter()
	 * @generated
	 */
	public static final int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link base.common.Bindable <em>Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.Bindable
	 * @see base.common.impl.CommonPackageImpl#getBindable()
	 * @generated
	 */
	public static final int BINDABLE = 17;

	/**
	 * The number of structural features of the '<em>Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.common.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.SignalImpl
	 * @see base.common.impl.CommonPackageImpl#getSignal()
	 * @generated
	 */
	public static final int SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL__PARAMETERS = BINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL__NAME = BINDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_FEATURE_COUNT = BINDABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link base.common.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.EventImpl
	 * @see base.common.impl.CommonPackageImpl#getEvent()
	 * @generated
	 */
	public static final int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EVENT__PARAMETERS = SIGNAL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EVENT__NAME = SIGNAL__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.common.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.CallImpl
	 * @see base.common.impl.CommonPackageImpl#getCall()
	 * @generated
	 */
	public static final int CALL = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL__PARAMETERS = SIGNAL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL__NAME = SIGNAL__NAME;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.common.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.InterfaceImpl
	 * @see base.common.impl.CommonPackageImpl#getInterface()
	 * @generated
	 */
	public static final int INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE__PROVIDES = 0;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE__SIGNALS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link base.common.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ValueImpl
	 * @see base.common.impl.CommonPackageImpl#getValue()
	 * @generated
	 */
	public static final int VALUE = 5;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.common.impl.SignalSourceImpl <em>Signal Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.SignalSourceImpl
	 * @see base.common.impl.CommonPackageImpl#getSignalSource()
	 * @generated
	 */
	public static final int SIGNAL_SOURCE = 6;

	/**
	 * The number of structural features of the '<em>Signal Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_SOURCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.common.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ParameterValueImpl
	 * @see base.common.impl.CommonPackageImpl#getParameterValue()
	 * @generated
	 */
	public static final int PARAMETER_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE__PARAMETER = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link base.common.impl.ExpressionValueImpl <em>Expression Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ExpressionValueImpl
	 * @see base.common.impl.CommonPackageImpl#getExpressionValue()
	 * @generated
	 */
	public static final int EXPRESSION_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link base.common.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ActionImpl
	 * @see base.common.impl.CommonPackageImpl#getAction()
	 * @generated
	 */
	public static final int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link base.common.impl.SequenceActionImpl <em>Sequence Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.SequenceActionImpl
	 * @see base.common.impl.CommonPackageImpl#getSequenceAction()
	 * @generated
	 */
	public static final int SEQUENCE_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_ACTION__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_ACTION__CHILDREN = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link base.common.impl.EnqueueCallImpl <em>Enqueue Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.EnqueueCallImpl
	 * @see base.common.impl.CommonPackageImpl#getEnqueueCall()
	 * @generated
	 */
	public static final int ENQUEUE_CALL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUE_CALL__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUE_CALL__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUE_CALL__CALL = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUE_CALL__BINDINGS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enqueue Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUE_CALL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link base.common.impl.MacroActionImpl <em>Macro Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.MacroActionImpl
	 * @see base.common.impl.CommonPackageImpl#getMacroAction()
	 * @generated
	 */
	public static final int MACRO_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MACRO_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MACRO_ACTION__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MACRO_ACTION__IMPL = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macro Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MACRO_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link base.common.impl.ActionExecutionImpl <em>Action Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ActionExecutionImpl
	 * @see base.common.impl.CommonPackageImpl#getActionExecution()
	 * @generated
	 */
	public static final int ACTION_EXECUTION = 13;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_EXECUTION__ACTION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_EXECUTION__BINDINGS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_EXECUTION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link base.common.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ParameterBindingImpl
	 * @see base.common.impl.CommonPackageImpl#getParameterBinding()
	 * @generated
	 */
	public static final int PARAMETER_BINDING = 14;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_BINDING__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_BINDING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link base.common.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.ConditionImpl
	 * @see base.common.impl.CommonPackageImpl#getCondition()
	 * @generated
	 */
	public static final int CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link base.common.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.common.impl.BindingImpl
	 * @see base.common.impl.CommonPackageImpl#getBinding()
	 * @generated
	 */
	public static final int BINDING = 16;

	/**
	 * The feature id for the '<em><b>Bindable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING__BINDABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING__NAME = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINDING_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enqueueCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindableEClass = null;

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
	 * @see base.common.impl.CommonPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, ((EFactory) CommonFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link CommonPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackageImpl init() {
		if (isInited)
			return (CommonPackageImpl) EPackage.Registry.INSTANCE.getEPackage(CommonPackageImpl.eNS_URI);

		// Obtain or create and register package
		Object registeredCommonPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommonPackageImpl theCommonPackage = registeredCommonPackage instanceof CommonPackageImpl
				? (CommonPackageImpl) registeredCommonPackage
				: new CommonPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AutonomicPackageImpl.eNS_URI);
		AutonomicPackageImpl theAutonomicPackage = (AutonomicPackageImpl) (registeredPackage instanceof AutonomicPackageImpl
				? registeredPackage
				: AutonomicPackageImpl.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackageImpl.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theCommonPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theAutonomicPackage.createPackageContents();
		thePolicyPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theAutonomicPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackageImpl.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * Returns the meta object for class '{@link base.common.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see base.common.Parameter
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.common.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see base.common.Signal
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.Signal#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see base.common.Signal#getParameters()
	 * @see #getSignal()
	 * @generated
	 */
	public EReference getSignal_Parameters() {
		return (EReference) signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.common.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	public EAttribute getSignal_Name() {
		return (EAttribute) signalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see base.common.Event
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * Returns the meta object for class '{@link base.common.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see base.common.Call
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * Returns the meta object for class '{@link base.common.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see base.common.Interface
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.Interface#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see base.common.Interface#getProvides()
	 * @see #getInterface()
	 * @generated
	 */
	public EReference getInterface_Provides() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.Interface#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see base.common.Interface#getSignals()
	 * @see #getInterface()
	 * @generated
	 */
	public EReference getInterface_Signals() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.common.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	public EAttribute getInterface_Name() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see base.common.Value
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * Returns the meta object for class '{@link base.common.SignalSource <em>Signal Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Source</em>'.
	 * @see base.common.SignalSource
	 * @generated
	 */
	public EClass getSignalSource() {
		return signalSourceEClass;
	}

	/**
	 * Returns the meta object for class '{@link base.common.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see base.common.ParameterValue
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.common.ParameterValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see base.common.ParameterValue#getParameter()
	 * @see #getParameterValue()
	 * @generated
	 */
	public EReference getParameterValue_Parameter() {
		return (EReference) parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.common.ExpressionValue <em>Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Value</em>'.
	 * @see base.common.ExpressionValue
	 * @generated
	 */
	public EClass getExpressionValue() {
		return expressionValueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.ExpressionValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see base.common.ExpressionValue#getValue()
	 * @see #getExpressionValue()
	 * @generated
	 */
	public EAttribute getExpressionValue_Value() {
		return (EAttribute) expressionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see base.common.Action
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.common.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see base.common.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	public EReference getAction_Parameters() {
		return (EReference) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.common.SequenceAction <em>Sequence Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Action</em>'.
	 * @see base.common.SequenceAction
	 * @generated
	 */
	public EClass getSequenceAction() {
		return sequenceActionEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.SequenceAction#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see base.common.SequenceAction#getChildren()
	 * @see #getSequenceAction()
	 * @generated
	 */
	public EReference getSequenceAction_Children() {
		return (EReference) sequenceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.common.EnqueueCall <em>Enqueue Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enqueue Call</em>'.
	 * @see base.common.EnqueueCall
	 * @generated
	 */
	public EClass getEnqueueCall() {
		return enqueueCallEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.common.EnqueueCall#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call</em>'.
	 * @see base.common.EnqueueCall#getCall()
	 * @see #getEnqueueCall()
	 * @generated
	 */
	public EReference getEnqueueCall_Call() {
		return (EReference) enqueueCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.EnqueueCall#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see base.common.EnqueueCall#getBindings()
	 * @see #getEnqueueCall()
	 * @generated
	 */
	public EReference getEnqueueCall_Bindings() {
		return (EReference) enqueueCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.common.MacroAction <em>Macro Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Action</em>'.
	 * @see base.common.MacroAction
	 * @generated
	 */
	public EClass getMacroAction() {
		return macroActionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.MacroAction#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see base.common.MacroAction#getImpl()
	 * @see #getMacroAction()
	 * @generated
	 */
	public EAttribute getMacroAction_Impl() {
		return (EAttribute) macroActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.common.ActionExecution <em>Action Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Execution</em>'.
	 * @see base.common.ActionExecution
	 * @generated
	 */
	public EClass getActionExecution() {
		return actionExecutionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.common.ActionExecution#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see base.common.ActionExecution#getAction()
	 * @see #getActionExecution()
	 * @generated
	 */
	public EReference getActionExecution_Action() {
		return (EReference) actionExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link base.common.ActionExecution#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see base.common.ActionExecution#getBindings()
	 * @see #getActionExecution()
	 * @generated
	 */
	public EReference getActionExecution_Bindings() {
		return (EReference) actionExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.common.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see base.common.ParameterBinding
	 * @generated
	 */
	public EClass getParameterBinding() {
		return parameterBindingEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.common.ParameterBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see base.common.ParameterBinding#getParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	public EReference getParameterBinding_Parameter() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link base.common.ParameterBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see base.common.ParameterBinding#getValue()
	 * @see #getParameterBinding()
	 * @generated
	 */
	public EReference getParameterBinding_Value() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see base.common.Condition
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see base.common.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	public EAttribute getCondition_Expression() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see base.common.Binding
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link base.common.Binding#getBindable <em>Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable</em>'.
	 * @see base.common.Binding#getBindable()
	 * @see #getBinding()
	 * @generated
	 */
	public EReference getBinding_Bindable() {
		return (EReference) bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link base.common.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see base.common.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	public EAttribute getBinding_Name() {
		return (EAttribute) bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link base.common.Bindable <em>Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindable</em>'.
	 * @see base.common.Bindable
	 * @generated
	 */
	public EClass getBindable() {
		return bindableEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory) getEFactoryInstance();
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
		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__PARAMETERS);
		createEAttribute(signalEClass, SIGNAL__NAME);

		eventEClass = createEClass(EVENT);

		callEClass = createEClass(CALL);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PROVIDES);
		createEReference(interfaceEClass, INTERFACE__SIGNALS);
		createEAttribute(interfaceEClass, INTERFACE__NAME);

		valueEClass = createEClass(VALUE);

		signalSourceEClass = createEClass(SIGNAL_SOURCE);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__PARAMETER);

		expressionValueEClass = createEClass(EXPRESSION_VALUE);
		createEAttribute(expressionValueEClass, EXPRESSION_VALUE__VALUE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEReference(actionEClass, ACTION__PARAMETERS);

		sequenceActionEClass = createEClass(SEQUENCE_ACTION);
		createEReference(sequenceActionEClass, SEQUENCE_ACTION__CHILDREN);

		enqueueCallEClass = createEClass(ENQUEUE_CALL);
		createEReference(enqueueCallEClass, ENQUEUE_CALL__CALL);
		createEReference(enqueueCallEClass, ENQUEUE_CALL__BINDINGS);

		macroActionEClass = createEClass(MACRO_ACTION);
		createEAttribute(macroActionEClass, MACRO_ACTION__IMPL);

		actionExecutionEClass = createEClass(ACTION_EXECUTION);
		createEReference(actionExecutionEClass, ACTION_EXECUTION__ACTION);
		createEReference(actionExecutionEClass, ACTION_EXECUTION__BINDINGS);

		parameterBindingEClass = createEClass(PARAMETER_BINDING);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__PARAMETER);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__VALUE);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__EXPRESSION);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__BINDABLE);
		createEAttribute(bindingEClass, BINDING__NAME);

		bindableEClass = createEClass(BINDABLE);
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
		signalEClass.getESuperTypes().add(this.getBindable());
		eventEClass.getESuperTypes().add(this.getSignal());
		callEClass.getESuperTypes().add(this.getSignal());
		signalSourceEClass.getESuperTypes().add(this.getValue());
		parameterValueEClass.getESuperTypes().add(this.getValue());
		expressionValueEClass.getESuperTypes().add(this.getValue());
		sequenceActionEClass.getESuperTypes().add(this.getAction());
		enqueueCallEClass.getESuperTypes().add(this.getAction());
		macroActionEClass.getESuperTypes().add(this.getAction());
		actionExecutionEClass.getESuperTypes().add(this.getValue());

		// Initialize classes and features; add operations and parameters
		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Signal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignal_Name(), ecorePackage.getEString(), "name", "", 1, 1, Signal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Provides(), this.getCall(), null, "provides", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Signals(), this.getEvent(), null, "signals", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Name(), ecorePackage.getEString(), "Name", "", 0, 1, Interface.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalSourceEClass, SignalSource.class, "SignalSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_Parameter(), this.getParameter(), null, "parameter", null, 1, 1,
				ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionValueEClass, ExpressionValue.class, "ExpressionValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionValue_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				ExpressionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", "", 1, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceActionEClass, SequenceAction.class, "SequenceAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceAction_Children(), this.getActionExecution(), null, "children", null, 1, -1,
				SequenceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enqueueCallEClass, EnqueueCall.class, "EnqueueCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnqueueCall_Call(), this.getCall(), null, "call", null, 1, 1, EnqueueCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnqueueCall_Bindings(), this.getParameterBinding(), null, "bindings", null, 0, -1,
				EnqueueCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macroActionEClass, MacroAction.class, "MacroAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacroAction_Impl(), ecorePackage.getEString(), "impl", null, 1, 1, MacroAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionExecutionEClass, ActionExecution.class, "ActionExecution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionExecution_Action(), this.getAction(), null, "action", null, 1, 1, ActionExecution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionExecution_Bindings(), this.getParameterBinding(), null, "bindings", null, 0, -1,
				ActionExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBinding_Parameter(), this.getParameter(), null, "parameter", null, 1, 1,
				ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterBinding_Value(), this.getValue(), null, "value", null, 1, 1, ParameterBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Bindable(), this.getBindable(), null, "bindable", null, 1, 1, Binding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Name(), ecorePackage.getEString(), "name", null, 1, 1, Binding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindableEClass, Bindable.class, "Bindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link base.common.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ParameterImpl
		 * @see base.common.impl.CommonPackageImpl#getParameter()
		 * @generated
		 */
		public static final EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link base.common.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.SignalImpl
		 * @see base.common.impl.CommonPackageImpl#getSignal()
		 * @generated
		 */
		public static final EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SIGNAL__PARAMETERS = eINSTANCE.getSignal_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '{@link base.common.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.EventImpl
		 * @see base.common.impl.CommonPackageImpl#getEvent()
		 * @generated
		 */
		public static final EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link base.common.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.CallImpl
		 * @see base.common.impl.CommonPackageImpl#getCall()
		 * @generated
		 */
		public static final EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '{@link base.common.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.InterfaceImpl
		 * @see base.common.impl.CommonPackageImpl#getInterface()
		 * @generated
		 */
		public static final EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERFACE__PROVIDES = eINSTANCE.getInterface_Provides();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERFACE__SIGNALS = eINSTANCE.getInterface_Signals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '{@link base.common.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ValueImpl
		 * @see base.common.impl.CommonPackageImpl#getValue()
		 * @generated
		 */
		public static final EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link base.common.impl.SignalSourceImpl <em>Signal Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.SignalSourceImpl
		 * @see base.common.impl.CommonPackageImpl#getSignalSource()
		 * @generated
		 */
		public static final EClass SIGNAL_SOURCE = eINSTANCE.getSignalSource();

		/**
		 * The meta object literal for the '{@link base.common.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ParameterValueImpl
		 * @see base.common.impl.CommonPackageImpl#getParameterValue()
		 * @generated
		 */
		public static final EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PARAMETER_VALUE__PARAMETER = eINSTANCE.getParameterValue_Parameter();

		/**
		 * The meta object literal for the '{@link base.common.impl.ExpressionValueImpl <em>Expression Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ExpressionValueImpl
		 * @see base.common.impl.CommonPackageImpl#getExpressionValue()
		 * @generated
		 */
		public static final EClass EXPRESSION_VALUE = eINSTANCE.getExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EXPRESSION_VALUE__VALUE = eINSTANCE.getExpressionValue_Value();

		/**
		 * The meta object literal for the '{@link base.common.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ActionImpl
		 * @see base.common.impl.CommonPackageImpl#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '{@link base.common.impl.SequenceActionImpl <em>Sequence Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.SequenceActionImpl
		 * @see base.common.impl.CommonPackageImpl#getSequenceAction()
		 * @generated
		 */
		public static final EClass SEQUENCE_ACTION = eINSTANCE.getSequenceAction();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SEQUENCE_ACTION__CHILDREN = eINSTANCE.getSequenceAction_Children();

		/**
		 * The meta object literal for the '{@link base.common.impl.EnqueueCallImpl <em>Enqueue Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.EnqueueCallImpl
		 * @see base.common.impl.CommonPackageImpl#getEnqueueCall()
		 * @generated
		 */
		public static final EClass ENQUEUE_CALL = eINSTANCE.getEnqueueCall();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENQUEUE_CALL__CALL = eINSTANCE.getEnqueueCall_Call();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENQUEUE_CALL__BINDINGS = eINSTANCE.getEnqueueCall_Bindings();

		/**
		 * The meta object literal for the '{@link base.common.impl.MacroActionImpl <em>Macro Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.MacroActionImpl
		 * @see base.common.impl.CommonPackageImpl#getMacroAction()
		 * @generated
		 */
		public static final EClass MACRO_ACTION = eINSTANCE.getMacroAction();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MACRO_ACTION__IMPL = eINSTANCE.getMacroAction_Impl();

		/**
		 * The meta object literal for the '{@link base.common.impl.ActionExecutionImpl <em>Action Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ActionExecutionImpl
		 * @see base.common.impl.CommonPackageImpl#getActionExecution()
		 * @generated
		 */
		public static final EClass ACTION_EXECUTION = eINSTANCE.getActionExecution();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTION_EXECUTION__ACTION = eINSTANCE.getActionExecution_Action();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTION_EXECUTION__BINDINGS = eINSTANCE.getActionExecution_Bindings();

		/**
		 * The meta object literal for the '{@link base.common.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ParameterBindingImpl
		 * @see base.common.impl.CommonPackageImpl#getParameterBinding()
		 * @generated
		 */
		public static final EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PARAMETER_BINDING__PARAMETER = eINSTANCE.getParameterBinding_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PARAMETER_BINDING__VALUE = eINSTANCE.getParameterBinding_Value();

		/**
		 * The meta object literal for the '{@link base.common.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.ConditionImpl
		 * @see base.common.impl.CommonPackageImpl#getCondition()
		 * @generated
		 */
		public static final EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link base.common.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.impl.BindingImpl
		 * @see base.common.impl.CommonPackageImpl#getBinding()
		 * @generated
		 */
		public static final EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Bindable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINDING__BINDABLE = eINSTANCE.getBinding_Bindable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '{@link base.common.Bindable <em>Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.common.Bindable
		 * @see base.common.impl.CommonPackageImpl#getBindable()
		 * @generated
		 */
		public static final EClass BINDABLE = eINSTANCE.getBindable();

	}

} //CommonPackageImpl
