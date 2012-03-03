/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pattern</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.x.xocl.domainmodel.DomainmodelPackage#getPattern()
 * @model
 * @generated
 */
public enum Pattern implements Enumerator
{
  /**
   * The '<em><b>Response</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESPONSE_VALUE
   * @generated
   * @ordered
   */
  RESPONSE(0, "Response", "response"),

  /**
   * The '<em><b>Confirm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONFIRM_VALUE
   * @generated
   * @ordered
   */
  CONFIRM(1, "Confirm", "confirm"),

  /**
   * The '<em><b>Query</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUERY_VALUE
   * @generated
   * @ordered
   */
  QUERY(2, "Query", "query"),

  /**
   * The '<em><b>Obligation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBLIGATION_VALUE
   * @generated
   * @ordered
   */
  OBLIGATION(3, "Obligation", "obligation");

  /**
   * The '<em><b>Response</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Response</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESPONSE
   * @model name="Response" literal="response"
   * @generated
   * @ordered
   */
  public static final int RESPONSE_VALUE = 0;

  /**
   * The '<em><b>Confirm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Confirm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONFIRM
   * @model name="Confirm" literal="confirm"
   * @generated
   * @ordered
   */
  public static final int CONFIRM_VALUE = 1;

  /**
   * The '<em><b>Query</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Query</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #QUERY
   * @model name="Query" literal="query"
   * @generated
   * @ordered
   */
  public static final int QUERY_VALUE = 2;

  /**
   * The '<em><b>Obligation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Obligation</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBLIGATION
   * @model name="Obligation" literal="obligation"
   * @generated
   * @ordered
   */
  public static final int OBLIGATION_VALUE = 3;

  /**
   * An array of all the '<em><b>Pattern</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Pattern[] VALUES_ARRAY =
    new Pattern[]
    {
      RESPONSE,
      CONFIRM,
      QUERY,
      OBLIGATION,
    };

  /**
   * A public read-only list of all the '<em><b>Pattern</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Pattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Pattern</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Pattern get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Pattern result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Pattern</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Pattern getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Pattern result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Pattern</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Pattern get(int value)
  {
    switch (value)
    {
      case RESPONSE_VALUE: return RESPONSE;
      case CONFIRM_VALUE: return CONFIRM;
      case QUERY_VALUE: return QUERY;
      case OBLIGATION_VALUE: return OBLIGATION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Pattern(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Pattern
