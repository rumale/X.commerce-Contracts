/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.OneWayAction;
import com.x.xocl.domainmodel.Pattern;
import com.x.xocl.domainmodel.RequestTransaction;
import com.x.xocl.domainmodel.TwoWayAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.RequestTransactionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.RequestTransactionImpl#getSendAction <em>Send Action</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.RequestTransactionImpl#getReceiveAction <em>Receive Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestTransactionImpl extends TransactionImpl implements RequestTransaction
{
  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final Pattern PATTERN_EDEFAULT = Pattern.RESPONSE;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern = PATTERN_EDEFAULT;

  /**
   * The cached value of the '{@link #getSendAction() <em>Send Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendAction()
   * @generated
   * @ordered
   */
  protected TwoWayAction sendAction;

  /**
   * The cached value of the '{@link #getReceiveAction() <em>Receive Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiveAction()
   * @generated
   * @ordered
   */
  protected OneWayAction receiveAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequestTransactionImpl()
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
    return DomainmodelPackage.Literals.REQUEST_TRANSACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern == null ? PATTERN_EDEFAULT : newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.REQUEST_TRANSACTION__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoWayAction getSendAction()
  {
    return sendAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSendAction(TwoWayAction newSendAction, NotificationChain msgs)
  {
    TwoWayAction oldSendAction = sendAction;
    sendAction = newSendAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION, oldSendAction, newSendAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSendAction(TwoWayAction newSendAction)
  {
    if (newSendAction != sendAction)
    {
      NotificationChain msgs = null;
      if (sendAction != null)
        msgs = ((InternalEObject)sendAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION, null, msgs);
      if (newSendAction != null)
        msgs = ((InternalEObject)newSendAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION, null, msgs);
      msgs = basicSetSendAction(newSendAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION, newSendAction, newSendAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayAction getReceiveAction()
  {
    return receiveAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReceiveAction(OneWayAction newReceiveAction, NotificationChain msgs)
  {
    OneWayAction oldReceiveAction = receiveAction;
    receiveAction = newReceiveAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION, oldReceiveAction, newReceiveAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiveAction(OneWayAction newReceiveAction)
  {
    if (newReceiveAction != receiveAction)
    {
      NotificationChain msgs = null;
      if (receiveAction != null)
        msgs = ((InternalEObject)receiveAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION, null, msgs);
      if (newReceiveAction != null)
        msgs = ((InternalEObject)newReceiveAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION, null, msgs);
      msgs = basicSetReceiveAction(newReceiveAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION, newReceiveAction, newReceiveAction));
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
      case DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION:
        return basicSetSendAction(null, msgs);
      case DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION:
        return basicSetReceiveAction(null, msgs);
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
      case DomainmodelPackage.REQUEST_TRANSACTION__PATTERN:
        return getPattern();
      case DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION:
        return getSendAction();
      case DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION:
        return getReceiveAction();
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
      case DomainmodelPackage.REQUEST_TRANSACTION__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION:
        setSendAction((TwoWayAction)newValue);
        return;
      case DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION:
        setReceiveAction((OneWayAction)newValue);
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
      case DomainmodelPackage.REQUEST_TRANSACTION__PATTERN:
        setPattern(PATTERN_EDEFAULT);
        return;
      case DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION:
        setSendAction((TwoWayAction)null);
        return;
      case DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION:
        setReceiveAction((OneWayAction)null);
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
      case DomainmodelPackage.REQUEST_TRANSACTION__PATTERN:
        return pattern != PATTERN_EDEFAULT;
      case DomainmodelPackage.REQUEST_TRANSACTION__SEND_ACTION:
        return sendAction != null;
      case DomainmodelPackage.REQUEST_TRANSACTION__RECEIVE_ACTION:
        return receiveAction != null;
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

} //RequestTransactionImpl
