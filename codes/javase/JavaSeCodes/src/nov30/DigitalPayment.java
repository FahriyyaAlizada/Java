package nov30;

public class DigitalPayment implements Payment{
	public void verifyTransaction() {
		System.out.println("Payment accepted...");
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPaymentType() {
		// TODO Auto-generated method stub
		return null;
	}
}
