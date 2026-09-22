package application;

import java.util.Scanner;

import model.services.PrintService;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("Entrar com qtos valores? ");
        int n = sc.nextInt();

        // Posso add qquer tipo que quiser aqui!! SEM TYPE SAFETY
        // List tipo Object
        // Porém, no runtime tenho erro de ClassCastException --> 2 tipos de Types
        // String + Integer em List<Object>
        ps.addValue("Maria");

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        /*
         * Abaixo:
         * Estou guardando a o retorno de ps.first() em uma variável
         * Como ele é do tipo Object:
         * Object --> Integer ou String == Ok, é um UpCasting
         * Problema de Performance
         */

        Integer x = (Integer) ps.first();

        System.out.println("First: " + ps.first());

        sc.close();
    }
}