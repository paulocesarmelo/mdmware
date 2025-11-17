/**
 */
package adapter.impl;

import adapter.Adapter;
import adapter.AdapterPackage;
import adapter.Dispatcher;
import adapter.Mapper;

import adapter.domain.DomainElements;

import adapter.platform.PlatformElements;

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
 * An implementation of the model object '<em><b>Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adapter.impl.AdapterImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link adapter.impl.AdapterImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link adapter.impl.AdapterImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link adapter.impl.AdapterImpl#getDispatcher <em>Dispatcher</em>}</li>
 *   <li>{@link adapter.impl.AdapterImpl#getDomainElements <em>Domain Elements</em>}</li>
 *   <li>{@link adapter.impl.AdapterImpl#getPlatformElements <em>Platform Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdapterImpl extends MinimalEObjectImpl.Container implements Adapter {
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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapper() <em>Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapper()
	 * @generated
	 * @ordered
	 */
	protected Mapper mapper;

	/**
	 * The cached value of the '{@link #getDispatcher() <em>Dispatcher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatcher()
	 * @generated
	 * @ordered
	 */
	protected EList<Dispatcher> dispatcher;

	/**
	 * The cached value of the '{@link #getDomainElements() <em>Domain Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElements()
	 * @generated
	 * @ordered
	 */
	protected DomainElements domainElements;

	/**
	 * The cached value of the '{@link #getPlatformElements() <em>Platform Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformElements()
	 * @generated
	 * @ordered
	 */
	protected PlatformElements platformElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.ADAPTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__PLATFORM, oldPlatform, platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapper getMapper() {
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapper(Mapper newMapper, NotificationChain msgs) {
		Mapper oldMapper = mapper;
		mapper = newMapper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__MAPPER, oldMapper, newMapper);
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
	public void setMapper(Mapper newMapper) {
		if (newMapper != mapper) {
			NotificationChain msgs = null;
			if (mapper != null)
				msgs = ((InternalEObject)mapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.ADAPTER__MAPPER, null, msgs);
			if (newMapper != null)
				msgs = ((InternalEObject)newMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.ADAPTER__MAPPER, null, msgs);
			msgs = basicSetMapper(newMapper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__MAPPER, newMapper, newMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dispatcher> getDispatcher() {
		if (dispatcher == null) {
			dispatcher = new EObjectContainmentEList<Dispatcher>(Dispatcher.class, this, AdapterPackage.ADAPTER__DISPATCHER);
		}
		return dispatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainElements getDomainElements() {
		return domainElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainElements(DomainElements newDomainElements, NotificationChain msgs) {
		DomainElements oldDomainElements = domainElements;
		domainElements = newDomainElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__DOMAIN_ELEMENTS, oldDomainElements, newDomainElements);
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
	public void setDomainElements(DomainElements newDomainElements) {
		if (newDomainElements != domainElements) {
			NotificationChain msgs = null;
			if (domainElements != null)
				msgs = ((InternalEObject)domainElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.ADAPTER__DOMAIN_ELEMENTS, null, msgs);
			if (newDomainElements != null)
				msgs = ((InternalEObject)newDomainElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.ADAPTER__DOMAIN_ELEMENTS, null, msgs);
			msgs = basicSetDomainElements(newDomainElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__DOMAIN_ELEMENTS, newDomainElements, newDomainElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformElements getPlatformElements() {
		return platformElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformElements(PlatformElements newPlatformElements, NotificationChain msgs) {
		PlatformElements oldPlatformElements = platformElements;
		platformElements = newPlatformElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__PLATFORM_ELEMENTS, oldPlatformElements, newPlatformElements);
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
	public void setPlatformElements(PlatformElements newPlatformElements) {
		if (newPlatformElements != platformElements) {
			NotificationChain msgs = null;
			if (platformElements != null)
				msgs = ((InternalEObject)platformElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.ADAPTER__PLATFORM_ELEMENTS, null, msgs);
			if (newPlatformElements != null)
				msgs = ((InternalEObject)newPlatformElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.ADAPTER__PLATFORM_ELEMENTS, null, msgs);
			msgs = basicSetPlatformElements(newPlatformElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER__PLATFORM_ELEMENTS, newPlatformElements, newPlatformElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.ADAPTER__MAPPER:
				return basicSetMapper(null, msgs);
			case AdapterPackage.ADAPTER__DISPATCHER:
				return ((InternalEList<?>)getDispatcher()).basicRemove(otherEnd, msgs);
			case AdapterPackage.ADAPTER__DOMAIN_ELEMENTS:
				return basicSetDomainElements(null, msgs);
			case AdapterPackage.ADAPTER__PLATFORM_ELEMENTS:
				return basicSetPlatformElements(null, msgs);
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
			case AdapterPackage.ADAPTER__PLATFORM:
				return getPlatform();
			case AdapterPackage.ADAPTER__DOMAIN:
				return getDomain();
			case AdapterPackage.ADAPTER__MAPPER:
				return getMapper();
			case AdapterPackage.ADAPTER__DISPATCHER:
				return getDispatcher();
			case AdapterPackage.ADAPTER__DOMAIN_ELEMENTS:
				return getDomainElements();
			case AdapterPackage.ADAPTER__PLATFORM_ELEMENTS:
				return getPlatformElements();
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
			case AdapterPackage.ADAPTER__PLATFORM:
				setPlatform((String)newValue);
				return;
			case AdapterPackage.ADAPTER__DOMAIN:
				setDomain((String)newValue);
				return;
			case AdapterPackage.ADAPTER__MAPPER:
				setMapper((Mapper)newValue);
				return;
			case AdapterPackage.ADAPTER__DISPATCHER:
				getDispatcher().clear();
				getDispatcher().addAll((Collection<? extends Dispatcher>)newValue);
				return;
			case AdapterPackage.ADAPTER__DOMAIN_ELEMENTS:
				setDomainElements((DomainElements)newValue);
				return;
			case AdapterPackage.ADAPTER__PLATFORM_ELEMENTS:
				setPlatformElements((PlatformElements)newValue);
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
			case AdapterPackage.ADAPTER__PLATFORM:
				setPlatform(PLATFORM_EDEFAULT);
				return;
			case AdapterPackage.ADAPTER__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case AdapterPackage.ADAPTER__MAPPER:
				setMapper((Mapper)null);
				return;
			case AdapterPackage.ADAPTER__DISPATCHER:
				getDispatcher().clear();
				return;
			case AdapterPackage.ADAPTER__DOMAIN_ELEMENTS:
				setDomainElements((DomainElements)null);
				return;
			case AdapterPackage.ADAPTER__PLATFORM_ELEMENTS:
				setPlatformElements((PlatformElements)null);
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
			case AdapterPackage.ADAPTER__PLATFORM:
				return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
			case AdapterPackage.ADAPTER__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case AdapterPackage.ADAPTER__MAPPER:
				return mapper != null;
			case AdapterPackage.ADAPTER__DISPATCHER:
				return dispatcher != null && !dispatcher.isEmpty();
			case AdapterPackage.ADAPTER__DOMAIN_ELEMENTS:
				return domainElements != null;
			case AdapterPackage.ADAPTER__PLATFORM_ELEMENTS:
				return platformElements != null;
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
		result.append(", domain: ");
		result.append(domain);
		result.append(')');
		return result.toString();
	}

} //AdapterImpl
