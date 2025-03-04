package az.developia.spring_project_2sentyabr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	
	@GetMapping(path="/students")
	public String showStudents(@RequestParam (name="q", required = false, defaultValue = "") String q) {
		
		List<String> students = new ArrayList<String>();
		
		students.add("Danny");
		students.add("Natasha");
		students.add("Scott");
		students.add("Rita");
		students.add("Patrick");

		List<String> studentsFiltered = new ArrayList<String>();
		for (String student : students) {
			if (student.equalsIgnoreCase(q)) {
				studentsFiltered.add(student);
			}
		}
		System.out.println(studentsFiltered);
		
		return "students";
	}
}
