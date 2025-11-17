/**
 */
package base.autonomic.impl;

import base.autonomic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutonomicFactoryImpl extends EFactoryImpl implements AutonomicFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AutonomicFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutonomicFactoryImpl init() {
		try {
			AutonomicFactoryImpl theAutonomicFactory = (AutonomicFactoryImpl) EPackage.Registry.INSTANCE
					.getEFactory(AutonomicPackageImpl.eNS_URI);
			if (theAutonomicFactory != null) {
				return theAutonomicFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutonomicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutonomicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AutonomicPackageImpl.SYMPTOM:
			return createSymptom();
		case AutonomicPackageImpl.CHANGE_REQUEST:
			return createChangeRequest();
		case AutonomicPackageImpl.CHANGE_PLAN:
			return createChangePlan();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symptom createSymptom() {
		SymptomImpl symptom = new SymptomImpl();
		return symptom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequest createChangeRequest() {
		ChangeRequestImpl changeRequest = new ChangeRequestImpl();
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePlan createChangePlan() {
		ChangePlanImpl changePlan = new ChangePlanImpl();
		return changePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutonomicPackageImpl getAutonomicPackage() {
		return (AutonomicPackageImpl) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutonomicPackageImpl getPackage() {
		return AutonomicPackageImpl.eINSTANCE;
	}

} //AutonomicFactoryImpl
