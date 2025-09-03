package com.example.student_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_crud.dto.StudentRequestDto;
import com.example.student_crud.entity.Student;
import com.example.student_crud.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
    private StudentRepository studentRepository;

	public void addStudent(StudentRequestDto dto) {
        Student student = new Student();
        student.setId(null);
        student.setName(dto.getName());
        student.setSurname(dto.getSurname());
        student.setAge(dto.getAge());
        student.setStudentNumber(dto.getStudentNumber());

        studentRepository.save(student);
		
	}

}
