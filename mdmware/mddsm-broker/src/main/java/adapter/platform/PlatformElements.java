/**
 */
package adapter.platform;

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
 *   <li>{@link adapter.platform.PlatformElements#getResources <em>Resources</em>}</li>
 *   <li>{@link adapter.platform.PlatformElements#getComm <em>Comm</em>}</li>
 *   <li>{@link adapter.platform.PlatformElements#getCmd <em>Cmd</em>}</li>
 *   <li>{@link adapter.platform.PlatformElements#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @see adapter.platform.PlatformPackage#getPlatformElements()
 * @model
 * @generated
 */
public interface PlatformElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.platform.PSResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see adapter.platform.PlatformPackage#getPlatformElements_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSResource> getResources();

	/**
	 * Returns the value of the '<em><b>Comm</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.platform.PSComm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm</em>' containment reference list.
	 * @see adapter.platform.PlatformPackage#getPlatformElements_Comm()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSComm> getComm();

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.platform.PSCmd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference list.
	 * @see adapter.platform.PlatformPackage#getPlatformElements_Cmd()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSCmd> getCmd();

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.platform.PSComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' containment reference list.
	 * @see adapter.platform.PlatformPackage#getPlatformElements_Comp()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSComponent> getComp();

} // PlatformElements
