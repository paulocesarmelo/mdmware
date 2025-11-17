/**
 */
package adapter.impl;

import adapter.AdapterPackage;
import adapter.Dispatcher;
import adapter.Function;

import adapter.platform.PSCmd;
import adapter.platform.PSComm;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adapter.impl.DispatcherImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link adapter.impl.DispatcherImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link adapter.impl.DispatcherImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DispatcherImpl extends MinimalEObjectImpl.Container implements Dispatcher {
	/**
	 * The cached value of the '{@link #getComm() <em>Comm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm()
	 * @generated
	 * @ordered
	 */
	protected EList<PSComm> comm;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<PSCmd> cmd;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.DISPATCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSComm> getComm() {
		if (comm == null) {
			comm = new EObjectResolvingEList<PSComm>(PSComm.class, this, AdapterPackage.DISPATCHER__COMM);
		}
		return comm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSCmd> getCmd() {
		if (cmd == null) {
			cmd = new EObjectResolvingEList<PSCmd>(PSCmd.class, this, AdapterPackage.DISPATCHER__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterPackage.DISPATCHER__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(Function newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.DISPATCHER__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.DISPATCHER__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.DISPATCHER__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.DISPATCHER__FUNCTION:
				return basicSetFunction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterPackage.DISPATCHER__COMM:
				return getComm();
			case AdapterPackage.DISPATCHER__CMD:
				return getCmd();
			case AdapterPackage.DISPATCHER__FUNCTION:
				return getFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdapterPackage.DISPATCHER__COMM:
				getComm().clear();
				getComm().addAll((Collection<? extends PSComm>)newValue);
				return;
			case AdapterPackage.DISPATCHER__CMD:
				getCmd().clear();
				getCmd().addAll((Collection<? extends PSCmd>)newValue);
				return;
			case AdapterPackage.DISPATCHER__FUNCTION:
				setFunction((Function)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdapterPackage.DISPATCHER__COMM:
				getComm().clear();
				return;
			case AdapterPackage.DISPATCHER__CMD:
				getCmd().clear();
				return;
			case AdapterPackage.DISPATCHER__FUNCTION:
				setFunction((Function)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdapterPackage.DISPATCHER__COMM:
				return comm != null && !comm.isEmpty();
			case AdapterPackage.DISPATCHER__CMD:
				return cmd != null && !cmd.isEmpty();
			case AdapterPackage.DISPATCHER__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

} //DispatcherImpl
