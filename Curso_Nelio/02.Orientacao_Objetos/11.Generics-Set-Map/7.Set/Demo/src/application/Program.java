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

        // Imutável --> não permite inserções ou deleções e não aceita elementos
        // repetidos nem null
        Set<String> set4 = Set.of("TV", "Tablet", "Notebook", "Smartphone");
        System.out.println(set4);

        // Mutáveis
        Set<String> set5 = new HashSet<>(List.of("TV", "Tablet", "Notebook", "Smartphone"));
        Set<String> set6 = new HashSet<>(Arrays.asList("TV", "Tablet", "Notebook", "Smartphone"));
        System.out.println(set5);

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Smartphone");

        // System.out.println(set.contains("Notebook"));
        // set.remove("TV");

        // set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p); // não mantem a ordenação - Mais rápido
        }

        // ----------------------------------------------

        set2.add("TV"); // char maiúsculo tem prioridade sobre char minúsculo
        set2.add("Tablet");
        set2.add("Notebook");

        // System.out.println(set2.contains("Notebook"));

        // for (String p : set2) {
        // System.out.println(p); // mantem a ordenação em orderm crescente
        // }

        // ----------------------------------------------

        set3.add("TV");
        set3.add("Tablet");
        set3.add("Notebook");

        // System.out.println(set3.contains("Notebook"));

        // for (String p : set3) {
        // System.out.println(p); // mantem a ordenação conforme a ordem de inserção
        // }

        /*
         * ----------------------------------------------
         * ----------------------------------------------
         */

        // Operações

        Set<Integer> a = new TreeSet<>(List.of(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União - a + b
        Set<Integer> c = new TreeSet<>(a); // c é copia de a
        c.addAll(b);
        System.out.println(c);

        // Intersecção - elems comuns em a e b
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // Diferença - elems em a que não existem em b
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }

}
