package Aufgabe1;


 public class anwendungAssertions
 {
   public static void main(String[] args)
   {
     assert args.length >= 2; 
     int i1 = Integer.parseInt(args[0]);
     int i2 = Integer.parseInt(args[1]);
     assert i2 != 0 : "Teilen durch 0 nicht moeglich"; 
     System.out.println(i1 + "/" + i2 + "=" + (i1/i2));
   }
 }

//Programm laesst sich aus unbekannten gruenden nicht ausfuehren