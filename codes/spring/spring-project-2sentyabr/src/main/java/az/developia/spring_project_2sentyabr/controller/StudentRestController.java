package az.developia.spring_project_2sentyabr.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_2sentyabr.dto.StudentRequestDto;
import az.developia.spring_project_2sentyabr.dto.StudentResponseDto;
import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import az.developia.spring_project_2sentyabr.response.StudentResponse;
import az.developia.spring_project_2sentyabr.service.StudentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/student")
public class StudentRestController {
	
	private final StudentService studentService = new StudentService();

	@GetMapping
	public StudentResponse getStudents(){
		
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
		
		return studentService.getStudents();
	}
	
	@GetMapping(path="/search")
	public List<Student> search(@RequestParam(name="query", required = false) String query) {
		return studentService.search(query);
		}
	
	@PostMapping(path="/add")
	public void addStudent(@Valid @RequestBody StudentRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		
//		System.out.println(student);
		
//		try {
//			Connection connection = dataSource.getConnection();
//			Statement st=connection.createStatement();
//			String query = "insert into students(name,surname) values('"+student.getName()+"','"+student.getSurname()+"')";
//			st.executeUpdate(query);
//			connection.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		studentService.create(dto);
		
//		student.setId(null);
	}
	
	@PutMapping(path="/update")
	public void update(@Valid @RequestBody StudentRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"error");
		}
		studentService.update(dto);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		studentService.deleteById(id);
		return ResponseEntity.ok("Student deleted successfully");
	}
	
	@GetMapping(path = "/{id}")
	public StudentResponseDto getById(@PathVariable Integer id) {
		return studentService.getById(id);
	}
}
