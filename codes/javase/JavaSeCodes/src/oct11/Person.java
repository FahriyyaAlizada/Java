package oct11;

public class Person {
	
	int id;
    String name;
    String surname;
    int age;
    String phone;
    String address;
    
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}
