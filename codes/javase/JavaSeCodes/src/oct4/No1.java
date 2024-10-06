package oct4;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first side of a triangle:");
        int side1 = scanner.nextInt();
        System.out.println("Enter the second side of a triangle:");
        int side2 = scanner.nextInt();
        System.out.println("Enter the third side of a triangle:");
        int side3 = scanner.nextInt();
        No2.area(side1, side2, side3);

	}

}
