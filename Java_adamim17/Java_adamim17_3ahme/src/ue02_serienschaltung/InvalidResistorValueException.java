/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

/**
 *
 * @author mike
 */
public class InvalidResistorValueException extends Exception
{
    private final double invalidValue;
    
    public InvalidResistorValueException(double invalidValue)
    {
        super("Invalid Resistor" +invalidValue);
        this.invalidValue = invalidValue;
    }
    
    public double getInvalidValue()
    {
        return invalidValue;
    }

}  
    
  /*  void myMethod (int widerstandFeld) throws IllegalArgumentException {
         if (widerstandFeld < 0) 
            {
            throw new IllegalArgumentException("widerstandsFeld darf nicht kleiner 0 sein");
            }
             
            if (widerstandFeld > 10000000) 
            {
            throw new IllegalArgumentException("widerstandsFeld darf nicht groesser 10000000 sein");
            }      
      }
}
*/    

