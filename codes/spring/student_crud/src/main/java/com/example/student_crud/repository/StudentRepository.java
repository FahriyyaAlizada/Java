package com.example.student_crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	Optional<Student> findByName(String name);
}
