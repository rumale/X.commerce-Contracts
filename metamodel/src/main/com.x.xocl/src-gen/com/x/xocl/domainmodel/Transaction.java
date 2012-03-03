/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.Transaction#getVariants <em>Variants</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.Transaction#getPostconditions <em>Postconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends PackageElement
{
  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link com.x.xocl.domainmodel.TransactionVariant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransaction_Variants()
   * @model containment="true"
   * @generated
   */
  EList<TransactionVariant> getVariants();

  /**
   * Returns the value of the '<em><b>Postconditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postconditions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postconditions</em>' containment reference.
   * @see #setPostconditions(Postconditions)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getTransaction_Postconditions()
   * @model containment="true"
   * @generated
   */
  Postconditions getPostconditions();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.Transaction#getPostconditions <em>Postconditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postconditions</em>' containment reference.
   * @see #getPostconditions()
   * @generated
   */
  void setPostconditions(Postconditions value);

} // Transaction
