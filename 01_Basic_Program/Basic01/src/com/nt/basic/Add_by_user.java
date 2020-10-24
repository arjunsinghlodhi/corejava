package com.nt.basic;

import java.util.Scanner;

public class Add_by_user {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a=input.nextInt();
		System.out.println("Enter Second number :");
		int b=input.nextInt();
		int c=a+b;
		System.out.println("Sum = "+c);
	}

}
