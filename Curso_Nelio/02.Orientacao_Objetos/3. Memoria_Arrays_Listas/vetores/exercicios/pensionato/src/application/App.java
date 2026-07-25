package application;

import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pensionato pensionato = new Pensionato();
        pensionato.toString();

        sc.close();
    }
}