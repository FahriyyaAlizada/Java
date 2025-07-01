package accessModifiers;

public class Person {
	
	    public String name;
	    String surname;
	    private int age;
	    protected double height;
	    static String message = "Hello World!";
	    public void publicMethod() {
	        System.out.println("This is public method...");
	    }
	    private void privateMethod() {
	        System.out.println("This is private method...");
	    }
	    protected void protectedMethod() {
	        System.out.println("This is protected method...");
	    }
	    void defaultMethod() {
	        System.out.println("This is default method...");
	    }
	    public Person(String name) {
	        this.name = name;
	        System.out.println("Public constructor...");
	    }
	    Person(String surname,String other) {
	        this.surname = surname;
	        System.out.println("Default constructor...");
	    }
	    private Person(int age) {
	        this.age = age;
	        System.out.println("Private constructor...");
	    }
	    protected Person(double height) {
	        this.height = height;
	        System.out.println("Protected constructor...");
	    }
	    public void finalMethod(final String message) {
	        System.out.println("Final message: " + message);
	    }
}
