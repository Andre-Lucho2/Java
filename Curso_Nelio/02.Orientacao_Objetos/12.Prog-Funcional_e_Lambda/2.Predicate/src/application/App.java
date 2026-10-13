package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;
import model.utils.ProductPredicate;

public class App {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(List.of(
                new Product("Tv", 900.00),
                new Product("Mouse", 50.00),
                new Product("Tablet", 350.50),
                new Product("HD Case", 80.90)));

        double min = 50.00;

        Predicate<Product> pred = x -> x.getPrice() <= 100.00;
        Predicate<Product> pred2 = x -> x.getPrice() <= min;

        // 1.Com implementação da interface Predicate
        // -----------------------------------------
        // list.removeIf(new ProductPredicate());

        // 2.Reference method com método estático
        // -----------------------------------------
        // list.removeIf(Product::staticProductPredicate);

        // 3.Reference method com método Não estático
        // -----------------------------------------
        // list.removeIf(Product::nonStaticProductPredicate);

        // 4.Expressão lambda declarada
        // -----------------------------------------
        // list.removeIf(pred);
        list.removeIf(pred2);

        // 5.Expressão Lambda inline
        // ------------------------
        // list.removeIf(x -> x.getPrice() <= 100);
        // list.removeIf(x -> x.getPrice() <= min);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
