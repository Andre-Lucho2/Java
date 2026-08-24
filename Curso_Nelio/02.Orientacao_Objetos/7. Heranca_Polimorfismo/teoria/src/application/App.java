package application;

import java.util.List;
import java.util.ArrayList;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        // HERANÇA
        // --------------

        // Account account = new Account(102, "ElLoko", 2000.00);
        // Classe abstrata

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

        /*
         * não estamos instanciando um novo Objeto em acc4 (observar que não temos
         * "new") --> ele aponta para o mesmo
         * endereço de memória de acc2
         * 
         * acc2 e acc4 são apenas ponteiros na memória Stack apontando para a mesma
         * instância no Heap. Alterar o estado do objeto por uma variável reflete
         * imediatamente na outra.
         * 
         * Casting forçado - Account --> BusinessAcount
         * // acc2.loan(1000); método inexistente em acc2
         * 
         */

        // BusinessAccount acc5 = (BusinessAccount) acc3; // SavingsAccount -->
        // BusinessAcount
        // erro na execução --> ClassCastException

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc6 = (BusinessAccount) acc3;
            acc6.loan(2000);
            // System.out.println("Loan Ok!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc6 = (SavingsAccount) acc3;
            acc6.updateBalance();
            // System.out.println("Update Ok!");
        }

        // System.out.println(acc2);
        // System.out.println(acc2.getBalance());
        // Como acc2 e acc4 apontam para essa mesma área de memória, o atributo
        // "balance" desse objeto (acc2) foi modificado de 0.0 para 990.0

        // POLIMORFISMO
        // --------------

        Account accx = new Account(1020, "Alex", 1000.0);
        Account accy = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        accx.withdraw(50.0);
        accy.withdraw(50.0);

        // System.out.println(accx.getBalance()); // 945.00
        // System.out.println(accy.getBalance()); // 950.00

        /*
         * Obs:
         * A associação do tipo específico com o tipo genérico é feita em tempo de
         * execução (upcasting) --> O compilador não sabe para qual tipo específico a
         * chamada do método .withdraw() está sendo feita (ele só sabe que são duas
         * variáveis tipo Account):
         */

        // CLASSE ABSTRATA
        // --------------

        // Account acount01 = new Account02(1001, "Alex", 1000.0); // erro compilacao ==
        // classe abstrata
        Account acount02 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acount03 = new BusinessAccount(1003, "Maria", 1000.0, 500.00);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(01, "Alex", 15000.00, 0.01));
        list.add(new BusinessAccount(02, "Alex", 150000.00, 50000.00));
        list.add(new SavingsAccount(03, "Bob", 1000.00, 0.01));
        list.add(new BusinessAccount(04, "Anna", 100000.00, 30000.00));

        double somaSavings = 0.0;
        for (Account account : list) {
            if (account instanceof SavingsAccount) {
                somaSavings += account.getBalance();
            }
        }

        double somaBusiness = 0.0;
        for (Account account : list) {
            if (account instanceof BusinessAccount) {
                somaBusiness += account.getBalance();
            }
        }
        System.out.printf("Saldo Total: %.2f%n", somaSavings);
        System.out.printf("Saldo Total: %.2f%n", somaBusiness);

        for (Account account : list) {
            account.deposit(100.00);
        }

        for (Account account : list) {
            System.out.printf("Conta: %d Saldo Total: %.2f%n", account.getNumber(), account.getBalance());
        }

    }
}