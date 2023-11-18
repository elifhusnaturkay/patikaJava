package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class taxiMeter {
   public static void main(String[]args){
      Scanner keyboard = new Scanner(System.in);
      double gidilenKM, toplamKmDegeri, tutar, taksiAcilisUcreti;

      taksiAcilisUcreti = 10.0;
      System.out.print("Gidilen KM\'yi giriniz: ");
      gidilenKM = keyboard.nextDouble();
      toplamKmDegeri = (gidilenKM * 2.20) +taksiAcilisUcreti;

      if(toplamKmDegeri <= 20){
         tutar = 20;
      }else{
         tutar = toplamKmDegeri;
      }

      System.out.println("Ödemeniz gereken tutar: " + tutar);
   }
}
