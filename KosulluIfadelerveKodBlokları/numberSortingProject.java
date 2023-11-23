package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class numberSortingProject {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int num1, num2, num3, max, mid, min;

      max = 0;
      mid = 0;
      min = 0;

      System.out.println("Sayıları giriniz.");
      System.out.print("1.sayıyı giriniz: ");
      num1 = keyboard.nextInt();
      System.out.print("2.sayıyı giriniz: ");
      num2 = keyboard.nextInt();
      System.out.print("3.sayıyı giriniz: ");
      num3 = keyboard.nextInt();

      if(num1 > num2 && num1 > num3){
         max = num1;
         if(num2 > num3){
            mid = num2;
            min = num3;
         }
         else{
            mid = num3;
            min = num2;
         }
      }
      else if(num1 < num2){
         if(num2 > num3){
            max = num2;
            mid = (num1 > num3) ? num1 : num3 ;
            min = (num1 > num3) ? num3 : num1 ;
         }else {
            max = num3;
            mid = num2;
            min = num1;
         }
      }
      else if(num1 == num2){
         if(num1 > num3){
            max = mid = num1;
            min = num3;
         }else if (num1 < num3){
            max = num3;
            mid = min = num1;
         }else{
            min = num1;
            max = min;
         }
      }

      if (max == mid && mid == min) {
         System.out.println(max + "=" + mid + "=" + min);
      } else if (max == mid) {
         System.out.println(max + "=" + mid + ">" + min);
      } else if (mid == min) {
         System.out.println(max + ">" + mid + "=" + min);
      } else {
         System.out.println(max + ">" + mid + ">" + min);
      }
   }
}
