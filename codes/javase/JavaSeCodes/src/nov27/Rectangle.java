package nov27;

public class Rectangle implements Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		int area = width * height;
		System.out.println("Area of Rectangle => " + area);
		
	}

	@Override
	public void getPerimeter() {
		int perimeter = 2 * (width + height);
		System.out.println("Perimeter of Rectangle => " + perimeter);
		
	}

}
