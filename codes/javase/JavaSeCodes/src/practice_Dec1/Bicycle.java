package practice_Dec1;

public class Bicycle extends Transport implements Vehicle{
	public Bicycle(String brand, int speed) {
		super(brand,speed);

	}
	@Override
	public void move() {
		System.out.println(getBrand() + " bicycle is on the way...");
		
	}
	@Override
	public void stop() {
		System.out.println(getBrand() + " bicycle stopped...");
		
	}
	@Override
	public double calculateTravelTime(double distance) {
		double time = distance / speed;
		return time;
	}
}
