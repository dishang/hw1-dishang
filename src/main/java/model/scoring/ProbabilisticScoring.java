

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.scoring;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** We can use various statistical/probalisting scoring measures like KL-Divergence, Mutual Information etc. to score the answers.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class ProbabilisticScoring extends AbstractMetric {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ProbabilisticScoring.class);
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
  protected ProbabilisticScoring() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ProbabilisticScoring(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ProbabilisticScoring(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: klDivergence

  /** getter for klDivergence - gets KL-Divergence score for an answer.
   * @generated */
  public double getKlDivergence() {
    if (ProbabilisticScoring_Type.featOkTst && ((ProbabilisticScoring_Type)jcasType).casFeat_klDivergence == null)
      jcasType.jcas.throwFeatMissing("klDivergence", "model.scoring.ProbabilisticScoring");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ProbabilisticScoring_Type)jcasType).casFeatCode_klDivergence);}
    
  /** setter for klDivergence - sets KL-Divergence score for an answer. 
   * @generated */
  public void setKlDivergence(double v) {
    if (ProbabilisticScoring_Type.featOkTst && ((ProbabilisticScoring_Type)jcasType).casFeat_klDivergence == null)
      jcasType.jcas.throwFeatMissing("klDivergence", "model.scoring.ProbabilisticScoring");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ProbabilisticScoring_Type)jcasType).casFeatCode_klDivergence, v);}    
   
    
  //*--------------*
  //* Feature: mutualInformaiton

  /** getter for mutualInformaiton - gets Mutual Information score for an answer.
   * @generated */
  public double getMutualInformaiton() {
    if (ProbabilisticScoring_Type.featOkTst && ((ProbabilisticScoring_Type)jcasType).casFeat_mutualInformaiton == null)
      jcasType.jcas.throwFeatMissing("mutualInformaiton", "model.scoring.ProbabilisticScoring");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ProbabilisticScoring_Type)jcasType).casFeatCode_mutualInformaiton);}
    
  /** setter for mutualInformaiton - sets Mutual Information score for an answer. 
   * @generated */
  public void setMutualInformaiton(double v) {
    if (ProbabilisticScoring_Type.featOkTst && ((ProbabilisticScoring_Type)jcasType).casFeat_mutualInformaiton == null)
      jcasType.jcas.throwFeatMissing("mutualInformaiton", "model.scoring.ProbabilisticScoring");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ProbabilisticScoring_Type)jcasType).casFeatCode_mutualInformaiton, v);}    
  }

    