package dec11;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Cat sound...");
	}

}
