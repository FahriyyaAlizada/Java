package practice_Oct6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle...");
        int radius = scanner.nextInt();
		Circle circle = new Circle(radius);
		circle.calculateArea();
		circle.calculatePerimeter();
		CircleModifier circleModify = new CircleModifier();
		System.out.println("Enter the new radius of the circle...");
        int newRadius = scanner.nextInt();
		circleModify.modifyCircleRadius(circle, newRadius);
		System.out.println("Enter the length of the rectangle...");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the rectangle...");
        int width = scanner.nextInt();
		Rectangle rectangle = new Rectangle(length, width);
		rectangle.calculateAreaRec();
		rectangle.calculatePerimeterRec();
		
	}

}
