package az.developia.spring_project_2sentyabr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component(value = "myComp1")
@Scope("prototype")
public class Computer {
	private Integer id;
	private String brand;
	private Double price;
	private String color;
	@Autowired
	@Qualifier(value = "myRam1")
	private Ram ram;
	
	public Computer() {
		System.out.println("Object created...");
		this.id = 14;
		this.brand = "ACER";
		this.price =1230.5 ;
		this.color = "Grey";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	@PostConstruct
    public void init() {
        System.out.println("Init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method");
    }
    
	@Override
	public String toString() {
		return "Computer [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", ram=" + ram
				+ "]";
	}
	
}
