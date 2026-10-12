package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Product;
import model.utils.MyComparator;

public class App {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(List.of(
                new Product("TV", 3000.0),
                new Product("Notebook", 2200.00),
                new Product("Tablet", 1450.00)));

        /*
         * 1)
         * Com a class MyComparator() implementado a interface funcional
         * Comparator<T>
         * --------------------------------------------------------------------------
         * Crio um classe distinta para colocar a logica da comparação e não precisar
         * alterar a entidade Product
         * 
         * interface funcional --> tem apenas 1 método abstrato, alem de outros
         * metodos static e default
         */

        // list.sort(new MyComparator());
        //
        /*
         * list.sort(new MyComparator()) --> o 'obj instanciado aqui' 'MyComparator' não
         * tem um construtor!... o que list.sort() está recebendo como argumento é o
         * resultado do método compare() ---> é o mesmo que passar a expresão Lambda
         * (item 4)
         * 
         * Interface funcional em Java tem mapeamento direto com as expressões lambda
         * Expressão lamba é tratada como interface
         * 
         */

        /*
         * 2)
         * com Classe Anônima - implementada diretamente na classe App:
         * -------------------------------------------------------------
         */

        // Comparator<Product> comp = new Comparator<Product>() {

        // @Override
        // public int compare(Product p1, Product p2) {
        // return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // }
        // };

        // list.sort(comp);

        /*
         * 3)
         * com Função anônima ou Arrow function(mesmo JS)-
         * expressão Lambda
         * --------------------------------------------------------
         * 
         * // Inferência de Tipos automática *
         * 
         */

        // Comparator<Product> comp = (p1, p2) ->
        // p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        // list.sort(comp);

        // ou

        // 4.
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}