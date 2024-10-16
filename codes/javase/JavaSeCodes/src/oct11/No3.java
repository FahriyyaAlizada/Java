package oct11;

public class No3 {
	public void calculateGrade(No2 student) {
		if (student.score>90) {
			student.grade = "A";
		} 
		else if(student.score>80) {
			student.grade = "B";
		}
		else if(student.score>70) {
			student.grade = "C";
		}
		else if(student.score>60) {
			student.grade = "D";
		}
		else if(student.score>50) {
			student.grade = "E";
		}
		else {
			student.grade = "F";
		}
		System.out.println("Grade: " + student.grade);
	}
}
