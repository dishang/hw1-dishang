

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Displays the final output precision computed by the Evaluator type.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Ouput extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ouput.class);
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
  protected Ouput() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ouput(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ouput(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: display

  /** getter for display - gets Displays the model output.
   * @generated */
  public String getDisplay() {
    if (Ouput_Type.featOkTst && ((Ouput_Type)jcasType).casFeat_display == null)
      jcasType.jcas.throwFeatMissing("display", "model.Ouput");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ouput_Type)jcasType).casFeatCode_display);}
    
  /** setter for display - sets Displays the model output. 
   * @generated */
  public void setDisplay(String v) {
    if (Ouput_Type.featOkTst && ((Ouput_Type)jcasType).casFeat_display == null)
      jcasType.jcas.throwFeatMissing("display", "model.Ouput");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ouput_Type)jcasType).casFeatCode_display, v);}    
  }

    