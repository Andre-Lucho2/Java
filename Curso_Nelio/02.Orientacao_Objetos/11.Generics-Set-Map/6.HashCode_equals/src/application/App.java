package application;

import model.entities.Client;

public class App {

    public static void main(String[] args) {
        Client c1 = new Client("Andre", "andre@gmail.com");
        Client c2 = new Client("Alex", "maria@gmail.com");

        Client c3 = new Client("Alex", "maria@gmail.com");
        Client c4 = new Client("Alex", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

        System.out.println(c3 == c4); // false
        // têm referências de memória diferentes

    }

}
