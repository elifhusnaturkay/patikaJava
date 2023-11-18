package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class groceryStore {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double armut =2.14, elma =3.67, domates =1.11, muz =0.95, patlıcan =5.0;
      double Armut, Elma, Domates, Muz, Patlıcan, tutar;

      System.out.print("Armut Kaç Kilo ? :");
      Armut = keyboard.nextDouble();
      Armut = armut * Armut;
     
      System.out.print("Elma Kaç Kilo ? :");
      Elma = keyboard.nextDouble();    
      Elma = elma * Elma;
      
      System.out.print("Domates Kaç Kilo ? :");
      Domates = keyboard.nextDouble();
      Domates = domates * Domates;

      System.out.print("Muz Kaç Kilo ? :");
      Muz = keyboard.nextDouble();
      Muz = muz * Muz;

      System.out.print("Patlıcan Kaç Kilo ? :");
      Patlıcan = keyboard.nextDouble();
      Patlıcan = patlıcan * Patlıcan;

      tutar = (Armut + Elma + Domates + Muz + Patlıcan);
      System.out.println("Toplam Tutar : " + tutar);
   }
}
