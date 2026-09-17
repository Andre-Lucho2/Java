package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService taxService;
    /*
     * Acoplamento Fraco entre as classes de 'services'
     * ------------------------------------------------
     * Está sendo instanciada com uma Interface "genérica" tipo TaxService -->
     * RentalService não conhece qual dependência concreta será utilizada
     * (abstração)
     * Saberá somente no momento de sua instanciação
     * 
     * Se a class concreta mudar, a class RentalService não precisa de manutenção
     * 
     * --> Posso criar nova regra de negócio com diferentes taxas para serem
     * aplicadas, escalando o App
     * 
     */

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

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
