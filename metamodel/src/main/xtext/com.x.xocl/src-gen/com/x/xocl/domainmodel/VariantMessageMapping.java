/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Message Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.VariantMessageMapping#getVariant <em>Variant</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.VariantMessageMapping#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getVariantMessageMapping()
 * @model
 * @generated
 */
public interface VariantMessageMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Variant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' reference.
   * @see #setVariant(TransactionVariant)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getVariantMessageMapping_Variant()
   * @model
   * @generated
   */
  TransactionVariant getVariant();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.VariantMessageMapping#getVariant <em>Variant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' reference.
   * @see #getVariant()
   * @generated
   */
  void setVariant(TransactionVariant value);

  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.MessageMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getVariantMessageMapping_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<MessageMapping> getMappings();

} // VariantMessageMapping
