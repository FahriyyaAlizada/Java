package Oct1;

public class no2 {
	
	// HOMEWORK 1
	// String name;
    // String surname;
    // int experienceYear;
    // int salary;
    // String phone;
	
    // public no2(String name, String surname, int experienceYear, String phone) {
    //     this.name = name;
    //     this.surname = surname;
    //     this.experienceYear = experienceYear;
    //     this.phone = phone;
    // }
    // public void printInfo() {
    //     System.out.println("Name: " + name);
    //     System.out.println("Surname: " + surname);
    //     System.out.println("Experience Year: " + experienceYear);
    //     System.out.println("Salary: " + salary);
    //     System.out.println("Phone: " + phone);
    // }}
	// class SalaryCalculator {
	// 
	//     public void calculateSalary(no2 person) {
	//         if (person.experienceYear == 1) {
	//             person.salary = 500;
	//         } else if (person.experienceYear == 2) {
	//             person.salary = 1000;
	//         } else if (person.experienceYear == 3) {
	//             person.salary = 1500;
	//         } else if (person.experienceYear > 3) {
	//             person.salary = 1500 + (500 * (person.experienceYear - 3));
	//         } else {
	//             person.salary = 0; 
	//         }
	//     }
	
	// HOMEWORK 2
	// double radius;
	// double length;
	// public no2(double radius) {
    //     this.radius = radius;
    //     this.length = 0;
    // }}
	// class Calculator{
	// public void calculateCircleLength(no2 circle) {
	// 	circle.length = 2 * Math.PI * circle.radius;
	// }
	
	// HOMEWORK 3
	int number;
	public void findFactorial(int number) {
		int fact = 1;
		for (int i = 1; i < number+1; i++) {
			fact = fact*i;	
		}
		System.out.println(number + "! = " + fact);
	}
}