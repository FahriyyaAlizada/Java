package az.developia.spring_project_2sentyabr.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private Integer id;
	private String name;
	private Double price;
	private Integer pageCount;
	
	public Book() {
		this.id=221;
		this.name="The Hound of the Baskervilles";
		this.price=6.5;
		this.pageCount=254;
	}
	public Book(Integer id, String name, Double price, Integer pageCount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.pageCount = pageCount;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pageCount=" + pageCount + "]";
	}
	
}
