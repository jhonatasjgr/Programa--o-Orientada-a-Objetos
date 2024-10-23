package atv2;

public class Filme {
	
	private String titulo;
	private int idadeMinima;
	private Sala sala;
	private String dataHora;
	
	
	public Filme(String titulo, int idadeMinima, Sala sala, String dataHora) {
		super();
		this.titulo = titulo;
		this.idadeMinima = idadeMinima;
		this.sala = sala;
		this.dataHora = dataHora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
}
