package az.developia.spring_project_2sentyabr.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component(value = "myHome1")
@Scope("prototype")
public class Home {
	
	private Integer id;
	private String address;
	private String color;
	
	public Home() {
		System.out.println("Object created successfully...");
		this.id=79;
		this.address="221B Baker Street";
		this.color="Brown";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Home [id=" + id + ", address=" + address + ", color=" + color + "]";
	}
	
	@PostConstruct
    public void init() {
        System.out.println("Init method...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method...");
    }
}
