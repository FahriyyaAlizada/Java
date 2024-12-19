package dec18;

public class Main2 {

	public static void main(String[] args) {
		CheckRange check = new CheckRange();
		try {
			check.checkValueRange(150);
		} catch (OutOfRangeValueException e) {
			System.out.println("Error: " + e.getOurMessage());
		}

	}

}
