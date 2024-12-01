package practice_Dec1;

public class Airplane extends Transport implements Vehicle{

	public Airplane(String brand, int speed) {
		super(brand,speed);

	}
	@Override
	public void move() {
		System.out.println(getBrand() + " airplane is flying...");
		
	}
	@Override
	public void stop() {
		System.out.println(getBrand() + " airplane is landing...");
		
	}
	@Override
	public double calculateTravelTime(double distance) {
		double time = distance / speed;
		return time;
	}
}
