package nov16;

public class No1 {

	public static void main(String[] args) {
		
		No2 student = new No2();
		student.setName("Anna Scott");
		student.setAge(24);
		student.setGpa(4.2);
		System.out.println("Name of the student => " + student.getName());
		System.out.println("Age of the student => " + student.getAge());
		System.out.println("GPA of the student => " + student.getGpa());

	}

}
