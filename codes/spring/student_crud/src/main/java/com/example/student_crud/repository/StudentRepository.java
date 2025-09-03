package com.example.student_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
