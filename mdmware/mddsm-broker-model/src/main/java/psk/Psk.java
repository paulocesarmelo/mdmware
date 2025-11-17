/**
 */
package psk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Psk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psk.Psk#getPlatform <em>Platform</em>}</li>
 *   <li>{@link psk.Psk#getComponents <em>Components</em>}</li>
 *   <li>{@link psk.Psk#getResource <em>Resource</em>}</li>
 *   <li>{@link psk.Psk#getComm <em>Comm</em>}</li>
 *   <li>{@link psk.Psk#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see psk.PskPackage#getPsk()
 * @model
 * @generated
 */
public interface Psk extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see psk.PskPackage#getPsk_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link psk.Psk#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link psk.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see psk.PskPackage#getPsk_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link psk.PSResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see psk.PskPackage#getPsk_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PSResource> getResource();

	/**
	 * Returns the value of the '<em><b>Comm</b></em>' containment reference list.
	 * The list contents are of type {@link psk.Communication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm</em>' containment reference list.
	 * @see psk.PskPackage#getPsk_Comm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Communication> getComm();

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference list.
	 * The list contents are of type {@link psk.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference list.
	 * @see psk.PskPackage#getPsk_Cmd()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCmd();

} // Psk
