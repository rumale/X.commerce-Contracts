/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.NotifyTransaction#getPattern <em>Pattern</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.NotifyTransaction#getSendAction <em>Send Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getNotifyTransaction()
 * @model
 * @generated
 */
public interface NotifyTransaction extends Transaction
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getNotifyTransaction_Pattern()
   * @model
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.NotifyTransaction#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

  /**
   * Returns the value of the '<em><b>Send Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Send Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send Action</em>' containment reference.
   * @see #setSendAction(OneWayAction)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getNotifyTransaction_SendAction()
   * @model containment="true"
   * @generated
   */
  OneWayAction getSendAction();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.NotifyTransaction#getSendAction <em>Send Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send Action</em>' containment reference.
   * @see #getSendAction()
   * @generated
   */
  void setSendAction(OneWayAction value);

} // NotifyTransaction
