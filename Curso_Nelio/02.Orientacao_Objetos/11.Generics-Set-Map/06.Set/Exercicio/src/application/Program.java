package application;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import model.entities.Course;
import model.entities.Teacher;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de professores por cursos e alunos?");
        Set<Teacher> teachers = new HashSet<>();
        int menu = 0;

        do {
            if (!teachers.isEmpty()) {
                // int i = 0;
                // for (Teacher teacher : teachers) {
                // System.out.println("Professores cadastrados: " + (i + 1) + "-" +
                // teacher.getName());
                // i++;
                // }
                // ou
                int i = 1;
                for (Iterator<Teacher> it = teachers.iterator(); it.hasNext(); i++) {
                    Teacher teacher = it.next();
                    System.out.println("Professores cadastrados: " + i + "-" +
                            teacher.getName());
                }
                // Iterator<Teacher> it = teachers.iterator() --> transfroma o conjunto em
                // iterável == funciona como um "ponteiro" que sabe como navegar de elemento em
                // elemento dentro da coleção
                // it.hasNext() -- true/false --> se tem elem na proxima entrada de ponteiro
                // it.next(); --> Avança o ponteiro para o próximo item e retorna esse objeto.

                // ou (sem índice - Lambda)
                // teachers.stream().filter(t -> t.getName() != null).forEach(t ->
                // System.out.println(t.getName()));
            }

            System.out.println("Gostaria de cadastrar um novo professor? Digite 1 p/ SIM ou 0 p/ NÃO");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("Qual o nome do professor?");
                String name = sc.next();
                Teacher teacher = new Teacher(name);

                System.out.print("Quantos cursos deseja cadastrar para o professor " + name + " ?");
                int courses = sc.nextInt();

                for (int i = 1; i <= courses; i++) {
                    System.out.print("Cadastre o curso " + 0 + i + " através de uma letra:");
                    Course course = new Course(sc.next());

                    System.out.print("Quantos alunos o professor possui no curso " + 0 + i + " ?");
                    int totalStudents = sc.nextInt();

                    for (int j = 1; j <= totalStudents; j++) {
                        System.out.println("Qual é o nome do aluno " + 0 + j + " :");
                        course.addStudent(sc.next());
                    }
                    teacher.addCourse(course);
                    teachers.add(teacher);
                }

                System.out.println(teacher.getName());
                for (Course course : teacher.getCourses()) {
                    System.out.print(course.getName());
                    for (String student : course.getStudents()) {
                        System.out.println(student);
                    }
                }
                System.out
                        .println("Quant de estudantes distintos por professor: " + teacher.getTotalDistinctStudents());

            } else {
                menu = 0;
            }

        } while (menu == 1);

        sc.close();
    }

}
