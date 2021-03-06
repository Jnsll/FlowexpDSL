/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.flowexp.flowexp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.flowexp.flowexp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowexpFactoryImpl extends EFactoryImpl implements FlowexpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FlowexpFactory init()
  {
    try
    {
      FlowexpFactory theFlowexpFactory = (FlowexpFactory)EPackage.Registry.INSTANCE.getEFactory(FlowexpPackage.eNS_URI);
      if (theFlowexpFactory != null)
      {
        return theFlowexpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FlowexpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowexpFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FlowexpPackage.MODEL: return createModel();
      case FlowexpPackage.EXP_NB: return createExpNb();
      case FlowexpPackage.INIT: return createInit();
      case FlowexpPackage.INIT_ONE: return createInitOne();
      case FlowexpPackage.EXP_NB_BATCH: return createExpNbBatch();
      case FlowexpPackage.EXP_NB_ONE: return createExpNbOne();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpNb createExpNb()
  {
    ExpNbImpl expNb = new ExpNbImpl();
    return expNb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init createInit()
  {
    InitImpl init = new InitImpl();
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitOne createInitOne()
  {
    InitOneImpl initOne = new InitOneImpl();
    return initOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpNbBatch createExpNbBatch()
  {
    ExpNbBatchImpl expNbBatch = new ExpNbBatchImpl();
    return expNbBatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpNbOne createExpNbOne()
  {
    ExpNbOneImpl expNbOne = new ExpNbOneImpl();
    return expNbOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowexpPackage getFlowexpPackage()
  {
    return (FlowexpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FlowexpPackage getPackage()
  {
    return FlowexpPackage.eINSTANCE;
  }

} //FlowexpFactoryImpl
