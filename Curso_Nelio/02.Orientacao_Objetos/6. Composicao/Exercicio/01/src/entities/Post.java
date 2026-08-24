package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    // para o StringBuilder e sem a lógica das iterações no App.java - instanciar e
    // imprimir cada Post separado:
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment = LocalDateTime.now();
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {
    };

    public Post(String title, String content, Integer likes) {
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getDate() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void getCommnents() {
        for (Comment comment : comments) {
            System.out.println(comment.getText());
        }
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    // Vendo o funcionamento da Classe StringBuilder:
    // Instanciar e imprimir cada Post direto sem a lógica das iterações no App.java
    // -
    // Não utilizar o método getCommnents();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(moment.format(fmt) + "\n");
        sb.append(content + "\n");
        sb.append("Commnets:" + "\n");
        for (Comment comment : comments) {
            sb.append(comment.getText() + "\n");
        }
        return sb.toString();
        // convertendo o StringBuilder em String

    }
}
