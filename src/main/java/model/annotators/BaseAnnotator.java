

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.annotators;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base Annotator which every other Annotator subtype will extend. Contains the 'source' and 'confidence' features.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class BaseAnnotator extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotator.class);
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
  protected BaseAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotator(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets Keeps track of where the annotation was made.
   * @generated */
  public String getSource() {
    if (BaseAnnotator_Type.featOkTst && ((BaseAnnotator_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.annotators.BaseAnnotator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotator_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Keeps track of where the annotation was made. 
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotator_Type.featOkTst && ((BaseAnnotator_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.annotators.BaseAnnotator");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotator_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Keeps track of the confidence level of the annotation.
   * @generated */
  public float getConfidence() {
    if (BaseAnnotator_Type.featOkTst && ((BaseAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.annotators.BaseAnnotator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((BaseAnnotator_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Keeps track of the confidence level of the annotation. 
   * @generated */
  public void setConfidence(float v) {
    if (BaseAnnotator_Type.featOkTst && ((BaseAnnotator_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.annotators.BaseAnnotator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((BaseAnnotator_Type)jcasType).casFeatCode_confidence, v);}    
  }

    