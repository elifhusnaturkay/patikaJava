package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class passwordReset {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String userName, password;

      System.out.print("Kullanıcı adınızı giriniz:");
      userName = keyboard.nextLine();

      System.out.print("Şifrenizi giriniz:");
      password = keyboard.nextLine();

      if (userName.equals("Patika.dev") && password.equals("Patika.dev")) {
         System.out.println("Giriş başarılı!");
      }
      else{
         System.out.println("Giriş bilgileriniz yanlıştır. Tekrar deneyiniz.");
      }
   }
}
