package practice_Dec15;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("Age can not be under 0.");
            }

            System.out.println("Your age: " + age);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception...");
        }

	}

}
