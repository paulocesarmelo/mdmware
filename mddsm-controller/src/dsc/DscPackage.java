/**
 */
package dsc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsc.DscFactory
 * @model kind="package"
 * @generated
 */
public interface DscPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/controller/dsc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DscPackage eINSTANCE = dsc.impl.DscPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsc.impl.dskImpl <em>dsk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsc.impl.dskImpl
	 * @see dsc.impl.DscPackageImpl#getdsk()
	 * @generated
	 */
	int DSK = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__PROCEDURES = 1;

	/**
	 * The number of structural features of the '<em>dsk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>dsk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsc.impl.EProcedureImpl <em>EProcedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsc.impl.EProcedureImpl
	 * @see dsc.impl.DscPackageImpl#getEProcedure()
	 * @generated
	 */
	int EPROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Dsc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__DSC = 2;

	/**
	 * The number of structural features of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsc.impl.EDSCImpl <em>EDSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsc.impl.EDSCImpl
	 * @see dsc.impl.DscPackageImpl#getEDSC()
	 * @generated
	 */
	int EDSC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__KIND = 1;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__IMPL = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>EDSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EDSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsc.impl.EExecutionUnitImpl <em>EExecution Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsc.impl.EExecutionUnitImpl
	 * @see dsc.impl.DscPackageImpl#getEExecutionUnit()
	 * @generated
	 */
	int EEXECUTION_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT__BODY = 1;

	/**
	 * The number of structural features of the '<em>EExecution Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EExecution Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsc.EKind <em>EKind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsc.EKind
	 * @see dsc.impl.DscPackageImpl#getEKind()
	 * @generated
	 */
	int EKIND = 4;


	/**
	 * Returns the meta object for class '{@link dsc.DSK <em>dsk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dsk</em>'.
	 * @see dsc.DSK
	 * @generated
	 */
	EClass getdsk();

	/**
	 * Returns the meta object for the attribute '{@link dsc.DSK#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see dsc.DSK#getDomain()
	 * @see #getdsk()
	 * @generated
	 */
	EAttribute getdsk_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link dsc.DSK#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see dsc.DSK#getProcedures()
	 * @see #getdsk()
	 * @generated
	 */
	EReference getdsk_Procedures();

	/**
	 * Returns the meta object for class '{@link dsc.EProcedure <em>EProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProcedure</em>'.
	 * @see dsc.EProcedure
	 * @generated
	 */
	EClass getEProcedure();

	/**
	 * Returns the meta object for the attribute '{@link dsc.EProcedure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsc.EProcedure#getId()
	 * @see #getEProcedure()
	 * @generated
	 */
	EAttribute getEProcedure_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsc.EProcedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsc.EProcedure#getName()
	 * @see #getEProcedure()
	 * @generated
	 */
	EAttribute getEProcedure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsc.EProcedure#getDsc <em>Dsc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsc</em>'.
	 * @see dsc.EProcedure#getDsc()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Dsc();

	/**
	 * Returns the meta object for class '{@link dsc.EDSC <em>EDSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDSC</em>'.
	 * @see dsc.EDSC
	 * @generated
	 */
	EClass getEDSC();

	/**
	 * Returns the meta object for the attribute '{@link dsc.EDSC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsc.EDSC#getName()
	 * @see #getEDSC()
	 * @generated
	 */
	EAttribute getEDSC_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsc.EDSC#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see dsc.EDSC#getKind()
	 * @see #getEDSC()
	 * @generated
	 */
	EAttribute getEDSC_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link dsc.EDSC#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impl</em>'.
	 * @see dsc.EDSC#getImpl()
	 * @see #getEDSC()
	 * @generated
	 */
	EReference getEDSC_Impl();

	/**
	 * Returns the meta object for the containment reference list '{@link dsc.EDSC#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see dsc.EDSC#getReference()
	 * @see #getEDSC()
	 * @generated
	 */
	EReference getEDSC_Reference();

	/**
	 * Returns the meta object for class '{@link dsc.EExecutionUnit <em>EExecution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExecution Unit</em>'.
	 * @see dsc.EExecutionUnit
	 * @generated
	 */
	EClass getEExecutionUnit();

	/**
	 * Returns the meta object for the attribute '{@link dsc.EExecutionUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsc.EExecutionUnit#getId()
	 * @see #getEExecutionUnit()
	 * @generated
	 */
	EAttribute getEExecutionUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsc.EExecutionUnit#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see dsc.EExecutionUnit#getBody()
	 * @see #getEExecutionUnit()
	 * @generated
	 */
	EAttribute getEExecutionUnit_Body();

	/**
	 * Returns the meta object for enum '{@link dsc.EKind <em>EKind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EKind</em>'.
	 * @see dsc.EKind
	 * @generated
	 */
	EEnum getEKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DscFactory getDscFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsc.impl.dskImpl <em>dsk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsc.impl.dskImpl
		 * @see dsc.impl.DscPackageImpl#getdsk()
		 * @generated
		 */
		EClass DSK = eINSTANCE.getdsk();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSK__DOMAIN = eINSTANCE.getdsk_Domain();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__PROCEDURES = eINSTANCE.getdsk_Procedures();

		/**
		 * The meta object literal for the '{@link dsc.impl.EProcedureImpl <em>EProcedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsc.impl.EProcedureImpl
		 * @see dsc.impl.DscPackageImpl#getEProcedure()
		 * @generated
		 */
		EClass EPROCEDURE = eINSTANCE.getEProcedure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROCEDURE__ID = eINSTANCE.getEProcedure_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROCEDURE__NAME = eINSTANCE.getEProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Dsc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__DSC = eINSTANCE.getEProcedure_Dsc();

		/**
		 * The meta object literal for the '{@link dsc.impl.EDSCImpl <em>EDSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsc.impl.EDSCImpl
		 * @see dsc.impl.DscPackageImpl#getEDSC()
		 * @generated
		 */
		EClass EDSC = eINSTANCE.getEDSC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDSC__NAME = eINSTANCE.getEDSC_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDSC__KIND = eINSTANCE.getEDSC_Kind();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSC__IMPL = eINSTANCE.getEDSC_Impl();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSC__REFERENCE = eINSTANCE.getEDSC_Reference();

		/**
		 * The meta object literal for the '{@link dsc.impl.EExecutionUnitImpl <em>EExecution Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsc.impl.EExecutionUnitImpl
		 * @see dsc.impl.DscPackageImpl#getEExecutionUnit()
		 * @generated
		 */
		EClass EEXECUTION_UNIT = eINSTANCE.getEExecutionUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXECUTION_UNIT__ID = eINSTANCE.getEExecutionUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXECUTION_UNIT__BODY = eINSTANCE.getEExecutionUnit_Body();

		/**
		 * The meta object literal for the '{@link dsc.EKind <em>EKind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsc.EKind
		 * @see dsc.impl.DscPackageImpl#getEKind()
		 * @generated
		 */
		EEnum EKIND = eINSTANCE.getEKind();

	}

} //DscPackage
