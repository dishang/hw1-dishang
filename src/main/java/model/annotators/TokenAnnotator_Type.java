
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

/** Annotates the tokens in the document.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class TokenAnnotator_Type extends BaseAnnotator_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenAnnotator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenAnnotator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenAnnotator(addr, TokenAnnotator_Type.this);
  			   TokenAnnotator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenAnnotator(addr, TokenAnnotator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenAnnotator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.annotators.TokenAnnotator");
 
  /** @generated */
  final Feature casFeat_tokenizer;
  /** @generated */
  final int     casFeatCode_tokenizer;
  /** @generated */ 
  public int getTokenizer(int addr) {
        if (featOkTst && casFeat_tokenizer == null)
      jcas.throwFeatMissing("tokenizer", "model.annotators.TokenAnnotator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenizer);
  }
  /** @generated */    
  public void setTokenizer(int addr, int v) {
        if (featOkTst && casFeat_tokenizer == null)
      jcas.throwFeatMissing("tokenizer", "model.annotators.TokenAnnotator");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenizer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenAnnotator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenizer = jcas.getRequiredFeatureDE(casType, "tokenizer", "model.tools.Tokenizer", featOkTst);
    casFeatCode_tokenizer  = (null == casFeat_tokenizer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizer).getCode();

  }
}



    