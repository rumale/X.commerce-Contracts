/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.OneWayAction;
import com.x.xocl.domainmodel.OneWayTimeOuts;
import com.x.xocl.domainmodel.RequiredFeatures;
import com.x.xocl.domainmodel.VariantMessageMappings;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Way Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.OneWayActionImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.OneWayActionImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.OneWayActionImpl#getTimeouts <em>Timeouts</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.OneWayActionImpl#getRetries <em>Retries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneWayActionImpl extends MinimalEObjectImpl.Container implements OneWayAction
{
  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected VariantMessageMappings messages;

  /**
   * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequires()
   * @generated
   * @ordered
   */
  protected RequiredFeatures requires;

  /**
   * The cached value of the '{@link #getTimeouts() <em>Timeouts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeouts()
   * @generated
   * @ordered
   */
  protected OneWayTimeOuts timeouts;

  /**
   * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetries()
   * @generated
   * @ordered
   */
  protected static final int RETRIES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetries()
   * @generated
   * @ordered
   */
  protected int retries = RETRIES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OneWayActionImpl()
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
    return DomainmodelPackage.Literals.ONE_WAY_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantMessageMappings getMessages()
  {
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessages(VariantMessageMappings newMessages, NotificationChain msgs)
  {
    VariantMessageMappings oldMessages = messages;
    messages = newMessages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__MESSAGES, oldMessages, newMessages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessages(VariantMessageMappings newMessages)
  {
    if (newMessages != messages)
    {
      NotificationChain msgs = null;
      if (messages != null)
        msgs = ((InternalEObject)messages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ONE_WAY_ACTION__MESSAGES, null, msgs);
      if (newMessages != null)
        msgs = ((InternalEObject)newMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ONE_WAY_ACTION__MESSAGES, null, msgs);
      msgs = basicSetMessages(newMessages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__MESSAGES, newMessages, newMessages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredFeatures getRequires()
  {
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequires(RequiredFeatures newRequires, NotificationChain msgs)
  {
    RequiredFeatures oldRequires = requires;
    requires = newRequires;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__REQUIRES, oldRequires, newRequires);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequires(RequiredFeatures newRequires)
  {
    if (newRequires != requires)
    {
      NotificationChain msgs = null;
      if (requires != null)
        msgs = ((InternalEObject)requires).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ONE_WAY_ACTION__REQUIRES, null, msgs);
      if (newRequires != null)
        msgs = ((InternalEObject)newRequires).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ONE_WAY_ACTION__REQUIRES, null, msgs);
      msgs = basicSetRequires(newRequires, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__REQUIRES, newRequires, newRequires));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneWayTimeOuts getTimeouts()
  {
    return timeouts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeouts(OneWayTimeOuts newTimeouts, NotificationChain msgs)
  {
    OneWayTimeOuts oldTimeouts = timeouts;
    timeouts = newTimeouts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS, oldTimeouts, newTimeouts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeouts(OneWayTimeOuts newTimeouts)
  {
    if (newTimeouts != timeouts)
    {
      NotificationChain msgs = null;
      if (timeouts != null)
        msgs = ((InternalEObject)timeouts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS, null, msgs);
      if (newTimeouts != null)
        msgs = ((InternalEObject)newTimeouts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS, null, msgs);
      msgs = basicSetTimeouts(newTimeouts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS, newTimeouts, newTimeouts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRetries()
  {
    return retries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRetries(int newRetries)
  {
    int oldRetries = retries;
    retries = newRetries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.ONE_WAY_ACTION__RETRIES, oldRetries, retries));
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
      case DomainmodelPackage.ONE_WAY_ACTION__MESSAGES:
        return basicSetMessages(null, msgs);
      case DomainmodelPackage.ONE_WAY_ACTION__REQUIRES:
        return basicSetRequires(null, msgs);
      case DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS:
        return basicSetTimeouts(null, msgs);
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
      case DomainmodelPackage.ONE_WAY_ACTION__MESSAGES:
        return getMessages();
      case DomainmodelPackage.ONE_WAY_ACTION__REQUIRES:
        return getRequires();
      case DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS:
        return getTimeouts();
      case DomainmodelPackage.ONE_WAY_ACTION__RETRIES:
        return getRetries();
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
      case DomainmodelPackage.ONE_WAY_ACTION__MESSAGES:
        setMessages((VariantMessageMappings)newValue);
        return;
      case DomainmodelPackage.ONE_WAY_ACTION__REQUIRES:
        setRequires((RequiredFeatures)newValue);
        return;
      case DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS:
        setTimeouts((OneWayTimeOuts)newValue);
        return;
      case DomainmodelPackage.ONE_WAY_ACTION__RETRIES:
        setRetries((Integer)newValue);
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
      case DomainmodelPackage.ONE_WAY_ACTION__MESSAGES:
        setMessages((VariantMessageMappings)null);
        return;
      case DomainmodelPackage.ONE_WAY_ACTION__REQUIRES:
        setRequires((RequiredFeatures)null);
        return;
      case DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS:
        setTimeouts((OneWayTimeOuts)null);
        return;
      case DomainmodelPackage.ONE_WAY_ACTION__RETRIES:
        setRetries(RETRIES_EDEFAULT);
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
      case DomainmodelPackage.ONE_WAY_ACTION__MESSAGES:
        return messages != null;
      case DomainmodelPackage.ONE_WAY_ACTION__REQUIRES:
        return requires != null;
      case DomainmodelPackage.ONE_WAY_ACTION__TIMEOUTS:
        return timeouts != null;
      case DomainmodelPackage.ONE_WAY_ACTION__RETRIES:
        return retries != RETRIES_EDEFAULT;
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
    result.append(" (retries: ");
    result.append(retries);
    result.append(')');
    return result.toString();
  }

} //OneWayActionImpl
