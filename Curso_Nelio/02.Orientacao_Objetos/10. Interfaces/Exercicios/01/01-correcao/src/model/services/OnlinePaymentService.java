package model.services;

public interface OnlinePaymentService {
    public double paymentFee(double amount); // taxa pagamento

    public double interest(double amount, int months); // juros
}
