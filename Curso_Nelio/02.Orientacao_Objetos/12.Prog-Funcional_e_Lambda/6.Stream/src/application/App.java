package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class App {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(List.of(
                new Product("Tv", 900.00),
                new Product("Mouse", 50.00),
                new Product("Tablet", 350.50),
                new Product("HD Case", 80.90)));

        ProductService ps = new ProductService();

        // double sum = ps.filteredSum(list);
        // System.out.println("Sum = " + String.format("%.2f", sum));

        double sum2 = ps.filteredSum2(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum2));

        double sum3 = ps.filteredSum2(list, p -> p.getPrice() < 100.00);
        System.out.println("Sum = " + String.format("%.2f", sum3));

    }
}
