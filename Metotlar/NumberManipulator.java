package Metotlar;

import java.util.Scanner;

public class NumberManipulator {
   public static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.print("Sayı giriniz: ");
      int num = keyboard.nextInt();

      System.out.println(loops(num));
      loops2(num);
   }

   public static int loops(int number1){
      for (int i = number1; i >= (number1 * (-1)); i -= 5) {
         System.out.print(i + " ");
      }
      return number1;
   }

   public static void loops2(int number1) {
		System.out.print(number1 + " "); 
        if (number1 <= 0) {
            System.out.print(number1 +  " ");
            return;
        }

        loops2(number1 - 5);
        System.out.print(number1 + " ");
	}
}
