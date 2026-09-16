package model.services;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    // Com o Default, não há mais necessidade de implementar o método da Interface

}
