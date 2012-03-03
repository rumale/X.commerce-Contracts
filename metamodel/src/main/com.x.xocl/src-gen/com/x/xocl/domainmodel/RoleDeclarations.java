/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.RoleDeclarations#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getRoleDeclarations()
 * @model
 * @generated
 */
public interface RoleDeclarations extends WorkflowRoles
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.WorkflowRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getRoleDeclarations_Roles()
   * @model containment="true"
   * @generated
   */
  EList<WorkflowRole> getRoles();

} // RoleDeclarations
