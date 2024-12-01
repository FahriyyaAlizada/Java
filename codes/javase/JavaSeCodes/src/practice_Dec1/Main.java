package practice_Dec1;

public class Main {

	public static void main(String[] args) {
		
		Transport car = new Car("Mercedes", 120);
		Transport airplane = new Airplane("Turkish Airlines", 250);
		Transport bicycle = new Bicycle("Scott", 80);
		
		Vehicles vehicle = new Vehicles();
		vehicle.moveVehicle(new Car("Mercedes", 120));
		vehicle.stopVehicle(new Car("Mercedes", 120));
		System.out.println("Travel Time => " + car.calculateTravelTime(2400.0));

		
		vehicle.moveVehicle(new Airplane("Turkish Airlines", 250));
		vehicle.stopVehicle(new Airplane("Turkish Airlines", 250));
		System.out.println("Travel Time => " + airplane.calculateTravelTime(1600.0));

		
		vehicle.moveVehicle(new Bicycle("Scott", 80));
		vehicle.stopVehicle(new Bicycle("Scott", 80));
		System.out.println("Travel Time => " + bicycle.calculateTravelTime(3200.0));

	}

}
