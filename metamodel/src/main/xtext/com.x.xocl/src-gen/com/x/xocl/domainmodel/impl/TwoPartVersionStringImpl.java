/**
 * <copyright>
 * </copyright>
 *
 */
package com.x.xocl.domainmodel.impl;

import com.x.xocl.domainmodel.DomainmodelPackage;
import com.x.xocl.domainmodel.TwoPartVersionString;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Part Version String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link com.x.xocl.domainmodel.impl.TwoPartVersionStringImpl#getBuild <em>Build</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwoPartVersionStringImpl extends VersionStringImpl implements TwoPartVersionString
{
  /**
   * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajor()
   * @generated
   * @ordered
   */
  protected static final int MAJOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajor()
   * @generated
   * @ordered
   */
  protected int major = MAJOR_EDEFAULT;

  /**
   * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinor()
   * @generated
   * @ordered
   */
  protected static final int MINOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinor()
   * @generated
   * @ordered
   */
  protected int minor = MINOR_EDEFAULT;

  /**
   * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelease()
   * @generated
   * @ordered
   */
  protected static final String RELEASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelease()
   * @generated
   * @ordered
   */
  protected String release = RELEASE_EDEFAULT;

  /**
   * The default value of the '{@link #getBuild() <em>Build</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuild()
   * @generated
   * @ordered
   */
  protected static final String BUILD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuild() <em>Build</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuild()
   * @generated
   * @ordered
   */
  protected String build = BUILD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TwoPartVersionStringImpl()
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
    return DomainmodelPackage.Literals.TWO_PART_VERSION_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMajor()
  {
    return major;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMajor(int newMajor)
  {
    int oldMajor = major;
    major = newMajor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TWO_PART_VERSION_STRING__MAJOR, oldMajor, major));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinor()
  {
    return minor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinor(int newMinor)
  {
    int oldMinor = minor;
    minor = newMinor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TWO_PART_VERSION_STRING__MINOR, oldMinor, minor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelease()
  {
    return release;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelease(String newRelease)
  {
    String oldRelease = release;
    release = newRelease;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TWO_PART_VERSION_STRING__RELEASE, oldRelease, release));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuild()
  {
    return build;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuild(String newBuild)
  {
    String oldBuild = build;
    build = newBuild;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.TWO_PART_VERSION_STRING__BUILD, oldBuild, build));
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
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MAJOR:
        return getMajor();
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MINOR:
        return getMinor();
      case DomainmodelPackage.TWO_PART_VERSION_STRING__RELEASE:
        return getRelease();
      case DomainmodelPackage.TWO_PART_VERSION_STRING__BUILD:
        return getBuild();
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
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MAJOR:
        setMajor((Integer)newValue);
        return;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MINOR:
        setMinor((Integer)newValue);
        return;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__RELEASE:
        setRelease((String)newValue);
        return;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__BUILD:
        setBuild((String)newValue);
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
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MAJOR:
        setMajor(MAJOR_EDEFAULT);
        return;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MINOR:
        setMinor(MINOR_EDEFAULT);
        return;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__RELEASE:
        setRelease(RELEASE_EDEFAULT);
        return;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__BUILD:
        setBuild(BUILD_EDEFAULT);
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
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MAJOR:
        return major != MAJOR_EDEFAULT;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__MINOR:
        return minor != MINOR_EDEFAULT;
      case DomainmodelPackage.TWO_PART_VERSION_STRING__RELEASE:
        return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
      case DomainmodelPackage.TWO_PART_VERSION_STRING__BUILD:
        return BUILD_EDEFAULT == null ? build != null : !BUILD_EDEFAULT.equals(build);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (major: ");
    result.append(major);
    result.append(", minor: ");
    result.append(minor);
    result.append(", release: ");
    result.append(release);
    result.append(", build: ");
    result.append(build);
    result.append(')');
    return result.toString();
  }

} //TwoPartVersionStringImpl
