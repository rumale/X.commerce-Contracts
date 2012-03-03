/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.EntityState;
import com.x.xocl.domainmodel.EntityStateTransition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.EntityStateTransitionImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityStateTransitionImpl extends MinimalEObjectImpl.Container implements EntityStateTransition
{
  /**
   * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccessor()
   * @generated
   * @ordered
   */
  protected EntityState successor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityStateTransitionImpl()
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
    return DomainmodelPackage.Literals.ENTITY_STATE_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityState getSuccessor()
  {
    if (successor != null && successor.eIsProxy())
    {
      InternalEObject oldSuccessor = (InternalEObject)successor;
      successor = (EntityState)eResolveProxy(oldSuccessor);
      if (successor != oldSuccessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.ENTITY_STATE_TRANSITION__SUCCESSOR, oldSuccessor, successor));
      }
    }
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityState basicGetSuccessor()
  {
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuccessor(EntityState newSuccessor)
  {
    EntityState oldSuccessor = successor;
    successor = newSuccessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ENTITY_STATE_TRANSITION__SUCCESSOR, oldSuccessor, successor));
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
      case DomainmodelPackage.ENTITY_STATE_TRANSITION__SUCCESSOR:
        if (resolve) return getSuccessor();
        return basicGetSuccessor();
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
      case DomainmodelPackage.ENTITY_STATE_TRANSITION__SUCCESSOR:
        setSuccessor((EntityState)newValue);
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
      case DomainmodelPackage.ENTITY_STATE_TRANSITION__SUCCESSOR:
        setSuccessor((EntityState)null);
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
      case DomainmodelPackage.ENTITY_STATE_TRANSITION__SUCCESSOR:
        return successor != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityStateTransitionImpl
