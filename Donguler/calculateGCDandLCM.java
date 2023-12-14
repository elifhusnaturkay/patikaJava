package Donguler;

import java.util.Scanner;

public class calculateGCDandLCM {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, ebob=0, ekok;
      boolean isSame = true;

      System.out.print("Please enter first number : ");
      num1 = keyboard.nextInt();

      System.out.print("Please enter second number : ");
      num2 = keyboard.nextInt();

      
      for(int i = 1; i <= num1 && i <= num2; i++){
         if(num1%i == 0 && num2%i == 0){
            ebob = i;
         }
      }
      
      System.out.println("EBOB: " + ebob);
      
      ekok = (num1*num2)/ebob;
      System.out.println("EKOK: " + ekok);
   }
}
