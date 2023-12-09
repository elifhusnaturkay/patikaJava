package Donguler;
import java.util.Scanner;

public class evenMultipleSum {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int num, sum=0;
      boolean isNumberEven = true;
      
      while(isNumberEven){
         System.out.print("Please enter a number: ");
         num = keyboard.nextInt();

         if(num%2 == 0 && num%4 == 0){
            sum = sum + num;
         }else if (num%2 == 0){}else{
            isNumberEven = false;
            System.out.println("System shut down..");
            continue;
         }
      }

      System.out.println("Last result: " + sum);
   }
}
