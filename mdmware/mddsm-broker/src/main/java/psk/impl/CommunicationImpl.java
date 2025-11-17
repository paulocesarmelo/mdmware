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

import psk.CommAPIEnum;
import psk.Communication;
import psk.Component;
import psk.DataFormatEnum;
import psk.PskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psk.impl.CommunicationImpl#getApi <em>Api</em>}</li>
 *   <li>{@link psk.impl.CommunicationImpl#getDataSupported <em>Data Supported</em>}</li>
 *   <li>{@link psk.impl.CommunicationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends MinimalEObjectImpl.Container implements Communication {
	/**
	 * The default value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected static final CommAPIEnum API_EDEFAULT = CommAPIEnum.REST;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected CommAPIEnum api = API_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSupported() <em>Data Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSupported()
	 * @generated
	 * @ordered
	 */
	protected static final DataFormatEnum DATA_SUPPORTED_EDEFAULT = DataFormatEnum.JSON;

	/**
	 * The cached value of the '{@link #getDataSupported() <em>Data Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSupported()
	 * @generated
	 * @ordered
	 */
	protected DataFormatEnum dataSupported = DATA_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PskPackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommAPIEnum getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApi(CommAPIEnum newApi) {
		CommAPIEnum oldApi = api;
		api = newApi == null ? API_EDEFAULT : newApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.COMMUNICATION__API, oldApi, api));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFormatEnum getDataSupported() {
		return dataSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSupported(DataFormatEnum newDataSupported) {
		DataFormatEnum oldDataSupported = dataSupported;
		dataSupported = newDataSupported == null ? DATA_SUPPORTED_EDEFAULT : newDataSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.COMMUNICATION__DATA_SUPPORTED, oldDataSupported, dataSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<Component>(Component.class, this, PskPackage.COMMUNICATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PskPackage.COMMUNICATION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case PskPackage.COMMUNICATION__API:
				return getApi();
			case PskPackage.COMMUNICATION__DATA_SUPPORTED:
				return getDataSupported();
			case PskPackage.COMMUNICATION__TARGET:
				return getTarget();
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
			case PskPackage.COMMUNICATION__API:
				setApi((CommAPIEnum)newValue);
				return;
			case PskPackage.COMMUNICATION__DATA_SUPPORTED:
				setDataSupported((DataFormatEnum)newValue);
				return;
			case PskPackage.COMMUNICATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Component>)newValue);
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
			case PskPackage.COMMUNICATION__API:
				setApi(API_EDEFAULT);
				return;
			case PskPackage.COMMUNICATION__DATA_SUPPORTED:
				setDataSupported(DATA_SUPPORTED_EDEFAULT);
				return;
			case PskPackage.COMMUNICATION__TARGET:
				getTarget().clear();
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
			case PskPackage.COMMUNICATION__API:
				return api != API_EDEFAULT;
			case PskPackage.COMMUNICATION__DATA_SUPPORTED:
				return dataSupported != DATA_SUPPORTED_EDEFAULT;
			case PskPackage.COMMUNICATION__TARGET:
				return target != null && !target.isEmpty();
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
		result.append(" (api: ");
		result.append(api);
		result.append(", dataSupported: ");
		result.append(dataSupported);
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
