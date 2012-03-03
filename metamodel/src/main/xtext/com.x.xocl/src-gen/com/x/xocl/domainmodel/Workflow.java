/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.Workflow#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Workflow#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Workflow#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends PackageElement
{
  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.WorkflowVariant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflow_Variants()
   * @model containment="true"
   * @generated
   */
  EList<WorkflowVariant> getVariants();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference.
   * @see #setRoles(WorkflowRoles)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflow_Roles()
   * @model containment="true"
   * @generated
   */
  WorkflowRoles getRoles();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Workflow#getRoles <em>Roles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roles</em>' containment reference.
   * @see #getRoles()
   * @generated
   */
  void setRoles(WorkflowRoles value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference.
   * @see #setContents(WorkflowBlock)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflow_Contents()
   * @model containment="true"
   * @generated
   */
  WorkflowBlock getContents();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Workflow#getContents <em>Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contents</em>' containment reference.
   * @see #getContents()
   * @generated
   */
  void setContents(WorkflowBlock value);

} // Workflow
