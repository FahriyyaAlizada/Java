package dec18;

public class Main {

	public static void main(String[] args) {
		
		Operations operation = new Operations();
		try {
			System.out.println("Division: " + operation.divide(5, 0));
		} catch (Exception e) {
			System.out.println(e.getOurMessage());
		}
		
		try {
			System.out.println("Get Character: " + operation.getCharacter("Hello World!", 12));
		} catch (Exception e) {
			System.out.println(e.getOurMessage());
		}
		
	}

}
