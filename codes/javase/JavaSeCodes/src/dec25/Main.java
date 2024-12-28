package dec25;

public class Main {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.setValue("Candy");
		System.out.println("Here is your: " + box1.getValue());
		
		Box<Integer> box2 = new Box<>();
		box2.setValue(25);
		System.out.println("Here is your number of " + box1.getValue().toLowerCase() + ": " + box2.getValue());

	}

}
