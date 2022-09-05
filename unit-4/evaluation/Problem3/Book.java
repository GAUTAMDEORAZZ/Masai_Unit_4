package Problem3;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

	public void setName(String name) {
		bookName = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
public Book(int bookId, String bookName, String author) {
		
		this.bookId=bookId;
		this.bookName=bookName;
		this.author=author;
		
	}
	
	public int getBookId() {
		return bookId;
	}
	public String getAuthor() {
		return author;
	}
	public String getName() {
		return bookName;
		
	}
}
