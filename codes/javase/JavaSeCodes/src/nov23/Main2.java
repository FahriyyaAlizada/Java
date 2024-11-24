package nov23;

public class Main2 {

	public static void main(String[] args) {
		Product product = new Product("Mirror",40.0);
		product.calculateDiscount();
		Electronic electronic = new Electronic("TV", 1700.0);
		electronic.calculateDiscount();
		Clothing clothing = new Clothing("Coat",150.0);
		clothing.calculateDiscount();

	}

}
