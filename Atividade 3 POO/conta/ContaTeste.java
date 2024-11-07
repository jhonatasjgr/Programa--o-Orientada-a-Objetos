package conta;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta = new Conta("1",1500.0,"ativa",false,1000.0);
        conta.saque(2000);
        conta.deposito(1000);
        System.out.println("Saldo = R$"+conta.getSaldo());
    }
}
