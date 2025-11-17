/**
 */
package psk.impl;

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

import psk.Command;
import psk.Communication;
import psk.Component;
import psk.PSResource;
import psk.Psk;
import psk.PskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Psk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psk.impl.PskImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link psk.impl.PskImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link psk.impl.PskImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link psk.impl.PskImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link psk.impl.PskImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PskImpl extends MinimalEObjectImpl.Container implements Psk {
	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<PSResource> resource;

	/**
	 * The cached value of the '{@link #getComm() <em>Comm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm()
	 * @generated
	 * @ordered
	 */
	protected EList<Communication> comm;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> cmd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PskPackage.Literals.PSK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.PSK__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, PskPackage.PSK__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<PSResource>(PSResource.class, this, PskPackage.PSK__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Communication> getComm() {
		if (comm == null) {
			comm = new EObjectContainmentEList<Communication>(Communication.class, this, PskPackage.PSK__COMM);
		}
		return comm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCmd() {
		if (cmd == null) {
			cmd = new EObjectContainmentEList<Command>(Command.class, this, PskPackage.PSK__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PskPackage.PSK__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case PskPackage.PSK__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case PskPackage.PSK__COMM:
				return ((InternalEList<?>)getComm()).basicRemove(otherEnd, msgs);
			case PskPackage.PSK__CMD:
				return ((InternalEList<?>)getCmd()).basicRemove(otherEnd, msgs);
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
			case PskPackage.PSK__PLATFORM:
				return getPlatform();
			case PskPackage.PSK__COMPONENTS:
				return getComponents();
			case PskPackage.PSK__RESOURCE:
				return getResource();
			case PskPackage.PSK__COMM:
				return getComm();
			case PskPackage.PSK__CMD:
				return getCmd();
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
			case PskPackage.PSK__PLATFORM:
				setPlatform((String)newValue);
				return;
			case PskPackage.PSK__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case PskPackage.PSK__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends PSResource>)newValue);
				return;
			case PskPackage.PSK__COMM:
				getComm().clear();
				getComm().addAll((Collection<? extends Communication>)newValue);
				return;
			case PskPackage.PSK__CMD:
				getCmd().clear();
				getCmd().addAll((Collection<? extends Command>)newValue);
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
			case PskPackage.PSK__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case PskPackage.PSK__COMPONENTS:
				getComponents().clear();
				return;
			case PskPackage.PSK__RESOURCE:
				getResource().clear();
				return;
			case PskPackage.PSK__COMM:
				getComm().clear();
				return;
			case PskPackage.PSK__CMD:
				getCmd().clear();
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
			case PskPackage.PSK__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case PskPackage.PSK__COMPONENTS:
				return components != null && !components.isEmpty();
			case PskPackage.PSK__RESOURCE:
				return resource != null && !resource.isEmpty();
			case PskPackage.PSK__COMM:
				return comm != null && !comm.isEmpty();
			case PskPackage.PSK__CMD:
				return cmd != null && !cmd.isEmpty();
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
		result.append(" (platform: ");
		result.append(platform);
		result.append(')');
		return result.toString();
	}

} //PskImpl
