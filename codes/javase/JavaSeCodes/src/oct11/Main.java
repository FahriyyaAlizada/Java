package oct11;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 10;
		employee.name = "Sophia";
		employee.surname = "Smith";
		employee.age = 20;
		employee.phone = "+1-202-555-0100";
		employee.address = "New York, USA";

		employee.salary = 3500.0;
		employee.department = "Human Resources";
		employee.username = "sophia.smith";
		employee.password = 123;
		
		employee.printInfo();
	}

}
