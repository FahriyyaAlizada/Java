package nov30;

public class Book {
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("Book Name => " + name);
		System.out.println("Book Author => " + author);
	}
}
