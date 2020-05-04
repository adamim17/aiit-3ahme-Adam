package Aufgabe2;


 class Motorrad
 {
   public String hersteller;
   public String bezeichnung;
   public int baujahr;
   public int erstzulassung;
   public double leistung;
   public double hubraum;
   public double preis;  
 }
    
public class Klassen
{
    public static void main (String[] args) {
        Motorrad erstesMotorrad = new Motorrad();
        erstesMotorrad.hersteller = "Beta";
        erstesMotorrad.bezeichnung = "RR 125 LC";
        erstesMotorrad.baujahr = 2019;
        erstesMotorrad.erstzulassung = 2019;
        erstesMotorrad.leistung = 15;
        erstesMotorrad.hubraum = 125;
        erstesMotorrad.preis = 4700;
        
        System.out.println("Erstes Motorrad");
        System.out.println("Hersteller "+erstesMotorrad.hersteller);
        System.out.println("Bezeichnung "+erstesMotorrad.bezeichnung);
        System.out.println("Baujahr "+erstesMotorrad.baujahr);
        System.out.println("Leistung "+erstesMotorrad.leistung);
        System.out.println("Hubraum "+erstesMotorrad.hubraum);
        System.out.println("Erstzulassung "+erstesMotorrad.erstzulassung);
        System.out.println("Preis "+erstesMotorrad.preis);
        System.out.println("Alter: " +(2020 - erstesMotorrad.erstzulassung)+" Jahr(e)");
    } 
}
 
//Programm selber geschrieben und verstanden
