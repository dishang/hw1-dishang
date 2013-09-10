
/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.evaluation;

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

/** Sorts the answers based on highest scores and computes precision @N, where N is the number of correct answers in the original sample.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * @generated */
public class Evaluator_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.evaluation.Evaluator");
 
  /** @generated */
  final Feature casFeat_sort;
  /** @generated */
  final int     casFeatCode_sort;
  /** @generated */ 
  public int getSort(int addr) {
        if (featOkTst && casFeat_sort == null)
      jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sort);
  }
  /** @generated */    
  public void setSort(int addr, int v) {
        if (featOkTst && casFeat_sort == null)
      jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_sort, v);}
    
   /** @generated */
  public double getSort(int addr, int i) {
        if (featOkTst && casFeat_sort == null)
      jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sort), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sort), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sort), i);
  }
   
  /** @generated */ 
  public void setSort(int addr, int i, double v) {
        if (featOkTst && casFeat_sort == null)
      jcas.throwFeatMissing("sort", "model.evaluation.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sort), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sort), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sort), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_ids;
  /** @generated */
  final int     casFeatCode_ids;
  /** @generated */ 
  public int getIds(int addr) {
        if (featOkTst && casFeat_ids == null)
      jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ids);
  }
  /** @generated */    
  public void setIds(int addr, int v) {
        if (featOkTst && casFeat_ids == null)
      jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_ids, v);}
    
   /** @generated */
  public int getIds(int addr, int i) {
        if (featOkTst && casFeat_ids == null)
      jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ids), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ids), i);
	return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ids), i);
  }
   
  /** @generated */ 
  public void setIds(int addr, int i, int v) {
        if (featOkTst && casFeat_ids == null)
      jcas.throwFeatMissing("ids", "model.evaluation.Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ids), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ids), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ids), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "model.evaluation.Evaluator");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "model.evaluation.Evaluator");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sort = jcas.getRequiredFeatureDE(casType, "sort", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_sort  = (null == casFeat_sort) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sort).getCode();

 
    casFeat_ids = jcas.getRequiredFeatureDE(casType, "ids", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_ids  = (null == casFeat_ids) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ids).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    