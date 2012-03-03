/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.x.xocl.domainmodel.DomainmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DomainmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://x.com/xocl/XOCL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelPackage eINSTANCE = com.x.xocl.domainmodel.impl.DomainmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.DomainmodelImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TopLevelElementImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTopLevelElement()
   * @generated
   */
  int TOP_LEVEL_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Top Level Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ImportImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__PACKAGE = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.PackageImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__VERSION = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ELEMENTS = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.VersionStringImpl <em>Version String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.VersionStringImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getVersionString()
   * @generated
   */
  int VERSION_STRING = 4;

  /**
   * The number of structural features of the '<em>Version String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_STRING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl <em>Two Part Version String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoPartVersionString()
   * @generated
   */
  int TWO_PART_VERSION_STRING = 5;

  /**
   * The feature id for the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_PART_VERSION_STRING__MAJOR = VERSION_STRING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_PART_VERSION_STRING__MINOR = VERSION_STRING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Release</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_PART_VERSION_STRING__RELEASE = VERSION_STRING_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Build</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_PART_VERSION_STRING__BUILD = VERSION_STRING_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Two Part Version String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_PART_VERSION_STRING_FEATURE_COUNT = VERSION_STRING_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.FourPartVersionStringImpl <em>Four Part Version String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.FourPartVersionStringImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getFourPartVersionString()
   * @generated
   */
  int FOUR_PART_VERSION_STRING = 6;

  /**
   * The number of structural features of the '<em>Four Part Version String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOUR_PART_VERSION_STRING_FEATURE_COUNT = VERSION_STRING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.PackageElementImpl <em>Package Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.PackageElementImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPackageElement()
   * @generated
   */
  int PACKAGE_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.PartnerImpl <em>Partner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.PartnerImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPartner()
   * @generated
   */
  int PARTNER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTNER__NAME = PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTNER__RESPONSIBILITIES = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Partner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTNER_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ProcessImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__ROLES = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__DESCRIPTION = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Preconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PRECONDITIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__POSTCONDITIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowRoleReferenceImpl <em>Workflow Role Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowRoleReferenceImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRoleReference()
   * @generated
   */
  int WORKFLOW_ROLE_REFERENCE = 39;

  /**
   * The number of structural features of the '<em>Workflow Role Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ROLE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ProcessRoleImpl <em>Process Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ProcessRoleImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProcessRole()
   * @generated
   */
  int PROCESS_ROLE = 10;

  /**
   * The number of structural features of the '<em>Process Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ROLE_FEATURE_COUNT = WORKFLOW_ROLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.RoleImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRole()
   * @generated
   */
  int ROLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = PROCESS_ROLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = PROCESS_ROLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.PreconditionsImpl <em>Preconditions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.PreconditionsImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPreconditions()
   * @generated
   */
  int PRECONDITIONS = 12;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITIONS__CONDITIONS = 0;

  /**
   * The number of structural features of the '<em>Preconditions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.EntityImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__STATES = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.EntityStateImpl <em>Entity State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.EntityStateImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEntityState()
   * @generated
   */
  int ENTITY_STATE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_STATE__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Entity State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.EntityStateTransitionImpl <em>Entity State Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.EntityStateTransitionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEntityStateTransition()
   * @generated
   */
  int ENTITY_STATE_TRANSITION = 15;

  /**
   * The feature id for the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_STATE_TRANSITION__SUCCESSOR = 0;

  /**
   * The number of structural features of the '<em>Entity State Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_STATE_TRANSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.PostconditionsImpl <em>Postconditions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.PostconditionsImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPostconditions()
   * @generated
   */
  int POSTCONDITIONS = 16;

  /**
   * The feature id for the '<em><b>Success</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTCONDITIONS__SUCCESS = 0;

  /**
   * The feature id for the '<em><b>Failure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTCONDITIONS__FAILURE = 1;

  /**
   * The number of structural features of the '<em>Postconditions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTCONDITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.OnProcessResultImpl <em>On Process Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.OnProcessResultImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOnProcessResult()
   * @generated
   */
  int ON_PROCESS_RESULT = 17;

  /**
   * The feature id for the '<em><b>Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_PROCESS_RESULT__RESULTS = 0;

  /**
   * The number of structural features of the '<em>On Process Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_PROCESS_RESULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.OnProcessSuccessImpl <em>On Process Success</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.OnProcessSuccessImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOnProcessSuccess()
   * @generated
   */
  int ON_PROCESS_SUCCESS = 18;

  /**
   * The feature id for the '<em><b>Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_PROCESS_SUCCESS__RESULTS = ON_PROCESS_RESULT__RESULTS;

  /**
   * The number of structural features of the '<em>On Process Success</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_PROCESS_SUCCESS_FEATURE_COUNT = ON_PROCESS_RESULT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.OnProcessFailureImpl <em>On Process Failure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.OnProcessFailureImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOnProcessFailure()
   * @generated
   */
  int ON_PROCESS_FAILURE = 19;

  /**
   * The feature id for the '<em><b>Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_PROCESS_FAILURE__RESULTS = ON_PROCESS_RESULT__RESULTS;

  /**
   * The number of structural features of the '<em>On Process Failure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_PROCESS_FAILURE_FEATURE_COUNT = ON_PROCESS_RESULT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowImpl <em>Workflow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflow()
   * @generated
   */
  int WORKFLOW = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__NAME = PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__VARIANTS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__ROLES = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW__CONTENTS = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Workflow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowVariantImpl <em>Workflow Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowVariantImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowVariant()
   * @generated
   */
  int WORKFLOW_VARIANT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_VARIANT__NAME = 0;

  /**
   * The number of structural features of the '<em>Workflow Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_VARIANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowRolesImpl <em>Workflow Roles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowRolesImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRoles()
   * @generated
   */
  int WORKFLOW_ROLES = 22;

  /**
   * The number of structural features of the '<em>Workflow Roles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ROLES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.RoleDeclarationsImpl <em>Role Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.RoleDeclarationsImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRoleDeclarations()
   * @generated
   */
  int ROLE_DECLARATIONS = 23;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_DECLARATIONS__ROLES = WORKFLOW_ROLES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_DECLARATIONS_FEATURE_COUNT = WORKFLOW_ROLES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowRoleImpl <em>Workflow Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowRoleImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRole()
   * @generated
   */
  int WORKFLOW_ROLE = 24;

  /**
   * The number of structural features of the '<em>Workflow Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ROLE_FEATURE_COUNT = WORKFLOW_ROLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ProcessReferenceImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProcessReference()
   * @generated
   */
  int PROCESS_REFERENCE = 25;

  /**
   * The feature id for the '<em><b>Implements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE__IMPLEMENTS = WORKFLOW_ROLES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Process Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_REFERENCE_FEATURE_COUNT = WORKFLOW_ROLES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowBlockImpl <em>Workflow Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowBlockImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowBlock()
   * @generated
   */
  int WORKFLOW_BLOCK = 26;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_BLOCK__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Workflow Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.EndPointImpl <em>End Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.EndPointImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEndPoint()
   * @generated
   */
  int END_POINT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT__NAME = 0;

  /**
   * The number of structural features of the '<em>End Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_POINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowElementImpl <em>Workflow Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowElementImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowElement()
   * @generated
   */
  int WORKFLOW_ELEMENT = 28;

  /**
   * The number of structural features of the '<em>Workflow Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowBranchImpl <em>Workflow Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowBranchImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowBranch()
   * @generated
   */
  int WORKFLOW_BRANCH = 29;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_BRANCH__CONDITIONS = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Workflow Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_BRANCH_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.BranchConditionImpl <em>Branch Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.BranchConditionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getBranchCondition()
   * @generated
   */
  int BRANCH_CONDITION = 30;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_CONDITION__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Branch Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowActionImpl <em>Workflow Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowActionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowAction()
   * @generated
   */
  int WORKFLOW_ACTION = 31;

  /**
   * The number of structural features of the '<em>Workflow Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ACTION_FEATURE_COUNT = WORKFLOW_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TransactionCallImpl <em>Transaction Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TransactionCallImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransactionCall()
   * @generated
   */
  int TRANSACTION_CALL = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_CALL__NAME = WORKFLOW_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_CALL__VARIANTS = WORKFLOW_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sender</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_CALL__SENDER = WORKFLOW_ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_CALL__RECEIVER = WORKFLOW_ACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Transaction Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_CALL_FEATURE_COUNT = WORKFLOW_ACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TransactionVariantMappingImpl <em>Transaction Variant Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TransactionVariantMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransactionVariantMapping()
   * @generated
   */
  int TRANSACTION_VARIANT_MAPPING = 33;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_VARIANT_MAPPING__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_VARIANT_MAPPING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Transaction Variant Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_VARIANT_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.SenderRoleMappingImpl <em>Sender Role Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.SenderRoleMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getSenderRoleMapping()
   * @generated
   */
  int SENDER_ROLE_MAPPING = 34;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDER_ROLE_MAPPING__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDER_ROLE_MAPPING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Sender Role Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDER_ROLE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ReceiverRoleMappingImpl <em>Receiver Role Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ReceiverRoleMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getReceiverRoleMapping()
   * @generated
   */
  int RECEIVER_ROLE_MAPPING = 35;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVER_ROLE_MAPPING__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVER_ROLE_MAPPING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Receiver Role Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVER_ROLE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowCallImpl <em>Workflow Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowCallImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowCall()
   * @generated
   */
  int WORKFLOW_CALL = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_CALL__NAME = WORKFLOW_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_CALL__VARIANTS = WORKFLOW_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_CALL__ROLES = WORKFLOW_ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Workflow Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_CALL_FEATURE_COUNT = WORKFLOW_ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowVariantMappingImpl <em>Workflow Variant Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowVariantMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowVariantMapping()
   * @generated
   */
  int WORKFLOW_VARIANT_MAPPING = 37;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_VARIANT_MAPPING__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_VARIANT_MAPPING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Workflow Variant Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_VARIANT_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.WorkflowRoleMappingImpl <em>Workflow Role Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.WorkflowRoleMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRoleMapping()
   * @generated
   */
  int WORKFLOW_ROLE_MAPPING = 38;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ROLE_MAPPING__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ROLE_MAPPING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Workflow Role Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_ROLE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TransactionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACTION = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__NAME = PACKAGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__VARIANTS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__POSTCONDITIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.InformTransactionImpl <em>Inform Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.InformTransactionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getInformTransaction()
   * @generated
   */
  int INFORM_TRANSACTION = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORM_TRANSACTION__NAME = TRANSACTION__NAME;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORM_TRANSACTION__VARIANTS = TRANSACTION__VARIANTS;

  /**
   * The feature id for the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORM_TRANSACTION__POSTCONDITIONS = TRANSACTION__POSTCONDITIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORM_TRANSACTION__PATTERN = TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Send Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORM_TRANSACTION__SEND_ACTION = TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inform Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORM_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TransactionVariantImpl <em>Transaction Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TransactionVariantImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransactionVariant()
   * @generated
   */
  int TRANSACTION_VARIANT = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_VARIANT__NAME = 0;

  /**
   * The number of structural features of the '<em>Transaction Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_VARIANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.DatagramActionImpl <em>Datagram Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.DatagramActionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getDatagramAction()
   * @generated
   */
  int DATAGRAM_ACTION = 43;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAGRAM_ACTION__MESSAGES = 0;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAGRAM_ACTION__REQUIRES = 1;

  /**
   * The number of structural features of the '<em>Datagram Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAGRAM_ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.VariantMessageMappingsImpl <em>Variant Message Mappings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.VariantMessageMappingsImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getVariantMessageMappings()
   * @generated
   */
  int VARIANT_MESSAGE_MAPPINGS = 44;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_MESSAGE_MAPPINGS__VARIANTS = 0;

  /**
   * The number of structural features of the '<em>Variant Message Mappings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_MESSAGE_MAPPINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.VariantMessageMappingImpl <em>Variant Message Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.VariantMessageMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getVariantMessageMapping()
   * @generated
   */
  int VARIANT_MESSAGE_MAPPING = 45;

  /**
   * The feature id for the '<em><b>Variant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_MESSAGE_MAPPING__VARIANT = 0;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_MESSAGE_MAPPING__MAPPINGS = 1;

  /**
   * The number of structural features of the '<em>Variant Message Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_MESSAGE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.MessageMappingImpl <em>Message Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.MessageMappingImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getMessageMapping()
   * @generated
   */
  int MESSAGE_MAPPING = 46;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_MAPPING__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_MAPPING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Message Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.RequiredFeaturesImpl <em>Required Features</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.RequiredFeaturesImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRequiredFeatures()
   * @generated
   */
  int REQUIRED_FEATURES = 47;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_FEATURES__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Required Features</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_FEATURES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.RequiredFeatureImpl <em>Required Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.RequiredFeatureImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRequiredFeature()
   * @generated
   */
  int REQUIRED_FEATURE = 48;

  /**
   * The number of structural features of the '<em>Required Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.AuthorizationFeatureImpl <em>Authorization Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.AuthorizationFeatureImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getAuthorizationFeature()
   * @generated
   */
  int AUTHORIZATION_FEATURE = 49;

  /**
   * The feature id for the '<em><b>Authorization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHORIZATION_FEATURE__AUTHORIZATION = REQUIRED_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Authorization Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHORIZATION_FEATURE_FEATURE_COUNT = REQUIRED_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.NonRepudiationFeatureImpl <em>Non Repudiation Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.NonRepudiationFeatureImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getNonRepudiationFeature()
   * @generated
   */
  int NON_REPUDIATION_FEATURE = 50;

  /**
   * The feature id for the '<em><b>Nonrepudiation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_REPUDIATION_FEATURE__NONREPUDIATION = REQUIRED_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Non Repudiation Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_REPUDIATION_FEATURE_FEATURE_COUNT = REQUIRED_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.NotifyTransactionImpl <em>Notify Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.NotifyTransactionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getNotifyTransaction()
   * @generated
   */
  int NOTIFY_TRANSACTION = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFY_TRANSACTION__NAME = TRANSACTION__NAME;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFY_TRANSACTION__VARIANTS = TRANSACTION__VARIANTS;

  /**
   * The feature id for the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFY_TRANSACTION__POSTCONDITIONS = TRANSACTION__POSTCONDITIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFY_TRANSACTION__PATTERN = TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Send Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFY_TRANSACTION__SEND_ACTION = TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Notify Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFY_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.OneWayActionImpl <em>One Way Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.OneWayActionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOneWayAction()
   * @generated
   */
  int ONE_WAY_ACTION = 52;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_ACTION__MESSAGES = 0;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_ACTION__REQUIRES = 1;

  /**
   * The feature id for the '<em><b>Timeouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_ACTION__TIMEOUTS = 2;

  /**
   * The feature id for the '<em><b>Retries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_ACTION__RETRIES = 3;

  /**
   * The number of structural features of the '<em>One Way Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.OneWayTimeOutsImpl <em>One Way Time Outs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.OneWayTimeOutsImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOneWayTimeOuts()
   * @generated
   */
  int ONE_WAY_TIME_OUTS = 53;

  /**
   * The feature id for the '<em><b>Timeouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_TIME_OUTS__TIMEOUTS = 0;

  /**
   * The number of structural features of the '<em>One Way Time Outs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_TIME_OUTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TwoWayTimeOutImpl <em>Two Way Time Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TwoWayTimeOutImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoWayTimeOut()
   * @generated
   */
  int TWO_WAY_TIME_OUT = 61;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_TIME_OUT__TIMEOUT = 0;

  /**
   * The number of structural features of the '<em>Two Way Time Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_TIME_OUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.OneWayTimeOutImpl <em>One Way Time Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.OneWayTimeOutImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOneWayTimeOut()
   * @generated
   */
  int ONE_WAY_TIME_OUT = 54;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_TIME_OUT__TIMEOUT = TWO_WAY_TIME_OUT__TIMEOUT;

  /**
   * The number of structural features of the '<em>One Way Time Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_WAY_TIME_OUT_FEATURE_COUNT = TWO_WAY_TIME_OUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ReceiptAckTimeOutImpl <em>Receipt Ack Time Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ReceiptAckTimeOutImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getReceiptAckTimeOut()
   * @generated
   */
  int RECEIPT_ACK_TIME_OUT = 55;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIPT_ACK_TIME_OUT__TIMEOUT = ONE_WAY_TIME_OUT__TIMEOUT;

  /**
   * The number of structural features of the '<em>Receipt Ack Time Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIPT_ACK_TIME_OUT_FEATURE_COUNT = ONE_WAY_TIME_OUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TimeOutImpl <em>Time Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TimeOutImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTimeOut()
   * @generated
   */
  int TIME_OUT = 56;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OUT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OUT__UNIT = 1;

  /**
   * The number of structural features of the '<em>Time Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ValidationAckTimeOutImpl <em>Validation Ack Time Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ValidationAckTimeOutImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getValidationAckTimeOut()
   * @generated
   */
  int VALIDATION_ACK_TIME_OUT = 57;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_ACK_TIME_OUT__TIMEOUT = ONE_WAY_TIME_OUT__TIMEOUT;

  /**
   * The number of structural features of the '<em>Validation Ack Time Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_ACK_TIME_OUT_FEATURE_COUNT = ONE_WAY_TIME_OUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.RequestTransactionImpl <em>Request Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.RequestTransactionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRequestTransaction()
   * @generated
   */
  int REQUEST_TRANSACTION = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION__NAME = TRANSACTION__NAME;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION__VARIANTS = TRANSACTION__VARIANTS;

  /**
   * The feature id for the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION__POSTCONDITIONS = TRANSACTION__POSTCONDITIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION__PATTERN = TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Send Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION__SEND_ACTION = TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Receive Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION__RECEIVE_ACTION = TRANSACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Request Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TwoWayActionImpl <em>Two Way Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TwoWayActionImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoWayAction()
   * @generated
   */
  int TWO_WAY_ACTION = 59;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_ACTION__MESSAGES = 0;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_ACTION__REQUIRES = 1;

  /**
   * The feature id for the '<em><b>Timeouts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_ACTION__TIMEOUTS = 2;

  /**
   * The feature id for the '<em><b>Retries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_ACTION__RETRIES = 3;

  /**
   * The number of structural features of the '<em>Two Way Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.TwoWayTimeOutsImpl <em>Two Way Time Outs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.TwoWayTimeOutsImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoWayTimeOuts()
   * @generated
   */
  int TWO_WAY_TIME_OUTS = 60;

  /**
   * The feature id for the '<em><b>Timeouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_TIME_OUTS__TIMEOUTS = 0;

  /**
   * The number of structural features of the '<em>Two Way Time Outs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_WAY_TIME_OUTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ResponseTimeOutImpl <em>Response Time Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ResponseTimeOutImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getResponseTimeOut()
   * @generated
   */
  int RESPONSE_TIME_OUT = 62;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TIME_OUT__TIMEOUT = TWO_WAY_TIME_OUT__TIMEOUT;

  /**
   * The number of structural features of the '<em>Response Time Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_TIME_OUT_FEATURE_COUNT = TWO_WAY_TIME_OUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ProtocolImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 63;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = PACKAGE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ProtocolReferenceImpl <em>Protocol Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ProtocolReferenceImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProtocolReference()
   * @generated
   */
  int PROTOCOL_REFERENCE = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_REFERENCE__NAME = PROTOCOL__NAME;

  /**
   * The number of structural features of the '<em>Protocol Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_REFERENCE_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.impl.ProtocolDeclarationImpl <em>Protocol Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.impl.ProtocolDeclarationImpl
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProtocolDeclaration()
   * @generated
   */
  int PROTOCOL_DECLARATION = 65;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DECLARATION__NAME = PROTOCOL__NAME;

  /**
   * The feature id for the '<em><b>Messages</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DECLARATION__MESSAGES = PROTOCOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Protocol Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_DECLARATION_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.TimeUnit <em>Time Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.TimeUnit
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTimeUnit()
   * @generated
   */
  int TIME_UNIT = 66;

  /**
   * The meta object id for the '{@link com.x.xocl.domainmodel.Pattern <em>Pattern</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.x.xocl.domainmodel.Pattern
   * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 67;


  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see com.x.xocl.domainmodel.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.x.xocl.domainmodel.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Element</em>'.
   * @see com.x.xocl.domainmodel.TopLevelElement
   * @generated
   */
  EClass getTopLevelElement();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.x.xocl.domainmodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.Import#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see com.x.xocl.domainmodel.Import#getPackage()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Package();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see com.x.xocl.domainmodel.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Package#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see com.x.xocl.domainmodel.Package#getVersion()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Version();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.Package#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.x.xocl.domainmodel.Package#getElements()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Elements();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.VersionString <em>Version String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version String</em>'.
   * @see com.x.xocl.domainmodel.VersionString
   * @generated
   */
  EClass getVersionString();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TwoPartVersionString <em>Two Part Version String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Part Version String</em>'.
   * @see com.x.xocl.domainmodel.TwoPartVersionString
   * @generated
   */
  EClass getTwoPartVersionString();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TwoPartVersionString#getMajor <em>Major</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Major</em>'.
   * @see com.x.xocl.domainmodel.TwoPartVersionString#getMajor()
   * @see #getTwoPartVersionString()
   * @generated
   */
  EAttribute getTwoPartVersionString_Major();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TwoPartVersionString#getMinor <em>Minor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minor</em>'.
   * @see com.x.xocl.domainmodel.TwoPartVersionString#getMinor()
   * @see #getTwoPartVersionString()
   * @generated
   */
  EAttribute getTwoPartVersionString_Minor();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TwoPartVersionString#getRelease <em>Release</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Release</em>'.
   * @see com.x.xocl.domainmodel.TwoPartVersionString#getRelease()
   * @see #getTwoPartVersionString()
   * @generated
   */
  EAttribute getTwoPartVersionString_Release();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TwoPartVersionString#getBuild <em>Build</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Build</em>'.
   * @see com.x.xocl.domainmodel.TwoPartVersionString#getBuild()
   * @see #getTwoPartVersionString()
   * @generated
   */
  EAttribute getTwoPartVersionString_Build();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.FourPartVersionString <em>Four Part Version String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Four Part Version String</em>'.
   * @see com.x.xocl.domainmodel.FourPartVersionString
   * @generated
   */
  EClass getFourPartVersionString();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.PackageElement <em>Package Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Element</em>'.
   * @see com.x.xocl.domainmodel.PackageElement
   * @generated
   */
  EClass getPackageElement();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.PackageElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.PackageElement#getName()
   * @see #getPackageElement()
   * @generated
   */
  EAttribute getPackageElement_Name();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Partner <em>Partner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partner</em>'.
   * @see com.x.xocl.domainmodel.Partner
   * @generated
   */
  EClass getPartner();

  /**
   * Returns the meta object for the reference list '{@link com.x.xocl.domainmodel.Partner#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Responsibilities</em>'.
   * @see com.x.xocl.domainmodel.Partner#getResponsibilities()
   * @see #getPartner()
   * @generated
   */
  EReference getPartner_Responsibilities();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see com.x.xocl.domainmodel.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.Process#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see com.x.xocl.domainmodel.Process#getRoles()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Roles();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.Process#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.x.xocl.domainmodel.Process#getDescription()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Description();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Process#getPreconditions <em>Preconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preconditions</em>'.
   * @see com.x.xocl.domainmodel.Process#getPreconditions()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Preconditions();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Process#getPostconditions <em>Postconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postconditions</em>'.
   * @see com.x.xocl.domainmodel.Process#getPostconditions()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Postconditions();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ProcessRole <em>Process Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Role</em>'.
   * @see com.x.xocl.domainmodel.ProcessRole
   * @generated
   */
  EClass getProcessRole();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see com.x.xocl.domainmodel.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Preconditions <em>Preconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preconditions</em>'.
   * @see com.x.xocl.domainmodel.Preconditions
   * @generated
   */
  EClass getPreconditions();

  /**
   * Returns the meta object for the reference list '{@link com.x.xocl.domainmodel.Preconditions#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conditions</em>'.
   * @see com.x.xocl.domainmodel.Preconditions#getConditions()
   * @see #getPreconditions()
   * @generated
   */
  EReference getPreconditions_Conditions();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.x.xocl.domainmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.Entity#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see com.x.xocl.domainmodel.Entity#getStates()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_States();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.EntityState <em>Entity State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity State</em>'.
   * @see com.x.xocl.domainmodel.EntityState
   * @generated
   */
  EClass getEntityState();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.EntityState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.EntityState#getName()
   * @see #getEntityState()
   * @generated
   */
  EAttribute getEntityState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.EntityState#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see com.x.xocl.domainmodel.EntityState#getTransitions()
   * @see #getEntityState()
   * @generated
   */
  EReference getEntityState_Transitions();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.EntityStateTransition <em>Entity State Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity State Transition</em>'.
   * @see com.x.xocl.domainmodel.EntityStateTransition
   * @generated
   */
  EClass getEntityStateTransition();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.EntityStateTransition#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Successor</em>'.
   * @see com.x.xocl.domainmodel.EntityStateTransition#getSuccessor()
   * @see #getEntityStateTransition()
   * @generated
   */
  EReference getEntityStateTransition_Successor();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Postconditions <em>Postconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postconditions</em>'.
   * @see com.x.xocl.domainmodel.Postconditions
   * @generated
   */
  EClass getPostconditions();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Postconditions#getSuccess <em>Success</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Success</em>'.
   * @see com.x.xocl.domainmodel.Postconditions#getSuccess()
   * @see #getPostconditions()
   * @generated
   */
  EReference getPostconditions_Success();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Postconditions#getFailure <em>Failure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Failure</em>'.
   * @see com.x.xocl.domainmodel.Postconditions#getFailure()
   * @see #getPostconditions()
   * @generated
   */
  EReference getPostconditions_Failure();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.OnProcessResult <em>On Process Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>On Process Result</em>'.
   * @see com.x.xocl.domainmodel.OnProcessResult
   * @generated
   */
  EClass getOnProcessResult();

  /**
   * Returns the meta object for the reference list '{@link com.x.xocl.domainmodel.OnProcessResult#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Results</em>'.
   * @see com.x.xocl.domainmodel.OnProcessResult#getResults()
   * @see #getOnProcessResult()
   * @generated
   */
  EReference getOnProcessResult_Results();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.OnProcessSuccess <em>On Process Success</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>On Process Success</em>'.
   * @see com.x.xocl.domainmodel.OnProcessSuccess
   * @generated
   */
  EClass getOnProcessSuccess();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.OnProcessFailure <em>On Process Failure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>On Process Failure</em>'.
   * @see com.x.xocl.domainmodel.OnProcessFailure
   * @generated
   */
  EClass getOnProcessFailure();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Workflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow</em>'.
   * @see com.x.xocl.domainmodel.Workflow
   * @generated
   */
  EClass getWorkflow();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.Workflow#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see com.x.xocl.domainmodel.Workflow#getVariants()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Variants();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Workflow#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Roles</em>'.
   * @see com.x.xocl.domainmodel.Workflow#getRoles()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Roles();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Workflow#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contents</em>'.
   * @see com.x.xocl.domainmodel.Workflow#getContents()
   * @see #getWorkflow()
   * @generated
   */
  EReference getWorkflow_Contents();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowVariant <em>Workflow Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Variant</em>'.
   * @see com.x.xocl.domainmodel.WorkflowVariant
   * @generated
   */
  EClass getWorkflowVariant();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.WorkflowVariant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.WorkflowVariant#getName()
   * @see #getWorkflowVariant()
   * @generated
   */
  EAttribute getWorkflowVariant_Name();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowRoles <em>Workflow Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Roles</em>'.
   * @see com.x.xocl.domainmodel.WorkflowRoles
   * @generated
   */
  EClass getWorkflowRoles();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.RoleDeclarations <em>Role Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Declarations</em>'.
   * @see com.x.xocl.domainmodel.RoleDeclarations
   * @generated
   */
  EClass getRoleDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.RoleDeclarations#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see com.x.xocl.domainmodel.RoleDeclarations#getRoles()
   * @see #getRoleDeclarations()
   * @generated
   */
  EReference getRoleDeclarations_Roles();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowRole <em>Workflow Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Role</em>'.
   * @see com.x.xocl.domainmodel.WorkflowRole
   * @generated
   */
  EClass getWorkflowRole();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Reference</em>'.
   * @see com.x.xocl.domainmodel.ProcessReference
   * @generated
   */
  EClass getProcessReference();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.ProcessReference#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Implements</em>'.
   * @see com.x.xocl.domainmodel.ProcessReference#getImplements()
   * @see #getProcessReference()
   * @generated
   */
  EReference getProcessReference_Implements();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowBlock <em>Workflow Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Block</em>'.
   * @see com.x.xocl.domainmodel.WorkflowBlock
   * @generated
   */
  EClass getWorkflowBlock();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.WorkflowBlock#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.x.xocl.domainmodel.WorkflowBlock#getElements()
   * @see #getWorkflowBlock()
   * @generated
   */
  EReference getWorkflowBlock_Elements();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.EndPoint <em>End Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Point</em>'.
   * @see com.x.xocl.domainmodel.EndPoint
   * @generated
   */
  EClass getEndPoint();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.EndPoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.EndPoint#getName()
   * @see #getEndPoint()
   * @generated
   */
  EAttribute getEndPoint_Name();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowElement <em>Workflow Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Element</em>'.
   * @see com.x.xocl.domainmodel.WorkflowElement
   * @generated
   */
  EClass getWorkflowElement();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowBranch <em>Workflow Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Branch</em>'.
   * @see com.x.xocl.domainmodel.WorkflowBranch
   * @generated
   */
  EClass getWorkflowBranch();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.WorkflowBranch#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see com.x.xocl.domainmodel.WorkflowBranch#getConditions()
   * @see #getWorkflowBranch()
   * @generated
   */
  EReference getWorkflowBranch_Conditions();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.BranchCondition <em>Branch Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch Condition</em>'.
   * @see com.x.xocl.domainmodel.BranchCondition
   * @generated
   */
  EClass getBranchCondition();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.BranchCondition#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contents</em>'.
   * @see com.x.xocl.domainmodel.BranchCondition#getContents()
   * @see #getBranchCondition()
   * @generated
   */
  EReference getBranchCondition_Contents();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowAction <em>Workflow Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Action</em>'.
   * @see com.x.xocl.domainmodel.WorkflowAction
   * @generated
   */
  EClass getWorkflowAction();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TransactionCall <em>Transaction Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction Call</em>'.
   * @see com.x.xocl.domainmodel.TransactionCall
   * @generated
   */
  EClass getTransactionCall();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.TransactionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.TransactionCall#getName()
   * @see #getTransactionCall()
   * @generated
   */
  EReference getTransactionCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.TransactionCall#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see com.x.xocl.domainmodel.TransactionCall#getVariants()
   * @see #getTransactionCall()
   * @generated
   */
  EReference getTransactionCall_Variants();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.TransactionCall#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sender</em>'.
   * @see com.x.xocl.domainmodel.TransactionCall#getSender()
   * @see #getTransactionCall()
   * @generated
   */
  EReference getTransactionCall_Sender();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.TransactionCall#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see com.x.xocl.domainmodel.TransactionCall#getReceiver()
   * @see #getTransactionCall()
   * @generated
   */
  EReference getTransactionCall_Receiver();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TransactionVariantMapping <em>Transaction Variant Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction Variant Mapping</em>'.
   * @see com.x.xocl.domainmodel.TransactionVariantMapping
   * @generated
   */
  EClass getTransactionVariantMapping();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.TransactionVariantMapping#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see com.x.xocl.domainmodel.TransactionVariantMapping#getParameter()
   * @see #getTransactionVariantMapping()
   * @generated
   */
  EReference getTransactionVariantMapping_Parameter();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.TransactionVariantMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.TransactionVariantMapping#getValue()
   * @see #getTransactionVariantMapping()
   * @generated
   */
  EReference getTransactionVariantMapping_Value();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.SenderRoleMapping <em>Sender Role Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sender Role Mapping</em>'.
   * @see com.x.xocl.domainmodel.SenderRoleMapping
   * @generated
   */
  EClass getSenderRoleMapping();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.SenderRoleMapping#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see com.x.xocl.domainmodel.SenderRoleMapping#getParameter()
   * @see #getSenderRoleMapping()
   * @generated
   */
  EAttribute getSenderRoleMapping_Parameter();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.SenderRoleMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.SenderRoleMapping#getValue()
   * @see #getSenderRoleMapping()
   * @generated
   */
  EReference getSenderRoleMapping_Value();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ReceiverRoleMapping <em>Receiver Role Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Receiver Role Mapping</em>'.
   * @see com.x.xocl.domainmodel.ReceiverRoleMapping
   * @generated
   */
  EClass getReceiverRoleMapping();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.ReceiverRoleMapping#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see com.x.xocl.domainmodel.ReceiverRoleMapping#getParameter()
   * @see #getReceiverRoleMapping()
   * @generated
   */
  EAttribute getReceiverRoleMapping_Parameter();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.ReceiverRoleMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.ReceiverRoleMapping#getValue()
   * @see #getReceiverRoleMapping()
   * @generated
   */
  EReference getReceiverRoleMapping_Value();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowCall <em>Workflow Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Call</em>'.
   * @see com.x.xocl.domainmodel.WorkflowCall
   * @generated
   */
  EClass getWorkflowCall();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.WorkflowCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.WorkflowCall#getName()
   * @see #getWorkflowCall()
   * @generated
   */
  EReference getWorkflowCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.WorkflowCall#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see com.x.xocl.domainmodel.WorkflowCall#getVariants()
   * @see #getWorkflowCall()
   * @generated
   */
  EReference getWorkflowCall_Variants();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.WorkflowCall#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see com.x.xocl.domainmodel.WorkflowCall#getRoles()
   * @see #getWorkflowCall()
   * @generated
   */
  EReference getWorkflowCall_Roles();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowVariantMapping <em>Workflow Variant Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Variant Mapping</em>'.
   * @see com.x.xocl.domainmodel.WorkflowVariantMapping
   * @generated
   */
  EClass getWorkflowVariantMapping();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.WorkflowVariantMapping#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see com.x.xocl.domainmodel.WorkflowVariantMapping#getParameter()
   * @see #getWorkflowVariantMapping()
   * @generated
   */
  EReference getWorkflowVariantMapping_Parameter();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.WorkflowVariantMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.WorkflowVariantMapping#getValue()
   * @see #getWorkflowVariantMapping()
   * @generated
   */
  EReference getWorkflowVariantMapping_Value();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowRoleMapping <em>Workflow Role Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Role Mapping</em>'.
   * @see com.x.xocl.domainmodel.WorkflowRoleMapping
   * @generated
   */
  EClass getWorkflowRoleMapping();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.WorkflowRoleMapping#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see com.x.xocl.domainmodel.WorkflowRoleMapping#getParameter()
   * @see #getWorkflowRoleMapping()
   * @generated
   */
  EReference getWorkflowRoleMapping_Parameter();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.WorkflowRoleMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.WorkflowRoleMapping#getValue()
   * @see #getWorkflowRoleMapping()
   * @generated
   */
  EReference getWorkflowRoleMapping_Value();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.WorkflowRoleReference <em>Workflow Role Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Role Reference</em>'.
   * @see com.x.xocl.domainmodel.WorkflowRoleReference
   * @generated
   */
  EClass getWorkflowRoleReference();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see com.x.xocl.domainmodel.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.Transaction#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see com.x.xocl.domainmodel.Transaction#getVariants()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Variants();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.Transaction#getPostconditions <em>Postconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postconditions</em>'.
   * @see com.x.xocl.domainmodel.Transaction#getPostconditions()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Postconditions();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.InformTransaction <em>Inform Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inform Transaction</em>'.
   * @see com.x.xocl.domainmodel.InformTransaction
   * @generated
   */
  EClass getInformTransaction();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.InformTransaction#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see com.x.xocl.domainmodel.InformTransaction#getPattern()
   * @see #getInformTransaction()
   * @generated
   */
  EAttribute getInformTransaction_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.InformTransaction#getSendAction <em>Send Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Send Action</em>'.
   * @see com.x.xocl.domainmodel.InformTransaction#getSendAction()
   * @see #getInformTransaction()
   * @generated
   */
  EReference getInformTransaction_SendAction();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TransactionVariant <em>Transaction Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction Variant</em>'.
   * @see com.x.xocl.domainmodel.TransactionVariant
   * @generated
   */
  EClass getTransactionVariant();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TransactionVariant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.x.xocl.domainmodel.TransactionVariant#getName()
   * @see #getTransactionVariant()
   * @generated
   */
  EAttribute getTransactionVariant_Name();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.DatagramAction <em>Datagram Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datagram Action</em>'.
   * @see com.x.xocl.domainmodel.DatagramAction
   * @generated
   */
  EClass getDatagramAction();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.DatagramAction#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see com.x.xocl.domainmodel.DatagramAction#getMessages()
   * @see #getDatagramAction()
   * @generated
   */
  EReference getDatagramAction_Messages();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.DatagramAction#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requires</em>'.
   * @see com.x.xocl.domainmodel.DatagramAction#getRequires()
   * @see #getDatagramAction()
   * @generated
   */
  EReference getDatagramAction_Requires();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.VariantMessageMappings <em>Variant Message Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant Message Mappings</em>'.
   * @see com.x.xocl.domainmodel.VariantMessageMappings
   * @generated
   */
  EClass getVariantMessageMappings();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.VariantMessageMappings#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see com.x.xocl.domainmodel.VariantMessageMappings#getVariants()
   * @see #getVariantMessageMappings()
   * @generated
   */
  EReference getVariantMessageMappings_Variants();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.VariantMessageMapping <em>Variant Message Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant Message Mapping</em>'.
   * @see com.x.xocl.domainmodel.VariantMessageMapping
   * @generated
   */
  EClass getVariantMessageMapping();

  /**
   * Returns the meta object for the reference '{@link com.x.xocl.domainmodel.VariantMessageMapping#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variant</em>'.
   * @see com.x.xocl.domainmodel.VariantMessageMapping#getVariant()
   * @see #getVariantMessageMapping()
   * @generated
   */
  EReference getVariantMessageMapping_Variant();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.VariantMessageMapping#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see com.x.xocl.domainmodel.VariantMessageMapping#getMappings()
   * @see #getVariantMessageMapping()
   * @generated
   */
  EReference getVariantMessageMapping_Mappings();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.MessageMapping <em>Message Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Mapping</em>'.
   * @see com.x.xocl.domainmodel.MessageMapping
   * @generated
   */
  EClass getMessageMapping();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.MessageMapping#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see com.x.xocl.domainmodel.MessageMapping#getParameter()
   * @see #getMessageMapping()
   * @generated
   */
  EAttribute getMessageMapping_Parameter();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.MessageMapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.MessageMapping#getValue()
   * @see #getMessageMapping()
   * @generated
   */
  EAttribute getMessageMapping_Value();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.RequiredFeatures <em>Required Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Features</em>'.
   * @see com.x.xocl.domainmodel.RequiredFeatures
   * @generated
   */
  EClass getRequiredFeatures();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.RequiredFeatures#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.x.xocl.domainmodel.RequiredFeatures#getFeatures()
   * @see #getRequiredFeatures()
   * @generated
   */
  EReference getRequiredFeatures_Features();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.RequiredFeature <em>Required Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Feature</em>'.
   * @see com.x.xocl.domainmodel.RequiredFeature
   * @generated
   */
  EClass getRequiredFeature();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.AuthorizationFeature <em>Authorization Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Authorization Feature</em>'.
   * @see com.x.xocl.domainmodel.AuthorizationFeature
   * @generated
   */
  EClass getAuthorizationFeature();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.AuthorizationFeature#isAuthorization <em>Authorization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authorization</em>'.
   * @see com.x.xocl.domainmodel.AuthorizationFeature#isAuthorization()
   * @see #getAuthorizationFeature()
   * @generated
   */
  EAttribute getAuthorizationFeature_Authorization();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.NonRepudiationFeature <em>Non Repudiation Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Repudiation Feature</em>'.
   * @see com.x.xocl.domainmodel.NonRepudiationFeature
   * @generated
   */
  EClass getNonRepudiationFeature();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.NonRepudiationFeature#isNonrepudiation <em>Nonrepudiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nonrepudiation</em>'.
   * @see com.x.xocl.domainmodel.NonRepudiationFeature#isNonrepudiation()
   * @see #getNonRepudiationFeature()
   * @generated
   */
  EAttribute getNonRepudiationFeature_Nonrepudiation();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.NotifyTransaction <em>Notify Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notify Transaction</em>'.
   * @see com.x.xocl.domainmodel.NotifyTransaction
   * @generated
   */
  EClass getNotifyTransaction();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.NotifyTransaction#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see com.x.xocl.domainmodel.NotifyTransaction#getPattern()
   * @see #getNotifyTransaction()
   * @generated
   */
  EAttribute getNotifyTransaction_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.NotifyTransaction#getSendAction <em>Send Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Send Action</em>'.
   * @see com.x.xocl.domainmodel.NotifyTransaction#getSendAction()
   * @see #getNotifyTransaction()
   * @generated
   */
  EReference getNotifyTransaction_SendAction();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.OneWayAction <em>One Way Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Way Action</em>'.
   * @see com.x.xocl.domainmodel.OneWayAction
   * @generated
   */
  EClass getOneWayAction();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.OneWayAction#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see com.x.xocl.domainmodel.OneWayAction#getMessages()
   * @see #getOneWayAction()
   * @generated
   */
  EReference getOneWayAction_Messages();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.OneWayAction#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requires</em>'.
   * @see com.x.xocl.domainmodel.OneWayAction#getRequires()
   * @see #getOneWayAction()
   * @generated
   */
  EReference getOneWayAction_Requires();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.OneWayAction#getTimeouts <em>Timeouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timeouts</em>'.
   * @see com.x.xocl.domainmodel.OneWayAction#getTimeouts()
   * @see #getOneWayAction()
   * @generated
   */
  EReference getOneWayAction_Timeouts();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.OneWayAction#getRetries <em>Retries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retries</em>'.
   * @see com.x.xocl.domainmodel.OneWayAction#getRetries()
   * @see #getOneWayAction()
   * @generated
   */
  EAttribute getOneWayAction_Retries();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.OneWayTimeOuts <em>One Way Time Outs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Way Time Outs</em>'.
   * @see com.x.xocl.domainmodel.OneWayTimeOuts
   * @generated
   */
  EClass getOneWayTimeOuts();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.OneWayTimeOuts#getTimeouts <em>Timeouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timeouts</em>'.
   * @see com.x.xocl.domainmodel.OneWayTimeOuts#getTimeouts()
   * @see #getOneWayTimeOuts()
   * @generated
   */
  EReference getOneWayTimeOuts_Timeouts();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.OneWayTimeOut <em>One Way Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Way Time Out</em>'.
   * @see com.x.xocl.domainmodel.OneWayTimeOut
   * @generated
   */
  EClass getOneWayTimeOut();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ReceiptAckTimeOut <em>Receipt Ack Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Receipt Ack Time Out</em>'.
   * @see com.x.xocl.domainmodel.ReceiptAckTimeOut
   * @generated
   */
  EClass getReceiptAckTimeOut();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TimeOut <em>Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Out</em>'.
   * @see com.x.xocl.domainmodel.TimeOut
   * @generated
   */
  EClass getTimeOut();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TimeOut#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.x.xocl.domainmodel.TimeOut#getValue()
   * @see #getTimeOut()
   * @generated
   */
  EAttribute getTimeOut_Value();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TimeOut#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see com.x.xocl.domainmodel.TimeOut#getUnit()
   * @see #getTimeOut()
   * @generated
   */
  EAttribute getTimeOut_Unit();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ValidationAckTimeOut <em>Validation Ack Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation Ack Time Out</em>'.
   * @see com.x.xocl.domainmodel.ValidationAckTimeOut
   * @generated
   */
  EClass getValidationAckTimeOut();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.RequestTransaction <em>Request Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request Transaction</em>'.
   * @see com.x.xocl.domainmodel.RequestTransaction
   * @generated
   */
  EClass getRequestTransaction();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.RequestTransaction#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see com.x.xocl.domainmodel.RequestTransaction#getPattern()
   * @see #getRequestTransaction()
   * @generated
   */
  EAttribute getRequestTransaction_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.RequestTransaction#getSendAction <em>Send Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Send Action</em>'.
   * @see com.x.xocl.domainmodel.RequestTransaction#getSendAction()
   * @see #getRequestTransaction()
   * @generated
   */
  EReference getRequestTransaction_SendAction();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.RequestTransaction#getReceiveAction <em>Receive Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receive Action</em>'.
   * @see com.x.xocl.domainmodel.RequestTransaction#getReceiveAction()
   * @see #getRequestTransaction()
   * @generated
   */
  EReference getRequestTransaction_ReceiveAction();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TwoWayAction <em>Two Way Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Way Action</em>'.
   * @see com.x.xocl.domainmodel.TwoWayAction
   * @generated
   */
  EClass getTwoWayAction();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.TwoWayAction#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Messages</em>'.
   * @see com.x.xocl.domainmodel.TwoWayAction#getMessages()
   * @see #getTwoWayAction()
   * @generated
   */
  EReference getTwoWayAction_Messages();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.TwoWayAction#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Requires</em>'.
   * @see com.x.xocl.domainmodel.TwoWayAction#getRequires()
   * @see #getTwoWayAction()
   * @generated
   */
  EReference getTwoWayAction_Requires();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.TwoWayAction#getTimeouts <em>Timeouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timeouts</em>'.
   * @see com.x.xocl.domainmodel.TwoWayAction#getTimeouts()
   * @see #getTwoWayAction()
   * @generated
   */
  EReference getTwoWayAction_Timeouts();

  /**
   * Returns the meta object for the attribute '{@link com.x.xocl.domainmodel.TwoWayAction#getRetries <em>Retries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retries</em>'.
   * @see com.x.xocl.domainmodel.TwoWayAction#getRetries()
   * @see #getTwoWayAction()
   * @generated
   */
  EAttribute getTwoWayAction_Retries();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TwoWayTimeOuts <em>Two Way Time Outs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Way Time Outs</em>'.
   * @see com.x.xocl.domainmodel.TwoWayTimeOuts
   * @generated
   */
  EClass getTwoWayTimeOuts();

  /**
   * Returns the meta object for the containment reference list '{@link com.x.xocl.domainmodel.TwoWayTimeOuts#getTimeouts <em>Timeouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Timeouts</em>'.
   * @see com.x.xocl.domainmodel.TwoWayTimeOuts#getTimeouts()
   * @see #getTwoWayTimeOuts()
   * @generated
   */
  EReference getTwoWayTimeOuts_Timeouts();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.TwoWayTimeOut <em>Two Way Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Way Time Out</em>'.
   * @see com.x.xocl.domainmodel.TwoWayTimeOut
   * @generated
   */
  EClass getTwoWayTimeOut();

  /**
   * Returns the meta object for the containment reference '{@link com.x.xocl.domainmodel.TwoWayTimeOut#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Timeout</em>'.
   * @see com.x.xocl.domainmodel.TwoWayTimeOut#getTimeout()
   * @see #getTwoWayTimeOut()
   * @generated
   */
  EReference getTwoWayTimeOut_Timeout();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ResponseTimeOut <em>Response Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response Time Out</em>'.
   * @see com.x.xocl.domainmodel.ResponseTimeOut
   * @generated
   */
  EClass getResponseTimeOut();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see com.x.xocl.domainmodel.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ProtocolReference <em>Protocol Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol Reference</em>'.
   * @see com.x.xocl.domainmodel.ProtocolReference
   * @generated
   */
  EClass getProtocolReference();

  /**
   * Returns the meta object for class '{@link com.x.xocl.domainmodel.ProtocolDeclaration <em>Protocol Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol Declaration</em>'.
   * @see com.x.xocl.domainmodel.ProtocolDeclaration
   * @generated
   */
  EClass getProtocolDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link com.x.xocl.domainmodel.ProtocolDeclaration#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Messages</em>'.
   * @see com.x.xocl.domainmodel.ProtocolDeclaration#getMessages()
   * @see #getProtocolDeclaration()
   * @generated
   */
  EAttribute getProtocolDeclaration_Messages();

  /**
   * Returns the meta object for enum '{@link com.x.xocl.domainmodel.TimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Time Unit</em>'.
   * @see com.x.xocl.domainmodel.TimeUnit
   * @generated
   */
  EEnum getTimeUnit();

  /**
   * Returns the meta object for enum '{@link com.x.xocl.domainmodel.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Pattern</em>'.
   * @see com.x.xocl.domainmodel.Pattern
   * @generated
   */
  EEnum getPattern();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainmodelFactory getDomainmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.DomainmodelImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TopLevelElementImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTopLevelElement()
     * @generated
     */
    EClass TOP_LEVEL_ELEMENT = eINSTANCE.getTopLevelElement();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ImportImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__PACKAGE = eINSTANCE.getImport_Package();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.PackageImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__VERSION = eINSTANCE.getPackage_Version();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.VersionStringImpl <em>Version String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.VersionStringImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getVersionString()
     * @generated
     */
    EClass VERSION_STRING = eINSTANCE.getVersionString();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl <em>Two Part Version String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoPartVersionString()
     * @generated
     */
    EClass TWO_PART_VERSION_STRING = eINSTANCE.getTwoPartVersionString();

    /**
     * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TWO_PART_VERSION_STRING__MAJOR = eINSTANCE.getTwoPartVersionString_Major();

    /**
     * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TWO_PART_VERSION_STRING__MINOR = eINSTANCE.getTwoPartVersionString_Minor();

    /**
     * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TWO_PART_VERSION_STRING__RELEASE = eINSTANCE.getTwoPartVersionString_Release();

    /**
     * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TWO_PART_VERSION_STRING__BUILD = eINSTANCE.getTwoPartVersionString_Build();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.FourPartVersionStringImpl <em>Four Part Version String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.FourPartVersionStringImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getFourPartVersionString()
     * @generated
     */
    EClass FOUR_PART_VERSION_STRING = eINSTANCE.getFourPartVersionString();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.PackageElementImpl <em>Package Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.PackageElementImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPackageElement()
     * @generated
     */
    EClass PACKAGE_ELEMENT = eINSTANCE.getPackageElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_ELEMENT__NAME = eINSTANCE.getPackageElement_Name();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.PartnerImpl <em>Partner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.PartnerImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPartner()
     * @generated
     */
    EClass PARTNER = eINSTANCE.getPartner();

    /**
     * The meta object literal for the '<em><b>Responsibilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTNER__RESPONSIBILITIES = eINSTANCE.getPartner_Responsibilities();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ProcessImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__ROLES = eINSTANCE.getProcess_Roles();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__DESCRIPTION = eINSTANCE.getProcess_Description();

    /**
     * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PRECONDITIONS = eINSTANCE.getProcess_Preconditions();

    /**
     * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__POSTCONDITIONS = eINSTANCE.getProcess_Postconditions();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ProcessRoleImpl <em>Process Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ProcessRoleImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProcessRole()
     * @generated
     */
    EClass PROCESS_ROLE = eINSTANCE.getProcessRole();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.RoleImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.PreconditionsImpl <em>Preconditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.PreconditionsImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPreconditions()
     * @generated
     */
    EClass PRECONDITIONS = eINSTANCE.getPreconditions();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECONDITIONS__CONDITIONS = eINSTANCE.getPreconditions_Conditions();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.EntityImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__STATES = eINSTANCE.getEntity_States();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.EntityStateImpl <em>Entity State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.EntityStateImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEntityState()
     * @generated
     */
    EClass ENTITY_STATE = eINSTANCE.getEntityState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_STATE__NAME = eINSTANCE.getEntityState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_STATE__TRANSITIONS = eINSTANCE.getEntityState_Transitions();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.EntityStateTransitionImpl <em>Entity State Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.EntityStateTransitionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEntityStateTransition()
     * @generated
     */
    EClass ENTITY_STATE_TRANSITION = eINSTANCE.getEntityStateTransition();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_STATE_TRANSITION__SUCCESSOR = eINSTANCE.getEntityStateTransition_Successor();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.PostconditionsImpl <em>Postconditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.PostconditionsImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPostconditions()
     * @generated
     */
    EClass POSTCONDITIONS = eINSTANCE.getPostconditions();

    /**
     * The meta object literal for the '<em><b>Success</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTCONDITIONS__SUCCESS = eINSTANCE.getPostconditions_Success();

    /**
     * The meta object literal for the '<em><b>Failure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTCONDITIONS__FAILURE = eINSTANCE.getPostconditions_Failure();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.OnProcessResultImpl <em>On Process Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.OnProcessResultImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOnProcessResult()
     * @generated
     */
    EClass ON_PROCESS_RESULT = eINSTANCE.getOnProcessResult();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ON_PROCESS_RESULT__RESULTS = eINSTANCE.getOnProcessResult_Results();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.OnProcessSuccessImpl <em>On Process Success</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.OnProcessSuccessImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOnProcessSuccess()
     * @generated
     */
    EClass ON_PROCESS_SUCCESS = eINSTANCE.getOnProcessSuccess();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.OnProcessFailureImpl <em>On Process Failure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.OnProcessFailureImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOnProcessFailure()
     * @generated
     */
    EClass ON_PROCESS_FAILURE = eINSTANCE.getOnProcessFailure();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowImpl <em>Workflow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflow()
     * @generated
     */
    EClass WORKFLOW = eINSTANCE.getWorkflow();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__VARIANTS = eINSTANCE.getWorkflow_Variants();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__ROLES = eINSTANCE.getWorkflow_Roles();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW__CONTENTS = eINSTANCE.getWorkflow_Contents();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowVariantImpl <em>Workflow Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowVariantImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowVariant()
     * @generated
     */
    EClass WORKFLOW_VARIANT = eINSTANCE.getWorkflowVariant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKFLOW_VARIANT__NAME = eINSTANCE.getWorkflowVariant_Name();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowRolesImpl <em>Workflow Roles</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowRolesImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRoles()
     * @generated
     */
    EClass WORKFLOW_ROLES = eINSTANCE.getWorkflowRoles();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.RoleDeclarationsImpl <em>Role Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.RoleDeclarationsImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRoleDeclarations()
     * @generated
     */
    EClass ROLE_DECLARATIONS = eINSTANCE.getRoleDeclarations();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_DECLARATIONS__ROLES = eINSTANCE.getRoleDeclarations_Roles();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowRoleImpl <em>Workflow Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowRoleImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRole()
     * @generated
     */
    EClass WORKFLOW_ROLE = eINSTANCE.getWorkflowRole();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ProcessReferenceImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProcessReference()
     * @generated
     */
    EClass PROCESS_REFERENCE = eINSTANCE.getProcessReference();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_REFERENCE__IMPLEMENTS = eINSTANCE.getProcessReference_Implements();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowBlockImpl <em>Workflow Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowBlockImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowBlock()
     * @generated
     */
    EClass WORKFLOW_BLOCK = eINSTANCE.getWorkflowBlock();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_BLOCK__ELEMENTS = eINSTANCE.getWorkflowBlock_Elements();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.EndPointImpl <em>End Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.EndPointImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getEndPoint()
     * @generated
     */
    EClass END_POINT = eINSTANCE.getEndPoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_POINT__NAME = eINSTANCE.getEndPoint_Name();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowElementImpl <em>Workflow Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowElementImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowElement()
     * @generated
     */
    EClass WORKFLOW_ELEMENT = eINSTANCE.getWorkflowElement();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowBranchImpl <em>Workflow Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowBranchImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowBranch()
     * @generated
     */
    EClass WORKFLOW_BRANCH = eINSTANCE.getWorkflowBranch();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_BRANCH__CONDITIONS = eINSTANCE.getWorkflowBranch_Conditions();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.BranchConditionImpl <em>Branch Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.BranchConditionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getBranchCondition()
     * @generated
     */
    EClass BRANCH_CONDITION = eINSTANCE.getBranchCondition();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH_CONDITION__CONTENTS = eINSTANCE.getBranchCondition_Contents();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowActionImpl <em>Workflow Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowActionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowAction()
     * @generated
     */
    EClass WORKFLOW_ACTION = eINSTANCE.getWorkflowAction();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TransactionCallImpl <em>Transaction Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TransactionCallImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransactionCall()
     * @generated
     */
    EClass TRANSACTION_CALL = eINSTANCE.getTransactionCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_CALL__NAME = eINSTANCE.getTransactionCall_Name();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_CALL__VARIANTS = eINSTANCE.getTransactionCall_Variants();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_CALL__SENDER = eINSTANCE.getTransactionCall_Sender();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_CALL__RECEIVER = eINSTANCE.getTransactionCall_Receiver();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TransactionVariantMappingImpl <em>Transaction Variant Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TransactionVariantMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransactionVariantMapping()
     * @generated
     */
    EClass TRANSACTION_VARIANT_MAPPING = eINSTANCE.getTransactionVariantMapping();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_VARIANT_MAPPING__PARAMETER = eINSTANCE.getTransactionVariantMapping_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_VARIANT_MAPPING__VALUE = eINSTANCE.getTransactionVariantMapping_Value();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.SenderRoleMappingImpl <em>Sender Role Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.SenderRoleMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getSenderRoleMapping()
     * @generated
     */
    EClass SENDER_ROLE_MAPPING = eINSTANCE.getSenderRoleMapping();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENDER_ROLE_MAPPING__PARAMETER = eINSTANCE.getSenderRoleMapping_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENDER_ROLE_MAPPING__VALUE = eINSTANCE.getSenderRoleMapping_Value();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ReceiverRoleMappingImpl <em>Receiver Role Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ReceiverRoleMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getReceiverRoleMapping()
     * @generated
     */
    EClass RECEIVER_ROLE_MAPPING = eINSTANCE.getReceiverRoleMapping();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECEIVER_ROLE_MAPPING__PARAMETER = eINSTANCE.getReceiverRoleMapping_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECEIVER_ROLE_MAPPING__VALUE = eINSTANCE.getReceiverRoleMapping_Value();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowCallImpl <em>Workflow Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowCallImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowCall()
     * @generated
     */
    EClass WORKFLOW_CALL = eINSTANCE.getWorkflowCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_CALL__NAME = eINSTANCE.getWorkflowCall_Name();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_CALL__VARIANTS = eINSTANCE.getWorkflowCall_Variants();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_CALL__ROLES = eINSTANCE.getWorkflowCall_Roles();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowVariantMappingImpl <em>Workflow Variant Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowVariantMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowVariantMapping()
     * @generated
     */
    EClass WORKFLOW_VARIANT_MAPPING = eINSTANCE.getWorkflowVariantMapping();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_VARIANT_MAPPING__PARAMETER = eINSTANCE.getWorkflowVariantMapping_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_VARIANT_MAPPING__VALUE = eINSTANCE.getWorkflowVariantMapping_Value();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowRoleMappingImpl <em>Workflow Role Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowRoleMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRoleMapping()
     * @generated
     */
    EClass WORKFLOW_ROLE_MAPPING = eINSTANCE.getWorkflowRoleMapping();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_ROLE_MAPPING__PARAMETER = eINSTANCE.getWorkflowRoleMapping_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_ROLE_MAPPING__VALUE = eINSTANCE.getWorkflowRoleMapping_Value();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.WorkflowRoleReferenceImpl <em>Workflow Role Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.WorkflowRoleReferenceImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getWorkflowRoleReference()
     * @generated
     */
    EClass WORKFLOW_ROLE_REFERENCE = eINSTANCE.getWorkflowRoleReference();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TransactionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACTION = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__VARIANTS = eINSTANCE.getTransaction_Variants();

    /**
     * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__POSTCONDITIONS = eINSTANCE.getTransaction_Postconditions();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.InformTransactionImpl <em>Inform Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.InformTransactionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getInformTransaction()
     * @generated
     */
    EClass INFORM_TRANSACTION = eINSTANCE.getInformTransaction();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFORM_TRANSACTION__PATTERN = eINSTANCE.getInformTransaction_Pattern();

    /**
     * The meta object literal for the '<em><b>Send Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORM_TRANSACTION__SEND_ACTION = eINSTANCE.getInformTransaction_SendAction();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TransactionVariantImpl <em>Transaction Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TransactionVariantImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTransactionVariant()
     * @generated
     */
    EClass TRANSACTION_VARIANT = eINSTANCE.getTransactionVariant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION_VARIANT__NAME = eINSTANCE.getTransactionVariant_Name();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.DatagramActionImpl <em>Datagram Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.DatagramActionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getDatagramAction()
     * @generated
     */
    EClass DATAGRAM_ACTION = eINSTANCE.getDatagramAction();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATAGRAM_ACTION__MESSAGES = eINSTANCE.getDatagramAction_Messages();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATAGRAM_ACTION__REQUIRES = eINSTANCE.getDatagramAction_Requires();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.VariantMessageMappingsImpl <em>Variant Message Mappings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.VariantMessageMappingsImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getVariantMessageMappings()
     * @generated
     */
    EClass VARIANT_MESSAGE_MAPPINGS = eINSTANCE.getVariantMessageMappings();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_MESSAGE_MAPPINGS__VARIANTS = eINSTANCE.getVariantMessageMappings_Variants();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.VariantMessageMappingImpl <em>Variant Message Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.VariantMessageMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getVariantMessageMapping()
     * @generated
     */
    EClass VARIANT_MESSAGE_MAPPING = eINSTANCE.getVariantMessageMapping();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_MESSAGE_MAPPING__VARIANT = eINSTANCE.getVariantMessageMapping_Variant();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANT_MESSAGE_MAPPING__MAPPINGS = eINSTANCE.getVariantMessageMapping_Mappings();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.MessageMappingImpl <em>Message Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.MessageMappingImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getMessageMapping()
     * @generated
     */
    EClass MESSAGE_MAPPING = eINSTANCE.getMessageMapping();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_MAPPING__PARAMETER = eINSTANCE.getMessageMapping_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_MAPPING__VALUE = eINSTANCE.getMessageMapping_Value();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.RequiredFeaturesImpl <em>Required Features</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.RequiredFeaturesImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRequiredFeatures()
     * @generated
     */
    EClass REQUIRED_FEATURES = eINSTANCE.getRequiredFeatures();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_FEATURES__FEATURES = eINSTANCE.getRequiredFeatures_Features();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.RequiredFeatureImpl <em>Required Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.RequiredFeatureImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRequiredFeature()
     * @generated
     */
    EClass REQUIRED_FEATURE = eINSTANCE.getRequiredFeature();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.AuthorizationFeatureImpl <em>Authorization Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.AuthorizationFeatureImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getAuthorizationFeature()
     * @generated
     */
    EClass AUTHORIZATION_FEATURE = eINSTANCE.getAuthorizationFeature();

    /**
     * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHORIZATION_FEATURE__AUTHORIZATION = eINSTANCE.getAuthorizationFeature_Authorization();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.NonRepudiationFeatureImpl <em>Non Repudiation Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.NonRepudiationFeatureImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getNonRepudiationFeature()
     * @generated
     */
    EClass NON_REPUDIATION_FEATURE = eINSTANCE.getNonRepudiationFeature();

    /**
     * The meta object literal for the '<em><b>Nonrepudiation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NON_REPUDIATION_FEATURE__NONREPUDIATION = eINSTANCE.getNonRepudiationFeature_Nonrepudiation();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.NotifyTransactionImpl <em>Notify Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.NotifyTransactionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getNotifyTransaction()
     * @generated
     */
    EClass NOTIFY_TRANSACTION = eINSTANCE.getNotifyTransaction();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIFY_TRANSACTION__PATTERN = eINSTANCE.getNotifyTransaction_Pattern();

    /**
     * The meta object literal for the '<em><b>Send Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTIFY_TRANSACTION__SEND_ACTION = eINSTANCE.getNotifyTransaction_SendAction();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.OneWayActionImpl <em>One Way Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.OneWayActionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOneWayAction()
     * @generated
     */
    EClass ONE_WAY_ACTION = eINSTANCE.getOneWayAction();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_WAY_ACTION__MESSAGES = eINSTANCE.getOneWayAction_Messages();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_WAY_ACTION__REQUIRES = eINSTANCE.getOneWayAction_Requires();

    /**
     * The meta object literal for the '<em><b>Timeouts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_WAY_ACTION__TIMEOUTS = eINSTANCE.getOneWayAction_Timeouts();

    /**
     * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_WAY_ACTION__RETRIES = eINSTANCE.getOneWayAction_Retries();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.OneWayTimeOutsImpl <em>One Way Time Outs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.OneWayTimeOutsImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOneWayTimeOuts()
     * @generated
     */
    EClass ONE_WAY_TIME_OUTS = eINSTANCE.getOneWayTimeOuts();

    /**
     * The meta object literal for the '<em><b>Timeouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_WAY_TIME_OUTS__TIMEOUTS = eINSTANCE.getOneWayTimeOuts_Timeouts();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.OneWayTimeOutImpl <em>One Way Time Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.OneWayTimeOutImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getOneWayTimeOut()
     * @generated
     */
    EClass ONE_WAY_TIME_OUT = eINSTANCE.getOneWayTimeOut();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ReceiptAckTimeOutImpl <em>Receipt Ack Time Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ReceiptAckTimeOutImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getReceiptAckTimeOut()
     * @generated
     */
    EClass RECEIPT_ACK_TIME_OUT = eINSTANCE.getReceiptAckTimeOut();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TimeOutImpl <em>Time Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TimeOutImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTimeOut()
     * @generated
     */
    EClass TIME_OUT = eINSTANCE.getTimeOut();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_OUT__VALUE = eINSTANCE.getTimeOut_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_OUT__UNIT = eINSTANCE.getTimeOut_Unit();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ValidationAckTimeOutImpl <em>Validation Ack Time Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ValidationAckTimeOutImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getValidationAckTimeOut()
     * @generated
     */
    EClass VALIDATION_ACK_TIME_OUT = eINSTANCE.getValidationAckTimeOut();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.RequestTransactionImpl <em>Request Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.RequestTransactionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getRequestTransaction()
     * @generated
     */
    EClass REQUEST_TRANSACTION = eINSTANCE.getRequestTransaction();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST_TRANSACTION__PATTERN = eINSTANCE.getRequestTransaction_Pattern();

    /**
     * The meta object literal for the '<em><b>Send Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_TRANSACTION__SEND_ACTION = eINSTANCE.getRequestTransaction_SendAction();

    /**
     * The meta object literal for the '<em><b>Receive Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_TRANSACTION__RECEIVE_ACTION = eINSTANCE.getRequestTransaction_ReceiveAction();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TwoWayActionImpl <em>Two Way Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TwoWayActionImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoWayAction()
     * @generated
     */
    EClass TWO_WAY_ACTION = eINSTANCE.getTwoWayAction();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_WAY_ACTION__MESSAGES = eINSTANCE.getTwoWayAction_Messages();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_WAY_ACTION__REQUIRES = eINSTANCE.getTwoWayAction_Requires();

    /**
     * The meta object literal for the '<em><b>Timeouts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_WAY_ACTION__TIMEOUTS = eINSTANCE.getTwoWayAction_Timeouts();

    /**
     * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TWO_WAY_ACTION__RETRIES = eINSTANCE.getTwoWayAction_Retries();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TwoWayTimeOutsImpl <em>Two Way Time Outs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TwoWayTimeOutsImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoWayTimeOuts()
     * @generated
     */
    EClass TWO_WAY_TIME_OUTS = eINSTANCE.getTwoWayTimeOuts();

    /**
     * The meta object literal for the '<em><b>Timeouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_WAY_TIME_OUTS__TIMEOUTS = eINSTANCE.getTwoWayTimeOuts_Timeouts();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.TwoWayTimeOutImpl <em>Two Way Time Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.TwoWayTimeOutImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTwoWayTimeOut()
     * @generated
     */
    EClass TWO_WAY_TIME_OUT = eINSTANCE.getTwoWayTimeOut();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_WAY_TIME_OUT__TIMEOUT = eINSTANCE.getTwoWayTimeOut_Timeout();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ResponseTimeOutImpl <em>Response Time Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ResponseTimeOutImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getResponseTimeOut()
     * @generated
     */
    EClass RESPONSE_TIME_OUT = eINSTANCE.getResponseTimeOut();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ProtocolImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ProtocolReferenceImpl <em>Protocol Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ProtocolReferenceImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProtocolReference()
     * @generated
     */
    EClass PROTOCOL_REFERENCE = eINSTANCE.getProtocolReference();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.impl.ProtocolDeclarationImpl <em>Protocol Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.impl.ProtocolDeclarationImpl
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getProtocolDeclaration()
     * @generated
     */
    EClass PROTOCOL_DECLARATION = eINSTANCE.getProtocolDeclaration();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL_DECLARATION__MESSAGES = eINSTANCE.getProtocolDeclaration_Messages();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.TimeUnit <em>Time Unit</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.TimeUnit
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getTimeUnit()
     * @generated
     */
    EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

    /**
     * The meta object literal for the '{@link com.x.xocl.domainmodel.Pattern <em>Pattern</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.x.xocl.domainmodel.Pattern
     * @see com.x.xocl.domainmodel.impl.DomainmodelPackageImpl#getPattern()
     * @generated
     */
    EEnum PATTERN = eINSTANCE.getPattern();

  }

} //DomainmodelPackage
