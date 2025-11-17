/**
 */
package adapter.domain;

import dsk.DskPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see adapter.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/broker/adapter/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = adapter.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link adapter.domain.impl.DSEntityImpl <em>DS Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.domain.impl.DSEntityImpl
	 * @see adapter.domain.impl.DomainPackageImpl#getDSEntity()
	 * @generated
	 */
	int DS_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_ENTITY__COMMAND_PRIORITY = DskPackage.EDS_ENTITY__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_ENTITY__CMD = DskPackage.EDS_ENTITY__CMD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_ENTITY__NAME = DskPackage.EDS_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>DS Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_ENTITY_FEATURE_COUNT = DskPackage.EDS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DS Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_ENTITY_OPERATION_COUNT = DskPackage.EDS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adapter.domain.impl.DomainElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.domain.impl.DomainElementsImpl
	 * @see adapter.domain.impl.DomainPackageImpl#getDomainElements()
	 * @generated
	 */
	int DOMAIN_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENTS__ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link adapter.domain.DSEntity <em>DS Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS Entity</em>'.
	 * @see adapter.domain.DSEntity
	 * @generated
	 */
	EClass getDSEntity();

	/**
	 * Returns the meta object for class '{@link adapter.domain.DomainElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see adapter.domain.DomainElements
	 * @generated
	 */
	EClass getDomainElements();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.domain.DomainElements#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see adapter.domain.DomainElements#getEntities()
	 * @see #getDomainElements()
	 * @generated
	 */
	EReference getDomainElements_Entities();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link adapter.domain.impl.DSEntityImpl <em>DS Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.domain.impl.DSEntityImpl
		 * @see adapter.domain.impl.DomainPackageImpl#getDSEntity()
		 * @generated
		 */
		EClass DS_ENTITY = eINSTANCE.getDSEntity();

		/**
		 * The meta object literal for the '{@link adapter.domain.impl.DomainElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.domain.impl.DomainElementsImpl
		 * @see adapter.domain.impl.DomainPackageImpl#getDomainElements()
		 * @generated
		 */
		EClass DOMAIN_ELEMENTS = eINSTANCE.getDomainElements();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENTS__ENTITIES = eINSTANCE.getDomainElements_Entities();

	}

} //DomainPackage
