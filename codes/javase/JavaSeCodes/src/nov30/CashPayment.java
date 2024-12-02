package nov30;

public class CashPayment extends DigitalPayment implements Payment {
	@Override
	public void processPayment(double amount) {
		System.out.println("Cash Payment => " + amount + " $");
		
	}

	@Override
	public String getPaymentType() {
		String message = "Cash Payment";
		return message;
	}
}
