package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, qtpares;
        List<Integer> pares = new ArrayList<>();

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i : vetor) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }

        System.out.println("Numeros Pares: ");
        for (int k : pares) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pares: " + pares.size());
        // ou

        // qtpares = 0;
        // for (int i=0; i<n; i++) {
        // if (vetor[i] % 2 == 0) {
        // System.out.printf("%d ", vetor[i]);
        // qtpares++;
        // }
        // }

        // System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtpares);

        sc.close();
    }
}