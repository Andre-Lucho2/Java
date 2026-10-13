package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

    public double filteredSum(List<Product> list) {
        double sum = 0.0;
        for (Product p : list) {
            if (p.getName().charAt(0) == 'T') { // predicado --> return true / false
                sum += p.getPrice();
            }
        }
        return sum;
    }

    public double filteredSum2(List<Product> list, Predicate<Product> crit) {
        double sum = 0.0;
        for (Product p : list) {
            if (crit.test(p)) { // predicado --> .test() -> metodo que vem da interface func Predicate<>
                sum += p.getPrice();
            }
        }
        return sum;
    }

}