/**
 */
package adapter;

import adapter.domain.DSEntity;

import adapter.platform.PSResource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.Components#getId <em>Id</em>}</li>
 *   <li>{@link adapter.Components#getResource <em>Resource</em>}</li>
 *   <li>{@link adapter.Components#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see adapter.AdapterPackage#getComponents()
 * @model
 * @generated
 */
public interface Components extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see adapter.AdapterPackage#getComponents_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link adapter.Components#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(PSResource)
	 * @see adapter.AdapterPackage#getComponents_Resource()
	 * @model required="true"
	 * @generated
	 */
	PSResource getResource();

	/**
	 * Sets the value of the '{@link adapter.Components#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(PSResource value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(DSEntity)
	 * @see adapter.AdapterPackage#getComponents_Entity()
	 * @model required="true"
	 * @generated
	 */
	DSEntity getEntity();

	/**
	 * Sets the value of the '{@link adapter.Components#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(DSEntity value);

} // Components
