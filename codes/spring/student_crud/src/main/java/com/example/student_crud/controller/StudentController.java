package com.example.student_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_crud.dto.StudentRequestDto;
import com.example.student_crud.service.StudentService;


@RestController
@RequestMapping(path="/api/student")
public class StudentController {
	@Autowired
    private StudentService studentService;
	
    @PostMapping(path = "/add")
    public void addStudent(@RequestBody StudentRequestDto dto) {
        studentService.addStudent(dto);
    }
}
