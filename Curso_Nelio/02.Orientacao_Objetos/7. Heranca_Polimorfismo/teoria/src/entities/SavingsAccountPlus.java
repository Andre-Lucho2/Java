package entities;

public class SavingsAccountPlus extends SavingsAccount {

    public SavingsAccountPlus() {
        super();
    }

    public SavingsAccountPlus(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance, interestRate);
    }

    // @Override
    // public void withdraw(double amount) {
    // balance -= amount + 2.0;
    // }

}
