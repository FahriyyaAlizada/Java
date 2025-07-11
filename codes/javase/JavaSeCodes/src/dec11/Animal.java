package dec11;

public abstract class Animal {
	
	String name;
	int age;
	
	public Animal(String name, int age2) {
		this.name = name;
		this.age = age2;
	}
	public abstract void makeNoise();
	
}