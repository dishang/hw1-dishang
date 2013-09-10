
/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.annotators;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotates questions, answers and whether the answer is correct or not.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class SentenceAnnotator_Type extends BaseAnnotator_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SentenceAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SentenceAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SentenceAnnotator(addr, SentenceAnnotator_Type.this);
  			   SentenceAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SentenceAnnotator(addr, SentenceAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SentenceAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.annotators.SentenceAnnotator");
 
  /** @generated */
  final Feature casFeat_isQuestion;
  /** @generated */
  final int     casFeatCode_isQuestion;
  /** @generated */ 
  public boolean getIsQuestion(int addr) {
        if (featOkTst && casFeat_isQuestion == null)
      jcas.throwFeatMissing("isQuestion", "model.annotators.SentenceAnnotator");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isQuestion);
  }
  /** @generated */    
  public void setIsQuestion(int addr, boolean v) {
        if (featOkTst && casFeat_isQuestion == null)
      jcas.throwFeatMissing("isQuestion", "model.annotators.SentenceAnnotator");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isQuestion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isCorrect;
  /** @generated */
  final int     casFeatCode_isCorrect;
  /** @generated */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "model.annotators.SentenceAnnotator");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isCorrect);
  }
  /** @generated */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "model.annotators.SentenceAnnotator");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isCorrect, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SentenceAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isQuestion = jcas.getRequiredFeatureDE(casType, "isQuestion", "uima.cas.Boolean", featOkTst);
    casFeatCode_isQuestion  = (null == casFeat_isQuestion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isQuestion).getCode();

 
    casFeat_isCorrect = jcas.getRequiredFeatureDE(casType, "isCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_isCorrect  = (null == casFeat_isCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCorrect).getCode();

  }
}



    