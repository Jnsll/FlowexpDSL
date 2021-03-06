/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp.flowexp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.flowexp.flowexp.ExpNb;
import org.xtext.example.flowexp.flowexp.FlowexpPackage;
import org.xtext.example.flowexp.flowexp.Init;
import org.xtext.example.flowexp.flowexp.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.flowexp.flowexp.impl.ModelImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.flowexp.flowexp.impl.ModelImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.xtext.example.flowexp.flowexp.impl.ModelImpl#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.xtext.example.flowexp.flowexp.impl.ModelImpl#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected ExpNb expr;

  /**
   * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected static final String PHASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected String phase = PHASE_EDEFAULT;

  /**
   * The default value of the '{@link #getModelname() <em>Modelname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelname()
   * @generated
   * @ordered
   */
  protected static final String MODELNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelname() <em>Modelname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelname()
   * @generated
   * @ordered
   */
  protected String modelname = MODELNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected Init init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return FlowexpPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpNb getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(ExpNb newExpr, NotificationChain msgs)
  {
    ExpNb oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowexpPackage.MODEL__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(ExpNb newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowexpPackage.MODEL__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowexpPackage.MODEL__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowexpPackage.MODEL__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPhase()
  {
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhase(String newPhase)
  {
    String oldPhase = phase;
    phase = newPhase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowexpPackage.MODEL__PHASE, oldPhase, phase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelname()
  {
    return modelname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelname(String newModelname)
  {
    String oldModelname = modelname;
    modelname = newModelname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowexpPackage.MODEL__MODELNAME, oldModelname, modelname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(Init newInit, NotificationChain msgs)
  {
    Init oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowexpPackage.MODEL__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(Init newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowexpPackage.MODEL__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowexpPackage.MODEL__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowexpPackage.MODEL__INIT, newInit, newInit));
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
      case FlowexpPackage.MODEL__EXPR:
        return basicSetExpr(null, msgs);
      case FlowexpPackage.MODEL__INIT:
        return basicSetInit(null, msgs);
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
      case FlowexpPackage.MODEL__EXPR:
        return getExpr();
      case FlowexpPackage.MODEL__PHASE:
        return getPhase();
      case FlowexpPackage.MODEL__MODELNAME:
        return getModelname();
      case FlowexpPackage.MODEL__INIT:
        return getInit();
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
      case FlowexpPackage.MODEL__EXPR:
        setExpr((ExpNb)newValue);
        return;
      case FlowexpPackage.MODEL__PHASE:
        setPhase((String)newValue);
        return;
      case FlowexpPackage.MODEL__MODELNAME:
        setModelname((String)newValue);
        return;
      case FlowexpPackage.MODEL__INIT:
        setInit((Init)newValue);
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
      case FlowexpPackage.MODEL__EXPR:
        setExpr((ExpNb)null);
        return;
      case FlowexpPackage.MODEL__PHASE:
        setPhase(PHASE_EDEFAULT);
        return;
      case FlowexpPackage.MODEL__MODELNAME:
        setModelname(MODELNAME_EDEFAULT);
        return;
      case FlowexpPackage.MODEL__INIT:
        setInit((Init)null);
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
      case FlowexpPackage.MODEL__EXPR:
        return expr != null;
      case FlowexpPackage.MODEL__PHASE:
        return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
      case FlowexpPackage.MODEL__MODELNAME:
        return MODELNAME_EDEFAULT == null ? modelname != null : !MODELNAME_EDEFAULT.equals(modelname);
      case FlowexpPackage.MODEL__INIT:
        return init != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (phase: ");
    result.append(phase);
    result.append(", modelname: ");
    result.append(modelname);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
