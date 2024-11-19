package nov16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InventoryItem item = new InventoryItem();
		
		System.out.println("Enter item name...");
		String name = scanner.nextLine();
		item.setName(name);
		System.out.println("Item Name => " + item.getName());
		
		System.out.println("Enter item quantity...");
		int quantity = scanner.nextInt();
		item.setQuantity(quantity);
		System.out.println("Item Quantity => " + item.getQuantity());
		
		System.out.println("Enter item price...");
		int price = scanner.nextInt();
		item.setPrice(price);
		System.out.println("Item Price => " + item.getPrice());
	}

}
