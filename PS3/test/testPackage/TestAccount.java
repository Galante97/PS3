package testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import mainPackage.Account;
import mainPackage.InsufficientFundsException;

public class TestAccount {

	@Test
	public void testAccount() {
		Account Account = new Account();
		Account.setId(1122);
		Account.setBalance(20000);
		Account.setAnnualInterestRate(0.045);
		Account.withdraw(2500.0);
		Account.deposit(3000);

		System.out.println("Your account is valued at: $" + Account.getBalance());
		System.out.println("Your monthly interest rate is: " + (Account.getMonthlyInterestRate()) * 100 + "%");
		System.out.println("Your account was created on: " + Account.getDateCreated());

	}

	@Test(expected = InsufficientFundsException.class)
	public void OverDrawTest() throws InsufficientFundsException {
		Account Account = new Account();
		Account.setId(1122);
		Account.setBalance(20000);
		Account.setAnnualInterestRate(0.045);
		Account.withdraw(400000);
	}

}
