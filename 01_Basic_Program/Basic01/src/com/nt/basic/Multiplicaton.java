//Write a Java program that takes two numbers as input and display the product of two numbers
package com.nt.basic;

import java.util.Scanner;

public class Multiplicaton {

	public static void main(String[] args) {
		System.out.println("Multiplicaton = "+(25*5));
		System.out.println(" ");
		Scanner sc= new Scanner(System.in);
		System.out.print("enter frist number = ");
		int num1=sc.nextInt();
		System.out.print("enter second number = ");
		int num2= sc.nextInt();
		int res= num1*num2;
		System.out.println("multiplication = "+res);
	}

}
