package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.entities.Employee;

public class App {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/10. Interfaces/04.Comparable/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCSV = br.readLine();

            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(","); // **
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }

            Collections.sort(list); // ordenando a lista

            /*
             * Utilizando Comparator para implementar uma 2º forma de ordenação tipo salario
             * 
             * list.sort(Comparator.comparing(Employee::getSalary));
             * list.sort(Comparator.comparing(Employee::getSalary).reversed()); // ordem
             * decrescente
             * 
             * list.sort(Comparator.comparing(Employee::getName));
             * 
             */

            for (Employee emp : list) {
                System.out.println(emp.getName() + " - " + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// ** - [0] --> "name" | [1]--> "salary"