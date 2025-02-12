package az.developia.spring_project_2sentyabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_project_2sentyabr.entity.Book;
import az.developia.spring_project_2sentyabr.entity.Person;

@SpringBootApplication
public class SpringProject2sentyabrApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringProject2sentyabrApplication.class, args);
		
		Book bean = run.getBean(Book.class);
		
		System.out.println(bean);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getPrice());
		System.out.println(bean.getPageCount());
		
		Person bean2 = run.getBean(Person.class);
		
		System.out.println(bean2);
		System.out.println(bean2.getId());
		System.out.println(bean2.getName());
		System.out.println(bean2.getAge());
		System.out.println(bean2.getSalary());
		
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for (String names : beanDefinitionNames) {
			System.out.println(names);
		}
		
	}

}
