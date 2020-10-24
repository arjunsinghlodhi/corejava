package com.nt.basic;

import java.util.Scanner;

public class divide {

	public static void main(String[] args) {
		// Write a Java program to divide two numbers and print on the screen
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number = ");
		int num1=sc.nextInt();
		System.out.print("enter divide number = ");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.print("result = "+num1/num2);
		}
	}

}
