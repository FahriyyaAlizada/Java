package Oct1;
import java.util.Scanner;
public class no1 {

	public static void main(String[] args) {
		
		// HOMEWORK 1
		// no2 person = new no2("John", "Smith", 2, "123-456-7890");
        // SalaryCalculator salaryCalculator = new SalaryCalculator();
        // salaryCalculator.calculateSalary(person);
        // person.printInfo();
		
		// HOMEWORK 2
		// no2 circle = new no2(12.5);
		// Calculator calculator = new Calculator();
        // calculator.calculateCircleLength(circle);
        // System.out.println("Circle Length: " + circle.length);
		
		// HOMEWORK 3
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number to get the factorial of it:");
        int number = scanner.nextInt();
		no2 num = new no2();
		num.findFactorial(number);
	}

}