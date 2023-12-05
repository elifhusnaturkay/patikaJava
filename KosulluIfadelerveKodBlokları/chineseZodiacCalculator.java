/*
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun | Doğum Tarihi %12 = 1 ➜ Horoz | Doğum Tarihi %12 = 2 ➜ Köpek | Doğum Tarihi %12 = 3 ➜ Domuz | Doğum Tarihi %12 = 4 ➜ Fare | Doğum Tarihi %12 = 5 ➜ Öküz 
Doğum Tarihi %12 = 6 ➜ Kaplan |Doğum Tarihi %12 = 7 ➜ Tavşan | Doğum Tarihi %12 = 8 ➜ Ejderha | Doğum Tarihi %12 = 9 ➜ Yılan | Doğum Tarihi %12 = 10 ➜ At | Doğum Tarihi %12 = 11 ➜ Koyun
*/

package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class chineseZodiacCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int dogumYili, kalanHesabi;

      System.out.print("Doğum yılınızı giriniz: ");
      dogumYili = keyboard.nextInt();

      kalanHesabi = dogumYili % 12;

      switch (kalanHesabi) {
         case 0:
             System.out.println("Çin Zodyağı burcunuz Maymun!");
             break;
         case 1:
             System.out.println("Çin Zodyağı burcunuz Horoz!");
             break;
         case 2:
             System.out.println("Çin Zodyağı burcunuz Köpek!");
             break;
         case 3:
             System.out.println("Çin Zodyağı burcunuz Domuz!");
             break;
         case 4:
             System.out.println("Çin Zodyağı burcunuz Fare!");
             break;
         case 5:
             System.out.println("Çin Zodyağı burcunuz Öküz!");
             break;
         case 6:
             System.out.println("Çin Zodyağı burcunuz Kaplan!");
             break;
         case 7:
             System.out.println("Çin Zodyağı burcunuz Tavşan!");
             break;
         case 8:
             System.out.println("Çin Zodyağı burcunuz Ejderha!");
             break;
         case 9:
             System.out.println("Çin Zodyağı burcunuz Yılan!");
             break;
         case 10:
             System.out.println("Çin Zodyağı burcunuz At!");
             break;
         case 11:
             System.out.println("Çin Zodyağı burcunuz Koyun!");
             break;
         default:
             System.out.println("Hatalı giriş yaptınız!");
     }
   }
}
