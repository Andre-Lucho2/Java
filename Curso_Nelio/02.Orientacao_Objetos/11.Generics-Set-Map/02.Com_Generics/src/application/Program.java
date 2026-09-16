package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Entrar com qtos valores? ");
        int n = sc.nextInt();

        // Com Type Safety --> Só permite rodar o método com o Type especificado!
        ps.addValue(10);

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}