package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesomwe");
		Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dtf1), "Traveling to new Zealand", "I'm going to visit this wonderful country!", 12);
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("See you tomorrow");
		Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", dtf1), "Good night guys", "See you tomorrow", 5);
		p1.addComent(c1);
		p1.addComent(c2);
		p2.addComent(c3);
		p2.addComent(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
