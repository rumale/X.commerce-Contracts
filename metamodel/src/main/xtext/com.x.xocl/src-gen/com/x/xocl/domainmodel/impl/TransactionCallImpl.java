/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.ReceiverRoleMapping;
import com.x.xocl.domainmodel.SenderRoleMapping;
import com.x.xocl.domainmodel.Transaction;
import com.x.xocl.domainmodel.TransactionCall;
import com.x.xocl.domainmodel.TransactionVariantMapping;

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
 * An implementation of the model object '<em><b>Transaction Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.TransactionCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TransactionCallImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TransactionCallImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TransactionCallImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionCallImpl extends WorkflowActionImpl implements TransactionCall
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Transaction name;

  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<TransactionVariantMapping> variants;

  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected SenderRoleMapping sender;

  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected ReceiverRoleMapping receiver;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionCallImpl()
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
    return DomainmodelPackage.Literals.TRANSACTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Transaction)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.TRANSACTION_CALL__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Transaction newName)
  {
    Transaction oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION_CALL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransactionVariantMapping> getVariants()
  {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<TransactionVariantMapping>(TransactionVariantMapping.class, this, DomainmodelPackage.TRANSACTION_CALL__VARIANTS);
    }
    return variants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SenderRoleMapping getSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSender(SenderRoleMapping newSender, NotificationChain msgs)
  {
    SenderRoleMapping oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION_CALL__SENDER, oldSender, newSender);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(SenderRoleMapping newSender)
  {
    if (newSender != sender)
    {
      NotificationChain msgs = null;
      if (sender != null)
        msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.TRANSACTION_CALL__SENDER, null, msgs);
      if (newSender != null)
        msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.TRANSACTION_CALL__SENDER, null, msgs);
      msgs = basicSetSender(newSender, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION_CALL__SENDER, newSender, newSender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiverRoleMapping getReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReceiver(ReceiverRoleMapping newReceiver, NotificationChain msgs)
  {
    ReceiverRoleMapping oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION_CALL__RECEIVER, oldReceiver, newReceiver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(ReceiverRoleMapping newReceiver)
  {
    if (newReceiver != receiver)
    {
      NotificationChain msgs = null;
      if (receiver != null)
        msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.TRANSACTION_CALL__RECEIVER, null, msgs);
      if (newReceiver != null)
        msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.TRANSACTION_CALL__RECEIVER, null, msgs);
      msgs = basicSetReceiver(newReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TRANSACTION_CALL__RECEIVER, newReceiver, newReceiver));
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
      case DomainmodelPackage.TRANSACTION_CALL__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.TRANSACTION_CALL__SENDER:
        return basicSetSender(null, msgs);
      case DomainmodelPackage.TRANSACTION_CALL__RECEIVER:
        return basicSetReceiver(null, msgs);
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
      case DomainmodelPackage.TRANSACTION_CALL__NAME:
        if (resolve) return getName();
        return basicGetName();
      case DomainmodelPackage.TRANSACTION_CALL__VARIANTS:
        return getVariants();
      case DomainmodelPackage.TRANSACTION_CALL__SENDER:
        return getSender();
      case DomainmodelPackage.TRANSACTION_CALL__RECEIVER:
        return getReceiver();
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
      case DomainmodelPackage.TRANSACTION_CALL__NAME:
        setName((Transaction)newValue);
        return;
      case DomainmodelPackage.TRANSACTION_CALL__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends TransactionVariantMapping>)newValue);
        return;
      case DomainmodelPackage.TRANSACTION_CALL__SENDER:
        setSender((SenderRoleMapping)newValue);
        return;
      case DomainmodelPackage.TRANSACTION_CALL__RECEIVER:
        setReceiver((ReceiverRoleMapping)newValue);
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
      case DomainmodelPackage.TRANSACTION_CALL__NAME:
        setName((Transaction)null);
        return;
      case DomainmodelPackage.TRANSACTION_CALL__VARIANTS:
        getVariants().clear();
        return;
      case DomainmodelPackage.TRANSACTION_CALL__SENDER:
        setSender((SenderRoleMapping)null);
        return;
      case DomainmodelPackage.TRANSACTION_CALL__RECEIVER:
        setReceiver((ReceiverRoleMapping)null);
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
      case DomainmodelPackage.TRANSACTION_CALL__NAME:
        return name != null;
      case DomainmodelPackage.TRANSACTION_CALL__VARIANTS:
        return variants != null && !variants.isEmpty();
      case DomainmodelPackage.TRANSACTION_CALL__SENDER:
        return sender != null;
      case DomainmodelPackage.TRANSACTION_CALL__RECEIVER:
        return receiver != null;
    }
    return super.eIsSet(featureID);
  }

} //TransactionCallImpl
