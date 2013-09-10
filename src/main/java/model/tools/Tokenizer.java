

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.tools;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.StringArray;


/** Tokenizes sentences using the standard NLP tools (e.g. Stanford NLP Tokenizer).
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Tokenizer extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Tokenizer.class);
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
  protected Tokenizer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Tokenizer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Tokenizer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenLength

  /** getter for tokenLength - gets Specifies the size of the token (1-gram, 2-gram, 3-gram etc.).
   * @generated */
  public int getTokenLength() {
    if (Tokenizer_Type.featOkTst && ((Tokenizer_Type)jcasType).casFeat_tokenLength == null)
      jcasType.jcas.throwFeatMissing("tokenLength", "model.tools.Tokenizer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokenLength);}
    
  /** setter for tokenLength - sets Specifies the size of the token (1-gram, 2-gram, 3-gram etc.). 
   * @generated */
  public void setTokenLength(int v) {
    if (Tokenizer_Type.featOkTst && ((Tokenizer_Type)jcasType).casFeat_tokenLength == null)
      jcasType.jcas.throwFeatMissing("tokenLength", "model.tools.Tokenizer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokenLength, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets Stores the tokens obtained in an array of Strings.
   * @generated */
  public StringArray getTokens() {
    if (Tokenizer_Type.featOkTst && ((Tokenizer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "model.tools.Tokenizer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets Stores the tokens obtained in an array of Strings. 
   * @generated */
  public void setTokens(StringArray v) {
    if (Tokenizer_Type.featOkTst && ((Tokenizer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "model.tools.Tokenizer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokens - gets an indexed value - Stores the tokens obtained in an array of Strings.
   * @generated */
  public String getTokens(int i) {
    if (Tokenizer_Type.featOkTst && ((Tokenizer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "model.tools.Tokenizer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokens), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokens), i);}

  /** indexed setter for tokens - sets an indexed value - Stores the tokens obtained in an array of Strings.
   * @generated */
  public void setTokens(int i, String v) { 
    if (Tokenizer_Type.featOkTst && ((Tokenizer_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "model.tools.Tokenizer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokens), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Tokenizer_Type)jcasType).casFeatCode_tokens), i, v);}
  }

    