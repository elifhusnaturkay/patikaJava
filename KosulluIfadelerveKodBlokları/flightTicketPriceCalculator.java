package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class flightTicketPriceCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double km, kullaniciYasi, yolculukTipi;
      double yasIndirimi, yasIndirimOrani, tutar, kmTutar;
      tutar = 0;
      yasIndirimOrani = 0;

      System.out.print("Mesafeyi KM cinsinden giriniz: ");
      km = keyboard.nextDouble();

      System.out.print("Yaşınızı giriniz: ");
      kullaniciYasi = keyboard.nextDouble();

      System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) :");
      yolculukTipi = keyboard.nextDouble();

         if(kullaniciYasi < 0 || km <= 0 || yolculukTipi != 1 && yolculukTipi != 2){
         System.out.println("Hatalı giriş yaptınız!");
         }

      if(kullaniciYasi <= 12){
         yasIndirimOrani = 0.5;
      }else if(kullaniciYasi > 12 && kullaniciYasi <= 24){
         yasIndirimOrani = 0.10;
      }else if(kullaniciYasi > 24 && kullaniciYasi < 65){
         yasIndirimOrani = 0;
      }else{
         yasIndirimOrani = 0.3;
      }

      kmTutar = km * 0.1;
      yasIndirimi = kmTutar * yasIndirimOrani;

      if(yolculukTipi == 2){
         tutar = kmTutar - yasIndirimi;
         tutar = tutar - (tutar * 0.2);
      }else{
         tutar = kmTutar - yasIndirimi;
      }

      System.out.println("Toplam tutar: " + tutar);
   }
}
