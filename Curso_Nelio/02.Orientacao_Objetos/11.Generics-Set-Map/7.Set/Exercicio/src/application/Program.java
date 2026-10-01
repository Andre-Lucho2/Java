package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Teacher;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de professores por alunos e cursos?");

        System.out.println("Qual o nome do professor?");
        String name = sc.next();

        System.out.println("Quantos cursos deseja cadastrar para o professor?");
        int num = sc.nextInt();

        Teacher a = new Teacher();
        List<Character> courses = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Qual a letra para o curso " + i + 1 + ":");
            a.courses.add(sc.next().charAt(0));

            System.out.println("Quantos alunos o professor possui no curso " + courses.get(i));
            int students = sc.nextInt();
            for (int j = 0; j < students; j++) {
                System.out.println("Quantos o nome do aluno " + j + ":");

            }

        }

        sc.close();

    }

}
