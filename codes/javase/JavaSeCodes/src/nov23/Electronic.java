package nov23;

public class Electronic extends Product{
	public Electronic(String name, double price) {
		super(name,price);
	}
	
	@Override
	public void calculateDiscount() {
		price = price * 0.8;
		System.out.println("20% Discount & New Price = " + price);
	}	
}
