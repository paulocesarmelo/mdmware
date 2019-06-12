/**
 */
package dsc.impl;

import dsc.DscPackage;
import dsc.EDSC;
import dsc.EExecutionUnit;
import dsc.EKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDSC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsc.impl.EDSCImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsc.impl.EDSCImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link dsc.impl.EDSCImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link dsc.impl.EDSCImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDSCImpl extends MinimalEObjectImpl.Container implements EDSC {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final EKind KIND_EDEFAULT = EKind.ATTR;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImpl() <em>Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected EExecutionUnit impl;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<EDSC> reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDSCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DscPackage.Literals.EDSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DscPackage.EDSC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(EKind newKind) {
		EKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DscPackage.EDSC__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EExecutionUnit getImpl() {
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpl(EExecutionUnit newImpl, NotificationChain msgs) {
		EExecutionUnit oldImpl = impl;
		impl = newImpl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DscPackage.EDSC__IMPL, oldImpl, newImpl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpl(EExecutionUnit newImpl) {
		if (newImpl != impl) {
			NotificationChain msgs = null;
			if (impl != null)
				msgs = ((InternalEObject)impl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DscPackage.EDSC__IMPL, null, msgs);
			if (newImpl != null)
				msgs = ((InternalEObject)newImpl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DscPackage.EDSC__IMPL, null, msgs);
			msgs = basicSetImpl(newImpl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DscPackage.EDSC__IMPL, newImpl, newImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDSC> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<EDSC>(EDSC.class, this, DscPackage.EDSC__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DscPackage.EDSC__IMPL:
				return basicSetImpl(null, msgs);
			case DscPackage.EDSC__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
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
			case DscPackage.EDSC__NAME:
				return getName();
			case DscPackage.EDSC__KIND:
				return getKind();
			case DscPackage.EDSC__IMPL:
				return getImpl();
			case DscPackage.EDSC__REFERENCE:
				return getReference();
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
			case DscPackage.EDSC__NAME:
				setName((String)newValue);
				return;
			case DscPackage.EDSC__KIND:
				setKind((EKind)newValue);
				return;
			case DscPackage.EDSC__IMPL:
				setImpl((EExecutionUnit)newValue);
				return;
			case DscPackage.EDSC__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends EDSC>)newValue);
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
			case DscPackage.EDSC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DscPackage.EDSC__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DscPackage.EDSC__IMPL:
				setImpl((EExecutionUnit)null);
				return;
			case DscPackage.EDSC__REFERENCE:
				getReference().clear();
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
			case DscPackage.EDSC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DscPackage.EDSC__KIND:
				return kind != KIND_EDEFAULT;
			case DscPackage.EDSC__IMPL:
				return impl != null;
			case DscPackage.EDSC__REFERENCE:
				return reference != null && !reference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //EDSCImpl
