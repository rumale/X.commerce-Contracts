/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.AuthorizationFeature;
import com.x.xocl.domainmodel.BranchCondition;
import com.x.xocl.domainmodel.DatagramAction;
import com.x.xocl.domainmodel.Domainmodel;
import com.x.xocl.domainmodel.DomainmodelFactory;
import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.EndPoint;
import com.x.xocl.domainmodel.Entity;
import com.x.xocl.domainmodel.EntityState;
import com.x.xocl.domainmodel.EntityStateTransition;
import com.x.xocl.domainmodel.FourPartVersionString;
import com.x.xocl.domainmodel.Import;
import com.x.xocl.domainmodel.InformTransaction;
import com.x.xocl.domainmodel.MessageMapping;
import com.x.xocl.domainmodel.NonRepudiationFeature;
import com.x.xocl.domainmodel.NotifyTransaction;
import com.x.xocl.domainmodel.OnProcessFailure;
import com.x.xocl.domainmodel.OnProcessResult;
import com.x.xocl.domainmodel.OnProcessSuccess;
import com.x.xocl.domainmodel.OneWayAction;
import com.x.xocl.domainmodel.OneWayTimeOut;
import com.x.xocl.domainmodel.OneWayTimeOuts;
import com.x.xocl.domainmodel.PackageElement;
import com.x.xocl.domainmodel.Partner;
import com.x.xocl.domainmodel.Pattern;
import com.x.xocl.domainmodel.Postconditions;
import com.x.xocl.domainmodel.Preconditions;
import com.x.xocl.domainmodel.ProcessReference;
import com.x.xocl.domainmodel.ProcessRole;
import com.x.xocl.domainmodel.Protocol;
import com.x.xocl.domainmodel.ProtocolDeclaration;
import com.x.xocl.domainmodel.ProtocolReference;
import com.x.xocl.domainmodel.ReceiptAckTimeOut;
import com.x.xocl.domainmodel.ReceiverRoleMapping;
import com.x.xocl.domainmodel.RequestTransaction;
import com.x.xocl.domainmodel.RequiredFeature;
import com.x.xocl.domainmodel.RequiredFeatures;
import com.x.xocl.domainmodel.ResponseTimeOut;
import com.x.xocl.domainmodel.Role;
import com.x.xocl.domainmodel.RoleDeclarations;
import com.x.xocl.domainmodel.SenderRoleMapping;
import com.x.xocl.domainmodel.TimeOut;
import com.x.xocl.domainmodel.TimeUnit;
import com.x.xocl.domainmodel.TopLevelElement;
import com.x.xocl.domainmodel.Transaction;
import com.x.xocl.domainmodel.TransactionCall;
import com.x.xocl.domainmodel.TransactionVariant;
import com.x.xocl.domainmodel.TransactionVariantMapping;
import com.x.xocl.domainmodel.TwoPartVersionString;
import com.x.xocl.domainmodel.TwoWayAction;
import com.x.xocl.domainmodel.TwoWayTimeOut;
import com.x.xocl.domainmodel.TwoWayTimeOuts;
import com.x.xocl.domainmodel.ValidationAckTimeOut;
import com.x.xocl.domainmodel.VariantMessageMapping;
import com.x.xocl.domainmodel.VariantMessageMappings;
import com.x.xocl.domainmodel.VersionString;
import com.x.xocl.domainmodel.Workflow;
import com.x.xocl.domainmodel.WorkflowAction;
import com.x.xocl.domainmodel.WorkflowBlock;
import com.x.xocl.domainmodel.WorkflowBranch;
import com.x.xocl.domainmodel.WorkflowCall;
import com.x.xocl.domainmodel.WorkflowElement;
import com.x.xocl.domainmodel.WorkflowRole;
import com.x.xocl.domainmodel.WorkflowRoleMapping;
import com.x.xocl.domainmodel.WorkflowRoleReference;
import com.x.xocl.domainmodel.WorkflowRoles;
import com.x.xocl.domainmodel.WorkflowVariant;
import com.x.xocl.domainmodel.WorkflowVariantMapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DomainmodelFactoryImpl extends EFactoryImpl implements DomainmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainmodelFactory init()
  {
    try
    {
      DomainmodelFactory theDomainmodelFactory = (DomainmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://x.com/xocl/XOCL"); 
      if (theDomainmodelFactory != null)
      {
        return theDomainmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DomainmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DomainmodelPackage.DOMAINMODEL: return createDomainmodel();
      case DomainmodelPackage.TOP_LEVEL_ELEMENT: return createTopLevelElement();
      case DomainmodelPackage.IMPORT: return createImport();
      case DomainmodelPackage.PACKAGE: return createPackage();
      case DomainmodelPackage.VERSION_STRING: return createVersionString();
      case DomainmodelPackage.TWO_PART_VERSION_STRING: return createTwoPartVersionString();
      case DomainmodelPackage.FOUR_PART_VERSION_STRING: return createFourPartVersionString();
      case DomainmodelPackage.PACKAGE_ELEMENT: return createPackageElement();
      case DomainmodelPackage.PARTNER: return createPartner();
      case DomainmodelPackage.PROCESS: return createProcess();
      case DomainmodelPackage.PROCESS_ROLE: return createProcessRole();
      case DomainmodelPackage.ROLE: return createRole();
      case DomainmodelPackage.PRECONDITIONS: return createPreconditions();
      case DomainmodelPackage.ENTITY: return createEntity();
      case DomainmodelPackage.ENTITY_STATE: return createEntityState();
      case DomainmodelPackage.ENTITY_STATE_TRANSITION: return createEntityStateTransition();
      case DomainmodelPackage.POSTCONDITIONS: return createPostconditions();
      case DomainmodelPackage.ON_PROCESS_RESULT: return createOnProcessResult();
      case DomainmodelPackage.ON_PROCESS_SUCCESS: return createOnProcessSuccess();
      case DomainmodelPackage.ON_PROCESS_FAILURE: return createOnProcessFailure();
      case DomainmodelPackage.WORKFLOW: return createWorkflow();
      case DomainmodelPackage.WORKFLOW_VARIANT: return createWorkflowVariant();
      case DomainmodelPackage.WORKFLOW_ROLES: return createWorkflowRoles();
      case DomainmodelPackage.ROLE_DECLARATIONS: return createRoleDeclarations();
      case DomainmodelPackage.WORKFLOW_ROLE: return createWorkflowRole();
      case DomainmodelPackage.PROCESS_REFERENCE: return createProcessReference();
      case DomainmodelPackage.WORKFLOW_BLOCK: return createWorkflowBlock();
      case DomainmodelPackage.END_POINT: return createEndPoint();
      case DomainmodelPackage.WORKFLOW_ELEMENT: return createWorkflowElement();
      case DomainmodelPackage.WORKFLOW_BRANCH: return createWorkflowBranch();
      case DomainmodelPackage.BRANCH_CONDITION: return createBranchCondition();
      case DomainmodelPackage.WORKFLOW_ACTION: return createWorkflowAction();
      case DomainmodelPackage.TRANSACTION_CALL: return createTransactionCall();
      case DomainmodelPackage.TRANSACTION_VARIANT_MAPPING: return createTransactionVariantMapping();
      case DomainmodelPackage.SENDER_ROLE_MAPPING: return createSenderRoleMapping();
      case DomainmodelPackage.RECEIVER_ROLE_MAPPING: return createReceiverRoleMapping();
      case DomainmodelPackage.WORKFLOW_CALL: return createWorkflowCall();
      case DomainmodelPackage.WORKFLOW_VARIANT_MAPPING: return createWorkflowVariantMapping();
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING: return createWorkflowRoleMapping();
      case DomainmodelPackage.WORKFLOW_ROLE_REFERENCE: return createWorkflowRoleReference();
      case DomainmodelPackage.TRANSACTION: return createTransaction();
      case DomainmodelPackage.INFORM_TRANSACTION: return createInformTransaction();
      case DomainmodelPackage.TRANSACTION_VARIANT: return createTransactionVariant();
      case DomainmodelPackage.DATAGRAM_ACTION: return createDatagramAction();
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPINGS: return createVariantMessageMappings();
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING: return createVariantMessageMapping();
      case DomainmodelPackage.MESSAGE_MAPPING: return createMessageMapping();
      case DomainmodelPackage.REQUIRED_FEATURES: return createRequiredFeatures();
      case DomainmodelPackage.REQUIRED_FEATURE: return createRequiredFeature();
      case DomainmodelPackage.AUTHORIZATION_FEATURE: return createAuthorizationFeature();
      case DomainmodelPackage.NON_REPUDIATION_FEATURE: return createNonRepudiationFeature();
      case DomainmodelPackage.NOTIFY_TRANSACTION: return createNotifyTransaction();
      case DomainmodelPackage.ONE_WAY_ACTION: return createOneWayAction();
      case DomainmodelPackage.ONE_WAY_TIME_OUTS: return createOneWayTimeOuts();
      case DomainmodelPackage.ONE_WAY_TIME_OUT: return createOneWayTimeOut();
      case DomainmodelPackage.RECEIPT_ACK_TIME_OUT: return createReceiptAckTimeOut();
      case DomainmodelPackage.TIME_OUT: return createTimeOut();
      case DomainmodelPackage.VALIDATION_ACK_TIME_OUT: return createValidationAckTimeOut();
      case DomainmodelPackage.REQUEST_TRANSACTION: return createRequestTransaction();
      case DomainmodelPackage.TWO_WAY_ACTION: return createTwoWayAction();
      case DomainmodelPackage.TWO_WAY_TIME_OUTS: return createTwoWayTimeOuts();
      case DomainmodelPackage.TWO_WAY_TIME_OUT: return createTwoWayTimeOut();
      case DomainmodelPackage.RESPONSE_TIME_OUT: return createResponseTimeOut();
      case DomainmodelPackage.PROTOCOL: return createProtocol();
      case DomainmodelPackage.PROTOCOL_REFERENCE: return createProtocolReference();
      case DomainmodelPackage.PROTOCOL_DECLARATION: return createProtocolDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainmodelPackage.TIME_UNIT:
        return createTimeUnitFromString(eDataType, initialValue);
      case DomainmodelPackage.PATTERN:
        return createPatternFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DomainmodelPackage.TIME_UNIT:
        return convertTimeUnitToString(eDataType, instanceValue);
      case DomainmodelPackage.PATTERN:
        return convertPatternToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelElement createTopLevelElement()
  {
    TopLevelElementImpl topLevelElement = new TopLevelElementImpl();
    return topLevelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.x.xocl.domainmodel.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionString createVersionString()
  {
    VersionStringImpl versionString = new VersionStringImpl();
    return versionString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoPartVersionString createTwoPartVersionString()
  {
    TwoPartVersionStringImpl twoPartVersionString = new TwoPartVersionStringImpl();
    return twoPartVersionString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FourPartVersionString createFourPartVersionString()
  {
    FourPartVersionStringImpl fourPartVersionString = new FourPartVersionStringImpl();
    return fourPartVersionString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageElement createPackageElement()
  {
    PackageElementImpl packageElement = new PackageElementImpl();
    return packageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Partner createPartner()
  {
    PartnerImpl partner = new PartnerImpl();
    return partner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.x.xocl.domainmodel.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessRole createProcessRole()
  {
    ProcessRoleImpl processRole = new ProcessRoleImpl();
    return processRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preconditions createPreconditions()
  {
    PreconditionsImpl preconditions = new PreconditionsImpl();
    return preconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityState createEntityState()
  {
    EntityStateImpl entityState = new EntityStateImpl();
    return entityState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityStateTransition createEntityStateTransition()
  {
    EntityStateTransitionImpl entityStateTransition = new EntityStateTransitionImpl();
    return entityStateTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postconditions createPostconditions()
  {
    PostconditionsImpl postconditions = new PostconditionsImpl();
    return postconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnProcessResult createOnProcessResult()
  {
    OnProcessResultImpl onProcessResult = new OnProcessResultImpl();
    return onProcessResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnProcessSuccess createOnProcessSuccess()
  {
    OnProcessSuccessImpl onProcessSuccess = new OnProcessSuccessImpl();
    return onProcessSuccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnProcessFailure createOnProcessFailure()
  {
    OnProcessFailureImpl onProcessFailure = new OnProcessFailureImpl();
    return onProcessFailure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workflow createWorkflow()
  {
    WorkflowImpl workflow = new WorkflowImpl();
    return workflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowVariant createWorkflowVariant()
  {
    WorkflowVariantImpl workflowVariant = new WorkflowVariantImpl();
    return workflowVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRoles createWorkflowRoles()
  {
    WorkflowRolesImpl workflowRoles = new WorkflowRolesImpl();
    return workflowRoles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleDeclarations createRoleDeclarations()
  {
    RoleDeclarationsImpl roleDeclarations = new RoleDeclarationsImpl();
    return roleDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRole createWorkflowRole()
  {
    WorkflowRoleImpl workflowRole = new WorkflowRoleImpl();
    return workflowRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessReference createProcessReference()
  {
    ProcessReferenceImpl processReference = new ProcessReferenceImpl();
    return processReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowBlock createWorkflowBlock()
  {
    WorkflowBlockImpl workflowBlock = new WorkflowBlockImpl();
    return workflowBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndPoint createEndPoint()
  {
    EndPointImpl endPoint = new EndPointImpl();
    return endPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowElement createWorkflowElement()
  {
    WorkflowElementImpl workflowElement = new WorkflowElementImpl();
    return workflowElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowBranch createWorkflowBranch()
  {
    WorkflowBranchImpl workflowBranch = new WorkflowBranchImpl();
    return workflowBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BranchCondition createBranchCondition()
  {
    BranchConditionImpl branchCondition = new BranchConditionImpl();
    return branchCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowAction createWorkflowAction()
  {
    WorkflowActionImpl workflowAction = new WorkflowActionImpl();
    return workflowAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionCall createTransactionCall()
  {
    TransactionCallImpl transactionCall = new TransactionCallImpl();
    return transactionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionVariantMapping createTransactionVariantMapping()
  {
    TransactionVariantMappingImpl transactionVariantMapping = new TransactionVariantMappingImpl();
    return transactionVariantMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SenderRoleMapping createSenderRoleMapping()
  {
    SenderRoleMappingImpl senderRoleMapping = new SenderRoleMappingImpl();
    return senderRoleMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiverRoleMapping createReceiverRoleMapping()
  {
    ReceiverRoleMappingImpl receiverRoleMapping = new ReceiverRoleMappingImpl();
    return receiverRoleMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowCall createWorkflowCall()
  {
    WorkflowCallImpl workflowCall = new WorkflowCallImpl();
    return workflowCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowVariantMapping createWorkflowVariantMapping()
  {
    WorkflowVariantMappingImpl workflowVariantMapping = new WorkflowVariantMappingImpl();
    return workflowVariantMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRoleMapping createWorkflowRoleMapping()
  {
    WorkflowRoleMappingImpl workflowRoleMapping = new WorkflowRoleMappingImpl();
    return workflowRoleMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRoleReference createWorkflowRoleReference()
  {
    WorkflowRoleReferenceImpl workflowRoleReference = new WorkflowRoleReferenceImpl();
    return workflowRoleReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InformTransaction createInformTransaction()
  {
    InformTransactionImpl informTransaction = new InformTransactionImpl();
    return informTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionVariant createTransactionVariant()
  {
    TransactionVariantImpl transactionVariant = new TransactionVariantImpl();
    return transactionVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatagramAction createDatagramAction()
  {
    DatagramActionImpl datagramAction = new DatagramActionImpl();
    return datagramAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantMessageMappings createVariantMessageMappings()
  {
    VariantMessageMappingsImpl variantMessageMappings = new VariantMessageMappingsImpl();
    return variantMessageMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantMessageMapping createVariantMessageMapping()
  {
    VariantMessageMappingImpl variantMessageMapping = new VariantMessageMappingImpl();
    return variantMessageMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageMapping createMessageMapping()
  {
    MessageMappingImpl messageMapping = new MessageMappingImpl();
    return messageMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredFeatures createRequiredFeatures()
  {
    RequiredFeaturesImpl requiredFeatures = new RequiredFeaturesImpl();
    return requiredFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredFeature createRequiredFeature()
  {
    RequiredFeatureImpl requiredFeature = new RequiredFeatureImpl();
    return requiredFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthorizationFeature createAuthorizationFeature()
  {
    AuthorizationFeatureImpl authorizationFeature = new AuthorizationFeatureImpl();
    return authorizationFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonRepudiationFeature createNonRepudiationFeature()
  {
    NonRepudiationFeatureImpl nonRepudiationFeature = new NonRepudiationFeatureImpl();
    return nonRepudiationFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotifyTransaction createNotifyTransaction()
  {
    NotifyTransactionImpl notifyTransaction = new NotifyTransactionImpl();
    return notifyTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayAction createOneWayAction()
  {
    OneWayActionImpl oneWayAction = new OneWayActionImpl();
    return oneWayAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayTimeOuts createOneWayTimeOuts()
  {
    OneWayTimeOutsImpl oneWayTimeOuts = new OneWayTimeOutsImpl();
    return oneWayTimeOuts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayTimeOut createOneWayTimeOut()
  {
    OneWayTimeOutImpl oneWayTimeOut = new OneWayTimeOutImpl();
    return oneWayTimeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiptAckTimeOut createReceiptAckTimeOut()
  {
    ReceiptAckTimeOutImpl receiptAckTimeOut = new ReceiptAckTimeOutImpl();
    return receiptAckTimeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeOut createTimeOut()
  {
    TimeOutImpl timeOut = new TimeOutImpl();
    return timeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationAckTimeOut createValidationAckTimeOut()
  {
    ValidationAckTimeOutImpl validationAckTimeOut = new ValidationAckTimeOutImpl();
    return validationAckTimeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestTransaction createRequestTransaction()
  {
    RequestTransactionImpl requestTransaction = new RequestTransactionImpl();
    return requestTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoWayAction createTwoWayAction()
  {
    TwoWayActionImpl twoWayAction = new TwoWayActionImpl();
    return twoWayAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoWayTimeOuts createTwoWayTimeOuts()
  {
    TwoWayTimeOutsImpl twoWayTimeOuts = new TwoWayTimeOutsImpl();
    return twoWayTimeOuts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoWayTimeOut createTwoWayTimeOut()
  {
    TwoWayTimeOutImpl twoWayTimeOut = new TwoWayTimeOutImpl();
    return twoWayTimeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseTimeOut createResponseTimeOut()
  {
    ResponseTimeOutImpl responseTimeOut = new ResponseTimeOutImpl();
    return responseTimeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolReference createProtocolReference()
  {
    ProtocolReferenceImpl protocolReference = new ProtocolReferenceImpl();
    return protocolReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolDeclaration createProtocolDeclaration()
  {
    ProtocolDeclarationImpl protocolDeclaration = new ProtocolDeclarationImpl();
    return protocolDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue)
  {
    TimeUnit result = TimeUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimeUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPatternFromString(EDataType eDataType, String initialValue)
  {
    Pattern result = Pattern.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPatternToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelPackage getDomainmodelPackage()
  {
    return (DomainmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainmodelPackage getPackage()
  {
    return DomainmodelPackage.eINSTANCE;
  }

} //DomainmodelFactoryImpl
