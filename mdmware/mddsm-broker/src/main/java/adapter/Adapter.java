/**
 */
package adapter;

import adapter.domain.DomainElements;

import adapter.platform.PlatformElements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.Adapter#getPlatform <em>Platform</em>}</li>
 *   <li>{@link adapter.Adapter#getDomain <em>Domain</em>}</li>
 *   <li>{@link adapter.Adapter#getMapper <em>Mapper</em>}</li>
 *   <li>{@link adapter.Adapter#getDispatcher <em>Dispatcher</em>}</li>
 *   <li>{@link adapter.Adapter#getDomainElements <em>Domain Elements</em>}</li>
 *   <li>{@link adapter.Adapter#getPlatformElements <em>Platform Elements</em>}</li>
 * </ul>
 *
 * @see adapter.AdapterPackage#getAdapter()
 * @model
 * @generated
 */
public interface Adapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see adapter.AdapterPackage#getAdapter_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link adapter.Adapter#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see adapter.AdapterPackage#getAdapter_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link adapter.Adapter#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' containment reference.
	 * @see #setMapper(Mapper)
	 * @see adapter.AdapterPackage#getAdapter_Mapper()
	 * @model containment="true"
	 * @generated
	 */
	Mapper getMapper();

	/**
	 * Sets the value of the '{@link adapter.Adapter#getMapper <em>Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' containment reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(Mapper value);

	/**
	 * Returns the value of the '<em><b>Dispatcher</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.Dispatcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatcher</em>' containment reference list.
	 * @see adapter.AdapterPackage#getAdapter_Dispatcher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dispatcher> getDispatcher();

	/**
	 * Returns the value of the '<em><b>Domain Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Elements</em>' containment reference.
	 * @see #setDomainElements(DomainElements)
	 * @see adapter.AdapterPackage#getAdapter_DomainElements()
	 * @model containment="true"
	 * @generated
	 */
	DomainElements getDomainElements();

	/**
	 * Sets the value of the '{@link adapter.Adapter#getDomainElements <em>Domain Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Elements</em>' containment reference.
	 * @see #getDomainElements()
	 * @generated
	 */
	void setDomainElements(DomainElements value);

	/**
	 * Returns the value of the '<em><b>Platform Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Elements</em>' containment reference.
	 * @see #setPlatformElements(PlatformElements)
	 * @see adapter.AdapterPackage#getAdapter_PlatformElements()
	 * @model containment="true"
	 * @generated
	 */
	PlatformElements getPlatformElements();

	/**
	 * Sets the value of the '{@link adapter.Adapter#getPlatformElements <em>Platform Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Elements</em>' containment reference.
	 * @see #getPlatformElements()
	 * @generated
	 */
	void setPlatformElements(PlatformElements value);

} // Adapter
