package nov30;

public class ElectronicBook extends Book{
	private String format;
	private int fileSize;
	
	public ElectronicBook(String name, String author, String format, int fileSize) {
		super(name, author);
		this.format = format;
		this.fileSize = fileSize;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Book Format => " + format);
		System.out.println("Book File Size => " + fileSize);
	}
	

}
