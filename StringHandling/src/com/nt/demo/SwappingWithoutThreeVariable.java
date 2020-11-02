package com.nt.demo;

import java.util.Scanner;

public class SwappingWithoutThreeVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter Value of b: ");
		int b=sc.nextInt();
		
		System.out.println("before Swapping ");
		System.out.println("a  : "+a);
		System.out.println("b  : "+b);
			a=a-b;
			b=a+b;
			a=b-a;
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		System.out.println("After Swapping ");
		System.out.println("a  : "+a);
		System.out.println("b  : "+b);
	}
}
