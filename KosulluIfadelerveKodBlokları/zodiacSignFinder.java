package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class zodiacSignFinder {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int month, day;

      System.out.print("Kaçıncı ayda doğdunuz?: ");
      month = keyboard.nextInt();
      System.out.print("Doğdunuz gün: ");
      day = keyboard.nextInt();

      switch(month){
         case 1:
            if(day <= 22){
               System.out.println("Oğlak burcusunuz");
            }else if(day > 22){
               System.out.println("Kova burcusunuz");
            }
            break;
         case 2:
            if(day <= 22){
               System.out.println("Kova burcusunuz");
            }else if(day > 22){
               System.out.println("Balık burcusunuz");
            }
            break;
         case 3:
            if(day <= 22){
               System.out.println("Balık burcusunuz");
            }else if(day > 22){
               System.out.println("Koç burcusunuz");
            }
            break;
         case 4:
            if(day <= 22){
               System.out.println("Koç burcusunuz");
            }else if(day > 22){
               System.out.println("Boğa burcusunuz");
            }
            break;
         case 5:
            if(day <= 22){
               System.out.println("Boğa burcusunuz");
            }else if(day > 22){
               System.out.println("İkizler burcusunuz");
            }
            break;
         case 6:
            if(day <= 22){
               System.out.println("İkizler burcusunuz");
            }else if(day > 22){
               System.out.println("Yengeç burcusunuz");
            }
            break;
         case 7:
            if(day <= 22){
               System.out.println("Yengeç burcusunuz");
            }else if(day > 22){
               System.out.println("Aslan burcusunuz");
            }
            break;
         case 8:
            if(day <= 22){
               System.out.println("Aslan burcusunuz");
            }else if(day > 22){
               System.out.println("Başak burcusunuz");
            }
            break;
         case 9:
            if(day <= 22){
               System.out.println("Başak burcusunuz");
            }else if(day > 22){
               System.out.println("Terazi burcusunuz");
            }
            break;
         case 10:
            if(day <= 22){
               System.out.println("Terazi burcusunuz");
            }else if(day > 22){
               System.out.println("Akrep burcusunuz");
            }
            break;
         case 11:
            if(day <= 22){
               System.out.println("Akrep burcusunuz");
            }else if(day > 22){
               System.out.println("Yay burcusunuz");
            }
            break;
         case 12:
            if(day <= 22){
               System.out.println("Yay burcusunuz");
            }else if(day > 22){
               System.out.println("Oğlak burcusunuz");
            }
            break;
         default:
         System.out.println("Hatalı giriş yaptınız.");
      }
   }
}
