package com.nt.eh;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		//taken input by user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A number");
		int a=sc.nextInt();
		System.out.println("Enter value of B number");
		int b=sc.nextInt();
		
		try {
			float c =a/b;
			System.out.println("result: "+c);
		} catch (Exception e) {
			while(b==0) {
			System.out.println("Value of B must be greatern to Zero");
				System.out.println("Enter value of B number");
				b=sc.nextInt();
				continue;
			}
		}
	}
}
