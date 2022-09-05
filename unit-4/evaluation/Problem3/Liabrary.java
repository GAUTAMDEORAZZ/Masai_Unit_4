package Problem3;

import java.util.ArrayList;
import java.util.List;

public class Liabrary {

	public static void main(String[] args) {
		
		List<Book> booksCollection =new ArrayList<>();
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		System.out.println(booksCollection);

	}

}
