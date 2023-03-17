import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.stream.events.Comment;

import entities.Coment;
import entities.Post;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        int likes = 12;
        int likesPostDois = 20;

        Coment c1 = new Coment("Aproveite a viagem!!!");
        Coment c2 = new Coment("Que incrivell!!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), " Viajei para Nova Zelandia!!", "Aqui é lindo!!!", likes);
        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1.toString());

        Post p2 = new Post(
                sdf.parse("21/06/2018 18:00:00"), "Boa noite pessoal!", "Estou indo dormiir!", likesPostDois);

        Coment c4 = new Coment("Durma bem!");
        p2.addComments(c4);

        System.out.println(p2.toString());
    }
}