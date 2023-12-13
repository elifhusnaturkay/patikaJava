package Donguler;

import java.util.Scanner;

public class harmonicSeriesCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double input, result=0, result2=0;

      System.out.print("Please enter a number: ");
      input = keyboard.nextInt();

      for(double i = 1; i <= input; i++){
         result = 1/i;
         result2 += result;
      }

      System.out.println("Harmonic series is " + result2);
   }
   
}
