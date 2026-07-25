package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar em cada vetor? ");
        int n = sc.nextInt();
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] vetorResult = new int[n];

        System.out.println("Digite os números para o primeiro vetor: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o número: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os números para o segundo vetor: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite o número: ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            vetorResult[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor Resultante: ");
        for (int j : vetorResult) {
            System.out.printf("%d, ", j);
        }

        sc.close();
    }
}