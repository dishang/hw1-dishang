
/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.scoring;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** We can use popular Machine Learning algorithms like Naive Bayes or Logistic Regression to assign an answer score between 0 and 1.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class MLClassification_Type extends AbstractMetric_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MLClassification_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MLClassification_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MLClassification(addr, MLClassification_Type.this);
  			   MLClassification_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MLClassification(addr, MLClassification_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MLClassification.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.scoring.MLClassification");
 
  /** @generated */
  final Feature casFeat_logisticRegression;
  /** @generated */
  final int     casFeatCode_logisticRegression;
  /** @generated */ 
  public double getLogisticRegression(int addr) {
        if (featOkTst && casFeat_logisticRegression == null)
      jcas.throwFeatMissing("logisticRegression", "model.scoring.MLClassification");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_logisticRegression);
  }
  /** @generated */    
  public void setLogisticRegression(int addr, double v) {
        if (featOkTst && casFeat_logisticRegression == null)
      jcas.throwFeatMissing("logisticRegression", "model.scoring.MLClassification");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_logisticRegression, v);}
    
  
 
  /** @generated */
  final Feature casFeat_naiveBayes;
  /** @generated */
  final int     casFeatCode_naiveBayes;
  /** @generated */ 
  public double getNaiveBayes(int addr) {
        if (featOkTst && casFeat_naiveBayes == null)
      jcas.throwFeatMissing("naiveBayes", "model.scoring.MLClassification");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_naiveBayes);
  }
  /** @generated */    
  public void setNaiveBayes(int addr, double v) {
        if (featOkTst && casFeat_naiveBayes == null)
      jcas.throwFeatMissing("naiveBayes", "model.scoring.MLClassification");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_naiveBayes, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MLClassification_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_logisticRegression = jcas.getRequiredFeatureDE(casType, "logisticRegression", "uima.cas.Double", featOkTst);
    casFeatCode_logisticRegression  = (null == casFeat_logisticRegression) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_logisticRegression).getCode();

 
    casFeat_naiveBayes = jcas.getRequiredFeatureDE(casType, "naiveBayes", "uima.cas.Double", featOkTst);
    casFeatCode_naiveBayes  = (null == casFeat_naiveBayes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_naiveBayes).getCode();

  }
}



    