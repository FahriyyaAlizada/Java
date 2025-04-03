package az.developia.spring_project_2sentyabr.response;

import java.util.List;

import az.developia.spring_project_2sentyabr.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
	@Override
	public String toString() {
		return "StudentResponse [students=" + students + ", height=" + height + "]";
	}
	
}
