package nov20;

public class Student extends Person {
	int id;
	
	public Student(String name, int id) {
		super(name);
		this.id = id;
	}
	
	public void showStudentInfo() {
		showName();
		System.out.println("Student ID => " + id);
	}
}
