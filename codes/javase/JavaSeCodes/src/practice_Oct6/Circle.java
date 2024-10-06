package practice_Oct6;

public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double calculateArea() {
		double area = Math.PI*radius*radius;
		System.out.println("The area of your circle is: " + area);
		return area;
	}
	public double calculatePerimeter() {
		double perimeter = 2*Math.PI*radius;
		System.out.println("The perimeter of your circle is: " + perimeter);
		return perimeter;
	}
}
