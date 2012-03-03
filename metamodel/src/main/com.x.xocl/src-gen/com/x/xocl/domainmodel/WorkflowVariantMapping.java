/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Variant Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowVariantMapping#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.WorkflowVariantMapping#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowVariantMapping()
 * @model
 * @generated
 */
public interface WorkflowVariantMapping extends EObject
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
   * @see #setParameter(WorkflowVariant)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowVariantMapping_Parameter()
   * @model
   * @generated
   */
  WorkflowVariant getParameter();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.WorkflowVariantMapping#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(WorkflowVariant value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(WorkflowVariant)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getWorkflowVariantMapping_Value()
   * @model
   * @generated
   */
  WorkflowVariant getValue();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.WorkflowVariantMapping#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(WorkflowVariant value);

} // WorkflowVariantMapping
