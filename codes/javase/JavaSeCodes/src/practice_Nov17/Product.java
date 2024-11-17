package practice_Nov17;

public class Product {
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(double price) {
		this.price = price * 0.9;
	}
	public void setId(int id) {
		if (id<100) {
			id=100;
			this.id = id;
		} else {
			this.id = id;
		}
	}
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	public double getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
