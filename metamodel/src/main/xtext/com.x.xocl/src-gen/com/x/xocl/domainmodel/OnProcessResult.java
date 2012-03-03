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
 * A representation of the model object '<em><b>On Process Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.OnProcessResult#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getOnProcessResult()
 * @model
 * @generated
 */
public interface OnProcessResult extends EObject
{
  /**
   * Returns the value of the '<em><b>Results</b></em>' reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.EntityState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getOnProcessResult_Results()
   * @model
   * @generated
   */
  EList<EntityState> getResults();

} // OnProcessResult
