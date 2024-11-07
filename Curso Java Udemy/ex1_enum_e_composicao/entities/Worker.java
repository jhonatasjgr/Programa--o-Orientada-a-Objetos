package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Departament departament;
    private ArrayList<Contract> contracts = new ArrayList<>();
    private Double BaseSalary;

    public Worker(String name, WorkerLevel level, Departament departament){
        this.name = name;
        this.departament = departament;
        this.level = level;
    }
    public Worker(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }
   public void removeContract(Contract contract) {
        this.contracts.remove(contract);
    }
    public Double income(Integer year, Integer month) {
        Double total = contracts.stream()
                .filter(contract -> contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year)
                .mapToDouble(contract -> contract.totalValue())
                .sum();
        return (total+BaseSalary);
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }
}
