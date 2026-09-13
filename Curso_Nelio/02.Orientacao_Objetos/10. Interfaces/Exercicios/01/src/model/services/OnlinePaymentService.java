package model.services;

public interface OnlinePaymentService {
    public Double paymentFee(Double amount); // taxa pagamento

    public Double interest(Double amount, Integer months); // juro
}
