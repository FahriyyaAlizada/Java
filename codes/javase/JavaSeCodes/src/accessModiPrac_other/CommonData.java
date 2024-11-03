package accessModiPrac_other;

public class CommonData {
	
	public String schoolName;
	private int totalStudent;
	protected int teacherCount;
	int classCount;
	
	public CommonData(String schoolName, int totalStudent, int teacherCount, int classCount){
		this.schoolName = schoolName;
		this.totalStudent = totalStudent;
		this.teacherCount = teacherCount;
		this.classCount = classCount;
	}
	
	public void showSchoolName() {
		System.out.println("School Name: " + schoolName);
	}
	
	private void calculateTotalPeople() {
		int total = totalStudent + teacherCount;
		System.out.println("Total People: " + total);
	}
	
	protected void showTeacherCount() {
		System.out.println("Teacher Count: " + teacherCount);
	}
	
	void showClassCount() {
		System.out.println("Class Count: " + classCount);
	}
}
