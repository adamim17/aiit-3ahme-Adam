package Aufgabe1;

 
 public class StringsVergleichen
 {
   public static void main(String[] args)
   {
     String a = new String("Guten");
     String b = new String("Tag");
     System.out.println("a == b liefert " + (a == b));
     System.out.println("a != b liefert " + (a != b));
   
     String c = new String("hallo");
     String d = new String("hallo");
     System.out.println("a.equals(b) liefert " + a.equals(b));
   }
 }

// Programm 1 zu 1 uebernommen und verstanden