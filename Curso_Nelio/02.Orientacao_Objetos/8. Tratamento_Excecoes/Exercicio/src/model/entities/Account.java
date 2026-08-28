package model.entities;

import model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws BusinessException {
        if (withdrawLimit > balance) {
            throw new BusinessException("Withdraw limit must be less than total balance");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws BusinessException {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(double amount) throws BusinessException {
        if (getBalance() <= 0 || amount > getBalance()) {
            throw new BusinessException("Withdraw error: Not enough balance");
        }
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Account Data:\nNumber= %d, Holder: %s, Balance: %f, Withdraw limit= %f", number, holder, balance,
                withdrawLimit);
    }
}
