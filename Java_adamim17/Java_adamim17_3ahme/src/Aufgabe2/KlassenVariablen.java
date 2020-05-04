
package Aufgabe2;

public class KlassenVariablen {
   static private int objcnt = 0;
 
   public void KlassenVariablen()
   {
     ++objcnt;
   }
 
   public void finalize()
   {
     --objcnt;
   }
 
   public static void main(String[] args)
   {
    //KlassenVariablen
     KlassenVariablen auto1;
     KlassenVariablen auto2 = new KlassenVariablen();
     System.out.println(
     "Anzahl Testauto-Objekte: " + KlassenVariablen.objcnt
     );
     
    //KlassenMethoden 
     double x, y;
     for (x = 0.0; x <= 10.0; x = x + 1.0) {
       y = Math.sqrt(x);
       System.out.println("sqrt("+x+") = "+y);
     }
   }
 }
 
// Programm uebernommen und verstanden