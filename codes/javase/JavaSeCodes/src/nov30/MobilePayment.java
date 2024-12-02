package nov30;

public class MobilePayment extends DigitalPayment implements Payment{
	@Override
	public void processPayment(double amount) {
		System.out.println("Mobile Payment => " + amount + " $");
		
	}

	@Override
	public String getPaymentType() {
		String message = "Mobile Payment";
		return message;
	}
}
