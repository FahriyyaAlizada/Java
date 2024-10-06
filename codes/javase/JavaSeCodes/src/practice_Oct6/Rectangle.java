package practice_Oct6;

public class Rectangle {
	double length;
	double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void calculateAreaRec() {
		double area = length * width;
		System.out.println("The area of your rectangle is: " + area);
	}
	public void calculatePerimeterRec() {
		double perimeter = (length + width) * 2;
		System.out.println("The perimeter of your rectangle is: " + perimeter);
	}
}
