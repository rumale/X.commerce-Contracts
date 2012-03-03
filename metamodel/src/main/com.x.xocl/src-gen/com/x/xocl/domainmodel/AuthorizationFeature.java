/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.AuthorizationFeature#isAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getAuthorizationFeature()
 * @model
 * @generated
 */
public interface AuthorizationFeature extends RequiredFeature
{
  /**
   * Returns the value of the '<em><b>Authorization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authorization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authorization</em>' attribute.
   * @see #setAuthorization(boolean)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getAuthorizationFeature_Authorization()
   * @model
   * @generated
   */
  boolean isAuthorization();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.AuthorizationFeature#isAuthorization <em>Authorization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Authorization</em>' attribute.
   * @see #isAuthorization()
   * @generated
   */
  void setAuthorization(boolean value);

} // AuthorizationFeature
