package com.example.student_crud.response;

import java.util.List;

import com.example.student_crud.entity.Student;


public class StudentListResponse {
	private List<Student> studentResponse;

	public List<Student> getStudentResponse() {
		return studentResponse;
	}

	public void setStudentResponse(List<Student> studentResponse) {
		this.studentResponse = studentResponse;
	}

	
	
}
