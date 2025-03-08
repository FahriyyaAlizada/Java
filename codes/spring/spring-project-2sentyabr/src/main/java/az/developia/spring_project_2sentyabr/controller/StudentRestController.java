package az.developia.spring_project_2sentyabr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/student")
public class StudentRestController {

	@GetMapping
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(167, "Seraphina", "Voss"));
		students.add(new Student(168, "Jaxon", "Whitmore"));
		students.add(new Student(169, "Aria", "Blackwood"));
		students.add(new Student(170, "Victor", "Crane"));
		students.add(new Student(171, "Lila ", "Rivers"));
		
		return students;
	}
	
	@PostMapping(path="/add")
	public void addStudent(@Valid @RequestBody Student student, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br);
		}
		System.out.println(student);
	}
}
