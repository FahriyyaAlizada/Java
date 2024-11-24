package practice_Nov24;

public class Car extends Vehicle{
	int doors;
	public Car(String brand, int speed, int doors) {
		super(brand,speed);
		this.doors = doors;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Number of Doors => " + doors);
	}
}
