package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class circleCalculations {
   public static void main(String[]args){
      Scanner keyboard = new Scanner(System.in);
      double yariCapi, merkezAci, cemberAlan, cemberCevre, pi = 3.14, aciliAlan;

      System.out.println("İstediğiniz çemberin yarı çapını giriniz: ");
       yariCapi = keyboard.nextDouble();
      System.out.println("Hesaplanacak çemberin merkezi açısının ölçüsünü giriniz: ");
      merkezAci = keyboard.nextDouble();

      cemberAlan = pi * yariCapi * yariCapi;
      cemberCevre = 2 * pi * yariCapi;
      aciliAlan = (pi * (yariCapi * yariCapi) * merkezAci)/360;

      System.out.println("Çemberinizin alanı: " + cemberAlan);
      System.out.println("Çemberinizin çevresi: " + cemberCevre);
      System.out.println("Çemberinizdeki açılı alanın alanı: " + aciliAlan);

   }
}
