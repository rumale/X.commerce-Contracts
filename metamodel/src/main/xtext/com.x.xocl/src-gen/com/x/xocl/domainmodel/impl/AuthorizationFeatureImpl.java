/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.AuthorizationFeature;
import com.x.xocl.domainmodel.DomainmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.AuthorizationFeatureImpl#isAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationFeatureImpl extends RequiredFeatureImpl implements AuthorizationFeature
{
  /**
   * The default value of the '{@link #isAuthorization() <em>Authorization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAuthorization()
   * @generated
   * @ordered
   */
  protected static final boolean AUTHORIZATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAuthorization() <em>Authorization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAuthorization()
   * @generated
   * @ordered
   */
  protected boolean authorization = AUTHORIZATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AuthorizationFeatureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainmodelPackage.Literals.AUTHORIZATION_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAuthorization()
  {
    return authorization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthorization(boolean newAuthorization)
  {
    boolean oldAuthorization = authorization;
    authorization = newAuthorization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.AUTHORIZATION_FEATURE__AUTHORIZATION, oldAuthorization, authorization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AUTHORIZATION_FEATURE__AUTHORIZATION:
        return isAuthorization();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AUTHORIZATION_FEATURE__AUTHORIZATION:
        setAuthorization((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AUTHORIZATION_FEATURE__AUTHORIZATION:
        setAuthorization(AUTHORIZATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.AUTHORIZATION_FEATURE__AUTHORIZATION:
        return authorization != AUTHORIZATION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (authorization: ");
    result.append(authorization);
    result.append(')');
    return result.toString();
  }

} //AuthorizationFeatureImpl
