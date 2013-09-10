

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** Input to the model.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Input extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Input.class);
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
  protected Input() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Input(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Input(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Input(JCas jcas, int begin, int end) {
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
  //* Feature: path

  /** getter for path - gets Specifies the location for the data file.
   * @generated */
  public String getPath() {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_path == null)
      jcasType.jcas.throwFeatMissing("path", "model.Input");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Input_Type)jcasType).casFeatCode_path);}
    
  /** setter for path - sets Specifies the location for the data file. 
   * @generated */
  public void setPath(String v) {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_path == null)
      jcasType.jcas.throwFeatMissing("path", "model.Input");
    jcasType.ll_cas.ll_setStringValue(addr, ((Input_Type)jcasType).casFeatCode_path, v);}    
  }

    