/**
 */
package psk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PS Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psk.PSResource#getName <em>Name</em>}</li>
 *   <li>{@link psk.PSResource#getUuid <em>Uuid</em>}</li>
 *   <li>{@link psk.PSResource#getParameters <em>Parameters</em>}</li>
 *   <li>{@link psk.PSResource#getArrange <em>Arrange</em>}</li>
 *   <li>{@link psk.PSResource#getComposition <em>Composition</em>}</li>
 *   <li>{@link psk.PSResource#getPrimitiveResource <em>Primitive Resource</em>}</li>
 * </ul>
 *
 * @see psk.PskPackage#getPSResource()
 * @model
 * @generated
 */
public interface PSResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see psk.PskPackage#getPSResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link psk.PSResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see psk.PskPackage#getPSResource_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link psk.PSResource#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link psk.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see psk.PskPackage#getPSResource_Parameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Arrange</b></em>' attribute.
	 * The literals are from the enumeration {@link psk.ArrangementENum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrange</em>' attribute.
	 * @see psk.ArrangementENum
	 * @see #setArrange(ArrangementENum)
	 * @see psk.PskPackage#getPSResource_Arrange()
	 * @model
	 * @generated
	 */
	ArrangementENum getArrange();

	/**
	 * Sets the value of the '{@link psk.PSResource#getArrange <em>Arrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrange</em>' attribute.
	 * @see psk.ArrangementENum
	 * @see #getArrange()
	 * @generated
	 */
	void setArrange(ArrangementENum value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' attribute.
	 * The literals are from the enumeration {@link psk.CompositionEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' attribute.
	 * @see psk.CompositionEnum
	 * @see #setComposition(CompositionEnum)
	 * @see psk.PskPackage#getPSResource_Composition()
	 * @model
	 * @generated
	 */
	CompositionEnum getComposition();

	/**
	 * Sets the value of the '{@link psk.PSResource#getComposition <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' attribute.
	 * @see psk.CompositionEnum
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(CompositionEnum value);

	/**
	 * Returns the value of the '<em><b>Primitive Resource</b></em>' containment reference list.
	 * The list contents are of type {@link psk.PSResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Resource</em>' containment reference list.
	 * @see psk.PskPackage#getPSResource_PrimitiveResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSResource> getPrimitiveResource();

} // PSResource
