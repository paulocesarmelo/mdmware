/**
 */
package adapter.platform.impl;

import adapter.platform.PSCmd;
import adapter.platform.PSComm;
import adapter.platform.PSComponent;
import adapter.platform.PSResource;
import adapter.platform.PlatformElements;
import adapter.platform.PlatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adapter.platform.impl.PlatformElementsImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link adapter.platform.impl.PlatformElementsImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link adapter.platform.impl.PlatformElementsImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link adapter.platform.impl.PlatformElementsImpl#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformElementsImpl extends MinimalEObjectImpl.Container implements PlatformElements {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PSResource> resources;

	/**
	 * The cached value of the '{@link #getComm() <em>Comm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm()
	 * @generated
	 * @ordered
	 */
	protected EList<PSComm> comm;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<PSCmd> cmd;

	/**
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected EList<PSComponent> comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLATFORM_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<PSResource>(PSResource.class, this, PlatformPackage.PLATFORM_ELEMENTS__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSComm> getComm() {
		if (comm == null) {
			comm = new EObjectContainmentEList<PSComm>(PSComm.class, this, PlatformPackage.PLATFORM_ELEMENTS__COMM);
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
			cmd = new EObjectContainmentEList<PSCmd>(PSCmd.class, this, PlatformPackage.PLATFORM_ELEMENTS__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSComponent> getComp() {
		if (comp == null) {
			comp = new EObjectContainmentEList<PSComponent>(PSComponent.class, this, PlatformPackage.PLATFORM_ELEMENTS__COMP);
		}
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PLATFORM_ELEMENTS__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case PlatformPackage.PLATFORM_ELEMENTS__COMM:
				return ((InternalEList<?>)getComm()).basicRemove(otherEnd, msgs);
			case PlatformPackage.PLATFORM_ELEMENTS__CMD:
				return ((InternalEList<?>)getCmd()).basicRemove(otherEnd, msgs);
			case PlatformPackage.PLATFORM_ELEMENTS__COMP:
				return ((InternalEList<?>)getComp()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.PLATFORM_ELEMENTS__RESOURCES:
				return getResources();
			case PlatformPackage.PLATFORM_ELEMENTS__COMM:
				return getComm();
			case PlatformPackage.PLATFORM_ELEMENTS__CMD:
				return getCmd();
			case PlatformPackage.PLATFORM_ELEMENTS__COMP:
				return getComp();
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
			case PlatformPackage.PLATFORM_ELEMENTS__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends PSResource>)newValue);
				return;
			case PlatformPackage.PLATFORM_ELEMENTS__COMM:
				getComm().clear();
				getComm().addAll((Collection<? extends PSComm>)newValue);
				return;
			case PlatformPackage.PLATFORM_ELEMENTS__CMD:
				getCmd().clear();
				getCmd().addAll((Collection<? extends PSCmd>)newValue);
				return;
			case PlatformPackage.PLATFORM_ELEMENTS__COMP:
				getComp().clear();
				getComp().addAll((Collection<? extends PSComponent>)newValue);
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
			case PlatformPackage.PLATFORM_ELEMENTS__RESOURCES:
				getResources().clear();
				return;
			case PlatformPackage.PLATFORM_ELEMENTS__COMM:
				getComm().clear();
				return;
			case PlatformPackage.PLATFORM_ELEMENTS__CMD:
				getCmd().clear();
				return;
			case PlatformPackage.PLATFORM_ELEMENTS__COMP:
				getComp().clear();
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
			case PlatformPackage.PLATFORM_ELEMENTS__RESOURCES:
				return resources != null && !resources.isEmpty();
			case PlatformPackage.PLATFORM_ELEMENTS__COMM:
				return comm != null && !comm.isEmpty();
			case PlatformPackage.PLATFORM_ELEMENTS__CMD:
				return cmd != null && !cmd.isEmpty();
			case PlatformPackage.PLATFORM_ELEMENTS__COMP:
				return comp != null && !comp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformElementsImpl
