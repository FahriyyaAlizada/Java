package dec14;

public class Exceptions {

	public static void main(String[] args) {
		
		// AritmeticException
		try {
            int number = 25 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Number can not be divided to 0");
        }
		
		// NullPointerException
		try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Error: There is no length for null object");
        }
		
		// ArrayIndexOutOfBoundsException
		try {
            int[] numbers = {5,6,7};
            int number = numbers[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Unexpected index of array");
        }
		
		// StringIndexOutOfBoundsException
		try {
            String str = "Hello World!";
            char letter = str.charAt(12); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Unexpected index of string");
        }
		
		// IllegalArgumentException
		try {
            int batteryPercentage = -55;
            if (batteryPercentage < 0) {
                throw new IllegalArgumentException("Battery percentage can not be negative number!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
