package application;

import entities.*;

public class App {
    public static void main(String[] args) {

        Pensionato pensionato = new Pensionato();

        // Testes

        System.out.println(pensionato.totalDeVagasDisponiveis());

        pensionato.registrarAluguel();

        System.out.println(pensionato.totalDeVagasDisponiveis());

        pensionato.registrarAluguelPorQuarto();

        System.out.println(pensionato);

    }
}