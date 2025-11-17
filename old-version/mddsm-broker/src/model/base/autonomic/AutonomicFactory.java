/**
 */
package base.autonomic;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface AutonomicFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutonomicFactory INSTANCE = base.autonomic.impl.AutonomicFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Symptom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symptom</em>'.
	 * @generated
	 */
	Symptom createSymptom();

	/**
	 * Returns a new object of class '<em>Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Request</em>'.
	 * @generated
	 */
	ChangeRequest createChangeRequest();

	/**
	 * Returns a new object of class '<em>Change Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Plan</em>'.
	 * @generated
	 */
	ChangePlan createChangePlan();

} //AutonomicFactory
