package fatura;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtd;
    private double preco;

    public Fatura(String numero, String descricao, int qtd, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0) {
            this.preco = 0.0;
            return;
        }
        this.preco = preco;
    }
    public double getTotalFatura(){
        double total = qtd*preco;
        if(total<0) return 0;
        return qtd*preco;
    }
}
