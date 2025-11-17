/**
 */
package adapter;

import adapter.platform.PSCmd;
import adapter.platform.PSComm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.Dispatcher#getComm <em>Comm</em>}</li>
 *   <li>{@link adapter.Dispatcher#getCmd <em>Cmd</em>}</li>
 *   <li>{@link adapter.Dispatcher#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see adapter.AdapterPackage#getDispatcher()
 * @model
 * @generated
 */
public interface Dispatcher extends EObject {
	/**
	 * Returns the value of the '<em><b>Comm</b></em>' reference list.
	 * The list contents are of type {@link adapter.platform.PSComm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm</em>' reference list.
	 * @see adapter.AdapterPackage#getDispatcher_Comm()
	 * @model
	 * @generated
	 */
	EList<PSComm> getComm();

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' reference list.
	 * The list contents are of type {@link adapter.platform.PSCmd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' reference list.
	 * @see adapter.AdapterPackage#getDispatcher_Cmd()
	 * @model
	 * @generated
	 */
	EList<PSCmd> getCmd();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see adapter.AdapterPackage#getDispatcher_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link adapter.Dispatcher#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // Dispatcher
