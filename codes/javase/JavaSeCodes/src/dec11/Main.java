package dec11;

public class Main {

	public static void main(String[] args) {
		
		Animal cat = new Cat("Whiskers", 7);
		cat.makeNoise();
		
		Animal dog = new Dog("Max", 9);
		dog.makeNoise();
		
		Animal lion = new Lion("Simba", 11);
		lion.makeNoise();

	}

}
