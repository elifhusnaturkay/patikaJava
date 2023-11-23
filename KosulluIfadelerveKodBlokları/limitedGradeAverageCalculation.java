package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class limitedGradeAverageCalculation {
   public static void main(String[]args){
      Scanner keyboard = new Scanner(System.in);
      double  Matematik, Fizik, Türkçe, Kimya, Müzik, gecmeNotu, ortalama;
      gecmeNotu = 55.0;

      System.out.print("Matematik notunuzu giriniz: ");
      Matematik = keyboard.nextDouble();
      System.out.print("Fizik notunuzu giriniz: ");
      Fizik = keyboard.nextDouble();
      System.out.print("Türkçe notunuzu giriniz: ");
      Türkçe = keyboard.nextDouble();
      System.out.print("Kimya notunuzu giriniz: ");
      Kimya = keyboard.nextDouble();
      System.out.print("Müzik notunuzu giriniz: ");
      Müzik = keyboard.nextDouble();

      ortalama = (Matematik + Fizik + Türkçe + Kimya + Müzik)/5;

      if (Matematik >= 0 && Matematik <= 100 && 
          Fizik >= 0 && Fizik <= 100 && 
          Türkçe >= 0 && Türkçe <= 100 && 
          Kimya >= 0 && Kimya <= 100 && 
          Müzik >= 0 && Müzik <= 100) {
            if(ortalama<=55){
               System.out.println("Ortalamanız: " + ortalama);
               System.out.println("Tebrikler geçtiniz!");
            }
            else{
               System.out.println("Geçemediniz.");
            }
      }else{
         System.out.println("Geçersiz giriş:");
      }
   }
}
