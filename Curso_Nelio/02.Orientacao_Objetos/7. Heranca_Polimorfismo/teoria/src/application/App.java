package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account account = new Account(102, "ElLoko", 2000.00);

        BusinessAccount bAccount = new BusinessAccount(103, "ElLoko", 0.0, 10000.00);

        // bAccount.withdraw(1000);

        // UPCASTING

        Account acc1 = bAccount; // bAccount é uma account(Account)
        acc1.getBalance();

        Account acc2 = new BusinessAccount(104, "ElNinho", 0.0, 1000.00);

        Account acc3 = new SavingsAccount(105, "LaNinha", 0.0, 0.10);

        // DOWNCASTING

        // acc2.loan(1000); método inexistente em acc2
        BusinessAccount acc4 = (BusinessAccount) acc2; // Casting forçado
        acc4.loan(1000);

        // BusinessAccount acc5 = (BusinessAccount) acc3; // SavingsAccount -->
        // BusinessAcount
        // erro na execução --> ClassCastException

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc6 = (BusinessAccount) acc3;
            acc6.loan(2000);
            System.out.println("Loan Ok!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc6 = (SavingsAccount) acc3;
            acc6.updateBalance();
            System.out.println("Update Ok!");
        }

        System.out.println(acc2);
        System.out.println(acc2.getBalance());

    }
}
