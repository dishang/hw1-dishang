

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.annotators;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Annotates questions, answers and whether the answer is correct or not.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class SentenceAnnotator extends BaseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceAnnotator.class);
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
  protected SentenceAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SentenceAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SentenceAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SentenceAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: isQuestion

  /** getter for isQuestion - gets Identifier flag for whether the sentence is a question or answer.
   * @generated */
  public boolean getIsQuestion() {
    if (SentenceAnnotator_Type.featOkTst && ((SentenceAnnotator_Type)jcasType).casFeat_isQuestion == null)
      jcasType.jcas.throwFeatMissing("isQuestion", "model.annotators.SentenceAnnotator");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SentenceAnnotator_Type)jcasType).casFeatCode_isQuestion);}
    
  /** setter for isQuestion - sets Identifier flag for whether the sentence is a question or answer. 
   * @generated */
  public void setIsQuestion(boolean v) {
    if (SentenceAnnotator_Type.featOkTst && ((SentenceAnnotator_Type)jcasType).casFeat_isQuestion == null)
      jcasType.jcas.throwFeatMissing("isQuestion", "model.annotators.SentenceAnnotator");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SentenceAnnotator_Type)jcasType).casFeatCode_isQuestion, v);}    
   
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets Identifier flag for whether the answer is correct or not.
   * @generated */
  public boolean getIsCorrect() {
    if (SentenceAnnotator_Type.featOkTst && ((SentenceAnnotator_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.annotators.SentenceAnnotator");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SentenceAnnotator_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets Identifier flag for whether the answer is correct or not. 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (SentenceAnnotator_Type.featOkTst && ((SentenceAnnotator_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.annotators.SentenceAnnotator");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SentenceAnnotator_Type)jcasType).casFeatCode_isCorrect, v);}    
  }

    