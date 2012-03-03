/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Repudiation Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.NonRepudiationFeature#isNonrepudiation <em>Nonrepudiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getNonRepudiationFeature()
 * @model
 * @generated
 */
public interface NonRepudiationFeature extends RequiredFeature
{
  /**
   * Returns the value of the '<em><b>Nonrepudiation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nonrepudiation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nonrepudiation</em>' attribute.
   * @see #setNonrepudiation(boolean)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getNonRepudiationFeature_Nonrepudiation()
   * @model
   * @generated
   */
  boolean isNonrepudiation();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.NonRepudiationFeature#isNonrepudiation <em>Nonrepudiation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nonrepudiation</em>' attribute.
   * @see #isNonrepudiation()
   * @generated
   */
  void setNonrepudiation(boolean value);

} // NonRepudiationFeature
