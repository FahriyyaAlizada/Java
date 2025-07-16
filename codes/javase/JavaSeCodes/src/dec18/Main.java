package dec18;

public class Main {

	public static void main(String[] args) {
		
		Divider divider = new Divider();
		try {
			System.out.println("Division: " + divider.divide(5, 0));
		} catch (Exception e) {
			System.out.println(e.getOurMessage());
		}
		
		try {
			System.out.println("Get Character: " + divider.getCharacter("Hello World!", 12));
		} catch (Exception e) {
			System.out.println(e.getOurMessage());
		}
		
	}

}
