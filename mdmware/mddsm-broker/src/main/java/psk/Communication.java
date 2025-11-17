/**
 */
package psk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psk.Communication#getApi <em>Api</em>}</li>
 *   <li>{@link psk.Communication#getDataSupported <em>Data Supported</em>}</li>
 *   <li>{@link psk.Communication#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see psk.PskPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EObject {
	/**
	 * Returns the value of the '<em><b>Api</b></em>' attribute.
	 * The literals are from the enumeration {@link psk.CommAPIEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' attribute.
	 * @see psk.CommAPIEnum
	 * @see #setApi(CommAPIEnum)
	 * @see psk.PskPackage#getCommunication_Api()
	 * @model
	 * @generated
	 */
	CommAPIEnum getApi();

	/**
	 * Sets the value of the '{@link psk.Communication#getApi <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' attribute.
	 * @see psk.CommAPIEnum
	 * @see #getApi()
	 * @generated
	 */
	void setApi(CommAPIEnum value);

	/**
	 * Returns the value of the '<em><b>Data Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link psk.DataFormatEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Supported</em>' attribute.
	 * @see psk.DataFormatEnum
	 * @see #setDataSupported(DataFormatEnum)
	 * @see psk.PskPackage#getCommunication_DataSupported()
	 * @model
	 * @generated
	 */
	DataFormatEnum getDataSupported();

	/**
	 * Sets the value of the '{@link psk.Communication#getDataSupported <em>Data Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Supported</em>' attribute.
	 * @see psk.DataFormatEnum
	 * @see #getDataSupported()
	 * @generated
	 */
	void setDataSupported(DataFormatEnum value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link psk.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see psk.PskPackage#getCommunication_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getTarget();

} // Communication
