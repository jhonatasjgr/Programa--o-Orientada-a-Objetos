import entities.Comentario;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<Post>();
        Post post = new Post(LocalDateTime.parse("2024-11-12T22:00:00"),"Hello","Primeiro post",18);
        post.addComentario(new Comentario("Fácil"));
        post.addComentario(new Comentario("Parabéns"));
        posts.add(post);
        post = new Post(LocalDateTime.parse("2024-11-05T22:00:00"),"Segundo","Aprendendo ainda",35);
        post.addComentario(new Comentario("Isso Aí"));
        post.addComentario(new Comentario("Evoluiu"));
        posts.add(post);

        for(Post item:posts){
            System.out.println(item.getTitulo());
            System.out.println(item.getLikes()+" likes - "+item.getData().format(DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm")));
            System.out.println(item.getConteudo());
            System.out.println("Comentarios:");
            for(Comentario comentario:  item.getComentarios()){
                System.out.println(comentario.getTexto());
            }
            System.out.println();
        }
    }
}