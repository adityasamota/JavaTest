package hsbc.com.accountproject;

import hsbc.com.accountproject.exceptions.createFailException;
import hsbc.com.accountproject.exceptions.depositException;
import hsbc.com.accountproject.exceptions.withdrawException;

public class Account {
	
	private int accId;
	private String name;
	private double balance;
	
	public Account(int accId, String name, double balance) throws createFailException{
		super();
		
		if(balance<5000)
			throw new createFailException("Bank Account creation not possible with balance less than 5000");
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}
	
	public void displayData() {
		System.out.println("Account ID: "+accId);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
	}
	
	public void depositAmount(double amt) throws depositException{
		if(amt<5000)
			throw new depositException("Deposit amount should be greater than 5000");
		balance+=amt;
		System.out.println("Updated balance: "+balance);
	}
	
	public void withdrawAmount(double amt) throws withdrawException{
		if(amt>balance)
			throw new withdrawException("Withdrawal amount cannot be greater than account balance");
		balance-=amt;
		System.out.println("Updated balance: "+balance);
	}
	
}
