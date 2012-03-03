/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.util;

import com.x.xocl.domainmodel.AuthorizationFeature;
import com.x.xocl.domainmodel.BranchCondition;
import com.x.xocl.domainmodel.DatagramAction;
import com.x.xocl.domainmodel.Domainmodel;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.x.xocl.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DomainmodelPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TOP_LEVEL_ELEMENT:
      {
        TopLevelElement topLevelElement = (TopLevelElement)theEObject;
        T result = caseTopLevelElement(topLevelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseTopLevelElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PACKAGE:
      {
        com.x.xocl.domainmodel.Package package_ = (com.x.xocl.domainmodel.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseTopLevelElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VERSION_STRING:
      {
        VersionString versionString = (VersionString)theEObject;
        T result = caseVersionString(versionString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TWO_PART_VERSION_STRING:
      {
        TwoPartVersionString twoPartVersionString = (TwoPartVersionString)theEObject;
        T result = caseTwoPartVersionString(twoPartVersionString);
        if (result == null) result = caseFourPartVersionString(twoPartVersionString);
        if (result == null) result = caseVersionString(twoPartVersionString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.FOUR_PART_VERSION_STRING:
      {
        FourPartVersionString fourPartVersionString = (FourPartVersionString)theEObject;
        T result = caseFourPartVersionString(fourPartVersionString);
        if (result == null) result = caseVersionString(fourPartVersionString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PACKAGE_ELEMENT:
      {
        PackageElement packageElement = (PackageElement)theEObject;
        T result = casePackageElement(packageElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PARTNER:
      {
        Partner partner = (Partner)theEObject;
        T result = casePartner(partner);
        if (result == null) result = casePackageElement(partner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PROCESS:
      {
        com.x.xocl.domainmodel.Process process = (com.x.xocl.domainmodel.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = casePackageElement(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PROCESS_ROLE:
      {
        ProcessRole processRole = (ProcessRole)theEObject;
        T result = caseProcessRole(processRole);
        if (result == null) result = caseWorkflowRoleReference(processRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = caseProcessRole(role);
        if (result == null) result = caseWorkflowRole(role);
        if (result == null) result = caseWorkflowRoleReference(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PRECONDITIONS:
      {
        Preconditions preconditions = (Preconditions)theEObject;
        T result = casePreconditions(preconditions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = casePackageElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ENTITY_STATE:
      {
        EntityState entityState = (EntityState)theEObject;
        T result = caseEntityState(entityState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ENTITY_STATE_TRANSITION:
      {
        EntityStateTransition entityStateTransition = (EntityStateTransition)theEObject;
        T result = caseEntityStateTransition(entityStateTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.POSTCONDITIONS:
      {
        Postconditions postconditions = (Postconditions)theEObject;
        T result = casePostconditions(postconditions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ON_PROCESS_RESULT:
      {
        OnProcessResult onProcessResult = (OnProcessResult)theEObject;
        T result = caseOnProcessResult(onProcessResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ON_PROCESS_SUCCESS:
      {
        OnProcessSuccess onProcessSuccess = (OnProcessSuccess)theEObject;
        T result = caseOnProcessSuccess(onProcessSuccess);
        if (result == null) result = caseOnProcessResult(onProcessSuccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ON_PROCESS_FAILURE:
      {
        OnProcessFailure onProcessFailure = (OnProcessFailure)theEObject;
        T result = caseOnProcessFailure(onProcessFailure);
        if (result == null) result = caseOnProcessResult(onProcessFailure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW:
      {
        Workflow workflow = (Workflow)theEObject;
        T result = caseWorkflow(workflow);
        if (result == null) result = casePackageElement(workflow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_VARIANT:
      {
        WorkflowVariant workflowVariant = (WorkflowVariant)theEObject;
        T result = caseWorkflowVariant(workflowVariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_ROLES:
      {
        WorkflowRoles workflowRoles = (WorkflowRoles)theEObject;
        T result = caseWorkflowRoles(workflowRoles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ROLE_DECLARATIONS:
      {
        RoleDeclarations roleDeclarations = (RoleDeclarations)theEObject;
        T result = caseRoleDeclarations(roleDeclarations);
        if (result == null) result = caseWorkflowRoles(roleDeclarations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_ROLE:
      {
        WorkflowRole workflowRole = (WorkflowRole)theEObject;
        T result = caseWorkflowRole(workflowRole);
        if (result == null) result = caseWorkflowRoleReference(workflowRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PROCESS_REFERENCE:
      {
        ProcessReference processReference = (ProcessReference)theEObject;
        T result = caseProcessReference(processReference);
        if (result == null) result = caseWorkflowRoles(processReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_BLOCK:
      {
        WorkflowBlock workflowBlock = (WorkflowBlock)theEObject;
        T result = caseWorkflowBlock(workflowBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.END_POINT:
      {
        EndPoint endPoint = (EndPoint)theEObject;
        T result = caseEndPoint(endPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_ELEMENT:
      {
        WorkflowElement workflowElement = (WorkflowElement)theEObject;
        T result = caseWorkflowElement(workflowElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_BRANCH:
      {
        WorkflowBranch workflowBranch = (WorkflowBranch)theEObject;
        T result = caseWorkflowBranch(workflowBranch);
        if (result == null) result = caseWorkflowElement(workflowBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.BRANCH_CONDITION:
      {
        BranchCondition branchCondition = (BranchCondition)theEObject;
        T result = caseBranchCondition(branchCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_ACTION:
      {
        WorkflowAction workflowAction = (WorkflowAction)theEObject;
        T result = caseWorkflowAction(workflowAction);
        if (result == null) result = caseWorkflowElement(workflowAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TRANSACTION_CALL:
      {
        TransactionCall transactionCall = (TransactionCall)theEObject;
        T result = caseTransactionCall(transactionCall);
        if (result == null) result = caseWorkflowAction(transactionCall);
        if (result == null) result = caseWorkflowElement(transactionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TRANSACTION_VARIANT_MAPPING:
      {
        TransactionVariantMapping transactionVariantMapping = (TransactionVariantMapping)theEObject;
        T result = caseTransactionVariantMapping(transactionVariantMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.SENDER_ROLE_MAPPING:
      {
        SenderRoleMapping senderRoleMapping = (SenderRoleMapping)theEObject;
        T result = caseSenderRoleMapping(senderRoleMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.RECEIVER_ROLE_MAPPING:
      {
        ReceiverRoleMapping receiverRoleMapping = (ReceiverRoleMapping)theEObject;
        T result = caseReceiverRoleMapping(receiverRoleMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_CALL:
      {
        WorkflowCall workflowCall = (WorkflowCall)theEObject;
        T result = caseWorkflowCall(workflowCall);
        if (result == null) result = caseWorkflowAction(workflowCall);
        if (result == null) result = caseWorkflowElement(workflowCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_VARIANT_MAPPING:
      {
        WorkflowVariantMapping workflowVariantMapping = (WorkflowVariantMapping)theEObject;
        T result = caseWorkflowVariantMapping(workflowVariantMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING:
      {
        WorkflowRoleMapping workflowRoleMapping = (WorkflowRoleMapping)theEObject;
        T result = caseWorkflowRoleMapping(workflowRoleMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.WORKFLOW_ROLE_REFERENCE:
      {
        WorkflowRoleReference workflowRoleReference = (WorkflowRoleReference)theEObject;
        T result = caseWorkflowRoleReference(workflowRoleReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TRANSACTION:
      {
        Transaction transaction = (Transaction)theEObject;
        T result = caseTransaction(transaction);
        if (result == null) result = casePackageElement(transaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.INFORM_TRANSACTION:
      {
        InformTransaction informTransaction = (InformTransaction)theEObject;
        T result = caseInformTransaction(informTransaction);
        if (result == null) result = caseTransaction(informTransaction);
        if (result == null) result = casePackageElement(informTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TRANSACTION_VARIANT:
      {
        TransactionVariant transactionVariant = (TransactionVariant)theEObject;
        T result = caseTransactionVariant(transactionVariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.DATAGRAM_ACTION:
      {
        DatagramAction datagramAction = (DatagramAction)theEObject;
        T result = caseDatagramAction(datagramAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPINGS:
      {
        VariantMessageMappings variantMessageMappings = (VariantMessageMappings)theEObject;
        T result = caseVariantMessageMappings(variantMessageMappings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING:
      {
        VariantMessageMapping variantMessageMapping = (VariantMessageMapping)theEObject;
        T result = caseVariantMessageMapping(variantMessageMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.MESSAGE_MAPPING:
      {
        MessageMapping messageMapping = (MessageMapping)theEObject;
        T result = caseMessageMapping(messageMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.REQUIRED_FEATURES:
      {
        RequiredFeatures requiredFeatures = (RequiredFeatures)theEObject;
        T result = caseRequiredFeatures(requiredFeatures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.REQUIRED_FEATURE:
      {
        RequiredFeature requiredFeature = (RequiredFeature)theEObject;
        T result = caseRequiredFeature(requiredFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.AUTHORIZATION_FEATURE:
      {
        AuthorizationFeature authorizationFeature = (AuthorizationFeature)theEObject;
        T result = caseAuthorizationFeature(authorizationFeature);
        if (result == null) result = caseRequiredFeature(authorizationFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.NON_REPUDIATION_FEATURE:
      {
        NonRepudiationFeature nonRepudiationFeature = (NonRepudiationFeature)theEObject;
        T result = caseNonRepudiationFeature(nonRepudiationFeature);
        if (result == null) result = caseRequiredFeature(nonRepudiationFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.NOTIFY_TRANSACTION:
      {
        NotifyTransaction notifyTransaction = (NotifyTransaction)theEObject;
        T result = caseNotifyTransaction(notifyTransaction);
        if (result == null) result = caseTransaction(notifyTransaction);
        if (result == null) result = casePackageElement(notifyTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ONE_WAY_ACTION:
      {
        OneWayAction oneWayAction = (OneWayAction)theEObject;
        T result = caseOneWayAction(oneWayAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ONE_WAY_TIME_OUTS:
      {
        OneWayTimeOuts oneWayTimeOuts = (OneWayTimeOuts)theEObject;
        T result = caseOneWayTimeOuts(oneWayTimeOuts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.ONE_WAY_TIME_OUT:
      {
        OneWayTimeOut oneWayTimeOut = (OneWayTimeOut)theEObject;
        T result = caseOneWayTimeOut(oneWayTimeOut);
        if (result == null) result = caseTwoWayTimeOut(oneWayTimeOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.RECEIPT_ACK_TIME_OUT:
      {
        ReceiptAckTimeOut receiptAckTimeOut = (ReceiptAckTimeOut)theEObject;
        T result = caseReceiptAckTimeOut(receiptAckTimeOut);
        if (result == null) result = caseOneWayTimeOut(receiptAckTimeOut);
        if (result == null) result = caseTwoWayTimeOut(receiptAckTimeOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TIME_OUT:
      {
        TimeOut timeOut = (TimeOut)theEObject;
        T result = caseTimeOut(timeOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.VALIDATION_ACK_TIME_OUT:
      {
        ValidationAckTimeOut validationAckTimeOut = (ValidationAckTimeOut)theEObject;
        T result = caseValidationAckTimeOut(validationAckTimeOut);
        if (result == null) result = caseOneWayTimeOut(validationAckTimeOut);
        if (result == null) result = caseTwoWayTimeOut(validationAckTimeOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.REQUEST_TRANSACTION:
      {
        RequestTransaction requestTransaction = (RequestTransaction)theEObject;
        T result = caseRequestTransaction(requestTransaction);
        if (result == null) result = caseTransaction(requestTransaction);
        if (result == null) result = casePackageElement(requestTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TWO_WAY_ACTION:
      {
        TwoWayAction twoWayAction = (TwoWayAction)theEObject;
        T result = caseTwoWayAction(twoWayAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TWO_WAY_TIME_OUTS:
      {
        TwoWayTimeOuts twoWayTimeOuts = (TwoWayTimeOuts)theEObject;
        T result = caseTwoWayTimeOuts(twoWayTimeOuts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.TWO_WAY_TIME_OUT:
      {
        TwoWayTimeOut twoWayTimeOut = (TwoWayTimeOut)theEObject;
        T result = caseTwoWayTimeOut(twoWayTimeOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.RESPONSE_TIME_OUT:
      {
        ResponseTimeOut responseTimeOut = (ResponseTimeOut)theEObject;
        T result = caseResponseTimeOut(responseTimeOut);
        if (result == null) result = caseTwoWayTimeOut(responseTimeOut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PROTOCOL:
      {
        Protocol protocol = (Protocol)theEObject;
        T result = caseProtocol(protocol);
        if (result == null) result = casePackageElement(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PROTOCOL_REFERENCE:
      {
        ProtocolReference protocolReference = (ProtocolReference)theEObject;
        T result = caseProtocolReference(protocolReference);
        if (result == null) result = caseProtocol(protocolReference);
        if (result == null) result = casePackageElement(protocolReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainmodelPackage.PROTOCOL_DECLARATION:
      {
        ProtocolDeclaration protocolDeclaration = (ProtocolDeclaration)theEObject;
        T result = caseProtocolDeclaration(protocolDeclaration);
        if (result == null) result = caseProtocol(protocolDeclaration);
        if (result == null) result = casePackageElement(protocolDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelElement(TopLevelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(com.x.xocl.domainmodel.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersionString(VersionString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Two Part Version String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Two Part Version String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTwoPartVersionString(TwoPartVersionString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Four Part Version String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Four Part Version String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFourPartVersionString(FourPartVersionString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageElement(PackageElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartner(Partner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(com.x.xocl.domainmodel.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessRole(ProcessRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preconditions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preconditions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreconditions(Preconditions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityState(EntityState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity State Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity State Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityStateTransition(EntityStateTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postconditions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postconditions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostconditions(Postconditions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Process Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Process Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnProcessResult(OnProcessResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Process Success</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Process Success</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnProcessSuccess(OnProcessSuccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Process Failure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Process Failure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnProcessFailure(OnProcessFailure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflow(Workflow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowVariant(WorkflowVariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Roles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Roles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowRoles(WorkflowRoles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Declarations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Declarations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleDeclarations(RoleDeclarations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowRole(WorkflowRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessReference(ProcessReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowBlock(WorkflowBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndPoint(EndPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowElement(WorkflowElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowBranch(WorkflowBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Branch Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Branch Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBranchCondition(BranchCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowAction(WorkflowAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactionCall(TransactionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction Variant Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction Variant Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactionVariantMapping(TransactionVariantMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sender Role Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sender Role Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSenderRoleMapping(SenderRoleMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Receiver Role Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Receiver Role Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReceiverRoleMapping(ReceiverRoleMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowCall(WorkflowCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Variant Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Variant Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowVariantMapping(WorkflowVariantMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Role Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Role Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowRoleMapping(WorkflowRoleMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Role Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Role Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowRoleReference(WorkflowRoleReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransaction(Transaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inform Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inform Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInformTransaction(InformTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransactionVariant(TransactionVariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datagram Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datagram Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatagramAction(DatagramAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant Message Mappings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant Message Mappings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantMessageMappings(VariantMessageMappings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant Message Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant Message Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantMessageMapping(VariantMessageMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageMapping(MessageMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredFeatures(RequiredFeatures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredFeature(RequiredFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Authorization Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Authorization Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuthorizationFeature(AuthorizationFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Repudiation Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Repudiation Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonRepudiationFeature(NonRepudiationFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Notify Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Notify Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotifyTransaction(NotifyTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Way Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Way Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneWayAction(OneWayAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Way Time Outs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Way Time Outs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneWayTimeOuts(OneWayTimeOuts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Way Time Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Way Time Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneWayTimeOut(OneWayTimeOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Receipt Ack Time Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Receipt Ack Time Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReceiptAckTimeOut(ReceiptAckTimeOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeOut(TimeOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validation Ack Time Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validation Ack Time Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidationAckTimeOut(ValidationAckTimeOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequestTransaction(RequestTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Two Way Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Two Way Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTwoWayAction(TwoWayAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Two Way Time Outs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Two Way Time Outs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTwoWayTimeOuts(TwoWayTimeOuts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Two Way Time Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Two Way Time Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTwoWayTimeOut(TwoWayTimeOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Response Time Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Response Time Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponseTimeOut(ResponseTimeOut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocol(Protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocolReference(ProtocolReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocolDeclaration(ProtocolDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DomainmodelSwitch
