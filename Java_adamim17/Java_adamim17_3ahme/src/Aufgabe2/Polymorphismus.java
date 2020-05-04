package Aufgabe2;

 
 abstract class Mitarbeiter
 {
   int persnr;
   String name;
   
 
   public abstract double monatsBrutto();
 }
 
 class Arbeiter
 extends Mitarbeiter
 {
   double stundenlohn;
   double anzahlstunden;
   double ueberstundenzuschlag;
   double anzahlueberstunden;
   double schichtzulage;
 
   public double monatsBrutto()
   {
     return stundenlohn*anzahlstunden+
            ueberstundenzuschlag*anzahlueberstunden+
            schichtzulage;
   }
 }
 
 class Angestellter
 extends Mitarbeiter
 {
   double grundgehalt;
   double ortszuschlag;
   double zulage;
 
   public double monatsBrutto()
   {
     return grundgehalt+
            ortszuschlag+
            zulage;
   }
 }
 
 class Manager
 extends Mitarbeiter
 {
   double fixgehalt;
   double provision1;
   double provision2;
   double umsatz1;
   double umsatz2;
 
   public double monatsBrutto()
   {
     return fixgehalt+
            umsatz1*provision1/100+
            umsatz2*provision2/100;
   }
 }
 
 public class Polymorphismus
 {
   private static final int ANZ_MA = 100;
   private static Mitarbeiter[] ma;
   private static double bruttosumme;
 
   public static void main(String[] args)
   {
     ma = new Mitarbeiter[ANZ_MA];

     bruttosumme = 0.0;
     for (int i=0; i<ma.length; ++i) {
       bruttosumme += ma[i].monatsBrutto();
     }
     System.out.println("Bruttosumme = "+bruttosumme);
   }
 }

//Programm teilweise verstanden