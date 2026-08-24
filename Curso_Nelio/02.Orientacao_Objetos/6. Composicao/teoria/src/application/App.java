package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContrat;
import entities.Worker;
import entities.enums.WorkLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento: ");
        Department depart = new Department(sc.next());
        System.out.println("Digite os dados do trabalhador:");
        System.out.println("Digite o seu nome:");
        String name = sc.next();
        System.out.println("Digite o nível de especialidade:");
        WorkLevel level = WorkLevel.valueOf(sc.next());
        System.out.println("Digite o seu salario base:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary, depart);

        System.out.println("Quantos contratos esse trabalhador tem?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.println("Digite a Data(DD/MM/YYYY):");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            
            System.out.println("Digite o valor por hora: ");
			double valuePerHour = sc.nextDouble();
            System.out.println("Digite a duracao(horas): ");
            int hours = sc.nextInt();

            HourContrat contract = new HourContrat(date, valuePerHour, hours);
            worker.addContract(contract);                        
        }

        System.out.println("Entre o ano e mês para calcular o ganho mensal(MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));
		
        sc.close();
    }
}

