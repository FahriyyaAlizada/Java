package practice_Dec8;

public class Main {

	public static void main(String[] args) {
		Instrument piano = new Piano();
		piano.play();
		System.out.println("Piano Material : " + piano.getMaterial());
		
		Instrument guitar = new Guitar();
		guitar.play();
		System.out.println("Guitar Material : " + guitar.getMaterial());
		
		Instrument drum = new Drum();
		drum.play();
		System.out.println("Drum Material : " + drum.getMaterial());

	}

}
