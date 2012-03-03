/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.MessageMapping;
import com.x.xocl.domainmodel.TransactionVariant;
import com.x.xocl.domainmodel.VariantMessageMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Message Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.VariantMessageMappingImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.VariantMessageMappingImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariantMessageMappingImpl extends MinimalEObjectImpl.Container implements VariantMessageMapping
{
  /**
   * The cached value of the '{@link #getVariant() <em>Variant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected TransactionVariant variant;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<MessageMapping> mappings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariantMessageMappingImpl()
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
    return DomainmodelPackage.Literals.VARIANT_MESSAGE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionVariant getVariant()
  {
    if (variant != null && variant.eIsProxy())
    {
      InternalEObject oldVariant = (InternalEObject)variant;
      variant = (TransactionVariant)eResolveProxy(oldVariant);
      if (variant != oldVariant)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.VARIANT_MESSAGE_MAPPING__VARIANT, oldVariant, variant));
      }
    }
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionVariant basicGetVariant()
  {
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant(TransactionVariant newVariant)
  {
    TransactionVariant oldVariant = variant;
    variant = newVariant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.VARIANT_MESSAGE_MAPPING__VARIANT, oldVariant, variant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MessageMapping> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<MessageMapping>(MessageMapping.class, this, DomainmodelPackage.VARIANT_MESSAGE_MAPPING__MAPPINGS);
    }
    return mappings;
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
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__VARIANT:
        if (resolve) return getVariant();
        return basicGetVariant();
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__MAPPINGS:
        return getMappings();
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
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__VARIANT:
        setVariant((TransactionVariant)newValue);
        return;
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends MessageMapping>)newValue);
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
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__VARIANT:
        setVariant((TransactionVariant)null);
        return;
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__MAPPINGS:
        getMappings().clear();
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
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__VARIANT:
        return variant != null;
      case DomainmodelPackage.VARIANT_MESSAGE_MAPPING__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariantMessageMappingImpl
