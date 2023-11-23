/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class temperatureActivitySuggestion {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double derece;

      System.out.print("Bugün hava kaç derece? : ");
      derece = keyboard.nextDouble();

      if(derece<=5){
         System.out.println("Bugün kayak yapabilirsiniz");
      }else if(5<derece && derece<=15){
         System.out.println("Bugün sinemaya gidebilirisiniz.");
      }else if(15<derece && derece<=25){
         System.out.println("Bugün pikniğe gidebilirisiniz.");
      }else if(25<derece){
         System.out.println("Bugün yüzmeye gidebilirisiniz.");
      }
   }
}
