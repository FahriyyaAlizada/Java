package practice_Dec1;

public class Transport implements Vehicle{
	private String brand;
	final int speed;

	public Transport(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateTravelTime(double distance) {
		double time = distance / speed;
		return time;
	}
}
