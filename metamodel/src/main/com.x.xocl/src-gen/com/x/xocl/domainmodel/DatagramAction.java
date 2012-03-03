/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datagram Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.DatagramAction#getMessages <em>Messages</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.DatagramAction#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getDatagramAction()
 * @model
 * @generated
 */
public interface DatagramAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference.
   * @see #setMessages(VariantMessageMappings)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getDatagramAction_Messages()
   * @model containment="true"
   * @generated
   */
  VariantMessageMappings getMessages();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.DatagramAction#getMessages <em>Messages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Messages</em>' containment reference.
   * @see #getMessages()
   * @generated
   */
  void setMessages(VariantMessageMappings value);

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference.
   * @see #setRequires(RequiredFeatures)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getDatagramAction_Requires()
   * @model containment="true"
   * @generated
   */
  RequiredFeatures getRequires();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.DatagramAction#getRequires <em>Requires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires</em>' containment reference.
   * @see #getRequires()
   * @generated
   */
  void setRequires(RequiredFeatures value);

} // DatagramAction
