package az.developia.spring_project_2sentyabr.response;

import java.util.List;

import az.developia.spring_project_2sentyabr.entity.Student;

public class StudentResponse {

	private List<Student> students;
	private Double height;
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
}
