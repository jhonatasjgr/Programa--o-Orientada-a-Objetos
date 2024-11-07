package empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Rene","ads",50.000);
        Empregado empregado2 = new Empregado("Jhonatas","ads",100.00);
        System.out.printf("Salario anual do %s é R$%.2f\n",empregado1.getNome().concat(empregado1.getSobrenome()),empregado1.getSalarioAnual());
        System.out.printf("Salario anual do %s é R$%.2f\n",empregado2.getNome().concat(empregado2.getSobrenome()),empregado2.getSalarioAnual());
        empregado2.setSalario(empregado1.getSalario()+ (empregado2.getSalario()/10*100) );
        System.out.printf("Novo salario do %s é R$%.2f",empregado2.getNome(),empregado2.getSalario());
    }
}
