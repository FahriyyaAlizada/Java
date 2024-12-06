package dec4;

public class Main2 {

	public static void main(String[] args) {
		
		BankAccount account1 = new SavingAccount(32.4);
		account1.deposit(2.6);
		account1.withdraw(4.4);
		
		System.out.println("------------------------------");
		
		BankAccount account2 = new CurrentAccount(66.5);
		account2.deposit(3.5);
		account2.withdraw(1.5);

	}

}
