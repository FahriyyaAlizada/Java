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

	}

}
