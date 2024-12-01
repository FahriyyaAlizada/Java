package practice_Dec1;

public class Car extends Transport implements Vehicle{

	public Car(String brand, int speed) {
		super(brand,speed);
	}
	@Override
	public void move() {
		System.out.println(getBrand() + " car is on the way...");
		
	}
	@Override
	public void stop() {
		System.out.println(getBrand() + " car stopped...");
		
	}
	@Override
	public double calculateTravelTime(double distance) {
		double time = distance / speed;
		return time;
	}
	
}
