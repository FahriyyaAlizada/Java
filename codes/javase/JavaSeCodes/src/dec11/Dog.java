package dec11;

public class Dog extends Animal{ 
	
	public Dog(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Dog sound...");
		
	}

}
