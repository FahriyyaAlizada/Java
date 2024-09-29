package main;

public class Practiceno2 {
	
	// First Exercise
	
	// String model;
	// int year;
	// int speed;
	// public Practiceno2(String _model, int _year, int _speed) {
	// 	this.model = _model;
	// 	this.year = _year;
	// 	this.speed = _speed;
	// }
	// public void start() {
	// 	System.out.println("-> Ready for a Drive <-");
	// }
	// public void accelerate(int increment) {
	// 	speed = speed + increment;
	// 	System.out.println("Current speed: " + speed);
	// }
	// public void brake(int decrement) {
	// 	if (speed>=decrement) {
	// 		speed = speed - decrement;
	// 		System.out.println("Current speed: " + speed);
	// 	}
	// 	else {
	// 		System.out.println("Speed can not be decreased");
	// 	}
	// }
	// public void displayInfo() {
	// 	System.out.println("Model: " + model + "; Year: " + year + "; Speed: " + speed);
	// }
	
	// Second Exercise
	
	String accountNumber;
	double balance;
	public Practiceno2(String _acoountNumber, double _balance) {
		this.accountNumber = _acoountNumber;
	 	this.balance = _balance;
	}
	public void deposit(double amount) {
		if (amount>0) {
			balance = balance + amount;
			System.out.println("Your balance has been increased: +" + amount);
			System.out.println("Current Balance: " + balance);
		} else {
			System.out.println("The amount should be higher than 0!");
		}
	}
	public void withdraw(double amount) {
		if (amount>0 && amount<balance) {
			balance = balance - amount;
			System.out.println("Your balance has been decreased: -" + amount);
			System.out.println("Current Balance: " + balance);
		} else {
			System.out.println("There is not enough money for the process...");
		}
	}
	public void displayBalance() {
		System.out.println("Account Number: " + accountNumber + "; Balance: " + balance);
	}
}
