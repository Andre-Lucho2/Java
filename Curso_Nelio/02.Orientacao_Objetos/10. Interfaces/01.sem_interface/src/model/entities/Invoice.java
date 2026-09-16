package model.entities;

public class Invoice {
    private Double basicPayment;
    private Double Tax;

    public Invoice() {

    }

    public Invoice(Double basicPayment, Double Tax) {
        this.basicPayment = basicPayment;
        this.Tax = Tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }

}
