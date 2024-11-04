package accessModifiers;

import accessModifiers_other.Book;

public class MainClass {

	public static void main(String[] args) {

		Book book1 = new Book();
		// book1.author = "Agatha Christie";
		// book1.page = 256;
		book1.name = "The Big Four";
		// book1.releaseDate = 1927;
		
		book1.showAuthor();
		book1.showPage();
		book1.showName();
		book1.showReleaseDate();
		
		Book.finalValue(6);
	}

}
