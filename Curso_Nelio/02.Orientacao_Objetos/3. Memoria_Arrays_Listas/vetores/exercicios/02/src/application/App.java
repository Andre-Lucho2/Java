package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicao, n;
        double maior = 0.0;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número: ");
            vetor[i] = sc.nextDouble();
        }

        maior = vetor[0];
        posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Posição do maior valor digitado: " + posicao);

        sc.close();
    }
}