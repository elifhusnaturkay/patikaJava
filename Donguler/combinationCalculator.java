package Donguler;
import java.util.Scanner;

public class combinationCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int n, r, combination, factorialN=1, factorialR=1, factorialTotal=1;

      System.out.print("What is n?: ");
      n = keyboard.nextInt();

      System.out.print("What is r?: ");
      r = keyboard.nextInt();

      for(int i = 1; i <= n; i++){factorialN *= i;}
      for(int j = 1; j <= r; j++){factorialR = factorialR * j;}
      int k= n-r;
      for(int a = 1; a <= k; a++){factorialTotal *= a;}

      combination = factorialN / (factorialR*factorialTotal);

      System.out.println("C(" + n + ", " + r + ") = " + combination);
   }
}
