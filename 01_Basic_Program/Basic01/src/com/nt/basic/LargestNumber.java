package com.nt.basic;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a =");
		a=sc.nextInt();
		
		System.out.print("Enter value of b =");
		b=sc.nextInt();
		
		System.out.print("Enter value of c =");
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is largest number ");
		}
		else if (b>a && b > c) {
			System.out.println(b+" is largest number");
		}
		else if (c>b && c>a) {
			System.out.println(c+" is largest number");
		}
		else {
			System.out.println("number is distnict");
		}
		
	}

}
