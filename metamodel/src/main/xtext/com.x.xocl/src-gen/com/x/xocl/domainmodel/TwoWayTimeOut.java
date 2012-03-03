/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Way Time Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.TwoWayTimeOut#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoWayTimeOut()
 * @model
 * @generated
 */
public interface TwoWayTimeOut extends EObject
{
  /**
   * Returns the value of the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' containment reference.
   * @see #setTimeout(TimeOut)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoWayTimeOut_Timeout()
   * @model containment="true"
   * @generated
   */
  TimeOut getTimeout();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TwoWayTimeOut#getTimeout <em>Timeout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' containment reference.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(TimeOut value);

} // TwoWayTimeOut
