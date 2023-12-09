package Donguler;
import java.util.Scanner;

public class powerFourFive {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int input;
      System.out.print("Please enter a number: ");
      input = keyboard.nextInt();

      for (int i = 0; i <= input; i++) {
          int powerFour = (int) Math.pow(4, i);
          int powerFive = (int) Math.pow(5, i);
          
          System.out.println("4^" + i + " = " + powerFour);
          System.out.println("5^" + i + " = " + powerFive);
      }
   }
}
