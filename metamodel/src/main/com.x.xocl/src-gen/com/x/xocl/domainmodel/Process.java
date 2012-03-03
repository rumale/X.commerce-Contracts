/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.Process#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Process#getDescription <em>Description</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Process#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Process#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends PackageElement
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.ProcessRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcess_Roles()
   * @model containment="true"
   * @generated
   */
  EList<ProcessRole> getRoles();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcess_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Process#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Preconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preconditions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preconditions</em>' containment reference.
   * @see #setPreconditions(Preconditions)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcess_Preconditions()
   * @model containment="true"
   * @generated
   */
  Preconditions getPreconditions();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Process#getPreconditions <em>Preconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preconditions</em>' containment reference.
   * @see #getPreconditions()
   * @generated
   */
  void setPreconditions(Preconditions value);

  /**
   * Returns the value of the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postconditions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postconditions</em>' containment reference.
   * @see #setPostconditions(Postconditions)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getProcess_Postconditions()
   * @model containment="true"
   * @generated
   */
  Postconditions getPostconditions();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Process#getPostconditions <em>Postconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postconditions</em>' containment reference.
   * @see #getPostconditions()
   * @generated
   */
  void setPostconditions(Postconditions value);

} // Process
