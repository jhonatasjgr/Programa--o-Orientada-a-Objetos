package atv2;

public class Ingresso {
	private int numero;
	private Cliente cliente;
	private String tipo;
	private String localizacao;
	
	public Ingresso(int numero, Cliente cliente, String tipo, String localizacao) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.tipo = tipo;
		this.localizacao = localizacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
