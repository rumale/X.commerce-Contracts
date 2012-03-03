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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelPackageImpl extends EPackageImpl implements DomainmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainmodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass twoPartVersionStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fourPartVersionStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preconditionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityStateTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postconditionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onProcessResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onProcessSuccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onProcessFailureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowVariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowRolesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleDeclarationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branchConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionVariantMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass senderRoleMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass receiverRoleMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowVariantMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowRoleMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workflowRoleReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass informTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionVariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datagramActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantMessageMappingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantMessageMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredFeaturesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorizationFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonRepudiationFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notifyTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneWayActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneWayTimeOutsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneWayTimeOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass receiptAckTimeOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validationAckTimeOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requestTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass twoWayActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass twoWayTimeOutsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass twoWayTimeOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responseTimeOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum patternEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.x.xocl.domainmodel.DomainmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainmodelPackageImpl()
  {
    super(eNS_URI, DomainmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DomainmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DomainmodelPackage init()
  {
    if (isInited) return (DomainmodelPackage)EPackage.Registry.INSTANCE.getEPackage(DomainmodelPackage.eNS_URI);

    // Obtain or create and register package
    DomainmodelPackageImpl theDomainmodelPackage = (DomainmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDomainmodelPackage.createPackageContents();

    // Initialize created meta-data
    theDomainmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDomainmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DomainmodelPackage.eNS_URI, theDomainmodelPackage);
    return theDomainmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainmodel()
  {
    return domainmodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainmodel_Elements()
  {
    return (EReference)domainmodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelElement()
  {
    return topLevelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Package()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Version()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Elements()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersionString()
  {
    return versionStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwoPartVersionString()
  {
    return twoPartVersionStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTwoPartVersionString_Major()
  {
    return (EAttribute)twoPartVersionStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTwoPartVersionString_Minor()
  {
    return (EAttribute)twoPartVersionStringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTwoPartVersionString_Release()
  {
    return (EAttribute)twoPartVersionStringEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTwoPartVersionString_Build()
  {
    return (EAttribute)twoPartVersionStringEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFourPartVersionString()
  {
    return fourPartVersionStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageElement()
  {
    return packageElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageElement_Name()
  {
    return (EAttribute)packageElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartner()
  {
    return partnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartner_Responsibilities()
  {
    return (EReference)partnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Roles()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Description()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Preconditions()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Postconditions()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessRole()
  {
    return processRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreconditions()
  {
    return preconditionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditions_Conditions()
  {
    return (EReference)preconditionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_States()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityState()
  {
    return entityStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityState_Name()
  {
    return (EAttribute)entityStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityState_Transitions()
  {
    return (EReference)entityStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityStateTransition()
  {
    return entityStateTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityStateTransition_Successor()
  {
    return (EReference)entityStateTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostconditions()
  {
    return postconditionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostconditions_Success()
  {
    return (EReference)postconditionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostconditions_Failure()
  {
    return (EReference)postconditionsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnProcessResult()
  {
    return onProcessResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOnProcessResult_Results()
  {
    return (EReference)onProcessResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnProcessSuccess()
  {
    return onProcessSuccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnProcessFailure()
  {
    return onProcessFailureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflow()
  {
    return workflowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflow_Variants()
  {
    return (EReference)workflowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflow_Roles()
  {
    return (EReference)workflowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflow_Contents()
  {
    return (EReference)workflowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowVariant()
  {
    return workflowVariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkflowVariant_Name()
  {
    return (EAttribute)workflowVariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowRoles()
  {
    return workflowRolesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleDeclarations()
  {
    return roleDeclarationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleDeclarations_Roles()
  {
    return (EReference)roleDeclarationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowRole()
  {
    return workflowRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessReference()
  {
    return processReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessReference_Implements()
  {
    return (EReference)processReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowBlock()
  {
    return workflowBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowBlock_Elements()
  {
    return (EReference)workflowBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndPoint()
  {
    return endPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndPoint_Name()
  {
    return (EAttribute)endPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowElement()
  {
    return workflowElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowBranch()
  {
    return workflowBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowBranch_Conditions()
  {
    return (EReference)workflowBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranchCondition()
  {
    return branchConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranchCondition_Contents()
  {
    return (EReference)branchConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowAction()
  {
    return workflowActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactionCall()
  {
    return transactionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionCall_Name()
  {
    return (EReference)transactionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionCall_Variants()
  {
    return (EReference)transactionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionCall_Sender()
  {
    return (EReference)transactionCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionCall_Receiver()
  {
    return (EReference)transactionCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactionVariantMapping()
  {
    return transactionVariantMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionVariantMapping_Parameter()
  {
    return (EReference)transactionVariantMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransactionVariantMapping_Value()
  {
    return (EReference)transactionVariantMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSenderRoleMapping()
  {
    return senderRoleMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSenderRoleMapping_Parameter()
  {
    return (EAttribute)senderRoleMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSenderRoleMapping_Value()
  {
    return (EReference)senderRoleMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReceiverRoleMapping()
  {
    return receiverRoleMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReceiverRoleMapping_Parameter()
  {
    return (EAttribute)receiverRoleMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReceiverRoleMapping_Value()
  {
    return (EReference)receiverRoleMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowCall()
  {
    return workflowCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowCall_Name()
  {
    return (EReference)workflowCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowCall_Variants()
  {
    return (EReference)workflowCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowCall_Roles()
  {
    return (EReference)workflowCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowVariantMapping()
  {
    return workflowVariantMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowVariantMapping_Parameter()
  {
    return (EReference)workflowVariantMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowVariantMapping_Value()
  {
    return (EReference)workflowVariantMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowRoleMapping()
  {
    return workflowRoleMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowRoleMapping_Parameter()
  {
    return (EReference)workflowRoleMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkflowRoleMapping_Value()
  {
    return (EReference)workflowRoleMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkflowRoleReference()
  {
    return workflowRoleReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransaction()
  {
    return transactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransaction_Variants()
  {
    return (EReference)transactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransaction_Postconditions()
  {
    return (EReference)transactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInformTransaction()
  {
    return informTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInformTransaction_Pattern()
  {
    return (EAttribute)informTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInformTransaction_SendAction()
  {
    return (EReference)informTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransactionVariant()
  {
    return transactionVariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransactionVariant_Name()
  {
    return (EAttribute)transactionVariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatagramAction()
  {
    return datagramActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatagramAction_Messages()
  {
    return (EReference)datagramActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatagramAction_Requires()
  {
    return (EReference)datagramActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariantMessageMappings()
  {
    return variantMessageMappingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantMessageMappings_Variants()
  {
    return (EReference)variantMessageMappingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariantMessageMapping()
  {
    return variantMessageMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantMessageMapping_Variant()
  {
    return (EReference)variantMessageMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantMessageMapping_Mappings()
  {
    return (EReference)variantMessageMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageMapping()
  {
    return messageMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageMapping_Parameter()
  {
    return (EAttribute)messageMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessageMapping_Value()
  {
    return (EAttribute)messageMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredFeatures()
  {
    return requiredFeaturesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiredFeatures_Features()
  {
    return (EReference)requiredFeaturesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredFeature()
  {
    return requiredFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthorizationFeature()
  {
    return authorizationFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthorizationFeature_Authorization()
  {
    return (EAttribute)authorizationFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonRepudiationFeature()
  {
    return nonRepudiationFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNonRepudiationFeature_Nonrepudiation()
  {
    return (EAttribute)nonRepudiationFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotifyTransaction()
  {
    return notifyTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotifyTransaction_Pattern()
  {
    return (EAttribute)notifyTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotifyTransaction_SendAction()
  {
    return (EReference)notifyTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneWayAction()
  {
    return oneWayActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneWayAction_Messages()
  {
    return (EReference)oneWayActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneWayAction_Requires()
  {
    return (EReference)oneWayActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneWayAction_Timeouts()
  {
    return (EReference)oneWayActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneWayAction_Retries()
  {
    return (EAttribute)oneWayActionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneWayTimeOuts()
  {
    return oneWayTimeOutsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneWayTimeOuts_Timeouts()
  {
    return (EReference)oneWayTimeOutsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneWayTimeOut()
  {
    return oneWayTimeOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReceiptAckTimeOut()
  {
    return receiptAckTimeOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeOut()
  {
    return timeOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeOut_Value()
  {
    return (EAttribute)timeOutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeOut_Unit()
  {
    return (EAttribute)timeOutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidationAckTimeOut()
  {
    return validationAckTimeOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequestTransaction()
  {
    return requestTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequestTransaction_Pattern()
  {
    return (EAttribute)requestTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequestTransaction_SendAction()
  {
    return (EReference)requestTransactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequestTransaction_ReceiveAction()
  {
    return (EReference)requestTransactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwoWayAction()
  {
    return twoWayActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoWayAction_Messages()
  {
    return (EReference)twoWayActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoWayAction_Requires()
  {
    return (EReference)twoWayActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoWayAction_Timeouts()
  {
    return (EReference)twoWayActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTwoWayAction_Retries()
  {
    return (EAttribute)twoWayActionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwoWayTimeOuts()
  {
    return twoWayTimeOutsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoWayTimeOuts_Timeouts()
  {
    return (EReference)twoWayTimeOutsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwoWayTimeOut()
  {
    return twoWayTimeOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoWayTimeOut_Timeout()
  {
    return (EReference)twoWayTimeOutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResponseTimeOut()
  {
    return responseTimeOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocolReference()
  {
    return protocolReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocolDeclaration()
  {
    return protocolDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtocolDeclaration_Messages()
  {
    return (EAttribute)protocolDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTimeUnit()
  {
    return timeUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPattern()
  {
    return patternEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainmodelFactory getDomainmodelFactory()
  {
    return (DomainmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainmodelEClass = createEClass(DOMAINMODEL);
    createEReference(domainmodelEClass, DOMAINMODEL__ELEMENTS);

    topLevelElementEClass = createEClass(TOP_LEVEL_ELEMENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__PACKAGE);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__VERSION);
    createEReference(packageEClass, PACKAGE__ELEMENTS);

    versionStringEClass = createEClass(VERSION_STRING);

    twoPartVersionStringEClass = createEClass(TWO_PART_VERSION_STRING);
    createEAttribute(twoPartVersionStringEClass, TWO_PART_VERSION_STRING__MAJOR);
    createEAttribute(twoPartVersionStringEClass, TWO_PART_VERSION_STRING__MINOR);
    createEAttribute(twoPartVersionStringEClass, TWO_PART_VERSION_STRING__RELEASE);
    createEAttribute(twoPartVersionStringEClass, TWO_PART_VERSION_STRING__BUILD);

    fourPartVersionStringEClass = createEClass(FOUR_PART_VERSION_STRING);

    packageElementEClass = createEClass(PACKAGE_ELEMENT);
    createEAttribute(packageElementEClass, PACKAGE_ELEMENT__NAME);

    partnerEClass = createEClass(PARTNER);
    createEReference(partnerEClass, PARTNER__RESPONSIBILITIES);

    processEClass = createEClass(PROCESS);
    createEReference(processEClass, PROCESS__ROLES);
    createEAttribute(processEClass, PROCESS__DESCRIPTION);
    createEReference(processEClass, PROCESS__PRECONDITIONS);
    createEReference(processEClass, PROCESS__POSTCONDITIONS);

    processRoleEClass = createEClass(PROCESS_ROLE);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);

    preconditionsEClass = createEClass(PRECONDITIONS);
    createEReference(preconditionsEClass, PRECONDITIONS__CONDITIONS);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__STATES);

    entityStateEClass = createEClass(ENTITY_STATE);
    createEAttribute(entityStateEClass, ENTITY_STATE__NAME);
    createEReference(entityStateEClass, ENTITY_STATE__TRANSITIONS);

    entityStateTransitionEClass = createEClass(ENTITY_STATE_TRANSITION);
    createEReference(entityStateTransitionEClass, ENTITY_STATE_TRANSITION__SUCCESSOR);

    postconditionsEClass = createEClass(POSTCONDITIONS);
    createEReference(postconditionsEClass, POSTCONDITIONS__SUCCESS);
    createEReference(postconditionsEClass, POSTCONDITIONS__FAILURE);

    onProcessResultEClass = createEClass(ON_PROCESS_RESULT);
    createEReference(onProcessResultEClass, ON_PROCESS_RESULT__RESULTS);

    onProcessSuccessEClass = createEClass(ON_PROCESS_SUCCESS);

    onProcessFailureEClass = createEClass(ON_PROCESS_FAILURE);

    workflowEClass = createEClass(WORKFLOW);
    createEReference(workflowEClass, WORKFLOW__VARIANTS);
    createEReference(workflowEClass, WORKFLOW__ROLES);
    createEReference(workflowEClass, WORKFLOW__CONTENTS);

    workflowVariantEClass = createEClass(WORKFLOW_VARIANT);
    createEAttribute(workflowVariantEClass, WORKFLOW_VARIANT__NAME);

    workflowRolesEClass = createEClass(WORKFLOW_ROLES);

    roleDeclarationsEClass = createEClass(ROLE_DECLARATIONS);
    createEReference(roleDeclarationsEClass, ROLE_DECLARATIONS__ROLES);

    workflowRoleEClass = createEClass(WORKFLOW_ROLE);

    processReferenceEClass = createEClass(PROCESS_REFERENCE);
    createEReference(processReferenceEClass, PROCESS_REFERENCE__IMPLEMENTS);

    workflowBlockEClass = createEClass(WORKFLOW_BLOCK);
    createEReference(workflowBlockEClass, WORKFLOW_BLOCK__ELEMENTS);

    endPointEClass = createEClass(END_POINT);
    createEAttribute(endPointEClass, END_POINT__NAME);

    workflowElementEClass = createEClass(WORKFLOW_ELEMENT);

    workflowBranchEClass = createEClass(WORKFLOW_BRANCH);
    createEReference(workflowBranchEClass, WORKFLOW_BRANCH__CONDITIONS);

    branchConditionEClass = createEClass(BRANCH_CONDITION);
    createEReference(branchConditionEClass, BRANCH_CONDITION__CONTENTS);

    workflowActionEClass = createEClass(WORKFLOW_ACTION);

    transactionCallEClass = createEClass(TRANSACTION_CALL);
    createEReference(transactionCallEClass, TRANSACTION_CALL__NAME);
    createEReference(transactionCallEClass, TRANSACTION_CALL__VARIANTS);
    createEReference(transactionCallEClass, TRANSACTION_CALL__SENDER);
    createEReference(transactionCallEClass, TRANSACTION_CALL__RECEIVER);

    transactionVariantMappingEClass = createEClass(TRANSACTION_VARIANT_MAPPING);
    createEReference(transactionVariantMappingEClass, TRANSACTION_VARIANT_MAPPING__PARAMETER);
    createEReference(transactionVariantMappingEClass, TRANSACTION_VARIANT_MAPPING__VALUE);

    senderRoleMappingEClass = createEClass(SENDER_ROLE_MAPPING);
    createEAttribute(senderRoleMappingEClass, SENDER_ROLE_MAPPING__PARAMETER);
    createEReference(senderRoleMappingEClass, SENDER_ROLE_MAPPING__VALUE);

    receiverRoleMappingEClass = createEClass(RECEIVER_ROLE_MAPPING);
    createEAttribute(receiverRoleMappingEClass, RECEIVER_ROLE_MAPPING__PARAMETER);
    createEReference(receiverRoleMappingEClass, RECEIVER_ROLE_MAPPING__VALUE);

    workflowCallEClass = createEClass(WORKFLOW_CALL);
    createEReference(workflowCallEClass, WORKFLOW_CALL__NAME);
    createEReference(workflowCallEClass, WORKFLOW_CALL__VARIANTS);
    createEReference(workflowCallEClass, WORKFLOW_CALL__ROLES);

    workflowVariantMappingEClass = createEClass(WORKFLOW_VARIANT_MAPPING);
    createEReference(workflowVariantMappingEClass, WORKFLOW_VARIANT_MAPPING__PARAMETER);
    createEReference(workflowVariantMappingEClass, WORKFLOW_VARIANT_MAPPING__VALUE);

    workflowRoleMappingEClass = createEClass(WORKFLOW_ROLE_MAPPING);
    createEReference(workflowRoleMappingEClass, WORKFLOW_ROLE_MAPPING__PARAMETER);
    createEReference(workflowRoleMappingEClass, WORKFLOW_ROLE_MAPPING__VALUE);

    workflowRoleReferenceEClass = createEClass(WORKFLOW_ROLE_REFERENCE);

    transactionEClass = createEClass(TRANSACTION);
    createEReference(transactionEClass, TRANSACTION__VARIANTS);
    createEReference(transactionEClass, TRANSACTION__POSTCONDITIONS);

    informTransactionEClass = createEClass(INFORM_TRANSACTION);
    createEAttribute(informTransactionEClass, INFORM_TRANSACTION__PATTERN);
    createEReference(informTransactionEClass, INFORM_TRANSACTION__SEND_ACTION);

    transactionVariantEClass = createEClass(TRANSACTION_VARIANT);
    createEAttribute(transactionVariantEClass, TRANSACTION_VARIANT__NAME);

    datagramActionEClass = createEClass(DATAGRAM_ACTION);
    createEReference(datagramActionEClass, DATAGRAM_ACTION__MESSAGES);
    createEReference(datagramActionEClass, DATAGRAM_ACTION__REQUIRES);

    variantMessageMappingsEClass = createEClass(VARIANT_MESSAGE_MAPPINGS);
    createEReference(variantMessageMappingsEClass, VARIANT_MESSAGE_MAPPINGS__VARIANTS);

    variantMessageMappingEClass = createEClass(VARIANT_MESSAGE_MAPPING);
    createEReference(variantMessageMappingEClass, VARIANT_MESSAGE_MAPPING__VARIANT);
    createEReference(variantMessageMappingEClass, VARIANT_MESSAGE_MAPPING__MAPPINGS);

    messageMappingEClass = createEClass(MESSAGE_MAPPING);
    createEAttribute(messageMappingEClass, MESSAGE_MAPPING__PARAMETER);
    createEAttribute(messageMappingEClass, MESSAGE_MAPPING__VALUE);

    requiredFeaturesEClass = createEClass(REQUIRED_FEATURES);
    createEReference(requiredFeaturesEClass, REQUIRED_FEATURES__FEATURES);

    requiredFeatureEClass = createEClass(REQUIRED_FEATURE);

    authorizationFeatureEClass = createEClass(AUTHORIZATION_FEATURE);
    createEAttribute(authorizationFeatureEClass, AUTHORIZATION_FEATURE__AUTHORIZATION);

    nonRepudiationFeatureEClass = createEClass(NON_REPUDIATION_FEATURE);
    createEAttribute(nonRepudiationFeatureEClass, NON_REPUDIATION_FEATURE__NONREPUDIATION);

    notifyTransactionEClass = createEClass(NOTIFY_TRANSACTION);
    createEAttribute(notifyTransactionEClass, NOTIFY_TRANSACTION__PATTERN);
    createEReference(notifyTransactionEClass, NOTIFY_TRANSACTION__SEND_ACTION);

    oneWayActionEClass = createEClass(ONE_WAY_ACTION);
    createEReference(oneWayActionEClass, ONE_WAY_ACTION__MESSAGES);
    createEReference(oneWayActionEClass, ONE_WAY_ACTION__REQUIRES);
    createEReference(oneWayActionEClass, ONE_WAY_ACTION__TIMEOUTS);
    createEAttribute(oneWayActionEClass, ONE_WAY_ACTION__RETRIES);

    oneWayTimeOutsEClass = createEClass(ONE_WAY_TIME_OUTS);
    createEReference(oneWayTimeOutsEClass, ONE_WAY_TIME_OUTS__TIMEOUTS);

    oneWayTimeOutEClass = createEClass(ONE_WAY_TIME_OUT);

    receiptAckTimeOutEClass = createEClass(RECEIPT_ACK_TIME_OUT);

    timeOutEClass = createEClass(TIME_OUT);
    createEAttribute(timeOutEClass, TIME_OUT__VALUE);
    createEAttribute(timeOutEClass, TIME_OUT__UNIT);

    validationAckTimeOutEClass = createEClass(VALIDATION_ACK_TIME_OUT);

    requestTransactionEClass = createEClass(REQUEST_TRANSACTION);
    createEAttribute(requestTransactionEClass, REQUEST_TRANSACTION__PATTERN);
    createEReference(requestTransactionEClass, REQUEST_TRANSACTION__SEND_ACTION);
    createEReference(requestTransactionEClass, REQUEST_TRANSACTION__RECEIVE_ACTION);

    twoWayActionEClass = createEClass(TWO_WAY_ACTION);
    createEReference(twoWayActionEClass, TWO_WAY_ACTION__MESSAGES);
    createEReference(twoWayActionEClass, TWO_WAY_ACTION__REQUIRES);
    createEReference(twoWayActionEClass, TWO_WAY_ACTION__TIMEOUTS);
    createEAttribute(twoWayActionEClass, TWO_WAY_ACTION__RETRIES);

    twoWayTimeOutsEClass = createEClass(TWO_WAY_TIME_OUTS);
    createEReference(twoWayTimeOutsEClass, TWO_WAY_TIME_OUTS__TIMEOUTS);

    twoWayTimeOutEClass = createEClass(TWO_WAY_TIME_OUT);
    createEReference(twoWayTimeOutEClass, TWO_WAY_TIME_OUT__TIMEOUT);

    responseTimeOutEClass = createEClass(RESPONSE_TIME_OUT);

    protocolEClass = createEClass(PROTOCOL);

    protocolReferenceEClass = createEClass(PROTOCOL_REFERENCE);

    protocolDeclarationEClass = createEClass(PROTOCOL_DECLARATION);
    createEAttribute(protocolDeclarationEClass, PROTOCOL_DECLARATION__MESSAGES);

    // Create enums
    timeUnitEEnum = createEEnum(TIME_UNIT);
    patternEEnum = createEEnum(PATTERN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importEClass.getESuperTypes().add(this.getTopLevelElement());
    packageEClass.getESuperTypes().add(this.getTopLevelElement());
    twoPartVersionStringEClass.getESuperTypes().add(this.getVersionString());
    twoPartVersionStringEClass.getESuperTypes().add(this.getFourPartVersionString());
    fourPartVersionStringEClass.getESuperTypes().add(this.getVersionString());
    partnerEClass.getESuperTypes().add(this.getPackageElement());
    processEClass.getESuperTypes().add(this.getPackageElement());
    processRoleEClass.getESuperTypes().add(this.getWorkflowRoleReference());
    roleEClass.getESuperTypes().add(this.getProcessRole());
    roleEClass.getESuperTypes().add(this.getWorkflowRole());
    entityEClass.getESuperTypes().add(this.getPackageElement());
    onProcessSuccessEClass.getESuperTypes().add(this.getOnProcessResult());
    onProcessFailureEClass.getESuperTypes().add(this.getOnProcessResult());
    workflowEClass.getESuperTypes().add(this.getPackageElement());
    roleDeclarationsEClass.getESuperTypes().add(this.getWorkflowRoles());
    workflowRoleEClass.getESuperTypes().add(this.getWorkflowRoleReference());
    processReferenceEClass.getESuperTypes().add(this.getWorkflowRoles());
    workflowBranchEClass.getESuperTypes().add(this.getWorkflowElement());
    workflowActionEClass.getESuperTypes().add(this.getWorkflowElement());
    transactionCallEClass.getESuperTypes().add(this.getWorkflowAction());
    workflowCallEClass.getESuperTypes().add(this.getWorkflowAction());
    transactionEClass.getESuperTypes().add(this.getPackageElement());
    informTransactionEClass.getESuperTypes().add(this.getTransaction());
    authorizationFeatureEClass.getESuperTypes().add(this.getRequiredFeature());
    nonRepudiationFeatureEClass.getESuperTypes().add(this.getRequiredFeature());
    notifyTransactionEClass.getESuperTypes().add(this.getTransaction());
    oneWayTimeOutEClass.getESuperTypes().add(this.getTwoWayTimeOut());
    receiptAckTimeOutEClass.getESuperTypes().add(this.getOneWayTimeOut());
    validationAckTimeOutEClass.getESuperTypes().add(this.getOneWayTimeOut());
    requestTransactionEClass.getESuperTypes().add(this.getTransaction());
    responseTimeOutEClass.getESuperTypes().add(this.getTwoWayTimeOut());
    protocolEClass.getESuperTypes().add(this.getPackageElement());
    protocolReferenceEClass.getESuperTypes().add(this.getProtocol());
    protocolDeclarationEClass.getESuperTypes().add(this.getProtocol());

    // Initialize classes and features; add operations and parameters
    initEClass(domainmodelEClass, Domainmodel.class, "Domainmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainmodel_Elements(), this.getTopLevelElement(), null, "elements", null, 0, -1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelElementEClass, TopLevelElement.class, "TopLevelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_Package(), ecorePackage.getEString(), "package", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, com.x.xocl.domainmodel.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.x.xocl.domainmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Version(), this.getVersionString(), null, "version", null, 0, 1, com.x.xocl.domainmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Elements(), this.getPackageElement(), null, "elements", null, 0, -1, com.x.xocl.domainmodel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionStringEClass, VersionString.class, "VersionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(twoPartVersionStringEClass, TwoPartVersionString.class, "TwoPartVersionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTwoPartVersionString_Major(), ecorePackage.getEInt(), "major", null, 0, 1, TwoPartVersionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTwoPartVersionString_Minor(), ecorePackage.getEInt(), "minor", null, 0, 1, TwoPartVersionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTwoPartVersionString_Release(), ecorePackage.getEString(), "release", null, 0, 1, TwoPartVersionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTwoPartVersionString_Build(), ecorePackage.getEString(), "build", null, 0, 1, TwoPartVersionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fourPartVersionStringEClass, FourPartVersionString.class, "FourPartVersionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(packageElementEClass, PackageElement.class, "PackageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partnerEClass, Partner.class, "Partner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPartner_Responsibilities(), this.getProcessRole(), null, "responsibilities", null, 0, -1, Partner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processEClass, com.x.xocl.domainmodel.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcess_Roles(), this.getProcessRole(), null, "roles", null, 0, -1, com.x.xocl.domainmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcess_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.x.xocl.domainmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Preconditions(), this.getPreconditions(), null, "preconditions", null, 0, 1, com.x.xocl.domainmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Postconditions(), this.getPostconditions(), null, "postconditions", null, 0, 1, com.x.xocl.domainmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processRoleEClass, ProcessRole.class, "ProcessRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preconditionsEClass, Preconditions.class, "Preconditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreconditions_Conditions(), this.getEntityState(), null, "conditions", null, 0, -1, Preconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_States(), this.getEntityState(), null, "states", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityStateEClass, EntityState.class, "EntityState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityState_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityState_Transitions(), this.getEntityStateTransition(), null, "transitions", null, 0, -1, EntityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityStateTransitionEClass, EntityStateTransition.class, "EntityStateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityStateTransition_Successor(), this.getEntityState(), null, "successor", null, 0, 1, EntityStateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postconditionsEClass, Postconditions.class, "Postconditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostconditions_Success(), this.getOnProcessSuccess(), null, "success", null, 0, 1, Postconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPostconditions_Failure(), this.getOnProcessFailure(), null, "failure", null, 0, 1, Postconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onProcessResultEClass, OnProcessResult.class, "OnProcessResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOnProcessResult_Results(), this.getEntityState(), null, "results", null, 0, -1, OnProcessResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onProcessSuccessEClass, OnProcessSuccess.class, "OnProcessSuccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(onProcessFailureEClass, OnProcessFailure.class, "OnProcessFailure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflow_Variants(), this.getWorkflowVariant(), null, "variants", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflow_Roles(), this.getWorkflowRoles(), null, "roles", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflow_Contents(), this.getWorkflowBlock(), null, "contents", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowVariantEClass, WorkflowVariant.class, "WorkflowVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkflowVariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkflowVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowRolesEClass, WorkflowRoles.class, "WorkflowRoles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleDeclarationsEClass, RoleDeclarations.class, "RoleDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleDeclarations_Roles(), this.getWorkflowRole(), null, "roles", null, 0, -1, RoleDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowRoleEClass, WorkflowRole.class, "WorkflowRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(processReferenceEClass, ProcessReference.class, "ProcessReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessReference_Implements(), this.getProcess(), null, "implements", null, 0, 1, ProcessReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowBlockEClass, WorkflowBlock.class, "WorkflowBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflowBlock_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, WorkflowBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowElementEClass, WorkflowElement.class, "WorkflowElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(workflowBranchEClass, WorkflowBranch.class, "WorkflowBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflowBranch_Conditions(), this.getBranchCondition(), null, "conditions", null, 0, -1, WorkflowBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(branchConditionEClass, BranchCondition.class, "BranchCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBranchCondition_Contents(), this.getWorkflowBlock(), null, "contents", null, 0, 1, BranchCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowActionEClass, WorkflowAction.class, "WorkflowAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transactionCallEClass, TransactionCall.class, "TransactionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransactionCall_Name(), this.getTransaction(), null, "name", null, 0, 1, TransactionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransactionCall_Variants(), this.getTransactionVariantMapping(), null, "variants", null, 0, -1, TransactionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransactionCall_Sender(), this.getSenderRoleMapping(), null, "sender", null, 0, 1, TransactionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransactionCall_Receiver(), this.getReceiverRoleMapping(), null, "receiver", null, 0, 1, TransactionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionVariantMappingEClass, TransactionVariantMapping.class, "TransactionVariantMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransactionVariantMapping_Parameter(), this.getTransactionVariant(), null, "parameter", null, 0, 1, TransactionVariantMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransactionVariantMapping_Value(), this.getWorkflowVariant(), null, "value", null, 0, 1, TransactionVariantMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(senderRoleMappingEClass, SenderRoleMapping.class, "SenderRoleMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSenderRoleMapping_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, SenderRoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSenderRoleMapping_Value(), this.getWorkflowRole(), null, "value", null, 0, 1, SenderRoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(receiverRoleMappingEClass, ReceiverRoleMapping.class, "ReceiverRoleMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReceiverRoleMapping_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, ReceiverRoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReceiverRoleMapping_Value(), this.getWorkflowRole(), null, "value", null, 0, 1, ReceiverRoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowCallEClass, WorkflowCall.class, "WorkflowCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflowCall_Name(), this.getWorkflow(), null, "name", null, 0, 1, WorkflowCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflowCall_Variants(), this.getWorkflowVariantMapping(), null, "variants", null, 0, -1, WorkflowCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflowCall_Roles(), this.getWorkflowRoleMapping(), null, "roles", null, 0, -1, WorkflowCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowVariantMappingEClass, WorkflowVariantMapping.class, "WorkflowVariantMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflowVariantMapping_Parameter(), this.getWorkflowVariant(), null, "parameter", null, 0, 1, WorkflowVariantMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflowVariantMapping_Value(), this.getWorkflowVariant(), null, "value", null, 0, 1, WorkflowVariantMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowRoleMappingEClass, WorkflowRoleMapping.class, "WorkflowRoleMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkflowRoleMapping_Parameter(), this.getWorkflowRole(), null, "parameter", null, 0, 1, WorkflowRoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkflowRoleMapping_Value(), this.getWorkflowRoleReference(), null, "value", null, 0, 1, WorkflowRoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workflowRoleReferenceEClass, WorkflowRoleReference.class, "WorkflowRoleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransaction_Variants(), this.getTransactionVariant(), null, "variants", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransaction_Postconditions(), this.getPostconditions(), null, "postconditions", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(informTransactionEClass, InformTransaction.class, "InformTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInformTransaction_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, InformTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInformTransaction_SendAction(), this.getDatagramAction(), null, "sendAction", null, 0, 1, InformTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionVariantEClass, TransactionVariant.class, "TransactionVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransactionVariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransactionVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datagramActionEClass, DatagramAction.class, "DatagramAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatagramAction_Messages(), this.getVariantMessageMappings(), null, "messages", null, 0, 1, DatagramAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatagramAction_Requires(), this.getRequiredFeatures(), null, "requires", null, 0, 1, DatagramAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantMessageMappingsEClass, VariantMessageMappings.class, "VariantMessageMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariantMessageMappings_Variants(), this.getVariantMessageMapping(), null, "variants", null, 0, -1, VariantMessageMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantMessageMappingEClass, VariantMessageMapping.class, "VariantMessageMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariantMessageMapping_Variant(), this.getTransactionVariant(), null, "variant", null, 0, 1, VariantMessageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariantMessageMapping_Mappings(), this.getMessageMapping(), null, "mappings", null, 0, -1, VariantMessageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageMappingEClass, MessageMapping.class, "MessageMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessageMapping_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, MessageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessageMapping_Value(), ecorePackage.getEString(), "value", null, 0, 1, MessageMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredFeaturesEClass, RequiredFeatures.class, "RequiredFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequiredFeatures_Features(), this.getRequiredFeature(), null, "features", null, 0, -1, RequiredFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredFeatureEClass, RequiredFeature.class, "RequiredFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(authorizationFeatureEClass, AuthorizationFeature.class, "AuthorizationFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuthorizationFeature_Authorization(), ecorePackage.getEBoolean(), "authorization", null, 0, 1, AuthorizationFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonRepudiationFeatureEClass, NonRepudiationFeature.class, "NonRepudiationFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNonRepudiationFeature_Nonrepudiation(), ecorePackage.getEBoolean(), "nonrepudiation", null, 0, 1, NonRepudiationFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notifyTransactionEClass, NotifyTransaction.class, "NotifyTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNotifyTransaction_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, NotifyTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNotifyTransaction_SendAction(), this.getOneWayAction(), null, "sendAction", null, 0, 1, NotifyTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneWayActionEClass, OneWayAction.class, "OneWayAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneWayAction_Messages(), this.getVariantMessageMappings(), null, "messages", null, 0, 1, OneWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneWayAction_Requires(), this.getRequiredFeatures(), null, "requires", null, 0, 1, OneWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneWayAction_Timeouts(), this.getOneWayTimeOuts(), null, "timeouts", null, 0, 1, OneWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneWayAction_Retries(), ecorePackage.getEInt(), "retries", null, 0, 1, OneWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneWayTimeOutsEClass, OneWayTimeOuts.class, "OneWayTimeOuts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneWayTimeOuts_Timeouts(), this.getOneWayTimeOut(), null, "timeouts", null, 0, -1, OneWayTimeOuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneWayTimeOutEClass, OneWayTimeOut.class, "OneWayTimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(receiptAckTimeOutEClass, ReceiptAckTimeOut.class, "ReceiptAckTimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timeOutEClass, TimeOut.class, "TimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeOut_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TimeOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeOut_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validationAckTimeOutEClass, ValidationAckTimeOut.class, "ValidationAckTimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requestTransactionEClass, RequestTransaction.class, "RequestTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequestTransaction_Pattern(), this.getPattern(), "pattern", null, 0, 1, RequestTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequestTransaction_SendAction(), this.getTwoWayAction(), null, "sendAction", null, 0, 1, RequestTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequestTransaction_ReceiveAction(), this.getOneWayAction(), null, "receiveAction", null, 0, 1, RequestTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(twoWayActionEClass, TwoWayAction.class, "TwoWayAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTwoWayAction_Messages(), this.getVariantMessageMappings(), null, "messages", null, 0, 1, TwoWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTwoWayAction_Requires(), this.getRequiredFeatures(), null, "requires", null, 0, 1, TwoWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTwoWayAction_Timeouts(), this.getTwoWayTimeOuts(), null, "timeouts", null, 0, 1, TwoWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTwoWayAction_Retries(), ecorePackage.getEInt(), "retries", null, 0, 1, TwoWayAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(twoWayTimeOutsEClass, TwoWayTimeOuts.class, "TwoWayTimeOuts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTwoWayTimeOuts_Timeouts(), this.getTwoWayTimeOut(), null, "timeouts", null, 0, -1, TwoWayTimeOuts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(twoWayTimeOutEClass, TwoWayTimeOut.class, "TwoWayTimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTwoWayTimeOut_Timeout(), this.getTimeOut(), null, "timeout", null, 0, 1, TwoWayTimeOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(responseTimeOutEClass, ResponseTimeOut.class, "ResponseTimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(protocolReferenceEClass, ProtocolReference.class, "ProtocolReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(protocolDeclarationEClass, ProtocolDeclaration.class, "ProtocolDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProtocolDeclaration_Messages(), ecorePackage.getEString(), "messages", null, 0, -1, ProtocolDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
    addEEnumLiteral(timeUnitEEnum, TimeUnit.SECONDS);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTES);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.HOURS);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.DAYS);

    initEEnum(patternEEnum, Pattern.class, "Pattern");
    addEEnumLiteral(patternEEnum, Pattern.RESPONSE);
    addEEnumLiteral(patternEEnum, Pattern.CONFIRM);
    addEEnumLiteral(patternEEnum, Pattern.QUERY);
    addEEnumLiteral(patternEEnum, Pattern.OBLIGATION);

    // Create resource
    createResource(eNS_URI);
  }

} //DomainmodelPackageImpl
