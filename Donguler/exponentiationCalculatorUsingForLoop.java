/*
 * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

package Donguler;
import java.util.Scanner;

public class exponentiationCalculatorUsingForLoop {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double input1, input2, result=1;

      System.out.print("Please enter a number: ");
      input1 = keyboard.nextInt();
      System.out.print("Please enter the exponent: ");
      input2 = keyboard.nextInt();

      //input1^input2 = 
      for(int i = 1; i <= input2; i++){
         result = result * input1;
      }

      System.out.println("Result is " + result);
   }
}
