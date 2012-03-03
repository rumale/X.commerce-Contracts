/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.Workflow;
import com.x.xocl.domainmodel.WorkflowBlock;
import com.x.xocl.domainmodel.WorkflowRoles;
import com.x.xocl.domainmodel.WorkflowVariant;

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
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.WorkflowImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.WorkflowImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.WorkflowImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends PackageElementImpl implements Workflow
{
  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<WorkflowVariant> variants;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected WorkflowRoles roles;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected WorkflowBlock contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkflowImpl()
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
    return DomainmodelPackage.Literals.WORKFLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkflowVariant> getVariants()
  {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<WorkflowVariant>(WorkflowVariant.class, this, DomainmodelPackage.WORKFLOW__VARIANTS);
    }
    return variants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRoles getRoles()
  {
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoles(WorkflowRoles newRoles, NotificationChain msgs)
  {
    WorkflowRoles oldRoles = roles;
    roles = newRoles;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.WORKFLOW__ROLES, oldRoles, newRoles);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoles(WorkflowRoles newRoles)
  {
    if (newRoles != roles)
    {
      NotificationChain msgs = null;
      if (roles != null)
        msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.WORKFLOW__ROLES, null, msgs);
      if (newRoles != null)
        msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.WORKFLOW__ROLES, null, msgs);
      msgs = basicSetRoles(newRoles, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.WORKFLOW__ROLES, newRoles, newRoles));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowBlock getContents()
  {
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContents(WorkflowBlock newContents, NotificationChain msgs)
  {
    WorkflowBlock oldContents = contents;
    contents = newContents;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.WORKFLOW__CONTENTS, oldContents, newContents);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContents(WorkflowBlock newContents)
  {
    if (newContents != contents)
    {
      NotificationChain msgs = null;
      if (contents != null)
        msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.WORKFLOW__CONTENTS, null, msgs);
      if (newContents != null)
        msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.WORKFLOW__CONTENTS, null, msgs);
      msgs = basicSetContents(newContents, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.WORKFLOW__CONTENTS, newContents, newContents));
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
      case DomainmodelPackage.WORKFLOW__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.WORKFLOW__ROLES:
        return basicSetRoles(null, msgs);
      case DomainmodelPackage.WORKFLOW__CONTENTS:
        return basicSetContents(null, msgs);
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
      case DomainmodelPackage.WORKFLOW__VARIANTS:
        return getVariants();
      case DomainmodelPackage.WORKFLOW__ROLES:
        return getRoles();
      case DomainmodelPackage.WORKFLOW__CONTENTS:
        return getContents();
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
      case DomainmodelPackage.WORKFLOW__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends WorkflowVariant>)newValue);
        return;
      case DomainmodelPackage.WORKFLOW__ROLES:
        setRoles((WorkflowRoles)newValue);
        return;
      case DomainmodelPackage.WORKFLOW__CONTENTS:
        setContents((WorkflowBlock)newValue);
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
      case DomainmodelPackage.WORKFLOW__VARIANTS:
        getVariants().clear();
        return;
      case DomainmodelPackage.WORKFLOW__ROLES:
        setRoles((WorkflowRoles)null);
        return;
      case DomainmodelPackage.WORKFLOW__CONTENTS:
        setContents((WorkflowBlock)null);
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
      case DomainmodelPackage.WORKFLOW__VARIANTS:
        return variants != null && !variants.isEmpty();
      case DomainmodelPackage.WORKFLOW__ROLES:
        return roles != null;
      case DomainmodelPackage.WORKFLOW__CONTENTS:
        return contents != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkflowImpl
