package entities;

import java.util.Arrays;
import java.util.Scanner;

public class Pensionato {
    Scanner sc = new Scanner(System.in);

    private Quarto quarto;
    private Quarto[] quartos;

    public Pensionato() {
        quartos = new Quarto[10];
        for (int i = 0; i < quartos.length; i++) {
            quartos[i] = new Quarto(i);
        }
    }

    public Quarto[] geQuarto() {
        return quartos;
    }

    public int vagasDisponiveis() {
        int vazios = 0;

        if (quartos.length != 0) {
            System.out.println("Situação dos aluguéis dos quartos:");
            for (int i = 0; i < quartos.length; i++) {
                if (quartos[i].isAlugado().equals("vazio")) {
                    vazios++;
                }
                System.out.println(String.format(
                        "Quarto #%d: %s", quartos[i].getNumero(), quartos[i].isAlugado()));
            }
            System.out.println("Total de quartos disponíveis: " + vazios);
        }
        return vazios;
    }

    @Override
    public String toString() {
        return "Pensionato [quarto=" + quarto + ", quartos=" + Arrays.toString(quartos) + "]";
    }

    // public void registrarAluguel() {
    // int rents;
    // if (this.vagasDisponiveis() > 0) {
    // System.out.println("Registro de Aluguéis: Quantos quartos serão alugados?");
    // rents = sc.nextInt();

    // if (rents <= vagasDisponiveis()) {
    // registrarCliente(rents);
    // } else {
    // System.out.println("Pensionato lotado!");
    // }
    // }
    // System.out.println("Registros Realizados!");
    // }

    // public void registrarCliente(int rents) {
    // System.out.println("Faça o cadastro da quantidade de clientes registrada: ");
    // for (int i = 0; i < rents; i++) {
    // System.out.println("Rent #" + i + ":");
    // System.out.println("Digite o nome:");
    // String nome = sc.next();
    // System.out.println("Digite o email:");
    // String email = sc.next();
    // Estudante estudante = new Estudante(nome, email);
    // quartos[i] = quarto.setEstudante(estudante);
    // }
    // }

    // public void registrarClientePorQuarto(int rents) {
    // System.out.println("Faça o cadastro da quantidade de clientes registrada: ");
    // for (int i = 0; i < rents; i++) {
    // System.out.println("Rent #" + i + ":");
    // System.out.println("Digite o nome:");
    // String nome = sc.next();
    // System.out.println("Digite o email:");
    // String email = sc.next();
    // Estudante estudante = new Estudante(nome, email);
    // System.out.println("Escolha o número do quarto (de 0 a 9):");
    // int num = sc.nextInt();
    // Quarto aluguel = new Quarto(num, true, estudante);
    // for (int j = 0; j < quartos.length; j++) {
    // if (quartos[j].isAlugado().equals("vazio")) {
    // quartos[j] = aluguel;
    // }
    // }
    // }
    // }

}
