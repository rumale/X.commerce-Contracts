/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.RequestTransaction#getPattern <em>Pattern</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.RequestTransaction#getSendAction <em>Send Action</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.RequestTransaction#getReceiveAction <em>Receive Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getRequestTransaction()
 * @model
 * @generated
 */
public interface RequestTransaction extends Transaction
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * The literals are from the enumeration {@link com.x.xocl.domainmodel.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see com.x.xocl.domainmodel.Pattern
   * @see #setPattern(Pattern)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getRequestTransaction_Pattern()
   * @model
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.RequestTransaction#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see com.x.xocl.domainmodel.Pattern
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Send Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Send Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send Action</em>' containment reference.
   * @see #setSendAction(TwoWayAction)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getRequestTransaction_SendAction()
   * @model containment="true"
   * @generated
   */
  TwoWayAction getSendAction();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.RequestTransaction#getSendAction <em>Send Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send Action</em>' containment reference.
   * @see #getSendAction()
   * @generated
   */
  void setSendAction(TwoWayAction value);

  /**
   * Returns the value of the '<em><b>Receive Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receive Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receive Action</em>' containment reference.
   * @see #setReceiveAction(OneWayAction)
   * @see com.x.xocl.domainmodel.DomainmodelPackage#getRequestTransaction_ReceiveAction()
   * @model containment="true"
   * @generated
   */
  OneWayAction getReceiveAction();

  /**
   * Sets the value of the '{@link com.x.xocl.domainmodel.RequestTransaction#getReceiveAction <em>Receive Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receive Action</em>' containment reference.
   * @see #getReceiveAction()
   * @generated
   */
  void setReceiveAction(OneWayAction value);

} // RequestTransaction
