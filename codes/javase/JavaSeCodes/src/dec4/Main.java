package dec4;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.move();
		car.showType("Convertible");
		
		Vehicle bicycle = new Bicycle();
		bicycle.move();
		bicycle.showType("Folding Bike");

	}

}
