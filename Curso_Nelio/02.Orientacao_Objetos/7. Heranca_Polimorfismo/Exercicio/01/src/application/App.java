package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import entities.*;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int list = sc.nextInt();

        for (int i = 1; i <= list; i++) {
            System.out.println("Enter #" + i + " employee data:");
            System.out.print("Employee is Outsourced (y/n)?");
            char isOutsourced = sc.next().charAt(0);

            System.out.println("Entrer Employee's name: ");
            String name = sc.next();
            System.out.println("Entrer Employee's hours worked: ");
            Integer hours = sc.nextInt();
            System.out.println("Entrer Employee's hourly rate: ");
            Double valuePerHour = sc.nextDouble();

            if (isOutsourced == 'y') {
                System.out.println("Entrer Additional charge: ");
                double addCharge = sc.nextDouble();

                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("Payments:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        sc.close();
    }
}