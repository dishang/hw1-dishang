
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

/** Annotates 1,2 and 3 gram tokens.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class NGramAnnotator_Type extends BaseAnnotator_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramAnnotator(addr, NGramAnnotator_Type.this);
  			   NGramAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramAnnotator(addr, NGramAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.annotators.NGramAnnotator");
 
  /** @generated */
  final Feature casFeat_ngramTokenizer;
  /** @generated */
  final int     casFeatCode_ngramTokenizer;
  /** @generated */ 
  public int getNgramTokenizer(int addr) {
        if (featOkTst && casFeat_ngramTokenizer == null)
      jcas.throwFeatMissing("ngramTokenizer", "model.annotators.NGramAnnotator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngramTokenizer);
  }
  /** @generated */    
  public void setNgramTokenizer(int addr, int v) {
        if (featOkTst && casFeat_ngramTokenizer == null)
      jcas.throwFeatMissing("ngramTokenizer", "model.annotators.NGramAnnotator");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngramTokenizer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ngramTokenizer = jcas.getRequiredFeatureDE(casType, "ngramTokenizer", "model.tools.Tokenizer", featOkTst);
    casFeatCode_ngramTokenizer  = (null == casFeat_ngramTokenizer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngramTokenizer).getCode();

  }
}



    