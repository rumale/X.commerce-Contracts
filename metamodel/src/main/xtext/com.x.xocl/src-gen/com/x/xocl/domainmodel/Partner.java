/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.Partner#getResponsibilities <em>Responsibilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getPartner()
 * @model
 * @generated
 */
public interface Partner extends PackageElement
{
  /**
   * Returns the value of the '<em><b>Responsibilities</b></em>' reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.ProcessRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsibilities</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibilities</em>' reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getPartner_Responsibilities()
   * @model
   * @generated
   */
  EList<ProcessRole> getResponsibilities();

} // Partner
