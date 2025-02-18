package az.developia.spring_project_2sentyabr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "myEmployee1")
public class Employee {

	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	@Autowired
	@Qualifier(value = "myComp1")
	private Computer computer;
	
	public Employee() {
		this.id=55;
		this.name="Eleanor";
		this.age=19;
		this.salary=1700.0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", computer="
				+ computer + "]";
	}
	
}
