package entities;

import java.util.Scanner;

public class Pensionato {
    Scanner sc = new Scanner(System.in);

    private Quarto[] quartos;

    public Pensionato() {
        quartos = new Quarto[10];
        for (int i = 0; i < quartos.length; i++) {
            quartos[i] = new Quarto(i);
        }
    }

    public int totalDeVagasDisponiveis() {
        int vagasDisponiveis = 0;
        if (quartos.length != 0) {
            for (int i = 0; i < quartos.length; i++) {
                if (quartos[i].isAlugado().equals("vazio")) {
                    vagasDisponiveis++;
                }
            }
        }
        return vagasDisponiveis;
    }

    public void registrarAluguel() {
        int rents;

        if (this.totalDeVagasDisponiveis() > 0) {
            System.out.println("Registro de Aluguéis: Quantos quartos serão alugados?");
            rents = sc.nextInt();

            if (rents <= totalDeVagasDisponiveis()) {
                for (int i = 0; i < rents; i++) {
                    if (quartos[i].isAlugado().equals("vazio")) {
                        registrarEstudante(i);
                    }
                }
            } else {
                System.out.println("Pensionato lotado!");
                return;
            }
        } else {
            System.out.println("Pensionato lotado!");
            return;
        }
        System.out.println("Registros Realizados!");
    }

    public Estudante entrarEstudante() {
        System.out.println("Digite o nome:");
        String nome = sc.next();
        System.out.println("Digite o email:");
        String email = sc.next();
        Estudante estudante = new Estudante(nome, email);
        return estudante;
    }

    public void registrarEstudante(int quarto) {
        System.out.println("Rent #" + quarto + ":");
        quartos[quarto].setEstudante(entrarEstudante());
        quartos[quarto].setAlugado(true);
    }

    public void registrarAluguelPorQuarto() {
        System.out.println("Escolha o número do quarto (de 0 a 9):");
        int num = sc.nextInt();

        if (quartos[num].isAlugado().equals("vazio")) {
            registrarEstudante(num);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (quartos.length != 0) {
            for (int i = 0; i < quartos.length; i++) {
                sb.append(String.format("Quarto #%d: %s, %s\n", (quartos[i].getNumero() + 1),
                        quartos[i].isAlugado(), quartos[i].getEstudante()));
            }
        }
        return sb.toString();
    }
}
