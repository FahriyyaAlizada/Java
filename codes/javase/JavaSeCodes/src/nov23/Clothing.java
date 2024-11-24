package nov23;

public class Clothing extends Product {
	public Clothing(String name, double price) {
		super(name,price);
	}
	
	@Override
	public void calculateDiscount() {
		price = price * 0.85;
		System.out.println("15% Discount & New Price = " + price);
	}	
}
