package dec11;

public class Employee extends Person{
	
	private double salary;
	private String department;
	private String username;
	private int password;
	
	public Employee(int id, String name, String surname, int age, String phone, String address, double salary,
			String department, String username, int password) {
		super(id, name, surname, age, phone, address);
		this.salary = salary;
		this.department = department;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

}
