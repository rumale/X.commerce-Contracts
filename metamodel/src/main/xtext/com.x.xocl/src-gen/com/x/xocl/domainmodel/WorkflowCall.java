/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowCall#getName <em>Name</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowCall#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowCall#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowCall()
 * @model
 * @generated
 */
public interface WorkflowCall extends WorkflowAction
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
   * @see #setName(Workflow)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowCall_Name()
   * @model
   * @generated
   */
  Workflow getName();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.WorkflowCall#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Workflow value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.WorkflowVariantMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowCall_Variants()
   * @model containment="true"
   * @generated
   */
  EList<WorkflowVariantMapping> getVariants();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.WorkflowRoleMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowCall_Roles()
   * @model containment="true"
   * @generated
   */
  EList<WorkflowRoleMapping> getRoles();

} // WorkflowCall
