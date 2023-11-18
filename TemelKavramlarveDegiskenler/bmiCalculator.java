package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class bmiCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double kilo, boy, kitleEndeksi;

      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
      boy = keyboard.nextDouble();

      System.out.print("Lütfen kilonuzu giriniz : ");
      kilo = keyboard.nextDouble();

      kitleEndeksi = kilo / (boy * boy);

      System.out.println("Vücut Kitle İndeksiniz : " + kitleEndeksi);

   }
}
