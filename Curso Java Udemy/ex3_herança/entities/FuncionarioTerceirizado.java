package entities;

public final class FuncionarioTerceirizado extends Funcionario{

    private Double despesaAdicional;

    public FuncionarioTerceirizado(){
        super();
    }
    public FuncionarioTerceirizado(String name, Integer hours, Double valuePerHour, Double despesaAdicional) {
        super(name, hours, valuePerHour);
        this.despesaAdicional = despesaAdicional;
    }
    public Double getDespesaAdicional() {
        return despesaAdicional;
    }
    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    @Override
    public Double payment() {
        return super.payment() + (despesaAdicional*110/100);
    }
}
