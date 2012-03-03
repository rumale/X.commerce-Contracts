/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.ProcessReference#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcessReference()
 * @model
 * @generated
 */
public interface ProcessReference extends WorkflowRoles
{
  /**
   * Returns the value of the '<em><b>Implements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' reference.
   * @see #setImplements(com.x.xocl.domainmodel.Process)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcessReference_Implements()
   * @model
   * @generated
   */
  com.x.xocl.domainmodel.Process getImplements();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.ProcessReference#getImplements <em>Implements</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' reference.
   * @see #getImplements()
   * @generated
   */
  void setImplements(com.x.xocl.domainmodel.Process value);

} // ProcessReference
