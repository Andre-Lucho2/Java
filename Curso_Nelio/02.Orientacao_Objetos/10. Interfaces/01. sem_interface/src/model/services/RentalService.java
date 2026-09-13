package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTaxService taxService;
    /*
     * Acoplamento Forte entre as classes de 'services'
     * -----------------------------------------------
     * Class RentalService --> está dependendo exclusivavemente da classe-serviço
     * BrazilTaxService --> conhecwe a dependencia concreta (BrazilTaxService) -->
     * está assoicada a ela!
     * ** Se trocarmos o serviço de taxas, isso gera multiplas manutenções em outras
     * classes = RentalService
     * 
     * 
     * SEMPRE QUE UMA CLASSE É RESPONSÁVEL POR INSTANCIAR SUAS DEPENDÊNCIAS == FORTE
     * ACOPLAMENTO
     * 
     */

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    // outro exemplo:
    public RentalService(Double pricePerDay, Double pricePerHour) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = new BrazilTaxService();
    }; // instanciação de dependência concreta - forte acoplamento

    public void processInvoice(CarRental carRental) {
        double min = (Duration.between(carRental.getStart(), carRental.getFinish())).toMinutes();
        double hours = min / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
