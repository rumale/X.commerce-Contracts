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
 * A representation of the model object '<em><b>Variant Message Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.VariantMessageMappings#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getVariantMessageMappings()
 * @model
 * @generated
 */
public interface VariantMessageMappings extends EObject
{
  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.VariantMessageMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getVariantMessageMappings_Variants()
   * @model containment="true"
   * @generated
   */
  EList<VariantMessageMapping> getVariants();

} // VariantMessageMappings
