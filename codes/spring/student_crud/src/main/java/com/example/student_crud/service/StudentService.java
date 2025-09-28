package com.example.student_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_crud.dto.StudentRequestDto;
import com.example.student_crud.dto.StudentResponseDto;
import com.example.student_crud.entity.Student;
import com.example.student_crud.repository.StudentRepository;
import com.example.student_crud.response.StudentListResponse;

import jakarta.validation.Valid;


@Service
public class StudentService {
	
	@Autowired
    private StudentRepository studentRepository;

	public void addStudent(StudentRequestDto dto) {
		if (studentRepository.findByName(dto.getName()).isPresent()) {
            throw new RuntimeException("Student with name " + dto.getName() + " already exists!"
            );
        }
		
        Student student = new Student();
        student.setId(null);
        student.setName(dto.getName());
        student.setSurname(dto.getSurname());
        student.setAge(dto.getAge());
        student.setStudentNumber(dto.getStudentNumber());

        studentRepository.save(student);
		
	}

	public StudentListResponse getAll() {
		StudentListResponse response = new StudentListResponse();
		
		List<Student> students = studentRepository.findAll();
		
		response.setStudentResponse(students);
		
		return response; 
	}

	public StudentResponseDto getById(Integer id) {
		if (id==null || id<=0) {
			throw new RuntimeException("id is mandatory");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			Student student = byId.get();
			StudentResponseDto response = new StudentResponseDto();
			response.setId(student.getId());
			response.setName(student.getName());
			response.setSurname(student.getSurname());
			response.setAge(student.getAge());
			response.setStudentNumber(student.getStudentNumber());
			return response;
		}
		else {
			throw new RuntimeException("id can not be found");
		}
	}

	public void deleteById(Integer id) {
		if (id==null || id<=0) {
			throw new RuntimeException("id is mandatory");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			studentRepository.deleteById(id);
		}
		else {
			throw new RuntimeException("id can not be found");
		}
		
	}

	public void update(@Valid StudentRequestDto dto) {
		if (dto.getId()==null || dto.getId()<=0) {
			throw new RuntimeException("id is mandatory");
		}
		
		Optional<Student> byId = studentRepository.findById(dto.getId());
		
		if (byId.isPresent()) {
			Student student = byId.get();
			student.setId(dto.getId());
			student.setName(dto.getName());
			student.setSurname(dto.getSurname());
	        student.setAge(dto.getAge());
	        student.setStudentNumber(dto.getStudentNumber());
			
			studentRepository.save(student);
		} else {
			throw new RuntimeException("id can not be found");
		}
		
	}

}
