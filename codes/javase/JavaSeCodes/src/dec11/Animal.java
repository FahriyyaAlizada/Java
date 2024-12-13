package dec11;

public abstract class Animal {
	String name;
	int age;
	public Animal(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	public abstract void makeNoise();
}
