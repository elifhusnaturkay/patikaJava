package Donguler;

import java.util.Scanner;

public class atmOperationsWithSwitch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int right = 3;
        String userName, password;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Enter your username: ");
            userName = keyboard.nextLine();
            System.out.print("Enter your password: ");
            password = keyboard.nextLine();

            if (userName.equals("elifhusnaturkay") && password.equals("131022")) {
                System.out.println("Login successful!");

                int select;
                do {
                    System.out.println(" \n" +
                           "1-Deposit\n" +
                            "2-Withdraw Money\n" +
                            "3-Inquire Balance\n" +
                            "4-Log Out");
                    System.out.print("Please select the action you want to perform: ");
                    select = keyboard.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Amount of money you want to deposit: ");
                            int price = keyboard.nextInt();
                            balance += price;
                            System.out.println("The transaction was completed successfully.");
                            break;

                        case 2:
                            System.out.print("Amount of money you wish to withdraw: ");
                            int price2 = keyboard.nextInt();
                            if (price2 > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price2;
                            }
                            System.out.println("The transaction was completed successfully.");
                            break;

                        case 3:
                            System.out.println("Your balance is " + balance);
                            break;

                        case 4:
                            System.out.println("See you later again!");
                            break;

                        default:
                            System.out.println("Invalid option. Please select a valid action.");
                            break;
                    }
                } while (select != 4);
                break; // While döngüsünden çık
            } else {
                right--;
                if (right > 0) {
                    System.out.println("Login failed. Try again. Remaining attempts: " + right);
                } else {
                    System.out.println("You have entered incorrectly too many times. Your account has been blocked. Please contact your bank.");
                }
            }
        }
    }
}
