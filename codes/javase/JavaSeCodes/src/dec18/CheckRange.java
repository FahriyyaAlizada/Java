package dec18;

public class CheckRange {
	
	public void checkValueRange(int value) {
		int min = 10;
		int max = 100;
		if (value<min || value>max) {
			throw new OutOfRangeValueException("Value can not be found in " + "[" + min + ", " +  max + "] array.");
		}
		System.out.println(value + " is between [" + min + ", " +  max + "]");
	} 
}
