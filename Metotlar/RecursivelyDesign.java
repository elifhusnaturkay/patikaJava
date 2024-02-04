package Metotlar;
import java.util.Scanner;

//NumberManipulator çözüm ama daha kısa ve öz hali

public class RecursivelyDesign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the n : "); n = input.nextInt();
        recursiveMethod(n);
        input.close();
    }

    private static void recursiveMethod(int n){
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        recursiveMethod(n-5);
        if ( n > 0) {
            System.out.print(n + " ");
        }
    }
}
