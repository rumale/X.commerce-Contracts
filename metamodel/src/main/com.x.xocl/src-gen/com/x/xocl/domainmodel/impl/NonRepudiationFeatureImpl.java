/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.NonRepudiationFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Repudiation Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.NonRepudiationFeatureImpl#isNonrepudiation <em>Nonrepudiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonRepudiationFeatureImpl extends RequiredFeatureImpl implements NonRepudiationFeature
{
  /**
   * The default value of the '{@link #isNonrepudiation() <em>Nonrepudiation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNonrepudiation()
   * @generated
   * @ordered
   */
  protected static final boolean NONREPUDIATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNonrepudiation() <em>Nonrepudiation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNonrepudiation()
   * @generated
   * @ordered
   */
  protected boolean nonrepudiation = NONREPUDIATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonRepudiationFeatureImpl()
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
    return DomainmodelPackage.Literals.NON_REPUDIATION_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNonrepudiation()
  {
    return nonrepudiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNonrepudiation(boolean newNonrepudiation)
  {
    boolean oldNonrepudiation = nonrepudiation;
    nonrepudiation = newNonrepudiation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.NON_REPUDIATION_FEATURE__NONREPUDIATION, oldNonrepudiation, nonrepudiation));
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
      case DomainmodelPackage.NON_REPUDIATION_FEATURE__NONREPUDIATION:
        return isNonrepudiation();
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
      case DomainmodelPackage.NON_REPUDIATION_FEATURE__NONREPUDIATION:
        setNonrepudiation((Boolean)newValue);
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
      case DomainmodelPackage.NON_REPUDIATION_FEATURE__NONREPUDIATION:
        setNonrepudiation(NONREPUDIATION_EDEFAULT);
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
      case DomainmodelPackage.NON_REPUDIATION_FEATURE__NONREPUDIATION:
        return nonrepudiation != NONREPUDIATION_EDEFAULT;
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
    result.append(" (nonrepudiation: ");
    result.append(nonrepudiation);
    result.append(')');
    return result.toString();
  }

} //NonRepudiationFeatureImpl
