package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Product;
import model.utils.PriceUpdate;

public class App {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.2;
        Consumer<Product> cons = x -> x.setPrice(x.getPrice() * 1.1);
        Consumer<Product> cons2 = x -> x.setPrice(x.getPrice() * factor);

        // 1.
        // list.forEach(new PriceUpdate());

        // 2.
        // list.forEach(Product::staticProductUpdate);

        // 3.
        // list.forEach(Product::ProductUpdate);

        // 4.
        // list.forEach(cons);
        // list.forEach(cons2);

        // 5.
        list.forEach(x -> x.setPrice(x.getPrice() * factor));
        list.forEach(System.out::println);

    }
}
