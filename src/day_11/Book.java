package day_11;

public class Book {
	
	private String title;
	private String author;
	private int pages;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title,String author, int pages) {
		this(title,author); //calling another constructor
		this.pages = pages;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
