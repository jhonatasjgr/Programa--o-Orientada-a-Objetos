import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        System.out.print("Enter the number of employees:");
        int n = teclado.nextInt();
        teclado.nextLine();//limpa o buffer
        for(int i=0;i<n;i++) {
            Funcionario funcionario;
            System.out.printf("Employee #%d data: ", i + 1);
            System.out.print("\nOutsourced (y/n)? ");
            String tenderization = teclado.nextLine();
            System.out.print("Name: ");
            String name = teclado.nextLine();
            System.out.print("Hours: ");
            int hours = teclado.nextInt();
            teclado.nextLine();//limpa o buffer
            System.out.print("Value per hour: ");
            Double value = teclado.nextDouble();
            teclado.nextLine();//limpa o buffer
            if (tenderization.equalsIgnoreCase("y")) {
                System.out.print("Additional charge: ");
                Double despesa = teclado.nextDouble();
                teclado.nextLine();//limpa o buffer
                funcionario = new FuncionarioTerceirizado(name, hours, value, despesa);
                funcionarios.add(funcionario);
            } else {
                funcionario = new Funcionario(name, hours, value);
                funcionarios.add(funcionario);
            }
        }
        System.out.println("\n");
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario.getName()+" - $ "+funcionario.payment());
        }
    }
}