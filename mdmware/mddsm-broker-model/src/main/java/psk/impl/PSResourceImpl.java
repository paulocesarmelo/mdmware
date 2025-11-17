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

import psk.ArrangementENum;
import psk.CompositionEnum;
import psk.PSResource;
import psk.Parameter;
import psk.PskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PS Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psk.impl.PSResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link psk.impl.PSResourceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link psk.impl.PSResourceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link psk.impl.PSResourceImpl#getArrange <em>Arrange</em>}</li>
 *   <li>{@link psk.impl.PSResourceImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link psk.impl.PSResourceImpl#getPrimitiveResource <em>Primitive Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSResourceImpl extends MinimalEObjectImpl.Container implements PSResource {
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
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getArrange() <em>Arrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrange()
	 * @generated
	 * @ordered
	 */
	protected static final ArrangementENum ARRANGE_EDEFAULT = ArrangementENum.PHISICAL;

	/**
	 * The cached value of the '{@link #getArrange() <em>Arrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrange()
	 * @generated
	 * @ordered
	 */
	protected ArrangementENum arrange = ARRANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComposition() <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected static final CompositionEnum COMPOSITION_EDEFAULT = CompositionEnum.SINGLE;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected CompositionEnum composition = COMPOSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimitiveResource() <em>Primitive Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveResource()
	 * @generated
	 * @ordered
	 */
	protected EList<PSResource> primitiveResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PskPackage.Literals.PS_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.PS_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.PS_RESOURCE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, PskPackage.PS_RESOURCE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrangementENum getArrange() {
		return arrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrange(ArrangementENum newArrange) {
		ArrangementENum oldArrange = arrange;
		arrange = newArrange == null ? ARRANGE_EDEFAULT : newArrange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.PS_RESOURCE__ARRANGE, oldArrange, arrange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionEnum getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposition(CompositionEnum newComposition) {
		CompositionEnum oldComposition = composition;
		composition = newComposition == null ? COMPOSITION_EDEFAULT : newComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PskPackage.PS_RESOURCE__COMPOSITION, oldComposition, composition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSResource> getPrimitiveResource() {
		if (primitiveResource == null) {
			primitiveResource = new EObjectContainmentEList<PSResource>(PSResource.class, this, PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE);
		}
		return primitiveResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PskPackage.PS_RESOURCE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE:
				return ((InternalEList<?>)getPrimitiveResource()).basicRemove(otherEnd, msgs);
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
			case PskPackage.PS_RESOURCE__NAME:
				return getName();
			case PskPackage.PS_RESOURCE__UUID:
				return getUuid();
			case PskPackage.PS_RESOURCE__PARAMETERS:
				return getParameters();
			case PskPackage.PS_RESOURCE__ARRANGE:
				return getArrange();
			case PskPackage.PS_RESOURCE__COMPOSITION:
				return getComposition();
			case PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE:
				return getPrimitiveResource();
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
			case PskPackage.PS_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case PskPackage.PS_RESOURCE__UUID:
				setUuid((String)newValue);
				return;
			case PskPackage.PS_RESOURCE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case PskPackage.PS_RESOURCE__ARRANGE:
				setArrange((ArrangementENum)newValue);
				return;
			case PskPackage.PS_RESOURCE__COMPOSITION:
				setComposition((CompositionEnum)newValue);
				return;
			case PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE:
				getPrimitiveResource().clear();
				getPrimitiveResource().addAll((Collection<? extends PSResource>)newValue);
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
			case PskPackage.PS_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PskPackage.PS_RESOURCE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case PskPackage.PS_RESOURCE__PARAMETERS:
				getParameters().clear();
				return;
			case PskPackage.PS_RESOURCE__ARRANGE:
				setArrange(ARRANGE_EDEFAULT);
				return;
			case PskPackage.PS_RESOURCE__COMPOSITION:
				setComposition(COMPOSITION_EDEFAULT);
				return;
			case PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE:
				getPrimitiveResource().clear();
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
			case PskPackage.PS_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PskPackage.PS_RESOURCE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case PskPackage.PS_RESOURCE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PskPackage.PS_RESOURCE__ARRANGE:
				return arrange != ARRANGE_EDEFAULT;
			case PskPackage.PS_RESOURCE__COMPOSITION:
				return composition != COMPOSITION_EDEFAULT;
			case PskPackage.PS_RESOURCE__PRIMITIVE_RESOURCE:
				return primitiveResource != null && !primitiveResource.isEmpty();
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
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", arrange: ");
		result.append(arrange);
		result.append(", composition: ");
		result.append(composition);
		result.append(')');
		return result.toString();
	}

} //PSResourceImpl
