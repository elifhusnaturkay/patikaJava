package Donguler;
import java.util.Scanner;

public class divisible34AverageCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int enteredNum, sum, count, average, i;
      sum = 0;
      count = 0;

      System.out.print("Please enter a number: ");
      enteredNum = keyboard.nextInt();

      for(i = 1; i <= enteredNum; i++){
         if(i%3 == 0 && i%4 == 0){
            System.out.print(i + ", ");
            sum = sum + i;
            count++;
         }
      }
      
      average = sum / count;
      System.out.println("\n" + "Average is " + average);
      
   }
}
