package com.nt.oop;

public class BankBalance {
	private String username;
	private double accountNumber;
	private float balance;
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public void setAccountNumber(double accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(float balance) {
		if(balance<=0) {
			System.out.println("Plz enter currect +ve amount");
		}
		else {
			this.balance=balance;
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	public float getBalance() {
		return balance;
	}
}
