package nov16;

public class InventoryItem {
	private String name;
	private int quantity;
	private int price;
	
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	public String getName() {
		return name;
	}
	
	public void setQuantity(int quantity) {
		if (quantity<0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(int price) {
		if (price<0) {
			System.out.println("Price can't be defined...");
		} else {
			this.price=price;
		}
	}
	public int getPrice() {
		return price;
	}
}
