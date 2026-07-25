package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos a incluir: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n]; // **

        System.out.println("Digite os dados do produto: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o seu nome: ");
            String nome = sc.next();

            System.out.println("Digite o seu preco: ");
            double preco = sc.nextDouble();

            vect[i] = new Product(nome, preco);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco();
        }

        double avg = sum / vect.length;
        System.out.println(avg);

        sc.close();

    }
}

// **
// IMPORTANTE:
// Aqui o objeto "vect" foi instanciado(memória Stack), apontando
// para n posições "null" (Heap);
// Os objetos "Product" AINDA não foram instanciados. É
// necessário instanciar para cada posição do vetor(vect[i] = new Product(...))
// novos objetos tipo "Product"
