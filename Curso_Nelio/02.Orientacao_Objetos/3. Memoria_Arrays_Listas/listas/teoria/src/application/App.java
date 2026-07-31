package application;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Integer> list = new ArrayList<>();
        // Classe ArrayList implementando a interface List

        List<String> list2 = new ArrayList<>();

        list.add(10);
        list.add(32);
        list.add(55);
        list.add(64);

        // sobrecarga do método .add:
        list.add(2, 44);

        list.remove(3);

        list2.add("Andre");
        list2.add("Daniel");
        list2.add("Maria");
        list2.add("Marcos");
        list2.add("Joao");

        list2.remove("Daniel");
        // Aqui, tenho primeiro uma comparação de instâncias para depois fazer a
        // remoção(não estou fornecendo
        // index)

        System.out.println("Tamanho da lista: " + list.size());

        for (Integer numero : list) {
            System.out.println(numero);
        }
        System.out.println("Tamanho da lista: " + list2.size());

        for (String nome : list2) {
            System.out.println(nome);
        }

        // list.get(index); --> apontar para a posição na lista

        System.out.println("------------------------------");

        // list2.removeIf(x -> x.charAt(0) == 'M');

        for (String nome : list2) {
            System.out.println(nome);
        }

        System.out.println("------------------------------");

        System.out.println(list2.indexOf("Joao"));
        System.out.println(list2.indexOf("Maria")); // -1 == false

        System.out.println("------------------------------");

        // Método Filter em Java:
        // ------------------------

        // 1.
        // converte para stream --> aplica o lambda --> retorna para o tipo List<String>
        List<String> filtered = list2.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        List<Integer> lista01 = list.stream().reduce(null)
        for (String x : filtered) {
            System.out.println(x);
        }

        // 2.
        // converte para stream --> aplica o lambda --> retorna o primeiro argumento do
        // predicado --> senão, retorna null
        String name = list2.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name); // Maria

    }

}
