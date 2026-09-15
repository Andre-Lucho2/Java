package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months; // = 300.00

        for (int i = 1; i <= months; i++) {
            LocalDate NextInstDate = contract.getDate().plusMonths(i);

            double interestTax = onlinePaymentService.interest(basicQuota, i);
            double totalInstallment = onlinePaymentService.paymentFee(interestTax);

            contract.getInstallments().add(new Installment(NextInstDate, totalInstallment));
        }

    }

}
