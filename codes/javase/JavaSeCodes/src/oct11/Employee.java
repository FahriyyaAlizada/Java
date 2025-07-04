package oct11;

public class Employee extends Person {
	
	double salary;
    String department;
    String username;
    int password;
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
