/**
 */
package adapter.platform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see adapter.platform.PlatformPackage
 * @generated
 */
public interface PlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformFactory eINSTANCE = adapter.platform.impl.PlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elements</em>'.
	 * @generated
	 */
	PlatformElements createPlatformElements();

	/**
	 * Returns a new object of class '<em>PS Comm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Comm</em>'.
	 * @generated
	 */
	PSComm createPSComm();

	/**
	 * Returns a new object of class '<em>PS Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Cmd</em>'.
	 * @generated
	 */
	PSCmd createPSCmd();

	/**
	 * Returns a new object of class '<em>PS Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Resource</em>'.
	 * @generated
	 */
	PSResource createPSResource();

	/**
	 * Returns a new object of class '<em>PS Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PS Component</em>'.
	 * @generated
	 */
	PSComponent createPSComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatformPackage getPlatformPackage();

} //PlatformFactory
