package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class App {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/10. Interfaces/05.Comparable/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCSV = br.readLine();

            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(","); // [0] --> "name" | [1]--> "salary"
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }

            Collections.sort(list); // ordenando a lista

            for (Employee emp : list) {
                System.out.println(emp.getName() + " - " + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * Utilizando Comparator para implementar as mesmas ordenações:
 * (não há necessidade de realizar a interface Comparable)
 * 
 * import java.util.Comparator;
 * 
 * list.sort(Comparator.comparing(Employee::getSalary));
 * list.sort(Comparator.comparing(Employee::getSalary).reversed()); // ordem
 * decrescente
 * 
 * list.sort(Comparator.comparing(Employee::getName));
 * list.sort(Comparator.comparing(Employee::getName)).reversed());
 */
