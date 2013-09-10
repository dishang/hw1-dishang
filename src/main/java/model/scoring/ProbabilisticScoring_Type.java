
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

/** We can use various statistical/probalisting scoring measures like KL-Divergence, Mutual Information etc. to score the answers.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class ProbabilisticScoring_Type extends AbstractMetric_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ProbabilisticScoring_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ProbabilisticScoring_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ProbabilisticScoring(addr, ProbabilisticScoring_Type.this);
  			   ProbabilisticScoring_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ProbabilisticScoring(addr, ProbabilisticScoring_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ProbabilisticScoring.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.scoring.ProbabilisticScoring");
 
  /** @generated */
  final Feature casFeat_klDivergence;
  /** @generated */
  final int     casFeatCode_klDivergence;
  /** @generated */ 
  public double getKlDivergence(int addr) {
        if (featOkTst && casFeat_klDivergence == null)
      jcas.throwFeatMissing("klDivergence", "model.scoring.ProbabilisticScoring");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_klDivergence);
  }
  /** @generated */    
  public void setKlDivergence(int addr, double v) {
        if (featOkTst && casFeat_klDivergence == null)
      jcas.throwFeatMissing("klDivergence", "model.scoring.ProbabilisticScoring");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_klDivergence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mutualInformaiton;
  /** @generated */
  final int     casFeatCode_mutualInformaiton;
  /** @generated */ 
  public double getMutualInformaiton(int addr) {
        if (featOkTst && casFeat_mutualInformaiton == null)
      jcas.throwFeatMissing("mutualInformaiton", "model.scoring.ProbabilisticScoring");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_mutualInformaiton);
  }
  /** @generated */    
  public void setMutualInformaiton(int addr, double v) {
        if (featOkTst && casFeat_mutualInformaiton == null)
      jcas.throwFeatMissing("mutualInformaiton", "model.scoring.ProbabilisticScoring");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_mutualInformaiton, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ProbabilisticScoring_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_klDivergence = jcas.getRequiredFeatureDE(casType, "klDivergence", "uima.cas.Double", featOkTst);
    casFeatCode_klDivergence  = (null == casFeat_klDivergence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_klDivergence).getCode();

 
    casFeat_mutualInformaiton = jcas.getRequiredFeatureDE(casType, "mutualInformaiton", "uima.cas.Double", featOkTst);
    casFeatCode_mutualInformaiton  = (null == casFeat_mutualInformaiton) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mutualInformaiton).getCode();

  }
}



    