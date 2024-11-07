package fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("1","produto 1",5,5.99);
        System.out.println("O preço da fatura é: "+fatura.getTotalFatura());
    }
}
