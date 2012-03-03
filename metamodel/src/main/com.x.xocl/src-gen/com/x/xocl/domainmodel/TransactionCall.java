/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.TransactionCall#getName <em>Name</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.TransactionCall#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.TransactionCall#getSender <em>Sender</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.TransactionCall#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransactionCall()
 * @model
 * @generated
 */
public interface TransactionCall extends WorkflowAction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Transaction)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransactionCall_Name()
   * @model
   * @generated
   */
  Transaction getName();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TransactionCall#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Transaction value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.TransactionVariantMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransactionCall_Variants()
   * @model containment="true"
   * @generated
   */
  EList<TransactionVariantMapping> getVariants();

  /**
   * Returns the value of the '<em><b>Sender</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' containment reference.
   * @see #setSender(SenderRoleMapping)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransactionCall_Sender()
   * @model containment="true"
   * @generated
   */
  SenderRoleMapping getSender();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TransactionCall#getSender <em>Sender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' containment reference.
   * @see #getSender()
   * @generated
   */
  void setSender(SenderRoleMapping value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference.
   * @see #setReceiver(ReceiverRoleMapping)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransactionCall_Receiver()
   * @model containment="true"
   * @generated
   */
  ReceiverRoleMapping getReceiver();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TransactionCall#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(ReceiverRoleMapping value);

} // TransactionCall
