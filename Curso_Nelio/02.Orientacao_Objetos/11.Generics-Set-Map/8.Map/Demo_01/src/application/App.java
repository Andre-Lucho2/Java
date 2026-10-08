package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        Map<String, String> cookies = new LinkedHashMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "999998888");

        // cookies.remove("email");
        cookies.put("phone", "999997777");// sobreescreve a chave de mesmo nome

        System.out.println(cookies.containsKey("username"));

        System.out.println("-------------------------------------");

        System.out.println("Email: " + cookies.get("email"));

        System.out.println("-------------------------------------");

        System.out.println("Endereço: " + cookies.get("address")); // retorna null

        System.out.println("-------------------------------------");

        System.out.println("Tamanho da coleção: " + cookies.size());

        System.out.println();
        System.out.println("Cookies List");
        System.out.println();
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key)); // get()--> retorna o valor da chave
        }

        // -------------------------------------------------------------------------------------------

        // Inicialização de Mapa imutável já populado:

        // 1. Map.of() (Java 9+)--> suporta até 10 pares

        Map<String, Integer> map = Map.of(
                "TV", 1,
                "Tablet", 2,
                "Notebook", 3,
                "Smartphone", 4);

        // 2.Map.ofEntries(Map.entry()...) (Java 9+) --> suporta + 10 pares

        Map<String, Integer> map2 = Map.ofEntries(
                Map.entry("TV", 1),
                Map.entry("Tablet", 2),
                Map.entry("Notebook", 3),
                Map.entry("Smartphone", 4));

        // Inicialização de Mapas mutável já populado:

        // Ex. com HashMap<>
        Map<String, Integer> map3 = new HashMap<>(Map.of("TV", 1, "Tablet", 2));
    }

}
