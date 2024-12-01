package nov30;

public class Main {
	
	public static void main(String[] args) {
		Book book = new Book("White Nights", "Dostoyevsky");
		book.showInfo();
		
		Book electronicBook = new ElectronicBook("White Nights", "Dostoyevsky", "PDF", 10);
		electronicBook.showInfo();
		
		Book physicalBook = new PhysicalBook("White Nights", "Dostoyevsky", 20, 12);
		physicalBook.showInfo();

	}

}
