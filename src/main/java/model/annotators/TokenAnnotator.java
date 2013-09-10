

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.annotators;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import model.tools.Tokenizer;


/** Annotates the tokens in the document.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class TokenAnnotator extends BaseAnnotator {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenAnnotator.class);
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
  protected TokenAnnotator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenAnnotator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenAnnotator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenAnnotator(JCas jcas, int begin, int end) {
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
  //* Feature: tokenizer

  /** getter for tokenizer - gets Uses the Tokenizer type to set the length of the token to 1 and tokenize the sentence.
   * @generated */
  public Tokenizer getTokenizer() {
    if (TokenAnnotator_Type.featOkTst && ((TokenAnnotator_Type)jcasType).casFeat_tokenizer == null)
      jcasType.jcas.throwFeatMissing("tokenizer", "model.annotators.TokenAnnotator");
    return (Tokenizer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenAnnotator_Type)jcasType).casFeatCode_tokenizer)));}
    
  /** setter for tokenizer - sets Uses the Tokenizer type to set the length of the token to 1 and tokenize the sentence. 
   * @generated */
  public void setTokenizer(Tokenizer v) {
    if (TokenAnnotator_Type.featOkTst && ((TokenAnnotator_Type)jcasType).casFeat_tokenizer == null)
      jcasType.jcas.throwFeatMissing("tokenizer", "model.annotators.TokenAnnotator");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenAnnotator_Type)jcasType).casFeatCode_tokenizer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    