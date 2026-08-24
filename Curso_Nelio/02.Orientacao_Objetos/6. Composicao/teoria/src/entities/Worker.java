package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContrat> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContrat contract){
        contracts.add(contract);
    }

    public void removeContract(HourContrat contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;

        for (HourContrat contract : contracts) {
            if(contract.equals(contract))
        }

    }


    // @Override
    
}
