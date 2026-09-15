package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número do contrato: ");
        int number = sc.nextInt();
        System.out.print("Data do contrato (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas para pagamento do contrato: ");
        int installments = sc.nextInt();

        ContractService service01 = new ContractService(new PaypalService());

        service01.processContract(contract, installments);

        System.out.println("Parcelas: ");
        for (Installment inst : contract.getInstallments()) {
            System.out.println(inst);
        }

        sc.close();
    }
}