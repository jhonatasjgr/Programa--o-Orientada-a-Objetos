public class Main{
	public static void main(String[] args) {
		double valorHora=5.0;
		float horasTrabalhadas = 220;
		double salariobruto = (double) horasTrabalhadas*valorHora;
		double impRenda = salariobruto*5/100;
		double inss = salariobruto*10/100;
		double fgts = salariobruto*11/100;
		
		System.out.printf("Salário bruto:  (%.1f * %.1f)  : R$ %.2f\n",valorHora,horasTrabalhadas,salariobruto);
	    System.out.printf("(-) IR (5%%)                    : R$   %.2f\n",impRenda);
	    System.out.printf("(-) INSS (10%%)                 : R$  %.2f\n",inss);
	    System.out.printf("FGTS (11%%)                     : R$  %.2f\n",fgts);
	    System.out.printf("Total de descontos             : R$  %.2f\n",(impRenda+inss));
	    System.out.printf("Salário Liquido                : R$  %.2f\n",salariobruto-(impRenda+inss));
	    
	}
}
