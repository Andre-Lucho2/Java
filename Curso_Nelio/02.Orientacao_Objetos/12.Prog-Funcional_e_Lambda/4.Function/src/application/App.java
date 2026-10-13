package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Product;
import model.utils.UpperCaseName;

public class App {

        public static void main(String[] args) {
                List<Product> list = new ArrayList<>(
                                Arrays.asList(new Product("Tv", 900.00),
                                                new Product("Mouse", 50.00),
                                                new Product("Tablet", 350.50),
                                                new Product("HD Case", 80.90)));

                // 1.
                List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
                // names.forEach(System.out::println);

                // 2.

                List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
                // names2.forEach(System.out::println);

                // 3.
                List<String> names3 = list
                                .stream()
                                .map(Product::UpperCaseName)
                                .collect(Collectors.toList());

                // names3.forEach(System.out::println);

                // 4.
                Function<Product, String> func = p -> p.getName().toUpperCase();
                List<String> names4 = list
                                .stream()
                                .map(func)
                                .collect(Collectors.toList());

                // names4.forEach(System.out::println);

                // 5.
                List<String> names5 = list
                                .stream()
                                .map(p -> p.getName().toUpperCase())
                                .collect(Collectors.toList());

                names5.forEach(System.out::println);

        }
}
