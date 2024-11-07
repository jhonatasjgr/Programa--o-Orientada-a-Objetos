package entities;

public class Comentario {
    private String texto;

    public Comentario(String comentario) {
        texto = comentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
