
/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Displays the final output precision computed by the Evaluator type.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class Ouput_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ouput_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ouput_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ouput(addr, Ouput_Type.this);
  			   Ouput_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ouput(addr, Ouput_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ouput.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.Ouput");
 
  /** @generated */
  final Feature casFeat_display;
  /** @generated */
  final int     casFeatCode_display;
  /** @generated */ 
  public String getDisplay(int addr) {
        if (featOkTst && casFeat_display == null)
      jcas.throwFeatMissing("display", "model.Ouput");
    return ll_cas.ll_getStringValue(addr, casFeatCode_display);
  }
  /** @generated */    
  public void setDisplay(int addr, String v) {
        if (featOkTst && casFeat_display == null)
      jcas.throwFeatMissing("display", "model.Ouput");
    ll_cas.ll_setStringValue(addr, casFeatCode_display, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Ouput_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_display = jcas.getRequiredFeatureDE(casType, "display", "uima.cas.String", featOkTst);
    casFeatCode_display  = (null == casFeat_display) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_display).getCode();

  }
}



    