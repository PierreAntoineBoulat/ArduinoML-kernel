/**
 * generated by Xtext 2.23.0
 */
package fr.polytech.si5.dsl.arduino.arduinoML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.si5.dsl.arduino.arduinoML.Brick#getName <em>Name</em>}</li>
 *   <li>{@link fr.polytech.si5.dsl.arduino.arduinoML.Brick#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getBrick_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.polytech.si5.dsl.arduino.arduinoML.Brick#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pin</em>' attribute.
   * @see #setPin(int)
   * @see fr.polytech.si5.dsl.arduino.arduinoML.ArduinoMLPackage#getBrick_Pin()
   * @model
   * @generated
   */
  int getPin();

  /**
   * Sets the value of the '{@link fr.polytech.si5.dsl.arduino.arduinoML.Brick#getPin <em>Pin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin</em>' attribute.
   * @see #getPin()
   * @generated
   */
  void setPin(int value);

} // Brick
