package nov23;

public class Product {
	String name;
	double price;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void calculateDiscount() {
		price = price*0.9;
		System.out.println("10% Discount & New Price = " + price);
	}
}
