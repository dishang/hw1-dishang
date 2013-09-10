

/* First created by JCasGen Mon Sep 09 19:16:32 EDT 2013 */
package model.scoring;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Abstract Class which other subtype answer scoring methods would extend.
 * Updated by JCasGen Mon Sep 09 19:16:32 EDT 2013
 * XML source: C:/Users/DISHAN/Desktop/workspace/hw1-dishang/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class AbstractMetric extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbstractMetric.class);
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
  protected AbstractMetric() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AbstractMetric(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AbstractMetric(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    