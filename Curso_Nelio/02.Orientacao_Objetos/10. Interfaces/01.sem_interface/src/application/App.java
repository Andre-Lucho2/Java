package application;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro:");
        Vehicle vehicle = new Vehicle(sc.nextLine());
        System.out.println("Data e hora da retirada do veículo (dd/MM/yyyy HH:mm)");
        LocalDateTime startInput = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Data e hora da devolução do veículo (dd/MM/yyyy HH:mm)");
        LocalDateTime finishInput = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental rental01 = new CarRental(startInput, finishInput, vehicle);

        System.out.print("Entre com o preço por hora:");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia:");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(rental01);

        System.out.println("Fatura:");
        System.out.println("Pagamento básico:" + String.format("%.2f", rental01.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", rental01.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", rental01.getInvoice().getTotalPayment()));

        sc.close();
    }
}