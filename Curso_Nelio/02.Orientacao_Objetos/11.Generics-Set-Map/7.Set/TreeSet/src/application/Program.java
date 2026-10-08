package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Product;

public class Program {

    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>(Set.of(
                new Product("TV", 900.00),
                new Product("Notebook", 3000.00),
                new Product("Tablet", 1200.00)));

        for (Product product : set) {
            System.out.println(product);
        }
    }

}
