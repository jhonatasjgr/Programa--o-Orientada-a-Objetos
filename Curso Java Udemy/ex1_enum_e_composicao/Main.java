import entities.Contract;
import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Worker worker = new Worker();
        System.out.println("Enter department's name:");
        Departament departament = new Departament(teclado.nextLine());
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        worker.setName(teclado.nextLine());
        System.out.println("Level:");
        worker.setLevel(WorkerLevel.valueOf(teclado.nextLine()));
        System.out.println("Base salary: ");
        worker.setBaseSalary(teclado.nextDouble());
        System.out.println("How many contracts to this worker?");
        int n = teclado.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter contract #"+(i+1)+" data:");
            Contract contract =  new Contract();
            System.out.println("Date (DD/MM/YYYY): ");
            teclado.nextLine();
            String dateInput = teclado.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dateInput, formatter);
            contract.setDate(date);
            System.out.println("Value per hour:");
            contract.setValuePerHour(teclado.nextDouble());
            System.out.println("Duration (hours):");
            contract.setHours(teclado.nextInt());
            worker.addContract(contract);
        }
        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        teclado.nextLine();
        String dateInput = teclado.nextLine();
        String[] parts = dateInput.split("/");
        Integer month = Integer.parseInt(parts[0]);
        Integer year = Integer.parseInt(parts[1]);
        System.out.println("Name:"+worker.getName());
        System.out.println("Department:"+worker.getDepartament().getName());
        System.out.println("Income for "+month+"/"+year+":"+worker.income(year,month));
    }
}