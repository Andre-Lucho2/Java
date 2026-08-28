package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.BusinessException;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("New Account Opening:");
            System.out.print("Enter Account Number:");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter holder name:");
            String name = sc.next();
            System.out.print("Enter account's balance':");
            double balance = sc.nextDouble();
            System.out.print("Enter account's withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, name, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw:");
            acc.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f" + acc.getBalance());

        } catch (BusinessException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error" + e.getMessage());
        }

        sc.close();
    }
}