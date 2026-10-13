package application;

import java.util.Scanner;

import model.services.PrintService;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Entrar com qtos valores? ");
        int valores = sc.nextInt();

        // Já acusa erro de classe diferentes (TYPE SAFETY)--> String x Integer da
        // instanciação do
        // PrintService<Integer> acima
        // ps.addValue("Maria");

        for (int i = 0; i < valores; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first(); // Não há necessidade do Casting aqui == TYPE SAFETY acima PrintService<Integer>
        System.out.println("First: " + x);

        sc.close();
    }
}