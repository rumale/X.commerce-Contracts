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
 * A representation of the model object '<em><b>Preconditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.Preconditions#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getPreconditions()
 * @model
 * @generated
 */
public interface Preconditions extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.EntityState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getPreconditions_Conditions()
   * @model
   * @generated
   */
  EList<EntityState> getConditions();

} // Preconditions
