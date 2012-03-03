/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.WorkflowRole;
import com.x.xocl.domainmodel.WorkflowRoleMapping;
import com.x.xocl.domainmodel.WorkflowRoleReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Role Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.WorkflowRoleMappingImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.WorkflowRoleMappingImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowRoleMappingImpl extends MinimalEObjectImpl.Container implements WorkflowRoleMapping
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected WorkflowRole parameter;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected WorkflowRoleReference value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkflowRoleMappingImpl()
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
    return DomainmodelPackage.Literals.WORKFLOW_ROLE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRole getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (WorkflowRole)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.WORKFLOW_ROLE_MAPPING__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRole basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(WorkflowRole newParameter)
  {
    WorkflowRole oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.WORKFLOW_ROLE_MAPPING__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRoleReference getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (WorkflowRoleReference)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.WORKFLOW_ROLE_MAPPING__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRoleReference basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(WorkflowRoleReference newValue)
  {
    WorkflowRoleReference oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.WORKFLOW_ROLE_MAPPING__VALUE, oldValue, value));
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
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__PARAMETER:
        setParameter((WorkflowRole)newValue);
        return;
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__VALUE:
        setValue((WorkflowRoleReference)newValue);
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
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__PARAMETER:
        setParameter((WorkflowRole)null);
        return;
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__VALUE:
        setValue((WorkflowRoleReference)null);
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
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__PARAMETER:
        return parameter != null;
      case DomainmodelPackage.WORKFLOW_ROLE_MAPPING__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkflowRoleMappingImpl
