package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
import util.Calculator;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();
        // Instanciando a própria classe

        // OBS.:
        // Calculator calc = new Calculator();
        // ----------------------------------------------------
        // Na classe Calculator, eu poderia tirar os membros estáticos e instanciar a
        // classe aqui;
        // porém, sempre teria o mesmo resultado --> nunca terei 2 ou + objetos
        // diferentes a partir da classe, pois PI é sempre o mesmo valor --> a classe
        // não recebe características diferentes;
        // Então, eu crio membros estáticos

        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        x.triangleArea();

        System.out.print(x);

        // --------------------------------------------

        // Classe estática:

        double radius = sc.nextDouble();
        double circunf = Calculator.circumference(radius);
        double vol = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circunf);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}
