package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.UsaInterestService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        UsaInterestService is02 = new UsaInterestService(1.0);
        double payment02 = is02.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment02));

        sc.close();
    }
}
