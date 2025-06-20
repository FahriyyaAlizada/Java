package dec7;

public class Main {

	public static void main(String[] args) {
		//Student student = new Student("Annie", 24);
		//System.out.println(student.toString());
		
		Product p1 = new Product("Airpods", 120.0, 3000);
		System.out.println(p1.toString());
		System.out.println("----------------------------------------");
		
		Product p2 = new Product("Powerbank", 95.0, 1450);
		System.out.println(p2.toString());
		System.out.println("----------------------------------------");
		
		Product p3 = new Product("Printer", 680.0, 570);
		System.out.println(p3.toString());
		
		Book b1 = new Book(1, "1984", "George Orwell", 328, "A dystopian social science fiction novel.");
		System.out.println(b1.toString());
		
		Book b2 = new Book(2, "Pride and Prejudice", "Jane Austen", 279,"A romantic novel about manners, and misunderstanding.");
		System.out.println(b2.toString());

	}

}
