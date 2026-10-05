package application;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();

        // Imutável:
        // Set.of == --> NÃO permite inserções ou deleções e NÃO aceita
        // elementos repetidos nem null
        Set<String> set4 = Set.of("TV", "Tablet", "Notebook", "Smartphone");
        // System.out.println(set4);

        // Mutáveis:
        // List.of() | Arrays.asList()
        Set<String> set5 = new HashSet<>(List.of("TV", "Tablet", "Notebook", "Smartphone"));
        Set<String> set6 = new HashSet<>(Arrays.asList("TV", "Tablet", "Notebook", "Smartphone"));
        // System.out.println(set5);

        set.add("TV");
        set.add("abc");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Smartphone");

        System.out.println(set.contains("Notebook"));
        // set.remove("TV");

        set.removeIf(x -> x.length() >= 4);
        // set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println("------------------------------");

        for (String string : set) {
            System.out.println(string); // não mantem a ordenação - Mais rápido
        }

        // ----------------------------------------------

        set2.add("TV"); // char maiúsculo tem prioridade sobre char minúsculo
        set2.add("Tablet");
        set2.add("Notebook");

        // System.out.println(set2.contains("Notebook"));

        System.out.println("------------------------------");

        for (String p : set2) {
            System.out.println(p); // mantem a ordenação em orderm crescente = (Notebook, TV, Tablet)
        }

        // ----------------------------------------------

        set3.add("TV");
        set3.add("Tablet");
        set3.add("Notebook");

        // System.out.println(set3.contains("Notebook"));

        System.out.println("------------------------------");

        for (String p : set3) {
            System.out.println(p); // mantem a ordenação conforme a ordem de inserção
        }

        /*
         * ----------------------------------------------
         * ----------------------------------------------
         */

        // Operações --> MODIFICAM AS LISTAS ORIGINAIS!

        Set<Integer> a = new TreeSet<>(List.of(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União - a + b
        Set<Integer> c = new TreeSet<>(a); // c é copia de a
        c.addAll(b);
        System.out.println(c); // printa TODOS os elem E REMOVE os que são identicos; ELIMINA repetições

        // Intersecção - elems comuns em a e b
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d); // printa somante os elem que SE REPETEM na intersecção dos conjuntos

        // Diferença -
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);// printa elems que pertencem EXCLUSIVAMENTE a um dos
        // conjuntos

        System.out.println(a);
        a.retainAll(b);
        System.out.println(a);
        // Os métodos MODIFICAM a Lista original!!

    }

}
