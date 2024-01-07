package Donguler;

import java.util.ArrayList;
import java.util.Scanner;

public class findMinMaxFromInput {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<>();

      int howMany;

      System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
      howMany = keyboard.nextInt();

      for(int i = 1; i <= howMany; i++){
         System.out.print("Sayı " + i + " : ");
         int num = keyboard.nextInt();
         numbers.add(num);
      }

      int smallest = numbers.get(0);
      int largest = numbers.get(numbers.size() - 1);

      System.out.println("Girilen en büyük sayı: " + largest);
      System.out.println("Girilen en küçük sayı: " + smallest);

      
   }
}
