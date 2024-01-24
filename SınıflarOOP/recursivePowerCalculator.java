package SınıflarOOP;

import java.util.Scanner;

public class recursivePowerCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Taban değeri giriniz: ");
      int base = keyboard.nextInt();

      System.out.print("Üs değeri giriniz: ");
      int exponent = keyboard.nextInt();

      int result = power(base, exponent);
      System.out.println("Sonuç: " + result);   
   } 

   static int power(int base, int exponent){
      int i = 0;
      int result = 1;
      for(i = 1; i <= exponent; i++) {
          result *= base;
      }
      return result;
   }
   
}
