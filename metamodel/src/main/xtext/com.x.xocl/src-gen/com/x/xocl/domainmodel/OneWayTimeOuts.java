/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Way Time Outs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.OneWayTimeOuts#getTimeouts <em>Timeouts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getOneWayTimeOuts()
 * @model
 * @generated
 */
public interface OneWayTimeOuts extends EObject
{
  /**
   * Returns the value of the '<em><b>Timeouts</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.OneWayTimeOut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeouts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeouts</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getOneWayTimeOuts_Timeouts()
   * @model containment="true"
   * @generated
   */
  EList<OneWayTimeOut> getTimeouts();

} // OneWayTimeOuts
