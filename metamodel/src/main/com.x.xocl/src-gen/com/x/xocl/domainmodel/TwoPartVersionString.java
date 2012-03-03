/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Part Version String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.TwoPartVersionString#getMajor <em>Major</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.TwoPartVersionString#getMinor <em>Minor</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.TwoPartVersionString#getRelease <em>Release</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.TwoPartVersionString#getBuild <em>Build</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoPartVersionString()
 * @model
 * @generated
 */
public interface TwoPartVersionString extends VersionString, FourPartVersionString
{
  /**
   * Returns the value of the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Major</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Major</em>' attribute.
   * @see #setMajor(int)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoPartVersionString_Major()
   * @model
   * @generated
   */
  int getMajor();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TwoPartVersionString#getMajor <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Major</em>' attribute.
   * @see #getMajor()
   * @generated
   */
  void setMajor(int value);

  /**
   * Returns the value of the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minor</em>' attribute.
   * @see #setMinor(int)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoPartVersionString_Minor()
   * @model
   * @generated
   */
  int getMinor();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TwoPartVersionString#getMinor <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minor</em>' attribute.
   * @see #getMinor()
   * @generated
   */
  void setMinor(int value);

  /**
   * Returns the value of the '<em><b>Release</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Release</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release</em>' attribute.
   * @see #setRelease(String)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoPartVersionString_Release()
   * @model
   * @generated
   */
  String getRelease();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TwoPartVersionString#getRelease <em>Release</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Release</em>' attribute.
   * @see #getRelease()
   * @generated
   */
  void setRelease(String value);

  /**
   * Returns the value of the '<em><b>Build</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build</em>' attribute.
   * @see #setBuild(String)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTwoPartVersionString_Build()
   * @model
   * @generated
   */
  String getBuild();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.TwoPartVersionString#getBuild <em>Build</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Build</em>' attribute.
   * @see #getBuild()
   * @generated
   */
  void setBuild(String value);

} // TwoPartVersionString
