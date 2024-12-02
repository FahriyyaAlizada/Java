package nov30;

public class Main2 {

	public static void main(String[] args) {
		DigitalPayment digitalPayment = new DigitalPayment();
		digitalPayment.verifyTransaction();
		
		DigitalPayment cardPayment = new CardPayment();
		System.out.println("Message => " + cardPayment.getPaymentType());
		cardPayment.processPayment(120.0);
		
		DigitalPayment mobilePayment = new MobilePayment();
		System.out.println("Message => " + mobilePayment.getPaymentType());
		mobilePayment.processPayment(350.0);
		
		DigitalPayment cashPayment = new CashPayment();
		System.out.println("Message => " + cashPayment.getPaymentType());
		cashPayment.processPayment(470.0);

	}

}
