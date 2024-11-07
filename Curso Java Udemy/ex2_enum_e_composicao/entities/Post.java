package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    private LocalDateTime data;
    private String titulo;
    private String conteudo;
    private int likes;
    private ArrayList<Comentario> comentarios = new ArrayList<>();

    public Post(LocalDateTime data, String titulo, String conteudo, int likes) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    public ArrayList<Comentario> getComentarios(){
        return comentarios;
    }
}
