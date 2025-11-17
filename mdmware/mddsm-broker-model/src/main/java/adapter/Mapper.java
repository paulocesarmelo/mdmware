/**
 */
package adapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.Mapper#getComponentsRelated <em>Components Related</em>}</li>
 *   <li>{@link adapter.Mapper#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see adapter.AdapterPackage#getMapper()
 * @model
 * @generated
 */
public interface Mapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Components Related</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.Components}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Related</em>' containment reference list.
	 * @see adapter.AdapterPackage#getMapper_ComponentsRelated()
	 * @model containment="true"
	 * @generated
	 */
	EList<Components> getComponentsRelated();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see adapter.AdapterPackage#getMapper_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link adapter.Mapper#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // Mapper
