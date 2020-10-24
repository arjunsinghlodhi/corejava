package com.nt.oop;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		BankBalance bb = new BankBalance();
		Scanner sc= new Scanner(System.in);
		
		bb.setUsername("Arjun");
		
		System.out.println(bb.getUsername());
		
		bb.setAccountNumber(39080200);
		System.out.println(bb.getAccountNumber());
		
		bb.setBalance(-5000);
		System.out.println(bb.getBalance());
	}

}
