/**
 */
package adapter.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.domain.DomainElements#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see adapter.domain.DomainPackage#getDomainElements()
 * @model
 * @generated
 */
public interface DomainElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.domain.DSEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see adapter.domain.DomainPackage#getDomainElements_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DSEntity> getEntities();

} // DomainElements
