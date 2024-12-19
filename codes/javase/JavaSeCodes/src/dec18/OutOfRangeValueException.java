package dec18;

public class OutOfRangeValueException extends RuntimeException{
	
	private String message;
	
	public OutOfRangeValueException(String message) {
		this.message = message;
	}
	
	public String getOurMessage() {
		return message;
	}

}
