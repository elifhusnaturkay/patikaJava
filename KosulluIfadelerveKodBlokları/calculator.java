package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("İlk sayıyı giriniz: ");
      double num1 = keyboard.nextDouble();

      System.out.println("İkinci sayıyı giriniz: ");
      double num2 = keyboard.nextDouble();

      System.out.println("Yapmak istediğiniz işlemi seçin.");
      System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
      int islem = keyboard.nextInt();

      switch(islem){
         case 1:
            System.out.println("İşlem sonucu: " + (num1 + num2));
            break;
         case 2:
            System.out.println("İşlem sonucu: " + (num1 - num2));
            break;
         case 3:
            System.out.println("İşlem sonucu: " + (num1 * num2));
            break;
         case 4:
            System.out.println("İşlem sonucu: " + (num1 / num2));
            break;
      default:
         System.out.println("Hatalı giriş.");
         break;

      }
   }
}
