

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.scoring;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** We can use popular Machine Learning algorithms like Naive Bayes or Logistic Regression to assign an answer score between 0 and 1.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class MLClassification extends AbstractMetric {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MLClassification.class);
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
  protected MLClassification() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MLClassification(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MLClassification(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: logisticRegression

  /** getter for logisticRegression - gets Scores between 0 and 1.
   * @generated */
  public double getLogisticRegression() {
    if (MLClassification_Type.featOkTst && ((MLClassification_Type)jcasType).casFeat_logisticRegression == null)
      jcasType.jcas.throwFeatMissing("logisticRegression", "model.scoring.MLClassification");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((MLClassification_Type)jcasType).casFeatCode_logisticRegression);}
    
  /** setter for logisticRegression - sets Scores between 0 and 1. 
   * @generated */
  public void setLogisticRegression(double v) {
    if (MLClassification_Type.featOkTst && ((MLClassification_Type)jcasType).casFeat_logisticRegression == null)
      jcasType.jcas.throwFeatMissing("logisticRegression", "model.scoring.MLClassification");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((MLClassification_Type)jcasType).casFeatCode_logisticRegression, v);}    
   
    
  //*--------------*
  //* Feature: naiveBayes

  /** getter for naiveBayes - gets Scores between 0 and 1.
   * @generated */
  public double getNaiveBayes() {
    if (MLClassification_Type.featOkTst && ((MLClassification_Type)jcasType).casFeat_naiveBayes == null)
      jcasType.jcas.throwFeatMissing("naiveBayes", "model.scoring.MLClassification");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((MLClassification_Type)jcasType).casFeatCode_naiveBayes);}
    
  /** setter for naiveBayes - sets Scores between 0 and 1. 
   * @generated */
  public void setNaiveBayes(double v) {
    if (MLClassification_Type.featOkTst && ((MLClassification_Type)jcasType).casFeat_naiveBayes == null)
      jcasType.jcas.throwFeatMissing("naiveBayes", "model.scoring.MLClassification");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((MLClassification_Type)jcasType).casFeatCode_naiveBayes, v);}    
  }

    