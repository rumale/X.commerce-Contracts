/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.OneWayTimeOut;
import com.x.xocl.domainmodel.OneWayTimeOuts;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Way Time Outs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.OneWayTimeOutsImpl#getTimeouts <em>Timeouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneWayTimeOutsImpl extends MinimalEObjectImpl.Container implements OneWayTimeOuts
{
  /**
   * The cached value of the '{@link #getTimeouts() <em>Timeouts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeouts()
   * @generated
   * @ordered
   */
  protected EList<OneWayTimeOut> timeouts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OneWayTimeOutsImpl()
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
    return DomainmodelPackage.Literals.ONE_WAY_TIME_OUTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OneWayTimeOut> getTimeouts()
  {
    if (timeouts == null)
    {
      timeouts = new EObjectContainmentEList<OneWayTimeOut>(OneWayTimeOut.class, this, DomainmodelPackage.ONE_WAY_TIME_OUTS__TIMEOUTS);
    }
    return timeouts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.ONE_WAY_TIME_OUTS__TIMEOUTS:
        return ((InternalEList<?>)getTimeouts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DomainmodelPackage.ONE_WAY_TIME_OUTS__TIMEOUTS:
        return getTimeouts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.ONE_WAY_TIME_OUTS__TIMEOUTS:
        getTimeouts().clear();
        getTimeouts().addAll((Collection<? extends OneWayTimeOut>)newValue);
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
      case DomainmodelPackage.ONE_WAY_TIME_OUTS__TIMEOUTS:
        getTimeouts().clear();
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
      case DomainmodelPackage.ONE_WAY_TIME_OUTS__TIMEOUTS:
        return timeouts != null && !timeouts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OneWayTimeOutsImpl
