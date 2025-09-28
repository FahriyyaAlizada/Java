package com.example.student_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_crud.dto.StudentRequestDto;
import com.example.student_crud.dto.StudentResponseDto;
import com.example.student_crud.response.StudentListResponse;
import com.example.student_crud.service.StudentService;

import jakarta.validation.Valid;



@RestController
@RequestMapping(path="/api/student")
public class StudentController {
	@Autowired
    private StudentService studentService;
	
    @PostMapping(path = "/add")
    public void addStudent(@RequestBody StudentRequestDto dto) {
        studentService.addStudent(dto);
    }
    
    @GetMapping(path = "/getAll")
    public StudentListResponse getAll() {
    	return studentService.getAll();
    }
    
	@GetMapping(path = "/{id}")
	public StudentResponseDto getById(@PathVariable Integer id) {
		return studentService.getById(id);
	}
    
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		studentService.deleteById(id);
		return ResponseEntity.ok("Student deleted successfully");
	}
	
	@PutMapping(path="/update")
	public void update(@Valid @RequestBody StudentRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new RuntimeException("error");
		}
		studentService.update(dto);
	}
}
