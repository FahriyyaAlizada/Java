package practice_Oct6;

public class Rectangle {
	double length;
	double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double calculateAreaRec() {
		double area = length * width;
		System.out.println("The area of your rectangle is: " + area);
		return area;
	}
	public double calculatePerimeterRec() {
		double perimeter = (length + width) * 2;
		System.out.println("The perimeter of your rectangle is: " + perimeter);
		return perimeter;
	}
}
