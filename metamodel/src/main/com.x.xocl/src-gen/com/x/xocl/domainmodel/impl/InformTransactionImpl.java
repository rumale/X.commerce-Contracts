/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DatagramAction;
import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.InformTransaction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inform Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.InformTransactionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.InformTransactionImpl#getSendAction <em>Send Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformTransactionImpl extends TransactionImpl implements InformTransaction
{
  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected String pattern = PATTERN_EDEFAULT;

  /**
   * The cached value of the '{@link #getSendAction() <em>Send Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendAction()
   * @generated
   * @ordered
   */
  protected DatagramAction sendAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InformTransactionImpl()
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
    return DomainmodelPackage.Literals.INFORM_TRANSACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(String newPattern)
  {
    String oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INFORM_TRANSACTION__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatagramAction getSendAction()
  {
    return sendAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSendAction(DatagramAction newSendAction, NotificationChain msgs)
  {
    DatagramAction oldSendAction = sendAction;
    sendAction = newSendAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION, oldSendAction, newSendAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSendAction(DatagramAction newSendAction)
  {
    if (newSendAction != sendAction)
    {
      NotificationChain msgs = null;
      if (sendAction != null)
        msgs = ((InternalEObject)sendAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION, null, msgs);
      if (newSendAction != null)
        msgs = ((InternalEObject)newSendAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION, null, msgs);
      msgs = basicSetSendAction(newSendAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION, newSendAction, newSendAction));
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
      case DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION:
        return basicSetSendAction(null, msgs);
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
      case DomainmodelPackage.INFORM_TRANSACTION__PATTERN:
        return getPattern();
      case DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION:
        return getSendAction();
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
      case DomainmodelPackage.INFORM_TRANSACTION__PATTERN:
        setPattern((String)newValue);
        return;
      case DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION:
        setSendAction((DatagramAction)newValue);
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
      case DomainmodelPackage.INFORM_TRANSACTION__PATTERN:
        setPattern(PATTERN_EDEFAULT);
        return;
      case DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION:
        setSendAction((DatagramAction)null);
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
      case DomainmodelPackage.INFORM_TRANSACTION__PATTERN:
        return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
      case DomainmodelPackage.INFORM_TRANSACTION__SEND_ACTION:
        return sendAction != null;
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
    result.append(" (pattern: ");
    result.append(pattern);
    result.append(')');
    return result.toString();
  }

} //InformTransactionImpl
