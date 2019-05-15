/**
 */
package base.impl;

import base.StateManager;

import base.context.State;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.StateManagerImpl#getStateTypes <em>State Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateManagerImpl extends EObjectImpl implements StateManager {
	/**
	 * The cached value of the '{@link #getStateTypes() <em>State Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<State> stateTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackageImpl.Literals.STATE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<State> getStateTypes() {
		if (stateTypes == null) {
			stateTypes = new EObjectContainmentEList<State>(State.class, this,
					BasePackageImpl.STATE_MANAGER__STATE_TYPES);
		}
		return stateTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasePackageImpl.STATE_MANAGER__STATE_TYPES:
			return ((InternalEList<?>) getStateTypes()).basicRemove(otherEnd, msgs);
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
		case BasePackageImpl.STATE_MANAGER__STATE_TYPES:
			return getStateTypes();
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
		case BasePackageImpl.STATE_MANAGER__STATE_TYPES:
			getStateTypes().clear();
			getStateTypes().addAll((Collection<? extends State>) newValue);
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
		case BasePackageImpl.STATE_MANAGER__STATE_TYPES:
			getStateTypes().clear();
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
		case BasePackageImpl.STATE_MANAGER__STATE_TYPES:
			return stateTypes != null && !stateTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateManagerImpl
