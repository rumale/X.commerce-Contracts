/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.ProtocolDeclaration#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getProtocolDeclaration()
 * @model
 * @generated
 */
public interface ProtocolDeclaration extends Protocol
{
  /**
   * Returns the value of the '<em><b>Messages</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' attribute list.
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getProtocolDeclaration_Messages()
   * @model unique="false"
   * @generated
   */
  EList<String> getMessages();

} // ProtocolDeclaration
