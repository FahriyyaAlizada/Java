package dec4;

public class SavingAccount extends BankAccount{

	private double balance;
	
	
	public SavingAccount(double balance) {
		this.balance = balance;
		System.out.println("Balance = " + balance + " $");
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("+" + amount + " $" );
		System.out.println("Balance = " + balance + " $");
		
	}

	@Override
	public void withdraw(double amount) {
		if (amount>balance) {
			System.out.println("There is not enough money for the operation...");
		} else {
			balance-=amount;
			System.out.println("-" + amount + " $" );
			System.out.println("Balance = " + balance + " $");
		}
		
	}

}
