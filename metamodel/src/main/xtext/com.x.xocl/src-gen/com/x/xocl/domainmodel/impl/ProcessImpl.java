/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.Postconditions;
import com.x.xocl.domainmodel.Preconditions;
import com.x.xocl.domainmodel.ProcessRole;

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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.ProcessImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.ProcessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.ProcessImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.ProcessImpl#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends PackageElementImpl implements com.x.xocl.domainmodel.Process
{
  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<ProcessRole> roles;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditions()
   * @generated
   * @ordered
   */
  protected Preconditions preconditions;

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
  protected ProcessImpl()
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
    return DomainmodelPackage.Literals.PROCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessRole> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<ProcessRole>(ProcessRole.class, this, DomainmodelPackage.PROCESS__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCESS__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preconditions getPreconditions()
  {
    return preconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreconditions(Preconditions newPreconditions, NotificationChain msgs)
  {
    Preconditions oldPreconditions = preconditions;
    preconditions = newPreconditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCESS__PRECONDITIONS, oldPreconditions, newPreconditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreconditions(Preconditions newPreconditions)
  {
    if (newPreconditions != preconditions)
    {
      NotificationChain msgs = null;
      if (preconditions != null)
        msgs = ((InternalEObject)preconditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.PROCESS__PRECONDITIONS, null, msgs);
      if (newPreconditions != null)
        msgs = ((InternalEObject)newPreconditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.PROCESS__PRECONDITIONS, null, msgs);
      msgs = basicSetPreconditions(newPreconditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCESS__PRECONDITIONS, newPreconditions, newPreconditions));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCESS__POSTCONDITIONS, oldPostconditions, newPostconditions);
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
        msgs = ((InternalEObject)postconditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.PROCESS__POSTCONDITIONS, null, msgs);
      if (newPostconditions != null)
        msgs = ((InternalEObject)newPostconditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.PROCESS__POSTCONDITIONS, null, msgs);
      msgs = basicSetPostconditions(newPostconditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROCESS__POSTCONDITIONS, newPostconditions, newPostconditions));
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
      case DomainmodelPackage.PROCESS__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.PROCESS__PRECONDITIONS:
        return basicSetPreconditions(null, msgs);
      case DomainmodelPackage.PROCESS__POSTCONDITIONS:
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
      case DomainmodelPackage.PROCESS__ROLES:
        return getRoles();
      case DomainmodelPackage.PROCESS__DESCRIPTION:
        return getDescription();
      case DomainmodelPackage.PROCESS__PRECONDITIONS:
        return getPreconditions();
      case DomainmodelPackage.PROCESS__POSTCONDITIONS:
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
      case DomainmodelPackage.PROCESS__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends ProcessRole>)newValue);
        return;
      case DomainmodelPackage.PROCESS__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DomainmodelPackage.PROCESS__PRECONDITIONS:
        setPreconditions((Preconditions)newValue);
        return;
      case DomainmodelPackage.PROCESS__POSTCONDITIONS:
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
      case DomainmodelPackage.PROCESS__ROLES:
        getRoles().clear();
        return;
      case DomainmodelPackage.PROCESS__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DomainmodelPackage.PROCESS__PRECONDITIONS:
        setPreconditions((Preconditions)null);
        return;
      case DomainmodelPackage.PROCESS__POSTCONDITIONS:
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
      case DomainmodelPackage.PROCESS__ROLES:
        return roles != null && !roles.isEmpty();
      case DomainmodelPackage.PROCESS__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DomainmodelPackage.PROCESS__PRECONDITIONS:
        return preconditions != null;
      case DomainmodelPackage.PROCESS__POSTCONDITIONS:
        return postconditions != null;
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ProcessImpl
