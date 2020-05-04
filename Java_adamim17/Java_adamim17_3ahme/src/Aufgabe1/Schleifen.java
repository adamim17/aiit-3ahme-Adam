package Aufgabe1;

public class Schleifen
 {
   public static void main(String[] args)
   {
    //while schleife
       int a = 1;
       
       while (a == 1)
       {
       System.out.println("a ist 1");
       break;
       }
       
       do{
        System.out.println("a ist 1");
         }while(a != 1); // wenn == wird es unendlich wiederholt
    
      //break und continue 
       int[][] data = new int[10][10];
 
     
     for (int i = 1; i <= 10; ++i) {
       for (int j = 1; j <= 10; ++j) {
         data[i - 1][j - 1] = i * j;
       }
     }
 
   loop1:
     for (int i = 1; i <= 10; ++i) {
       for (int j = 1; j <= 10; ++j) {
         if (data[i - 1][j - 1] > 43) {
           System.out.println(i + "*" + j + "=" + (i*j));
           break loop1;
         }
       } 
     } 
   }
 }

// do, while, for Schleife verstanden (gleich wie in C), Beispiel aus Buch nicht ganz verstanden