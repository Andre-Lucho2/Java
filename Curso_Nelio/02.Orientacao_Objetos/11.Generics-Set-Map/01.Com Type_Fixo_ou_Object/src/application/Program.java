package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("Entrar com qtos valores? ");
        int n = sc.nextInt();

        // Com Tipo: Objetc como Generic de List<Objetc>--> Permite add esse método aqui
        // --> Sem Type
        // Safety
        ps.addValue("Carlos"); // String

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        // De Object --> Integer ou String == Ok, é um UpCasting
        // De String --> Integer == NÃO ! Tipos diferentes e SEM herança
        Integer x = (Integer) ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}