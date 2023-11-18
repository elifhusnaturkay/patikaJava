package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class calculateKDV {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);

   System.out.println("Ürün tutarını giriniz:");
   double urunFiyat = keyboard.nextInt();

   double urunKDVOrani;
      if(urunFiyat>=1000){
      urunKDVOrani = urunFiyat * 0.08 ;
      }else{
      urunKDVOrani = urunFiyat * 0.18;
      }
   
   System.out.println("Ürünün KDV ücreti: " + urunKDVOrani);

   double urunKDVFiyat = urunFiyat + urunKDVOrani;
   System.out.println("Ürünün KDV dahil fiyatı: " + urunKDVFiyat);
   }
}
