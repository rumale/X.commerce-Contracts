package com.x.xocl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.x.xocl.domainmodel.AuthorizationFeature;
import com.x.xocl.domainmodel.BranchCondition;
import com.x.xocl.domainmodel.DatagramAction;
import com.x.xocl.domainmodel.Domainmodel;
import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.EndPoint;
import com.x.xocl.domainmodel.Entity;
import com.x.xocl.domainmodel.EntityState;
import com.x.xocl.domainmodel.EntityStateTransition;
import com.x.xocl.domainmodel.Import;
import com.x.xocl.domainmodel.InformTransaction;
import com.x.xocl.domainmodel.MessageMapping;
import com.x.xocl.domainmodel.NonRepudiationFeature;
import com.x.xocl.domainmodel.NotifyTransaction;
import com.x.xocl.domainmodel.OnProcessFailure;
import com.x.xocl.domainmodel.OnProcessSuccess;
import com.x.xocl.domainmodel.OneWayAction;
import com.x.xocl.domainmodel.OneWayTimeOuts;
import com.x.xocl.domainmodel.Partner;
import com.x.xocl.domainmodel.Postconditions;
import com.x.xocl.domainmodel.Preconditions;
import com.x.xocl.domainmodel.ProcessReference;
import com.x.xocl.domainmodel.ProtocolDeclaration;
import com.x.xocl.domainmodel.ProtocolReference;
import com.x.xocl.domainmodel.ReceiptAckTimeOut;
import com.x.xocl.domainmodel.ReceiverRoleMapping;
import com.x.xocl.domainmodel.RequestTransaction;
import com.x.xocl.domainmodel.RequiredFeatures;
import com.x.xocl.domainmodel.ResponseTimeOut;
import com.x.xocl.domainmodel.Role;
import com.x.xocl.domainmodel.RoleDeclarations;
import com.x.xocl.domainmodel.SenderRoleMapping;
import com.x.xocl.domainmodel.TimeOut;
import com.x.xocl.domainmodel.TransactionCall;
import com.x.xocl.domainmodel.TransactionVariant;
import com.x.xocl.domainmodel.TransactionVariantMapping;
import com.x.xocl.domainmodel.TwoPartVersionString;
import com.x.xocl.domainmodel.TwoWayAction;
import com.x.xocl.domainmodel.TwoWayTimeOuts;
import com.x.xocl.domainmodel.ValidationAckTimeOut;
import com.x.xocl.domainmodel.VariantMessageMapping;
import com.x.xocl.domainmodel.VariantMessageMappings;
import com.x.xocl.domainmodel.Workflow;
import com.x.xocl.domainmodel.WorkflowBlock;
import com.x.xocl.domainmodel.WorkflowBranch;
import com.x.xocl.domainmodel.WorkflowCall;
import com.x.xocl.domainmodel.WorkflowRoleMapping;
import com.x.xocl.domainmodel.WorkflowVariant;
import com.x.xocl.domainmodel.WorkflowVariantMapping;
import com.x.xocl.services.XOCLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractXOCLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected XOCLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DomainmodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.AUTHORIZATION_FEATURE:
				if(context == grammarAccess.getAuthorizationFeatureRule() ||
				   context == grammarAccess.getRequiredFeatureRule()) {
					sequence_AuthorizationFeature(context, (AuthorizationFeature) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.BRANCH_CONDITION:
				if(context == grammarAccess.getBranchConditionRule()) {
					sequence_BranchCondition(context, (BranchCondition) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.DATAGRAM_ACTION:
				if(context == grammarAccess.getDatagramActionRule()) {
					sequence_DatagramAction(context, (DatagramAction) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.END_POINT:
				if(context == grammarAccess.getEndPointRule()) {
					sequence_EndPoint(context, (EndPoint) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getPackageElementRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ENTITY_STATE:
				if(context == grammarAccess.getEntityStateRule()) {
					sequence_EntityState(context, (EntityState) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ENTITY_STATE_TRANSITION:
				if(context == grammarAccess.getEntityStateTransitionRule()) {
					sequence_EntityStateTransition(context, (EntityStateTransition) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.INFORM_TRANSACTION:
				if(context == grammarAccess.getInformTransactionRule() ||
				   context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getTransactionRule()) {
					sequence_InformTransaction(context, (InformTransaction) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.MESSAGE_MAPPING:
				if(context == grammarAccess.getMessageMappingRule()) {
					sequence_MessageMapping(context, (MessageMapping) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.NON_REPUDIATION_FEATURE:
				if(context == grammarAccess.getNonRepudiationFeatureRule() ||
				   context == grammarAccess.getRequiredFeatureRule()) {
					sequence_NonRepudiationFeature(context, (NonRepudiationFeature) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.NOTIFY_TRANSACTION:
				if(context == grammarAccess.getNotifyTransactionRule() ||
				   context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getTransactionRule()) {
					sequence_NotifyTransaction(context, (NotifyTransaction) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ON_PROCESS_FAILURE:
				if(context == grammarAccess.getOnProcessFailureRule() ||
				   context == grammarAccess.getOnProcessResultRule()) {
					sequence_OnProcessFailure(context, (OnProcessFailure) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ON_PROCESS_SUCCESS:
				if(context == grammarAccess.getOnProcessResultRule() ||
				   context == grammarAccess.getOnProcessSuccessRule()) {
					sequence_OnProcessSuccess(context, (OnProcessSuccess) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ONE_WAY_ACTION:
				if(context == grammarAccess.getOneWayActionRule()) {
					sequence_OneWayAction(context, (OneWayAction) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ONE_WAY_TIME_OUTS:
				if(context == grammarAccess.getOneWayTimeOutsRule()) {
					sequence_OneWayTimeOuts(context, (OneWayTimeOuts) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_Package(context, (com.x.xocl.domainmodel.Package) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PARTNER:
				if(context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getPartnerRule()) {
					sequence_Partner(context, (Partner) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.POSTCONDITIONS:
				if(context == grammarAccess.getPostconditionsRule()) {
					sequence_Postconditions(context, (Postconditions) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PRECONDITIONS:
				if(context == grammarAccess.getPreconditionsRule()) {
					sequence_Preconditions(context, (Preconditions) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PROCESS:
				if(context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (com.x.xocl.domainmodel.Process) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PROCESS_REFERENCE:
				if(context == grammarAccess.getProcessReferenceRule() ||
				   context == grammarAccess.getWorkflowRolesRule()) {
					sequence_ProcessReference(context, (ProcessReference) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PROTOCOL_DECLARATION:
				if(context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getProtocolDeclarationRule()) {
					sequence_ProtocolDeclaration(context, (ProtocolDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.PROTOCOL_REFERENCE:
				if(context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getProtocolReferenceRule()) {
					sequence_ProtocolReference(context, (ProtocolReference) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.RECEIPT_ACK_TIME_OUT:
				if(context == grammarAccess.getOneWayTimeOutRule() ||
				   context == grammarAccess.getReceiptAckTimeOutRule() ||
				   context == grammarAccess.getTwoWayTimeOutRule()) {
					sequence_ReceiptAckTimeOut(context, (ReceiptAckTimeOut) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.RECEIVER_ROLE_MAPPING:
				if(context == grammarAccess.getReceiverRoleMappingRule()) {
					sequence_ReceiverRoleMapping(context, (ReceiverRoleMapping) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.REQUEST_TRANSACTION:
				if(context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getRequestTransactionRule() ||
				   context == grammarAccess.getTransactionRule()) {
					sequence_RequestTransaction(context, (RequestTransaction) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.REQUIRED_FEATURES:
				if(context == grammarAccess.getRequiredFeaturesRule()) {
					sequence_RequiredFeatures(context, (RequiredFeatures) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.RESPONSE_TIME_OUT:
				if(context == grammarAccess.getResponseTimeOutRule() ||
				   context == grammarAccess.getTwoWayTimeOutRule()) {
					sequence_ResponseTimeOut(context, (ResponseTimeOut) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ROLE:
				if(context == grammarAccess.getProcessRoleRule() ||
				   context == grammarAccess.getRoleRule() ||
				   context == grammarAccess.getWorkflowRoleRule() ||
				   context == grammarAccess.getWorkflowRoleReferenceRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.ROLE_DECLARATIONS:
				if(context == grammarAccess.getRoleDeclarationsRule() ||
				   context == grammarAccess.getWorkflowRolesRule()) {
					sequence_RoleDeclarations(context, (RoleDeclarations) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.SENDER_ROLE_MAPPING:
				if(context == grammarAccess.getSenderRoleMappingRule()) {
					sequence_SenderRoleMapping(context, (SenderRoleMapping) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TIME_OUT:
				if(context == grammarAccess.getTimeOutRule()) {
					sequence_TimeOut(context, (TimeOut) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TRANSACTION_CALL:
				if(context == grammarAccess.getTransactionCallRule() ||
				   context == grammarAccess.getWorkflowActionRule() ||
				   context == grammarAccess.getWorkflowElementRule()) {
					sequence_TransactionCall(context, (TransactionCall) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TRANSACTION_VARIANT:
				if(context == grammarAccess.getTransactionVariantRule()) {
					sequence_TransactionVariant(context, (TransactionVariant) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TRANSACTION_VARIANT_MAPPING:
				if(context == grammarAccess.getTransactionVariantMappingRule()) {
					sequence_TransactionVariantMapping(context, (TransactionVariantMapping) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TWO_PART_VERSION_STRING:
				if(context == grammarAccess.getFourPartVersionStringRule()) {
					sequence_FourPartVersionString(context, (TwoPartVersionString) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTwoPartVersionStringRule() ||
				   context == grammarAccess.getVersionStringRule()) {
					sequence_TwoPartVersionString(context, (TwoPartVersionString) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TWO_WAY_ACTION:
				if(context == grammarAccess.getTwoWayActionRule()) {
					sequence_TwoWayAction(context, (TwoWayAction) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.TWO_WAY_TIME_OUTS:
				if(context == grammarAccess.getTwoWayTimeOutsRule()) {
					sequence_TwoWayTimeOuts(context, (TwoWayTimeOuts) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.VALIDATION_ACK_TIME_OUT:
				if(context == grammarAccess.getOneWayTimeOutRule() ||
				   context == grammarAccess.getTwoWayTimeOutRule() ||
				   context == grammarAccess.getValidationAckTimeOutRule()) {
					sequence_ValidationAckTimeOut(context, (ValidationAckTimeOut) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.VARIANT_MESSAGE_MAPPING:
				if(context == grammarAccess.getVariantMessageMappingRule()) {
					sequence_VariantMessageMapping(context, (VariantMessageMapping) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.VARIANT_MESSAGE_MAPPINGS:
				if(context == grammarAccess.getVariantMessageMappingsRule()) {
					sequence_VariantMessageMappings(context, (VariantMessageMappings) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW:
				if(context == grammarAccess.getPackageElementRule() ||
				   context == grammarAccess.getWorkflowRule()) {
					sequence_Workflow(context, (Workflow) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW_BLOCK:
				if(context == grammarAccess.getWorkflowBlockRule()) {
					sequence_WorkflowBlock(context, (WorkflowBlock) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW_BRANCH:
				if(context == grammarAccess.getWorkflowBranchRule() ||
				   context == grammarAccess.getWorkflowElementRule()) {
					sequence_WorkflowBranch(context, (WorkflowBranch) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW_CALL:
				if(context == grammarAccess.getWorkflowActionRule() ||
				   context == grammarAccess.getWorkflowCallRule() ||
				   context == grammarAccess.getWorkflowElementRule()) {
					sequence_WorkflowCall(context, (WorkflowCall) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW_ROLE_MAPPING:
				if(context == grammarAccess.getWorkflowRoleMappingRule()) {
					sequence_WorkflowRoleMapping(context, (WorkflowRoleMapping) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW_VARIANT:
				if(context == grammarAccess.getWorkflowVariantRule()) {
					sequence_WorkflowVariant(context, (WorkflowVariant) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.WORKFLOW_VARIANT_MAPPING:
				if(context == grammarAccess.getWorkflowVariantMappingRule()) {
					sequence_WorkflowVariantMapping(context, (WorkflowVariantMapping) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     authorization?='authorization'
	 */
	protected void sequence_AuthorizationFeature(EObject context, AuthorizationFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.AUTHORIZATION_FEATURE__AUTHORIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.AUTHORIZATION_FEATURE__AUTHORIZATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuthorizationFeatureAccess().getAuthorizationAuthorizationKeyword_0(), semanticObject.isAuthorization());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     contents=WorkflowBlock
	 */
	protected void sequence_BranchCondition(EObject context, BranchCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.BRANCH_CONDITION__CONTENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.BRANCH_CONDITION__CONTENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBranchConditionAccess().getContentsWorkflowBlockParserRuleCall_4_0(), semanticObject.getContents());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (messages=VariantMessageMappings? requires=RequiredFeatures?)
	 */
	protected void sequence_DatagramAction(EObject context, DatagramAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=TopLevelElement*
	 */
	protected void sequence_Domainmodel(EObject context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='success' | name='failure')
	 */
	protected void sequence_EndPoint(EObject context, EndPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     successor=[EntityState|ID]
	 */
	protected void sequence_EntityStateTransition(EObject context, EntityStateTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.ENTITY_STATE_TRANSITION__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.ENTITY_STATE_TRANSITION__SUCCESSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityStateTransitionAccess().getSuccessorEntityStateIDTerminalRuleCall_0_1(), semanticObject.getSuccessor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (transitions+=EntityStateTransition transitions+=EntityStateTransition*)?)
	 */
	protected void sequence_EntityState(EObject context, EntityState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID states+=EntityState+)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (major=INT minor=INT release='.' build='.')
	 */
	protected void sequence_FourPartVersionString(EObject context, TwoPartVersionString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__MAJOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__MAJOR));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__MINOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__MINOR));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__RELEASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__RELEASE));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__BUILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_PART_VERSION_STRING__BUILD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTwoPartVersionStringAccess().getMajorINTTerminalRuleCall_0_0(), semanticObject.getMajor());
		feeder.accept(grammarAccess.getTwoPartVersionStringAccess().getMinorINTTerminalRuleCall_2_0(), semanticObject.getMinor());
		feeder.accept(grammarAccess.getFourPartVersionStringAccess().getReleaseFullStopKeyword_1_0(), semanticObject.getRelease());
		feeder.accept(grammarAccess.getFourPartVersionStringAccess().getBuildFullStopKeyword_3_0(), semanticObject.getBuild());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     package=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.IMPORT__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.IMPORT__PACKAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getPackageQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getPackage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pattern='inform' name=ID (variants+=TransactionVariant variants+=TransactionVariant*)? sendAction=DatagramAction postconditions=Postconditions?)
	 */
	protected void sequence_InformTransaction(EObject context, InformTransaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=MessageName value=MessageName)
	 */
	protected void sequence_MessageMapping(EObject context, MessageMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.MESSAGE_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.MESSAGE_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.MESSAGE_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.MESSAGE_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageMappingAccess().getParameterMessageNameParserRuleCall_0_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getMessageMappingAccess().getValueMessageNameParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nonrepudiation?='nonrepudiation'
	 */
	protected void sequence_NonRepudiationFeature(EObject context, NonRepudiationFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.NON_REPUDIATION_FEATURE__NONREPUDIATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.NON_REPUDIATION_FEATURE__NONREPUDIATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNonRepudiationFeatureAccess().getNonrepudiationNonrepudiationKeyword_0(), semanticObject.isNonrepudiation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pattern='notify' name=ID (variants+=TransactionVariant variants+=TransactionVariant*)? sendAction=OneWayAction postconditions=Postconditions?)
	 */
	protected void sequence_NotifyTransaction(EObject context, NotifyTransaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (results+=[EntityState|QualifiedName] results+=[EntityState|QualifiedName]*)
	 */
	protected void sequence_OnProcessFailure(EObject context, OnProcessFailure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (results+=[EntityState|QualifiedName] results+=[EntityState|QualifiedName]*)
	 */
	protected void sequence_OnProcessSuccess(EObject context, OnProcessSuccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (messages=VariantMessageMappings? requires=RequiredFeatures? timeouts=OneWayTimeOuts retries=INT)
	 */
	protected void sequence_OneWayAction(EObject context, OneWayAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (timeouts+=OneWayTimeOut timeouts+=OneWayTimeOut?)
	 */
	protected void sequence_OneWayTimeOuts(EObject context, OneWayTimeOuts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PackageName version=VersionString? elements+=PackageElement+)
	 */
	protected void sequence_Package(EObject context, com.x.xocl.domainmodel.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID responsibilities+=[ProcessRole|QualifiedName] responsibilities+=[ProcessRole|QualifiedName]*)
	 */
	protected void sequence_Partner(EObject context, Partner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (success=OnProcessSuccess? failure=OnProcessFailure?)
	 */
	protected void sequence_Postconditions(EObject context, Postconditions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditions+=[EntityState|QualifiedName] conditions+=[EntityState|QualifiedName]*)
	 */
	protected void sequence_Preconditions(EObject context, Preconditions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     implements=[Process|QualifiedName]
	 */
	protected void sequence_ProcessReference(EObject context, ProcessReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.PROCESS_REFERENCE__IMPLEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.PROCESS_REFERENCE__IMPLEMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessReferenceAccess().getImplementsProcessQualifiedNameParserRuleCall_1_0_1(), semanticObject.getImplements());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         roles+=ProcessRole 
	 *         roles+=ProcessRole+ 
	 *         description=STRING 
	 *         preconditions=Preconditions? 
	 *         postconditions=Postconditions?
	 *     )
	 */
	protected void sequence_Process(EObject context, com.x.xocl.domainmodel.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ProtocolName messages+=MessageName+)
	 */
	protected void sequence_ProtocolDeclaration(EObject context, ProtocolDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ProtocolName
	 */
	protected void sequence_ProtocolReference(EObject context, ProtocolReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.PACKAGE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.PACKAGE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProtocolReferenceAccess().getNameProtocolNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     timeout=TimeOut
	 */
	protected void sequence_ReceiptAckTimeOut(EObject context, ReceiptAckTimeOut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_WAY_TIME_OUT__TIMEOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_WAY_TIME_OUT__TIMEOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReceiptAckTimeOutAccess().getTimeoutTimeOutParserRuleCall_2_0(), semanticObject.getTimeout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter='receiver' value=[WorkflowRole|ID])
	 */
	protected void sequence_ReceiverRoleMapping(EObject context, ReceiverRoleMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.RECEIVER_ROLE_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.RECEIVER_ROLE_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.RECEIVER_ROLE_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.RECEIVER_ROLE_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReceiverRoleMappingAccess().getParameterReceiverKeyword_0_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getReceiverRoleMappingAccess().getValueWorkflowRoleIDTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         pattern=Pattern 
	 *         name=ID 
	 *         (variants+=TransactionVariant variants+=TransactionVariant*)? 
	 *         sendAction=TwoWayAction 
	 *         receiveAction=OneWayAction 
	 *         postconditions=Postconditions?
	 *     )
	 */
	protected void sequence_RequestTransaction(EObject context, RequestTransaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (features+=RequiredFeature features+=RequiredFeature?)
	 */
	protected void sequence_RequiredFeatures(EObject context, RequiredFeatures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     timeout=TimeOut
	 */
	protected void sequence_ResponseTimeOut(EObject context, ResponseTimeOut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_WAY_TIME_OUT__TIMEOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_WAY_TIME_OUT__TIMEOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResponseTimeOutAccess().getTimeoutTimeOutParserRuleCall_2_0(), semanticObject.getTimeout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (roles+=WorkflowRole roles+=WorkflowRole+)
	 */
	protected void sequence_RoleDeclarations(EObject context, RoleDeclarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.ROLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter='sender' value=[WorkflowRole|ID])
	 */
	protected void sequence_SenderRoleMapping(EObject context, SenderRoleMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SENDER_ROLE_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SENDER_ROLE_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.SENDER_ROLE_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.SENDER_ROLE_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSenderRoleMappingAccess().getParameterSenderKeyword_0_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getSenderRoleMappingAccess().getValueWorkflowRoleIDTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT unit=TimeUnit)
	 */
	protected void sequence_TimeOut(EObject context, TimeOut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TIME_OUT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TIME_OUT__VALUE));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TIME_OUT__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TIME_OUT__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeOutAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getTimeOutAccess().getUnitTimeUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=[Transaction|QualifiedName] 
	 *         (variants+=TransactionVariantMapping variants+=TransactionVariantMapping*)? 
	 *         sender=SenderRoleMapping 
	 *         receiver=ReceiverRoleMapping
	 *     )
	 */
	protected void sequence_TransactionCall(EObject context, TransactionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[TransactionVariant|QualifiedName] value=[WorkflowVariant|ID])
	 */
	protected void sequence_TransactionVariantMapping(EObject context, TransactionVariantMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TRANSACTION_VARIANT_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TRANSACTION_VARIANT_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TRANSACTION_VARIANT_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TRANSACTION_VARIANT_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransactionVariantMappingAccess().getParameterTransactionVariantQualifiedNameParserRuleCall_0_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getTransactionVariantMappingAccess().getValueWorkflowVariantIDTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TransactionVariant(EObject context, TransactionVariant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TRANSACTION_VARIANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TRANSACTION_VARIANT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransactionVariantAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (major=INT minor=INT)
	 */
	protected void sequence_TwoPartVersionString(EObject context, TwoPartVersionString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (messages=VariantMessageMappings? requires=RequiredFeatures? timeouts=TwoWayTimeOuts retries=INT)
	 */
	protected void sequence_TwoWayAction(EObject context, TwoWayAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (timeouts+=TwoWayTimeOut (timeouts+=TwoWayTimeOut timeouts+=TwoWayTimeOut?)?)
	 */
	protected void sequence_TwoWayTimeOuts(EObject context, TwoWayTimeOuts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     timeout=TimeOut
	 */
	protected void sequence_ValidationAckTimeOut(EObject context, ValidationAckTimeOut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.TWO_WAY_TIME_OUT__TIMEOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.TWO_WAY_TIME_OUT__TIMEOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValidationAckTimeOutAccess().getTimeoutTimeOutParserRuleCall_2_0(), semanticObject.getTimeout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variant=[TransactionVariant|ID] mappings+=MessageMapping mappings+=MessageMapping*)
	 */
	protected void sequence_VariantMessageMapping(EObject context, VariantMessageMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variants+=VariantMessageMapping variants+=VariantMessageMapping*)
	 */
	protected void sequence_VariantMessageMappings(EObject context, VariantMessageMappings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=WorkflowElement* elements+=EndPoint)
	 */
	protected void sequence_WorkflowBlock(EObject context, WorkflowBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     conditions+=BranchCondition+
	 */
	protected void sequence_WorkflowBranch(EObject context, WorkflowBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=[Workflow|QualifiedName] 
	 *         (variants+=WorkflowVariantMapping variants+=WorkflowVariantMapping*)? 
	 *         roles+=WorkflowRoleMapping 
	 *         roles+=WorkflowRoleMapping+
	 *     )
	 */
	protected void sequence_WorkflowCall(EObject context, WorkflowCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[WorkflowRole|QualifiedName] value=[WorkflowRoleReference|QualifiedName])
	 */
	protected void sequence_WorkflowRoleMapping(EObject context, WorkflowRoleMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.WORKFLOW_ROLE_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.WORKFLOW_ROLE_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.WORKFLOW_ROLE_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.WORKFLOW_ROLE_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkflowRoleMappingAccess().getParameterWorkflowRoleQualifiedNameParserRuleCall_0_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getWorkflowRoleMappingAccess().getValueWorkflowRoleReferenceQualifiedNameParserRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[WorkflowVariant|QualifiedName] value=[WorkflowVariant|ID])
	 */
	protected void sequence_WorkflowVariantMapping(EObject context, WorkflowVariantMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.WORKFLOW_VARIANT_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.WORKFLOW_VARIANT_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.WORKFLOW_VARIANT_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.WORKFLOW_VARIANT_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkflowVariantMappingAccess().getParameterWorkflowVariantQualifiedNameParserRuleCall_0_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getWorkflowVariantMappingAccess().getValueWorkflowVariantIDTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_WorkflowVariant(EObject context, WorkflowVariant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.WORKFLOW_VARIANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.WORKFLOW_VARIANT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkflowVariantAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (variants+=WorkflowVariant variants+=WorkflowVariant*)? roles=WorkflowRoles contents=WorkflowBlock)
	 */
	protected void sequence_Workflow(EObject context, Workflow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
