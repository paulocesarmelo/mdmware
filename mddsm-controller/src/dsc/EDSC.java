/**
 */
package dsc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDSC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsc.EDSC#getName <em>Name</em>}</li>
 *   <li>{@link dsc.EDSC#getKind <em>Kind</em>}</li>
 *   <li>{@link dsc.EDSC#getImpl <em>Impl</em>}</li>
 *   <li>{@link dsc.EDSC#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see dsc.DscPackage#getEDSC()
 * @model
 * @generated
 */
public interface EDSC extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsc.DscPackage#getEDSC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsc.EDSC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link dsc.EKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see dsc.EKind
	 * @see #setKind(EKind)
	 * @see dsc.DscPackage#getEDSC_Kind()
	 * @model
	 * @generated
	 */
	EKind getKind();

	/**
	 * Sets the value of the '{@link dsc.EDSC#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see dsc.EKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EKind value);

	/**
	 * Returns the value of the '<em><b>Impl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' containment reference.
	 * @see #setImpl(EExecutionUnit)
	 * @see dsc.DscPackage#getEDSC_Impl()
	 * @model containment="true"
	 * @generated
	 */
	EExecutionUnit getImpl();

	/**
	 * Sets the value of the '{@link dsc.EDSC#getImpl <em>Impl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' containment reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(EExecutionUnit value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link dsc.EDSC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see dsc.DscPackage#getEDSC_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDSC> getReference();

} // EDSC
