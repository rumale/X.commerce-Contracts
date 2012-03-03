/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Role Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowRoleMapping#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowRoleMapping#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowRoleMapping()
 * @model
 * @generated
 */
public interface WorkflowRoleMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(WorkflowRole)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowRoleMapping_Parameter()
   * @model
   * @generated
   */
  WorkflowRole getParameter();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.WorkflowRoleMapping#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(WorkflowRole value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(WorkflowRoleReference)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowRoleMapping_Value()
   * @model
   * @generated
   */
  WorkflowRoleReference getValue();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.WorkflowRoleMapping#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(WorkflowRoleReference value);

} // WorkflowRoleMapping
