package Donguler;
import java.util.Scanner;

public class starDiamondPattern  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini giriniz (tek sayı): ");
        int yukseklik = scanner.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek sayı giriniz.");
            return;
        }

        int yarimYukseklik = (yukseklik + 1) / 2;

        // Üst kısmı çizen döngüler
        for (int i = 1; i <= yarimYukseklik; i++) {
            for (int j = 1; j <= yarimYukseklik - i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }

        // Alt kısmı çizen döngüler
        for (int i = yarimYukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yarimYukseklik - i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
