package mainPackage;

import java.util.Date;

public class Account {

	private static int id = 0;
	private static double balance = 0;
	private static double annualInterestRate = 0;
	private static Date dateCreated;
	
	public Account(){
		
	}

	public Account(int id, double balance) {
		super();
		Account.id = id;
		Account.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		Account.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		Account.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double MontlyInterestRate = annualInterestRate/12;
		return MontlyInterestRate;
	}

	public double withdraw(double withdrawAmount) {
		balance = balance - withdrawAmount;
		return balance;
	}
	
	public double deposit(double depositAmount) {
		balance = balance + depositAmount;
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
}
