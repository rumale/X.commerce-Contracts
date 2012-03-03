/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.x.xocl.domainmodel.DomainmodelPackage
 * @generated
 */
public interface DomainmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelFactory eINSTANCE = com.x.xocl.domainmodel.impl.DomainmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Top Level Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Element</em>'.
   * @generated
   */
  TopLevelElement createTopLevelElement();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Version String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version String</em>'.
   * @generated
   */
  VersionString createVersionString();

  /**
   * Returns a new object of class '<em>Two Part Version String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Two Part Version String</em>'.
   * @generated
   */
  TwoPartVersionString createTwoPartVersionString();

  /**
   * Returns a new object of class '<em>Four Part Version String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Four Part Version String</em>'.
   * @generated
   */
  FourPartVersionString createFourPartVersionString();

  /**
   * Returns a new object of class '<em>Package Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Element</em>'.
   * @generated
   */
  PackageElement createPackageElement();

  /**
   * Returns a new object of class '<em>Partner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Partner</em>'.
   * @generated
   */
  Partner createPartner();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Process Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Role</em>'.
   * @generated
   */
  ProcessRole createProcessRole();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Preconditions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preconditions</em>'.
   * @generated
   */
  Preconditions createPreconditions();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Entity State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity State</em>'.
   * @generated
   */
  EntityState createEntityState();

  /**
   * Returns a new object of class '<em>Entity State Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity State Transition</em>'.
   * @generated
   */
  EntityStateTransition createEntityStateTransition();

  /**
   * Returns a new object of class '<em>Postconditions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Postconditions</em>'.
   * @generated
   */
  Postconditions createPostconditions();

  /**
   * Returns a new object of class '<em>On Process Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>On Process Result</em>'.
   * @generated
   */
  OnProcessResult createOnProcessResult();

  /**
   * Returns a new object of class '<em>On Process Success</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>On Process Success</em>'.
   * @generated
   */
  OnProcessSuccess createOnProcessSuccess();

  /**
   * Returns a new object of class '<em>On Process Failure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>On Process Failure</em>'.
   * @generated
   */
  OnProcessFailure createOnProcessFailure();

  /**
   * Returns a new object of class '<em>Workflow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow</em>'.
   * @generated
   */
  Workflow createWorkflow();

  /**
   * Returns a new object of class '<em>Workflow Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Variant</em>'.
   * @generated
   */
  WorkflowVariant createWorkflowVariant();

  /**
   * Returns a new object of class '<em>Workflow Roles</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Roles</em>'.
   * @generated
   */
  WorkflowRoles createWorkflowRoles();

  /**
   * Returns a new object of class '<em>Role Declarations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Declarations</em>'.
   * @generated
   */
  RoleDeclarations createRoleDeclarations();

  /**
   * Returns a new object of class '<em>Workflow Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Role</em>'.
   * @generated
   */
  WorkflowRole createWorkflowRole();

  /**
   * Returns a new object of class '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Reference</em>'.
   * @generated
   */
  ProcessReference createProcessReference();

  /**
   * Returns a new object of class '<em>Workflow Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Block</em>'.
   * @generated
   */
  WorkflowBlock createWorkflowBlock();

  /**
   * Returns a new object of class '<em>End Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Point</em>'.
   * @generated
   */
  EndPoint createEndPoint();

  /**
   * Returns a new object of class '<em>Workflow Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Element</em>'.
   * @generated
   */
  WorkflowElement createWorkflowElement();

  /**
   * Returns a new object of class '<em>Workflow Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Branch</em>'.
   * @generated
   */
  WorkflowBranch createWorkflowBranch();

  /**
   * Returns a new object of class '<em>Branch Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Branch Condition</em>'.
   * @generated
   */
  BranchCondition createBranchCondition();

  /**
   * Returns a new object of class '<em>Workflow Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Action</em>'.
   * @generated
   */
  WorkflowAction createWorkflowAction();

  /**
   * Returns a new object of class '<em>Transaction Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction Call</em>'.
   * @generated
   */
  TransactionCall createTransactionCall();

  /**
   * Returns a new object of class '<em>Transaction Variant Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction Variant Mapping</em>'.
   * @generated
   */
  TransactionVariantMapping createTransactionVariantMapping();

  /**
   * Returns a new object of class '<em>Sender Role Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sender Role Mapping</em>'.
   * @generated
   */
  SenderRoleMapping createSenderRoleMapping();

  /**
   * Returns a new object of class '<em>Receiver Role Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Receiver Role Mapping</em>'.
   * @generated
   */
  ReceiverRoleMapping createReceiverRoleMapping();

  /**
   * Returns a new object of class '<em>Workflow Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Call</em>'.
   * @generated
   */
  WorkflowCall createWorkflowCall();

  /**
   * Returns a new object of class '<em>Workflow Variant Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Variant Mapping</em>'.
   * @generated
   */
  WorkflowVariantMapping createWorkflowVariantMapping();

  /**
   * Returns a new object of class '<em>Workflow Role Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Role Mapping</em>'.
   * @generated
   */
  WorkflowRoleMapping createWorkflowRoleMapping();

  /**
   * Returns a new object of class '<em>Workflow Role Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Role Reference</em>'.
   * @generated
   */
  WorkflowRoleReference createWorkflowRoleReference();

  /**
   * Returns a new object of class '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction</em>'.
   * @generated
   */
  Transaction createTransaction();

  /**
   * Returns a new object of class '<em>Inform Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inform Transaction</em>'.
   * @generated
   */
  InformTransaction createInformTransaction();

  /**
   * Returns a new object of class '<em>Transaction Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction Variant</em>'.
   * @generated
   */
  TransactionVariant createTransactionVariant();

  /**
   * Returns a new object of class '<em>Datagram Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datagram Action</em>'.
   * @generated
   */
  DatagramAction createDatagramAction();

  /**
   * Returns a new object of class '<em>Variant Message Mappings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant Message Mappings</em>'.
   * @generated
   */
  VariantMessageMappings createVariantMessageMappings();

  /**
   * Returns a new object of class '<em>Variant Message Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant Message Mapping</em>'.
   * @generated
   */
  VariantMessageMapping createVariantMessageMapping();

  /**
   * Returns a new object of class '<em>Message Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Mapping</em>'.
   * @generated
   */
  MessageMapping createMessageMapping();

  /**
   * Returns a new object of class '<em>Required Features</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Features</em>'.
   * @generated
   */
  RequiredFeatures createRequiredFeatures();

  /**
   * Returns a new object of class '<em>Required Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Feature</em>'.
   * @generated
   */
  RequiredFeature createRequiredFeature();

  /**
   * Returns a new object of class '<em>Authorization Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Authorization Feature</em>'.
   * @generated
   */
  AuthorizationFeature createAuthorizationFeature();

  /**
   * Returns a new object of class '<em>Non Repudiation Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Repudiation Feature</em>'.
   * @generated
   */
  NonRepudiationFeature createNonRepudiationFeature();

  /**
   * Returns a new object of class '<em>Notify Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Notify Transaction</em>'.
   * @generated
   */
  NotifyTransaction createNotifyTransaction();

  /**
   * Returns a new object of class '<em>One Way Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One Way Action</em>'.
   * @generated
   */
  OneWayAction createOneWayAction();

  /**
   * Returns a new object of class '<em>One Way Time Outs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One Way Time Outs</em>'.
   * @generated
   */
  OneWayTimeOuts createOneWayTimeOuts();

  /**
   * Returns a new object of class '<em>One Way Time Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>One Way Time Out</em>'.
   * @generated
   */
  OneWayTimeOut createOneWayTimeOut();

  /**
   * Returns a new object of class '<em>Receipt Ack Time Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Receipt Ack Time Out</em>'.
   * @generated
   */
  ReceiptAckTimeOut createReceiptAckTimeOut();

  /**
   * Returns a new object of class '<em>Time Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Out</em>'.
   * @generated
   */
  TimeOut createTimeOut();

  /**
   * Returns a new object of class '<em>Validation Ack Time Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validation Ack Time Out</em>'.
   * @generated
   */
  ValidationAckTimeOut createValidationAckTimeOut();

  /**
   * Returns a new object of class '<em>Request Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request Transaction</em>'.
   * @generated
   */
  RequestTransaction createRequestTransaction();

  /**
   * Returns a new object of class '<em>Two Way Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Two Way Action</em>'.
   * @generated
   */
  TwoWayAction createTwoWayAction();

  /**
   * Returns a new object of class '<em>Two Way Time Outs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Two Way Time Outs</em>'.
   * @generated
   */
  TwoWayTimeOuts createTwoWayTimeOuts();

  /**
   * Returns a new object of class '<em>Two Way Time Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Two Way Time Out</em>'.
   * @generated
   */
  TwoWayTimeOut createTwoWayTimeOut();

  /**
   * Returns a new object of class '<em>Response Time Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Response Time Out</em>'.
   * @generated
   */
  ResponseTimeOut createResponseTimeOut();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Protocol Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol Reference</em>'.
   * @generated
   */
  ProtocolReference createProtocolReference();

  /**
   * Returns a new object of class '<em>Protocol Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol Declaration</em>'.
   * @generated
   */
  ProtocolDeclaration createProtocolDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainmodelPackage getDomainmodelPackage();

} //DomainmodelFactory
