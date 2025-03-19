package az.developia.spring_project_2sentyabr.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

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

import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import az.developia.spring_project_2sentyabr.repository.StudentRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/student")
public class StudentRestController {
	
//	@Autowired
//	private DataSource dataSource;
	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping
	public List<Student> getStudents(){
		
//		List<Student> students = new ArrayList<Student>();
//		
//		students.add(new Student(167, "Seraphina", "Voss"));
//		students.add(new Student(168, "Jaxon", "Whitmore"));
//		students.add(new Student(169, "Aria", "Blackwood"));
//		students.add(new Student(170, "Victor", "Crane"));
//		students.add(new Student(171, "Lila ", "Rivers"));
		
//		try {
//			Connection connection = dataSource.getConnection();
//			Statement st=connection.createStatement();
//			String query = "select * from students";
//			ResultSet executeQuery = st.executeQuery(query);
//			while (executeQuery.next()) {
//				Student s = new Student();
//				s.setId(executeQuery.getInt("id"));
//				s.setName(executeQuery.getString("name"));
//				s.setSurname(executeQuery.getString("surname"));
//				students.add(s);
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		return studentRepository.findAll();
	}
	
	@PostMapping(path="/add")
	public void addStudent(@Valid @RequestBody Student student, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		System.out.println(student);
		
//		try {
//			Connection connection = dataSource.getConnection();
//			Statement st=connection.createStatement();
//			String query = "insert into students(name,surname) values('"+student.getName()+"','"+student.getSurname()+"')";
//			st.executeUpdate(query);
//			connection.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		studentRepository.save(student);
		student.setId(null);
	}
	
	@PutMapping(path="/update")
	public void update(@Valid @RequestBody Student student, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		if (student.getId()==null || student.getId()<=0) {
			throw new OurRuntimeException(null,"id is mandatory");
		}
		if (studentRepository.findById(student.getId()).isPresent()) {
			studentRepository.save(student);
		} else {
			throw new OurRuntimeException(null, "id can not be found");
		}
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id is mandatory");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			studentRepository.deleteById(id);
		}
		else {
			throw new OurRuntimeException(null, "id can not be found");
		}
		return ResponseEntity.ok("Student deleted successfully");
	}
	
	@GetMapping(path = "/{id}")
	public Student getById(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id is mandatory");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		}
		else {
			throw new OurRuntimeException(null, "id can not be found");
		}
	}
}
