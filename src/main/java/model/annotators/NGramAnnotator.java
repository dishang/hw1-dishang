

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.annotators;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import model.tools.Tokenizer;


/** Annotates 1,2 and 3 gram tokens.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NGramAnnotator extends BaseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramAnnotator.class);
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
  protected NGramAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramAnnotator(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: ngramTokenizer

  /** getter for ngramTokenizer - gets Tokenizes sentences using the Tokenizer type, with variable length (1,2 or 3).
   * @generated */
  public Tokenizer getNgramTokenizer() {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_ngramTokenizer == null)
      jcasType.jcas.throwFeatMissing("ngramTokenizer", "model.annotators.NGramAnnotator");
    return (Tokenizer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_ngramTokenizer)));}
    
  /** setter for ngramTokenizer - sets Tokenizes sentences using the Tokenizer type, with variable length (1,2 or 3). 
   * @generated */
  public void setNgramTokenizer(Tokenizer v) {
    if (NGramAnnotator_Type.featOkTst && ((NGramAnnotator_Type)jcasType).casFeat_ngramTokenizer == null)
      jcasType.jcas.throwFeatMissing("ngramTokenizer", "model.annotators.NGramAnnotator");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotator_Type)jcasType).casFeatCode_ngramTokenizer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    