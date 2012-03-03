/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.Postconditions;
import com.x.xocl.domainmodel.Transaction;
import com.x.xocl.domainmodel.TransactionVariant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.TransactionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TransactionImpl#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionImpl extends PackageElementImpl implements Transaction
{
  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<TransactionVariant> variants;

  /**
   * The cached value of the '{@link #getPostconditions() <em>Postconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostconditions()
   * @generated
   * @ordered
   */
  protected Postconditions postconditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionImpl()
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
    return DomainmodelPackage.Literals.TRANSACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransactionVariant> getVariants()
  {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<TransactionVariant>(TransactionVariant.class, this, DomainmodelPackage.TRANSACTION__VARIANTS);
    }
    return variants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postconditions getPostconditions()
  {
    return postconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostconditions(Postconditions newPostconditions, NotificationChain msgs)
  {
    Postconditions oldPostconditions = postconditions;
    postconditions = newPostconditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION__POSTCONDITIONS, oldPostconditions, newPostconditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostconditions(Postconditions newPostconditions)
  {
    if (newPostconditions != postconditions)
    {
      NotificationChain msgs = null;
      if (postconditions != null)
        msgs = ((InternalEObject)postconditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.TRANSACTION__POSTCONDITIONS, null, msgs);
      if (newPostconditions != null)
        msgs = ((InternalEObject)newPostconditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.TRANSACTION__POSTCONDITIONS, null, msgs);
      msgs = basicSetPostconditions(newPostconditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION__POSTCONDITIONS, newPostconditions, newPostconditions));
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
      case DomainmodelPackage.TRANSACTION__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.TRANSACTION__POSTCONDITIONS:
        return basicSetPostconditions(null, msgs);
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
      case DomainmodelPackage.TRANSACTION__VARIANTS:
        return getVariants();
      case DomainmodelPackage.TRANSACTION__POSTCONDITIONS:
        return getPostconditions();
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
      case DomainmodelPackage.TRANSACTION__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends TransactionVariant>)newValue);
        return;
      case DomainmodelPackage.TRANSACTION__POSTCONDITIONS:
        setPostconditions((Postconditions)newValue);
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
      case DomainmodelPackage.TRANSACTION__VARIANTS:
        getVariants().clear();
        return;
      case DomainmodelPackage.TRANSACTION__POSTCONDITIONS:
        setPostconditions((Postconditions)null);
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
      case DomainmodelPackage.TRANSACTION__VARIANTS:
        return variants != null && !variants.isEmpty();
      case DomainmodelPackage.TRANSACTION__POSTCONDITIONS:
        return postconditions != null;
    }
    return super.eIsSet(featureID);
  }

} //TransactionImpl
