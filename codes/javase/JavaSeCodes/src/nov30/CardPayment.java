package nov30;

public class CardPayment extends DigitalPayment implements Payment{

	@Override
	public void processPayment(double amount) {
		System.out.println("Card Payment => " + amount + " $");
		
	}

	@Override
	public String getPaymentType() {
		String message = "Card Payment";
		return message;
	}
	
}
