package application;

import model.entities.Client;

public class App {

    public static void main(String[] args) {
        Client c1 = new Client("Andre", "andre@gmail.com");
        Client c2 = new Client("Alex", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

        Client c3 = new Client("Alex", "alex@gmail.com");
        Client c4 = new Client("Alex", "alex@gmail.com");

        // System.out.println(c3.equals(c4)); // true

        String s1 = "teste";
        String s2 = "teste";
        String s3 = new String("teste");
        String s4 = new String("teste");

        // System.out.println(c3 == c4); // false
        // O compilador lê as referências de memória das classes que são diferentes

        // System.out.println(s1 == s2); // true
        // O compilador lê os valores literais são e não como referências de memórias

        // System.out.println(s3 == s4); // false
        // referências de memória diferentes

        System.out.println(s3.equals(s4)); // true
    }

}
