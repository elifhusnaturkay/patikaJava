package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class gradePointAverage {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);

   System.out.println("Matematik ders notu:");
   int Matematik = keyboard.nextInt();
   System.out.println("Fizik ders notu:");
   int Fizik = keyboard.nextInt();
   System.out.println("Kimya ders notu:");
   int Kimya = keyboard.nextInt();
   System.out.println("Türkçe ders notu:");
   int Turkce = keyboard.nextInt();
   System.out.println("Tarih ders notu:");
   int Tarih = keyboard.nextInt();
   System.out.println("Müzik ders notu:");
   int Muzik = keyboard.nextInt();
   int not= 60;

   double Ortalama = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik)/6;
      System.out.println("Ortalamanız: " + Ortalama);
   String durum = (Ortalama <= not) ? "Geçemedi": "Geçti, tebrikler!";
      System.out.println(durum);
  }
}
