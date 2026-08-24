package application;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post newPost = new Post();
        List<Post> posts = new ArrayList<>();
        Comment newComment = new Comment();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos Posts gostaria de criar:");
        int pLength = sc.nextInt();

        for (int i = 0; i < pLength; i++) {
            System.out.println("Digite o " + (i + 1) + "º comentário: ");
            System.out.println("Crie o seu Post:");
            System.out.println("Digite o titulo:");
            String title = sc.next();
            System.out.println("Digite o conteúdo:");
            String content = sc.next();
            System.out.println("Digite o nº likes:");
            int likes = sc.nextInt();
            newPost = new Post(title, content, likes);

            posts.add(newPost);

            System.out.println("Agora, digite a quantidade de comentários a criar:");
            int cLength = sc.nextInt();

            for (int j = 0; j < cLength; j++) {
                System.out.println("Digite o " + (j + 1) + "º comentário: ");
                newComment = new Comment(sc.next());
                newPost.addComments(newComment);
            }
        }

        for (Post post : posts) {
            System.out.println(post.getTitle());
            System.out.println(post.getLikes() + " - " + post.getDate().format(fmt));
            System.out.println(post.getContent());
            System.out.println("Comments:");
            post.getCommnents();
        }

        sc.close();
    }
}
