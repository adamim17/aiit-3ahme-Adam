package Aufgabe1;

public class bitweiseOperatoren
 {
   public static void main(String[] args)
   {
     int i = 55;
     int j = 97;
     if ((i & 15) < (j & 15)) { 
       System.out.println("LowByte(55) < LowByte(97)");
     } else {
       System.out.println("LowByte(55) >= LowByte(97)");
     }
   }
 }

// Programm uebernommen und verstanden