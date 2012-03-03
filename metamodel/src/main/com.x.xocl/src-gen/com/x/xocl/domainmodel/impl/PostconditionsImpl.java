/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.OnProcessFailure;
import com.x.xocl.domainmodel.OnProcessSuccess;
import com.x.xocl.domainmodel.Postconditions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postconditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.PostconditionsImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.PostconditionsImpl#getFailure <em>Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostconditionsImpl extends MinimalEObjectImpl.Container implements Postconditions
{
  /**
   * The cached value of the '{@link #getSuccess() <em>Success</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccess()
   * @generated
   * @ordered
   */
  protected OnProcessSuccess success;

  /**
   * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailure()
   * @generated
   * @ordered
   */
  protected OnProcessFailure failure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostconditionsImpl()
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
    return DomainmodelPackage.Literals.POSTCONDITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnProcessSuccess getSuccess()
  {
    return success;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuccess(OnProcessSuccess newSuccess, NotificationChain msgs)
  {
    OnProcessSuccess oldSuccess = success;
    success = newSuccess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.POSTCONDITIONS__SUCCESS, oldSuccess, newSuccess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuccess(OnProcessSuccess newSuccess)
  {
    if (newSuccess != success)
    {
      NotificationChain msgs = null;
      if (success != null)
        msgs = ((InternalEObject)success).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.POSTCONDITIONS__SUCCESS, null, msgs);
      if (newSuccess != null)
        msgs = ((InternalEObject)newSuccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.POSTCONDITIONS__SUCCESS, null, msgs);
      msgs = basicSetSuccess(newSuccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.POSTCONDITIONS__SUCCESS, newSuccess, newSuccess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnProcessFailure getFailure()
  {
    return failure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFailure(OnProcessFailure newFailure, NotificationChain msgs)
  {
    OnProcessFailure oldFailure = failure;
    failure = newFailure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.POSTCONDITIONS__FAILURE, oldFailure, newFailure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailure(OnProcessFailure newFailure)
  {
    if (newFailure != failure)
    {
      NotificationChain msgs = null;
      if (failure != null)
        msgs = ((InternalEObject)failure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.POSTCONDITIONS__FAILURE, null, msgs);
      if (newFailure != null)
        msgs = ((InternalEObject)newFailure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.POSTCONDITIONS__FAILURE, null, msgs);
      msgs = basicSetFailure(newFailure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.POSTCONDITIONS__FAILURE, newFailure, newFailure));
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
      case DomainmodelPackage.POSTCONDITIONS__SUCCESS:
        return basicSetSuccess(null, msgs);
      case DomainmodelPackage.POSTCONDITIONS__FAILURE:
        return basicSetFailure(null, msgs);
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
      case DomainmodelPackage.POSTCONDITIONS__SUCCESS:
        return getSuccess();
      case DomainmodelPackage.POSTCONDITIONS__FAILURE:
        return getFailure();
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
      case DomainmodelPackage.POSTCONDITIONS__SUCCESS:
        setSuccess((OnProcessSuccess)newValue);
        return;
      case DomainmodelPackage.POSTCONDITIONS__FAILURE:
        setFailure((OnProcessFailure)newValue);
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
      case DomainmodelPackage.POSTCONDITIONS__SUCCESS:
        setSuccess((OnProcessSuccess)null);
        return;
      case DomainmodelPackage.POSTCONDITIONS__FAILURE:
        setFailure((OnProcessFailure)null);
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
      case DomainmodelPackage.POSTCONDITIONS__SUCCESS:
        return success != null;
      case DomainmodelPackage.POSTCONDITIONS__FAILURE:
        return failure != null;
    }
    return super.eIsSet(featureID);
  }

} //PostconditionsImpl
