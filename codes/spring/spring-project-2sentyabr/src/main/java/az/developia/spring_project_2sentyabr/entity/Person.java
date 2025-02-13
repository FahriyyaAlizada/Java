package az.developia.spring_project_2sentyabr.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	
	public Person() {
		this.id = 121;
		this.name = "Mariana";
		this.age = 25;
		this.salary = 130000.0;
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
