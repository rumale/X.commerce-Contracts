/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postconditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.Postconditions#getSuccess <em>Success</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Postconditions#getFailure <em>Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getPostconditions()
 * @model
 * @generated
 */
public interface Postconditions extends EObject
{
  /**
   * Returns the value of the '<em><b>Success</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Success</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Success</em>' containment reference.
   * @see #setSuccess(OnProcessSuccess)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getPostconditions_Success()
   * @model containment="true"
   * @generated
   */
  OnProcessSuccess getSuccess();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Postconditions#getSuccess <em>Success</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Success</em>' containment reference.
   * @see #getSuccess()
   * @generated
   */
  void setSuccess(OnProcessSuccess value);

  /**
   * Returns the value of the '<em><b>Failure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Failure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Failure</em>' containment reference.
   * @see #setFailure(OnProcessFailure)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getPostconditions_Failure()
   * @model containment="true"
   * @generated
   */
  OnProcessFailure getFailure();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Postconditions#getFailure <em>Failure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Failure</em>' containment reference.
   * @see #getFailure()
   * @generated
   */
  void setFailure(OnProcessFailure value);

} // Postconditions
