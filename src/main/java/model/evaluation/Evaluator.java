

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.evaluation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.IntegerArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.DoubleArray;


/** Sorts the answers based on highest scores and computes precision @N, where N is the number of correct answers in the original sample.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Evaluator extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sort

  /** getter for sort - gets Array sorted based on scores of the answers.
   * @generated */
  public DoubleArray getSort() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_sort == null)
      jcasType.jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_sort)));}
    
  /** setter for sort - sets Array sorted based on scores of the answers. 
   * @generated */
  public void setSort(DoubleArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_sort == null)
      jcasType.jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_sort, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sort - gets an indexed value - Array sorted based on scores of the answers.
   * @generated */
  public double getSort(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_sort == null)
      jcasType.jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_sort), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_sort), i);}

  /** indexed setter for sort - sets an indexed value - Array sorted based on scores of the answers.
   * @generated */
  public void setSort(int i, double v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_sort == null)
      jcasType.jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_sort), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_sort), i, v);}
   
    
  //*--------------*
  //* Feature: ids

  /** getter for ids - gets Keeps track of the sorted answers by assigning each one a unique ID (usually just the position in the array itself).
   * @generated */
  public IntegerArray getIds() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_ids == null)
      jcasType.jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_ids)));}
    
  /** setter for ids - sets Keeps track of the sorted answers by assigning each one a unique ID (usually just the position in the array itself). 
   * @generated */
  public void setIds(IntegerArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_ids == null)
      jcasType.jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_ids, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ids - gets an indexed value - Keeps track of the sorted answers by assigning each one a unique ID (usually just the position in the array itself).
   * @generated */
  public int getIds(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_ids == null)
      jcasType.jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_ids), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_ids), i);}

  /** indexed setter for ids - sets an indexed value - Keeps track of the sorted answers by assigning each one a unique ID (usually just the position in the array itself).
   * @generated */
  public void setIds(int i, int v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_ids == null)
      jcasType.jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_ids), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_ids), i, v);}
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets Computes precision@N.
   * @generated */
  public double getPrecision() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.evaluation.Evaluator");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets Computes precision@N. 
   * @generated */
  public void setPrecision(double v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.evaluation.Evaluator");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision, v);}    
  }

    