package application;

import java.util.Map;
import java.util.HashMap;

import model.entities.Product;

public class App {

    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>(Map.of(
                new Product("Tv", 2800.0), 40.0,
                new Product("PC", 3500.0), 30.00,
                new Product("Tablet", 1200.0), 100.00));

        Product p4 = new Product("Tv", 2800.0);
        System.out.println("Contains 'p4-key': " + stock.containsKey(p4));
        // sem hascode e equals --> retorna false --> comparação por ponteiros == são
        // objetos diferentes!
        // com hascode e equals --> retorna true -> comparação por conteúdo
    }

}
