package az.developia.spring_project_2sentyabr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import az.developia.spring_project_2sentyabr.entity.Computer;
import az.developia.spring_project_2sentyabr.entity.Employee;
import az.developia.spring_project_2sentyabr.entity.Ram;

@Configuration
public class MyConfig {
	@Bean
	public Employee myEmployee2() {
		Employee e=new Employee();
		e.setId(29);
		e.setName("Mia");
		e.setAge(17);
		e.setSalary(1320.0);
		return e;
	}
	
	@Bean
	@Primary
	public Computer myComp2() {
		Computer c = new Computer();
		c.setId(54);
		c.setBrand("HP");
		c.setPrice(3210.5);
		c.setColor("Black");
		return c;
	}
	
	@Bean
	@Primary
	public Ram myRam2() {
		Ram r = new Ram();
		r.setId(14);
		r.setSize(8);
		r.setType("DDR4");
		return r;
	}
}
