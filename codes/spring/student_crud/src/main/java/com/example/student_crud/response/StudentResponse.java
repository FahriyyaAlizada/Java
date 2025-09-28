package com.example.student_crud.response;

public class StudentResponse {
	private Integer id;
	private String name;
	private String surname;
	private Integer age;
	private Integer studentNumber;
	
	public StudentResponse() {
		// TODO Auto-generated constructor stub
	}

	public StudentResponse(Integer id, String name, String surname, Integer age, Integer studentNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.studentNumber = studentNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}
