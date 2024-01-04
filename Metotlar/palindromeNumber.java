package Metotlar;

import java.util.Scanner;

public class palindromeNumber {

   static boolean isPolindrome(int number){
      Scanner keyboard = new Scanner(System.in);

      System.out.print("enter a number: ");
      number = keyboard.nextInt();

      int temp = number, reverseNum = 0, lastNum;

      while(temp != 0){
         lastNum = temp % 10;
         reverseNum = reverseNum*10 + lastNum;
         temp = temp/10;
      }

      if(number == reverseNum){
         System.out.println("this number a polindrome!");
         return true;
      }
      else 
         System.out.println("system is shutting down");
         return false;
    
   }

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      isPolindrome(0);
   }
}
