package oct4;

public class No2 {
	int side1;
	int side2;
	int side3;
	public static void area(int side1, int side2, int side3) {
		int u = (side1+side2+side3)/2;
		int area = (int) Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));
		System.out.println("The area of your triangle will be: " + area);
	}
}
