package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// parcela
public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment() {
    };

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.dueDate.format(fmt), this.amount);
    }

}
