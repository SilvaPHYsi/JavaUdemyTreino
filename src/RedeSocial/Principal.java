package RedeSocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        LocalDateTime horadata = LocalDateTime.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Boolean continuar = true;
        System.out.println("Deseja postar algo? ");
        String pergunta = sc.nextLine().toLowerCase();

        // Loop de comentários
        if (pergunta.equals("sim")) {
            while (continuar) {
                System.out.println("Qual o título? ");
                String title = sc.nextLine();
                System.out.println("Qual o conteúdo? ");
                String content = sc.nextLine();
                Integer likes = 12;
                Post post = new Post(horadata.format(fmt1), title, content, likes);
                String c1 = "Parece delicioso";
                String c2 = "Incrível";
                Comments comentário = new Comments(c1);
                Comments comentário1 = new Comments(c2);
                post.addComments(comentário);
                post.addComments(comentário1);
                System.out.println(post);
                System.out.println("Deseja continuar? ");
                String resposta = sc.nextLine().toLowerCase();
                if (resposta.equals("nao") || resposta.equals("não")) {
                    continuar = false;
                    System.out.println("Finalizando os comentários ...");
                }
            }
        }
        
        
        sc.close();
    }
}