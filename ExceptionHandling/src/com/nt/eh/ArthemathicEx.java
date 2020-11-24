package com.nt.eh;

import java.util.Scanner;

public class ArthemathicEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of  a :  ");
		float a = sc.nextFloat();
		System.out.println("Enter the value of  b :  ");
		float b = sc.nextFloat();
		float result;
			while (b <= 0) {
				System.out.println("Enter value of B positive  Cannot divide by zero");
				System.out.println("Enter the value of  b :  ");
				b = sc.nextInt();
			}
		try {
			result = a / b;
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();

		}

	}

}
