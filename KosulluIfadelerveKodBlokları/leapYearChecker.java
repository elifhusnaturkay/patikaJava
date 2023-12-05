package KosulluIfadelerveKodBlokları;
import java.util.Scanner;

public class leapYearChecker {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int year, isItLeapYear;

      System.out.print("Yıl giriniz: ");
      year = keyboard.nextInt();

      isItLeapYear = year % 4;

      if(isItLeapYear != 0){
         System.out.println(year + " bir artık yıldır!");
      }else{
         System.out.println(year + " bir artık yıl değildir.");
      }
   }
}
