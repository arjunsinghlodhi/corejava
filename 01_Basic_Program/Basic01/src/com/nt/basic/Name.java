package com.nt.basic;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name = ");
		String first = input.next();
		System.out.print("Enter your last name = ");
		String second= input.next();
		System.out.println(first+"\n"+second);
	}

}
