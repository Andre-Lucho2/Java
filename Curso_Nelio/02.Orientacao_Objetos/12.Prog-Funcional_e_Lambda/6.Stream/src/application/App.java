package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 2, 3, 4, 5, 7, 10, 14, 20, 24, 35, 50, 67, 73);

        // A)
        Stream<Integer> st1 = list.stream();
        // System.out.println(Arrays.toString(st1.toArray()));
        // toArray() --> operação terminal : transforma a stream em uma array
        // Arrays.toString(transforma o endereço de memoria em String)

        Stream<Integer> st2 = list.stream().map(x -> x + 5); // map() --> operação intermediária
        // System.out.println(Arrays.toString(st2.toArray()));

        Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
        // System.out.println(Arrays.toString(st3.toArray()));

        // B)
        Stream<Integer> st4 = Stream.iterate(10, x -> x + 2);
        // System.out.println(Arrays.toString(st4.limit(10).toArray()));

        Stream<Long> st5 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        // System.out.println(Arrays.toString(st5.toArray()));

        // --------------------------------------------------------------------------------------------------------------

        // C) Pipelines

        Stream<Integer> st6 = list.parallelStream().map(x -> x * 2);
        // System.out.println(Arrays.toString(st6.toArray()));

        // somatório
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        // System.out.println("Soma = " + sum);

        List<Integer> newList = list.parallelStream()
                .filter(x -> x % 2 == 0)
                .map(x -> x + 1)
                .collect(Collectors.toList());
        System.out.println(newList); // já retorna uma ArrayList

    }
}
