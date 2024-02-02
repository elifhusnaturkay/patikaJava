package Metotlar;
import java.util.Scanner;

public class recursivePrimeChecker {
   public static Scanner keyboard = new Scanner(System.in);
   public static void main(String[] args){
      System.out.println(isPrimeNumber());
    }

    public static boolean isPrimeNumber(){
        System.out.print("Asal sayı kontrolü için sayı giriniz: ");
        int number = keyboard.nextInt();

        boolean isPrime = true;
      
        if (number <= 1) {
         isPrime = false;
        } else {
         for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
         }
        }

        if (isPrime) { 
            System.out.println("Sayı asaldır.");
        } else {
         System.out.println("Sayı asal değildir.");
     }

      return isPrime;
   }
}
