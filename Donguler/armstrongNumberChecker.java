package Donguler;
import java.util.Scanner;
import java.lang.Math;

public class armstrongNumberChecker {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int input, count, tenfold, result=0;

      System.out.print("Enter an number: ");
      input = keyboard.nextInt();

      String inputAsString = String.valueOf(input);
      count = inputAsString.length();

      int i = 0; 
      for(i= 0; i <= count; i++){
         tenfold = (int) Math.pow(10, i );
         int digit = input / tenfold % 10;
         int poweredDigit = (int) Math.pow(digit, count);
         result += poweredDigit;
      }

      if (result == input) {
         System.out.println(input + " bir Armstrong sayısıdır.");
     } else {
         System.out.println(input + " bir Armstrong sayısı değildir.");
     }
   }
}
