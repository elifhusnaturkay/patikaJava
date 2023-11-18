import java.util.Scanner;

public class triangleArea {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   double kenar1, kenar2, kenar3, u, ucgenAlan, ucgenCevre;
   System.out.println("Üçgeniniz için 3 kenar değerlerini giriniz:");

   kenar1 = keyboard.nextDouble();
   kenar2 = keyboard.nextDouble();
   kenar3 = keyboard.nextDouble();

   u = (kenar1 + kenar2 + kenar3);
   ucgenCevre = 2 * (kenar1 + kenar2 + kenar3);
   ucgenAlan = (u*(u-kenar1)*(u-kenar2)*(u-kenar3));
   ucgenAlan = ucgenAlan * ucgenAlan;

   System.out.println("Üçgeninizin çevresi: " + ucgenCevre);
   System.out.println("Üçgeninizin alanı: " + ucgenAlan);
   }
}
