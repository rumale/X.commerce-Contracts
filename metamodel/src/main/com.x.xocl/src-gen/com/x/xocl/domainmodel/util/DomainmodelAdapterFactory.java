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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.x.xocl.domainmodel.DomainmodelPackage
 * @generated
 */
public class DomainmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainmodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainmodelSwitch<Adapter> modelSwitch =
    new DomainmodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseTopLevelElement(TopLevelElement object)
      {
        return createTopLevelElementAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackage(com.x.xocl.domainmodel.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseVersionString(VersionString object)
      {
        return createVersionStringAdapter();
      }
      @Override
      public Adapter caseTwoPartVersionString(TwoPartVersionString object)
      {
        return createTwoPartVersionStringAdapter();
      }
      @Override
      public Adapter caseFourPartVersionString(FourPartVersionString object)
      {
        return createFourPartVersionStringAdapter();
      }
      @Override
      public Adapter casePackageElement(PackageElement object)
      {
        return createPackageElementAdapter();
      }
      @Override
      public Adapter casePartner(Partner object)
      {
        return createPartnerAdapter();
      }
      @Override
      public Adapter caseProcess(com.x.xocl.domainmodel.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessRole(ProcessRole object)
      {
        return createProcessRoleAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter casePreconditions(Preconditions object)
      {
        return createPreconditionsAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityState(EntityState object)
      {
        return createEntityStateAdapter();
      }
      @Override
      public Adapter caseEntityStateTransition(EntityStateTransition object)
      {
        return createEntityStateTransitionAdapter();
      }
      @Override
      public Adapter casePostconditions(Postconditions object)
      {
        return createPostconditionsAdapter();
      }
      @Override
      public Adapter caseOnProcessResult(OnProcessResult object)
      {
        return createOnProcessResultAdapter();
      }
      @Override
      public Adapter caseOnProcessSuccess(OnProcessSuccess object)
      {
        return createOnProcessSuccessAdapter();
      }
      @Override
      public Adapter caseOnProcessFailure(OnProcessFailure object)
      {
        return createOnProcessFailureAdapter();
      }
      @Override
      public Adapter caseWorkflow(Workflow object)
      {
        return createWorkflowAdapter();
      }
      @Override
      public Adapter caseWorkflowVariant(WorkflowVariant object)
      {
        return createWorkflowVariantAdapter();
      }
      @Override
      public Adapter caseWorkflowRoles(WorkflowRoles object)
      {
        return createWorkflowRolesAdapter();
      }
      @Override
      public Adapter caseRoleDeclarations(RoleDeclarations object)
      {
        return createRoleDeclarationsAdapter();
      }
      @Override
      public Adapter caseWorkflowRole(WorkflowRole object)
      {
        return createWorkflowRoleAdapter();
      }
      @Override
      public Adapter caseProcessReference(ProcessReference object)
      {
        return createProcessReferenceAdapter();
      }
      @Override
      public Adapter caseWorkflowBlock(WorkflowBlock object)
      {
        return createWorkflowBlockAdapter();
      }
      @Override
      public Adapter caseEndPoint(EndPoint object)
      {
        return createEndPointAdapter();
      }
      @Override
      public Adapter caseWorkflowElement(WorkflowElement object)
      {
        return createWorkflowElementAdapter();
      }
      @Override
      public Adapter caseWorkflowBranch(WorkflowBranch object)
      {
        return createWorkflowBranchAdapter();
      }
      @Override
      public Adapter caseBranchCondition(BranchCondition object)
      {
        return createBranchConditionAdapter();
      }
      @Override
      public Adapter caseWorkflowAction(WorkflowAction object)
      {
        return createWorkflowActionAdapter();
      }
      @Override
      public Adapter caseTransactionCall(TransactionCall object)
      {
        return createTransactionCallAdapter();
      }
      @Override
      public Adapter caseTransactionVariantMapping(TransactionVariantMapping object)
      {
        return createTransactionVariantMappingAdapter();
      }
      @Override
      public Adapter caseSenderRoleMapping(SenderRoleMapping object)
      {
        return createSenderRoleMappingAdapter();
      }
      @Override
      public Adapter caseReceiverRoleMapping(ReceiverRoleMapping object)
      {
        return createReceiverRoleMappingAdapter();
      }
      @Override
      public Adapter caseWorkflowCall(WorkflowCall object)
      {
        return createWorkflowCallAdapter();
      }
      @Override
      public Adapter caseWorkflowVariantMapping(WorkflowVariantMapping object)
      {
        return createWorkflowVariantMappingAdapter();
      }
      @Override
      public Adapter caseWorkflowRoleMapping(WorkflowRoleMapping object)
      {
        return createWorkflowRoleMappingAdapter();
      }
      @Override
      public Adapter caseWorkflowRoleReference(WorkflowRoleReference object)
      {
        return createWorkflowRoleReferenceAdapter();
      }
      @Override
      public Adapter caseTransaction(Transaction object)
      {
        return createTransactionAdapter();
      }
      @Override
      public Adapter caseInformTransaction(InformTransaction object)
      {
        return createInformTransactionAdapter();
      }
      @Override
      public Adapter caseTransactionVariant(TransactionVariant object)
      {
        return createTransactionVariantAdapter();
      }
      @Override
      public Adapter caseDatagramAction(DatagramAction object)
      {
        return createDatagramActionAdapter();
      }
      @Override
      public Adapter caseVariantMessageMappings(VariantMessageMappings object)
      {
        return createVariantMessageMappingsAdapter();
      }
      @Override
      public Adapter caseVariantMessageMapping(VariantMessageMapping object)
      {
        return createVariantMessageMappingAdapter();
      }
      @Override
      public Adapter caseMessageMapping(MessageMapping object)
      {
        return createMessageMappingAdapter();
      }
      @Override
      public Adapter caseRequiredFeatures(RequiredFeatures object)
      {
        return createRequiredFeaturesAdapter();
      }
      @Override
      public Adapter caseRequiredFeature(RequiredFeature object)
      {
        return createRequiredFeatureAdapter();
      }
      @Override
      public Adapter caseAuthorizationFeature(AuthorizationFeature object)
      {
        return createAuthorizationFeatureAdapter();
      }
      @Override
      public Adapter caseNonRepudiationFeature(NonRepudiationFeature object)
      {
        return createNonRepudiationFeatureAdapter();
      }
      @Override
      public Adapter caseNotifyTransaction(NotifyTransaction object)
      {
        return createNotifyTransactionAdapter();
      }
      @Override
      public Adapter caseOneWayAction(OneWayAction object)
      {
        return createOneWayActionAdapter();
      }
      @Override
      public Adapter caseOneWayTimeOuts(OneWayTimeOuts object)
      {
        return createOneWayTimeOutsAdapter();
      }
      @Override
      public Adapter caseOneWayTimeOut(OneWayTimeOut object)
      {
        return createOneWayTimeOutAdapter();
      }
      @Override
      public Adapter caseReceiptAckTimeOut(ReceiptAckTimeOut object)
      {
        return createReceiptAckTimeOutAdapter();
      }
      @Override
      public Adapter caseTimeOut(TimeOut object)
      {
        return createTimeOutAdapter();
      }
      @Override
      public Adapter caseValidationAckTimeOut(ValidationAckTimeOut object)
      {
        return createValidationAckTimeOutAdapter();
      }
      @Override
      public Adapter caseRequestTransaction(RequestTransaction object)
      {
        return createRequestTransactionAdapter();
      }
      @Override
      public Adapter caseTwoWayAction(TwoWayAction object)
      {
        return createTwoWayActionAdapter();
      }
      @Override
      public Adapter caseTwoWayTimeOuts(TwoWayTimeOuts object)
      {
        return createTwoWayTimeOutsAdapter();
      }
      @Override
      public Adapter caseTwoWayTimeOut(TwoWayTimeOut object)
      {
        return createTwoWayTimeOutAdapter();
      }
      @Override
      public Adapter caseResponseTimeOut(ResponseTimeOut object)
      {
        return createResponseTimeOutAdapter();
      }
      @Override
      public Adapter caseProtocol(Protocol object)
      {
        return createProtocolAdapter();
      }
      @Override
      public Adapter caseProtocolReference(ProtocolReference object)
      {
        return createProtocolReferenceAdapter();
      }
      @Override
      public Adapter caseProtocolDeclaration(ProtocolDeclaration object)
      {
        return createProtocolDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TopLevelElement
   * @generated
   */
  public Adapter createTopLevelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.VersionString <em>Version String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.VersionString
   * @generated
   */
  public Adapter createVersionStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TwoPartVersionString <em>Two Part Version String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TwoPartVersionString
   * @generated
   */
  public Adapter createTwoPartVersionStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.FourPartVersionString <em>Four Part Version String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.FourPartVersionString
   * @generated
   */
  public Adapter createFourPartVersionStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.PackageElement <em>Package Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.PackageElement
   * @generated
   */
  public Adapter createPackageElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Partner <em>Partner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Partner
   * @generated
   */
  public Adapter createPartnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ProcessRole <em>Process Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ProcessRole
   * @generated
   */
  public Adapter createProcessRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Preconditions <em>Preconditions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Preconditions
   * @generated
   */
  public Adapter createPreconditionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.EntityState <em>Entity State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.EntityState
   * @generated
   */
  public Adapter createEntityStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.EntityStateTransition <em>Entity State Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.EntityStateTransition
   * @generated
   */
  public Adapter createEntityStateTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Postconditions <em>Postconditions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Postconditions
   * @generated
   */
  public Adapter createPostconditionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.OnProcessResult <em>On Process Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.OnProcessResult
   * @generated
   */
  public Adapter createOnProcessResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.OnProcessSuccess <em>On Process Success</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.OnProcessSuccess
   * @generated
   */
  public Adapter createOnProcessSuccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.OnProcessFailure <em>On Process Failure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.OnProcessFailure
   * @generated
   */
  public Adapter createOnProcessFailureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Workflow <em>Workflow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Workflow
   * @generated
   */
  public Adapter createWorkflowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowVariant <em>Workflow Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowVariant
   * @generated
   */
  public Adapter createWorkflowVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowRoles <em>Workflow Roles</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowRoles
   * @generated
   */
  public Adapter createWorkflowRolesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.RoleDeclarations <em>Role Declarations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.RoleDeclarations
   * @generated
   */
  public Adapter createRoleDeclarationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowRole <em>Workflow Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowRole
   * @generated
   */
  public Adapter createWorkflowRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ProcessReference <em>Process Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ProcessReference
   * @generated
   */
  public Adapter createProcessReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowBlock <em>Workflow Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowBlock
   * @generated
   */
  public Adapter createWorkflowBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.EndPoint <em>End Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.EndPoint
   * @generated
   */
  public Adapter createEndPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowElement <em>Workflow Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowElement
   * @generated
   */
  public Adapter createWorkflowElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowBranch <em>Workflow Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowBranch
   * @generated
   */
  public Adapter createWorkflowBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.BranchCondition <em>Branch Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.BranchCondition
   * @generated
   */
  public Adapter createBranchConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowAction <em>Workflow Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowAction
   * @generated
   */
  public Adapter createWorkflowActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TransactionCall <em>Transaction Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TransactionCall
   * @generated
   */
  public Adapter createTransactionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TransactionVariantMapping <em>Transaction Variant Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TransactionVariantMapping
   * @generated
   */
  public Adapter createTransactionVariantMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.SenderRoleMapping <em>Sender Role Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.SenderRoleMapping
   * @generated
   */
  public Adapter createSenderRoleMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ReceiverRoleMapping <em>Receiver Role Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ReceiverRoleMapping
   * @generated
   */
  public Adapter createReceiverRoleMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowCall <em>Workflow Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowCall
   * @generated
   */
  public Adapter createWorkflowCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowVariantMapping <em>Workflow Variant Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowVariantMapping
   * @generated
   */
  public Adapter createWorkflowVariantMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowRoleMapping <em>Workflow Role Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowRoleMapping
   * @generated
   */
  public Adapter createWorkflowRoleMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.WorkflowRoleReference <em>Workflow Role Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.WorkflowRoleReference
   * @generated
   */
  public Adapter createWorkflowRoleReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Transaction
   * @generated
   */
  public Adapter createTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.InformTransaction <em>Inform Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.InformTransaction
   * @generated
   */
  public Adapter createInformTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TransactionVariant <em>Transaction Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TransactionVariant
   * @generated
   */
  public Adapter createTransactionVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.DatagramAction <em>Datagram Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.DatagramAction
   * @generated
   */
  public Adapter createDatagramActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.VariantMessageMappings <em>Variant Message Mappings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.VariantMessageMappings
   * @generated
   */
  public Adapter createVariantMessageMappingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.VariantMessageMapping <em>Variant Message Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.VariantMessageMapping
   * @generated
   */
  public Adapter createVariantMessageMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.MessageMapping <em>Message Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.MessageMapping
   * @generated
   */
  public Adapter createMessageMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.RequiredFeatures <em>Required Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.RequiredFeatures
   * @generated
   */
  public Adapter createRequiredFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.RequiredFeature <em>Required Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.RequiredFeature
   * @generated
   */
  public Adapter createRequiredFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.AuthorizationFeature <em>Authorization Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.AuthorizationFeature
   * @generated
   */
  public Adapter createAuthorizationFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.NonRepudiationFeature <em>Non Repudiation Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.NonRepudiationFeature
   * @generated
   */
  public Adapter createNonRepudiationFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.NotifyTransaction <em>Notify Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.NotifyTransaction
   * @generated
   */
  public Adapter createNotifyTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.OneWayAction <em>One Way Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.OneWayAction
   * @generated
   */
  public Adapter createOneWayActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.OneWayTimeOuts <em>One Way Time Outs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.OneWayTimeOuts
   * @generated
   */
  public Adapter createOneWayTimeOutsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.OneWayTimeOut <em>One Way Time Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.OneWayTimeOut
   * @generated
   */
  public Adapter createOneWayTimeOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ReceiptAckTimeOut <em>Receipt Ack Time Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ReceiptAckTimeOut
   * @generated
   */
  public Adapter createReceiptAckTimeOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TimeOut <em>Time Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TimeOut
   * @generated
   */
  public Adapter createTimeOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ValidationAckTimeOut <em>Validation Ack Time Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ValidationAckTimeOut
   * @generated
   */
  public Adapter createValidationAckTimeOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.RequestTransaction <em>Request Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.RequestTransaction
   * @generated
   */
  public Adapter createRequestTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TwoWayAction <em>Two Way Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TwoWayAction
   * @generated
   */
  public Adapter createTwoWayActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TwoWayTimeOuts <em>Two Way Time Outs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TwoWayTimeOuts
   * @generated
   */
  public Adapter createTwoWayTimeOutsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.TwoWayTimeOut <em>Two Way Time Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.TwoWayTimeOut
   * @generated
   */
  public Adapter createTwoWayTimeOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ResponseTimeOut <em>Response Time Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ResponseTimeOut
   * @generated
   */
  public Adapter createResponseTimeOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.Protocol
   * @generated
   */
  public Adapter createProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ProtocolReference <em>Protocol Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ProtocolReference
   * @generated
   */
  public Adapter createProtocolReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.x.xocl.domainmodel.ProtocolDeclaration <em>Protocol Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.x.xocl.domainmodel.ProtocolDeclaration
   * @generated
   */
  public Adapter createProtocolDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DomainmodelAdapterFactory
