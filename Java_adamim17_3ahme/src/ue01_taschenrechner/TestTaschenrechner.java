package ue01_taschenrechner;

import java.util.Scanner;


public class TestTaschenrechner {
    
    public static void main (String[] args) {
        Scanner variable = new Scanner(System.in);
        
        System.out.print("Wert a: ");
        final double a = variable.nextDouble();
         
        System.out.print("Wert b: ");
        final double b = variable.nextDouble();
        
        Taschenrechner ergebnisse = new Taschenrechner(a, b);
           
        System.out.println("  Addition: "+ ergebnisse.getAdditionsResult());
        System.out.println("  Subtraction: "+ ergebnisse.getSubtractionResult());
        System.out.println("  Multiplication: "+ ergebnisse.getMultiplicationResult());
        System.out.println("  Division: "+ ergebnisse.getDivisionResult());
    }  
    
}
