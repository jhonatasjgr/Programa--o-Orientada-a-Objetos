package conta;

public class Conta {
    private String numero;
    private Double saldo;
    private String status;
    private boolean especial;
    private Double limite;

    public Conta(String numero, Double saldo, String status, boolean especial, Double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
        this.especial = especial;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    public void saque(double valor){
        if(saldo>=valor) saldo-=valor;
        System.out.println("Saldo insuficiente");
    }
    public void deposito(double valor){
        saldo+=valor;
    }
}

