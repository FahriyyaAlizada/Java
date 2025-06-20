package dec7;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private int pageCount;
	private String description;
	
	public Book(int id, String name, String author, int pageCount, String description) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.pageCount = pageCount;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", pageCount=" + pageCount
				+ ", description=" + description + "]";
	}
	
}
