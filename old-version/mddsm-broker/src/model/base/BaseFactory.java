/**
 */
package base;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface BaseFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaseFactory INSTANCE = base.impl.BaseFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns a new object of class '<em>State Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Manager</em>'.
	 * @generated
	 */
	StateManager createStateManager();

	/**
	 * Returns a new object of class '<em>Autonomic Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autonomic Manager</em>'.
	 * @generated
	 */
	AutonomicManager createAutonomicManager();

	/**
	 * Returns a new object of class '<em>Policy Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Manager</em>'.
	 * @generated
	 */
	PolicyManager createPolicyManager();

	/**
	 * Returns a new object of class '<em>Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handler</em>'.
	 * @generated
	 */
	Handler createHandler();

	/**
	 * Returns a new object of class '<em>Instance Resource Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Resource Manager</em>'.
	 * @generated
	 */
	InstanceResourceManager createInstanceResourceManager();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

} //BaseFactory
