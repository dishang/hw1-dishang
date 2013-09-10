
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
import org.apache.uima.jcas.tcas.DocumentAnnotation_Type;

/** Input to the model.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class Input_Type extends DocumentAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Input_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Input_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Input(addr, Input_Type.this);
  			   Input_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Input(addr, Input_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Input.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.Input");
 
  /** @generated */
  final Feature casFeat_path;
  /** @generated */
  final int     casFeatCode_path;
  /** @generated */ 
  public String getPath(int addr) {
        if (featOkTst && casFeat_path == null)
      jcas.throwFeatMissing("path", "model.Input");
    return ll_cas.ll_getStringValue(addr, casFeatCode_path);
  }
  /** @generated */    
  public void setPath(int addr, String v) {
        if (featOkTst && casFeat_path == null)
      jcas.throwFeatMissing("path", "model.Input");
    ll_cas.ll_setStringValue(addr, casFeatCode_path, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Input_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_path = jcas.getRequiredFeatureDE(casType, "path", "uima.cas.String", featOkTst);
    casFeatCode_path  = (null == casFeat_path) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_path).getCode();

  }
}



    