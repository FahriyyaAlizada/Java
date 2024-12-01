package nov30;

public class PhysicalBook extends Book{
	private int weight;
	private int measure;

	public PhysicalBook(String name, String author, int weight, int measure) {
		super(name, author);
		this.weight = weight;
		this.measure = measure;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Book Weight => " + weight);
		System.out.println("Book Measure => " + measure);
	}

}
