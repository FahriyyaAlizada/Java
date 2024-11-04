package accessModifiers_other;

public class Book {

	// default modifier - just in case in the same package
	String author;
	
	// protected modifier - just in case in the same package
	protected int page;
	
	// public modifier - can be used everywhere
	public String name;
	
	// private modifiers - in the same class only
	private int releaseDate;
	
	
	public void showAuthor() {
		System.out.println("Author: " + author);
	}
	
	private void showPage() {
		System.out.println("Page: " + page);
	}
	
	protected void showName() {
		System.out.println("Name: " + name);
	}
	
	void showReleaseDate() {
		System.out.println("Release Date: " + releaseDate);
	}
	
	Book(String author) {
		this.author = author;
	}
	public Book(int page) {
		this.page = page;
	}
	protected Book(String name) {
		this.name = name;
	}
	private Book(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	static int count = 0;
	public static void finalValue(final int value) {
		count++;
        System.out.println("Final value: " + value);
        System.out.println("Count: " + count);
    }
}
